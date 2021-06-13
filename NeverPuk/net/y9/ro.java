package net.y9;

import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.rt;
import net.y9.rw;
import net.yv.o8;
import net.yz.aq;
import net.yz.ax;

public class ro extends rt {
   public static final net.yr.g k = rw.N;
   protected static final net.u.e Q = new net.u.e(0.0D, 0.28125D, 0.0D, 0.125D, 0.78125D, 1.0D);
   protected static final net.u.e D = new net.u.e(0.875D, 0.28125D, 0.0D, 1.0D, 0.78125D, 1.0D);
   protected static final net.u.e R = new net.u.e(0.0D, 0.28125D, 0.0D, 1.0D, 0.78125D, 0.125D);
   protected static final net.u.e u = new net.u.e(0.0D, 0.28125D, 0.875D, 1.0D, 0.78125D, 1.0D);

   public ro() {
      this.r(this.b.T().s(k, aq.NORTH));
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      switch(null.H[((aq)var1.i(k)).ordinal()]) {
      case 1:
      default:
         return u;
      case 2:
         return R;
      case 3:
         return D;
      case 4:
         return Q;
      }
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      g3.v.w();
      aq var7 = (aq)var1.i(k);
      if(!var2.Z(var3.C(var7.f())).n().B()) {
         this.N(var2, var3, var1, 0);
         var2.J(var3);
      }

      super.Z(var1, var2, var3, var4, var5);
   }

   public net.yw.n D(int var1) {
      g3.v.w();
      aq var3 = aq.l(var1);
      if(var3.r() == aq.l.Y) {
         var3 = aq.NORTH;
      }

      return this.p().s(k, var3);
   }

   public int d(net.yw.n var1) {
      return ((aq)var1.i(k)).w();
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(k, var2.d((aq)var1.i(k)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(k)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{k});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
