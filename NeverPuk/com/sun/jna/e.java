package com.sun.jna;

import com.sun.jna.r;
import java.lang.reflect.Method;

public class e extends r {
   private Method G;
   private Object[] i;
   private int o;

   e(Class var1, Method var2, Object[] var3, int var4) {
      super(var1);
      this.G = var2;
      this.i = var3;
      this.o = var4;
   }

   public Method s() {
      return this.G;
   }

   public Object[] Z() {
      return this.i;
   }

   public int c() {
      return this.o;
   }
}
