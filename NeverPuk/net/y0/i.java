package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y0.l;
import net.yz.m_;

public class i extends l {
   private static final m_ c = new m_("textures/entity/bat.png");

   public i(d var1) {
      super(var1, new net.y6.g(), 0.25F);
   }

   protected m_ V(net.yn.y var1) {
      return c;
   }

   protected void j(net.yn.y var1, float var2) {
      net.y.d.W(0.35F, 0.35F, 0.35F);
   }

   protected void X(net.yn.y var1, float var2, float var3, float var4) {
      boolean var5 = c.q();
      if(var1.D()) {
         net.y.d.O(0.0F, -0.1F, 0.0F);
      }

      net.y.d.O(0.0F, net.u.t.m(var2 * 0.3F) * 0.1F, 0.0F);
      super.o(var1, var2, var3, var4);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
