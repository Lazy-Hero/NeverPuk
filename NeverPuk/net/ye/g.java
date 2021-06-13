package net.ye;

import net.xn;
import net.y0.di;
import net.y6.ew;
import net.ye.p;
import net.ye.wr;
import net.yz.m_;

public class g implements wr {
   private static final m_ L = new m_("textures/entity/pig/pig_saddle.png");
   private final di J;
   private final ew h = new ew(0.5F);

   public g(di var1) {
      this.J = var1;
   }

   public void Q(net.yn.u var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = p.j();
      if(var1.sv()) {
         this.J.i(L);
         this.h.q(this.J.v());
         this.h.V(var1, var2, var3, var5, var6, var7, var8);
      }

   }

   public boolean y() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
