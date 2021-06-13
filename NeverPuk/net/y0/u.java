package net.y0;

import net.nk.f2;
import net.y0.d;
import net.y0.y;
import net.yz.m_;

public class u extends y {
   private static final m_ T = new m_("textures/entity/zombie_pigman.png");

   public u(d var1) {
      super(var1, new net.y6.s(), 0.5F);
      this.k(new net.ye.d(this) {
         protected void H() {
            this.W = new net.y6.s(0.5F, true);
            this.z = new net.y6.s(1.0F, true);
         }
      });
   }

   protected m_ P(f2 var1) {
      return T;
   }
}
