package net.y9;

import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.au;

public class gi extends l {
   public static final net.yr.w n = net.yr.w.l("variant", gi.x.class);
   public static final int N = gi.x.ROUGH.q();
   public static final int Y = gi.x.BRICKS.q();
   public static final int W = gi.x.DARK.q();

   public gi() {
      super(net.y1.l.z);
      this.r(this.b.T().s(n, gi.x.ROUGH));
      this.f(net.ys.r.M);
   }

   public String U() {
      return net.yq.e.E(this.j() + "." + gi.x.ROUGH.h() + ".name");
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return var1.i(n) == gi.x.ROUGH?net.y1.h.f:net.y1.h.r;
   }

   public int z(net.yw.n var1) {
      return ((gi.x)var1.i(n)).q();
   }

   public int d(net.yw.n var1) {
      return ((gi.x)var1.i(n)).q();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{n});
   }

   public net.yw.n D(int var1) {
      return this.p().s(n, gi.x.D(var1));
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      var2.add(new ks(this, 1, N));
      var2.add(new ks(this, 1, Y));
      var2.add(new ks(this, 1, W));
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum x implements au {
      ROUGH,
      BRICKS,
      DARK;

      private static final gi.x[] C;
      private final int L;
      private final String c;
      private final String b;

      private x(int var3, String var4, String var5) {
         this.L = var3;
         this.c = var4;
         this.b = var5;
      }

      public int q() {
         return this.L;
      }

      public String toString() {
         return this.c;
      }

      public static gi.x D(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= C.length) {
            var0 = 0;
         }

         return C[var0];
      }

      public String f() {
         return this.c;
      }

      public String h() {
         return this.b;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
