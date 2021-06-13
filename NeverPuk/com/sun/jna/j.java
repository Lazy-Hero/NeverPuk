package com.sun.jna;

import com.sun.jna.Function;
import com.sun.jna.p;
import java.lang.reflect.Method;

public class j extends p {
   private final Method h;

   j(Class var1, Function var2, Object[] var3, Method var4) {
      super(var1, var2, var3);
      this.h = var4;
   }

   public Method F() {
      return this.h;
   }
}
