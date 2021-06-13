package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.gc;
import net.y9.lu;
import net.yv.o8;

public abstract class lv extends lu {
   public static final net.yr.w a = net.yr.w.l("variant", gc.i.class);

   public lv() {
      g3.v.w();
      super(net.y1.l.S);
      net.yw.n var2 = this.b.T();
      if(!this.l()) {
         var2 = var2.s(R, lu.k.BOTTOM);
      }

      this.r(var2.s(a, gc.i.OAK));
      this.f(net.ys.r.M);
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return ((gc.i)var1.i(a)).t();
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.n0.y.q(net.nb.f.S);
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.f.S, 1, ((gc.i)var3.i(a)).B());
   }

   public String G(int var1) {
      return super.j() + "." + gc.i.r(var1).m();
   }

   public net.yr.h R() {
      return a;
   }

   public Comparable b(ks var1) {
      return gc.i.r(var1.n() & 7);
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      g3.v.w();
      gc.i[] var4 = gc.i.values();
      int var5 = var4.length;
      int var6 = 0;
      if(var6 < var5) {
         gc.i var7 = var4[var6];
         var2.add(new ks(this, 1, var7.B()));
         ++var6;
      }

   }

   public net.yw.n D(int var1) {
      net.yw.n var2 = this.p().s(a, gc.i.r(var1 & 7));
      if(!this.l()) {
         var2 = var2.s(R, (var1 & 8) == 0?lu.k.BOTTOM:lu.k.TOP);
      }

      return var2;
   }

   public int d(net.yw.n var1) {
      g3.v.w();
      int var3 = 0;
      var3 = var3 | ((gc.i)var1.i(a)).B();
      if(!this.l() && var1.i(R) == lu.k.TOP) {
         var3 |= 8;
      }

      return var3;
   }

   protected net.yw.q k() {
      return this.l()?new net.yw.q(this, new net.yr.h[]{a}):new net.yw.q(this, new net.yr.h[]{R, a});
   }

   public int z(net.yw.n var1) {
      return ((gc.i)var1.i(a)).B();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
