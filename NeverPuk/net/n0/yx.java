package net.n0;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.ad;
import net.yz.aq;

public class yx extends y {
   private final Class t;

   public yx(Class var1) {
      this.t = var1;
      this.M(net.ys.r.X);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      ks var10 = var1.o((net.yz.k)var4);
      kw.b();
      net.u.j var11 = var3.C(var5);
      if(var5 != aq.DOWN && var5 != aq.UP && var1.n(var11, var5, var10)) {
         net.ne.n var12 = this.f(var2, var11, var5);
         if(var12 != null && var12.N()) {
            if(!var2.x) {
               var12.a();
               var2.S(var12);
            }

            var10.H(1);
         }

         return ad.SUCCESS;
      } else {
         return ad.FAIL;
      }
   }

   @Nullable
   private net.ne.n f(net.yv.r var1, net.u.j var2, aq var3) {
      return (net.ne.n)(this.t == net.nm.l.class?new net.nm.l(var1, var2, var3):(this.t == net.nm.e.class?new net.nm.e(var1, var2, var3):null));
   }

   private static xn a(xn var0) {
      return var0;
   }
}
