package net.y0;

import net.xn;
import net.nk.fb;
import net.y0.d;
import net.y0.l;
import net.y6.eb;
import net.yz.m_;

public class d6 extends l {
   private static final m_ w = new m_("textures/entity/ghast/ghast.png");
   private static final m_ V = new m_("textures/entity/ghast/ghast_shooting.png");

   public d6(d var1) {
      super(var1, new eb(), 0.5F);
   }

   protected m_ g(fb var1) {
      return var1.D()?V:w;
   }

   protected void m(fb var1, float var2) {
      float var10000 = 1.0F;
      var10000 = 4.5F;
      var10000 = 4.5F;
      net.y.d.W(4.5F, 4.5F, 4.5F);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
