package net.w;

import java.util.Iterator;
import java.util.Random;
import net.xn;
import net.w.f;

public class z extends f {
   private final net.y9.l E;
   private final int V;

   public z(net.y9.l var1, int var2) {
      super(false);
      this.E = var1;
      this.V = var2;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      int var4 = f.j();
      if(var3.h() > 3) {
         if(var1.y(var3.b())) {
            ;
         }

         net.y9.l var5 = var1.Z(var3.b()).Q();
         if(var5 != net.nb.f.p && var5 != net.nb.f.dl && var5 != net.nb.f.oy) {
            ;
         }
      }

      if(var3.h() <= 3) {
         return false;
      } else {
         int var13 = this.V;
         int var6 = 0;
         if(var13 >= 0) {
            int var7 = var13 + var2.nextInt(2);
            int var8 = var13 + var2.nextInt(2);
            int var9 = var13 + var2.nextInt(2);
            float var10 = (float)(var7 + var8 + var9) * 0.333F + 0.5F;
            Iterator var11 = net.u.j.e(var3.F(-var7, -var8, -var9), var3.F(var7, var8, var9)).iterator();
            if(var11.hasNext()) {
               net.u.j var12 = (net.u.j)var11.next();
               if(Double.compare(var12.n(var3), (double)(var10 * var10)) <= 0) {
                  var1.k(var12, this.E.p(), 4);
               }
            }

            var3.F(-(var13 + 1) + var2.nextInt(2 + var13 * 2), 0 - var2.nextInt(2), -(var13 + 1) + var2.nextInt(2 + var13 * 2));
            ++var6;
         }

         return true;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
