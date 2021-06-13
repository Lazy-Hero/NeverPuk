package net.ye;

import net.oz;
import net.xn;
import net.z9;
import net.y.ui;
import net.y0.dc;
import net.ye.p;
import net.ye.wr;
import net.yz.m_;

public class x implements wr {
   private static final m_ q = new m_("textures/entity/spider_eyes.png");
   private final dc e;

   public x(dc var1) {
      this.e = var1;
   }

   public void B(net.nk.a var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      p.j();
      this.e.i(q);
      net.y.d.C();
      net.y.d.d();
      net.y.d.m(net.y.d.ONE, net.y.d.ONE);
      net.y.d.Y(!var1.e());
      int var10 = 61680;
      int var11 = var10 % 65536;
      int var12 = var10 / 65536;
      ui.c(ui.w, (float)var11, (float)var12);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      net.nn.j.b().s4.I(true);
      if(z9.Q()) {
         oz.n7();
      }

      z9.F().KE = true;
      this.e.v().V(var1, var2, var3, var5, var6, var7, var8);
      z9.F().KE = false;
      if(z9.Q()) {
         oz.v();
      }

      net.nn.j.b().s4.I(false);
      var10 = var1.L();
      var11 = var10 % 65536;
      var12 = var10 / 65536;
      ui.c(ui.w, (float)var11, (float)var12);
      this.e.I(var1);
      net.y.d.E();
      net.y.d.m();
      net.u.d.h(new net.u.d[2]);
   }

   public boolean y() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
