package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y0.l;
import net.y6.e3;
import net.yz.aa;
import net.yz.m_;

public class d_ extends l {
   private static final m_ N = new m_("textures/entity/illager/illusionist.png");

   public d_(d var1) {
      super(var1, new e3(0.0F, 0.0F, 64, 64), 0.5F);
      this.k(new net.ye.s(this) {
         public void t(net.ne.a var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
            boolean var9 = c.C();
            if(((net.nk.w)var1).k8() || ((net.nk.w)var1).ak()) {
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
      ((e3)this.v()).E.B = true;
   }

   protected m_ b(net.nk.i var1) {
      return N;
   }

   protected void n(net.nk.i var1, float var2) {
      float var10000 = 0.9375F;
      net.y.d.W(0.9375F, 0.9375F, 0.9375F);
   }

   public void k(net.nk.i var1, double var2, double var4, double var6, float var8, float var9) {
      boolean var10 = c.q();
      if(var1.e()) {
         net.u.r[] var11 = ((net.nk.w)var1).N(var9);
         float var12 = this.z(var1, var9);
         int var13 = 0;
         if(var13 < var11.length) {
            super.C(var1, var2 + var11[var13].p + (double)net.u.t.m((float)var13 + var12 * 0.5F) * 0.025D, var4 + var11[var13].H + (double)net.u.t.m((float)var13 + var12 * 0.75F) * 0.0125D, var6 + var11[var13].a + (double)net.u.t.m((float)var13 + var12 * 0.7F) * 0.025D, var8, var9);
            ++var13;
         }
      }

      super.C(var1, var2, var4, var6, var8, var9);
   }

   public void c(net.nk.i var1, double var2, double var4, double var6) {
      super.p(var1, var2, var4, var6);
   }

   protected boolean v(net.nk.i var1) {
      return true;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
