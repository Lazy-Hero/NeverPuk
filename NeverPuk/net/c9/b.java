package net.c9;

import java.util.Map;
import net.c9.m;

public class b {
   private static m p;
   private static int[] d;

   static void g(m var0) {
      p = var0;
   }

   public static String x(String var0, Object... var1) {
      return p.w(var0, var1);
   }

   public static boolean q(String var0) {
      return p.I(var0);
   }

   public static Map j() {
      return p.f;
   }

   public static void t(int[] var0) {
      d = var0;
   }

   public static int[] K() {
      return d;
   }

   static {
      if(K() != null) {
         t(new int[5]);
      }

   }
}
