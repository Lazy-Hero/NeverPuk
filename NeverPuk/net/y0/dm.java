package net.y0;

import net.nk.fu;
import net.y0.d;
import net.y0.y;
import net.yz.m_;

public class dm extends y {
   private static final m_ c = new m_("textures/entity/zombie/zombie.png");

   public dm(d var1) {
      super(var1, new net.y6.s(), 0.5F);
      net.ye.d var2 = new net.ye.d(this) {
         protected void H() {
            this.W = new net.y6.s(0.5F, true);
            this.z = new net.y6.s(1.0F, true);
         }
      };
      this.k(var2);
   }

   protected m_ f(fu var1) {
      return c;
   }
}
