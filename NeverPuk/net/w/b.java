package net.w;

import java.util.Random;
import net.xn;
import net.w.f;

public class b extends f {
   private final net.y9.t m;

   public b(net.y9.t var1) {
      this.m = var1;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.j();
      int var5 = 0;
      net.u.j var6 = var3.F(var2.nextInt(8) - var2.nextInt(8), var2.nextInt(4) - var2.nextInt(4), var2.nextInt(8) - var2.nextInt(8));
      if(var1.y(var6) && (!var1.F.k() || var6.h() < 255) && this.m.p(var1, var6, this.m.p())) {
         var1.k(var6, this.m.p(), 2);
      }

      ++var5;
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
