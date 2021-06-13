package net.w;

import java.util.Random;
import net.xn;
import net.w.f;

public class u extends f {
   private final net.y9.l a = net.nb.f.uz;
   private final int o;

   public u(int var1) {
      this.o = var1;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      int var4 = f.h();
      if(var1.Z(var3).n() != net.y1.l.p) {
         return false;
      } else {
         int var5 = var2.nextInt(this.o - 2) + 2;
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
                     if(var13 == net.nb.f.dl || var13 == net.nb.f.uz) {
                        var1.k(var12, this.a.p(), 2);
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
