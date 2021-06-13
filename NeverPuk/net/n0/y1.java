package net.n0;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.ad;
import net.yz.aq;

public class y1 extends y {
   public y1() {
      this.M(net.ys.r.K);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      int[] var9 = kw.b();
      if(var2.x) {
         return ad.SUCCESS;
      } else {
         var3 = var3.C(var5);
         ks var10 = var1.o((net.yz.k)var4);
         if(!var1.n(var3, var5, var10)) {
            return ad.FAIL;
         } else {
            if(var2.Z(var3).n() == net.y1.l.q) {
               var2.M((net.r.r)null, var3, net.nb.l.O, net.yz.p.BLOCKS, 1.0F, (u.nextFloat() - u.nextFloat()) * 0.2F + 1.0F);
               var2.U(var3, net.nb.f.g.p());
            }

            if(!var1.a6.V) {
               var10.H(1);
            }

            return ad.SUCCESS;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
