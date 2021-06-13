package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y0.l;
import net.y6.er;
import net.yz.m_;

public class ca extends l {
   private static final m_ w = new m_("textures/entity/wolf/wolf.png");
   private static final m_ X = new m_("textures/entity/wolf/wolf_tame.png");
   private static final m_ u = new m_("textures/entity/wolf/wolf_angry.png");

   public ca(d var1) {
      super(var1, new er(), 0.5F);
      this.k(new net.ye.k(this));
   }

   protected float c(net.yn.x var1, float var2) {
      return var1.o();
   }

   public void S(net.yn.x var1, double var2, double var4, double var6, float var8, float var9) {
      boolean var10 = c.C();
      if(var1.dT()) {
         float var11 = var1.d() * var1.I(var9);
         net.y.d.Z(var11, var11, var11);
      }

      super.C(var1, var2, var4, var6, var8, var9);
   }

   protected m_ l(net.yn.x var1) {
      boolean var2 = c.C();
      return var1.D()?X:(var1.d9()?u:w);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
