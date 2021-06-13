package net.y0;

import net.y0.d;
import net.y0.y;
import net.yz.m_;

public class n extends y {
   private static final m_ p = new m_("textures/entity/skeleton/skeleton.png");

   public n(d var1) {
      super(var1, new net.y6.w(), 0.5F);
      this.k(new net.ye.s(this));
      this.k(new net.ye.d(this) {
         protected void H() {
            this.W = new net.y6.w(0.5F, true);
            this.z = new net.y6.w(1.0F, true);
         }
      });
   }

   public void E() {
      net.y.d.O(0.09375F, 0.1875F, 0.0F);
   }

   protected m_ n(net.nk.q var1) {
      return p;
   }
}
