package net.y0;

import net.nk.f8;
import net.y0.d;
import net.y0.l;
import net.y6.ei;
import net.yz.m_;

public class dn extends l {
   private static final m_ p = new m_("textures/entity/slime/magmacube.png");

   public dn(d var1) {
      super(var1, new ei(), 0.25F);
   }

   protected m_ G(f8 var1) {
      return p;
   }

   protected void v(f8 var1, float var2) {
      int var3 = var1.A();
      float var4 = (var1.ur + (var1.uK - var1.ur) * var2) / ((float)var3 * 0.5F + 1.0F);
      float var5 = 1.0F / (var4 + 1.0F);
      net.y.d.W(var5 * (float)var3, 1.0F / var5 * (float)var3, var5 * (float)var3);
   }
}
