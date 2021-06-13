package net;

import net.mf;
import net.xn;
import net.u.t;

public class og {
   public static int r(int[] var0) {
      if(var0.length <= 0) {
         return 0;
      } else {
         int var1 = q(var0);
         int var2 = var1 / var0.length;
         return var2;
      }
   }

   public static int q(int[] var0) {
      String var1 = mf.O();
      if(var0.length <= 0) {
         return 0;
      } else {
         int var2 = 0;
         int var3 = 0;
         if(var3 < var0.length) {
            int var4 = var0[var3];
            var2 += var4;
            ++var3;
         }

         return var2;
      }
   }

   public static int N(int var0) {
      int var1 = t.A(var0);
      return var0 == var1?var1:var1 / 2;
   }

   public static boolean B(float var0, float var1, float var2) {
      return Math.abs(var0 - var1) <= var2;
   }

   public static float t(float var0) {
      return var0 * 180.0F / 3.1415927F;
   }

   public static float r(float var0) {
      return var0 / 180.0F * 3.1415927F;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
