package net.yu;

import com.mojang.authlib.GameProfile;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.GenericFutureListener;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.crypto.SecretKey;
import net.cb.t;
import net.cs.c;
import net.cs.p;
import net.n2.a;
import net.nx.f;
import net.r.h;
import net.u.d;
import net.yt.l;
import net.yt.y;
import net.yz.az;
import net.yz.i;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class e implements net.ya.z, i {
   private static final AtomicInteger C = new AtomicInteger(0);
   private static final Logger t = LogManager.getLogger();
   private static final Random s = new Random();
   private final byte[] n = new byte[4];
   private final f B;
   public final a G;
   private e.b d = e.b.HELLO;
   private int H;
   private GameProfile c;
   private final String u = "";
   private SecretKey e;
   private h j;
   private static String k;

   public e(f var1, a var2) {
      this.B = var1;
      this.G = var2;
      s.nextBytes(this.n);
   }

   public void m() {
      if(this.d == e.b.READY_TO_ACCEPT) {
         this.H();
      } else if(this.d == e.b.DELAY_ACCEPT) {
         h var1 = this.B.c().l(this.c.getId());
         this.d = e.b.READY_TO_ACCEPT;
         this.B.c().Y(this.G, this.j);
         this.j = null;
      }

      if(this.H++ == 600) {
         this.I(new net.cb.h("multiplayer.disconnect.slow_login", new Object[0]));
      }

   }

   public void I(t var1) {
      t.info("Disconnecting {}: {}", this.q(), var1.l());
      this.G.F(new p(var1));
      this.G.R(var1);
   }

   public void H() {
      String var1 = u();
      if(!this.c.isComplete()) {
         this.c = this.W(this.c);
      }

      String var2 = this.B.c().a(this.G.s(), this.c);
      this.I(new net.cb.h(var2, new Object[0]));
      d.h(new d[4]);
      this.d = e.b.ACCEPTED;
      if(this.B.f() >= 0 && !this.G.Z()) {
         this.G.Z(new net.cs.z(this.B.f()), new ChannelFutureListener() {
            public void R(ChannelFuture var1) throws Exception {
               e.this.G.a(e.this.B.f());
            }
         }, new GenericFutureListener[0]);
      }

      this.G.F(new net.cs.h(this.c));
      h var3 = this.B.c().l(this.c.getId());
      this.d = e.b.DELAY_ACCEPT;
      this.j = this.B.c().K(this.c);
      this.B.c().Y(this.G, this.B.c().K(this.c));
   }

   public void d(t var1) {
      t.info("{} lost connection: {}", this.q(), var1.l());
   }

   public String q() {
      return this.c != null?this.c + " (" + this.G.s() + ")":String.valueOf(this.G.s());
   }

   public void F(l var1) {
      Validate.validState(this.d == e.b.HELLO, "Unexpected hello packet", new Object[0]);
      this.c = var1.L();
      if(this.B.E() && !this.G.Z()) {
         this.d = e.b.KEY;
         this.G.F(new c("", this.B.Q().getPublic(), this.n));
      } else {
         this.d = e.b.READY_TO_ACCEPT;
      }

   }

   public void O(y var1) {
      Validate.validState(this.d == e.b.KEY, "Unexpected key packet", new Object[0]);
      PrivateKey var2 = this.B.Q().getPrivate();
      if(!Arrays.equals(this.n, var1.E(var2))) {
         throw new IllegalStateException("Invalid nonce!");
      } else {
         this.e = var1.E(var2);
         this.d = e.b.AUTHENTICATING;
         this.G.s(this.e);
         (new Thread("User Authenticator #" + C.incrementAndGet()) {
            public void run() {
               e.k;
               GameProfile var2 = e.this.c;
               String var3 = (new BigInteger(az.G("", e.this.B.Q().getPublic(), e.this.e))).toString(16);
               e.this.c = e.this.B.q().hasJoinedServer(new GameProfile((UUID)null, var2.getName()), var3, this.y());
               if(e.this.c != null) {
                  e.t.info("UUID of player {} is {}", e.this.c.getName(), e.this.c.getId());
                  e.this.d = e.b.READY_TO_ACCEPT;
               }

               if(e.this.B.n()) {
                  e.t.warn("Failed to verify username but will let them in anyway!");
                  e.this.c = e.this.W(var2);
                  e.this.d = e.b.READY_TO_ACCEPT;
               }

               e.this.I(new net.cb.h("multiplayer.disconnect.unverified_username", new Object[0]));
               e.t.error("Username \'{}\' tried to join with an invalid session", var2.getName());
            }

            @Nullable
            private InetAddress y() {
               SocketAddress var1 = e.this.G.s();
               return e.this.B.O() && var1 instanceof InetSocketAddress?((InetSocketAddress)var1).getAddress():null;
            }

            private static Exception a(Exception var0) {
               return var0;
            }
         }).start();
      }
   }

   protected GameProfile W(GameProfile var1) {
      UUID var2 = UUID.nameUUIDFromBytes(("OfflinePlayer:" + var1.getName()).getBytes(StandardCharsets.UTF_8));
      return new GameProfile(var2, var1.getName());
   }

   static {
      F((String)null);
   }

   public static void F(String var0) {
      k = var0;
   }

   public static String u() {
      return k;
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }

   static enum b {
      HELLO,
      KEY,
      AUTHENTICATING,
      READY_TO_ACCEPT,
      DELAY_ACCEPT,
      ACCEPTED;
   }
}
