package net.nf;

import net.xn;
import net.nf.i;
import net.nf.r;

public class y extends i {
   private net.ns.i[] C = new net.ns.i[]{net.nb.x.m, net.nb.x.m, net.nb.x.m, net.nb.x.u, net.nb.x.u, net.nb.x.v};
   private final net.ns.i[] x = new net.ns.i[]{net.nb.x.G, net.nb.x.o, net.nb.x.q, net.nb.x.v, net.nb.x.Y, net.nb.x.dQ};
   private final net.ns.i[] d = new net.ns.i[]{net.nb.x.G, net.nb.x.q, net.nb.x.s, net.nb.x.v};
   private final net.ns.i[] J = new net.ns.i[]{net.nb.x.F, net.nb.x.F, net.nb.x.F, net.nb.x.L};
   private final net.cn.z R;

   public y(long var1, i var3, net.yv.j var4, net.cn.z var5) {
      super(var1);
      this.j = var3;
      if(var4 == net.yv.j.f) {
         this.C = new net.ns.i[]{net.nb.x.m, net.nb.x.G, net.nb.x.q, net.nb.x.dQ, net.nb.x.v, net.nb.x.s};
         this.R = null;
      } else {
         this.R = var5;
      }

   }

   public int[] Y(int var1, int var2, int var3, int var4) {
      int[] var6 = this.j.Y(var1, var2, var3, var4);
      i.D();
      int[] var7 = r.J(var3 * var4);
      int var8 = 0;
      if(var8 < var4) {
         int var9 = 0;
         if(var9 < var3) {
            this.N((long)(var9 + var1), (long)(var8 + var2));
            int var10 = var6[var9 + var8 * var3];
            int var11 = (var10 & 3840) >> 8;
            var10 = var10 & -3841;
            if(this.R != null && this.R.Q >= 0) {
               var7[var9 + var8 * var3] = this.R.Q;
            }

            if(h(var10)) {
               var7[var9 + var8 * var3] = var10;
            }

            if(var10 == net.ns.i.y(net.nb.x.t)) {
               var7[var9 + var8 * var3] = var10;
            }

            if(var10 == 1) {
               if(var11 > 0) {
                  if(this.u(3) == 0) {
                     var7[var9 + var8 * var3] = net.ns.i.y(net.nb.x.y);
                  }

                  var7[var9 + var8 * var3] = net.ns.i.y(net.nb.x.n);
               }

               var7[var9 + var8 * var3] = net.ns.i.y(this.C[this.u(this.C.length)]);
            }

            if(var10 == 2) {
               var7[var9 + var8 * var3] = net.ns.i.y(net.nb.x.e);
               var7[var9 + var8 * var3] = net.ns.i.y(this.x[this.u(this.x.length)]);
            }

            if(var10 == 3) {
               var7[var9 + var8 * var3] = net.ns.i.y(net.nb.x.i);
               var7[var9 + var8 * var3] = net.ns.i.y(this.d[this.u(this.d.length)]);
            }

            if(var10 == 4) {
               var7[var9 + var8 * var3] = net.ns.i.y(this.J[this.u(this.J.length)]);
            }

            var7[var9 + var8 * var3] = net.ns.i.y(net.nb.x.t);
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
