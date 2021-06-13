package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;

public class v extends x {
   protected v(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.B = var8 + (Math.random() * 2.0D - 1.0D) * 0.05000000074505806D;
      this.R = var10 + (Math.random() * 2.0D - 1.0D) * 0.05000000074505806D;
      this.L = var12 + (Math.random() * 2.0D - 1.0D) * 0.05000000074505806D;
      float var14 = this.k.nextFloat() * 0.3F + 0.7F;
      this.N = var14;
      this.F = var14;
      this.V = var14;
      this.g = this.k.nextFloat() * this.k.nextFloat() * 6.0F + 1.0F;
      this.a = (int)(16.0D / ((double)this.k.nextFloat() * 0.8D + 0.2D)) + 2;
   }

   public void f() {
      this.i = this.K;
      x.f();
      this.m = this.C;
      this.O = this.A;
      if(this.x++ >= this.a) {
         this.Z();
      }

      this.Y(7 - this.x * 8 / this.a);
      this.R += 0.004D;
      this.f(this.B, this.R, this.L);
      this.B *= 0.8999999761581421D;
      this.R *= 0.8999999761581421D;
      this.L *= 0.8999999761581421D;
      if(this.T) {
         this.B *= 0.699999988079071D;
         this.L *= 0.699999988079071D;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class h implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new v(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
