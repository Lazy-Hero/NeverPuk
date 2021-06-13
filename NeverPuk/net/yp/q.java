package net.yp;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.xn;
import net.cb.h;
import net.cb.l;
import net.cb.t;
import net.cp.a;
import net.cp.d;
import net.j.u;
import net.n2.s;
import net.nu.e;
import net.yp.v;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class q {
   private static final Splitter u = Splitter.on('\u0000').limit(6);
   private static final Logger h = LogManager.getLogger();
   private final List A = Collections.synchronizedList(Lists.newArrayList());

   public void d(final d var1) throws UnknownHostException {
      a var2 = a.Y(var1.C);
      final net.n2.a var3 = net.n2.a.Y(InetAddress.getByName(var2.P()), var2.l(), false);
      this.A.add(var3);
      var1.I = net.c9.b.x("multiplayer.status.pinging", new Object[0]);
      var1.o = -1L;
      var1.d = null;
      var3.Y(new net.nh.p() {
         private boolean f;
         private boolean g;
         private long S;

         public void Q(net.j.b var1x) {
            String var2 = v.C();
            if(this.g) {
               var3.R(new h("multiplayer.status.unrequested", new Object[0]));
            }

            this.g = true;
            s var3x = var1x.o();
            if(var3x.G() != null) {
               var1.I = var3x.G().c();
            }

            var1.I = "";
            if(var3x.Z() != null) {
               var1.c = var3x.Z().e();
               var1.Z = var3x.Z().M();
            }

            label139: {
               var1.c = net.c9.b.x("multiplayer.status.old", new Object[0]);
               var1.Z = 0;
               if(var3x.m() != null) {
                  var1.X = net.cb.z.GRAY + "" + var3x.m().t() + "" + net.cb.z.DARK_GRAY + "/" + net.cb.z.GRAY + var3x.m().I();
                  if(!ArrayUtils.isNotEmpty(var3x.m().u())) {
                     break label139;
                  }

                  StringBuilder var4 = new StringBuilder();
                  GameProfile[] var5 = var3x.m().u();
                  int var6 = var5.length;
                  int var7 = 0;
                  if(var7 < var6) {
                     GameProfile var8 = var5[var7];
                     if(var4.length() > 0) {
                        var4.append("\n");
                     }

                     var4.append(var8.getName());
                     ++var7;
                  }

                  if(var3x.m().u().length < var3x.m().t()) {
                     if(var4.length() > 0) {
                        var4.append("\n");
                     }

                     var4.append(net.c9.b.x("multiplayer.status.and_more", new Object[]{Integer.valueOf(var3x.m().t() - var3x.m().u().length)}));
                  }

                  var1.d = var4.toString();
               }

               var1.X = net.cb.z.DARK_GRAY + net.c9.b.x("multiplayer.status.unknown", new Object[0]);
            }

            if(var3x.q() != null) {
               String var9 = var3x.q();
               if(var9.startsWith("data:image/png;base64,")) {
                  var1.Q(var9.substring("data:image/png;base64,".length()));
               }

               q.h.error("Invalid server icon (unknown format)");
            }

            var1.Q((String)null);
            this.S = net.nn.j.E();
            var3.F(new e(this.S));
            this.f = true;
         }

         public void c(u var1x) {
            long var2 = this.S;
            long var4 = net.nn.j.E();
            var1.o = var4 - var2;
            var3.R(new l("Finished"));
         }

         public void d(t var1x) {
            if(!this.f) {
               q.h.error("Can\'t ping {}: {}", var1.C, var1x.l());
               var1.I = net.cb.z.DARK_RED + net.c9.b.x("multiplayer.status.cannot_connect", new Object[0]);
               var1.X = "";
               q.this.s(var1);
            }

         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      var3.F(new net.yg.o(var2.P(), var2.l(), net.n2.t.STATUS));
      var3.F(new net.nu.l());
   }

   private void s(final d var1) {
      final a var2 = a.Y(var1.C);
      ((Bootstrap)((Bootstrap)((Bootstrap)(new Bootstrap()).group((EventLoopGroup)net.n2.a.p.M())).handler(new ChannelInitializer() {
         protected void initChannel(Channel var1x) throws Exception {
            var1x.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(true));
            var1x.pipeline().addLast(new ChannelHandler[]{new SimpleChannelInboundHandler() {
               public void channelActive(ChannelHandlerContext var1x) throws Exception {
                  v.C();
                  super.channelActive(var1x);
                  ByteBuf var3 = Unpooled.buffer();
                  var3.writeByte(254);
                  var3.writeByte(1);
                  var3.writeByte(250);
                  char[] var4 = "MC|PingHost".toCharArray();
                  var3.writeShort(var4.length);
                  int var6 = var4.length;
                  int var7 = 0;
                  char var8 = var4[var7];
                  var3.writeChar(var8);
                  ++var7;
                  net.u.d.h(new net.u.d[3]);
                  var3.writeShort(7 + 2 * var2.P().length());
                  var3.writeByte(127);
                  var4 = var2.P().toCharArray();
                  var3.writeShort(var4.length);
                  var6 = var4.length;
                  var7 = 0;
                  if(var7 < var6) {
                     var8 = var4[var7];
                     var3.writeChar(var8);
                     ++var7;
                  }

                  var3.writeInt(var2.l());
                  var1x.channel().writeAndFlush(var3).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
                  var3.release();
               }

               protected void c(ChannelHandlerContext var1x, ByteBuf var2x) throws Exception {
                  short var3 = var2x.readUnsignedByte();
                  if(var3 == 255) {
                     String var4 = new String(var2x.readBytes(var2x.readShort() * 2).array(), StandardCharsets.UTF_16BE);
                     String[] var5 = (String[])Iterables.toArray(q.u.split(var4), String.class);
                     if("§1".equals(var5[0])) {
                        net.u.t.i(var5[1], 0);
                        String var7 = var5[2];
                        String var8 = var5[3];
                        int var9 = net.u.t.i(var5[4], -1);
                        int var10 = net.u.t.i(var5[5], -1);
                        var1.Z = -1;
                        var1.c = var7;
                        var1.I = var8;
                        var1.X = net.cb.z.GRAY + "" + var9 + "" + net.cb.z.DARK_GRAY + "/" + net.cb.z.GRAY + var10;
                     }
                  }

                  var1x.close();
               }

               public void exceptionCaught(ChannelHandlerContext var1x, Throwable var2x) throws Exception {
                  var1x.close();
               }

               private static Exception a(Exception var0) {
                  return var0;
               }
            }});
         }
      })).channel(NioSocketChannel.class)).connect(var2.P(), var2.l());
   }

   public void h() {
      v.C();
      List var2 = this.A;
      Iterator var3 = this.A.iterator();
      if(var3.hasNext()) {
         net.n2.a var4 = (net.n2.a)var3.next();
         if(var4.t()) {
            var4.c();
         }

         var3.remove();
         var4.E();
      }

   }

   public void I() {
      v.C();
      List var2 = this.A;
      Iterator var3 = this.A.iterator();
      if(var3.hasNext()) {
         net.n2.a var4 = (net.n2.a)var3.next();
         if(var4.t()) {
            var3.remove();
            var4.R(new h("multiplayer.status.cancelled", new Object[0]));
         }
      }

   }
}
