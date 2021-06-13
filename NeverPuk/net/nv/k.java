package net.nv;

import net.nv.t;

public class k extends t {
   public k(String var1) {
      super(var1, new Object[0]);
   }

   public k(String var1, Object... var2) {
      super(var1, var2);
   }

   public synchronized Throwable fillInStackTrace() {
      return this;
   }
}
