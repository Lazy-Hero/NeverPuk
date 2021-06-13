package net.w;

import java.util.Random;
import net.xn;
import net.w.f;

public class fy extends f {
   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.h();
      int var5 = 0;
      int var6 = var3.t() + var2.nextInt(8) - var2.nextInt(8);
      int var7 = var3.h() + var2.nextInt(4) - var2.nextInt(4);
      int var8 = var3.y() + var2.nextInt(8) - var2.nextInt(8);
      if(var1.y(new net.u.j(var6, var7, var8)) && net.nb.f.dD.J(var1, new net.u.j(var6, var7, var8))) {
         var1.k(new net.u.j(var6, var7, var8), net.nb.f.dD.p(), 2);
      }

      ++var5;
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
