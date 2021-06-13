package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.lu;
import net.yz.au;

public abstract class l6 extends lu {
   public static final net.yr.w h = net.yr.w.l("variant", l6.o.class);

   public l6() {
      g3.v.w();
      super(net.y1.l.z, net.y1.h.h);
      net.yw.n var2 = this.b.T();
      if(!this.l()) {
         var2 = var2.s(R, lu.k.BOTTOM);
      }

      this.r(var2.s(h, l6.o.DEFAULT));
      this.f(net.ys.r.M);
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.n0.y.q(net.nb.f.dM);
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.f.dM);
   }

   public net.yw.n D(int var1) {
      net.yw.n var2 = this.p().s(h, l6.o.DEFAULT);
      if(!this.l()) {
         var2 = var2.s(R, (var1 & 8) == 0?lu.k.BOTTOM:lu.k.TOP);
      }

      return var2;
   }

   public int d(net.yw.n var1) {
      g3.v.w();
      int var3 = 0;
      if(!this.l() && var1.i(R) == lu.k.TOP) {
         var3 |= 8;
      }

      return var3;
   }

   protected net.yw.q k() {
      return this.l()?new net.yw.q(this, new net.yr.h[]{h}):new net.yw.q(this, new net.yr.h[]{R, h});
   }

   public String G(int var1) {
      return super.j();
   }

   public net.yr.h R() {
      return h;
   }

   public Comparable b(ks var1) {
      return l6.o.DEFAULT;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class c extends l6 {
      public boolean l() {
         return false;
      }
   }

   public static enum o implements au {
      DEFAULT;

      public String f() {
         return "default";
      }
   }

   public static class t extends l6 {
      public boolean l() {
         return true;
      }
   }
}
