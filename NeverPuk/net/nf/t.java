package net.nf;

import net.xn;
import net.nf.i;
import net.nf.r;

public class t extends i {
   public t(long var1, i var3) {
      super(var1);
      super.j = var3;
   }

   public int[] Y(int var1, int var2, int var3, int var4) {
      int var6 = var1 - 1;
      int var7 = var2 - 1;
      int var8 = var3 + 2;
      int var9 = var4 + 2;
      i.D();
      int[] var10 = this.j.Y(var6, var7, var8, var9);
      int[] var11 = r.J(var3 * var4);
      int var12 = 0;
      if(var12 < var4) {
         int var13 = 0;
         if(var13 < var3) {
            int var14 = this.k(var10[var13 + 0 + (var12 + 1) * var8]);
            int var15 = this.k(var10[var13 + 2 + (var12 + 1) * var8]);
            int var16 = this.k(var10[var13 + 1 + (var12 + 0) * var8]);
            int var17 = this.k(var10[var13 + 1 + (var12 + 2) * var8]);
            int var18 = this.k(var10[var13 + 1 + (var12 + 1) * var8]);
            if(var18 == var14 && var18 == var16 && var18 == var15 && var18 == var17) {
               var11[var13 + var12 * var3] = -1;
            }

            var11[var13 + var12 * var3] = net.ns.i.y(net.nb.x.M);
            ++var13;
         }

         ++var12;
      }

      return var11;
   }

   private int k(int var1) {
      return var1 >= 2?2 + (var1 & 1):var1;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
