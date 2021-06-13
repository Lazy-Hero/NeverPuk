package net;

import net.mf;
import net.xn;

public class bf {
   private final int r;
   private final int Z;

   public bf(int var1, int var2) {
      this.r = Math.min(var1, var2);
      this.Z = Math.max(var1, var2);
   }

   public boolean s(int var1) {
      String var2 = mf.O();
      return var1 < this.r?false:var1 <= this.Z;
   }

   public int n() {
      return this.r;
   }

   public int s() {
      return this.Z;
   }

   public String toString() {
      return "min: " + this.r + ", max: " + this.Z;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
