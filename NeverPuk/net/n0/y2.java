package net.n0;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.ky;
import net.n0.y;
import net.yz.m_;

public class y2 extends y {
   public y2() {
      this.V(new m_("angle"), new ky() {
         double a;
         double t;
         long d;

         public float k(ks var1, @Nullable net.yv.r var2, @Nullable net.ne.a var3) {
            int[] var4 = kw.b();
            if(var3 == null && !var1.E()) {
               return 0.0F;
            } else {
               boolean var5 = var3 != null;
               if(var2 == null) {
                  var2 = var3.hl;
               }

               if(var2.F.Z()) {
                  double var9 = this.x((net.nm.e)var3);
                  var9 = net.u.t.i(var9 / 360.0D, 1.0D);
                  double var11 = this.o(var2, var3) / 6.283185307179586D;
                  double var10000 = 0.5D - (var9 - 0.25D - var11);
               }

               double var7 = Math.random();
               var7 = this.b(var2, var7);
               return net.u.t.K((float)var7, 1.0F);
            }
         }

         private double b(net.yv.r var1, double var2) {
            if(var1.y() != this.d) {
               this.d = var1.y();
               double var4 = var2 - this.a;
               var4 = net.u.t.i(var4 + 0.5D, 1.0D) - 0.5D;
               this.t += var4 * 0.1D;
               this.t *= 0.8D;
               this.a = net.u.t.i(this.a + this.t, 1.0D);
            }

            return this.a;
         }

         private double x(net.nm.e var1) {
            return (double)net.u.t.b(180 + var1.uz.u() * 90);
         }

         private double o(net.yv.r var1, net.ne.l var2) {
            net.u.j var3 = var1.y();
            return Math.atan2((double)var3.y() - var2.hr, (double)var3.t() - var2.b);
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }
}
