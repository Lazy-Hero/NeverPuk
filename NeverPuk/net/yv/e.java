package net.yv;

import net.xn;
import net.yv.r;

public class e {
   private static int[] P = new int[65536];

   public static void p(int[] var0) {
      P = var0;
   }

   public static int A(double var0, double var2) {
      var2 = var2 * var0;
      int var5 = (int)((1.0D - var0) * 255.0D);
      r.C();
      int var6 = (int)((1.0D - var2) * 255.0D);
      int var7 = var6 << 8 | var5;
      return var7 > P.length?-65281:P[var7];
   }

   private static xn a(xn var0) {
      return var0;
   }
}
