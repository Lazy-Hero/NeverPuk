package net.ny;

import net.xn;
import net.ny.f;

public class y {
   public final byte[] k;
   private final int f;
   private final int J;

   public y(byte[] var1, int var2) {
      this.k = var1;
      this.f = var2;
      this.J = var2 + 4;
   }

   public int I(int var1, int var2, int var3) {
      int var5 = var1 << this.J | var3 << this.f | var2;
      int var6 = var5 >> 1;
      f.h();
      int var7 = var5 & 1;
      return var7 == 0?this.k[var6] & 15:this.k[var6] >> 4 & 15;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
