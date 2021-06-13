package net.ns;

import java.util.Random;
import net.xn;
import net.ns.e;
import net.ns.i;
import net.ns.i9;

public class r extends e {
   public void e(net.yv.r var1, Random var2, i var3, net.u.j var4) {
      i9.M();
      net.u.j var6 = var1.y();
      boolean var10000 = true;
      double var8 = var6.n(var4.F(8, var6.h(), 8));
      if(var8 <= 1024.0D) {
         net.u.j var10 = new net.u.j(var6.t() - 16, var6.h() - 1, var6.y() - 16);
         net.u.j var11 = new net.u.j(var6.t() + 16, var6.h() - 1, var6.y() + 16);
         net.u.j var12 = new net.u.j(var10);
         int var13 = var4.y();
         if(var13 < var4.y() + 16) {
            int var14 = var4.t();
            if(var14 < var4.t() + 16) {
               if(var13 >= var10.y() && var13 <= var11.y() && var14 >= var10.t() && var14 <= var11.t()) {
                  var12.V(var14, var12.h(), var13);
                  if(var6.t() == var14 && var6.y() == var13) {
                     var1.k(var12, net.nb.f.TD.p(), 2);
                  }

                  var1.k(var12, net.nb.f.oy.p(), 2);
               }

               ++var14;
            }

            ++var13;
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
