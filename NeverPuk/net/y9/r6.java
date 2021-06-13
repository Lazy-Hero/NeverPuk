package net.y9;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.ru;
import net.yv.o8;
import net.yz.aq;
import net.yz.ax;

public abstract class r6 extends ru {
   public static final net.yr.o W = net.yr.o.k("powered");
   protected static final net.u.e a = new net.u.e(0.3125D, 0.875D, 0.375D, 0.6875D, 1.0D, 0.625D);
   protected static final net.u.e N = new net.u.e(0.3125D, 0.0D, 0.375D, 0.6875D, 0.125D, 0.625D);
   protected static final net.u.e f = new net.u.e(0.3125D, 0.375D, 0.875D, 0.6875D, 0.625D, 1.0D);
   protected static final net.u.e D = new net.u.e(0.3125D, 0.375D, 0.0D, 0.6875D, 0.625D, 0.125D);
   protected static final net.u.e r = new net.u.e(0.875D, 0.375D, 0.3125D, 1.0D, 0.625D, 0.6875D);
   protected static final net.u.e H = new net.u.e(0.0D, 0.375D, 0.3125D, 0.125D, 0.625D, 0.6875D);
   protected static final net.u.e Q = new net.u.e(0.3125D, 0.9375D, 0.375D, 0.6875D, 1.0D, 0.625D);
   protected static final net.u.e J = new net.u.e(0.3125D, 0.0D, 0.375D, 0.6875D, 0.0625D, 0.625D);
   protected static final net.u.e O = new net.u.e(0.3125D, 0.375D, 0.9375D, 0.6875D, 0.625D, 1.0D);
   protected static final net.u.e o = new net.u.e(0.3125D, 0.375D, 0.0D, 0.6875D, 0.625D, 0.0625D);
   protected static final net.u.e i = new net.u.e(0.9375D, 0.375D, 0.3125D, 1.0D, 0.625D, 0.6875D);
   protected static final net.u.e v = new net.u.e(0.0D, 0.375D, 0.3125D, 0.0625D, 0.625D, 0.6875D);
   private final boolean u;

   protected r6(boolean var1) {
      super(net.y1.l.c);
      this.r(this.b.T().s(n, aq.NORTH).s(W, Boolean.valueOf(false)));
      this.R(true);
      this.f(net.ys.r.i);
      this.u = var1;
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return q;
   }

   public int u(net.yv.r var1) {
      return this.u?30:20;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean C(net.yv.r var1, net.u.j var2, aq var3) {
      return p(var1, var2, var3);
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      for(aq var6 : aq.values()) {
         if(p(var1, var2, var6)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean p(net.yv.r var0, net.u.j var1, aq var2) {
      net.u.j var3 = var1.C(var2.f());
      net.yw.n var4 = var0.Z(var3);
      boolean var5 = var4.B(var0, var3, var2) == net.yw.g.SOLID;
      l var6 = var4.Q();
      return var2 != aq.UP?!m(var6):var6 == net.nb.f.uq || !X(var6);
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return p(var1, var2, var3)?this.p().s(n, var3).s(W, Boolean.valueOf(false)):this.p().s(n, aq.DOWN).s(W, Boolean.valueOf(false));
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(this.r(var2, var3, var1) && !p(var2, var3, (aq)var1.i(n))) {
         this.N(var2, var3, var1, 0);
         var2.J(var3);
      }

   }

   private boolean r(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(this.J(var1, var2)) {
         return true;
      } else {
         this.N(var1, var2, var3, 0);
         var1.J(var2);
         return false;
      }
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      aq var4 = (aq)var1.i(n);
      boolean var5 = ((Boolean)var1.i(W)).booleanValue();
      switch(null.h[var4.ordinal()]) {
      case 1:
         return v;
      case 2:
         return i;
      case 3:
         return o;
      case 4:
      default:
         return O;
      case 5:
         return J;
      case 6:
         return Q;
      }
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(((Boolean)var3.i(W)).booleanValue()) {
         return true;
      } else {
         var1.k(var2, var3.s(W, Boolean.valueOf(true)), 3);
         var1.k(var2, var2);
         this.o(var4, var1, var2);
         this.c(var1, var2, (aq)var3.i(n));
         var1.c(var2, this, this.u(var1));
         return true;
      }
   }

   protected abstract void o(net.r.r var1, net.yv.r var2, net.u.j var3);

   protected abstract void K(net.yv.r var1, net.u.j var2);

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(((Boolean)var3.i(W)).booleanValue()) {
         this.c(var1, var2, (aq)var3.i(n));
      }

      super.V(var1, var2, var3);
   }

   public int L(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return ((Boolean)var1.i(W)).booleanValue()?15:0;
   }

   public int n(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return !((Boolean)var1.i(W)).booleanValue()?0:(var1.i(n) == var4?15:0);
   }

   public boolean s(net.yw.n var1) {
      return true;
   }

   public void i(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(!var1.x && ((Boolean)var3.i(W)).booleanValue()) {
         if(this.u) {
            this.P(var3, var1, var2);
         } else {
            var1.U(var2, var3.s(W, Boolean.valueOf(false)));
            this.c(var1, var2, (aq)var3.i(n));
            this.K(var1, var2);
            var1.k(var2, var2);
         }
      }

   }

   public void N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.l var4) {
      if(!var1.x && this.u && !((Boolean)var3.i(W)).booleanValue()) {
         this.P(var3, var1, var2);
      }

   }

   private void P(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      g3.v.w();
      List var5 = var2.p(net.n1.o.class, var1.q(var2, var3).c(var3));
      boolean var6 = !var5.isEmpty();
      boolean var7 = ((Boolean)var1.i(W)).booleanValue();
      if(var7) {
         var2.U(var3, var1.s(W, Boolean.valueOf(false)));
         this.c(var2, var3, (aq)var1.i(n));
         var2.k(var3, var3);
         this.K(var2, var3);
      }

   }

   private void c(net.yv.r var1, net.u.j var2, aq var3) {
      var1.b(var2, this, false);
      var1.b(var2.C(var3.f()), this, false);
   }

   public net.yw.n D(int var1) {
      aq var2;
      switch(var1 & 7) {
      case 0:
         var2 = aq.DOWN;
         break;
      case 1:
         var2 = aq.EAST;
         break;
      case 2:
         var2 = aq.WEST;
         break;
      case 3:
         var2 = aq.SOUTH;
         break;
      case 4:
         var2 = aq.NORTH;
         break;
      case 5:
      default:
         var2 = aq.UP;
      }

      return this.p().s(n, var2).s(W, Boolean.valueOf((var1 & 8) > 0));
   }

   public int d(net.yw.n var1) {
      int var2;
      switch(null.h[((aq)var1.i(n)).ordinal()]) {
      case 1:
         var2 = 1;
         break;
      case 2:
         var2 = 2;
         break;
      case 3:
         var2 = 3;
         break;
      case 4:
         var2 = 4;
         break;
      case 5:
      default:
         var2 = 5;
         break;
      case 6:
         var2 = 0;
      }

      if(((Boolean)var1.i(W)).booleanValue()) {
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
      return new net.yw.q(this, new net.yr.h[]{n, W});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
