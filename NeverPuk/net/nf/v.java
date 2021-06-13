package net.nf;

import net.xn;
import net.nf.i;
import net.nf.r;

public class v extends i {
   public v(long var1, i var3) {
      super(var1);
      this.j = var3;
   }

   public int[] Y(int var1, int var2, int var3, int var4) {
      int var6 = var1 - 1;
      i.D();
      int var7 = var2 - 1;
      int var8 = var3 + 2;
      int var9 = var4 + 2;
      int[] var10 = this.j.Y(var6, var7, var8, var9);
      int[] var11 = r.J(var3 * var4);
      int var12 = 0;
      if(var12 < var4) {
         int var13 = 0;
         if(var13 < var3) {
            int var14 = var10[var13 + 0 + (var12 + 0) * var8];
            int var15 = var10[var13 + 2 + (var12 + 0) * var8];
            int var16 = var10[var13 + 0 + (var12 + 2) * var8];
            int var17 = var10[var13 + 2 + (var12 + 2) * var8];
            int var18 = var10[var13 + 1 + (var12 + 1) * var8];
            this.N((long)(var13 + var1), (long)(var12 + var2));
            if(var18 == 0 && var14 == 0 && var15 == 0 && var16 == 0 && var17 == 0 && this.u(100) == 0) {
               var11[var13 + var12 * var3] = net.ns.i.y(net.nb.x.t);
            }

            var11[var13 + var12 * var3] = var18;
            ++var13;
         }

         ++var12;
      }

      return var11;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
