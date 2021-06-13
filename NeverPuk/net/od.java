package net;

import net.g_;
import net.pq;

public abstract class od implements pq, g_ {
   private boolean v;
   private static String[] I;

   public boolean t() {
      return this.v;
   }

   public void H(boolean var1) {
      this.v = var1;
   }

   public static void p(String[] var0) {
      I = var0;
   }

   public static String[] O() {
      return I;
   }

   static {
      if(O() == null) {
         p(new String[3]);
      }

   }
}
