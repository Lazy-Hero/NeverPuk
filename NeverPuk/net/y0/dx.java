package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y0.l;
import net.yz.m_;

public class dx extends l {
   private static final m_ V = new m_("textures/entity/creeper/creeper.png");

   public dx(d var1) {
      super(var1, new net.y6.l(), 0.5F);
      this.k(new net.ye.i(this));
   }

   protected void t(net.nk.m var1, float var2) {
      float var3 = var1.e(var2);
      float var4 = 1.0F + net.u.t.A(var3 * 100.0F) * var3 * 0.01F;
      var3 = net.u.t.T(var3, 0.0F, 1.0F);
      var3 = var3 * var3;
      var3 = var3 * var3;
      float var5 = (1.0F + var3 * 0.4F) * var4;
      float var6 = (1.0F + var3 * 0.1F) / var4;
      net.y.d.W(var5, var6, var5);
   }

   protected int M(net.nk.m var1, float var2, float var3) {
      c.q();
      float var5 = var1.e(var3);
      if((int)(var5 * 10.0F) % 2 == 0) {
         return 0;
      } else {
         int var6 = (int)(var5 * 0.2F * 255.0F);
         var6 = net.u.t.g(var6, 0, 255);
         return var6 << 24 | 822083583;
      }
   }

   protected m_ l(net.nk.m var1) {
      return V;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
