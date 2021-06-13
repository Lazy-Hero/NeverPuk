package com.sun.jna;

import com.sun.jna.Function;
import com.sun.jna.c9;
import java.lang.reflect.Method;

public class ch extends c9 {
   private Method V;

   ch(Function var1, Object[] var2, int var3, Method var4) {
      super(var1, var2, var3);
      this.V = var4;
   }

   public Method K() {
      return this.V;
   }
}
