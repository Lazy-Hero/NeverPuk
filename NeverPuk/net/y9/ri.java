package net.y9;

import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.r1;
import net.yv.o8;
import net.yz.au;

public class ri extends r1 {
   public static final net.yr.w F = net.yr.w.l("variant", ri.g.class);

   public ri() {
      this.r(this.b.T().s(F, ri.g.SAND));
   }

   public int z(net.yw.n var1) {
      return ((ri.g)var1.i(F)).r();
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      g3.v.w();
      ri.g[] var4 = ri.g.values();
      int var5 = var4.length;
      int var6 = 0;
      if(var6 < var5) {
         ri.g var7 = var4[var6];
         var2.add(new ks(this, 1, var7.r()));
         ++var6;
      }

   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return ((ri.g)var1.i(F)).P();
   }

   public net.yw.n D(int var1) {
      return this.p().s(F, ri.g.D(var1));
   }

   public int d(net.yw.n var1) {
      return ((ri.g)var1.i(F)).r();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{F});
   }

   public int l(net.yw.n var1) {
      ri.g var2 = (ri.g)var1.i(F);
      return var2.x();
   }

   public static enum g implements au {
      SAND,
      RED_SAND;

      private static final ri.g[] O;
      private final int z;
      private final String l;
      private final net.y1.h r;
      private final String D;
      private final int b;

      private g(int var3, String var4, String var5, net.y1.h var6, int var7) {
         this.z = var3;
         this.l = var4;
         this.r = var6;
         this.D = var5;
         this.b = var7;
      }

      public int x() {
         return this.b;
      }

      public int r() {
         return this.z;
      }

      public String toString() {
         return this.l;
      }

      public net.y1.h P() {
         return this.r;
      }

      public static ri.g D(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= O.length) {
            var0 = 0;
         }

         return O[var0];
      }

      public String f() {
         return this.l;
      }

      public String l() {
         return this.D;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
