package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;

public class n extends x {
   protected n(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.N = 1.0F;
      this.F = 1.0F;
      this.V = 1.0F;
      this.Y(32);
      this.O(0.02F, 0.02F);
      this.g *= this.k.nextFloat() * 0.6F + 0.2F;
      this.B = var8 * 0.20000000298023224D + (Math.random() * 2.0D - 1.0D) * 0.019999999552965164D;
      this.R = var10 * 0.20000000298023224D + (Math.random() * 2.0D - 1.0D) * 0.019999999552965164D;
      this.L = var12 * 0.20000000298023224D + (Math.random() * 2.0D - 1.0D) * 0.019999999552965164D;
      this.a = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void f() {
      x.f();
      this.i = this.K;
      this.m = this.C;
      this.O = this.A;
      this.R += 0.002D;
      this.f(this.B, this.R, this.L);
      this.B *= 0.8500000238418579D;
      this.R *= 0.8500000238418579D;
      this.L *= 0.8500000238418579D;
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

   public static class u implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new n(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
