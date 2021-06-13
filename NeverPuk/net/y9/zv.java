package net.y9;

import net.n0.ks;
import net.n0.kw;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;

public class zv extends l {
   public static final net.yr.w D = net.yr.w.l("color", kw.class);

   public zv(net.y1.l var1) {
      super(var1);
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

   public net.yw.n D(int var1) {
      return this.p().s(D, kw.h(var1));
   }

   public int d(net.yw.n var1) {
      return ((kw)var1.i(D)).d();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{D});
   }
}
