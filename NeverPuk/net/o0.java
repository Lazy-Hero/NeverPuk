package net;

import java.math.BigDecimal;
import java.util.Random;
import net._v;
import net.xn;
import net.u.d;

public class o0 {
   private static final Random h = new Random();

   public static BigDecimal T(float var0, int var1) {
      BigDecimal var2 = new BigDecimal(Float.toString(var0));
      var2 = var2.setScale(var1, 4);
      return var2;
   }

   public static int x(int var0, int var1) {
      return (int)((double)var1 + (double)(var0 - var1) * h.nextDouble());
   }

   public static int K(int var0, int var1) {
      return -var1 + (int)(Math.random() * (double)(var0 - -var1 + 1));
   }

   public static float e(float var0, float var1, float var2) {
      return var0 + var2 * (var1 - var0);
   }

   public static float O(float var0, float var1, float var2) {
      d[] var3 = _v.L();
      if(Float.compare(var0, var1) <= 0) {
         var0 = var1;
      }

      if(var0 >= var2) {
         var0 = var2;
      }

      return var0;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
