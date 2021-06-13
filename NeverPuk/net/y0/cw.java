package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.yz.m_;

public class cw extends c {
   public cw(d var1) {
      super(var1);
      this.W = 0.5F;
   }

   public void U(net.nm.k var1, double var2, double var4, double var6, float var8, float var9) {
      c.q();
      net.y.k var11 = net.nn.j.b().x();
      net.y.d.c();
      net.y.d.O((float)var2, (float)var4 + 0.5F, (float)var6);
      if((float)var1.z() - var9 + 1.0F < 10.0F) {
         float var12 = 1.0F - ((float)var1.z() - var9 + 1.0F) / 10.0F;
         var12 = net.u.t.T(var12, 0.0F, 1.0F);
         var12 = var12 * var12;
         var12 = var12 * var12;
         float var13 = 1.0F + var12 * 0.3F;
         net.y.d.W(var13, var13, var13);
      }

      float var17 = (1.0F - ((float)var1.z() - var9 + 1.0F) / 100.0F) * 0.8F;
      this.j(var1);
      net.y.d.P(-90.0F, 0.0F, 1.0F, 0.0F);
      net.y.d.O(-0.5F, -0.5F, 0.5F);
      var11.M(net.nb.f.T7.p(), var1.d());
      net.y.d.O(0.0F, 0.0F, 1.0F);
      if(this.g) {
         net.y.d.G();
         net.y.d.o(this.B(var1));
         var11.M(net.nb.f.T7.p(), 1.0F);
         net.y.d.o();
         net.y.d.e();
      }

      if(var1.z() / 5 % 2 == 0) {
         net.y.d.w();
         net.y.d.i();
         net.y.d.C();
         net.y.d.m(net.y.d.SRC_ALPHA, net.y.d.DST_ALPHA);
         net.y.d.T(1.0F, 1.0F, 1.0F, var17);
         net.y.d.x(-3.0F, -3.0F);
         net.y.d.y();
         var11.M(net.nb.f.T7.p(), 1.0F);
         net.y.d.x(0.0F, 0.0F);
         net.y.d.x();
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         net.y.d.E();
         net.y.d.K();
         net.y.d.S();
      }

      net.y.d.Y();
      super.w(var1, var2, var4, var6, var8, var9);
   }

   protected m_ J(net.nm.k var1) {
      return net.n9.b.N;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
