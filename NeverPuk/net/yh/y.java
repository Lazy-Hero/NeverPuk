package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;

public class y extends x {
   private final float d;
   private final double j;
   private final double P;
   private final double I;

   protected y(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.B = var8;
      this.R = var10;
      this.L = var12;
      this.j = var2;
      this.P = var4;
      this.I = var6;
      this.i = var2 + var8;
      this.m = var4 + var10;
      this.O = var6 + var12;
      this.K = this.i;
      this.C = this.m;
      this.A = this.O;
      float var14 = this.k.nextFloat() * 0.6F + 0.4F;
      this.g = this.k.nextFloat() * 0.5F + 0.2F;
      this.d = this.g;
      this.N = 0.9F * var14;
      this.F = 0.9F * var14;
      this.V = var14;
      this.a = (int)(Math.random() * 10.0D) + 30;
      this.Y((int)(Math.random() * 26.0D + 1.0D + 224.0D));
   }

   public void f(double var1, double var3, double var5) {
      this.K(this.I().w(var1, var3, var5));
      this.n();
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
      float var2 = (float)this.x / (float)this.a;
      var2 = 1.0F - var2;
      float var3 = 1.0F - var2;
      var3 = var3 * var3;
      x.f();
      var3 = var3 * var3;
      this.K = this.j + this.B * (double)var2;
      this.C = this.P + this.R * (double)var2 - (double)(var3 * 1.2F);
      this.A = this.I + this.L * (double)var2;
      if(this.x++ >= this.a) {
         this.Z();
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class w implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new y(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
