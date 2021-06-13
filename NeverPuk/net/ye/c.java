package net.ye;

import net.ye.wr;
import net.yz.m_;

public class c implements wr {
   private static final m_ y = new m_("textures/entity/skeleton/stray_overlay.png");
   private final net.y0.o O;
   private final net.y6.w k = new net.y6.w(0.25F, true);

   public c(net.y0.o var1) {
      this.O = var1;
   }

   public void l(net.nk.s var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.k.q(this.O.v());
      this.k.x(var1, var2, var3, var4);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.O.i(y);
      this.k.V(var1, var2, var3, var5, var6, var7, var8);
   }

   public boolean y() {
      return true;
   }
}
