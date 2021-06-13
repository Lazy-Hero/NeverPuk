package net;

import net.xn;
import net.nn.j;
import net.u.d;

public class mw {
   private static boolean M;

   public static float w(float var0, float var1, float var2) {
      float var3 = (var1 - var0) / Math.max((float)j.w(), 5.0F) * 15.0F;
      if(var3 > 0.0F) {
         var3 = Math.max(var2, var3);
         var3 = Math.min(var1 - var0, var3);
      } else if(var3 < 0.0F) {
         var3 = Math.min(-var2, var3);
         var3 = Math.max(var1 - var0, var3);
      }

      return var0 + var3;
   }

   public static double g(double var0, double var2, double var4) {
      boolean var6 = var0 > var2;
      if(var4 < 0.0D) {
         var4 = 0.0D;
      } else if(var4 > 1.0D) {
         var4 = 1.0D;
      }

      double var7 = Math.max(var0, var2) - Math.min(var0, var2);
      double var9 = var7 * var4;
      if(var9 <= 0.1D) {
         var9 = 0.1D;
      }

      var2 = var2 + var9;
      return var2;
   }

   public static float k(float var0, float var1, long var2, double var4) {
      B();
      float var7 = var1 - var0;
      if(Long.compare(var2, 1L) < 0) {
         var2 = 1L;
      }

      if(Long.compare(var2, 1000L) > 0) {
         var2 = 16L;
      }

      if(Double.compare((double)var7, var4) > 0) {
         double var8 = Math.max(var4 * (double)var2 / 16.0D, 0.5D);
         var1 = (float)((double)var1 - var8);
         if(var1 < var0) {
            var1 = var0;
         }
      }

      if((double)var7 < -var4) {
         double var11 = Math.max(var4 * (double)var2 / 16.0D, 0.5D);
         var1 = (float)((double)var1 + var11);
         if(var1 > var0) {
            ;
         }
      }

      if(d.y() == null) {
         D(false);
      }

      return var0;
   }

   public static void D(boolean var0) {
      M = var0;
   }

   public static boolean B() {
      return M;
   }

   public static boolean X() {
      boolean var0 = B();
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(!B()) {
         D(true);
      }

   }
}
