package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.y9.zu;

public class fb extends f {
   private final net.yw.n C;

   public fb(zu.i var1) {
      this.C = net.nb.f.TU.p().s(zu.p, var1);
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.h();
      net.yw.n var5 = var1.Z(var3);
      if((var5.n() == net.y1.l.q || var5.n() == net.y1.l.h) && var3.h() > 0) {
         var3 = var3.b();
         var1.Z(var3);
      }

      int var7 = 0;
      net.u.j var6 = var3.F(var2.nextInt(8) - var2.nextInt(8), var2.nextInt(4) - var2.nextInt(4), var2.nextInt(8) - var2.nextInt(8));
      if(var1.y(var6) && net.nb.f.TU.p(var1, var6, this.C)) {
         var1.k(var6, this.C, 2);
      }

      ++var7;
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
