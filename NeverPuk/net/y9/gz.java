package net.y9;

import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.aq;
import net.yz.au;

public class gz extends l {
   public static final net.yr.w D = net.yr.w.l("variant", gz.b.class);

   public gz() {
      super(net.y1.l.z);
      this.r(this.b.T().s(D, gz.b.DEFAULT));
      this.f(net.ys.r.M);
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      int[] var9 = g3.v.w();
      if(var7 == gz.b.LINES_Y.s()) {
         switch(null.m[var3.r().ordinal()]) {
         case 1:
            return this.p().s(D, gz.b.LINES_Z);
         case 2:
            return this.p().s(D, gz.b.LINES_X);
         case 3:
            return this.p().s(D, gz.b.LINES_Y);
         }
      }

      return var7 == gz.b.CHISELED.s()?this.p().s(D, gz.b.CHISELED):this.p().s(D, gz.b.DEFAULT);
   }

   public int z(net.yw.n var1) {
      gz.b var2 = (gz.b)var1.i(D);
      return var2 != gz.b.LINES_X && var2 != gz.b.LINES_Z?var2.s():gz.b.LINES_Y.s();
   }

   protected ks l(net.yw.n var1) {
      gz.b var2 = (gz.b)var1.i(D);
      return var2 != gz.b.LINES_X && var2 != gz.b.LINES_Z?super.l(var1):new ks(net.n0.y.q(this), 1, gz.b.LINES_Y.s());
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      var2.add(new ks(this, 1, gz.b.DEFAULT.s()));
      var2.add(new ks(this, 1, gz.b.CHISELED.s()));
      var2.add(new ks(this, 1, gz.b.LINES_Y.s()));
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return net.y1.h.K;
   }

   public net.yw.n D(int var1) {
      return this.p().s(D, gz.b.T(var1));
   }

   public int d(net.yw.n var1) {
      return ((gz.b)var1.i(D)).s();
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      int[] var3 = g3.v.w();
      switch(null.y[var2.ordinal()]) {
      case 1:
      case 2:
         switch(null.j[((gz.b)var1.i(D)).ordinal()]) {
         case 1:
            return var1.s(D, gz.b.LINES_Z);
         case 2:
            return var1.s(D, gz.b.LINES_X);
         default:
            return var1;
         }
      default:
         return var1;
      }
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{D});
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum b implements au {
      DEFAULT,
      CHISELED,
      LINES_Y,
      LINES_X,
      LINES_Z;

      private static final gz.b[] Z;
      private final int p;
      private final String U;
      private final String s;

      private b(int var3, String var4, String var5) {
         this.p = var3;
         this.U = var4;
         this.s = var5;
      }

      public int s() {
         return this.p;
      }

      public String toString() {
         return this.s;
      }

      public static gz.b T(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= Z.length) {
            var0 = 0;
         }

         return Z[var0];
      }

      public String f() {
         return this.U;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
