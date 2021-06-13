package net.w;

import java.util.Random;
import net.xn;
import net.w.f;

public class f5 extends f {
   private final net.y9.l L;
   private final int u;

   public f5(net.y9.l var1, int var2) {
      this.L = var1;
      this.u = var2;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      int var4 = f.j();
      if(var1.Z(var3).n() != net.y1.l.p) {
         return false;
      } else {
         int var5 = var2.nextInt(this.u - 2) + 2;
         boolean var10000 = true;
         int var7 = var3.t() - var5;
         if(var7 <= var3.t() + var5) {
            int var8 = var3.y() - var5;
            if(var8 <= var3.y() + var5) {
               int var9 = var7 - var3.t();
               int var10 = var8 - var3.y();
               if(var9 * var9 + var10 * var10 <= var5 * var5) {
                  int var11 = var3.h() - 2;
                  if(var11 <= var3.h() + 2) {
                     net.u.j var12 = new net.u.j(var7, var11, var8);
                     net.y9.l var13 = var1.Z(var12).Q();
                     if(var13 == net.nb.f.dl || var13 == net.nb.f.p) {
                        var1.k(var12, this.L.p(), 2);
                     }

                     ++var11;
                  }
               }

               ++var8;
            }

            ++var7;
         }

         return true;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
