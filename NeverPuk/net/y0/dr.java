package net.y0;

import net.y0.d;
import net.y0.l;
import net.y6.ed;
import net.yz.m_;

public class dr extends l {
   private static final m_ E = new m_("textures/entity/bear/polarbear.png");

   public dr(d var1) {
      super(var1, new ed(), 0.7F);
   }

   protected m_ P(net.nk.f var1) {
      return E;
   }

   public void J(net.nk.f var1, double var2, double var4, double var6, float var8, float var9) {
      super.C(var1, var2, var4, var6, var8, var9);
   }

   protected void Z(net.nk.f var1, float var2) {
      net.y.d.W(1.2F, 1.2F, 1.2F);
      super.N(var1, var2);
   }
}
