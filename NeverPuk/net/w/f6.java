package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.y9.lw;
import net.yz.aq;

public class f6 extends f {
   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      int var4 = f.j();
      if(var3.h() < 128) {
         if(var1.y(var3)) {
            aq[] var5 = aq.u.HORIZONTAL.A();
            int var6 = var5.length;
            int var7 = 0;
            if(var7 < var6) {
               aq var8 = var5[var7];
               if(net.nb.f.To.C(var1, var3, var8)) {
                  net.yw.n var9 = net.nb.f.To.p().s(lw.A, Boolean.valueOf(var8 == aq.NORTH)).s(lw.f, Boolean.valueOf(var8 == aq.EAST)).s(lw.J, Boolean.valueOf(var8 == aq.SOUTH)).s(lw.R, Boolean.valueOf(var8 == aq.WEST));
                  var1.k(var3, var9, 2);
               }

               ++var7;
            }
         }

         var3 = var3.F(var2.nextInt(4) - var2.nextInt(4), 0, var2.nextInt(4) - var2.nextInt(4));
         var3 = var3.h();
      }

      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
