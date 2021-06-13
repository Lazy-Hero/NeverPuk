package net.n2;

import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import javax.crypto.SecretKey;
import net._x;
import net.xn;
import net.zf;
import net.zm;
import net.n2.d;
import net.n2.g;
import net.n2.h;
import net.n2.i;
import net.n2.k;
import net.n2.l;
import net.n2.m;
import net.n2.o;
import net.n2.q;
import net.n2.t;
import net.n2.v;
import net.n2.w;
import net.n2.y;
import net.yz.ak;
import net.yz.az;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class a extends SimpleChannelInboundHandler {
   private static final Logger E = LogManager.getLogger();
   public static final Marker i = MarkerManager.getMarker("NETWORK");
   public static final Marker c = MarkerManager.getMarker("NETWORK_PACKETS", i);
   public static final AttributeKey h = AttributeKey.valueOf("protocol");
   public static final ak p = new ak() {
      protected NioEventLoopGroup T() {
         return new NioEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Client IO #%d").setDaemon(true).build());
      }
   };
   public static final ak W = new ak() {
      protected EpollEventLoopGroup y() {
         return new EpollEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build());
      }
   };
   public static final ak P = new ak() {
      protected LocalEventLoopGroup j() {
         return new LocalEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Local Client IO #%d").setDaemon(true).build());
      }
   };
   private final w l;
   private final Queue I = Queues.newConcurrentLinkedQueue();
   private final ReentrantReadWriteLock m = new ReentrantReadWriteLock();
   private Channel C;
   private SocketAddress y;
   private o Q;
   private net.cb.t Y;
   private boolean o;
   private boolean M;

   public a(w var1) {
      this.l = var1;
   }

   public void channelActive(ChannelHandlerContext var1) throws Exception {
      super.channelActive(var1);
      this.C = var1.channel();
      this.y = this.C.remoteAddress();
      this.d(t.HANDSHAKING);
   }

   public void d(t var1) {
      this.C.attr(h).set(var1);
      this.C.config().setAutoRead(true);
      E.debug("Enabled auto read");
   }

   public void channelInactive(ChannelHandlerContext var1) throws Exception {
      this.R(new net.cb.h("disconnect.endOfStream", new Object[0]));
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) throws Exception {
      net.cb.h var3;
      if(var2 instanceof TimeoutException) {
         var3 = new net.cb.h("disconnect.timeout", new Object[0]);
      } else {
         var3 = new net.cb.h("disconnect.genericReason", new Object[]{"Internal Exception: " + var2});
      }

      E.debug(var3.l(), var2);
      this.R(var3);
   }

   protected void Z(ChannelHandlerContext var1, k var2) throws Exception {
      zf var3 = new zf(var2);
      _x.m(var3);
      if(!var3.t()) {
         if(this.C.isOpen()) {
            var2.k(this.Q);
         }

      }
   }

   public void Y(o var1) {
      Validate.notNull(var1, "packetListener", new Object[0]);
      E.debug("Set listener of {} to {}", this, var1);
      this.Q = var1;
   }

   public void F(k var1) {
      if(this.t()) {
         zm var2 = new zm(var1, true);
         _x.m(var2);
         if(!var2.t()) {
            this.j();
            this.w(var2.r(), (GenericFutureListener[])null);
         }
      } else {
         this.m.writeLock().lock();
         this.I.add(new a.z(var1, new GenericFutureListener[0]));
         this.m.writeLock().unlock();
      }

   }

   @SafeVarargs
   public final void Z(k var1, GenericFutureListener var2, GenericFutureListener... var3) {
      if(this.t()) {
         this.j();
         this.w(var1, (GenericFutureListener[])ArrayUtils.add(var3, 0, var2));
      } else {
         this.m.writeLock().lock();
         this.I.add(new a.z(var1, (GenericFutureListener[])ArrayUtils.add(var3, 0, var2)));
         this.m.writeLock().unlock();
      }

   }

   private void w(final k var1, @Nullable final GenericFutureListener[] var2) {
      final t var3 = t.p(var1);
      final t var4 = (t)this.C.attr(h).get();
      if(var4 != var3) {
         E.debug("Disabled auto read");
         this.C.config().setAutoRead(false);
      }

      if(this.C.eventLoop().inEventLoop()) {
         if(var3 != var4) {
            this.d(var3);
         }

         ChannelFuture var5 = this.C.writeAndFlush(var1);
         var5.addListeners(var2);
         var5.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
      } else {
         this.C.eventLoop().execute(new Runnable() {
            public void run() {
               int var1x = h.X();
               if(var3 != var4) {
                  a.this.d(var3);
               }

               ChannelFuture var2x = a.this.C.writeAndFlush(var1);
               if(var2 != null) {
                  var2x.addListeners(var2);
               }

               var2x.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
            }

            private static xn a(xn var0) {
               return var0;
            }
         });
      }

   }

   private void j() {
      if(this.C != null && this.C.isOpen()) {
         this.m.readLock().lock();

         while(!this.I.isEmpty()) {
            a.z var1 = (a.z)this.I.poll();
            this.w(var1.v, var1.M);
         }

         this.m.readLock().unlock();
      }

   }

   public void c() {
      this.j();
      if(this.Q instanceof net.yz.i) {
         ((net.yz.i)this.Q).m();
      }

      if(this.C != null) {
         this.C.flush();
      }

   }

   public SocketAddress s() {
      return this.y;
   }

   public void R(net.cb.t var1) {
      if(this.C.isOpen()) {
         this.C.close().awaitUninterruptibly();
         this.Y = var1;
      }

   }

   public boolean Z() {
      return this.C instanceof LocalChannel || this.C instanceof LocalServerChannel;
   }

   public static a Y(InetAddress var0, int var1, boolean var2) {
      final a var3 = new a(w.CLIENTBOUND);
      Class var4;
      ak var5;
      if(Epoll.isAvailable()) {
         var4 = EpollSocketChannel.class;
         var5 = W;
      } else {
         var4 = NioSocketChannel.class;
         var5 = p;
      }

      ((Bootstrap)((Bootstrap)((Bootstrap)(new Bootstrap()).group((EventLoopGroup)var5.M())).handler(new ChannelInitializer() {
         protected void initChannel(Channel var1) throws Exception {
            var1.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(true));
            var1.pipeline().addLast("timeout", new ReadTimeoutHandler(30)).addLast("splitter", new q()).addLast("decoder", new i(w.CLIENTBOUND)).addLast("prepender", new v()).addLast("encoder", new l(w.SERVERBOUND)).addLast("packet_handler", var3);
         }
      })).channel(var4)).connect(var0, var1).syncUninterruptibly();
      return var3;
   }

   public static a X(SocketAddress var0) {
      final a var1 = new a(w.CLIENTBOUND);
      ((Bootstrap)((Bootstrap)((Bootstrap)(new Bootstrap()).group((EventLoopGroup)P.M())).handler(new ChannelInitializer() {
         protected void initChannel(Channel var1x) throws Exception {
            var1x.pipeline().addLast("packet_handler", var1);
         }
      })).channel(LocalChannel.class)).connect(var0).syncUninterruptibly();
      return var1;
   }

   public void s(SecretKey var1) {
      this.o = true;
      this.C.pipeline().addBefore("splitter", "decrypt", new y(az.i(2, var1)));
      this.C.pipeline().addBefore("prepender", "encrypt", new g(az.i(1, var1)));
   }

   public boolean o() {
      return this.o;
   }

   public boolean t() {
      return this.C != null && this.C.isOpen();
   }

   public boolean x() {
      return this.C == null;
   }

   public o N() {
      return this.Q;
   }

   public net.cb.t F() {
      return this.Y;
   }

   public void e() {
      this.C.config().setAutoRead(false);
   }

   public void a(int var1) {
      int var2 = h.X();
      if(var1 >= 0) {
         if(this.C.pipeline().get("decompress") instanceof d) {
            ((d)this.C.pipeline().get("decompress")).q(var1);
         }

         this.C.pipeline().addBefore("decoder", "decompress", new d(var1));
         if(this.C.pipeline().get("compress") instanceof m) {
            ((m)this.C.pipeline().get("compress")).Y(var1);
         }

         this.C.pipeline().addBefore("encoder", "compress", new m(var1));
      }

      if(this.C.pipeline().get("decompress") instanceof d) {
         this.C.pipeline().remove("decompress");
      }

      if(this.C.pipeline().get("compress") instanceof m) {
         this.C.pipeline().remove("compress");
      }

   }

   public void E() {
      if(this.C != null && !this.C.isOpen()) {
         if(this.M) {
            E.warn("handleDisconnection() called twice");
         } else {
            this.M = true;
            if(this.F() != null) {
               this.N().d(this.F());
            } else if(this.N() != null) {
               this.N().d(new net.cb.h("multiplayer.disconnect.generic", new Object[0]));
            }
         }
      }

   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   static class z {
      private final k v;
      private final GenericFutureListener[] M;

      public z(k var1, GenericFutureListener... var2) {
         this.v = var1;
         this.M = var2;
      }
   }
}
