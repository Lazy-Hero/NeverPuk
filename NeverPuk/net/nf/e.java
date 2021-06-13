package net.nf;

import net.xn;
import net.nf.i;
import net.nf.r;

public class e extends i {
   public e(long var1, i var3) {
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
            if(!this.G(var6, var7, var9, var8, var3, var10, net.ns.i.y(net.nb.x.q), net.ns.i.y(net.nb.x.d5)) && !this.h(var6, var7, var9, var8, var3, var10, net.ns.i.y(net.nb.x.n), net.ns.i.y(net.nb.x.z)) && !this.h(var6, var7, var9, var8, var3, var10, net.ns.i.y(net.nb.x.y), net.ns.i.y(net.nb.x.z)) && !this.h(var6, var7, var9, var8, var3, var10, net.ns.i.y(net.nb.x.i), net.ns.i.y(net.nb.x.s))) {
               if(var10 == net.ns.i.y(net.nb.x.m)) {
                  int var11 = var6[var9 + 1 + (var8 + 1 - 1) * (var3 + 2)];
                  int var12 = var6[var9 + 1 + 1 + (var8 + 1) * (var3 + 2)];
                  int var13 = var6[var9 + 1 - 1 + (var8 + 1) * (var3 + 2)];
                  int var14 = var6[var9 + 1 + (var8 + 1 + 1) * (var3 + 2)];
                  if(var11 != net.ns.i.y(net.nb.x.F) && var12 != net.ns.i.y(net.nb.x.F) && var13 != net.ns.i.y(net.nb.x.F) && var14 != net.ns.i.y(net.nb.x.F)) {
                     var7[var9 + var8 * var3] = var10;
                  }

                  var7[var9 + var8 * var3] = net.ns.i.y(net.nb.x.U);
               }

               if(var10 == net.ns.i.y(net.nb.x.dQ)) {
                  int var17 = var6[var9 + 1 + (var8 + 1 - 1) * (var3 + 2)];
                  int var18 = var6[var9 + 1 + 1 + (var8 + 1) * (var3 + 2)];
                  int var19 = var6[var9 + 1 - 1 + (var8 + 1) * (var3 + 2)];
                  int var20 = var6[var9 + 1 + (var8 + 1 + 1) * (var3 + 2)];
                  if(var17 != net.ns.i.y(net.nb.x.m) && var18 != net.ns.i.y(net.nb.x.m) && var19 != net.ns.i.y(net.nb.x.m) && var20 != net.ns.i.y(net.nb.x.m) && var17 != net.ns.i.y(net.nb.x.L) && var18 != net.ns.i.y(net.nb.x.L) && var19 != net.ns.i.y(net.nb.x.L) && var20 != net.ns.i.y(net.nb.x.L) && var17 != net.ns.i.y(net.nb.x.F) && var18 != net.ns.i.y(net.nb.x.F) && var19 != net.ns.i.y(net.nb.x.F) && var20 != net.ns.i.y(net.nb.x.F)) {
                     if(var17 != net.ns.i.y(net.nb.x.e) && var20 != net.ns.i.y(net.nb.x.e) && var18 != net.ns.i.y(net.nb.x.e) && var19 != net.ns.i.y(net.nb.x.e)) {
                        var7[var9 + var8 * var3] = var10;
                     }

                     var7[var9 + var8 * var3] = net.ns.i.y(net.nb.x.A);
                  }

                  var7[var9 + var8 * var3] = net.ns.i.y(net.nb.x.v);
               }

               var7[var9 + var8 * var3] = var10;
            }

            ++var9;
         }

         ++var8;
      }

      return var7;
   }

   private boolean G(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(!C(var6, var7)) {
         return false;
      } else {
         int var9 = var1[var3 + 1 + (var4 + 1 - 1) * (var5 + 2)];
         int var10 = var1[var3 + 1 + 1 + (var4 + 1) * (var5 + 2)];
         int var11 = var1[var3 + 1 - 1 + (var4 + 1) * (var5 + 2)];
         int var12 = var1[var3 + 1 + (var4 + 1 + 1) * (var5 + 2)];
         if(this.D(var9, var7) && this.D(var10, var7) && this.D(var11, var7) && this.D(var12, var7)) {
            var2[var3 + var4 * var5] = var6;
         } else {
            var2[var3 + var4 * var5] = var8;
         }

         return true;
      }
   }

   private boolean h(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var6 != var7) {
         return false;
      } else {
         int var9 = var1[var3 + 1 + (var4 + 1 - 1) * (var5 + 2)];
         int var10 = var1[var3 + 1 + 1 + (var4 + 1) * (var5 + 2)];
         int var11 = var1[var3 + 1 - 1 + (var4 + 1) * (var5 + 2)];
         int var12 = var1[var3 + 1 + (var4 + 1 + 1) * (var5 + 2)];
         if(C(var9, var7) && C(var10, var7) && C(var11, var7) && C(var12, var7)) {
            var2[var3 + var4 * var5] = var6;
         } else {
            var2[var3 + var4 * var5] = var8;
         }

         return true;
      }
   }

   private boolean D(int var1, int var2) {
      if(C(var1, var2)) {
         return true;
      } else {
         net.ns.i var3 = net.ns.i.F(var1);
         net.ns.i var4 = net.ns.i.F(var2);
         net.ns.i var5 = var3.T();
         net.ns.i var6 = var4.T();
         return var5 == var6 || var5 == net.ns.i.MEDIUM || var6 == net.ns.i.MEDIUM;
      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
