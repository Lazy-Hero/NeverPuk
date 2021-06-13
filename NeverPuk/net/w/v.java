package net.w;

import java.util.Random;
import net.xn;
import net.w.f;

public class v extends f {
   private net.y9.y k;

   public void o(net.y9.y var1) {
      this.k = var1;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.h();
      boolean var5 = false;
      int var6 = 0;
      net.u.j var7 = var3.F(var2.nextInt(8) - var2.nextInt(8), var2.nextInt(4) - var2.nextInt(4), var2.nextInt(8) - var2.nextInt(8));
      if(var1.y(var7) && (!var1.F.k() || var7.h() < 254) && net.nb.f.Tg.J(var1, var7)) {
         net.nb.f.Tg.p(var1, var7, this.k, 2);
         var5 = true;
      }

      ++var6;
      return var5;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
