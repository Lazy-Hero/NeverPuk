package net.yp;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.math.BigInteger;
import java.security.PublicKey;
import javax.annotation.Nullable;
import javax.crypto.SecretKey;
import net.cs.c;
import net.cs.h;
import net.n2.a;
import net.n2.t;
import net.ya.s;
import net.yp.v;
import net.yt.y;
import net.yz.az;
import net.z.tu;
import net.z.tx;
import net.z.ww;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class j implements s {
   private static final Logger C = LogManager.getLogger();
   private final net.nn.j Y;
   @Nullable
   private final tu B;
   private final a g;
   private GameProfile E;

   public j(a var1, net.nn.j var2, @Nullable tu var3) {
      this.g = var1;
      this.Y = var2;
      this.B = var3;
   }

   public void E(c var1) {
      v.C();
      final SecretKey var3 = az.g();
      String var4 = var1.e();
      PublicKey var5 = var1.F();
      String var6 = (new BigInteger(az.G(var4, var5, var3))).toString(16);
      if(this.Y.m() != null && this.Y.m().Z()) {
         this.e().joinServer(this.Y.L().w(), this.Y.L().v(), var6);
      } else {
         this.e().joinServer(this.Y.L().w(), this.Y.L().v(), var6);
      }

      this.g.Z(new y(var3, var5, var1.s()), new GenericFutureListener() {
         public void operationComplete(Future var1) throws Exception {
            j.this.g.s(var3);
         }
      }, new GenericFutureListener[0]);
   }

   private MinecraftSessionService e() {
      return this.Y.Y();
   }

   public void R(h var1) {
      this.E = var1.S();
      this.g.d(t.PLAY);
      this.g.Y(new v(this.Y, this.B, this.g, this.E));
   }

   public void d(net.cb.t var1) {
      if(this.B != null && this.B instanceof ww) {
         this.Y.s((new net.ct.j(((ww)this.B).R(), "connect.failed", var1)).o());
      } else {
         this.Y.s(new tx(this.B, "connect.failed", var1));
      }

   }

   public void H(net.cs.p var1) {
      this.g.R(var1.X());
   }

   public void L(net.cs.z var1) {
      if(!this.g.Z()) {
         this.g.a(var1.E());
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
