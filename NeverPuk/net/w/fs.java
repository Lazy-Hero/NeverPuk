package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.yz.aq;

public class fs extends f {
   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      int var4 = f.j();
      if(!var1.y(var3)) {
         return false;
      } else if(var1.Z(var3.h()).Q() != net.nb.f.R) {
         return false;
      } else {
         var1.k(var3, net.nb.f.Tr.p(), 2);
         int var5 = 0;
         net.u.j var6 = var3.F(var2.nextInt(8) - var2.nextInt(8), -var2.nextInt(12), var2.nextInt(8) - var2.nextInt(8));
         if(var1.Z(var6).n() == net.y1.l.q) {
            int var7 = 0;
            aq[] var8 = aq.values();
            int var9 = var8.length;
            int var10 = 0;
            if(var10 < var9) {
               aq var11 = var8[var10];
               if(var1.Z(var6.C(var11)).Q() == net.nb.f.Tr) {
                  ++var7;
               }

               ++var10;
            }
         }

         ++var5;
         return true;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
