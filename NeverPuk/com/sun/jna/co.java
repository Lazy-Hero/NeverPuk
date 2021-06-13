package com.sun.jna;

import com.sun.jna.ca;
import com.sun.jna.t;
import java.lang.reflect.Method;

public class co implements t {
   public static final t J = new co(true);
   public static final t a = new co(false);
   private final String B = "W";

   protected co(boolean var1) {
   }

   public String d(com.sun.jna.z var1, Method var2) {
      ca.E();
      String var4 = var2.getName();
      if(!var4.endsWith("W") && !var4.endsWith("A")) {
         var4 = var1.L(var4 + this.B, 63).y();
      }

      return var4;
   }

   private static UnsatisfiedLinkError a(UnsatisfiedLinkError var0) {
      return var0;
   }
}
