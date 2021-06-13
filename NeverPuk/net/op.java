package net;

import net.ra;
import net.xn;

class op {
   static final long e(long var0, long var2) {
      var0 = var0 * 31L;
      return var0 + var2;
   }

   static final long F(long var0, float var2) {
      String[] var3 = ra.C();
      var0 = var0 * 31L;
      return var2 == 0.0F?var0:var0 + (long)Float.floatToIntBits(var2);
   }

   static final long l(long var0, double var2) {
      String[] var4 = ra.C();
      var0 = var0 * 31L;
      return var2 == 0.0D?var0:var0 + Double.doubleToLongBits(var2);
   }

   static final int K(long var0) {
      return (int)(var0 ^ var0 >> 32);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
