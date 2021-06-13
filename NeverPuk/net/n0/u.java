package net.n0;

import net.b2;
import net.xn;
import net.n0.b;
import net.n0.ks;
import net.n0.kw;
import net.y9.g5;
import net.yz.ad;
import net.yz.am;

public class u extends b {
   public u(net.y9.l var1) {
      super(var1, false);
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      ks var5 = var2.o((net.yz.k)var3);
      kw.b();
      net.u.m var6 = this.X(var1, var2, true);
      if(var6 == null) {
         return new am(ad.PASS, var5);
      } else {
         if(var6.v == net.u.m.BLOCK) {
            net.u.j var7 = var6.j();
            if(!var1.J(var2, var7) || !var2.n(var7.C(var6.d), var6.d, var5)) {
               return new am(ad.FAIL, var5);
            }

            net.u.j var8 = var7.h();
            net.yw.n var9 = var1.Z(var7);
            if(var9.n() == net.y1.l.p && ((Integer)var9.i(g5.J)).intValue() == 0 && var1.y(var8)) {
               var1.k(var8, net.nb.f.dD.p(), 11);
               if(var2 instanceof net.r.h) {
                  b2.D.a((net.r.h)var2, var8, var5);
               }

               if(!var2.a6.V) {
                  var5.H(1);
               }

               var2.S(net.v.q.H(this));
               var1.M(var2, var7, net.nb.l.ML, net.yz.p.BLOCKS, 1.0F, 1.0F);
               return new am(ad.SUCCESS, var5);
            }
         }

         return new am(ad.FAIL, var5);
      }
   }

   private static xn c(xn var0) {
      return var0;
   }
}
