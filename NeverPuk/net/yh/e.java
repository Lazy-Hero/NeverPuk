package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;

public class e extends x {
   protected e(net.yv.r var1, double var2, double var4, double var6, net.n0.y var8) {
      this(var1, var2, var4, var6, var8, 0);
   }

   protected e(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12, net.n0.y var14, int var15) {
      this(var1, var2, var4, var6, var14, var15);
      this.B *= 0.10000000149011612D;
      this.R *= 0.10000000149011612D;
      this.L *= 0.10000000149011612D;
      this.B += var8;
      this.R += var10;
      this.L += var12;
   }

   protected e(net.yv.r var1, double var2, double var4, double var6, net.n0.y var8, int var9) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.p(net.nn.j.b().K().k().I(var8, var9));
      this.N = 1.0F;
      this.F = 1.0F;
      this.V = 1.0F;
      this.u = net.nb.f.V.j;
      this.g /= 2.0F;
   }

   public int n() {
      return 1;
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var10 = ((float)this.l + this.r / 4.0F) / 16.0F;
      x.f();
      float var11 = var10 + 0.015609375F;
      float var12 = ((float)this.M + this.s / 4.0F) / 16.0F;
      float var13 = var12 + 0.015609375F;
      float var14 = 0.1F * this.g;
      if(this.t != null) {
         var10 = this.t.W((double)(this.r / 4.0F * 16.0F));
         var11 = this.t.W((double)((this.r + 1.0F) / 4.0F * 16.0F));
         var12 = this.t.L((double)(this.s / 4.0F * 16.0F));
         var13 = this.t.L((double)((this.s + 1.0F) / 4.0F * 16.0F));
      }

      float var15 = (float)(this.i + (this.K - this.i) * (double)var3 - X);
      float var16 = (float)(this.m + (this.C - this.m) * (double)var3 - z);
      float var17 = (float)(this.O + (this.A - this.O) * (double)var3 - U);
      int var18 = this.g(var3);
      int var19 = var18 >> 16 & '\uffff';
      int var20 = var18 & '\uffff';
      var1.H((double)(var15 - var4 * var14 - var7 * var14), (double)(var16 - var5 * var14), (double)(var17 - var6 * var14 - var8 * var14)).Y((double)var10, (double)var13).m(this.N, this.F, this.V, 1.0F).C(var19, var20).W();
      var1.H((double)(var15 - var4 * var14 + var7 * var14), (double)(var16 + var5 * var14), (double)(var17 - var6 * var14 + var8 * var14)).Y((double)var10, (double)var12).m(this.N, this.F, this.V, 1.0F).C(var19, var20).W();
      var1.H((double)(var15 + var4 * var14 + var7 * var14), (double)(var16 + var5 * var14), (double)(var17 + var6 * var14 + var8 * var14)).Y((double)var11, (double)var12).m(this.N, this.F, this.V, 1.0F).C(var19, var20).W();
      var1.H((double)(var15 + var4 * var14 - var7 * var14), (double)(var16 - var5 * var14), (double)(var17 + var6 * var14 - var8 * var14)).Y((double)var11, (double)var13).m(this.N, this.F, this.V, 1.0F).C(var19, var20).W();
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class p implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new e(var2, var3, var5, var7, net.nb.j.P);
      }
   }

   public static class r implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         int[] var16 = x.f();
         int var17 = var15.length > 1?var15[1]:0;
         return new e(var2, var3, var5, var7, var9, var11, var13, net.n0.y.k(var15[0]), var17);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class t implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new e(var2, var3, var5, var7, net.nb.j.f);
      }
   }
}
