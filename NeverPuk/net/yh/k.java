package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;

public class k extends x {
   float o;

   protected k(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 2.0F);
   }

   protected k(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.B *= 0.009999999776482582D;
      this.R *= 0.009999999776482582D;
      this.L *= 0.009999999776482582D;
      this.R += 0.1D;
      this.g *= 0.75F;
      this.g *= var14;
      this.o = this.g;
      this.a = 16;
      this.Y(80);
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.x + var3) / (float)this.a * 32.0F;
      var9 = net.u.t.T(var9, 0.0F, 1.0F);
      this.g = this.o * var9;
      super.A(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void f() {
      x.f();
      this.i = this.K;
      this.m = this.C;
      this.O = this.A;
      if(this.x++ >= this.a) {
         this.Z();
      }

      this.f(this.B, this.R, this.L);
      if(Double.compare(this.C, this.m) == 0) {
         this.B *= 1.1D;
         this.L *= 1.1D;
      }

      this.B *= 0.8600000143051147D;
      this.R *= 0.8600000143051147D;
      this.L *= 0.8600000143051147D;
      if(this.T) {
         this.B *= 0.699999988079071D;
         this.L *= 0.699999988079071D;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class b implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         k var16 = new k(var2, var3, var5 + 0.5D, var7, var9, var11, var13);
         var16.Y(81);
         var16.W(1.0F, 1.0F, 1.0F);
         return var16;
      }
   }

   public static class q implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new k(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
