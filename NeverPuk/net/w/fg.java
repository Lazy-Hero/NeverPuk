package net.w;

import java.util.Random;
import net.xn;
import net.w.f;

public class fg extends f {
   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      int var4 = f.j();
      if(var1.y(var3) && var3.h() > 2) {
         var3 = var3.b();
      }

      if(var1.Z(var3).Q() != net.nb.f.V) {
         return false;
      } else {
         var3 = var3.J(var2.nextInt(4));
         int var5 = var2.nextInt(4) + 7;
         int var6 = var5 / 4 + var2.nextInt(2);
         if(var6 > 1 && var2.nextInt(60) == 0) {
            var3 = var3.J(10 + var2.nextInt(30));
         }

         int var7 = 0;
         if(var7 < var5) {
            float var8 = (1.0F - (float)var7 / (float)var5) * (float)var6;
            int var9 = net.u.t.Y(var8);
            int var10 = -var9;
            if(var10 <= var9) {
               float var11 = (float)net.u.t.l(var10) - 0.25F;
               int var12 = -var9;
               if(var12 <= var9) {
                  float var13 = (float)net.u.t.l(var12) - 0.25F;
                  if((var10 == 0 && var12 == 0 || var11 * var11 + var13 * var13 <= var8 * var8) && (var10 != -var9 && var10 != var9 && var12 != -var9 && var12 != var9 || var2.nextFloat() <= 0.75F)) {
                     net.yw.n var14 = var1.Z(var3.F(var10, var7, var12));
                     net.y9.l var15 = var14.Q();
                     if(var14.n() == net.y1.l.q || var15 == net.nb.f.dl || var15 == net.nb.f.V || var15 == net.nb.f.oD) {
                        this.k(var1, var3.F(var10, var7, var12), net.nb.f.d4.p());
                     }
                  }

                  ++var12;
               }

               ++var10;
            }

            ++var7;
         }

         var7 = var6 - 1;
         if(var7 < 0) {
            var7 = 0;
         }

         if(var7 > 1) {
            var7 = 1;
         }

         int var19 = -var7;
         if(var19 <= var7) {
            int var21 = -var7;
            if(var21 <= var7) {
               net.u.j var24 = var3.F(var19, -1, var21);
               int var26 = 50;
               if(Math.abs(var19) == 1 && Math.abs(var21) == 1) {
                  var26 = var2.nextInt(5);
               }

               if(var24.h() > 50) {
                  net.yw.n var30 = var1.Z(var24);
                  net.y9.l var31 = var30.Q();
                  if(var30.n() != net.y1.l.q && var31 != net.nb.f.dl && var31 != net.nb.f.V && var31 != net.nb.f.oD && var31 != net.nb.f.d4) {
                     ;
                  }

                  this.k(var1, var24, net.nb.f.d4.p());
                  var24 = var24.b();
                  --var26;
                  if(var26 <= 0) {
                     var24.p(var2.nextInt(5) + 1);
                     var26 = var2.nextInt(5);
                  }
               }

               ++var21;
            }

            ++var19;
         }

         return true;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
