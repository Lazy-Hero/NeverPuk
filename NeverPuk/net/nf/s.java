package net.nf;

import net.xn;
import net.nf.i;
import net.nf.r;

public class s extends i {
   public s(long var1, i var3) {
      super(var1);
      this.j = var3;
   }

   public int[] Y(int var1, int var2, int var3, int var4) {
      i.D();
      int[] var6 = this.j.Y(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      int[] var7 = r.J(var3 * var4);
      int var8 = 0;
      if(var8 < var4) {
         int var9 = 0;
         if(var9 < var3) {
            this.N((long)(var9 + var1), (long)(var8 + var2));
            int var10 = var6[var9 + 1 + (var8 + 1) * (var3 + 2)];
            if(this.u(57) == 0) {
               if(var10 == net.ns.i.y(net.nb.x.v)) {
                  var7[var9 + var8 * var3] = net.ns.i.y(net.nb.x.p);
               }

               var7[var9 + var8 * var3] = var10;
            }

            var7[var9 + var8 * var3] = var10;
            ++var9;
         }

         ++var8;
      }

      return var7;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
