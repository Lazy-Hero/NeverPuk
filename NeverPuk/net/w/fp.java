package net.w;

import java.util.Random;
import net.xn;
import net.w.f;

public class fp extends f {
   private final net.y9.l H = net.nb.f.d4;
   private final int O;

   public fp(int var1) {
      this.O = var1;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      int var4 = f.j();
      if(var1.y(var3) && var3.h() > 2) {
         var3 = var3.b();
      }

      if(var1.Z(var3).Q() != net.nb.f.V) {
         return false;
      } else {
         int var5 = var2.nextInt(this.O - 2) + 2;
         boolean var10000 = true;
         int var7 = var3.t() - var5;
         if(var7 <= var3.t() + var5) {
            int var8 = var3.y() - var5;
            if(var8 <= var3.y() + var5) {
               int var9 = var7 - var3.t();
               int var10 = var8 - var3.y();
               if(var9 * var9 + var10 * var10 <= var5 * var5) {
                  int var11 = var3.h() - 1;
                  if(var11 <= var3.h() + 1) {
                     net.u.j var12 = new net.u.j(var7, var11, var8);
                     net.y9.l var13 = var1.Z(var12).Q();
                     if(var13 == net.nb.f.dl || var13 == net.nb.f.V || var13 == net.nb.f.oD) {
                        var1.k(var12, this.H.p(), 2);
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
