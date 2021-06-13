package net.yh;

import net.xn;
import net.y.u1;
import net.yh.c;
import net.yh.x;
import net.yz.m_;

public class cm extends x {
   private static final m_ d = new m_("textures/entity/sweep.png");
   private static final net.y8.q P = (new net.y8.q()).k(net.y8.x.J).k(net.y8.x.X).k(net.y8.x.q).k(net.y8.x.f).k(net.y8.x.G).k(net.y8.x.S);
   private int q;
   private final int f;
   private final net.n9.e j;
   private final float v;

   protected cm(net.n9.e var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      super(var2, var3, var5, var7, 0.0D, 0.0D, 0.0D);
      this.j = var1;
      this.f = 4;
      float var15 = this.k.nextFloat() * 0.6F + 0.4F;
      this.N = var15;
      this.F = var15;
      this.V = var15;
      this.v = 1.0F - (float)var9 * 0.5F;
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      x.f();
      int var10 = (int)(((float)this.q + var3) * 3.0F / (float)this.f);
      if(var10 <= 7) {
         this.j.E(d);
         float var11 = (float)(var10 % 4) / 4.0F;
         float var12 = var11 + 0.24975F;
         float var13 = (float)(var10 / 2) / 2.0F;
         float var14 = var13 + 0.4995F;
         float var15 = 1.0F * this.v;
         float var16 = (float)(this.i + (this.K - this.i) * (double)var3 - X);
         float var17 = (float)(this.m + (this.C - this.m) * (double)var3 - z);
         float var18 = (float)(this.O + (this.A - this.O) * (double)var3 - U);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         net.y.d.i();
         u1.m();
         var1.m(7, P);
         var1.H((double)(var16 - var4 * var15 - var7 * var15), (double)(var17 - var5 * var15 * 0.5F), (double)(var18 - var6 * var15 - var8 * var15)).Y((double)var12, (double)var14).m(this.N, this.F, this.V, 1.0F).C(0, 240).d(0.0F, 1.0F, 0.0F).W();
         var1.H((double)(var16 - var4 * var15 + var7 * var15), (double)(var17 + var5 * var15 * 0.5F), (double)(var18 - var6 * var15 + var8 * var15)).Y((double)var12, (double)var13).m(this.N, this.F, this.V, 1.0F).C(0, 240).d(0.0F, 1.0F, 0.0F).W();
         var1.H((double)(var16 + var4 * var15 + var7 * var15), (double)(var17 + var5 * var15 * 0.5F), (double)(var18 + var6 * var15 + var8 * var15)).Y((double)var11, (double)var13).m(this.N, this.F, this.V, 1.0F).C(0, 240).d(0.0F, 1.0F, 0.0F).W();
         var1.H((double)(var16 + var4 * var15 - var7 * var15), (double)(var17 - var5 * var15 * 0.5F), (double)(var18 + var6 * var15 - var8 * var15)).Y((double)var11, (double)var14).m(this.N, this.F, this.V, 1.0F).C(0, 240).d(0.0F, 1.0F, 0.0F).W();
         net.y.r.f().p();
         net.y.d.K();
      }

   }

   public int g(float var1) {
      return '\uf0f0';
   }

   public void f() {
      x.f();
      this.i = this.K;
      this.m = this.C;
      this.O = this.A;
      ++this.q;
      if(this.q == this.f) {
         this.Z();
      }

   }

   public int n() {
      return 3;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class q implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new cm(net.nn.j.b().n(), var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
