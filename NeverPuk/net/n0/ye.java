package net.n0;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.y9.g3;
import net.y9.zz;
import net.yz.ad;
import net.yz.aq;

public class ye extends y {
   private static final net.n4.k o = new net.n4.y() {
      private final net.n4.y B = new net.n4.y();

      public ks B(net.n4.i var1, ks var2) {
         aq var4 = (aq)var1.K().i(zz.H);
         net.yv.r var5 = var1.v();
         kw.b();
         double var6 = var1.e() + (double)var4.v() * 1.125D;
         double var8 = Math.floor(var1.A()) + (double)var4.z();
         double var10 = var1.x() + (double)var4.P() * 1.125D;
         net.u.j var12 = var1.X().C(var4);
         net.yw.n var13 = var5.Z(var12);
         g3.v var14 = var13.Q() instanceof g3?(g3.v)var13.i(((g3)var13.Q()).J()):g3.v.NORTH_SOUTH;
         if(g3.B(var13)) {
            if(var14.i()) {
               double var15 = 0.6D;
            }

            double var19 = 0.1D;
         }

         if(var13.n() == net.y1.l.q && g3.B(var5.Z(var12.b()))) {
            net.yw.n var17 = var5.Z(var12.b());
            g3.v var18 = var17.Q() instanceof g3?(g3.v)var17.i(((g3)var17.Q()).J()):g3.v.NORTH_SOUTH;
            if(var4 != aq.DOWN && var18.i()) {
               double var20 = -0.4D;
            }

            double var21 = -0.9D;
            net.nm.w var22 = net.nm.w.j(var5, var6, var8 + var21, var10, ((ye)var2.Z()).a);
            if(var2.v()) {
               var22.K(var2.j());
            }

            var5.S(var22);
            var2.H(1);
            return var2;
         } else {
            return this.B.M(var1, var2);
         }
      }

      protected void Q(net.n4.i var1) {
         var1.v().s(1000, var1.X(), 0);
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private final net.nm.w a;

   public ye(net.nm.w var1) {
      this.S = 1;
      this.a = var1;
      this.M(net.ys.r.Y);
      zz.f.H(this, o);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      kw.b();
      net.yw.n var10 = var2.Z(var3);
      if(!g3.B(var10)) {
         return ad.FAIL;
      } else {
         ks var11 = var1.o((net.yz.k)var4);
         if(!var2.x) {
            g3.v var12 = var10.Q() instanceof g3?(g3.v)var10.i(((g3)var10.Q()).J()):g3.v.NORTH_SOUTH;
            double var13 = 0.0D;
            if(var12.i()) {
               var13 = 0.5D;
            }

            net.nm.w var15 = net.nm.w.j(var2, (double)var3.t() + 0.5D, (double)var3.h() + 0.0625D + var13, (double)var3.y() + 0.5D, this.a);
            if(var11.v()) {
               var15.K(var11.j());
            }

            var2.S(var15);
         }

         var11.H(1);
         return ad.SUCCESS;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
