package net.n1;

import net.xn;
import net.c0.d;
import net.n1.o;
import net.n1.t;
import net.nj.h;
import net.yv.r;
import net.yz.ai;

public abstract class m extends net.ne.l {
   public net.ne.a U0;
   private int Ut;
   private int UW;
   public double US;
   public double UZ;
   public double UF;

   public m(r var1) {
      super(var1);
      this.S(1.0F, 1.0F);
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

   public m(r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.S(1.0F, 1.0F);
      this.S(var2, var4, var6, this.hN, this.V);
      this.t(var2, var4, var6);
      double var14 = (double)net.u.t.R(var8 * var8 + var10 * var10 + var12 * var12);
      this.US = var8 / var14 * 0.1D;
      this.UZ = var10 / var14 * 0.1D;
      this.UF = var12 / var14 * 0.1D;
   }

   public m(r var1, net.ne.a var2, double var3, double var5, double var7) {
      super(var1);
      this.U0 = var2;
      this.S(1.0F, 1.0F);
      this.S(var2.b, var2.hS, var2.hr, var2.hN, var2.V);
      this.t(this.b, this.hS, this.hr);
      this.hf = 0.0D;
      this.K = 0.0D;
      this.J = 0.0D;
      var3 = var3 + this.p.nextGaussian() * 0.4D;
      var5 = var5 + this.p.nextGaussian() * 0.4D;
      var7 = var7 + this.p.nextGaussian() * 0.4D;
      double var9 = (double)net.u.t.R(var3 * var3 + var5 * var5 + var7 * var7);
      this.US = var3 / var9 * 0.1D;
      this.UZ = var5 / var9 * 0.1D;
      this.UF = var7 / var9 * 0.1D;
   }

   public void A() {
      String var1 = o.s.H();
      if(this.hl.x || (this.U0 == null || !this.U0.Z) && this.hl.o(new net.u.j(this))) {
         super.A();
         if(this.E()) {
            this.n(1);
         }

         ++this.UW;
         net.u.m var2 = t.d(this, true, this.UW >= 25, this.U0);
         this.t(var2);
         this.b += this.hf;
         this.hS += this.K;
         this.hr += this.J;
         t.J(this, 0.2F);
         float var3 = this.U();
         if(this.p()) {
            int var4 = 0;
            float var10000 = 0.25F;
            this.hl.n(ai.WATER_BUBBLE, this.b - this.hf * 0.25D, this.hS - this.K * 0.25D, this.hr - this.J * 0.25D, this.hf, this.K, this.J, new int[0]);
            ++var4;
            var3 = 0.8F;
         }

         this.hf += this.US;
         this.K += this.UZ;
         this.J += this.UF;
         this.hf *= (double)var3;
         this.K *= (double)var3;
         this.J *= (double)var3;
         this.hl.n(this.q(), this.b, this.hS + 0.5D, this.hr, 0.0D, 0.0D, 0.0D, new int[0]);
         this.t(this.b, this.hS, this.hr);
      }

      this.B();
   }

   protected boolean E() {
      return true;
   }

   protected ai q() {
      return ai.SMOKE_NORMAL;
   }

   protected float U() {
      return 0.95F;
   }

   protected abstract void t(net.u.m var1);

   public static void p(d var0, String var1) {
   }

   public void I(net.nj.f var1) {
      var1.K("direction", this.p(new double[]{this.hf, this.K, this.J}));
      var1.K("power", this.p(new double[]{this.US, this.UZ, this.UF}));
      var1.r("life", this.Ut);
   }

   public void o(net.nj.f var1) {
      if(var1.K("power", 9)) {
         h var2 = var1.A("power", 6);
         if(var2.z() == 3) {
            this.US = var2.U(0);
            this.UZ = var2.U(1);
            this.UF = var2.U(2);
         }
      }

      this.Ut = var1.P("life");
      if(var1.K("direction", 9) && var1.A("direction", 6).z() == 3) {
         h var3 = var1.A("direction", 6);
         this.hf = var3.U(0);
         this.K = var3.U(1);
         this.J = var3.U(2);
      } else {
         this.B();
      }

   }

   public boolean w() {
      return true;
   }

   public float t() {
      return 1.0F;
   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else {
         this.E();
         if(var1.v() != null) {
            net.u.r var3 = var1.v().g();
            this.hf = var3.p;
            this.K = var3.H;
            this.J = var3.a;
            this.US = this.hf * 0.1D;
            this.UZ = this.K * 0.1D;
            this.UF = this.J * 0.1D;
            if(var1.v() instanceof net.ne.a) {
               this.U0 = (net.ne.a)var1.v();
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public float d() {
      return 1.0F;
   }

   public int L() {
      return 15728880;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
