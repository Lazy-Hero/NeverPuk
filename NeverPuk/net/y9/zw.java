package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.rw;
import net.y9.z4;
import net.yz.a5;
import net.yz.ai;
import net.yz.aq;
import net.yz.ax;

public class zw extends z4 {
   public static final net.yr.g M = rw.N;
   private final boolean Y;
   private static boolean F;

   protected zw(boolean var1) {
      super(net.y1.l.z);
      this.r(this.b.T().s(M, aq.NORTH));
      this.Y = var1;
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.n0.y.q(net.nb.f.uY);
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      this.p(var1, var2, var3);
   }

   private void p(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(!var1.x) {
         net.yw.n var4 = var1.Z(var2.D());
         net.yw.n var5 = var1.Z(var2.d());
         net.yw.n var6 = var1.Z(var2.H());
         net.yw.n var7 = var1.Z(var2.g());
         aq var8 = (aq)var3.i(M);
         if(var8 == aq.NORTH && var4.E() && !var5.E()) {
            var8 = aq.SOUTH;
         } else if(var8 == aq.SOUTH && var5.E() && !var4.E()) {
            var8 = aq.NORTH;
         } else if(var8 == aq.WEST && var6.E() && !var7.E()) {
            var8 = aq.EAST;
         } else if(var8 == aq.EAST && var7.E() && !var6.E()) {
            var8 = aq.WEST;
         }

         var1.k(var2, var3.s(M, var8), 2);
      }

   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      int[] var5 = g3.v.w();
      if(this.Y) {
         aq var6 = (aq)var1.i(M);
         double var7 = (double)var3.t() + 0.5D;
         double var9 = (double)var3.h() + var4.nextDouble() * 6.0D / 16.0D;
         double var11 = (double)var3.y() + 0.5D;
         double var10000 = 0.52D;
         double var15 = var4.nextDouble() * 0.6D - 0.3D;
         if(Double.compare(var4.nextDouble(), 0.1D) < 0) {
            var2.m((double)var3.t() + 0.5D, (double)var3.h(), (double)var3.y() + 0.5D, net.nb.l.S, net.yz.p.BLOCKS, 1.0F, 1.0F, false);
         }

         switch(null.n[var6.ordinal()]) {
         case 1:
            var2.n(ai.SMOKE_NORMAL, var7 - 0.52D, var9, var11 + var15, 0.0D, 0.0D, 0.0D, new int[0]);
            var2.n(ai.FLAME, var7 - 0.52D, var9, var11 + var15, 0.0D, 0.0D, 0.0D, new int[0]);
         case 2:
            var2.n(ai.SMOKE_NORMAL, var7 + 0.52D, var9, var11 + var15, 0.0D, 0.0D, 0.0D, new int[0]);
            var2.n(ai.FLAME, var7 + 0.52D, var9, var11 + var15, 0.0D, 0.0D, 0.0D, new int[0]);
         case 3:
            var2.n(ai.SMOKE_NORMAL, var7 + var15, var9, var11 - 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
            var2.n(ai.FLAME, var7 + var15, var9, var11 - 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
         case 4:
            var2.n(ai.SMOKE_NORMAL, var7 + var15, var9, var11 + 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
            var2.n(ai.FLAME, var7 + var15, var9, var11 + 0.52D, 0.0D, 0.0D, 0.0D, new int[0]);
         }
      }

   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(var1.x) {
         return true;
      } else {
         net.ni.v var10 = var1.L(var2);
         if(var10 instanceof net.ni.l) {
            var4.n((net.ni.l)var10);
            var4.S(net.v.q.W);
         }

         return true;
      }
   }

   public static void d(boolean var0, net.yv.r var1, net.u.j var2) {
      net.yw.n var3 = var1.Z(var2);
      net.ni.v var4 = var1.L(var2);
      F = true;
      var1.k(var2, net.nb.f.d7.p().s(M, var3.i(M)), 3);
      var1.k(var2, net.nb.f.d7.p().s(M, var3.i(M)), 3);
      F = false;
      var4.Q();
      var1.Z(var2, var4);
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.l();
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p().s(M, var8.V().f());
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      var1.k(var2, var3.s(M, var4.V().f()), 2);
      if(var5.v()) {
         net.ni.v var6 = var1.L(var2);
         if(var6 instanceof net.ni.l) {
            ((net.ni.l)var6).q(var5.j());
         }
      }

   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(!F) {
         net.ni.v var4 = var1.L(var2);
         if(var4 instanceof net.ni.l) {
            net.nl.z3.Z(var1, var2, (net.ni.l)var4);
            var1.Z((net.u.j)var2, (l)this);
         }
      }

      super.V(var1, var2, var3);
   }

   public boolean t(net.yw.n var1) {
      return true;
   }

   public int c(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      return net.nl.v.D(var2.L(var3));
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.f.uY);
   }

   public a5 o(net.yw.n var1) {
      return a5.MODEL;
   }

   public net.yw.n D(int var1) {
      aq var2 = aq.l(var1);
      if(var2.r() == aq.l.Y) {
         var2 = aq.NORTH;
      }

      return this.p().s(M, var2);
   }

   public int d(net.yw.n var1) {
      return ((aq)var1.i(M)).w();
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(M, var2.d((aq)var1.i(M)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(M)));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{M});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
