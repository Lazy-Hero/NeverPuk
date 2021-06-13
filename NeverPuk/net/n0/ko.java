package net.n0;

import net.b2;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.ad;
import net.yz.aq;

public class ko extends y {
   private final net.y9.l D;
   private final net.y9.l P;

   public ko(net.y9.l var1, net.y9.l var2) {
      this.D = var1;
      this.P = var2;
      this.M(net.ys.r.I);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      kw.b();
      ks var10 = var1.o((net.yz.k)var4);
      if(var5 == aq.UP && var1.n(var3.C(var5), var5, var10) && var2.Z(var3).Q() == this.P && var2.y(var3.h())) {
         var2.U(var3.h(), this.D.p());
         if(var1 instanceof net.r.h) {
            b2.D.a((net.r.h)var1, var3.h(), var10);
         }

         var10.H(1);
         return ad.SUCCESS;
      } else {
         return ad.FAIL;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
