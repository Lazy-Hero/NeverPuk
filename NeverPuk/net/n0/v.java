package net.n0;

import net.b2;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.q;
import net.n0.y;
import net.y9.l4;
import net.y9.lk;
import net.yz.ad;
import net.yz.aq;

public class v extends y {
   private final net.y9.l r;

   public v(net.y9.l var1) {
      this.r = var1;
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      kw.b();
      net.yw.n var10 = var2.Z(var3);
      net.y9.l var11 = var10.Q();
      if(var11 == net.nb.f.Tl && ((Integer)var10.i(l4.H)).intValue() < 1) {
         var5 = aq.UP;
      }

      if(!var11.X(var2, var3)) {
         var3 = var3.C(var5);
      }

      ks var12 = var1.o((net.yz.k)var4);
      if(!var12.B() && var1.n(var3, var5, var12) && var2.j(this.r, var3, false, var5, (net.ne.l)null)) {
         net.yw.n var13 = this.r.U(var2, var3, var5, var6, var7, var8, 0, var1);
         if(!var2.k(var3, var13, 11)) {
            return ad.FAIL;
         } else {
            var13 = var2.Z(var3);
            if(var13.Q() == this.r) {
               q.k(var2, var1, var3, var12);
               var13.Q().o((net.yv.r)var2, (net.u.j)var3, (net.yw.n)var13, (net.ne.a)var1, (ks)var12);
               if(var1 instanceof net.r.h) {
                  b2.D.a((net.r.h)var1, var3, var12);
               }
            }

            lk var14 = this.r.X();
            var2.M(var1, var3, var14.J(), net.yz.p.BLOCKS, (var14.m() + 1.0F) / 2.0F, var14.X() * 0.8F);
            var12.H(1);
            return ad.SUCCESS;
         }
      } else {
         return ad.FAIL;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
