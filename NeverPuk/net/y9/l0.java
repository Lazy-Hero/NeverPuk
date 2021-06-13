package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.lu;
import net.yv.o8;
import net.yz.au;

public abstract class l0 extends lu {
   public static final net.yr.o n = net.yr.o.k("seamless");
   public static final net.yr.w A = net.yr.w.l("variant", l0.u.class);

   public l0() {
      g3.v.w();
      super(net.y1.l.z);
      net.yw.n var2 = this.b.T();
      if(this.l()) {
         var2 = var2.s(n, Boolean.valueOf(false));
      }

      var2 = var2.s(R, lu.k.BOTTOM);
      this.r(var2.s(A, l0.u.RED_SANDSTONE));
      this.f(net.ys.r.M);
   }

   public String U() {
      return net.yq.e.E(this.j() + ".red_sandstone.name");
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.n0.y.q(net.nb.f.T4);
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.f.T4, 1, ((l0.u)var3.i(A)).Z());
   }

   public String G(int var1) {
      return super.j() + "." + l0.u.S(var1).l();
   }

   public net.yr.h R() {
      return A;
   }

   public Comparable b(ks var1) {
      return l0.u.S(var1.n() & 7);
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      for(l0.u var6 : l0.u.values()) {
         var2.add(new ks(this, 1, var6.Z()));
      }

   }

   public net.yw.n D(int var1) {
      g3.v.w();
      net.yw.n var3 = this.p().s(A, l0.u.S(var1 & 7));
      if(this.l()) {
         var3 = var3.s(n, Boolean.valueOf((var1 & 8) != 0));
      }

      var3 = var3.s(R, (var1 & 8) == 0?lu.k.BOTTOM:lu.k.TOP);
      return var3;
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((l0.u)var1.i(A)).Z();
      if(this.l()) {
         if(((Boolean)var1.i(n)).booleanValue()) {
            var2 |= 8;
         }
      } else if(var1.i(R) == lu.k.TOP) {
         var2 |= 8;
      }

      return var2;
   }

   protected net.yw.q k() {
      return this.l()?new net.yw.q(this, new net.yr.h[]{n, A}):new net.yw.q(this, new net.yr.h[]{R, A});
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return ((l0.u)var1.i(A)).B();
   }

   public int z(net.yw.n var1) {
      return ((l0.u)var1.i(A)).Z();
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum u implements au {
      RED_SANDSTONE;

      private static final l0.u[] U;
      private final int R;
      private final String V;
      private final net.y1.h m;

      private u(int var3, String var4, net.y1.h var5) {
         this.R = var3;
         this.V = var4;
         this.m = var5;
      }

      public int Z() {
         return this.R;
      }

      public net.y1.h B() {
         return this.m;
      }

      public String toString() {
         return this.V;
      }

      public static l0.u S(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= U.length) {
            var0 = 0;
         }

         return U[var0];
      }

      public String f() {
         return this.V;
      }

      public String l() {
         return this.V;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
