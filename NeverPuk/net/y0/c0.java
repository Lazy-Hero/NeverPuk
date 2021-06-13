package net.y0;

import net.y0.d;
import net.y0.l;
import net.y6.eq;
import net.yz.m_;

public class c0 extends l {
   private static final m_ b = new m_("textures/entity/squid.png");

   public c0(d var1) {
      super(var1, new eq(), 0.7F);
   }

   protected m_ l(net.yn.m var1) {
      return b;
   }

   protected void R(net.yn.m var1, float var2, float var3, float var4) {
      float var5 = var1.Dn + (var1.De - var1.Dn) * var4;
      float var6 = var1.DC + (var1.Dh - var1.DC) * var4;
      net.y.d.O(0.0F, 0.5F, 0.0F);
      net.y.d.P(180.0F - var3, 0.0F, 1.0F, 0.0F);
      net.y.d.P(var5, 1.0F, 0.0F, 0.0F);
      net.y.d.P(var6, 0.0F, 1.0F, 0.0F);
      net.y.d.O(0.0F, -1.2F, 0.0F);
   }

   protected float N(net.yn.m var1, float var2) {
      return var1.D0 + (var1.Dd - var1.D0) * var2;
   }
}
