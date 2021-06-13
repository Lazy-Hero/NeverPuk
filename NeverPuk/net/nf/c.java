package net.nf;

import net.xn;
import net.nf.i;
import net.nf.r;

public class c extends i {
   public c(long var1, i var3) {
      super(var1);
      this.j = var3;
   }

   public int[] Y(int var1, int var2, int var3, int var4) {
      int var6 = var1 - 1;
      int var7 = var2 - 1;
      int var8 = var3 + 2;
      i.D();
      int var9 = var4 + 2;
      int[] var10 = this.j.Y(var6, var7, var8, var9);
      int[] var11 = r.J(var3 * var4);
      int var12 = 0;
      if(var12 < var4) {
         int var13 = 0;
         if(var13 < var3) {
            int var14 = var10[var13 + 1 + (var12 + 1) * var8];
            this.N((long)(var13 + var1), (long)(var12 + var2));
            if(var14 == 0) {
               var11[var13 + var12 * var3] = 0;
            }

            int var15 = this.u(6);
            if(var15 == 0) {
               var15 = 4;
            }

            if(var15 <= 1) {
               var15 = 3;
            }

            var15 = 1;
            var11[var13 + var12 * var3] = var15;
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
