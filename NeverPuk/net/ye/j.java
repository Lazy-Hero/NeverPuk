package net.ye;

import net.oz;
import net.xn;
import net.z9;
import net.y.ui;
import net.y0.d2;
import net.ye.p;
import net.ye.wr;
import net.yz.m_;

public class j implements wr {
   private static final m_ e = new m_("textures/entity/enderdragon/dragon_eyes.png");
   private final d2 k;

   public j(d2 var1) {
      this.k = var1;
   }

   public void z(net.a.t var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.k.i(e);
      net.y.d.C();
      net.y.d.d();
      p.j();
      net.y.d.m(net.y.d.ONE, net.y.d.ONE);
      net.y.d.i();
      net.y.d.n(514);
      char var10001 = '\uf0f0';
      var10001 = '\uf0f0';
      boolean var10000 = false;
      ui.c(ui.w, 61680.0F, 0.0F);
      net.y.d.K();
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      net.nn.j.b().s4.I(true);
      if(z9.Q()) {
         oz.n7();
      }

      z9.F().KE = true;
      this.k.v().V(var1, var2, var3, var5, var6, var7, var8);
      z9.F().KE = false;
      if(z9.Q()) {
         oz.v();
      }

      net.nn.j.b().s4.I(false);
      this.k.I(var1);
      net.y.d.E();
      net.y.d.m();
      net.y.d.n(515);
   }

   public boolean y() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
