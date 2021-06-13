package net.y9;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.y9.g3;
import net.y9.l;
import net.y9.r1;
import net.y9.zv;
import net.yv.o8;
import net.yz.aq;

public class r_ extends r1 {
   public static final net.yr.w f = net.yr.w.l("color", kw.class);

   public r_() {
      super(net.y1.l.Z);
      this.r(this.b.T().s(f, kw.WHITE));
      this.f(net.ys.r.M);
   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.yw.n var4) {
      if(var4.n().y()) {
         var1.k(var2, net.nb.f.w.p().s(zv.D, var3.i(f)), 3);
      }

   }

   protected boolean J(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      g3.v.w();
      boolean var5 = false;
      aq[] var6 = aq.values();
      int var7 = var6.length;
      int var8 = 0;
      if(var8 < var7) {
         aq var9 = var6[var8];
         if(var9 != aq.DOWN) {
            net.u.j var10 = var2.C(var9);
            if(var1.Z(var10).n() == net.y1.l.p) {
               var5 = true;
            }
         }

         ++var8;
      }

      return var5;
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!this.J(var2, var3, var1)) {
         super.Z(var1, var2, var3, var4, var5);
      }

   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(!this.J(var1, var2, var3)) {
         super.b(var1, var2, var3);
      }

   }

   public int z(net.yw.n var1) {
      return ((kw)var1.i(f)).d();
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      for(kw var6 : kw.values()) {
         var2.add(new ks(this, 1, var6.d()));
      }

   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return net.y1.h.o((kw)var1.i(f));
   }

   public net.yw.n D(int var1) {
      return this.p().s(f, kw.h(var1));
   }

   public int d(net.yw.n var1) {
      return ((kw)var1.i(f)).d();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{f});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
