package net.ye;

import net.y.ui;
import net.y0.ds;
import net.ye.wr;

public class w3 implements wr {
   private final ds e;

   public w3(ds var1) {
      this.e = var1;
   }

   public void I(net.nk.u var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      net.yw.n var9 = var1.S();
      net.y.k var10 = net.nn.j.b().x();
      net.y.d.F();
      net.y.d.c();
      net.y.d.O(0.0F, 0.6875F, -0.75F);
      net.y.d.P(20.0F, 1.0F, 0.0F, 0.0F);
      net.y.d.P(45.0F, 0.0F, 1.0F, 0.0F);
      net.y.d.O(0.25F, 0.1875F, 0.25F);
      float var10000 = 0.5F;
      net.y.d.W(-0.5F, -0.5F, 0.5F);
      int var12 = var1.L();
      int var13 = var12 % 65536;
      int var14 = var12 / 65536;
      ui.c(ui.w, (float)var13, (float)var14);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.e.i(net.n9.b.N);
      var10.M(var9, 1.0F);
      net.y.d.Y();
      net.y.d.g();
   }

   public boolean y() {
      return false;
   }
}
