package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;

public class cp extends x {
   protected cp(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.B *= 0.30000001192092896D;
      this.R = Math.random() * 0.20000000298023224D + 0.10000000149011612D;
      this.L *= 0.30000001192092896D;
      this.N = 1.0F;
      this.F = 1.0F;
      this.V = 1.0F;
      this.Y(19);
      this.O(0.01F, 0.01F);
      this.a = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
      this.u = 0.0F;
      this.B = var8;
      this.R = var10;
      this.L = var12;
   }

   public void f() {
      this.i = this.K;
      this.m = this.C;
      this.O = this.A;
      this.R -= (double)this.u;
      x.f();
      this.f(this.B, this.R, this.L);
      this.B *= 0.9800000190734863D;
      this.R *= 0.9800000190734863D;
      this.L *= 0.9800000190734863D;
      int var2 = 60 - this.a;
      float var3 = (float)var2 * 0.001F;
      this.O(var3, var3);
      this.Y(19 + var2 % 4);
      if(this.a-- <= 0) {
         this.Z();
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class n implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new cp(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
