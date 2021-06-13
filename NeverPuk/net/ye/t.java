package net.ye;

import net.y.ui;
import net.y0.df;
import net.y6.eg;
import net.ye.wr;

public class t implements wr {
   private final df F;

   public t(df var1) {
      this.F = var1;
   }

   public void J(net.nk.b var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if(var1.t() != 0) {
         net.y.k var9 = net.nn.j.b().x();
         net.y.d.F();
         net.y.d.c();
         net.y.d.P(5.0F + 180.0F * ((eg)this.F.v()).k.b / 3.1415927F, 1.0F, 0.0F, 0.0F);
         net.y.d.P(90.0F, 1.0F, 0.0F, 0.0F);
         net.y.d.O(-0.9375F, -0.625F, -0.9375F);
         float var10000 = 0.5F;
         net.y.d.W(0.5F, -0.5F, 0.5F);
         int var11 = var1.L();
         int var12 = var11 % 65536;
         int var13 = var11 / 65536;
         ui.c(ui.w, (float)var12, (float)var13);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         this.F.i(net.n9.b.N);
         var9.M(net.nb.f.d2.p(), 1.0F);
         net.y.d.Y();
         net.y.d.g();
      }

   }

   public boolean y() {
      return false;
   }
}
