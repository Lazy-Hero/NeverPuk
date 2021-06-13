package net.y0;

import net.xn;
import net.y0.c;
import net.y0.cu;
import net.y0.d;

public class c2 extends cu {
   public c2(d var1) {
      super(var1);
   }

   protected void p(net.nm.m var1, float var2, net.yw.n var3) {
      c.q();
      int var5 = var1.W();
      if(var5 > -1 && Float.compare((float)var5 - var2 + 1.0F, 10.0F) < 0) {
         float var6 = 1.0F - ((float)var5 - var2 + 1.0F) / 10.0F;
         var6 = net.u.t.T(var6, 0.0F, 1.0F);
         var6 = var6 * var6;
         var6 = var6 * var6;
         float var7 = 1.0F + var6 * 0.3F;
         net.y.d.W(var7, var7, var7);
      }

      super.M(var1, var2, var3);
      if(var5 > -1 && var5 / 5 % 2 == 0) {
         net.y.k var11 = net.nn.j.b().x();
         net.y.d.w();
         net.y.d.i();
         net.y.d.C();
         net.y.d.m(net.y.d.SRC_ALPHA, net.y.d.DST_ALPHA);
         net.y.d.T(1.0F, 1.0F, 1.0F, (1.0F - ((float)var5 - var2 + 1.0F) / 100.0F) * 0.8F);
         net.y.d.c();
         var11.M(net.nb.f.T7.p(), 1.0F);
         net.y.d.Y();
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         net.y.d.E();
         net.y.d.K();
         net.y.d.S();
      }

   }

   private static xn c(xn var0) {
      return var0;
   }
}
