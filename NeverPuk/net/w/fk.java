package net.w;

import java.util.Random;
import net.xn;
import net.w.f;

public class fk extends f {
   private net.y9.n K;
   private net.yw.n E;

   public fk(net.y9.n var1, net.y9.n var2) {
      this.g(var1, var2);
   }

   public void g(net.y9.n var1, net.y9.n var2) {
      this.K = var1;
      this.E = var1.p().s(var1.k(), var2);
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.h();
      int var5 = 0;
      net.u.j var6 = var3.F(var2.nextInt(8) - var2.nextInt(8), var2.nextInt(4) - var2.nextInt(4), var2.nextInt(8) - var2.nextInt(8));
      if(var1.y(var6) && (!var1.F.k() || var6.h() < 255) && this.K.p(var1, var6, this.E)) {
         var1.k(var6, this.E, 2);
      }

      ++var5;
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
