package net.y9;

import com.google.common.base.Predicates;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.rw;
import net.yv.o8;
import net.yz.aq;
import net.yz.ax;

public class rf extends l {
   public static final net.yr.g h = rw.N;
   public static final net.yr.o N = net.yr.o.k("eye");
   protected static final net.u.e f = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.8125D, 1.0D);
   protected static final net.u.e c = new net.u.e(0.3125D, 0.8125D, 0.3125D, 0.6875D, 1.0D, 0.6875D);
   private static net.cw.t r;

   public rf() {
      super(net.y1.l.z, net.y1.h.D);
      this.r(this.b.T().s(h, aq.NORTH).s(N, Boolean.valueOf(false)));
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return f;
   }

   public void S(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.e var4, List var5, @Nullable net.ne.l var6, boolean var7) {
      int[] var8 = g3.v.w();
      F(var3, var4, var5, f);
      if(((Boolean)var2.Z(var3).i(N)).booleanValue()) {
         F(var3, var4, var5, c);
      }

   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.SL;
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p().s(h, var8.V().f()).s(N, Boolean.valueOf(false));
   }

   public boolean t(net.yw.n var1) {
      return true;
   }

   public int c(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      return ((Boolean)var1.i(N)).booleanValue()?15:0;
   }

   public net.yw.n D(int var1) {
      return this.p().s(N, Boolean.valueOf((var1 & 4) != 0)).s(h, aq.Q(var1 & 3));
   }

   public int d(net.yw.n var1) {
      int var3 = 0;
      g3.v.w();
      var3 = var3 | ((aq)var1.i(h)).u();
      if(((Boolean)var1.i(N)).booleanValue()) {
         var3 |= 4;
      }

      return var3;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(h, var2.d((aq)var1.i(h)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(h)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{h, N});
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public static net.cw.t R() {
      int[] var0 = g3.v.w();
      if(r == null) {
         r = net.cw.r.G().j(new String[]{"?vvv?", ">???<", ">???<", ">???<", "?^^^?"}).d('?', net.yw.w.U(net.cw.j.v)).d('^', net.yw.w.U(net.cw.j.T(net.nb.f.dE).f(N, Predicates.equalTo(Boolean.valueOf(true))).f(h, Predicates.equalTo(aq.SOUTH)))).d('>', net.yw.w.U(net.cw.j.T(net.nb.f.dE).f(N, Predicates.equalTo(Boolean.valueOf(true))).f(h, Predicates.equalTo(aq.WEST)))).d('v', net.yw.w.U(net.cw.j.T(net.nb.f.dE).f(N, Predicates.equalTo(Boolean.valueOf(true))).f(h, Predicates.equalTo(aq.NORTH)))).d('<', net.yw.w.U(net.cw.j.T(net.nb.f.dE).f(N, Predicates.equalTo(Boolean.valueOf(true))).f(h, Predicates.equalTo(aq.EAST)))).e();
      }

      return r;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return var4 == aq.DOWN?net.yw.g.SOLID:net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
