package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.y9.f;
import net.y9.g3;
import net.y9.z1;
import net.yv.o8;
import net.yz.ac;

public class e extends f {
   public static final net.yr.w D = net.yr.w.l("color", kw.class);

   public e(net.y1.l var1) {
      super(var1, false);
      this.r(this.b.T().s(D, kw.WHITE));
      this.f(net.ys.r.M);
   }

   public int z(net.yw.n var1) {
      return ((kw)var1.i(D)).d();
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      g3.v.w();
      kw[] var4 = kw.values();
      int var5 = var4.length;
      int var6 = 0;
      if(var6 < var5) {
         kw var7 = var4[var6];
         var2.add(new ks(this, 1, var7.d()));
         ++var6;
      }

   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return net.y1.h.o((kw)var1.i(D));
   }

   public ac k() {
      return ac.TRANSLUCENT;
   }

   public int T(Random var1) {
      return 0;
   }

   protected boolean u() {
      return true;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public net.yw.n D(int var1) {
      return this.p().s(D, kw.h(var1));
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

   public int d(net.yw.n var1) {
      return ((kw)var1.i(D)).d();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{D});
   }

   private static xn b(xn var0) {
      return var0;
   }
}
