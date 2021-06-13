package net.yz;

import net.xn;
import net.yz.m_;

public class ar {
   private static final Integer[] b = new Integer['\uffff'];

   public static Integer m(int var0) {
      int var1 = m_.g();
      return Integer.valueOf(var0 > 0 && var0 < b.length?b[var0].intValue():var0);
   }

   static {
      int var0 = 0;

      for(int var1 = b.length; var0 < var1; ++var0) {
         b[var0] = Integer.valueOf(var0);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
