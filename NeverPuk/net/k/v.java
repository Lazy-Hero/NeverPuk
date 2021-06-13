package net.k;

import net.xn;
import net.k.n;
import net.k.s;

public class v {
   private final int a;
   private final s v;

   public v(int var1, s var2) {
      this.a = var1;
      this.v = var2;
   }

   public int k() {
      return this.a;
   }

   public s V() {
      return this.v;
   }

   public boolean equals(Object var1) {
      String var2 = n.R();
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         v var3 = (v)var1;
         return this.a == var3.a;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
