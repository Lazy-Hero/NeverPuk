package net.y9;

import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yz.au;

public class li extends l {
   public static final net.yr.w F = net.yr.w.l("variant", li.t.class);
   public static final int H = li.t.DEFAULT.A();
   public static final int N = li.t.MOSSY.A();
   public static final int k = li.t.CRACKED.A();
   public static final int D = li.t.CHISELED.A();

   public li() {
      super(net.y1.l.z);
      this.r(this.b.T().s(F, li.t.DEFAULT));
      this.f(net.ys.r.M);
   }

   public int z(net.yw.n var1) {
      return ((li.t)var1.i(F)).A();
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      g3.v.w();
      li.t[] var4 = li.t.values();
      int var5 = var4.length;
      int var6 = 0;
      if(var6 < var5) {
         li.t var7 = var4[var6];
         var2.add(new ks(this, 1, var7.A()));
         ++var6;
      }

   }

   public net.yw.n D(int var1) {
      return this.p().s(F, li.t.f(var1));
   }

   public int d(net.yw.n var1) {
      return ((li.t)var1.i(F)).A();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{F});
   }

   public static enum t implements au {
      DEFAULT,
      MOSSY,
      CRACKED,
      CHISELED;

      private static final li.t[] F;
      private final int l;
      private final String d;
      private final String p;

      private t(int var3, String var4, String var5) {
         this.l = var3;
         this.d = var4;
         this.p = var5;
      }

      public int A() {
         return this.l;
      }

      public String toString() {
         return this.d;
      }

      public static li.t f(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= F.length) {
            var0 = 0;
         }

         return F[var0];
      }

      public String f() {
         return this.d;
      }

      public String K() {
         return this.p;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
