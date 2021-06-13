package net.y9;

import java.util.Random;
import net.xn;
import net.y9.g3;
import net.y9.v;
import net.yv.o8;

public class x extends v {
   public static final net.yr.l n = net.yr.l.J("age", 0, 3);
   private static final net.u.e[] Y = new net.u.e[]{new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D)};

   protected net.yr.l K() {
      return n;
   }

   public int E() {
      return 3;
   }

   protected net.n0.y c() {
      return net.nb.j.WY;
   }

   protected net.n0.y Z() {
      return net.nb.j.YN;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      int[] var5 = g3.v.w();
      if(var4.nextInt(3) == 0) {
         this.F(var1, var2, var3);
      }

      super.P(var1, var2, var3, var4);
   }

   protected int r(net.yv.r var1) {
      return super.r(var1) / 3;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{n});
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return Y[((Integer)var1.i(this.K())).intValue()];
   }

   private static xn a(xn var0) {
      return var0;
   }
}
