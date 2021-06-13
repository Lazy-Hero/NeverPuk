package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.t;
import net.yv.o8;

public class zo extends t {
   public static final net.yr.l Y = net.yr.l.J("age", 0, 3);
   private static final net.u.e[] M = new net.u.e[]{new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.3125D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.6875D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D)};

   protected zo() {
      super(net.y1.l.u, net.y1.h.j);
      this.r(this.b.T().s(Y, Integer.valueOf(0)));
      this.R(true);
      this.f((net.ys.r)null);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return M[((Integer)var1.i(Y)).intValue()];
   }

   protected boolean H(net.yw.n var1) {
      return var1.Q() == net.nb.f.u9;
   }

   public boolean p(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return this.H(var1.Z(var2.b()));
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      int var5 = ((Integer)var3.i(Y)).intValue();
      if(var5 < 3 && var4.nextInt(10) == 0) {
         var3 = var3.s(Y, Integer.valueOf(var5 + 1));
         var1.k(var2, var3, 2);
      }

      super.P(var1, var2, var3, var4);
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
      int[] var6 = g3.v.w();
      if(!var1.x) {
         int var7 = 1;
         if(((Integer)var3.i(Y)).intValue() >= 3) {
            var7 = 2 + var1.G.nextInt(3);
            if(var5 > 0) {
               var7 = var7 + var1.G.nextInt(var5 + 1);
            }
         }

         int var8 = 0;
         e(var1, var2, new ks(net.nb.j.YG));
         ++var8;
      }

   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.SL;
   }

   public int T(Random var1) {
      return 0;
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.j.YG);
   }

   public net.yw.n D(int var1) {
      return this.p().s(Y, Integer.valueOf(var1));
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(Y)).intValue();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{Y});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
