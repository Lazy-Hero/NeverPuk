package net.nf;

import net.xn;
import net.nf.i;
import net.nf.r;

public class z extends i {
   private final i P;
   private final i U;

   public z(long var1, i var3, i var4) {
      super(var1);
      this.P = var3;
      this.U = var4;
   }

   public void y(long var1) {
      this.P.y(var1);
      this.U.y(var1);
      super.y(var1);
   }

   public int[] Y(int var1, int var2, int var3, int var4) {
      int[] var6 = this.P.Y(var1, var2, var3, var4);
      i.D();
      int[] var7 = this.U.Y(var1, var2, var3, var4);
      int[] var8 = r.J(var3 * var4);
      int var9 = 0;
      if(var9 < var3 * var4) {
         if(var6[var9] != net.ns.i.y(net.nb.x.r) && var6[var9] != net.ns.i.y(net.nb.x.b)) {
            if(var7[var9] == net.ns.i.y(net.nb.x.M)) {
               if(var6[var9] == net.ns.i.y(net.nb.x.F)) {
                  var8[var9] = net.ns.i.y(net.nb.x.d);
               }

               if(var6[var9] != net.ns.i.y(net.nb.x.t) && var6[var9] != net.ns.i.y(net.nb.x.J)) {
                  var8[var9] = var7[var9] & 255;
               }

               var8[var9] = net.ns.i.y(net.nb.x.J);
            }

            var8[var9] = var6[var9];
         }

         var8[var9] = var6[var9];
         ++var9;
      }

      return var8;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
