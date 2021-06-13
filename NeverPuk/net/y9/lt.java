package net.y9;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.gc;
import net.y9.l2;
import net.yv.o8;

public class lt extends l2 {
   public static final net.yr.w k = net.yr.w.L("variant", gc.i.class, new Predicate() {
      public boolean j(@Nullable gc.i var1) {
         int[] var2 = g3.v.w();
         return var1.B() >= 4;
      }

      private static xn a(xn var0) {
         return var0;
      }
   });

   public lt() {
      this.r(this.b.T().s(k, gc.i.ACACIA).s(l, l2.g.Y));
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      gc.i var4 = (gc.i)var1.i(k);
      switch(null.Q[((l2.g)var1.i(l)).ordinal()]) {
      case 1:
      case 2:
      case 3:
      default:
         switch(null.J[var4.ordinal()]) {
         case 1:
         default:
            return net.y1.h.q;
         case 2:
            return gc.i.DARK_OAK.t();
         }
      case 4:
         return var4.t();
      }
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      var2.add(new ks(this, 1, gc.i.ACACIA.B() - 4));
      var2.add(new ks(this, 1, gc.i.DARK_OAK.B() - 4));
   }

   public net.yw.n D(int var1) {
      g3.v.w();
      net.yw.n var3 = this.p().s(k, gc.i.r((var1 & 3) + 4));
      switch(var1 & 12) {
      case 0:
         var3 = var3.s(l, l2.g.Y);
      case 4:
         var3 = var3.s(l, l2.g.X);
      case 8:
         var3 = var3.s(l, l2.g.Z);
      default:
         var3 = var3.s(l, l2.g.NONE);
         return var3;
      }
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((gc.i)var1.i(k)).B() - 4;
      switch(null.Q[((l2.g)var1.i(l)).ordinal()]) {
      case 1:
         var2 |= 4;
         break;
      case 2:
         var2 |= 8;
         break;
      case 3:
         var2 |= 12;
      }

      return var2;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{k, l});
   }

   protected ks l(net.yw.n var1) {
      return new ks(net.n0.y.q(this), 1, ((gc.i)var1.i(k)).B() - 4);
   }

   public int z(net.yw.n var1) {
      return ((gc.i)var1.i(k)).B() - 4;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
