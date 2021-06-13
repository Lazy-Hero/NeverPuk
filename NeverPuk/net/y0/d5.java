package net.y0;

import net.xn;
import net.y0.d;
import net.y0.l;
import net.y6.et;
import net.yz.m_;

public class d5 extends l {
   private static final m_ c = new m_("textures/entity/cat/black.png");
   private static final m_ I = new m_("textures/entity/cat/ocelot.png");
   private static final m_ n = new m_("textures/entity/cat/red.png");
   private static final m_ i = new m_("textures/entity/cat/siamese.png");

   public d5(d var1) {
      super(var1, new et(), 0.4F);
   }

   protected m_ u(net.yn.g var1) {
      switch(var1.E()) {
      case 0:
      default:
         return I;
      case 1:
         return c;
      case 2:
         return n;
      case 3:
         return i;
      }
   }

   protected void t(net.yn.g var1, float var2) {
      super.N(var1, var2);
      if(var1.D()) {
         net.y.d.W(0.8F, 0.8F, 0.8F);
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
