package net.n0;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.ad;
import net.yz.am;

public class y3 extends y {
   public y3() {
      this.S = 16;
      this.M(net.ys.r.K);
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      kw.b();
      ks var5 = var2.o((net.yz.k)var3);
      if(!var2.a6.V) {
         var5.H(1);
      }

      var1.L((net.r.r)null, var2.b, var2.hS, var2.hr, net.nb.l.Dy, net.yz.p.NEUTRAL, 0.5F, 0.4F / (u.nextFloat() * 0.4F + 0.8F));
      var2.H().V(this, 20);
      if(!var1.x) {
         net.nm.f var6 = new net.nm.f(var1, var2);
         var6.X(var2, var2.V, var2.hN, 0.0F, 1.5F, 1.0F);
         var1.S(var6);
      }

      var2.S(net.v.q.H(this));
      return new am(ad.SUCCESS, var5);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
