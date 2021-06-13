package net.y9;

import net.xn;
import net.n0.kw;
import net.y9.g3;
import net.y9.lk;
import net.y9.rw;
import net.yz.aq;
import net.yz.ax;

public class rk extends rw {
   public rk(kw var1) {
      g3.v.w();
      super(net.y1.l.z, net.y1.h.o(var1));
      this.r(1.4F);
      this.i(lk.P);
      String var3 = var1.h();
      if(var3.length() > 1) {
         String var4 = var3.substring(0, 1).toUpperCase() + var3.substring(1);
         this.o("glazedTerracotta" + var4);
      }

      this.f(net.ys.r.X);
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{N});
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(N, var2.d((aq)var1.i(N)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(N)));
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p().s(N, var8.V().f());
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((aq)var1.i(N)).u();
      return var2;
   }

   public net.yw.n D(int var1) {
      return this.p().s(N, aq.Q(var1));
   }

   public net.y1.v T(net.yw.n var1) {
      return net.y1.v.PUSH_ONLY;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
