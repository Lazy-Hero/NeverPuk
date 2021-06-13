package net.y0;

import net.xn;
import net.nk.f_;
import net.y0.c;
import net.y0.d;
import net.y0.l;
import net.y6.ea;
import net.yz.m_;

public class cm extends l {
   private static final m_ O = new m_("textures/entity/witch.png");

   public cm(d var1) {
      super(var1, new ea(0.0F), 0.5F);
      this.k(new net.ye.o(this));
   }

   public ea W() {
      return (ea)super.v();
   }

   public void e(f_ var1, double var2, double var4, double var6, float var8, float var9) {
      boolean var10 = c.C();
      ((ea)this.y).h = !var1.S().B();
      super.C(var1, var2, var4, var6, var8, var9);
   }

   protected m_ y(f_ var1) {
      return O;
   }

   public void E() {
      net.y.d.O(0.0F, 0.1875F, 0.0F);
   }

   protected void t(f_ var1, float var2) {
      float var10000 = 0.9375F;
      net.y.d.W(0.9375F, 0.9375F, 0.9375F);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
