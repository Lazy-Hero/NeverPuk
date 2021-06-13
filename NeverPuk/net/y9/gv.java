package net.y9;

import java.util.Random;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.rv;
import net.yv.o8;
import net.yz.ai;

public class gv extends l {
   public static final net.yr.o J = net.yr.o.k("snowy");

   protected gv() {
      super(net.y1.l.m, net.y1.h.Q);
      this.r(this.b.T().s(J, Boolean.valueOf(false)));
      this.R(true);
      this.f(net.ys.r.M);
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      l var4 = var2.Z(var3.h()).Q();
      return var1.s(J, Boolean.valueOf(var4 == net.nb.f.V || var4 == net.nb.f.Tl));
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      int[] var5 = g3.v.w();
      if(!var1.x) {
         if(var1.y(var2.h()) < 4 && var1.Z(var2.h()).K() > 2) {
            var1.U(var2, net.nb.f.dl.p().s(rv.l, rv.m.DIRT));
         }

         if(var1.y(var2.h()) >= 9) {
            int var6 = 0;
            net.u.j var7 = var2.F(var4.nextInt(3) - 1, var4.nextInt(5) - 3, var4.nextInt(3) - 1);
            net.yw.n var8 = var1.Z(var7);
            net.yw.n var9 = var1.Z(var7.h());
            if(var8.Q() == net.nb.f.dl && var8.i(rv.l) == rv.m.DIRT && var1.y(var7.h()) >= 4 && var9.K() <= 2) {
               var1.U(var7, this.p());
            }

            ++var6;
         }
      }

   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      super.Y(var1, var2, var3, var4);
      if(var4.nextInt(10) == 0) {
         var2.n(ai.TOWN_AURA, (double)((float)var3.t() + var4.nextFloat()), (double)((float)var3.h() + 1.1F), (double)((float)var3.y() + var4.nextFloat()), 0.0D, 0.0D, 0.0D, new int[0]);
      }

   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.f.dl.X(net.nb.f.dl.p().s(rv.l, rv.m.DIRT), var2, var3);
   }

   public int d(net.yw.n var1) {
      return 0;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{J});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
