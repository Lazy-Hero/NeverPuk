package net.ye;

import net.oz;
import net.xn;
import net.z9;
import net.y.ui;
import net.y0.ds;
import net.ye.p;
import net.ye.wr;
import net.yz.m_;

public class n implements wr {
   private static final m_ n = new m_("textures/entity/enderman/enderman_eyes.png");
   private final ds u;

   public n(ds var1) {
      this.u = var1;
   }

   public void C(net.nk.u var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var10000 = p.l();
      this.u.i(n);
      net.y.d.C();
      int var9 = var10000;
      net.y.d.d();
      net.y.d.m(net.y.d.ONE, net.y.d.ONE);
      net.y.d.i();
      net.y.d.Y(!var1.e());
      var10000 = 61680;
      var10000 = 61680;
      var10000 = 0;
      ui.c(ui.w, 61680.0F, 0.0F);
      net.y.d.K();
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      net.nn.j.b().s4.I(true);
      if(z9.Q()) {
         oz.n7();
      }

      z9.F().KE = true;
      this.u.r().V(var1, var2, var3, var5, var6, var7, var8);
      z9.F().KE = false;
      if(z9.Q()) {
         oz.v();
      }

      net.nn.j.b().s4.I(false);
      this.u.I(var1);
      net.y.d.Y(true);
      net.y.d.E();
      net.y.d.m();
      if(net.u.d.y() == null) {
         ++var9;
         p.B(var9);
      }

   }

   public boolean y() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
