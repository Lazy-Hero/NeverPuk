package net.y_;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y_.b;

public class s {
   private static net.u.r d = net.u.r.r;

   @Nullable
   public static net.u.r h(net.ne.s var0, int var1, int var2) {
      return y(var0, var1, var2, (net.u.r)null);
   }

   @Nullable
   public static net.u.r Y(net.ne.s var0, int var1, int var2) {
      return j(var0, var1, var2, (net.u.r)null, false);
   }

   @Nullable
   public static net.u.r l(net.ne.s var0, int var1, int var2, net.u.r var3) {
      d = var3.I(var0.b, var0.hS, var0.hr);
      return y(var0, var1, var2, d);
   }

   @Nullable
   public static net.u.r e(net.ne.s var0, int var1, int var2, net.u.r var3) {
      d = (new net.u.r(var0.b, var0.hS, var0.hr)).q(var3);
      return y(var0, var1, var2, d);
   }

   @Nullable
   private static net.u.r y(net.ne.s var0, int var1, int var2, @Nullable net.u.r var3) {
      return j(var0, var1, var2, var3, true);
   }

   @Nullable
   private static net.u.r j(net.ne.s var0, int var1, int var2, @Nullable net.u.r var3, boolean var4) {
      b.E();
      net.b.n var6 = var0.H();
      Random var7 = var0.Q();
      if(var0.DM()) {
         double var9 = var0.I().s((double)net.u.t.L(var0.b), (double)net.u.t.L(var0.hS), (double)net.u.t.L(var0.hr)) + 4.0D;
         double var11 = (double)(var0.H() + (float)var1);
         boolean var8 = Double.compare(var9, var11 * var11) < 0;
      }

      boolean var20 = false;
      boolean var21 = false;
      float var10 = -99999.0F;
      int var23 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = var7.nextInt(2 * var1 + 1) - var1;
      int var16 = var7.nextInt(2 * var2 + 1) - var2;
      int var17 = var7.nextInt(2 * var1 + 1) - var1;
      if(var3 == null || Double.compare((double)var15 * var3.p + (double)var17 * var3.a, 0.0D) >= 0) {
         if(var0.DM() && var1 > 1) {
            net.u.j var18 = var0.I();
            if(Double.compare(var0.b, (double)var18.t()) > 0) {
               var15 -= var7.nextInt(var1 / 2);
            }

            var15 += var7.nextInt(var1 / 2);
            if(Double.compare(var0.hr, (double)var18.y()) > 0) {
               var17 -= var7.nextInt(var1 / 2);
            }

            var17 += var7.nextInt(var1 / 2);
         }

         net.u.j var25 = new net.u.j((double)var15 + var0.b, (double)var16 + var0.hS, (double)var17 + var0.hr);
         if(var6.n(var25)) {
            if(!var4) {
               var25 = x(var25, var0);
               if(k(var25, var0)) {
                  ;
               }
            }

            float var19 = var0.O(var25);
            if(var19 > var10) {
               var23 = var15;
               var12 = var16;
               var13 = var17;
               var21 = true;
            }
         }
      }

      ++var14;
      return new net.u.r((double)var23 + var0.b, (double)var12 + var0.hS, (double)var13 + var0.hr);
   }

   private static net.u.j x(net.u.j var0, net.ne.s var1) {
      if(!var1.hl.Z(var0).n().B()) {
         return var0;
      } else {
         net.u.j var2;
         for(var2 = var0.h(); var2.h() < var1.hl.Z() && var1.hl.Z(var2).n().B(); var2 = var2.h()) {
            ;
         }

         return var2;
      }
   }

   private static boolean k(net.u.j var0, net.ne.s var1) {
      return var1.hl.Z(var0).n() == net.y1.l.p;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
