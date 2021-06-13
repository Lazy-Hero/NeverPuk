package net.y9;

import net.xn;
import net.y9.g3;
import net.y9.l;
import net.yz.ax;

public class gg extends g3 {
   public static final net.yr.w p = net.yr.w.l("shape", g3.v.class);

   protected gg() {
      super(false);
      this.r(this.b.T().s(p, g3.v.NORTH_SOUTH));
   }

   protected void A(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4) {
      if(var4.p().o() && (new g3.g(var2, var3, var1)).l() == 3) {
         this.Z(var2, var3, var1, false);
      }

   }

   public net.yr.h J() {
      return p;
   }

   public net.yw.n D(int var1) {
      return this.p().s(p, g3.v.z(var1));
   }

   public int d(net.yw.n var1) {
      return ((g3.v)var1.i(p)).a();
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      int[] var3 = g3.v.w();
      switch(null.Q[var2.ordinal()]) {
      case 1:
         switch(null.e[((g3.v)var1.i(p)).ordinal()]) {
         case 1:
            return var1.s(p, g3.v.ASCENDING_WEST);
         case 2:
            return var1.s(p, g3.v.ASCENDING_EAST);
         case 3:
            return var1.s(p, g3.v.ASCENDING_SOUTH);
         case 4:
            return var1.s(p, g3.v.ASCENDING_NORTH);
         case 5:
            return var1.s(p, g3.v.NORTH_WEST);
         case 6:
            return var1.s(p, g3.v.NORTH_EAST);
         case 7:
            return var1.s(p, g3.v.SOUTH_EAST);
         case 8:
            return var1.s(p, g3.v.SOUTH_WEST);
         }
      case 2:
         switch(null.e[((g3.v)var1.i(p)).ordinal()]) {
         case 1:
            return var1.s(p, g3.v.ASCENDING_NORTH);
         case 2:
            return var1.s(p, g3.v.ASCENDING_SOUTH);
         case 3:
            return var1.s(p, g3.v.ASCENDING_WEST);
         case 4:
            return var1.s(p, g3.v.ASCENDING_EAST);
         case 5:
            return var1.s(p, g3.v.NORTH_EAST);
         case 6:
            return var1.s(p, g3.v.SOUTH_EAST);
         case 7:
            return var1.s(p, g3.v.SOUTH_WEST);
         case 8:
            return var1.s(p, g3.v.NORTH_WEST);
         case 9:
            return var1.s(p, g3.v.EAST_WEST);
         case 10:
            return var1.s(p, g3.v.NORTH_SOUTH);
         }
      case 3:
         switch(null.e[((g3.v)var1.i(p)).ordinal()]) {
         case 1:
            return var1.s(p, g3.v.ASCENDING_SOUTH);
         case 2:
            return var1.s(p, g3.v.ASCENDING_NORTH);
         case 3:
            return var1.s(p, g3.v.ASCENDING_EAST);
         case 4:
            return var1.s(p, g3.v.ASCENDING_WEST);
         case 5:
            return var1.s(p, g3.v.SOUTH_WEST);
         case 6:
            return var1.s(p, g3.v.NORTH_WEST);
         case 7:
            return var1.s(p, g3.v.NORTH_EAST);
         case 8:
            return var1.s(p, g3.v.SOUTH_EAST);
         case 9:
            return var1.s(p, g3.v.EAST_WEST);
         case 10:
            return var1.s(p, g3.v.NORTH_SOUTH);
         }
      default:
         return var1;
      }
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      g3.v var3 = (g3.v)var1.i(p);
      switch(null.K[var2.ordinal()]) {
      case 1:
         switch(null.e[var3.ordinal()]) {
         case 3:
            return var1.s(p, g3.v.ASCENDING_SOUTH);
         case 4:
            return var1.s(p, g3.v.ASCENDING_NORTH);
         case 5:
            return var1.s(p, g3.v.NORTH_EAST);
         case 6:
            return var1.s(p, g3.v.NORTH_WEST);
         case 7:
            return var1.s(p, g3.v.SOUTH_WEST);
         case 8:
            return var1.s(p, g3.v.SOUTH_EAST);
         default:
            return super.P(var1, var2);
         }
      case 2:
         switch(null.e[var3.ordinal()]) {
         case 1:
            return var1.s(p, g3.v.ASCENDING_WEST);
         case 2:
            return var1.s(p, g3.v.ASCENDING_EAST);
         case 3:
         case 4:
         default:
            break;
         case 5:
            return var1.s(p, g3.v.SOUTH_WEST);
         case 6:
            return var1.s(p, g3.v.SOUTH_EAST);
         case 7:
            return var1.s(p, g3.v.NORTH_EAST);
         case 8:
            return var1.s(p, g3.v.NORTH_WEST);
         }
      default:
         return super.P(var1, var2);
      }
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{p});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
