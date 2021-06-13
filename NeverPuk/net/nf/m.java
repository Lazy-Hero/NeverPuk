package net.nf;

import net.xn;
import net.nf.i;
import net.nf.r;
import net.ns.w;

public class m extends i {
   public m(long var1, i var3) {
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
            net.ns.i var11 = net.ns.i.F(var10);
            if(var10 == net.ns.i.y(net.nb.x.t)) {
               int var12 = var6[var9 + 1 + (var8 + 1 - 1) * (var3 + 2)];
               int var13 = var6[var9 + 1 + 1 + (var8 + 1) * (var3 + 2)];
               int var14 = var6[var9 + 1 - 1 + (var8 + 1) * (var3 + 2)];
               int var15 = var6[var9 + 1 + (var8 + 1 + 1) * (var3 + 2)];
               if(var12 != net.ns.i.y(net.nb.x.r) && var13 != net.ns.i.y(net.nb.x.r) && var14 != net.ns.i.y(net.nb.x.r) && var15 != net.ns.i.y(net.nb.x.r)) {
                  var7[var9 + var8 * var3] = var10;
               }

               var7[var9 + var8 * var3] = net.ns.i.y(net.nb.x.J);
            }

            if(var11 != null && var11.g() == net.ns.k.class) {
               int var18 = var6[var9 + 1 + (var8 + 1 - 1) * (var3 + 2)];
               int var21 = var6[var9 + 1 + 1 + (var8 + 1) * (var3 + 2)];
               int var24 = var6[var9 + 1 - 1 + (var8 + 1) * (var3 + 2)];
               int var27 = var6[var9 + 1 + (var8 + 1 + 1) * (var3 + 2)];
               if(this.C(var18) && this.C(var21) && this.C(var24) && this.C(var27)) {
                  if(!h(var18) && !h(var21) && !h(var24) && !h(var27)) {
                     var7[var9 + var8 * var3] = var10;
                  }

                  var7[var9 + var8 * var3] = net.ns.i.y(net.nb.x.dL);
               }

               var7[var9 + var8 * var3] = net.ns.i.y(net.nb.x.A);
            }

            if(var10 != net.ns.i.y(net.nb.x.q) && var10 != net.ns.i.y(net.nb.x.U) && var10 != net.ns.i.y(net.nb.x.d5)) {
               if(var11 != null && var11.i()) {
                  this.b(var6, var7, var9, var8, var3, var10, net.ns.i.y(net.nb.x.I));
               }

               if(var10 != net.ns.i.y(net.nb.x.z) && var10 != net.ns.i.y(net.nb.x.n)) {
                  if(var10 != net.ns.i.y(net.nb.x.r) && var10 != net.ns.i.y(net.nb.x.b) && var10 != net.ns.i.y(net.nb.x.M) && var10 != net.ns.i.y(net.nb.x.dQ)) {
                     int var19 = var6[var9 + 1 + (var8 + 1 - 1) * (var3 + 2)];
                     int var22 = var6[var9 + 1 + 1 + (var8 + 1) * (var3 + 2)];
                     int var25 = var6[var9 + 1 - 1 + (var8 + 1) * (var3 + 2)];
                     int var28 = var6[var9 + 1 + (var8 + 1 + 1) * (var3 + 2)];
                     if(!h(var19) && !h(var22) && !h(var25) && !h(var28)) {
                        var7[var9 + var8 * var3] = var10;
                     }

                     var7[var9 + var8 * var3] = net.ns.i.y(net.nb.x.dL);
                  }

                  var7[var9 + var8 * var3] = var10;
               }

               int var20 = var6[var9 + 1 + (var8 + 1 - 1) * (var3 + 2)];
               int var23 = var6[var9 + 1 + 1 + (var8 + 1) * (var3 + 2)];
               int var26 = var6[var9 + 1 - 1 + (var8 + 1) * (var3 + 2)];
               int var29 = var6[var9 + 1 + (var8 + 1 + 1) * (var3 + 2)];
               if(!h(var20) && !h(var23) && !h(var26) && !h(var29)) {
                  if(this.K(var20) && this.K(var23) && this.K(var26) && this.K(var29)) {
                     var7[var9 + var8 * var3] = var10;
                  }

                  var7[var9 + var8 * var3] = net.ns.i.y(net.nb.x.m);
               }

               var7[var9 + var8 * var3] = var10;
            }

            this.b(var6, var7, var9, var8, var3, var10, net.ns.i.y(net.nb.x.O));
            ++var9;
         }

         ++var8;
      }

      return var7;
   }

   private void b(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7) {
      if(h(var6)) {
         var2[var3 + var4 * var5] = var6;
      } else {
         int var8 = var1[var3 + 1 + (var4 + 1 - 1) * (var5 + 2)];
         int var9 = var1[var3 + 1 + 1 + (var4 + 1) * (var5 + 2)];
         int var10 = var1[var3 + 1 - 1 + (var4 + 1) * (var5 + 2)];
         int var11 = var1[var3 + 1 + (var4 + 1 + 1) * (var5 + 2)];
         if(!h(var8) && !h(var9) && !h(var10) && !h(var11)) {
            var2[var3 + var4 * var5] = var6;
         } else {
            var2[var3 + var4 * var5] = var7;
         }
      }

   }

   private boolean C(int var1) {
      return net.ns.i.F(var1) != null && net.ns.i.F(var1).g() == net.ns.k.class?true:var1 == net.ns.i.y(net.nb.x.A) || var1 == net.ns.i.y(net.nb.x.e) || var1 == net.ns.i.y(net.nb.x.w) || var1 == net.ns.i.y(net.nb.x.G) || var1 == net.ns.i.y(net.nb.x.s) || h(var1);
   }

   private boolean K(int var1) {
      return net.ns.i.F(var1) instanceof w;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
