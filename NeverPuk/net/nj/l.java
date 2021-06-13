package net.nj;

import net.xn;
import net.nj.q;

public class l extends Exception {
   public l(String var1, String var2, int var3) {
      super(var1 + " at: " + B(var2, var3));
   }

   private static String B(String var0, int var1) {
      StringBuilder var3 = new StringBuilder();
      q.V();
      int var4 = Math.min(var0.length(), var1);
      if(var4 > 35) {
         var3.append("...");
      }

      var3.append(var0, Math.max(0, var4 - 35), var4);
      var3.append("<--[HERE]");
      return var3.toString();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
