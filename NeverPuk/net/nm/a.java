package net.nm;

import net.xn;
import net.n0.ks;
import net.nm.i;
import net.nm.w;
import net.yz.ai;

public class a extends net.ne.l {
   private double yf;
   private double yZ;
   private double yy;
   private int yD;
   private boolean yQ;

   public a(net.yv.r var1) {
      super(var1);
      this.S(0.25F, 0.25F);
   }

   protected void g() {
   }

   public boolean p(double var1) {
      double var3 = this.i().O() * 4.0D;
      if(Double.isNaN(var3)) {
         var3 = 4.0D;
      }

      var3 = var3 * 64.0D;
      return var1 < var3 * var3;
   }

   public a(net.yv.r var1, double var2, double var4, double var6) {
      super(var1);
      this.yD = 0;
      this.S(0.25F, 0.25F);
      this.t(var2, var4, var6);
   }

   public void R(net.u.j var1) {
      double var2 = (double)var1.t();
      int var4 = var1.h();
      double var5 = (double)var1.y();
      double var7 = var2 - this.b;
      double var9 = var5 - this.hr;
      float var11 = net.u.t.R(var7 * var7 + var9 * var9);
      if(var11 > 12.0F) {
         this.yf = this.b + var7 / (double)var11 * 12.0D;
         this.yy = this.hr + var9 / (double)var11 * 12.0D;
         this.yZ = this.hS + 8.0D;
      } else {
         this.yf = var2;
         this.yZ = (double)var4;
         this.yy = var5;
      }

      this.yD = 0;
      this.yQ = this.p.nextInt(5) > 0;
   }

   public void K(double var1, double var3, double var5) {
      this.hf = var1;
      this.K = var3;
      this.J = var5;
      if(this.d == 0.0F && this.hq == 0.0F) {
         float var7 = net.u.t.R(var1 * var1 + var5 * var5);
         this.hN = (float)(net.u.t.V(var1, var5) * 57.29577951308232D);
         this.V = (float)(net.u.t.V(var3, (double)var7) * 57.29577951308232D);
         this.hq = this.hN;
         this.d = this.V;
      }

   }

   public void A() {
      this.hL = this.b;
      this.F = this.hS;
      w.h.s();
      this.A = this.hr;
      super.A();
      this.b += this.hf;
      this.hS += this.K;
      this.hr += this.J;
      float var2 = net.u.t.R(this.hf * this.hf + this.J * this.J);
      this.hN = (float)(net.u.t.V(this.hf, this.J) * 57.29577951308232D);
      this.V = (float)(net.u.t.V(this.K, (double)var2) * 57.29577951308232D);
      if(this.V - this.d < -180.0F) {
         this.d -= 360.0F;
      }

      if(this.V - this.d >= 180.0F) {
         this.d += 360.0F;
      }

      if(this.hN - this.hq < -180.0F) {
         this.hq -= 360.0F;
      }

      if(this.hN - this.hq >= 180.0F) {
         this.hq += 360.0F;
      }

      this.V = this.d + (this.V - this.d) * 0.2F;
      this.hN = this.hq + (this.hN - this.hq) * 0.2F;
      if(!this.hl.x) {
         double var3 = this.yf - this.b;
         double var5 = this.yy - this.hr;
         float var7 = (float)Math.sqrt(var3 * var3 + var5 * var5);
         float var8 = (float)net.u.t.V(var5, var3);
         double var9 = (double)var2 + (double)(var7 - var2) * 0.0025D;
         if(Float.compare(var7, 1.0F) < 0) {
            var9 *= 0.8D;
            this.K *= 0.8D;
         }

         this.hf = Math.cos((double)var8) * var9;
         this.J = Math.sin((double)var8) * var9;
         if(this.hS < this.yZ) {
            this.K += (1.0D - this.K) * 0.014999999664723873D;
         }

         this.K += (-1.0D - this.K) * 0.014999999664723873D;
      }

      float var11 = 0.25F;
      if(this.p()) {
         int var4 = 0;
         this.hl.n(ai.WATER_BUBBLE, this.b - this.hf * 0.25D, this.hS - this.K * 0.25D, this.hr - this.J * 0.25D, this.hf, this.K, this.J, new int[0]);
         ++var4;
      }

      this.hl.n(ai.PORTAL, this.b - this.hf * 0.25D + this.p.nextDouble() * 0.6D - 0.3D, this.hS - this.K * 0.25D - 0.5D, this.hr - this.J * 0.25D + this.p.nextDouble() * 0.6D - 0.3D, this.hf, this.K, this.J, new int[0]);
      if(!this.hl.x) {
         this.t(this.b, this.hS, this.hr);
         ++this.yD;
         if(this.yD > 80 && !this.hl.x) {
            this.I(net.nb.l.Kw, 1.0F, 1.0F);
            this.B();
            if(this.yQ) {
               this.hl.S(new i(this.hl, this.b, this.hS, this.hr, new ks(net.nb.j.SV)));
            }

            this.hl.s(2003, new net.u.j(this), 0);
         }
      }

      if(net.u.d.y() == null) {
         w.h.C(false);
      }

   }

   public void I(net.nj.f var1) {
   }

   public void o(net.nj.f var1) {
   }

   public float d() {
      return 1.0F;
   }

   public int L() {
      return 15728880;
   }

   public boolean C() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
