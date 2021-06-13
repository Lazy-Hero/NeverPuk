package net.y9;

import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.au;

public class gc extends l {
   public static final net.yr.w F = net.yr.w.l("variant", gc.i.class);

   public gc() {
      super(net.y1.l.S);
      this.r(this.b.T().s(F, gc.i.OAK));
      this.f(net.ys.r.M);
   }

   public int z(net.yw.n var1) {
      return ((gc.i)var1.i(F)).B();
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
      return this.p().s(F, gc.i.r(var1));
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return ((gc.i)var1.i(F)).t();
   }

   public int d(net.yw.n var1) {
      return ((gc.i)var1.i(F)).B();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{F});
   }

   public static enum i implements au {
      OAK,
      SPRUCE,
      BIRCH,
      JUNGLE,
      ACACIA,
      DARK_OAK;

      private static final gc.i[] j;
      private final int q;
      private final String e;
      private final String f;
      private final net.y1.h W;

      private i(int var3, String var4, net.y1.h var5) {
         this(var3, var4, var4, var5);
      }

      private i(int var3, String var4, String var5, net.y1.h var6) {
         this.q = var3;
         this.e = var4;
         this.f = var5;
         this.W = var6;
      }

      public int B() {
         return this.q;
      }

      public net.y1.h t() {
         return this.W;
      }

      public String toString() {
         return this.e;
      }

      public static gc.i r(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= j.length) {
            var0 = 0;
         }

         return j[var0];
      }

      public String f() {
         return this.e;
      }

      public String m() {
         return this.f;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
