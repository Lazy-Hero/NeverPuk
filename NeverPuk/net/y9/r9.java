package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.gc;
import net.y9.l;
import net.y9.rw;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;
import net.yz.au;
import net.yz.ax;

public class r9 extends l {
   public static final net.yr.g D = rw.N;
   public static final net.yr.o E = net.yr.o.k("open");
   public static final net.yr.w h = net.yr.w.l("hinge", r9.h.class);
   public static final net.yr.o Y = net.yr.o.k("powered");
   public static final net.yr.w W = net.yr.w.l("half", r9.k.class);
   protected static final net.u.e Q = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.1875D);
   protected static final net.u.e u = new net.u.e(0.0D, 0.0D, 0.8125D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e f = new net.u.e(0.8125D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e o = new net.u.e(0.0D, 0.0D, 0.0D, 0.1875D, 1.0D, 1.0D);

   protected r9(net.y1.l var1) {
      super(var1);
      this.r(this.b.T().s(D, aq.NORTH).s(E, Boolean.valueOf(false)).s(h, r9.h.LEFT).s(Y, Boolean.valueOf(false)).s(W, r9.k.LOWER));
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      var1 = var1.J(var2, var3);
      aq var4 = (aq)var1.i(D);
      boolean var5 = !((Boolean)var1.i(E)).booleanValue();
      if(var1.i(h) == r9.h.RIGHT) {
         boolean var10000 = true;
      } else {
         boolean var8 = false;
      }

      switch(null.r[var4.ordinal()]) {
      case 1:
      default:
         return o;
      case 2:
         return Q;
      case 3:
         return f;
      case 4:
         return u;
      }
   }

   public String U() {
      return net.yq.e.E((this.j() + ".name").replaceAll("tile", "item"));
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean c(o8 var1, net.u.j var2) {
      return B(a(var1, var2));
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   private int a() {
      return this.C == net.y1.l.i?1011:1012;
   }

   private int F() {
      return this.C == net.y1.l.i?1005:1006;
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return var1.Q() == net.nb.f.o2?net.y1.h.TB:(var1.Q() == net.nb.f.dc?gc.i.OAK.t():(var1.Q() == net.nb.f.d0?gc.i.SPRUCE.t():(var1.Q() == net.nb.f.T1?gc.i.BIRCH.t():(var1.Q() == net.nb.f.b?gc.i.JUNGLE.t():(var1.Q() == net.nb.f.dH?gc.i.ACACIA.t():(var1.Q() == net.nb.f.uV?gc.i.DARK_OAK.t():super.t(var1, var2, var3)))))));
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(this.C == net.y1.l.i) {
         return false;
      } else {
         net.u.j var10 = var3.i(W) == r9.k.LOWER?var2:var2.b();
         net.yw.n var11 = var2.equals(var10)?var3:var1.Z(var10);
         if(var11.Q() != this) {
            return false;
         } else {
            var3 = var11.C(E);
            var1.k(var10, var3, 10);
            var1.k(var10, var2);
            var1.N(var4, ((Boolean)var3.i(E)).booleanValue()?this.F():this.a(), var2, 0);
            return true;
         }
      }
   }

   public void y(net.yv.r var1, net.u.j var2, boolean var3) {
      net.yw.n var4 = var1.Z(var2);
      if(var4.Q() == this) {
         net.u.j var5 = var4.i(W) == r9.k.LOWER?var2:var2.b();
         net.yw.n var6 = var2 == var5?var4:var1.Z(var5);
         if(var6.Q() == this && ((Boolean)var6.i(E)).booleanValue() != var3) {
            var1.k(var5, var6.s(E, Boolean.valueOf(var3)), 10);
            var1.k(var5, var2);
            var1.N((net.r.r)null, this.F(), var2, 0);
         }
      }

   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      int[] var6 = g3.v.w();
      if(var1.i(W) == r9.k.UPPER) {
         net.u.j var7 = var3.b();
         net.yw.n var8 = var2.Z(var7);
         if(var8.Q() != this) {
            var2.J(var3);
         }

         if(var4 != this) {
            var8.q(var2, var7, var4, var5);
         }
      }

      boolean var11 = false;
      net.u.j var14 = var3.h();
      net.yw.n var9 = var2.Z(var14);
      if(var9.Q() != this) {
         var2.J(var3);
         var11 = true;
      }

      if(!var2.Z(var3.b()).z()) {
         var2.J(var3);
         var11 = true;
         if(var9.Q() == this) {
            var2.J(var14);
         }
      }

      boolean var10 = var2.B(var3) || var2.B(var14);
      if(var4 != this && var10 != ((Boolean)var9.i(Y)).booleanValue()) {
         var2.k(var14, var9.s(Y, Boolean.valueOf(var10)), 2);
         if(var10 != ((Boolean)var1.i(E)).booleanValue()) {
            var2.k(var3, var1.s(E, Boolean.valueOf(var10)), 2);
            var2.k(var3, var3);
            var2.N((net.r.r)null, this.F(), var3, 0);
         }
      }

   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return var1.i(W) == r9.k.UPPER?net.nb.j.SL:this.j();
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return var2.h() >= 255?false:var1.Z(var2.b()).z() && super.J(var1, var2) && super.J(var1, var2.h());
   }

   public net.y1.v T(net.yw.n var1) {
      return net.y1.v.DESTROY;
   }

   public static int a(o8 var0, net.u.j var1) {
      net.yw.n var2 = var0.Z(var1);
      int var3 = var2.Q().d(var2);
      boolean var4 = O(var3);
      net.yw.n var5 = var0.Z(var1.b());
      int var6 = var5.Q().d(var5);
      net.yw.n var8 = var0.Z(var1.h());
      var8.Q().d(var8);
      boolean var11 = (var3 & 1) != 0;
      boolean var12 = (var3 & 2) != 0;
      return N(var6) | 8 | 16 | 32;
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(this.j());
   }

   private net.n0.y j() {
      return this == net.nb.f.o2?net.nb.j.Y5:(this == net.nb.f.d0?net.nb.j.WK:(this == net.nb.f.T1?net.nb.j.Ya:(this == net.nb.f.b?net.nb.j.Yk:(this == net.nb.f.dH?net.nb.j.i:(this == net.nb.f.uV?net.nb.j.W0:net.nb.j.s)))));
   }

   public void X(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4) {
      net.u.j var5 = var2.b();
      net.u.j var6 = var2.h();
      if(var4.a6.V && var3.i(W) == r9.k.UPPER && var1.Z(var5).Q() == this) {
         var1.J(var5);
      }

      if(var3.i(W) == r9.k.LOWER && var1.Z(var6).Q() == this) {
         if(var4.a6.V) {
            var1.J(var2);
         }

         var1.J(var6);
      }

   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      if(var1.i(W) == r9.k.LOWER) {
         net.yw.n var4 = var2.Z(var3.h());
         if(var4.Q() == this) {
            var1 = var1.s(h, var4.i(h)).s(Y, var4.i(Y));
         }
      } else {
         net.yw.n var5 = var2.Z(var3.b());
         if(var5.Q() == this) {
            var1 = var1.s(D, var5.i(D)).s(E, var5.i(E));
         }
      }

      return var1;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.i(W) != r9.k.LOWER?var1:var1.s(D, var2.d((aq)var1.i(D)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var2 == ax.NONE?var1:var1.b(var2.S((aq)var1.i(D))).C(h);
   }

   public net.yw.n D(int var1) {
      return (var1 & 8) > 0?this.p().s(W, r9.k.UPPER).s(h, (var1 & 1) > 0?r9.h.RIGHT:r9.h.LEFT).s(Y, Boolean.valueOf((var1 & 2) > 0)):this.p().s(W, r9.k.LOWER).s(D, aq.Q(var1 & 3).i()).s(E, Boolean.valueOf((var1 & 4) > 0));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      if(var1.i(W) == r9.k.UPPER) {
         var2 = var2 | 8;
         if(var1.i(h) == r9.h.RIGHT) {
            var2 |= 1;
         }

         if(((Boolean)var1.i(Y)).booleanValue()) {
            var2 |= 2;
         }
      } else {
         var2 = var2 | ((aq)var1.i(D)).R().u();
         if(((Boolean)var1.i(E)).booleanValue()) {
            var2 |= 4;
         }
      }

      return var2;
   }

   protected static int N(int var0) {
      return var0 & 7;
   }

   public static boolean P(o8 var0, net.u.j var1) {
      return B(a(var0, var1));
   }

   public static aq n(o8 var0, net.u.j var1) {
      return V(a(var0, var1));
   }

   public static aq V(int var0) {
      return aq.Q(var0 & 3).i();
   }

   protected static boolean B(int var0) {
      return (var0 & 4) != 0;
   }

   protected static boolean O(int var0) {
      return (var0 & 8) != 0;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{W, D, E, h, Y});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum h implements au {
      LEFT,
      RIGHT;

      public String toString() {
         return this.f();
      }

      public String f() {
         return this == LEFT?"left":"right";
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static enum k implements au {
      UPPER,
      LOWER;

      public String toString() {
         return this.f();
      }

      public String f() {
         return this == UPPER?"upper":"lower";
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
