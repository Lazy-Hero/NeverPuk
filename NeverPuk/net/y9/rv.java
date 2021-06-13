package net.y9;

import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.au;

public class rv extends l {
   public static final net.yr.w l = net.yr.w.l("variant", rv.m.class);
   public static final net.yr.o Y = net.yr.o.k("snowy");

   protected rv() {
      super(net.y1.l.E);
      this.r(this.b.T().s(l, rv.m.DIRT).s(Y, Boolean.valueOf(false)));
      this.f(net.ys.r.M);
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return ((rv.m)var1.i(l)).V();
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      int[] var4 = g3.v.w();
      if(var1.i(l) == rv.m.PODZOL) {
         l var5 = var2.Z(var3.h()).Q();
         var1 = var1.s(Y, Boolean.valueOf(var5 == net.nb.f.V || var5 == net.nb.f.Tl));
      }

      return var1;
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      var2.add(new ks(this, 1, rv.m.DIRT.e()));
      var2.add(new ks(this, 1, rv.m.COARSE_DIRT.e()));
      var2.add(new ks(this, 1, rv.m.PODZOL.e()));
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(this, 1, ((rv.m)var3.i(l)).e());
   }

   public net.yw.n D(int var1) {
      return this.p().s(l, rv.m.r(var1));
   }

   public int d(net.yw.n var1) {
      return ((rv.m)var1.i(l)).e();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{l, Y});
   }

   public int z(net.yw.n var1) {
      g3.v.w();
      rv.m var3 = (rv.m)var1.i(l);
      if(var3 == rv.m.PODZOL) {
         var3 = rv.m.DIRT;
      }

      return var3.e();
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum m implements au {
      DIRT,
      COARSE_DIRT,
      PODZOL;

      private static final rv.m[] T;
      private final int a;
      private final String x;
      private final String k;
      private final net.y1.h N;

      private m(int var3, String var4, net.y1.h var5) {
         this(var3, var4, var4, var5);
      }

      private m(int var3, String var4, String var5, net.y1.h var6) {
         this.a = var3;
         this.x = var4;
         this.k = var5;
         this.N = var6;
      }

      public int e() {
         return this.a;
      }

      public String L() {
         return this.k;
      }

      public net.y1.h V() {
         return this.N;
      }

      public String toString() {
         return this.x;
      }

      public static rv.m r(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= T.length) {
            var0 = 0;
         }

         return T[var0];
      }

      public String f() {
         return this.x;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
