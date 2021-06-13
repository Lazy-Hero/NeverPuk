package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;
import net.yz.m_;

public class i extends x {
   private static final m_ Z = new m_("textures/particle/footprint.png");
   private int q;
   private final int J;
   private final net.n9.e v;

   protected i(net.n9.e var1, net.yv.r var2, double var3, double var5, double var7) {
      super(var2, var3, var5, var7, 0.0D, 0.0D, 0.0D);
      this.v = var1;
      this.B = 0.0D;
      this.R = 0.0D;
      this.L = 0.0D;
      this.J = 200;
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var10 = ((float)this.q + var3) / (float)this.J;
      var10 = var10 * var10;
      x.f();
      float var11 = 2.0F - var10 * 2.0F;
      if(var11 > 1.0F) {
         var11 = 1.0F;
      }

      var11 = var11 * 0.2F;
      net.y.d.i();
      float var10000 = 0.125F;
      float var13 = (float)(this.K - X);
      float var14 = (float)(this.C - z);
      float var15 = (float)(this.A - U);
      float var16 = this.e.u(new net.u.j(this.K, this.C, this.A));
      this.v.E(Z);
      net.y.d.C();
      net.y.d.m(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA);
      var1.m(7, net.y8.x.r);
      var1.H((double)(var13 - 0.125F), (double)var14, (double)(var15 + 0.125F)).Y(0.0D, 1.0D).m(var16, var16, var16, var11).W();
      var1.H((double)(var13 + 0.125F), (double)var14, (double)(var15 + 0.125F)).Y(1.0D, 1.0D).m(var16, var16, var16, var11).W();
      var1.H((double)(var13 + 0.125F), (double)var14, (double)(var15 - 0.125F)).Y(1.0D, 0.0D).m(var16, var16, var16, var11).W();
      var1.H((double)(var13 - 0.125F), (double)var14, (double)(var15 - 0.125F)).Y(0.0D, 0.0D).m(var16, var16, var16, var11).W();
      net.y.r.f().p();
      net.y.d.E();
      net.y.d.K();
   }

   public void f() {
      x.f();
      ++this.q;
      if(this.q == this.J) {
         this.Z();
      }

   }

   public int n() {
      return 3;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class e implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new i(net.nn.j.b().n(), var2, var3, var5, var7);
      }
   }
}
