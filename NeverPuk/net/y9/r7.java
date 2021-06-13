package net.y9;

import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.rt;
import net.yz.ax;

public class r7 extends rt {
   public static final net.yr.l n = net.yr.l.J("rotation", 0, 15);

   public r7() {
      this.r(this.b.T().s(n, Integer.valueOf(0)));
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      int[] var6 = g3.v.w();
      if(!var2.Z(var3.b()).n().B()) {
         this.N(var2, var3, var1, 0);
         var2.J(var3);
      }

      super.Z(var1, var2, var3, var4, var5);
   }

   public net.yw.n D(int var1) {
      return this.p().s(n, Integer.valueOf(var1));
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(n)).intValue();
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(n, Integer.valueOf(var2.K(((Integer)var1.i(n)).intValue(), 16)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.s(n, Integer.valueOf(var2.l(((Integer)var1.i(n)).intValue(), 16)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{n});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
