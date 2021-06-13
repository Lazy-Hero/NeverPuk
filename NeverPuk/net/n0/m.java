package net.n0;

import net.b2;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.q;
import net.y9.l4;
import net.y9.lk;
import net.yz.ad;
import net.yz.aq;

public class m extends q {
   public m(net.y9.l var1) {
      super(var1);
      this.d(0);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      kw.b();
      ks var10 = var1.o((net.yz.k)var4);
      if(!var10.B() && var1.n(var3, var5, var10)) {
         net.yw.n var11 = var2.Z(var3);
         net.y9.l var12 = var11.Q();
         net.u.j var13 = var3;
         if((var5 != aq.UP || var12 != this.A) && !var12.X(var2, var3)) {
            var13 = var3.C(var5);
            var11 = var2.Z(var13);
            var12 = var11.Q();
         }

         if(var12 == this.A) {
            int var14 = ((Integer)var11.i(l4.H)).intValue();
            if(var14 < 8) {
               net.yw.n var15 = var11.s(l4.H, Integer.valueOf(var14 + 1));
               net.u.e var16 = var15.D(var2, var13);
               if(var16 != net.y9.l.q && var2.D(var16.c(var13)) && var2.k(var13, var15, 10)) {
                  lk var17 = this.A.X();
                  var2.M(var1, var13, var17.J(), net.yz.p.BLOCKS, (var17.m() + 1.0F) / 2.0F, var17.X() * 0.8F);
                  if(var1 instanceof net.r.h) {
                     b2.D.a((net.r.h)var1, var3, var10);
                  }

                  var10.H(1);
                  return ad.SUCCESS;
               }
            }
         }

         return super.y(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         return ad.FAIL;
      }
   }

   public int o(int var1) {
      return var1;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
