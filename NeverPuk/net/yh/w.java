package net.yh;

import net.y.ui;
import net.yh.c;
import net.yh.x;

public class w extends x {
   private net.ne.a P;

   protected w(net.yv.r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.N = 1.0F;
      this.F = 1.0F;
      this.V = 1.0F;
      this.B = 0.0D;
      this.R = 0.0D;
      this.L = 0.0D;
      this.u = 0.0F;
      this.a = 30;
   }

   public int n() {
      return 3;
   }

   public void f() {
      super.f();
      if(this.P == null) {
         net.nk.l var1 = new net.nk.l(this.e);
         var1.H();
         this.P = var1;
      }

   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if(this.P != null) {
         net.y0.d var9 = net.nn.j.b().N();
         var9.W(x.X, x.z, x.U);
         float var10000 = 0.42553192F;
         float var11 = ((float)this.x + var3) / (float)this.a;
         net.y.d.Y(true);
         net.y.d.C();
         net.y.d.B();
         net.y.d.m(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA);
         var10000 = 240.0F;
         ui.c(ui.w, 240.0F, 240.0F);
         net.y.d.c();
         float var13 = 0.05F + 0.5F * net.u.t.A(var11 * 3.1415927F);
         net.y.d.T(1.0F, 1.0F, 1.0F, var13);
         net.y.d.O(0.0F, 1.8F, 0.0F);
         net.y.d.P(180.0F - var2.hN, 0.0F, 1.0F, 0.0F);
         net.y.d.P(60.0F - 150.0F * var11 - var2.V, 1.0F, 0.0F, 0.0F);
         net.y.d.O(0.0F, -0.4F, -1.5F);
         net.y.d.W(0.42553192F, 0.42553192F, 0.42553192F);
         this.P.hN = 0.0F;
         this.P.A3 = 0.0F;
         this.P.hq = 0.0F;
         this.P.AH = 0.0F;
         var9.D(this.P, 0.0D, 0.0D, 0.0D, 0.0F, var3, false);
         net.y.d.Y();
         net.y.d.B();
      }

   }

   public static class d implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new w(var2, var3, var5, var7);
      }
   }
}
