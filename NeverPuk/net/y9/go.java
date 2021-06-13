package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.aq;
import net.yz.au;
import net.yz.ax;

public class go extends l {
   public static final net.yr.w r = net.yr.w.l("variant", go.n.class);
   private final l l;

   public go(net.y1.l var1, net.y1.h var2, l var3) {
      super(var1, var2);
      this.r(this.b.T().s(r, go.n.ALL_OUTSIDE));
      this.l = var3;
   }

   public int T(Random var1) {
      return Math.max(0, var1.nextInt(10) - 7);
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      switch(null.D[((go.n)var1.i(r)).ordinal()]) {
      case 1:
         return net.y1.h.U;
      case 2:
         return net.y1.h.g;
      case 3:
         return net.y1.h.g;
      default:
         return super.t(var1, var2, var3);
      }
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.n0.y.q(this.l);
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(this.l);
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p();
   }

   public net.yw.n D(int var1) {
      return this.p().s(r, go.n.S(var1));
   }

   public int d(net.yw.n var1) {
      return ((go.n)var1.i(r)).Y();
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      int[] var3 = g3.v.w();
      switch(null.h[var2.ordinal()]) {
      case 1:
         switch(null.D[((go.n)var1.i(r)).ordinal()]) {
         case 3:
         case 4:
            return var1.s(r, go.n.SOUTH_EAST);
         case 5:
            return var1.s(r, go.n.SOUTH);
         case 6:
            return var1.s(r, go.n.SOUTH_WEST);
         case 7:
            return var1.s(r, go.n.EAST);
         case 8:
            return var1.s(r, go.n.WEST);
         case 9:
            return var1.s(r, go.n.NORTH_EAST);
         case 10:
            return var1.s(r, go.n.NORTH);
         case 11:
            return var1.s(r, go.n.NORTH_WEST);
         default:
            return var1;
         }
      case 2:
         switch(null.D[((go.n)var1.i(r)).ordinal()]) {
         case 3:
         case 4:
            return var1.s(r, go.n.SOUTH_WEST);
         case 5:
            return var1.s(r, go.n.WEST);
         case 6:
            return var1.s(r, go.n.NORTH_WEST);
         case 7:
            return var1.s(r, go.n.SOUTH);
         case 8:
            return var1.s(r, go.n.NORTH);
         case 9:
            return var1.s(r, go.n.SOUTH_EAST);
         case 10:
            return var1.s(r, go.n.EAST);
         case 11:
            return var1.s(r, go.n.NORTH_EAST);
         default:
            return var1;
         }
      case 3:
         switch(null.D[((go.n)var1.i(r)).ordinal()]) {
         case 3:
         case 4:
            return var1.s(r, go.n.NORTH_EAST);
         case 5:
            return var1.s(r, go.n.EAST);
         case 6:
            return var1.s(r, go.n.SOUTH_EAST);
         case 7:
            return var1.s(r, go.n.NORTH);
         case 8:
            return var1.s(r, go.n.SOUTH);
         case 9:
            return var1.s(r, go.n.NORTH_WEST);
         case 10:
            return var1.s(r, go.n.WEST);
         case 11:
            return var1.s(r, go.n.SOUTH_WEST);
         default:
            return var1;
         }
      default:
         return var1;
      }
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      go.n var3 = (go.n)var1.i(r);
      switch(null.M[var2.ordinal()]) {
      case 1:
         switch(null.D[var3.ordinal()]) {
         case 4:
            return var1.s(r, go.n.SOUTH_WEST);
         case 5:
            return var1.s(r, go.n.SOUTH);
         case 6:
            return var1.s(r, go.n.SOUTH_EAST);
         case 7:
         case 8:
         default:
            return super.P(var1, var2);
         case 9:
            return var1.s(r, go.n.NORTH_WEST);
         case 10:
            return var1.s(r, go.n.NORTH);
         case 11:
            return var1.s(r, go.n.NORTH_EAST);
         }
      case 2:
         switch(null.D[var3.ordinal()]) {
         case 4:
            return var1.s(r, go.n.NORTH_EAST);
         case 5:
         case 10:
         default:
            break;
         case 6:
            return var1.s(r, go.n.NORTH_WEST);
         case 7:
            return var1.s(r, go.n.EAST);
         case 8:
            return var1.s(r, go.n.WEST);
         case 9:
            return var1.s(r, go.n.SOUTH_EAST);
         case 11:
            return var1.s(r, go.n.SOUTH_WEST);
         }
      default:
         return super.P(var1, var2);
      }
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{r});
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum n implements au {
      NORTH_WEST,
      NORTH,
      NORTH_EAST,
      WEST,
      CENTER,
      EAST,
      SOUTH_WEST,
      SOUTH,
      SOUTH_EAST,
      STEM,
      ALL_INSIDE,
      ALL_OUTSIDE,
      ALL_STEM;

      private static final go.n[] b;
      private final int L;
      private final String u;

      private n(int var3, String var4) {
         this.L = var3;
         this.u = var4;
      }

      public int Y() {
         return this.L;
      }

      public String toString() {
         return this.u;
      }

      public static go.n S(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= b.length) {
            var0 = 0;
         }

         go.n var2 = b[var0];
         return var2 == null?b[0]:var2;
      }

      public String f() {
         return this.u;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
