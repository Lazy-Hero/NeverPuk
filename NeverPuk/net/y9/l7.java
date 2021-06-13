package net.y9;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.gc;
import net.y9.l2;
import net.yv.o8;

public class l7 extends l2 {
   public static final net.yr.w d = net.yr.w.L("variant", gc.i.class, new Predicate() {
      public boolean D(@Nullable gc.i var1) {
         int[] var2 = g3.v.w();
         return var1.B() < 4;
      }

      private static xn a(xn var0) {
         return var0;
      }
   });

   public l7() {
      this.r(this.b.T().s(d, gc.i.OAK).s(l, l2.g.Y));
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      g3.v.w();
      gc.i var5 = (gc.i)var1.i(d);
      switch(null.L[((l2.g)var1.i(l)).ordinal()]) {
      case 1:
      case 2:
      case 3:
      default:
         switch(null.t[var5.ordinal()]) {
         case 1:
         default:
            return gc.i.SPRUCE.t();
         case 2:
            return gc.i.DARK_OAK.t();
         case 3:
            return net.y1.h.K;
         case 4:
            return gc.i.SPRUCE.t();
         }
      case 4:
         return var5.t();
      }
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      var2.add(new ks(this, 1, gc.i.OAK.B()));
      var2.add(new ks(this, 1, gc.i.SPRUCE.B()));
      var2.add(new ks(this, 1, gc.i.BIRCH.B()));
      var2.add(new ks(this, 1, gc.i.JUNGLE.B()));
   }

   public net.yw.n D(int var1) {
      g3.v.w();
      net.yw.n var3 = this.p().s(d, gc.i.r((var1 & 3) % 4));
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
      var2 = var2 | ((gc.i)var1.i(d)).B();
      switch(null.L[((l2.g)var1.i(l)).ordinal()]) {
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
      return new net.yw.q(this, new net.yr.h[]{d, l});
   }

   protected ks l(net.yw.n var1) {
      return new ks(net.n0.y.q(this), 1, ((gc.i)var1.i(d)).B());
   }

   public int z(net.yw.n var1) {
      return ((gc.i)var1.i(d)).B();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
