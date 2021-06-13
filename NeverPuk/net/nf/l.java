package net.nf;

import net.xn;
import net.nf.i;
import net.nf.r;

public class l extends i {
   public l(long var1, i var3) {
      super(var1);
      super.j = var3;
   }

   public int[] Y(int var1, int var2, int var3, int var4) {
      int var6 = var1 >> 1;
      i.D();
      int var7 = var2 >> 1;
      int var8 = (var3 >> 1) + 2;
      int var9 = (var4 >> 1) + 2;
      int[] var10 = this.j.Y(var6, var7, var8, var9);
      int var11 = var8 - 1 << 1;
      int var12 = var9 - 1 << 1;
      int[] var13 = r.J(var11 * var12);
      int var14 = 0;
      if(var14 < var9 - 1) {
         int var15 = (var14 << 1) * var11;
         int var16 = 0;
         int var17 = var10[var16 + 0 + (var14 + 0) * var8];
         int var18 = var10[var16 + 0 + (var14 + 1) * var8];
         if(var16 < var8 - 1) {
            this.N((long)(var16 + var6 << 1), (long)(var14 + var7 << 1));
            int var19 = var10[var16 + 1 + (var14 + 0) * var8];
            int var20 = var10[var16 + 1 + (var14 + 1) * var8];
            var13[var15] = var17;
            var13[var15++ + var11] = this.G(new int[]{var17, var18});
            var13[var15] = this.G(new int[]{var17, var19});
            var13[var15++ + var11] = this.p(var17, var19, var18, var20);
            ++var16;
         }

         ++var14;
      }

      int[] var22 = r.J(var3 * var4);
      int var25 = 0;
      if(var25 < var4) {
         System.arraycopy(var13, (var25 + (var2 & 1)) * var11 + (var1 & 1), var22, var25 * var3, var3);
         ++var25;
      }

      return var22;
   }

   public static i n(long var0, i var2, int var3) {
      Object var4 = var2;

      for(int var5 = 0; var5 < var3; ++var5) {
         var4 = new l(var0 + (long)var5, (i)var4);
      }

      return (i)var4;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
