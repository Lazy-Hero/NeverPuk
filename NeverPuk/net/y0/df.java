package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y0.l;
import net.y6.eg;
import net.yz.m_;

public class df extends l {
   private static final m_ e = new m_("textures/entity/iron_golem.png");

   public df(d var1) {
      super(var1, new eg(), 0.5F);
      this.k(new net.ye.t(this));
   }

   protected m_ k(net.nk.b var1) {
      return e;
   }

   protected void x(net.nk.b var1, float var2, float var3, float var4) {
      c.q();
      super.o(var1, var2, var3, var4);
      if((double)var1.Aq >= 0.01D) {
         float var10000 = 13.0F;
         float var7 = var1.A5 - var1.Aq * (1.0F - var4) + 6.0F;
         float var8 = (Math.abs(var7 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         net.y.d.P(6.5F * var8, 0.0F, 0.0F, 1.0F);
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
