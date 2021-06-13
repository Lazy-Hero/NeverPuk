package net.y0;

import net.y0.d;
import net.y0.l;
import net.yz.m_;

public class y extends l {
   private static final m_ v = new m_("textures/entity/steve.png");

   public y(d var1, net.y6.t var2, float var3) {
      super(var1, var2, var3);
      this.k(new net.ye.w(var2.G));
      this.k(new net.ye.z(this));
      this.k(new net.ye.s(this));
   }

   protected m_ N(net.ne.y var1) {
      return v;
   }

   public void E() {
      net.y.d.O(0.0F, 0.1875F, 0.0F);
   }
}
