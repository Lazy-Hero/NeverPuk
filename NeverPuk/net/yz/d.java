package net.yz;

import net.xn;
import net.n0.ks;
import net.n0.yt;
import net.yz.m_;

public class d {
   private int C = 20;
   private float d = 5.0F;
   private float q;
   private int U;
   private int h = 20;

   public void n(int var1, float var2) {
      this.C = Math.min(var1 + this.C, 20);
      this.d = Math.min(this.d + (float)var1 * var2 * 2.0F, (float)this.C);
   }

   public void f(yt var1, ks var2) {
      this.n(var1.Z(var2), var1.Q(var2));
   }

   public void s(net.r.r var1) {
      m_.g();
      net.yv.l var3 = var1.hl.k();
      this.h = this.C;
      if(Float.compare(this.q, 4.0F) > 0) {
         this.q -= 4.0F;
         if(this.d > 0.0F) {
            this.d = Math.max(this.d - 1.0F, 0.0F);
         }

         if(var3 != net.yv.l.PEACEFUL) {
            this.C = Math.max(this.C - 1, 0);
         }
      }

      boolean var4 = var1.hl.N().b("naturalRegeneration");
      if(var4 && Float.compare(this.d, 0.0F) > 0 && var1.Vr() && this.C >= 20) {
         ++this.U;
         if(this.U < 10) {
            return;
         }

         float var5 = Math.min(this.d, 6.0F);
         var1.d(var5 / 6.0F);
         this.Y(var5);
         this.U = 0;
      }

      if(var4 && this.C >= 18 && var1.Vr()) {
         ++this.U;
         if(this.U < 80) {
            return;
         }

         var1.d(1.0F);
         this.Y(6.0F);
         this.U = 0;
      }

      if(this.C <= 0) {
         ++this.U;
         if(this.U < 80) {
            return;
         }

         if(var1.h() > 10.0F || var3 == net.yv.l.HARD || var1.h() > 1.0F && var3 == net.yv.l.NORMAL) {
            var1.H(net.yz.z.D, 1.0F);
         }

         this.U = 0;
      }

      this.U = 0;
   }

   public void L(net.nj.f var1) {
      if(var1.K("foodLevel", 99)) {
         this.C = var1.P("foodLevel");
         this.U = var1.P("foodTickTimer");
         this.d = var1.S("foodSaturationLevel");
         this.q = var1.S("foodExhaustionLevel");
      }

   }

   public void z(net.nj.f var1) {
      var1.r("foodLevel", this.C);
      var1.r("foodTickTimer", this.U);
      var1.d("foodSaturationLevel", this.d);
      var1.d("foodExhaustionLevel", this.q);
   }

   public int Z() {
      return this.C;
   }

   public boolean B() {
      return this.C < 20;
   }

   public void Y(float var1) {
      this.q = Math.min(this.q + var1, 40.0F);
   }

   public float M() {
      return this.d;
   }

   public void x(int var1) {
      this.C = var1;
   }

   public void L(float var1) {
      this.d = var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
