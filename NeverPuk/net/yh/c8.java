package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;

public class c8 extends x {
   protected c8(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      float var14 = this.k.nextFloat() * 0.1F + 0.2F;
      this.N = var14;
      this.F = var14;
      this.V = var14;
      this.Y(0);
      this.O(0.02F, 0.02F);
      this.g *= this.k.nextFloat() * 0.6F + 0.5F;
      this.B *= 0.019999999552965164D;
      this.R *= 0.019999999552965164D;
      this.L *= 0.019999999552965164D;
      this.a = (int)(20.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void f(double var1, double var3, double var5) {
      this.K(this.I().w(var1, var3, var5));
      this.n();
   }

   public void f() {
      this.i = this.K;
      this.m = this.C;
      x.f();
      this.O = this.A;
      this.f(this.B, this.R, this.L);
      this.B *= 0.99D;
      this.R *= 0.99D;
      this.L *= 0.99D;
      if(this.a-- <= 0) {
         this.Z();
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class l implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new c8(var2, var3, var5, var7, var9, var11, var13);
      }
   }

   public static class n implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         c8 var16 = new c8(var2, var3, var5, var7, var9, var11, var13);
         var16.Y(82);
         var16.W(1.0F, 1.0F, 1.0F);
         return var16;
      }
   }
}
