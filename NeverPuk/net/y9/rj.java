package net.y9;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.lk;
import net.y9.ra;
import net.y9.ru;
import net.yv.o8;
import net.yz.aq;
import net.yz.au;
import net.yz.ax;

public class rj extends ru {
   public static final net.yr.w Y = net.yr.w.l("type", rj.n.class);
   public static final net.yr.o Q = net.yr.o.k("short");
   protected static final net.u.e M = new net.u.e(0.75D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e J = new net.u.e(0.0D, 0.0D, 0.0D, 0.25D, 1.0D, 1.0D);
   protected static final net.u.e R = new net.u.e(0.0D, 0.0D, 0.75D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e h = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.25D);
   protected static final net.u.e k = new net.u.e(0.0D, 0.75D, 0.0D, 1.0D, 1.0D, 1.0D);
   protected static final net.u.e u = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D);
   protected static final net.u.e a = new net.u.e(0.375D, -0.25D, 0.375D, 0.625D, 0.75D, 0.625D);
   protected static final net.u.e d = new net.u.e(0.375D, 0.25D, 0.375D, 0.625D, 1.25D, 0.625D);
   protected static final net.u.e W = new net.u.e(0.375D, 0.375D, -0.25D, 0.625D, 0.625D, 0.75D);
   protected static final net.u.e D = new net.u.e(0.375D, 0.375D, 0.25D, 0.625D, 0.625D, 1.25D);
   protected static final net.u.e v = new net.u.e(-0.25D, 0.375D, 0.375D, 0.75D, 0.625D, 0.625D);
   protected static final net.u.e f = new net.u.e(0.25D, 0.375D, 0.375D, 1.25D, 0.625D, 0.625D);
   protected static final net.u.e F = new net.u.e(0.375D, 0.0D, 0.375D, 0.625D, 0.75D, 0.625D);
   protected static final net.u.e l = new net.u.e(0.375D, 0.25D, 0.375D, 0.625D, 1.0D, 0.625D);
   protected static final net.u.e o = new net.u.e(0.375D, 0.375D, 0.0D, 0.625D, 0.625D, 0.75D);
   protected static final net.u.e O = new net.u.e(0.375D, 0.375D, 0.25D, 0.625D, 0.625D, 1.0D);
   protected static final net.u.e c = new net.u.e(0.0D, 0.375D, 0.375D, 0.75D, 0.625D, 0.625D);
   protected static final net.u.e H = new net.u.e(0.25D, 0.375D, 0.375D, 1.0D, 0.625D, 0.625D);

   public rj() {
      super(net.y1.l.a);
      this.r(this.b.T().s(n, aq.NORTH).s(Y, rj.n.DEFAULT).s(Q, Boolean.valueOf(false)));
      this.i(lk.P);
      this.r(0.5F);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      switch(null.z[((aq)var1.i(n)).ordinal()]) {
      case 1:
      default:
         return u;
      case 2:
         return k;
      case 3:
         return h;
      case 4:
         return R;
      case 5:
         return J;
      case 6:
         return M;
      }
   }

   public void S(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.e var4, List var5, @Nullable net.ne.l var6, boolean var7) {
      F(var3, var4, var5, var1.q(var2, var3));
      F(var3, var4, var5, this.a(var1));
   }

   private net.u.e a(net.yw.n var1) {
      g3.v.w();
      boolean var3 = ((Boolean)var1.i(Q)).booleanValue();
      switch(null.z[((aq)var1.i(n)).ordinal()]) {
      case 1:
      default:
         return l;
      case 2:
         return F;
      case 3:
         return O;
      case 4:
         return o;
      case 5:
         return H;
      case 6:
         return var3?c:v;
      }
   }

   public boolean L(net.yw.n var1) {
      return var1.i(n) == aq.UP;
   }

   public void X(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4) {
      if(var4.a6.V) {
         net.u.j var5 = var2.C(((aq)var3.i(n)).f());
         l var6 = var1.Z(var5).Q();
         if(var6 == net.nb.f.TP || var6 == net.nb.f.oG) {
            var1.J(var5);
         }
      }

      super.X(var1, var2, var3, var4);
   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      super.V(var1, var2, var3);
      g3.v.w();
      aq var5 = ((aq)var3.i(n)).f();
      var2 = var2.C(var5);
      net.yw.n var6 = var1.Z(var2);
      if((var6.Q() == net.nb.f.TP || var6.Q() == net.nb.f.oG) && ((Boolean)var6.i(ra.o)).booleanValue()) {
         var6.Q().N(var1, var2, var6, 0);
         var1.J(var2);
      }

   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return false;
   }

   public boolean C(net.yv.r var1, net.u.j var2, aq var3) {
      return false;
   }

   public int T(Random var1) {
      return 0;
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      aq var6 = (aq)var1.i(n);
      net.u.j var7 = var3.C(var6.f());
      net.yw.n var8 = var2.Z(var7);
      if(var8.Q() != net.nb.f.TP && var8.Q() != net.nb.f.oG) {
         var2.J(var3);
      } else {
         var8.q(var2, var7, var4, var5);
      }

   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return true;
   }

   @Nullable
   public static aq r(int var0) {
      int var1 = var0 & 7;
      return var1 > 5?null:aq.l(var1);
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(var3.i(Y) == rj.n.STICKY?net.nb.f.oG:net.nb.f.TP);
   }

   public net.yw.n D(int var1) {
      return this.p().s(n, r(var1)).s(Y, (var1 & 8) > 0?rj.n.STICKY:rj.n.DEFAULT);
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((aq)var1.i(n)).w();
      if(var1.i(Y) == rj.n.STICKY) {
         var2 |= 8;
      }

      return var2;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(n, var2.d((aq)var1.i(n)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(n)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{n, Y, Q});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return var4 == var2.i(n)?net.yw.g.SOLID:net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum n implements au {
      DEFAULT("normal"),
      STICKY("sticky");

      private final String B;

      private n(String var3) {
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
