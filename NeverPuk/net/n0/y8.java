package net.n0;

import java.util.Iterator;
import net.xn;
import net.n0.kw;
import net.n0.y;
import net.y9.r3;
import net.yz.ad;
import net.yz.aq;

public class y8 extends y {
   public y8() {
      this.M(net.ys.r.y);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      net.y9.l var9 = var2.Z(var3).Q();
      if(!(var9 instanceof r3)) {
         return ad.PASS;
      } else {
         if(!var2.x) {
            V(var1, var2, var3);
         }

         return ad.SUCCESS;
      }
   }

   public static boolean V(net.r.r var0, net.yv.r var1, net.u.j var2) {
      net.ne.o var4 = net.ne.o.V(var1, var2);
      boolean var5 = false;
      double var10000 = 7.0D;
      kw.b();
      int var8 = var2.t();
      int var9 = var2.h();
      int var10 = var2.y();
      Iterator var11 = var1.p(net.ne.y.class, new net.u.e((double)var8 - 7.0D, (double)var9 - 7.0D, (double)var10 - 7.0D, (double)var8 + 7.0D, (double)var9 + 7.0D, (double)var10 + 7.0D)).iterator();
      if(var11.hasNext()) {
         net.ne.y var12 = (net.ne.y)var11.next();
         if(var12.ln() && var12.M() == var0) {
            if(var4 == null) {
               var4 = net.ne.o.Y(var1, var2);
            }

            var12.Y(var4, true);
            var5 = true;
         }
      }

      return var5;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
