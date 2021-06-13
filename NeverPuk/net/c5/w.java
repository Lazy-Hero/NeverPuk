package net.c5;

import net.xn;
import net.c5.c;
import net.c5.e;
import net.c5.m;
import net.n0.kw;
import net.y.d;
import net.yz.m_;

public class w extends c {
   private static final m_ d = new m_("textures/entity/end_gateway_beam.png");

   public void e(net.ni.c var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      d.V();
      e.F();
      net.ni.z var12 = (net.ni.z)var1;
      if(var12.I() || var12.O()) {
         d.d(516, 0.1F);
         this.L(d);
         float var13 = var12.I()?var12.I(var8):var12.o(var8);
         double var14 = var12.I()?256.0D - var4:50.0D;
         var13 = net.u.t.A(var13 * 3.1415927F);
         int var16 = net.u.t.L((double)var13 * var14);
         float[] var17 = var12.I()?kw.MAGENTA.H():kw.PURPLE.H();
         m.l(var2, var4, var6, (double)var8, (double)var13, (double)var12.B().y(), 0, var16, var17, 0.15D, 0.175D);
         m.l(var2, var4, var6, (double)var8, (double)var13, (double)var12.B().y(), 0, -var16, var17, 0.15D, 0.175D);
      }

      super.e(var1, var2, var4, var6, var8, var9, var10);
      d.p();
   }

   protected int g(double var1) {
      return super.g(var1) + 1;
   }

   protected float H() {
      return 1.0F;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
