package net.n0;

import net.b2;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.q;
import net.n0.y;
import net.ni.sg;
import net.y9.r7;
import net.y9.ro;
import net.yz.ad;
import net.yz.aq;

public class ki extends y {
   public ki() {
      this.S = 16;
      this.M(net.ys.r.X);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      kw.b();
      net.yw.n var10 = var2.Z(var3);
      boolean var11 = var10.Q().X(var2, var3);
      if(var5 != aq.DOWN && (var10.n().B() || var11) && (!var11 || var5 == aq.UP)) {
         var3 = var3.C(var5);
         ks var12 = var1.o((net.yz.k)var4);
         if(var1.n(var3, var5, var12) && net.nb.f.uL.J(var2, var3)) {
            if(var2.x) {
               return ad.SUCCESS;
            } else {
               var3 = var11?var3.b():var3;
               if(var5 == aq.UP) {
                  int var13 = net.u.t.L((double)((var1.hN + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15;
                  var2.k(var3, net.nb.f.uL.p().s(r7.n, Integer.valueOf(var13)), 11);
               }

               var2.k(var3, net.nb.f.l.p().s(ro.k, var5), 11);
               net.ni.v var16 = var2.L(var3);
               if(var16 instanceof sg && !q.k(var2, var1, var3, var12)) {
                  var1.u((sg)var16);
               }

               if(var1 instanceof net.r.h) {
                  b2.D.a((net.r.h)var1, var3, var12);
               }

               var12.H(1);
               return ad.SUCCESS;
            }
         } else {
            return ad.FAIL;
         }
      } else {
         return ad.FAIL;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
