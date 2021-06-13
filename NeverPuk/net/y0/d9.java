package net.y0;

import net.y0.d;
import net.y0.l;
import net.yz.m_;

public class d9 extends l {
   private static final m_ j = new m_("textures/entity/chicken.png");

   public d9(d var1) {
      super(var1, new net.y6.i(), 0.3F);
   }

   protected m_ c(net.yn.a var1) {
      return j;
   }

   protected float J(net.yn.a var1, float var2) {
      float var3 = var1.tk + (var1.tq - var1.tk) * var2;
      float var4 = var1.tz + (var1.ta - var1.tz) * var2;
      return (net.u.t.A(var3) + 1.0F) * var4;
   }
}
