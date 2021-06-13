package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.rw;
import net.y9.z4;
import net.yv.o8;
import net.yz.a5;
import net.yz.ai;
import net.yz.aq;
import net.yz.ax;

public class zy extends z4 {
   public static final net.yr.g a = rw.N;
   protected static final net.u.e R = new net.u.e(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.875D, 0.9375D);

   protected zy() {
      super(net.y1.l.z);
      this.r(this.b.T().s(a, aq.NORTH));
      this.f(net.ys.r.X);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return R;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean j(net.yw.n var1) {
      return true;
   }

   public a5 o(net.yw.n var1) {
      return a5.ENTITYBLOCK_ANIMATED;
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.n0.y.q(net.nb.f.c);
   }

   public int T(Random var1) {
      return 8;
   }

   protected boolean u() {
      return true;
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p().s(a, var8.V().f());
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      var1.k(var2, var3.s(a, var4.V().f()), 2);
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      g3.v.w();
      net.nl.zp var11 = var4.D();
      net.ni.v var12 = var1.L(var2);
      if(var12 instanceof net.ni.n) {
         if(var1.Z(var2.h()).i()) {
            return true;
         } else if(var1.x) {
            return true;
         } else {
            var11.o((net.ni.n)var12);
            var4.n(var11);
            var4.S(net.v.q.R);
            return true;
         }
      } else {
         return true;
      }
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.n();
   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      g3.v.w();
      int var6 = 0;
      int var7 = var4.nextInt(2) * 2 - 1;
      int var8 = var4.nextInt(2) * 2 - 1;
      double var9 = (double)var3.t() + 0.5D + 0.25D * (double)var7;
      double var11 = (double)((float)var3.h() + var4.nextFloat());
      double var13 = (double)var3.y() + 0.5D + 0.25D * (double)var8;
      double var15 = (double)(var4.nextFloat() * (float)var7);
      double var17 = ((double)var4.nextFloat() - 0.5D) * 0.125D;
      double var19 = (double)(var4.nextFloat() * (float)var8);
      var2.n(ai.PORTAL, var9, var11, var13, var15, var17, var19, new int[0]);
      ++var6;
   }

   public net.yw.n D(int var1) {
      aq var2 = aq.l(var1);
      if(var2.r() == aq.l.Y) {
         var2 = aq.NORTH;
      }

      return this.p().s(a, var2);
   }

   public int d(net.yw.n var1) {
      return ((aq)var1.i(a)).w();
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(a, var2.d((aq)var1.i(a)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(a)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{a});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
