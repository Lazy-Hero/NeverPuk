package net.y0;

import net.nk.fu;
import net.y0.d;
import net.y0.dm;
import net.yz.m_;

public class de extends dm {
   private static final m_ n = new m_("textures/entity/zombie/husk.png");

   public de(d var1) {
      super(var1);
   }

   protected void s(fu var1, float var2) {
      float var10000 = 1.0625F;
      net.y.d.W(1.0625F, 1.0625F, 1.0625F);
      super.N(var1, var2);
   }

   protected m_ f(fu var1) {
      return n;
   }
}
