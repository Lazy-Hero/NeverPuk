package net.yy;

import com.mojang.authlib.GameProfile;
import java.io.File;
import javax.annotation.Nullable;
import net._t;
import net.d1;
import net.gn;
import net.i6;
import net.ry;
import net.xn;
import net.z9;
import net.c9.y;
import net.n9.e;
import net.n9.t;
import net.ne.d;
import net.nn.j;
import net.r.r;
import net.s.i;
import net.y.q;
import net.y.uh;
import net.y9.l;
import net.yp.b;
import net.yv.o9;
import net.yz.a7;
import net.yz.m_;

public abstract class f extends r {
   private b wP;
   public float wa;
   public float wT;
   public float w3;
   private m_ w7 = null;
   private String w6 = null;
   private static final m_ wb = new m_("textures/entity/elytra.png");

   public f(net.yv.r var1, GameProfile var2) {
      super(var1, var2);
      this.w6 = var2.getName();
      if(this.w6 != null && !this.w6.isEmpty()) {
         this.w6 = a7.z(this.w6);
      }

      ry.l(this);
      _t.y(this);
   }

   public boolean VX() {
      b var1 = j.b().d().f(this.e().getId());
      return var1.K() == o9.SPECTATOR;
   }

   public boolean V8() {
      b var1 = j.b().d().f(this.e().getId());
      return var1.K() == o9.CREATIVE;
   }

   public boolean TQ() {
      return this.C() != null;
   }

   @Nullable
   protected b C() {
      if(this.wP == null) {
         this.wP = j.b().d().f(this.O());
      }

      return this.wP;
   }

   public boolean T8() {
      b var1 = this.C();
      return var1.W();
   }

   public m_ g() {
      b var1 = this.C();
      return gn.Q.j.d(d1.class).v() && d1.f.Q()?y.l(this.O()):var1.R();
   }

   @Nullable
   public m_ J() {
      if(!z9.S9()) {
         return null;
      } else if(this.w7 != null) {
         return this.w7;
      } else {
         b var1 = this.C();
         return null;
      }
   }

   public boolean Tq() {
      return this.C() != null;
   }

   @Nullable
   public m_ M() {
      b var1 = this.C();
      return null;
   }

   public static uh e(m_ var0, String var1) {
      e var2 = j.b().n();
      t var3 = var2.m(var0);
      uh var4 = new uh((File)null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", new Object[]{a7.z(var1)}), y.l(c(var1)), new q());
      var2.E(var0, var4);
      return (uh)var4;
   }

   public static m_ m(String var0) {
      return new m_("skins/" + a7.z(var0));
   }

   public String a() {
      b var1 = this.C();
      return y.k(this.O());
   }

   public float T() {
      l.x();
      float var2 = 1.0F;
      if(this.a6.n) {
         var2 *= 1.1F;
      }

      i var3 = this.t(d.G);
      var2 = (float)((double)var2 * ((var3.K() / (double)this.a6.V() + 1.0D) / 2.0D));
      if(this.a6.V() == 0.0F || Float.isNaN(var2) || Float.isInfinite(var2)) {
         var2 = 1.0F;
      }

      if(this.F() && this.t().Z() == net.nb.j.w) {
         int var4 = this.d();
         float var5 = (float)var4 / 20.0F;
         if(var5 > 1.0F) {
            var5 = 1.0F;
         }

         var5 = var5 * var5;
         var2 *= 1.0F - var5 * 0.15F;
      }

      return i6.u.r()?i6.k(i6.u, new Object[]{this, Float.valueOf(var2)}):var2;
   }

   public String F() {
      return this.w6;
   }

   public m_ n() {
      return this.w7;
   }

   public void P(m_ var1) {
      this.w7 = var1;
   }

   public boolean Tx() {
      m_ var1 = this.J();
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
