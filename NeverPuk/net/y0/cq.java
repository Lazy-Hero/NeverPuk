package net.y0;

import net.xn;
import net.y0.d;
import net.y0.l;
import net.y6.e3;
import net.yz.aa;
import net.yz.m_;

public class cq extends l {
   private static final m_ I = new m_("textures/entity/illager/vindicator.png");

   public cq(d var1) {
      super(var1, new e3(0.0F, 0.0F, 64, 64), 0.5F);
      this.k(new net.ye.s(this) {
         public void t(net.ne.a var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
            if(((net.nk.h)var1).UO()) {
               super.t(var1, var2, var3, var4, var5, var6, var7, var8);
            }

         }

         protected void G(aa var1) {
            ((e3)this.c.v()).V(var1).I(0.0625F);
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   public void R(net.nk.i var1, double var2, double var4, double var6, float var8, float var9) {
      super.C(var1, var2, var4, var6, var8, var9);
   }

   protected m_ f(net.nk.i var1) {
      return I;
   }

   protected void H(net.nk.i var1, float var2) {
      float var10000 = 0.9375F;
      net.y.d.W(0.9375F, 0.9375F, 0.9375F);
   }
}
