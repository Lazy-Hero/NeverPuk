package net.y9;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.lm;
import net.y9.t;
import net.y9.y;
import net.yv.o8;
import net.yz.au;

public class zu extends t implements lm {
   public static final net.yr.w p = net.yr.w.l("type", zu.i.class);
   protected static final net.u.e h = new net.u.e(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);

   protected zu() {
      super(net.y1.l.Y);
      this.r(this.b.T().s(p, zu.i.DEAD_BUSH));
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return h;
   }

   public boolean p(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return this.H(var1.Z(var2.b()));
   }

   public boolean X(o8 var1, net.u.j var2) {
      return true;
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return var2.nextInt(8) == 0?net.nb.j.Q:net.nb.j.SL;
   }

   public int q(int var1, Random var2) {
      return 1 + var2.nextInt(var1 * 2 + 1);
   }

   public void U(net.yv.r var1, net.r.r var2, net.u.j var3, net.yw.n var4, @Nullable net.ni.v var5, ks var6) {
      int[] var7 = g3.v.w();
      if(!var1.x && var6.Z() == net.nb.j.W5) {
         var2.S(net.v.q.i(this));
         e(var1, var3, new ks(net.nb.f.TU, 1, ((zu.i)var4.i(p)).j()));
      }

      super.U(var1, var2, var3, var4, var5, var6);
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(this, 1, var3.Q().d(var3));
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      g3.v.w();
      int var4 = 1;
      var2.add(new ks(this, 1, var4));
      ++var4;
   }

   public boolean L(net.yv.r var1, net.u.j var2, net.yw.n var3, boolean var4) {
      return var3.i(p) != zu.i.DEAD_BUSH;
   }

   public boolean p(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      return true;
   }

   public void e(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      g3.v.w();
      y.t var6 = y.t.GRASS;
      if(var4.i(p) == zu.i.FERN) {
         var6 = y.t.FERN;
      }

      if(net.nb.f.Tg.J(var1, var3)) {
         net.nb.f.Tg.p(var1, var3, var6, 2);
      }

   }

   public net.yw.n D(int var1) {
      return this.p().s(p, zu.i.O(var1));
   }

   public int d(net.yw.n var1) {
      return ((zu.i)var1.i(p)).j();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{p});
   }

   public l.z V() {
      return l.z.XYZ;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum i implements au {
      DEAD_BUSH,
      GRASS,
      FERN;

      private static final zu.i[] v;
      private final int s;
      private final String x;

      private i(int var3, String var4) {
         this.s = var3;
         this.x = var4;
      }

      public int j() {
         return this.s;
      }

      public String toString() {
         return this.x;
      }

      public static zu.i O(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= v.length) {
            var0 = 0;
         }

         return v[var0];
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
