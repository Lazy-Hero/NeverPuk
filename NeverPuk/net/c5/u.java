package net.c5;

import net.xn;
import net.c5.e;
import net.y.d;
import net.yz.m_;

public class u extends e {
   private static final m_ q = new m_("textures/entity/chest/ender.png");
   private final net.y6.m P = new net.y6.m();

   public void j(net.ni.n var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      e.F();
      int var12 = 0;
      if(var1.j()) {
         var12 = var1.B();
      }

      if(var9 >= 0) {
         this.L(L[var9]);
         d.G(5890);
         d.c();
         d.W(4.0F, 4.0F, 1.0F);
         d.O(0.0625F, 0.0625F, 0.0625F);
         d.G(5888);
      }

      this.L(q);
      d.c();
      d.F();
      d.T(1.0F, 1.0F, 1.0F, var10);
      d.O((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
      d.W(1.0F, -1.0F, -1.0F);
      d.O(0.5F, 0.5F, 0.5F);
      byte var13 = 0;
      d.P((float)var13, 0.0F, 1.0F, 0.0F);
      d.O(-0.5F, -0.5F, -0.5F);
      float var14 = var1.G + (var1.N - var1.G) * var8;
      var14 = 1.0F - var14;
      var14 = 1.0F - var14 * var14 * var14;
      this.P.p.b = -(var14 * 1.5707964F);
      this.P.x();
      d.g();
      d.Y();
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      if(var9 >= 0) {
         d.G(5890);
         d.Y();
         d.G(5888);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
