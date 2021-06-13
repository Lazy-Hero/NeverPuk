package net.y9;

import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.ri;
import net.yz.au;

public class gy extends l {
   public static final net.yr.w J = net.yr.w.l("type", gy.w.class);

   public gy() {
      super(net.y1.l.z, ri.g.RED_SAND.P());
      this.r(this.b.T().s(J, gy.w.DEFAULT));
      this.f(net.ys.r.M);
   }

   public int z(net.yw.n var1) {
      return ((gy.w)var1.i(J)).R();
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      g3.v.w();
      gy.w[] var4 = gy.w.values();
      int var5 = var4.length;
      int var6 = 0;
      if(var6 < var5) {
         gy.w var7 = var4[var6];
         var2.add(new ks(this, 1, var7.R()));
         ++var6;
      }

   }

   public net.yw.n D(int var1) {
      return this.p().s(J, gy.w.I(var1));
   }

   public int d(net.yw.n var1) {
      return ((gy.w)var1.i(J)).R();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{J});
   }

   public static enum w implements au {
      DEFAULT,
      CHISELED,
      SMOOTH;

      private static final gy.w[] e;
      private final int W;
      private final String s;
      private final String N;

      private w(int var3, String var4, String var5) {
         this.W = var3;
         this.s = var4;
         this.N = var5;
      }

      public int R() {
         return this.W;
      }

      public String toString() {
         return this.s;
      }

      public static gy.w I(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= e.length) {
            var0 = 0;
         }

         return e[var0];
      }

      public String f() {
         return this.s;
      }

      public String N() {
         return this.N;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
