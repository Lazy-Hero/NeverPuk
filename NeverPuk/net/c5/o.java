package net.c5;

import net.xn;
import net.c5.e;
import net.ni.su;
import net.y.d;
import net.y.r;
import net.y.u1;
import net.y8.x;
import net.y9.l;
import net.y9.ra;
import net.y9.rj;

public class o extends e {
   private final net.y.k C = net.nn.j.b().x();

   public void n(su var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      e.F();
      net.u.j var12 = var1.C();
      net.yw.n var13 = var1.w();
      l var14 = var13.Q();
      if(var13.n() != net.y1.l.q && var1.t(var8) < 1.0F) {
         r var15 = r.f();
         net.y.p var16 = var15.k();
         this.L(net.n9.b.N);
         u1.m();
         d.m(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA);
         d.C();
         d.j();
         if(net.nn.j.K()) {
            d.Q(7425);
         }

         d.Q(7424);
         var16.m(7, x.M);
         var16.S(var2 - (double)var12.t() + (double)var1.Q(var8), var4 - (double)var12.h() + (double)var1.N(var8), var6 - (double)var12.y() + (double)var1.A(var8));
         net.yv.r var17 = this.K();
         if(var14 == net.nb.f.dZ && Float.compare(var1.t(var8), 0.25F) <= 0) {
            var13 = var13.s(rj.Q, Boolean.valueOf(true));
            this.d(var12, var13, var16, var17, true);
         }

         if(var1.Z() && !var1.l()) {
            rj.n var18 = var14 == net.nb.f.oG?rj.n.STICKY:rj.n.DEFAULT;
            net.yw.n var19 = net.nb.f.dZ.p().s(rj.Y, var18).s(rj.n, var13.i(ra.n));
            var19 = var19.s(rj.Q, Boolean.valueOf(Float.compare(var1.t(var8), 0.5F) >= 0));
            this.d(var12, var19, var16, var17, true);
            var16.S(var2 - (double)var12.t(), var4 - (double)var12.h(), var6 - (double)var12.y());
            var13 = var13.s(ra.o, Boolean.valueOf(true));
            this.d(var12, var13, var16, var17, true);
         }

         this.d(var12, var13, var16, var17, false);
         var16.S(0.0D, 0.0D, 0.0D);
         var15.p();
         u1.B();
      }

   }

   private boolean d(net.u.j var1, net.yw.n var2, net.y.p var3, net.yv.r var4, boolean var5) {
      return this.C.j().x(var4, this.C.Z(var2), var2, var1, var3, var5);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
