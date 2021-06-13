package net;

import net._v;
import net.xn;
import net.u.d;

public class _6 {
   private long h = this.B();

   private long B() {
      return System.currentTimeMillis();
   }

   public boolean Z(double var1) {
      d[] var3 = _v.L();
      return Double.compare((double)(this.B() - this.h), var1) > 0;
   }

   public void B() {
      this.h = this.B();
   }

   public long U() {
      return this.B() - this.h;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
