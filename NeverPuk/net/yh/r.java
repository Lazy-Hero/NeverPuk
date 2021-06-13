package net.yh;

import net.yh.c;
import net.yh.x;

public class r extends x {
   protected r(net.yv.r var1, double var2, double var4, double var6, net.n0.y var8) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.p(net.nn.j.b().K().k().Q(var8));
      this.N = 1.0F;
      this.F = 1.0F;
      this.V = 1.0F;
      this.B = 0.0D;
      this.R = 0.0D;
      this.L = 0.0D;
      this.u = 0.0F;
      this.a = 80;
   }

   public int n() {
      return 1;
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = this.t.q();
      float var10 = this.t.o();
      float var11 = this.t.n();
      float var12 = this.t.r();
      float var10000 = 0.5F;
      float var14 = (float)(this.i + (this.K - this.i) * (double)var3 - X);
      float var15 = (float)(this.m + (this.C - this.m) * (double)var3 - z);
      float var16 = (float)(this.O + (this.A - this.O) * (double)var3 - U);
      int var17 = this.g(var3);
      int var18 = var17 >> 16 & '\uffff';
      int var19 = var17 & '\uffff';
      var1.H((double)(var14 - var4 * 0.5F - var7 * 0.5F), (double)(var15 - var5 * 0.5F), (double)(var16 - var6 * 0.5F - var8 * 0.5F)).Y((double)var10, (double)var12).m(this.N, this.F, this.V, 1.0F).C(var18, var19).W();
      var1.H((double)(var14 - var4 * 0.5F + var7 * 0.5F), (double)(var15 + var5 * 0.5F), (double)(var16 - var6 * 0.5F + var8 * 0.5F)).Y((double)var10, (double)var11).m(this.N, this.F, this.V, 1.0F).C(var18, var19).W();
      var1.H((double)(var14 + var4 * 0.5F + var7 * 0.5F), (double)(var15 + var5 * 0.5F), (double)(var16 + var6 * 0.5F + var8 * 0.5F)).Y((double)var9, (double)var11).m(this.N, this.F, this.V, 1.0F).C(var18, var19).W();
      var1.H((double)(var14 + var4 * 0.5F - var7 * 0.5F), (double)(var15 - var5 * 0.5F), (double)(var16 + var6 * 0.5F - var8 * 0.5F)).Y((double)var9, (double)var12).m(this.N, this.F, this.V, 1.0F).C(var18, var19).W();
   }

   public static class k implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new r(var2, var3, var5, var7, net.n0.y.q(net.nb.f.dr));
      }
   }
}
