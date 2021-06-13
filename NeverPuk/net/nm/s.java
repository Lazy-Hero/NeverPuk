package net.nm;

import net.xn;
import net.c1.y;
import net.n0.ks;
import net.nm.w;

public class s extends net.ne.l {
   public int xg;
   public int xR;
   public int xB;
   private int xX = 5;
   private int xj;
   private net.r.r x6;
   private int xc;

   public s(net.yv.r var1, double var2, double var4, double var6, int var8) {
      super(var1);
      this.S(0.5F, 0.5F);
      this.t(var2, var4, var6);
      this.hN = (float)(Math.random() * 360.0D);
      this.hf = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
      this.K = (double)((float)(Math.random() * 0.2D) * 2.0F);
      this.J = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
      this.xj = var8;
   }

   protected boolean k() {
      return false;
   }

   public s(net.yv.r var1) {
      super(var1);
      this.S(0.25F, 0.25F);
   }

   protected void g() {
   }

   public int L() {
      float var1 = 0.5F;
      var1 = net.u.t.T(var1, 0.0F, 1.0F);
      int var2 = super.L();
      int var3 = var2 & 255;
      int var4 = var2 >> 16 & 255;
      var3 = var3 + (int)(var1 * 15.0F * 16.0F);
      if(var3 > 240) {
         var3 = 240;
      }

      return var3 | var4 << 16;
   }

   public void A() {
      w.h.s();
      super.A();
      if(this.xB > 0) {
         --this.xB;
      }

      this.h = this.b;
      this.h6 = this.hS;
      this.l = this.hr;
      if(!this.j()) {
         this.K -= 0.029999999329447746D;
      }

      if(this.hl.Z(new net.u.j(this)).n() == net.y1.l.U) {
         this.K = 0.20000000298023224D;
         this.hf = (double)((this.p.nextFloat() - this.p.nextFloat()) * 0.2F);
         this.J = (double)((this.p.nextFloat() - this.p.nextFloat()) * 0.2F);
         this.I(net.nb.l.D0, 0.4F, 2.0F + this.p.nextFloat() * 0.4F);
      }

      this.c(this.b, (this.i().u + this.i().c) / 2.0D, this.hr);
      double var10000 = 8.0D;
      if(this.xc < this.xg - 20 + this.G() % 100) {
         if(this.x6 == null || this.x6.F(this) > 64.0D) {
            this.x6 = this.hl.d(this, 8.0D);
         }

         this.xc = this.xg;
      }

      if(this.x6 != null && this.x6.VX()) {
         this.x6 = null;
      }

      if(this.x6 != null) {
         double var4 = (this.x6.b - this.b) / 8.0D;
         double var6 = (this.x6.hS + (double)this.x6.A() / 2.0D - this.hS) / 8.0D;
         double var8 = (this.x6.hr - this.hr) / 8.0D;
         double var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
         double var12 = 1.0D - var10;
         if(var12 > 0.0D) {
            var12 = var12 * var12;
            this.hf += var4 / var10 * var12 * 0.1D;
            this.K += var6 / var10 * var12 * 0.1D;
            this.J += var8 / var10 * var12 * 0.1D;
         }
      }

      this.N(net.ne.f.SELF, this.hf, this.K, this.J);
      float var14 = 0.98F;
      if(this.k) {
         var14 = this.hl.Z(new net.u.j(net.u.t.L(this.b), net.u.t.L(this.i().u) - 1, net.u.t.L(this.hr))).Q().P * 0.98F;
      }

      this.hf *= (double)var14;
      this.K *= 0.9800000190734863D;
      this.J *= (double)var14;
      if(this.k) {
         this.K *= -0.8999999761581421D;
      }

      ++this.xg;
      ++this.xR;
      if(this.xR >= 6000) {
         this.B();
      }

   }

   public boolean r() {
      return this.hl.q(this.i(), net.y1.l.p, this);
   }

   protected void l(int var1) {
      this.H(net.yz.z.p, (float)var1);
   }

   public boolean H(net.yz.z var1, float var2) {
      if(this.w(var1)) {
         return false;
      } else {
         this.E();
         this.xX = (int)((float)this.xX - var2);
         if(this.xX <= 0) {
            this.B();
         }

         return false;
      }
   }

   public void I(net.nj.f var1) {
      var1.h("Health", (short)this.xX);
      var1.h("Age", (short)this.xR);
      var1.h("Value", (short)this.xj);
   }

   public void o(net.nj.f var1) {
      this.xX = var1.E("Health");
      this.xR = var1.E("Age");
      this.xj = var1.E("Value");
   }

   public void H(net.r.r var1) {
      if(!this.hl.x && this.xB == 0 && var1.aB == 0) {
         var1.aB = 2;
         var1.U(this, 1);
         ks var2 = y.I(net.nb.u.Z, var1);
         if(!var2.B() && var2.j()) {
            int var3 = Math.min(this.O(this.xj), var2.z());
            this.xj -= this.n(var3);
            var2.d(var2.z() - var3);
         }

         if(this.xj > 0) {
            var1.E(this.xj);
         }

         this.B();
      }

   }

   private int n(int var1) {
      return var1 / 2;
   }

   private int O(int var1) {
      return var1 * 2;
   }

   public int h() {
      return this.xj;
   }

   public int s() {
      return this.xj >= 2477?10:(this.xj >= 1237?9:(this.xj >= 617?8:(this.xj >= 307?7:(this.xj >= 149?6:(this.xj >= 73?5:(this.xj >= 37?4:(this.xj >= 17?3:(this.xj >= 7?2:(this.xj >= 3?1:0)))))))));
   }

   public static int Z(int var0) {
      return var0 >= 2477?2477:(var0 >= 1237?1237:(var0 >= 617?617:(var0 >= 307?307:(var0 >= 149?149:(var0 >= 73?73:(var0 >= 37?37:(var0 >= 17?17:(var0 >= 7?7:(var0 >= 3?3:1)))))))));
   }

   public boolean C() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
