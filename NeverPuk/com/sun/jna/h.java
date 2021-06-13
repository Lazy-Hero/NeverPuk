package com.sun.jna;

import com.sun.jna.c;
import java.lang.reflect.Method;
import net.xn;

abstract class h {
   private h() {
   }

   static h B() {
      Method var0 = Method.class.getMethod("isVarArgs", new Class[0]);
      return new h.s();
   }

   abstract boolean t(Method var1);

   abstract int v(Method var1);

   private static final class n extends h {
      private n() {
         super(null);
      }

      boolean t(Method var1) {
         return false;
      }

      int v(Method var1) {
         return 0;
      }
   }

   private static final class s extends h {
      private s() {
         super(null);
      }

      boolean t(Method var1) {
         return var1.isVarArgs();
      }

      int v(Method var1) {
         net.u.d[] var2 = c.F();
         return var1.isVarArgs()?var1.getParameterTypes().length - 1:0;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
