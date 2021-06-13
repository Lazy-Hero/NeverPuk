package net;

import net.p2;
import net.u.d;

public class x9 {
   private final p2 m;
   private final String T;
   private static d[] C;

   public x9(p2 var1, String var2) {
      this.m = var1;
      this.T = var2;
   }

   public p2 V() {
      return this.m;
   }

   public String G() {
      return this.T;
   }

   public String toString() {
      return this.T;
   }

   public static void c(d[] var0) {
      C = var0;
   }

   public static d[] y() {
      return C;
   }

   static {
      if(y() == null) {
         c(new d[2]);
      }

   }
}
