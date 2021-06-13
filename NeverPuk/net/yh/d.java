package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;

public class d extends x {
   private final float b;

   protected d(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.B = this.B * 0.009999999776482582D + var8;
      this.R = this.R * 0.009999999776482582D + var10;
      this.L = this.L * 0.009999999776482582D + var12;
      this.K += (double)((this.k.nextFloat() - this.k.nextFloat()) * 0.05F);
      this.C += (double)((this.k.nextFloat() - this.k.nextFloat()) * 0.05F);
      this.A += (double)((this.k.nextFloat() - this.k.nextFloat()) * 0.05F);
      this.b = this.g;
      this.N = 1.0F;
      this.F = 1.0F;
      this.V = 1.0F;
      this.a = (int)(8.0D / (Math.random() * 0.8D + 0.2D)) + 4;
      this.Y(48);
   }

   public void f(double var1, double var3, double var5) {
      this.K(this.I().w(var1, var3, var5));
      this.n();
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.x + var3) / (float)this.a;
      this.g = this.b * (1.0F - var9 * var9 * 0.5F);
      super.A(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public int g(float var1) {
      float var3 = ((float)this.x + var1) / (float)this.a;
      x.f();
      var3 = net.u.t.T(var3, 0.0F, 1.0F);
      int var4 = super.g(var1);
      int var5 = var4 & 255;
      int var6 = var4 >> 16 & 255;
      var5 = var5 + (int)(var3 * 15.0F * 16.0F);
      if(var5 > 240) {
         var5 = 240;
      }

      return var5 | var6 << 16;
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
      this.B *= 0.9599999785423279D;
      this.R *= 0.9599999785423279D;
      this.L *= 0.9599999785423279D;
      if(this.T) {
         this.B *= 0.699999988079071D;
         this.L *= 0.699999988079071D;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class r implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new d(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
