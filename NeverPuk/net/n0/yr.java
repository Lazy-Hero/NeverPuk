package net.n0;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y6;
import net.n0.yn;
import net.yz.ad;
import net.yz.am;

public class yr extends y6 {
   protected yr() {
      this.M(net.ys.r.K);
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      kw.b();
      ks var5 = yn.i(var1, var2.b, var2.hr, (byte)0, true, false);
      ks var6 = var2.o((net.yz.k)var3);
      var6.H(1);
      if(var6.B()) {
         return new am(ad.SUCCESS, var5);
      } else {
         if(!var2.a8.D(var5.s())) {
            var2.Y(var5, false);
         }

         var2.S(net.v.q.H(this));
         return new am(ad.SUCCESS, var6);
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
