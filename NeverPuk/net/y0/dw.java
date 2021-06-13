package net.y0;

import net.y0.d;
import net.y0.l;
import net.yz.m_;

public class dw extends l {
   private static final m_ z = new m_("textures/entity/zombie/zombie.png");
   private final float e;

   public dw(d var1, float var2) {
      super(var1, new net.y6.s(), 0.5F * var2);
      this.e = var2;
      this.k(new net.ye.s(this));
      this.k(new net.ye.d(this) {
         protected void H() {
            this.W = new net.y6.s(0.5F, true);
            this.z = new net.y6.s(1.0F, true);
         }
      });
   }

   public void E() {
      net.y.d.O(0.0F, 0.1875F, 0.0F);
   }

   protected void y(net.nk.v var1, float var2) {
      net.y.d.W(this.e, this.e, this.e);
   }

   protected m_ G(net.nk.v var1) {
      return z;
   }
}
