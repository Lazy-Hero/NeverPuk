package net.w;

import java.util.Random;
import net.xn;
import net.w.f;

public class r extends f {
   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.h();
      int var5 = 0;
      net.u.j var6 = var3.F(var2.nextInt(8) - var2.nextInt(8), var2.nextInt(4) - var2.nextInt(4), var2.nextInt(8) - var2.nextInt(8));
      if(var1.y(var6)) {
         int var7 = 1 + var2.nextInt(var2.nextInt(3) + 1);
         int var8 = 0;
         if(var8 < var7) {
            if(net.nb.f.dW.f(var1, var6)) {
               var1.k(var6.J(var8), net.nb.f.dW.p(), 2);
            }

            ++var8;
         }
      }

      ++var5;
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
