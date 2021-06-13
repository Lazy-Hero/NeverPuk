package net;

import net.xn;
import net.u.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class wr {
   private static final Logger O = LogManager.getLogger();
   private static final String G = "[Shaders] ";
   private static int[] J;

   public static void S(String var0) {
      O.error("[Shaders] " + var0);
   }

   public static void t(String var0) {
      O.warn("[Shaders] " + var0);
   }

   public static void H(String var0) {
      O.info("[Shaders] " + var0);
   }

   public static void N(String var0) {
      O.debug("[Shaders] " + var0);
   }

   public static void s(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      O.error("[Shaders] " + var2);
   }

   public static void f(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      O.warn("[Shaders] " + var2);
   }

   public static void w(String var0, Object... var1) {
      String var3 = String.format(var0, var1);
      W();
      O.info("[Shaders] " + var3);
      if(d.y() == null) {
         r(new int[4]);
      }

   }

   public static void v(String var0, Object... var1) {
      W();
      String var3 = String.format(var0, var1);
      O.debug("[Shaders] " + var3);
      d.h(new d[3]);
   }

   static {
      r((int[])null);
   }

   public static void r(int[] var0) {
      J = var0;
   }

   public static int[] W() {
      return J;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
