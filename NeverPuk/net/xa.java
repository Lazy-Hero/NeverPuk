package net;

import net.in;
import net.xn;
import net.u.d;

public class xa implements in {
   public String W;
   public int l;
   private static String[] J;

   public xa(int var1, String var2) {
      v();
      super();
      this.l = var1;
      this.W = var2;
      d.h(new d[5]);
   }

   public void B() {
      String[] var1 = v();
      if(E.sf != null) {
         if(E.sf.h() > 0.0F) {
            E.sf.f(this.W);
         }

      }
   }

   public int Q() {
      return this.l;
   }

   public String S() {
      return this.W;
   }

   public static void E(String[] var0) {
      J = var0;
   }

   public static String[] v() {
      return J;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(v() != null) {
         E(new String[1]);
      }

   }
}
