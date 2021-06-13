package net.n0;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.yt;
import net.yz.ad;
import net.yz.aq;

public class y7 extends yt {
   private final net.y9.l M;
   private final net.y9.l x;

   public y7(int var1, float var2, net.y9.l var3, net.y9.l var4) {
      super(var1, var2, false);
      this.M = var3;
      this.x = var4;
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      kw.b();
      ks var10 = var1.o((net.yz.k)var4);
      if(var5 == aq.UP && var1.n(var3.C(var5), var5, var10) && var2.Z(var3).Q() == this.x && var2.y(var3.h())) {
         var2.k(var3.h(), this.M.p(), 11);
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
