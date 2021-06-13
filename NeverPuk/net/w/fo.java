package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.y9.rm;
import net.yz.aq;

public class fo extends f {
   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.j();
      int var5 = 0;
      net.u.j var6 = var3.F(var2.nextInt(8) - var2.nextInt(8), var2.nextInt(4) - var2.nextInt(4), var2.nextInt(8) - var2.nextInt(8));
      if(var1.y(var6) && var1.Z(var6.b()).Q() == net.nb.f.p && net.nb.f.TS.J(var1, var6)) {
         var1.k(var6, net.nb.f.TS.p().s(rm.N, aq.u.HORIZONTAL.N(var2)), 2);
      }

      ++var5;
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
