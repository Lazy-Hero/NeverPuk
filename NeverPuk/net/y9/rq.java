package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.y9.g3;
import net.y9.gc;
import net.y9.l;
import net.y9.l7;
import net.y9.lm;
import net.y9.rw;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;
import net.yz.ax;

public class rq extends rw implements lm {
   public static final net.yr.l R = net.yr.l.J("age", 0, 2);
   protected static final net.u.e[] Y = new net.u.e[]{new net.u.e(0.6875D, 0.4375D, 0.375D, 0.9375D, 0.75D, 0.625D), new net.u.e(0.5625D, 0.3125D, 0.3125D, 0.9375D, 0.75D, 0.6875D), new net.u.e(0.4375D, 0.1875D, 0.25D, 0.9375D, 0.75D, 0.75D)};
   protected static final net.u.e[] c = new net.u.e[]{new net.u.e(0.0625D, 0.4375D, 0.375D, 0.3125D, 0.75D, 0.625D), new net.u.e(0.0625D, 0.3125D, 0.3125D, 0.4375D, 0.75D, 0.6875D), new net.u.e(0.0625D, 0.1875D, 0.25D, 0.5625D, 0.75D, 0.75D)};
   protected static final net.u.e[] O = new net.u.e[]{new net.u.e(0.375D, 0.4375D, 0.0625D, 0.625D, 0.75D, 0.3125D), new net.u.e(0.3125D, 0.3125D, 0.0625D, 0.6875D, 0.75D, 0.4375D), new net.u.e(0.25D, 0.1875D, 0.0625D, 0.75D, 0.75D, 0.5625D)};
   protected static final net.u.e[] o = new net.u.e[]{new net.u.e(0.375D, 0.4375D, 0.6875D, 0.625D, 0.75D, 0.9375D), new net.u.e(0.3125D, 0.3125D, 0.5625D, 0.6875D, 0.75D, 0.9375D), new net.u.e(0.25D, 0.1875D, 0.4375D, 0.75D, 0.75D, 0.9375D)};

   public rq() {
      super(net.y1.l.u);
      this.r(this.b.T().s(N, aq.NORTH).s(R, Integer.valueOf(0)));
      this.R(true);
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      int[] var5 = g3.v.w();
      if(!this.g(var1, var2, var3)) {
         this.k(var1, var2, var3);
      }

      if(var1.G.nextInt(5) == 0) {
         int var6 = ((Integer)var3.i(R)).intValue();
         if(var6 < 2) {
            var1.k(var2, var3.s(R, Integer.valueOf(var6 + 1)), 2);
         }
      }

   }

   public boolean g(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      var2 = var2.C((aq)var3.i(N));
      net.yw.n var4 = var1.Z(var2);
      return var4.Q() == net.nb.f.u6 && var4.i(l7.d) == gc.i.JUNGLE;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      int var4 = ((Integer)var1.i(R)).intValue();
      switch(null.c[((aq)var1.i(N)).ordinal()]) {
      case 1:
         return o[var4];
      case 2:
      default:
         return O[var4];
      case 3:
         return c[var4];
      case 4:
         return Y[var4];
      }
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(N, var2.d((aq)var1.i(N)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(N)));
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      aq var6 = aq.d((double)var4.hN);
      var1.k(var2, var3.s(N, var6), 2);
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      if(!var3.r().P()) {
         var3 = aq.NORTH;
      }

      return this.p().s(N, var3.f()).s(R, Integer.valueOf(0));
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!this.g(var2, var3, var1)) {
         this.k(var2, var3, var1);
      }

   }

   private void k(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      var1.k(var2, net.nb.f.ou.p(), 3);
      this.N(var1, var2, var3, 0);
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
      int var6 = ((Integer)var3.i(R)).intValue();
      boolean var7 = true;
      if(var6 >= 2) {
         var7 = true;
      }

      int var8 = 0;

      while(true) {
         e(var1, var2, new ks(net.nb.j.n, 1, kw.BROWN.G()));
         ++var8;
      }
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.j.n, 1, kw.BROWN.G());
   }

   public boolean L(net.yv.r var1, net.u.j var2, net.yw.n var3, boolean var4) {
      return ((Integer)var3.i(R)).intValue() < 2;
   }

   public boolean p(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      return true;
   }

   public void e(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      var1.k(var3, var4.s(R, Integer.valueOf(((Integer)var4.i(R)).intValue() + 1)), 2);
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.n D(int var1) {
      return this.p().s(N, aq.Q(var1)).s(R, Integer.valueOf((var1 & 15) >> 2));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((aq)var1.i(N)).u();
      var2 = var2 | ((Integer)var1.i(R)).intValue() << 2;
      return var2;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{N, R});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
