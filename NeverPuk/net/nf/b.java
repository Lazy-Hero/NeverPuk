package net.nf;

import net.xn;
import net.nf.i;
import net.nf.r;

public class b extends i {
   public b(long var1) {
      super(var1);
   }

   public int[] Y(int var1, int var2, int var3, int var4) {
      i.D();
      int[] var6 = r.J(var3 * var4);
      int var7 = 0;
      if(var7 < var4) {
         int var8 = 0;
         if(var8 < var3) {
            this.N((long)(var1 + var8), (long)(var2 + var7));
            var6[var8 + var7 * var3] = this.u(10) == 0?1:0;
            ++var8;
         }

         ++var7;
      }

      if(var1 > -var3 && var1 <= 0 && var2 > -var4 && var2 <= 0) {
         var6[-var1 + -var2 * var3] = 1;
      }

      return var6;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
