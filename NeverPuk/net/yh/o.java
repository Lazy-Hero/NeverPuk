package net.yh;

import javax.annotation.Nullable;
import net.xn;
import net.yh.c;
import net.yh.x;

public class o extends x {
   private final net.yw.n o;
   private net.u.j v;

   protected o(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12, net.yw.n var14) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.o = var14;
      this.p(net.nn.j.b().x().a().I(var14));
      this.u = var14.Q().j;
      this.N = 0.6F;
      this.F = 0.6F;
      this.V = 0.6F;
      this.g /= 2.0F;
   }

   public o i(net.u.j var1) {
      this.v = var1;
      if(this.o.Q() == net.nb.f.p) {
         return this;
      } else {
         this.N(var1);
         return this;
      }
   }

   public o j() {
      x.f();
      this.v = new net.u.j(this.K, this.C, this.A);
      net.y9.l var2 = this.o.Q();
      if(var2 == net.nb.f.p) {
         return this;
      } else {
         this.N(this.v);
         return this;
      }
   }

   protected void N(@Nullable net.u.j var1) {
      int var2 = net.nn.j.b().q().I(this.o, this.e, var1, 0);
      this.N *= (float)(var2 >> 16 & 255) / 255.0F;
      this.F *= (float)(var2 >> 8 & 255) / 255.0F;
      this.V *= (float)(var2 & 255) / 255.0F;
   }

   public int n() {
      return 1;
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      x.f();
      float var10 = ((float)this.l + this.r / 4.0F) / 16.0F;
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
      if(net.u.d.y() == null) {
         x.e(new int[1]);
      }

   }

   public int g(float var1) {
      x.f();
      int var3 = super.g(var1);
      int var4 = 0;
      if(this.e.o(this.v)) {
         var4 = this.e.z(this.v, 0);
      }

      return var3 == 0?var4:var3;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class h implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return (new o(var2, var3, var5, var7, var9, var11, var13, net.y9.l.P(var15[0]))).j();
      }
   }
}
