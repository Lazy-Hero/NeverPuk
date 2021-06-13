package net.ye;

import net.xn;
import net.y0.ct;
import net.ye.p;
import net.ye.wr;

public class h implements wr {
   private final ct h;

   public h(ct var1) {
      this.h = var1;
   }

   public void M(net.yy.f var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = p.j();
      if("deadmau5".equals(var1.Q()) && var1.T8() && !var1.e()) {
         this.h.i(var1.g());
         int var10 = 0;
         float var11 = var1.hq + (var1.hN - var1.hq) * var4 - (var1.Az + (var1.AK - var1.Az) * var4);
         float var12 = var1.d + (var1.V - var1.d) * var4;
         net.y.d.c();
         net.y.d.P(var11, 0.0F, 1.0F, 0.0F);
         net.y.d.P(var12, 1.0F, 0.0F, 0.0F);
         net.y.d.O(0.375F * (float)(var10 * 2 - 1), 0.0F, 0.0F);
         net.y.d.O(0.0F, -0.375F, 0.0F);
         net.y.d.P(-var12, 1.0F, 0.0F, 0.0F);
         net.y.d.P(-var11, 0.0F, 1.0F, 0.0F);
         float var10000 = 1.3333334F;
         net.y.d.W(1.3333334F, 1.3333334F, 1.3333334F);
         this.h.w().H(0.0625F);
         net.y.d.Y();
         ++var10;
      }

   }

   public boolean y() {
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
