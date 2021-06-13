package net;

import net.pr;
import net.xn;

public class iq {
   private String a;
   private String D;
   private String g;
   private boolean W;
   private pr N;
   private static String[] L;

   public String t() {
      return this.a;
   }

   public String p() {
      return this.D;
   }

   public String E() {
      return this.g;
   }

   public boolean f() {
      return this.W;
   }

   public pr A() {
      return this.N;
   }

   public String toString() {
      return String.format("AccountData[%s:%s:%s:%s]", new Object[]{this.a, this.g, this.D, Boolean.valueOf(this.W)});
   }

   public boolean equals(Object var1) {
      String[] var2 = Y();
      if(!(var1 instanceof iq)) {
         return false;
      } else {
         iq var3 = (iq)var1;
         return var3.E().equals(this.g) && var3.t().equals(this.a);
      }
   }

   public static void m(String[] var0) {
      L = var0;
   }

   public static String[] Y() {
      return L;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(Y() == null) {
         m(new String[1]);
      }

   }
}
