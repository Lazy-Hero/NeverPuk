package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;

public abstract class v extends c {
   public v(d var1) {
      super(var1);
   }

   public void E(net.n1.o var1, double var2, double var4, double var6, float var8, float var9) {
      this.j(var1);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      net.y.d.c();
      net.y.d.i();
      net.y.d.O((float)var2, (float)var4, (float)var6);
      net.y.d.P(var1.hq + (var1.hN - var1.hq) * var9 - 90.0F, 0.0F, 1.0F, 0.0F);
      net.y.d.P(var1.d + (var1.V - var1.d) * var9, 0.0F, 0.0F, 1.0F);
      net.y.r var11 = net.y.r.f();
      net.y.p var12 = var11.k();
      boolean var10000 = false;
      float var27 = 0.0F;
      c.C();
      float var10001 = 0.5F;
      var10001 = 0.0F;
      var10001 = 0.15625F;
      var10001 = 0.0F;
      var27 = 0.15625F;
      var27 = 0.15625F;
      var27 = 0.3125F;
      var27 = 0.05625F;
      net.y.d.F();
      float var23 = (float)var1.kB - var9;
      if(Float.compare(var23, 0.0F) > 0) {
         float var24 = -net.u.t.A(var23 * 3.0F) * var23;
         net.y.d.P(var24, 0.0F, 0.0F, 1.0F);
      }

      net.y.d.P(45.0F, 1.0F, 0.0F, 0.0F);
      net.y.d.W(0.05625F, 0.05625F, 0.05625F);
      net.y.d.O(-4.0F, 0.0F, 0.0F);
      if(this.g) {
         net.y.d.G();
         net.y.d.o(this.B(var1));
      }

      net.y.d.b(0.05625F, 0.0F, 0.0F);
      var12.m(7, net.y8.x.H);
      var12.H(-7.0D, -2.0D, -2.0D).Y(0.0D, 0.15625D).W();
      var12.H(-7.0D, -2.0D, 2.0D).Y(0.15625D, 0.15625D).W();
      var12.H(-7.0D, 2.0D, 2.0D).Y(0.15625D, 0.3125D).W();
      var12.H(-7.0D, 2.0D, -2.0D).Y(0.0D, 0.3125D).W();
      var11.p();
      net.y.d.b(-0.05625F, 0.0F, 0.0F);
      var12.m(7, net.y8.x.H);
      var12.H(-7.0D, 2.0D, -2.0D).Y(0.0D, 0.15625D).W();
      var12.H(-7.0D, 2.0D, 2.0D).Y(0.15625D, 0.15625D).W();
      var12.H(-7.0D, -2.0D, 2.0D).Y(0.15625D, 0.3125D).W();
      var12.H(-7.0D, -2.0D, -2.0D).Y(0.0D, 0.3125D).W();
      var11.p();
      int var25 = 0;
      net.y.d.P(90.0F, 1.0F, 0.0F, 0.0F);
      net.y.d.b(0.0F, 0.0F, 0.05625F);
      var12.m(7, net.y8.x.H);
      var12.H(-8.0D, -2.0D, 0.0D).Y(0.0D, 0.0D).W();
      var12.H(8.0D, -2.0D, 0.0D).Y(0.5D, 0.0D).W();
      var12.H(8.0D, 2.0D, 0.0D).Y(0.5D, 0.15625D).W();
      var12.H(-8.0D, 2.0D, 0.0D).Y(0.0D, 0.15625D).W();
      var11.p();
      ++var25;
      if(this.g) {
         net.y.d.o();
         net.y.d.e();
      }

      net.y.d.g();
      net.y.d.K();
      net.y.d.Y();
      super.w(var1, var2, var4, var6, var8, var9);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
