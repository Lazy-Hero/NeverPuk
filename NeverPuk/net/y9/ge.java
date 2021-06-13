package net.y9;

import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yz.aq;

public class ge extends l {
   public static final net.yr.w D = net.yr.w.l("axis", aq.l.class);

   protected ge(net.y1.l var1) {
      super(var1, var1.f());
   }

   protected ge(net.y1.l var1, net.y1.h var2) {
      super(var1, var2);
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      int[] var3 = g3.v.w();
      switch(null.r[var2.ordinal()]) {
      case 1:
      case 2:
         switch(null.u[((aq.l)var1.i(D)).ordinal()]) {
         case 1:
            return var1.s(D, aq.l.Z);
         case 2:
            return var1.s(D, aq.l.X);
         default:
            return var1;
         }
      default:
         return var1;
      }
   }

   public net.yw.n D(int var1) {
      g3.v.w();
      aq.l var3 = aq.l.Y;
      int var4 = var1 & 12;
      if(var4 == 4) {
         var3 = aq.l.X;
      }

      if(var4 == 8) {
         var3 = aq.l.Z;
      }

      return this.p().s(D, var3);
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      aq.l var3 = (aq.l)var1.i(D);
      if(var3 == aq.l.X) {
         var2 |= 4;
      } else if(var3 == aq.l.Z) {
         var2 |= 8;
      }

      return var2;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{D});
   }

   protected ks l(net.yw.n var1) {
      return new ks(net.n0.y.q(this));
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return super.U(var1, var2, var3, var4, var5, var6, var7, var8).s(D, var3.r());
   }

   private static xn c(xn var0) {
      return var0;
   }
}
