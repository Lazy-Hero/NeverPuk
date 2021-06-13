package net.y9;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.rw;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;
import net.yz.au;
import net.yz.ax;

public class l_ extends l {
   public static final net.yr.g F = rw.N;
   public static final net.yr.w r = net.yr.w.l("half", l_.p.class);
   public static final net.yr.w f = net.yr.w.l("shape", l_.h.class);
   protected static final net.u.e R = new net.u.e(0.0D, 0.5D, 0.0D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e N = new net.u.e(0.0D, 0.5D, 0.0D, 0.5D, 1.0D, 1.0D);
   protected static final net.u.e O = new net.u.e(0.5D, 0.5D, 0.0D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e n = new net.u.e(0.0D, 0.5D, 0.0D, 1.0D, 1.0D, 0.5D);
   protected static final net.u.e H = new net.u.e(0.0D, 0.5D, 0.5D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e J = new net.u.e(0.0D, 0.5D, 0.0D, 0.5D, 1.0D, 0.5D);
   protected static final net.u.e W = new net.u.e(0.5D, 0.5D, 0.0D, 1.0D, 1.0D, 0.5D);
   protected static final net.u.e c = new net.u.e(0.0D, 0.5D, 0.5D, 0.5D, 1.0D, 1.0D);
   protected static final net.u.e M = new net.u.e(0.5D, 0.5D, 0.5D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e v = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
   protected static final net.u.e Y = new net.u.e(0.0D, 0.0D, 0.0D, 0.5D, 0.5D, 1.0D);
   protected static final net.u.e A = new net.u.e(0.5D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
   protected static final net.u.e p = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 0.5D);
   protected static final net.u.e i = new net.u.e(0.0D, 0.0D, 0.5D, 1.0D, 0.5D, 1.0D);
   protected static final net.u.e u = new net.u.e(0.0D, 0.0D, 0.0D, 0.5D, 0.5D, 0.5D);
   protected static final net.u.e k = new net.u.e(0.5D, 0.0D, 0.0D, 1.0D, 0.5D, 0.5D);
   protected static final net.u.e a = new net.u.e(0.0D, 0.0D, 0.5D, 0.5D, 0.5D, 1.0D);
   protected static final net.u.e Q = new net.u.e(0.5D, 0.0D, 0.5D, 1.0D, 0.5D, 1.0D);
   private final l o;
   private final net.yw.n D;

   protected l_(net.yw.n var1) {
      super(var1.Q().C);
      this.r(this.b.T().s(F, aq.NORTH).s(r, l_.p.BOTTOM).s(f, l_.h.STRAIGHT));
      this.o = var1.Q();
      this.D = var1;
      this.r(this.o.S);
      this.M(this.o.V / 3.0F);
      this.i(this.o.B);
      this.R(255);
      this.f(net.ys.r.M);
   }

   public void S(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.e var4, List var5, @Nullable net.ne.l var6, boolean var7) {
      var1 = this.v(var1, var2, var3);

      for(net.u.e var9 : b(var1)) {
         F(var3, var4, var5, var9);
      }

   }

   private static List b(net.yw.n var0) {
      ArrayList var1 = Lists.newArrayList();
      boolean var2 = var0.i(r) == l_.p.TOP;
      var1.add(R);
      l_.h var3 = (l_.h)var0.i(f);
      if(var3 == l_.h.STRAIGHT || var3 == l_.h.INNER_LEFT || var3 == l_.h.INNER_RIGHT) {
         var1.add(l(var0));
      }

      if(var3 != l_.h.STRAIGHT) {
         var1.add(x(var0));
      }

      return var1;
   }

   private static net.u.e l(net.yw.n var0) {
      boolean var1 = var0.i(r) == l_.p.TOP;
      switch(null.G[((aq)var0.i(F)).ordinal()]) {
      case 1:
      default:
         return p;
      case 2:
         return i;
      case 3:
         return Y;
      case 4:
         return A;
      }
   }

   private static net.u.e x(net.yw.n var0) {
      aq var1 = (aq)var0.i(F);
      aq var2;
      switch(null.z[((l_.h)var0.i(f)).ordinal()]) {
      case 1:
      default:
         var2 = var1;
         break;
      case 2:
         var2 = var1.R();
         break;
      case 3:
         var2 = var1.f();
         break;
      case 4:
         var2 = var1.i();
      }

      boolean var3 = var0.i(r) == l_.p.TOP;
      switch(null.G[var2.ordinal()]) {
      case 1:
      default:
         return u;
      case 2:
         return Q;
      case 3:
         return a;
      case 4:
         return k;
      }
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      var2 = this.v(var2, var1, var3);
      if(var4.r() == aq.l.Y) {
         if(var4 == aq.UP) {
            boolean var10000 = true;
         }

         if(var2.i(r) == l_.p.TOP) {
            boolean var8 = true;
         }

         return net.yw.g.SOLID;
      } else {
         l_.h var5 = (l_.h)var2.i(f);
         if(var5 != l_.h.OUTER_LEFT && var5 != l_.h.OUTER_RIGHT) {
            aq var6 = (aq)var2.i(F);
            switch(null.z[var5.ordinal()]) {
            case 3:
               return var6 != var4 && var6 != var4.i()?net.yw.g.UNDEFINED:net.yw.g.SOLID;
            case 4:
               return var6 != var4 && var6 != var4.R()?net.yw.g.UNDEFINED:net.yw.g.SOLID;
            case 5:
               return var6 == var4?net.yw.g.SOLID:net.yw.g.UNDEFINED;
            default:
               return net.yw.g.UNDEFINED;
            }
         } else {
            return net.yw.g.UNDEFINED;
         }
      }
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      this.o.Y(var1, var2, var3, var4);
   }

   public void w(net.yv.r var1, net.u.j var2, net.r.r var3) {
      this.o.w(var1, var2, var3);
   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      this.o.N(var1, var2, var3);
   }

   public int w(net.yw.n var1, o8 var2, net.u.j var3) {
      return this.D.T(var2, var3);
   }

   public float b(net.ne.l var1) {
      return this.o.b(var1);
   }

   public ac k() {
      return this.o.k();
   }

   public int u(net.yv.r var1) {
      return this.o.u(var1);
   }

   public net.u.e d(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      return this.D.u(var2, var3);
   }

   public net.u.r V(net.yv.r var1, net.u.j var2, net.ne.l var3, net.u.r var4) {
      return this.o.V(var1, var2, var3, var4);
   }

   public boolean o() {
      return this.o.o();
   }

   public boolean f(net.yw.n var1, boolean var2) {
      return this.o.f(var1, var2);
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return this.o.J(var1, var2);
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      this.D.q(var1, var2, net.nb.f.ou, var2);
      this.o.b(var1, var2, this.D);
   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      this.o.V(var1, var2, this.D);
   }

   public void m(net.yv.r var1, net.u.j var2, net.ne.l var3) {
      this.o.m(var1, var2, var3);
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      this.o.P(var1, var2, var3, var4);
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      return this.o.N(var1, var2, this.D, var4, var5, aq.DOWN, 0.0F, 0.0F, 0.0F);
   }

   public void S(net.yv.r var1, net.u.j var2, net.yv.u var3) {
      this.o.S(var1, var2, var3);
   }

   public boolean L(net.yw.n var1) {
      return var1.i(r) == l_.p.TOP;
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return this.o.t(this.D, var2, var3);
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      net.yw.n var9 = super.U(var1, var2, var3, var4, var5, var6, var7, var8);
      var9 = var9.s(F, var8.V()).s(f, l_.h.STRAIGHT);
      return var3 == aq.DOWN || var3 != aq.UP && (double)var5 > 0.5D?var9.s(r, l_.p.TOP):var9.s(r, l_.p.BOTTOM);
   }

   @Nullable
   public net.u.m o(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.r var4, net.u.r var5) {
      ArrayList var6 = Lists.newArrayList();

      for(net.u.e var8 : b(this.v(var1, var2, var3))) {
         var6.add(this.F(var3, var4, var5, var8));
      }

      net.u.m var14 = null;
      double var15 = 0.0D;

      for(net.u.m var11 : var6) {
         double var12 = var11.z.Y(var5);
         if(var12 > var15) {
            var14 = var11;
            var15 = var12;
         }
      }

      return var14;
   }

   public net.yw.n D(int var1) {
      net.yw.n var2 = this.p().s(r, (var1 & 4) > 0?l_.p.TOP:l_.p.BOTTOM);
      var2 = var2.s(F, aq.l(5 - (var1 & 3)));
      return var2;
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      if(var1.i(r) == l_.p.TOP) {
         var2 |= 4;
      }

      var2 = var2 | 5 - ((aq)var1.i(F)).w();
      return var2;
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      return var1.s(f, K(var1, var2, var3));
   }

   private static l_.h K(net.yw.n var0, o8 var1, net.u.j var2) {
      aq var4 = (aq)var0.i(F);
      g3.v.w();
      net.yw.n var5 = var1.Z(var2.C(var4));
      if(O(var5) && var0.i(r) == var5.i(r)) {
         aq var6 = (aq)var5.i(F);
         if(var6.r() != ((aq)var0.i(F)).r() && K(var0, var1, var2, var6.f())) {
            if(var6 == var4.i()) {
               return l_.h.OUTER_LEFT;
            }

            return l_.h.OUTER_RIGHT;
         }
      }

      net.yw.n var8 = var1.Z(var2.C(var4.f()));
      if(O(var8) && var0.i(r) == var8.i(r)) {
         aq var7 = (aq)var8.i(F);
         if(var7.r() != ((aq)var0.i(F)).r() && K(var0, var1, var2, var7)) {
            if(var7 == var4.i()) {
               return l_.h.INNER_LEFT;
            }

            return l_.h.INNER_RIGHT;
         }
      }

      return l_.h.STRAIGHT;
   }

   private static boolean K(net.yw.n var0, o8 var1, net.u.j var2, aq var3) {
      net.yw.n var4 = var1.Z(var2.C(var3));
      return !O(var4) || var4.i(F) != var0.i(F) || var4.i(r) != var0.i(r);
   }

   public static boolean O(net.yw.n var0) {
      return var0.Q() instanceof l_;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(F, var2.d((aq)var1.i(F)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      aq var3 = (aq)var1.i(F);
      l_.h var4 = (l_.h)var1.i(f);
      switch(null.q[var2.ordinal()]) {
      case 1:
         if(var3.r() == aq.l.Z) {
            switch(null.z[var4.ordinal()]) {
            case 1:
               return var1.b(net.yz.l.CLOCKWISE_180).s(f, l_.h.OUTER_RIGHT);
            case 2:
               return var1.b(net.yz.l.CLOCKWISE_180).s(f, l_.h.OUTER_LEFT);
            case 3:
               return var1.b(net.yz.l.CLOCKWISE_180).s(f, l_.h.INNER_LEFT);
            case 4:
               return var1.b(net.yz.l.CLOCKWISE_180).s(f, l_.h.INNER_RIGHT);
            default:
               return var1.b(net.yz.l.CLOCKWISE_180);
            }
         }
         break;
      case 2:
         if(var3.r() == aq.l.X) {
            switch(null.z[var4.ordinal()]) {
            case 1:
               return var1.b(net.yz.l.CLOCKWISE_180).s(f, l_.h.OUTER_RIGHT);
            case 2:
               return var1.b(net.yz.l.CLOCKWISE_180).s(f, l_.h.OUTER_LEFT);
            case 3:
               return var1.b(net.yz.l.CLOCKWISE_180).s(f, l_.h.INNER_RIGHT);
            case 4:
               return var1.b(net.yz.l.CLOCKWISE_180).s(f, l_.h.INNER_LEFT);
            case 5:
               return var1.b(net.yz.l.CLOCKWISE_180);
            }
         }
      }

      return super.P(var1, var2);
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{F, r, f});
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum h implements au {
      STRAIGHT("straight"),
      INNER_LEFT("inner_left"),
      INNER_RIGHT("inner_right"),
      OUTER_LEFT("outer_left"),
      OUTER_RIGHT("outer_right");

      private final String V;

      private h(String var3) {
         this.V = var3;
      }

      public String toString() {
         return this.V;
      }

      public String f() {
         return this.V;
      }
   }

   public static enum p implements au {
      TOP("top"),
      BOTTOM("bottom");

      private final String B;

      private p(String var3) {
         this.B = var3;
      }

      public String toString() {
         return this.B;
      }

      public String f() {
         return this.B;
      }
   }
}
