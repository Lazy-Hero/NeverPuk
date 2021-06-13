package net.yr;

import com.google.common.base.MoreObjects;
import net.xn;
import net.yr.h;

public abstract class z implements h {
   private final Class t;
   private final String W;
   private static int[] C;

   protected z(String var1, Class var2) {
      this.t = var2;
      this.W = var1;
   }

   public String l() {
      return this.W;
   }

   public Class R() {
      return this.t;
   }

   public String toString() {
      return MoreObjects.toStringHelper(this).add("name", this.W).add("clazz", this.t).add("values", this.Z()).toString();
   }

   public boolean equals(Object var1) {
      int[] var2 = G();
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof net.yr.z)) {
         return false;
      } else {
         net.yr.z var3 = (net.yr.z)var1;
         return this.t.equals(var3.t) && this.W.equals(var3.W);
      }
   }

   public int hashCode() {
      return 31 * this.t.hashCode() + this.W.hashCode();
   }

   public static void e(int[] var0) {
      C = var0;
   }

   public static int[] G() {
      return C;
   }

   private static xn b(xn var0) {
      return var0;
   }

   static {
      e(new int[1]);
   }
}
