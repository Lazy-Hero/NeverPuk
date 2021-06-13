package net.y9;

import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.au;

public class lo extends l {
   public static final net.yr.w c = net.yr.w.l("type", lo.h.class);

   public lo() {
      super(net.y1.l.z);
      this.r(this.b.T().s(c, lo.h.DEFAULT));
      this.f(net.ys.r.M);
   }

   public int z(net.yw.n var1) {
      return ((lo.h)var1.i(c)).r();
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      g3.v.w();
      lo.h[] var4 = lo.h.values();
      int var5 = var4.length;
      int var6 = 0;
      if(var6 < var5) {
         lo.h var7 = var4[var6];
         var2.add(new ks(this, 1, var7.r()));
         ++var6;
      }

   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return net.y1.h.g;
   }

   public net.yw.n D(int var1) {
      return this.p().s(c, lo.h.D(var1));
   }

   public int d(net.yw.n var1) {
      return ((lo.h)var1.i(c)).r();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{c});
   }

   public static enum h implements au {
      DEFAULT,
      CHISELED,
      SMOOTH;

      private static final lo.h[] T;
      private final int J;
      private final String n;
      private final String o;

      private h(int var3, String var4, String var5) {
         this.J = var3;
         this.n = var4;
         this.o = var5;
      }

      public int r() {
         return this.J;
      }

      public String toString() {
         return this.n;
      }

      public static lo.h D(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= T.length) {
            var0 = 0;
         }

         return T[var0];
      }

      public String f() {
         return this.n;
      }

      public String l() {
         return this.o;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
