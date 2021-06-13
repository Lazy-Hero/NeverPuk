package net.w;

import java.util.Random;
import net.xn;
import net.w.f;

public class fu extends f {
   private final net.y9.l P;

   public fu(net.y9.l var1) {
      this.P = var1;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.h();
      var3 = var3.F(-8, 0, -8);
      if(var3.h() > 5 && var1.y(var3)) {
         var3 = var3.b();
      }

      if(var3.h() <= 4) {
         return false;
      } else {
         var3 = var3.p(4);
         boolean[] var5 = new boolean[2048];
         int var6 = var2.nextInt(4) + 4;
         int var7 = 0;
         if(var7 < var6) {
            double var8 = var2.nextDouble() * 6.0D + 3.0D;
            double var10 = var2.nextDouble() * 4.0D + 2.0D;
            double var12 = var2.nextDouble() * 6.0D + 3.0D;
            double var14 = var2.nextDouble() * (16.0D - var8 - 2.0D) + 1.0D + var8 / 2.0D;
            double var16 = var2.nextDouble() * (8.0D - var10 - 4.0D) + 2.0D + var10 / 2.0D;
            double var18 = var2.nextDouble() * (16.0D - var12 - 2.0D) + 1.0D + var12 / 2.0D;
            int var20 = 1;
            int var21 = 1;
            int var22 = 1;
            double var23 = ((double)var20 - var14) / (var8 / 2.0D);
            double var25 = ((double)var22 - var16) / (var10 / 2.0D);
            double var27 = ((double)var21 - var18) / (var12 / 2.0D);
            double var29 = var23 * var23 + var25 * var25 + var27 * var27;
            if(Double.compare(var29, 1.0D) < 0) {
               var5[(var20 * 16 + var21) * 8 + var22] = true;
            }

            ++var22;
            ++var21;
            ++var20;
            ++var7;
         }

         var7 = 0;
         int var44 = 0;
         int var9 = 0;
         boolean var10000 = var5[(var7 * 16 + var44) * 8 + var9];
         var10000 = var5[((var7 + 1) * 16 + var44) * 8 + var9];
         var10000 = var5[(var7 * 16 + var44 + 1) * 8 + var9];
         var10000 = var5[(var7 * 16 + var44) * 8 + var9 + 1];
         boolean var62 = false;
         net.y1.l var11 = var1.Z(var3.F(var7, var9, var44)).n();
         if(!var11.B() && var1.Z(var3.F(var7, var9, var44)).Q() != this.P) {
            return false;
         } else {
            ++var9;
            ++var44;
            ++var7;
            var7 = 0;
            var44 = 0;
            var9 = 0;
            var10000 = var5[(var7 * 16 + var44) * 8 + var9];
            ++var9;
            ++var44;
            ++var7;
            var7 = 0;
            var44 = 0;
            var9 = 4;
            var10000 = var5[(var7 * 16 + var44) * 8 + var9];
            ++var9;
            ++var44;
            ++var7;
            if(this.P.p().n() == net.y1.l.U) {
               var7 = 0;
               var44 = 0;
               var9 = 0;
               var10000 = var5[(var7 * 16 + var44) * 8 + var9];
               var10000 = var5[((var7 + 1) * 16 + var44) * 8 + var9];
               var10000 = var5[(var7 * 16 + var44 + 1) * 8 + var9];
               var10000 = var5[(var7 * 16 + var44) * 8 + var9 + 1];
               var62 = false;
               if(var1.Z(var3.F(var7, var9, var44)).n().B()) {
                  var1.k(var3.F(var7, var9, var44), net.nb.f.oy.p(), 2);
               }

               ++var9;
               ++var44;
               ++var7;
            }

            if(this.P.p().n() == net.y1.l.p) {
               var7 = 0;
               var44 = 0;
               var9 = 4;
               if(var1.l(var3.F(var7, 4, var44))) {
                  var1.k(var3.F(var7, 4, var44), net.nb.f.oD.p(), 2);
               }

               ++var44;
               ++var7;
            }

            return true;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
