package net.w;

import java.util.Random;
import net.xn;
import net.w.f;

public class fm extends f {
   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.h();
      int var5 = 0;
      net.u.j var6 = var3.F(var2.nextInt(4) - var2.nextInt(4), 0, var2.nextInt(4) - var2.nextInt(4));
      if(var1.y(var6)) {
         net.u.j var7 = var6.b();
         if(var1.Z(var7.H()).n() == net.y1.l.p || var1.Z(var7.g()).n() == net.y1.l.p || var1.Z(var7.D()).n() == net.y1.l.p || var1.Z(var7.d()).n() == net.y1.l.p) {
            int var8 = 2 + var2.nextInt(var2.nextInt(3) + 1);
            int var9 = 0;
            if(var9 < var8) {
               if(net.nb.f.dF.b(var1, var6)) {
                  var1.k(var6.J(var9), net.nb.f.dF.p(), 2);
               }

               ++var9;
            }
         }
      }

      ++var5;
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
