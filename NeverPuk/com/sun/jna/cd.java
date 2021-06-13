package com.sun.jna;

import com.sun.jna.cr;
import com.sun.jna.f;
import net.xn;

public abstract class cd extends cr {
   private static int[] J;

   protected cd(int var1) {
      U();
      super();
      this.R(new f((long)var1));
      net.u.d.h(new net.u.d[2]);
   }

   public static void m(int[] var0) {
      J = var0;
   }

   public static int[] U() {
      return J;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(U() != null) {
         m(new int[3]);
      }

   }
}
