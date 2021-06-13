package net.nv;

import net.nv.t;

public class p extends t {
   public p(String var1) {
      this("commands.generic.entity.notFound", new Object[]{var1});
   }

   public p(String var1, Object... var2) {
      super(var1, var2);
   }

   public synchronized Throwable fillInStackTrace() {
      return this;
   }
}
