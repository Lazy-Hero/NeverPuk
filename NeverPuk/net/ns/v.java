package net.ns;

import java.util.Random;
import net.xn;
import net.ns.i;
import net.ns.i9;
import net.ns.q;
import net.y9.rv;

public class v extends q {
   public v(i.g var1) {
      super(var1);
      this.K.E = 2;
      this.K.D = 2;
      this.K.N = 5;
   }

   public void y(net.yv.r var1, Random var2, net.l.o var3, int var4, int var5, double var6) {
      i9.M();
      this.j = net.nb.f.p.p();
      this.y = net.nb.f.dl.p();
      if(Double.compare(var6, 1.75D) > 0) {
         this.j = net.nb.f.oy.p();
         this.y = net.nb.f.oy.p();
      }

      if(var6 > -0.5D) {
         this.j = net.nb.f.dl.p().s(rv.l, rv.m.COARSE_DIRT);
      }

      this.B(var1, var2, var3, var4, var5, var6);
   }

   public void f(net.yv.r var1, Random var2, net.u.j var3) {
      this.K.e(var1, var2, this, var3);
   }

   private static xn c(xn var0) {
      return var0;
   }
}
