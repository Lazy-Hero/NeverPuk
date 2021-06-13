package net.nf;

import net.xn;
import net.nf.i;
import net.nf.r;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a extends i {
   private static final Logger a = LogManager.getLogger();
   private final i E;

   public a(long var1, i var3, i var4) {
      super(var1);
      this.j = var3;
      this.E = var4;
   }

   public int[] Y(int var1, int var2, int var3, int var4) {
      i.D();
      int[] var6 = this.j.Y(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      int[] var7 = this.E.Y(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      int[] var8 = r.J(var3 * var4);
      int var9 = 0;
      if(var9 < var4) {
         int var10 = 0;
         if(var10 < var3) {
            this.N((long)(var10 + var1), (long)(var9 + var2));
            int var11 = var6[var10 + 1 + (var9 + 1) * (var3 + 2)];
            int var12 = var7[var10 + 1 + (var9 + 1) * (var3 + 2)];
            boolean var13 = (var12 - 2) % 29 == 0;
            if(var11 > 255) {
               a.debug("old! {}", Integer.valueOf(var11));
            }

            net.ns.i var14 = net.ns.i.u(var11);
            if(var14 != null && var14.G()) {
               boolean var30 = true;
            } else {
               boolean var10000 = false;
            }

            if(var11 != 0 && var12 >= 2 && (var12 - 2) % 29 == 1) {
               net.ns.i var16 = net.ns.i.f(var14);
               var8[var10 + var9 * var3] = var16 == null?var11:net.ns.i.y(var16);
            }

            if(this.u(3) != 0) {
               var8[var10 + var9 * var3] = var11;
            }

            net.ns.i var25 = var14;
            if(var14 == net.nb.x.m) {
               var25 = net.nb.x.H;
            }

            if(var14 == net.nb.x.G) {
               var25 = net.nb.x.x;
            }

            if(var14 == net.nb.x.Y) {
               var25 = net.nb.x.a;
            }

            if(var14 == net.nb.x.o) {
               var25 = net.nb.x.v;
            }

            if(var14 == net.nb.x.s) {
               var25 = net.nb.x.T;
            }

            if(var14 == net.nb.x.i) {
               var25 = net.nb.x.dO;
            }

            if(var14 == net.nb.x.L) {
               var25 = net.nb.x.d6;
            }

            if(var14 == net.nb.x.v) {
               if(this.u(3) == 0) {
                  var25 = net.nb.x.x;
               }

               var25 = net.nb.x.G;
            }

            if(var14 == net.nb.x.F) {
               var25 = net.nb.x.j;
            }

            if(var14 == net.nb.x.e) {
               var25 = net.nb.x.w;
            }

            if(var14 == net.nb.x.r) {
               var25 = net.nb.x.b;
            }

            if(var14 == net.nb.x.q) {
               var25 = net.nb.x.U;
            }

            if(var14 == net.nb.x.u) {
               var25 = net.nb.x.c;
            }

            if(C(var11, net.ns.i.y(net.nb.x.n))) {
               var25 = net.nb.x.z;
            }

            if(var14 == net.nb.x.b && this.u(3) == 0) {
               int var17 = this.u(2);
               var25 = net.nb.x.v;
               var25 = net.nb.x.G;
            }

            int var28 = net.ns.i.y(var25);
            if(var28 == var11) {
               var8[var10 + var9 * var3] = var11;
            }

            int var18 = var6[var10 + 1 + (var9 + 0) * (var3 + 2)];
            int var19 = var6[var10 + 2 + (var9 + 1) * (var3 + 2)];
            int var20 = var6[var10 + 0 + (var9 + 1) * (var3 + 2)];
            int var21 = var6[var10 + 1 + (var9 + 2) * (var3 + 2)];
            int var22 = 0;
            if(C(var18, var11)) {
               ++var22;
            }

            if(C(var19, var11)) {
               ++var22;
            }

            if(C(var20, var11)) {
               ++var22;
            }

            if(C(var21, var11)) {
               ++var22;
            }

            var8[var10 + var9 * var3] = var11;
            ++var10;
         }

         ++var9;
      }

      return var8;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
