package net.n0;

import net.b2;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.ad;
import net.yz.aq;

public class y5 extends y {
   public y5() {
      this.S = 1;
      this.d(64);
      this.M(net.ys.r.y);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      var3 = var3.C(var5);
      kw.b();
      ks var10 = var1.o((net.yz.k)var4);
      if(!var1.n(var3, var5, var10)) {
         return ad.FAIL;
      } else {
         if(var2.Z(var3).n() == net.y1.l.q) {
            var2.M(var1, var3, net.nb.l.C9, net.yz.p.BLOCKS, 1.0F, u.nextFloat() * 0.4F + 0.8F);
            var2.k(var3, net.nb.f.g.p(), 11);
         }

         if(var1 instanceof net.r.h) {
            b2.D.a((net.r.h)var1, var3, var10);
         }

         var10.S(1, var1);
         return ad.SUCCESS;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
