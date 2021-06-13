package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;

public class f extends x {
   private final float P;
   private final double Z;
   private final double v;
   private final double b;

   protected f(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.B = var8;
      this.R = var10;
      this.L = var12;
      this.K = var2;
      this.C = var4;
      this.A = var6;
      this.Z = this.K;
      this.v = this.C;
      this.b = this.A;
      float var14 = this.k.nextFloat() * 0.6F + 0.4F;
      this.g = this.k.nextFloat() * 0.2F + 0.5F;
      this.P = this.g;
      this.N = var14 * 0.9F;
      this.F = var14 * 0.3F;
      this.V = var14;
      this.a = (int)(Math.random() * 10.0D) + 40;
      this.Y((int)(Math.random() * 8.0D));
   }

   public void f(double var1, double var3, double var5) {
      this.K(this.I().w(var1, var3, var5));
      this.n();
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.x + var3) / (float)this.a;
      var9 = 1.0F - var9;
      var9 = var9 * var9;
      var9 = 1.0F - var9;
      this.g = this.P * var9;
      super.A(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public int g(float var1) {
      x.f();
      int var3 = super.g(var1);
      float var4 = (float)this.x / (float)this.a;
      var4 = var4 * var4;
      var4 = var4 * var4;
      int var5 = var3 & 255;
      int var6 = var3 >> 16 & 255;
      var6 = var6 + (int)(var4 * 15.0F * 16.0F);
      if(var6 > 240) {
         var6 = 240;
      }

      return var5 | var6 << 16;
   }

   public void f() {
      this.i = this.K;
      this.m = this.C;
      this.O = this.A;
      x.f();
      float var2 = (float)this.x / (float)this.a;
      float var3 = -var2 + var2 * var2 * 2.0F;
      float var4 = 1.0F - var3;
      this.K = this.Z + this.B * (double)var4;
      this.C = this.v + this.R * (double)var4 + (double)(1.0F - var2);
      this.A = this.b + this.L * (double)var4;
      if(this.x++ >= this.a) {
         this.Z();
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class q implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new f(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
