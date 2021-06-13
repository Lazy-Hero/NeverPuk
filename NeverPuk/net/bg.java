package net;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import net._v;
import net.xn;
import net.u.d;

public class bg {
   private static final Random z = new Random();

   public static int Y(int var0, int var1) {
      return Math.round((float)var1 + (float)Math.random() * (float)(var0 - var1));
   }

   public static float p(float var0, float var1) {
      d[] var2 = _v.L();
      return var0 != var1 && var1 - var0 > 0.0F?(float)((double)var0 + (double)(var1 - var0) * Math.random()):var0;
   }

   public static long A(int var0, int var1) {
      _v.L();
      long var10000 = (long)(Math.random() * (double)(1000 / var0 - 1000 / var1 + 1) + (double)(1000 / var1));
      if(d.y() == null) {
         _v.I(new d[4]);
      }

      return var10000;
   }

   public static double m(double var0, double var2) {
      return ThreadLocalRandom.current().nextDouble(var0, var2 + 1.0D);
   }

   public static float f(float var0, float var1) {
      return var0 + z.nextFloat() * (var1 - var0);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
