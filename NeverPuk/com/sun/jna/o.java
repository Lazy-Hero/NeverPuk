package com.sun.jna;

import com.sun.jna.Function;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.b;
import com.sun.jna.ca;
import com.sun.jna.ck;
import com.sun.jna.t;
import java.lang.reflect.Method;

public class o implements t {
   protected int Q(Class var1) {
      int var2 = ca.E();
      if(b.class.isAssignableFrom(var1)) {
         var1 = ck.n(var1).E();
      }

      if(var1.isArray()) {
         return Pointer.i;
      } else {
         int var10000 = Native.T(var1);
         net.u.d.h(new net.u.d[1]);
         return var10000;
      }
   }

   public String d(com.sun.jna.z var1, Method var2) {
      String var4 = var2.getName();
      ca.E();
      int var5 = 0;
      Class[] var6 = var2.getParameterTypes();
      int var8 = var6.length;
      int var9 = 0;
      if(var9 < var8) {
         Class var10 = var6[var9];
         var5 += this.Q(var10);
         ++var9;
      }

      String var7 = var4 + "@" + var5;
      var8 = 63;
      Function var14 = var1.L(var7, var8);
      var4 = var14.y();
      return var4;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
