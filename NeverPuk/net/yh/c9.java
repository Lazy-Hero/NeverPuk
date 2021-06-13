package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;

public class c9 extends x {
   protected c9(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4 - 0.125D, var6, var8, var10, var12);
      this.N = 0.4F;
      this.F = 0.4F;
      this.V = 0.7F;
      this.Y(0);
      this.O(0.01F, 0.01F);
      this.g *= this.k.nextFloat() * 0.6F + 0.2F;
      this.B = var8 * 0.0D;
      this.R = var10 * 0.0D;
      this.L = var12 * 0.0D;
      this.a = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void f() {
      this.i = this.K;
      this.m = this.C;
      x.f();
      this.O = this.A;
      this.f(this.B, this.R, this.L);
      if(this.e.Z(new net.u.j(this.K, this.C, this.A)).n() != net.y1.l.p) {
         this.Z();
      }

      if(this.a-- <= 0) {
         this.Z();
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class c implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new c9(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
