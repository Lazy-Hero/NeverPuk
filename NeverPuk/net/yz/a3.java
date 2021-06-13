package net.yz;

import io.netty.util.ResourceLeakDetector;
import io.netty.util.ResourceLeakDetector.Level;
import net.xn;
import net.yz.m_;

public class a3 {
   public static final Level U = Level.DISABLED;
   public static final char[] J = new char[]{'.', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"'};
   public static final char[] b = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};

   public static boolean s(char var0) {
      int var1 = m_.J();
      return var0 != 167 && var0 >= 32 && var0 != 127;
   }

   public static String u(String var0) {
      m_.J();
      StringBuilder var2 = new StringBuilder();
      char[] var3 = var0.toCharArray();
      int var4 = var3.length;
      int var5 = 0;
      if(var5 < var4) {
         char var6 = var3[var5];
         if(s(var6)) {
            var2.append(var6);
         }

         ++var5;
      }

      return var2.toString();
   }

   static {
      ResourceLeakDetector.setLevel(U);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
