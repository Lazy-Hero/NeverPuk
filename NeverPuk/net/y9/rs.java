package net.y9;

import java.util.Random;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.lm;
import net.y9.n;
import net.y9.rv;
import net.y9.zu;
import net.yv.o8;
import net.yz.ac;

public class rs extends l implements lm {
   public static final net.yr.o k = net.yr.o.k("snowy");

   protected rs() {
      super(net.y1.l.m);
      this.r(this.b.T().s(k, Boolean.valueOf(false)));
      this.R(true);
      this.f(net.ys.r.M);
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      l var4 = var2.Z(var3.h()).Q();
      return var1.s(k, Boolean.valueOf(var4 == net.nb.f.V || var4 == net.nb.f.Tl));
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(!var1.x) {
         if(var1.y(var2.h()) < 4 && var1.Z(var2.h()).K() > 2) {
            var1.U(var2, net.nb.f.dl.p());
         } else if(var1.y(var2.h()) >= 9) {
            int var5 = 0;

            while(true) {
               net.u.j var6 = var2.F(var4.nextInt(3) - 1, var4.nextInt(5) - 3, var4.nextInt(3) - 1);
               if(var6.h() >= 0 && var6.h() < 256 && !var1.o(var6)) {
                  return;
               }

               net.yw.n var7 = var1.Z(var6.h());
               net.yw.n var8 = var1.Z(var6);
               if(var8.Q() == net.nb.f.dl && var8.i(rv.l) == rv.m.DIRT && var1.y(var6.h()) >= 4 && var7.K() <= 2) {
                  var1.U(var6, net.nb.f.p.p());
               }

               ++var5;
            }
         }
      }

   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.f.dl.X(net.nb.f.dl.p().s(rv.l, rv.m.DIRT), var2, var3);
   }

   public boolean L(net.yv.r var1, net.u.j var2, net.yw.n var3, boolean var4) {
      return true;
   }

   public boolean p(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      return true;
   }

   public void e(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      g3.v.w();
      net.u.j var6 = var3.h();
      int var7 = 0;
      int var9 = 0;
      int var10001 = var7 / 16;
      if(var1.Z(var6).Q().C == net.y1.l.q) {
         if(var2.nextInt(8) == 0) {
            n.v var10 = var1.P(var6).j(var2, var6);
            n var11 = var10.p().s();
            net.yw.n var12 = var11.p().s(var11.k(), var10);
            if(var11.p(var1, var6, var12)) {
               var1.k(var6, var12, 3);
            }
         }

         net.yw.n var15 = net.nb.f.TU.p().s(zu.p, zu.i.GRASS);
         if(net.nb.f.TU.p(var1, var6, var15)) {
            var1.k(var6, var15, 3);
         }

         net.u.j var8 = var6.F(var2.nextInt(3) - 1, (var2.nextInt(3) - 1) * var2.nextInt(3) / 2, var2.nextInt(3) - 1);
         if(var1.Z(var8.b()).Q() == net.nb.f.p) {
            if(var1.Z(var8).i()) {
               ;
            }

            ++var9;
         }
      }

      ++var7;
   }

   public ac k() {
      return ac.CUTOUT_MIPPED;
   }

   public int d(net.yw.n var1) {
      return 0;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{k});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
