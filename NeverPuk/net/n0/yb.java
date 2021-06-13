package net.n0;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.ky;
import net.n0.y;
import net.yz.m_;

public class yb extends y {
   public yb() {
      this.V(new m_("time"), new ky() {
         double e;
         double y;
         long L;

         public float k(ks var1, @Nullable net.yv.r var2, @Nullable net.ne.a var3) {
            int[] var4 = kw.b();
            boolean var5 = true;
            if(var2 == null && var3 != null) {
               var2 = var3.hl;
            }

            if(var2 == null) {
               return 0.0F;
            } else {
               if(var2.F.Z()) {
                  double var7 = (double)var2.H(1.0F);
               }

               double var9 = Math.random();
               var9 = this.H(var2, var9);
               return (float)var9;
            }
         }

         private double H(net.yv.r var1, double var2) {
            int[] var4 = kw.b();
            if(var1.y() != this.L) {
               this.L = var1.y();
               double var5 = var2 - this.e;
               var5 = net.u.t.i(var5 + 0.5D, 1.0D) - 0.5D;
               this.y += var5 * 0.1D;
               this.y *= 0.9D;
               this.e = net.u.t.i(this.e + this.y, 1.0D);
            }

            return this.e;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }
}
