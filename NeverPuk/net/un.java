package net;

import net._v;
import net.x0;
import net.xn;
import net.u.d;

public abstract class un implements x0 {
   private final String x;
   private final String d;
   private final String t;
   private final String[] M;
   private static String g;

   public un(String var1, String var2, String var3, String... var4) {
      R();
      this.x = var1;
      this.d = var2;
      this.M = var4;
      this.t = var3;
      d.h(new d[3]);
   }

   public void I() {
      _v.A("§cInvalid usage, try: " + this.t);
   }

   public String i() {
      return this.t;
   }

   public String h() {
      return this.x;
   }

   public String w() {
      return this.d;
   }

   public String[] A() {
      return this.M;
   }

   public static void T(String var0) {
      g = var0;
   }

   public static String R() {
      return g;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(R() != null) {
         T("ygQ8Nc");
      }

   }
}
