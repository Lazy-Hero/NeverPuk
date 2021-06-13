package com.sun.jna;

import com.sun.jna.c;
import com.sun.jna.d;

public class ct extends RuntimeException {
   private static final long serialVersionUID = 1L;
   private int Q;

   private static String j(int var0) {
      return d.o()?"GetLastError() returned " + var0:"errno was " + var0;
   }

   private static String h(String var0) {
      return j(Integer.parseInt(var0));
   }

   public int d() {
      return this.Q;
   }

   public ct(String var1) {
      c.F();
      super(h(var1.trim()));
      if(var1.startsWith("[")) {
         var1 = var1.substring(1, var1.indexOf("]"));
      }

      this.Q = Integer.parseInt(var1);
   }

   public ct(int var1) {
      this(var1, j(var1));
   }

   protected ct(int var1, String var2) {
      super(var2);
      this.Q = var1;
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }
}
