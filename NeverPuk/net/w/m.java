package net.w;

import java.util.Iterator;
import java.util.Random;
import net.xn;
import net.w.f;

public class m extends f {
   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.j();
      Iterator var5 = net.u.j.X(var3.F(-1, -2, -1), var3.F(1, 2, 1)).iterator();
      if(var5.hasNext()) {
         net.u.j var6 = (net.u.j)var5.next();
         boolean var7 = var6.t() == var3.t();
         boolean var8 = var6.h() == var3.h();
         boolean var9 = var6.y() == var3.y();
         boolean var10 = Math.abs(var6.h() - var3.h()) == 2;
         this.k(var1, var6, net.nb.f.ou.p());
      }

      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
