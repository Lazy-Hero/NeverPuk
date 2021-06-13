package net.y9;

import net.xn;
import net.y9.g3;
import net.y9.l;

public class g {
   private final net.u.j j;
   private final l d;
   private final int w;
   private final int r;

   public g(net.u.j var1, l var2, int var3, int var4) {
      this.j = var1;
      this.w = var3;
      this.r = var4;
      this.d = var2;
   }

   public net.u.j U() {
      return this.j;
   }

   public int p() {
      return this.w;
   }

   public int v() {
      return this.r;
   }

   public l S() {
      return this.d;
   }

   public boolean equals(Object var1) {
      int[] var2 = g3.v.w();
      if(!(var1 instanceof g)) {
         return false;
      } else {
         g var3 = (g)var1;
         return this.j.equals(var3.j) && this.w == var3.w && this.r == var3.r && this.d == var3.d;
      }
   }

   public String toString() {
      return "TE(" + this.j + ")," + this.w + "," + this.r + "," + this.d;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
