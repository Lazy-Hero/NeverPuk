package net.y9;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.aq;

public class z5 extends l {
   public static final net.yr.w l = net.yr.w.l("color", kw.class);
   protected static final net.u.e i = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D);

   protected z5() {
      super(net.y1.l.L);
      this.r(this.b.T().s(l, kw.WHITE));
      this.R(true);
      this.f(net.ys.r.X);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return i;
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return net.y1.h.o((kw)var1.i(l));
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return super.J(var1, var2) && this.r(var1, var2);
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      this.A(var2, var3, var1);
   }

   private boolean A(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int[] var4 = g3.v.w();
      if(!this.r(var1, var2)) {
         this.N(var1, var2, var3, 0);
         var1.J(var2);
         return false;
      } else {
         return true;
      }
   }

   private boolean r(net.yv.r var1, net.u.j var2) {
      return !var1.y(var2.b());
   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      int[] var5 = g3.v.w();
      return var4 == aq.UP?true:var2.Z(var3.C(var4)).Q() == this || super.v(var1, var2, var3, var4);
   }

   public int z(net.yw.n var1) {
      return ((kw)var1.i(l)).d();
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      g3.v.w();
      int var4 = 0;
      var2.add(new ks(this, 1, var4));
      ++var4;
   }

   public net.yw.n D(int var1) {
      return this.p().s(l, kw.h(var1));
   }

   public int d(net.yw.n var1) {
      return ((kw)var1.i(l)).d();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{l});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return var4 == aq.DOWN?net.yw.g.SOLID:net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
