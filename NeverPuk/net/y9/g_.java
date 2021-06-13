package net.y9;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.y9.g3;
import net.y9.g8;
import net.y9.z1;
import net.yv.o8;
import net.yz.ac;
import net.yz.ax;

public class g_ extends g8 {
   public static final net.yr.w H = net.yr.w.l("color", kw.class);

   public g_() {
      super(net.y1.l.y, false);
      this.r(this.b.T().s(l, Boolean.valueOf(false)).s(k, Boolean.valueOf(false)).s(n, Boolean.valueOf(false)).s(d, Boolean.valueOf(false)).s(H, kw.WHITE));
      this.f(net.ys.r.X);
   }

   public int z(net.yw.n var1) {
      return ((kw)var1.i(H)).d();
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      g3.v.w();
      int var4 = 0;
      if(var4 < kw.values().length) {
         var2.add(new ks(this, 1, var4));
         ++var4;
      }

   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return net.y1.h.o((kw)var1.i(H));
   }

   public ac k() {
      return ac.TRANSLUCENT;
   }

   public net.yw.n D(int var1) {
      return this.p().s(H, kw.h(var1));
   }

   public int d(net.yw.n var1) {
      return ((kw)var1.i(H)).d();
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      switch(null.f[var2.ordinal()]) {
      case 1:
         return var1.s(l, var1.i(n)).s(k, var1.i(d)).s(n, var1.i(l)).s(d, var1.i(k));
      case 2:
         return var1.s(l, var1.i(k)).s(k, var1.i(n)).s(n, var1.i(d)).s(d, var1.i(l));
      case 3:
         return var1.s(l, var1.i(d)).s(k, var1.i(l)).s(n, var1.i(k)).s(d, var1.i(n));
      default:
         return var1;
      }
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      switch(null.S[var2.ordinal()]) {
      case 1:
         return var1.s(l, var1.i(n)).s(n, var1.i(l));
      case 2:
         return var1.s(k, var1.i(d)).s(d, var1.i(k));
      default:
         return super.P(var1, var2);
      }
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{l, k, d, n, H});
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int[] var4 = g3.v.w();
      if(!var1.x) {
         z1.y(var1, var2);
      }

   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int[] var4 = g3.v.w();
      if(!var1.x) {
         z1.y(var1, var2);
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
