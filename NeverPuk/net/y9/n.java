package net.y9;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.t;
import net.yv.o8;
import net.yz.au;

public abstract class n extends t {
   protected net.yr.w Q;

   protected n() {
      this.r(this.b.T().s(this.k(), this.O() == n.b.RED?n.v.POPPY:n.v.DANDELION));
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return super.k(var1, var2, var3).n(var1.F(var2, var3));
   }

   public int z(net.yw.n var1) {
      return ((n.v)var1.i(this.k())).z();
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      g3.v.w();
      n.v[] var4 = n.v.w(this.O());
      int var5 = var4.length;
      int var6 = 0;
      if(var6 < var5) {
         n.v var7 = var4[var6];
         var2.add(new ks(this, 1, var7.z()));
         ++var6;
      }

   }

   public net.yw.n D(int var1) {
      return this.p().s(this.k(), n.v.D(this.O(), var1));
   }

   public abstract n.b O();

   public net.yr.h k() {
      int[] var1 = g3.v.w();
      if(this.Q == null) {
         this.Q = net.yr.w.L("type", n.v.class, new Predicate() {
            public boolean N(@Nullable n.v var1) {
               return var1.p() == n.this.O();
            }

            private static xn a(xn var0) {
               return var0;
            }
         });
      }

      return this.Q;
   }

   public int d(net.yw.n var1) {
      return ((n.v)var1.i(this.k())).z();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{this.k()});
   }

   public l.z V() {
      return l.z.XZ;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum b {
      YELLOW,
      RED;

      public n s() {
         return this == YELLOW?net.nb.f.dO:net.nb.f.d2;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static enum v implements au {
      DANDELION,
      POPPY,
      BLUE_ORCHID,
      ALLIUM,
      HOUSTONIA,
      RED_TULIP,
      ORANGE_TULIP,
      WHITE_TULIP,
      PINK_TULIP,
      OXEYE_DAISY;

      private static final n.v[][] W;
      private final n.b U;
      private final int Q;
      private final String M;
      private final String z;

      private v(n.b var3, int var4, String var5) {
         this(var3, var4, var5, var5);
      }

      private v(n.b var3, int var4, String var5, String var6) {
         this.U = var3;
         this.Q = var4;
         this.M = var5;
         this.z = var6;
      }

      public n.b p() {
         return this.U;
      }

      public int z() {
         return this.Q;
      }

      public static n.v D(n.b var0, int var1) {
         g3.v.w();
         n.v[] var3 = W[var0.ordinal()];
         if(var1 < 0 || var1 >= var3.length) {
            var1 = 0;
         }

         return var3[var1];
      }

      public static n.v[] w(n.b var0) {
         return W[var0.ordinal()];
      }

      public String toString() {
         return this.M;
      }

      public String f() {
         return this.M;
      }

      public String c() {
         return this.z;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
