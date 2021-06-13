package net.yz;

import net.xn;
import net.yz.m_;
import org.apache.commons.lang3.Validate;

public class ap {
   private final long[] R;
   private final int m;
   private final long V;
   private final int B;

   public ap(int var1, int var2) {
      Validate.inclusiveBetween(1L, 32L, (long)var1);
      this.B = var2;
      this.m = var1;
      this.V = (1L << var1) - 1L;
      this.R = new long[net.u.t.s(var2 * var1, 64) / 64];
   }

   public void H(int var1, int var2) {
      m_.g();
      Validate.inclusiveBetween(0L, (long)(this.B - 1), (long)var1);
      Validate.inclusiveBetween(0L, this.V, (long)var2);
      int var4 = var1 * this.m;
      int var5 = var4 / 64;
      int var6 = ((var1 + 1) * this.m - 1) / 64;
      int var7 = var4 % 64;
      this.R[var5] = this.R[var5] & ~(this.V << var7) | ((long)var2 & this.V) << var7;
      if(var5 != var6) {
         int var8 = 64 - var7;
         int var9 = this.m - var8;
         this.R[var6] = this.R[var6] >>> var9 << var9 | ((long)var2 & this.V) >> var8;
      }

   }

   public int h(int var1) {
      Validate.inclusiveBetween(0L, (long)(this.B - 1), (long)var1);
      m_.g();
      int var3 = var1 * this.m;
      int var4 = var3 / 64;
      int var5 = ((var1 + 1) * this.m - 1) / 64;
      int var6 = var3 % 64;
      if(var4 == var5) {
         return (int)(this.R[var4] >>> var6 & this.V);
      } else {
         int var7 = 64 - var6;
         return (int)((this.R[var4] >>> var6 | this.R[var5] << var7) & this.V);
      }
   }

   public long[] x() {
      return this.R;
   }

   public int X() {
      return this.B;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
