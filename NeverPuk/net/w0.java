package net;

import net.mf;
import net.xn;

public class w0 {
   private static final int N = 4096;
   private static final Integer[] z = Z(4096);

   private static Integer[] Z(int var0) {
      Integer[] var1 = new Integer[var0];

      for(int var2 = 0; var2 < var0; ++var2) {
         var1[var2] = new Integer(var2);
      }

      return var1;
   }

   public static Integer r(int var0) {
      String var1 = mf.O();
      return var0 >= 0 && var0 < 4096?z[var0]:new Integer(var0);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
