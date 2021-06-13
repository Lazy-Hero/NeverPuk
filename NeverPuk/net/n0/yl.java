package net.n0;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.ad;
import net.yz.am;

public class yl extends y {
   public yl() {
      this.M(net.ys.r.Y);
      this.F(1);
      this.d(25);
   }

   public boolean a() {
      return true;
   }

   public boolean O() {
      return true;
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      kw.b();
      ks var5 = var2.o((net.yz.k)var3);
      if(var1.x) {
         return new am(ad.PASS, var5);
      } else {
         if(var2.M() && var2.D() instanceof net.yn.u) {
            net.yn.u var6 = (net.yn.u)var2.D();
            if(var5.Z() - var5.n() >= 7 && var6.D()) {
               var5.S(7, var2);
               if(var5.B()) {
                  ks var7 = new ks(net.nb.j.WQ);
                  var7.t(var5.o());
                  return new am(ad.SUCCESS, var7);
               }

               return new am(ad.SUCCESS, var5);
            }
         }

         var2.S(net.v.q.H(this));
         return new am(ad.PASS, var5);
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
