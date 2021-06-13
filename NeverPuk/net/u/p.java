package net.u;

import net.xn;
import net.ne.l;
import net.u.d;
import net.u.j;

public class p {
   public final int i;
   public final int y;
   private int p = 0;

   public p(int var1, int var2) {
      this.i = var1;
      this.y = var2;
   }

   public p(j var1) {
      this.i = var1.t() >> 4;
      this.y = var1.y() >> 4;
   }

   public static long M(int var0, int var1) {
      return (long)var0 & 4294967295L | ((long)var1 & 4294967295L) << 32;
   }

   public int hashCode() {
      d[] var1 = j.n();
      if(this.p != 0) {
         return this.p;
      } else {
         int var2 = 1664525 * this.i + 1013904223;
         int var3 = 1664525 * (this.y ^ -559038737) + 1013904223;
         this.p = var2 ^ var3;
         return this.p;
      }
   }

   public boolean equals(Object var1) {
      d[] var2 = j.n();
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof p)) {
         return false;
      } else {
         p var3 = (p)var1;
         return this.i == var3.i && this.y == var3.y;
      }
   }

   public double F(l var1) {
      double var2 = (double)(this.i * 16 + 8);
      double var4 = (double)(this.y * 16 + 8);
      double var6 = var2 - var1.b;
      double var8 = var4 - var1.hr;
      return var6 * var6 + var8 * var8;
   }

   public int e() {
      return this.i << 4;
   }

   public int P() {
      return this.y << 4;
   }

   public int S() {
      return (this.i << 4) + 15;
   }

   public int o() {
      return (this.y << 4) + 15;
   }

   public j S(int var1, int var2, int var3) {
      return new j((this.i << 4) + var1, var2, (this.y << 4) + var3);
   }

   public String toString() {
      return "[" + this.i + ", " + this.y + "]";
   }

   private static xn a(xn var0) {
      return var0;
   }
}
