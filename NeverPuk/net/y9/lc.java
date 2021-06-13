package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.au;

public class lc extends l {
   public static final net.yr.w W = net.yr.w.l("variant", lc.d.class);

   public lc() {
      super(net.y1.l.z);
      this.r(this.b.T().s(W, lc.d.STONE));
      this.f(net.ys.r.M);
   }

   public String U() {
      return net.yq.e.E(this.j() + "." + lc.d.STONE.g() + ".name");
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return ((lc.d)var1.i(W)).w();
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return var1.i(W) == lc.d.STONE?net.n0.y.q(net.nb.f.TD):net.n0.y.q(net.nb.f.oy);
   }

   public int z(net.yw.n var1) {
      return ((lc.d)var1.i(W)).R();
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      lc.d[] var4 = lc.d.values();
      int var5 = var4.length;
      g3.v.w();
      int var6 = 0;
      if(var6 < var5) {
         lc.d var7 = var4[var6];
         var2.add(new ks(this, 1, var7.R()));
         ++var6;
      }

   }

   public net.yw.n D(int var1) {
      return this.p().s(W, lc.d.m(var1));
   }

   public int d(net.yw.n var1) {
      return ((lc.d)var1.i(W)).R();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{W});
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum d implements au {
      STONE,
      GRANITE,
      GRANITE_SMOOTH,
      DIORITE,
      DIORITE_SMOOTH,
      ANDESITE,
      ANDESITE_SMOOTH;

      private static final lc.d[] Y;
      private final int A;
      private final String L;
      private final String v;
      private final net.y1.h k;
      private final boolean i;

      private d(int var3, net.y1.h var4, String var5, boolean var6) {
         this(var3, var4, var5, var5, var6);
      }

      private d(int var3, net.y1.h var4, String var5, String var6, boolean var7) {
         this.A = var3;
         this.L = var5;
         this.v = var6;
         this.k = var4;
         this.i = var7;
      }

      public int R() {
         return this.A;
      }

      public net.y1.h w() {
         return this.k;
      }

      public String toString() {
         return this.L;
      }

      public static lc.d m(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= Y.length) {
            var0 = 0;
         }

         return Y[var0];
      }

      public String f() {
         return this.L;
      }

      public String g() {
         return this.v;
      }

      public boolean K() {
         return this.i;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
