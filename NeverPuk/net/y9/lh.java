package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.lc;
import net.y9.li;
import net.yz.au;

public class lh extends l {
   public static final net.yr.w a = net.yr.w.l("variant", lh.m.class);

   public lh() {
      super(net.y1.l.N);
      this.r(this.b.T().s(a, lh.m.STONE));
      this.r(0.0F);
      this.f(net.ys.r.X);
   }

   public int T(Random var1) {
      return 0;
   }

   public static boolean h(net.yw.n var0) {
      g3.v.w();
      l var2 = var0.Q();
      return var0 == net.nb.f.oy.p().s(lc.W, lc.d.STONE) || var2 == net.nb.f.TD || var2 == net.nb.f.TM;
   }

   protected ks l(net.yw.n var1) {
      switch(null.k[((lh.m)var1.i(a)).ordinal()]) {
      case 1:
         return new ks(net.nb.f.TD);
      case 2:
         return new ks(net.nb.f.TM);
      case 3:
         return new ks(net.nb.f.TM, 1, li.t.MOSSY.A());
      case 4:
         return new ks(net.nb.f.TM, 1, li.t.CRACKED.A());
      case 5:
         return new ks(net.nb.f.TM, 1, li.t.CHISELED.A());
      default:
         return new ks(net.nb.f.oy);
      }
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
      int[] var6 = g3.v.w();
      if(!var1.x && var1.N().b("doTileDrops")) {
         net.nk.e var7 = new net.nk.e(var1);
         var7.S((double)var2.t() + 0.5D, (double)var2.h(), (double)var2.y() + 0.5D, 0.0F, 0.0F);
         var1.S(var7);
         var7.x();
      }

   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(this, 1, var3.Q().d(var3));
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      g3.v.w();
      lh.m[] var4 = lh.m.values();
      int var5 = var4.length;
      int var6 = 0;
      if(var6 < var5) {
         lh.m var7 = var4[var6];
         var2.add(new ks(this, 1, var7.U()));
         ++var6;
      }

   }

   public net.yw.n D(int var1) {
      return this.p().s(a, lh.m.h(var1));
   }

   public int d(net.yw.n var1) {
      return ((lh.m)var1.i(a)).U();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{a});
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum m implements au {
      STONE,
      COBBLESTONE,
      STONEBRICK,
      MOSSY_STONEBRICK,
      CRACKED_STONEBRICK,
      CHISELED_STONEBRICK;

      private static final lh.m[] P;
      private final int C;
      private final String s;
      private final String b;

      private m(int var3, String var4) {
         this(var3, var4, var4);
      }

      private m(int var3, String var4, String var5) {
         this.C = var3;
         this.s = var4;
         this.b = var5;
      }

      public int U() {
         return this.C;
      }

      public String toString() {
         return this.s;
      }

      public static lh.m h(int var0) {
         if(var0 >= P.length) {
            var0 = 0;
         }

         return P[var0];
      }

      public String f() {
         return this.s;
      }

      public String E() {
         return this.b;
      }

      public abstract net.yw.n p();

      public static lh.m q(net.yw.n var0) {
         g3.v.w();
         lh.m[] var2 = values();
         int var3 = var2.length;
         int var4 = 0;
         if(var4 < var3) {
            lh.m var5 = var2[var4];
            if(var0 == var5.p()) {
               return var5;
            }

            ++var4;
         }

         return STONE;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
