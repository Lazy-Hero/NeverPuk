package net.n2;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.n2.a;
import net.n2.h;
import net.n2.i;
import net.n2.l;
import net.n2.q;
import net.n2.v;
import net.n2.w;
import net.nx.f;
import net.yz.ak;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class c {
   private static final Logger H = LogManager.getLogger();
   public static final ak v = new ak() {
      protected NioEventLoopGroup x() {
         return new NioEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Server IO #%d").setDaemon(true).build());
      }
   };
   public static final ak L = new ak() {
      protected EpollEventLoopGroup W() {
         return new EpollEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build());
      }
   };
   public static final ak u = new ak() {
      protected LocalEventLoopGroup x() {
         return new LocalEventLoopGroup(0, (new ThreadFactoryBuilder()).setNameFormat("Netty Local Server IO #%d").setDaemon(true).build());
      }
   };
   private final f F;
   public volatile boolean r;
   private final List R = Collections.synchronizedList(Lists.newArrayList());
   private final List T = Collections.synchronizedList(Lists.newArrayList());

   public c(f var1) {
      this.F = var1;
      this.r = true;
   }

   public void d(InetAddress var1, int var2) throws IOException {
      List var3 = this.R;
      Class var4;
      ak var5;
      if(Epoll.isAvailable() && this.F.M()) {
         var4 = EpollServerSocketChannel.class;
         var5 = L;
         H.info("Using epoll channel type");
      } else {
         var4 = NioServerSocketChannel.class;
         var5 = v;
         H.info("Using default channel type");
      }

      this.R.add(((ServerBootstrap)((ServerBootstrap)(new ServerBootstrap()).channel(var4)).childHandler(new ChannelInitializer() {
         protected void initChannel(Channel var1) throws Exception {
            int var2 = h.X();
            var1.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(true));
            var1.pipeline().addLast("timeout", new ReadTimeoutHandler(30)).addLast("legacy_query", new net.n2.z(c.this)).addLast("splitter", new q()).addLast("decoder", new i(w.SERVERBOUND)).addLast("prepender", new v()).addLast("encoder", new l(w.CLIENTBOUND));
            a var3 = new a(w.SERVERBOUND);
            c.this.T.add(var3);
            var1.pipeline().addLast("packet_handler", var3);
            var3.Y(new net.yu.w(c.this.F, var3));
            net.u.d.h(new net.u.d[1]);
         }

         private static ChannelException a(ChannelException var0) {
            return var0;
         }
      }).group((EventLoopGroup)var5.M()).localAddress(var1, var2)).bind().syncUninterruptibly());
   }

   public SocketAddress u() {
      List var2 = this.R;
      ChannelFuture var1 = ((ServerBootstrap)((ServerBootstrap)(new ServerBootstrap()).channel(LocalServerChannel.class)).childHandler(new ChannelInitializer() {
         protected void initChannel(Channel var1) throws Exception {
            a var2 = new a(w.SERVERBOUND);
            var2.Y(new net.yp.f(c.this.F, var2));
            c.this.T.add(var2);
            var1.pipeline().addLast("packet_handler", var2);
         }
      }).group((EventLoopGroup)v.M()).localAddress(LocalAddress.ANY)).bind().syncUninterruptibly();
      this.R.add(var1);
      return var1.channel().localAddress();
   }

   public void C() {
      this.r = false;

      for(ChannelFuture var2 : this.R) {
         var2.channel().close().sync();
      }

   }

   public void V() {
      h.w();
      List var2 = this.T;
      Iterator var3 = this.T.iterator();
      if(var3.hasNext()) {
         a var4 = (a)var3.next();
         if(!var4.x()) {
            if(var4.t()) {
               var4.c();
            } else {
               var3.remove();
               var4.E();
            }
         }
      }

   }

   public f Z() {
      return this.F;
   }
}
