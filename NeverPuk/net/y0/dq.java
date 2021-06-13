package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y0.y;
import net.yz.m_;

public class dq extends y {
   private static final m_ T = new m_("textures/entity/illager/vex.png");
   private static final m_ z = new m_("textures/entity/illager/vex_charging.png");
   private int u;

   public dq(d var1) {
      super(var1, new net.y6.b(), 0.3F);
      this.u = ((net.y6.b)this.y).w();
   }

   protected m_ N(net.nk.t var1) {
      return var1.as()?z:T;
   }

   public void W(net.nk.t var1, double var2, double var4, double var6, float var8, float var9) {
      c.C();
      int var11 = ((net.y6.b)this.y).w();
      if(var11 != this.u) {
         this.y = new net.y6.b();
         this.u = var11;
      }

      super.C(var1, var2, var4, var6, var8, var9);
   }

   protected void z(net.nk.t var1, float var2) {
      net.y.d.W(0.4F, 0.4F, 0.4F);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
