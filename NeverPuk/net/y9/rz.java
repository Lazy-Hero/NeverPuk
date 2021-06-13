package net.y9;

import java.util.Random;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.rv;
import net.y9.v;
import net.y9.zh;
import net.yv.o8;
import net.yz.aq;

public class rz extends l {
   public static final net.yr.l R = net.yr.l.J("moisture", 0, 7);
   protected static final net.u.e d = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.9375D, 1.0D);
   protected static final net.u.e c = new net.u.e(0.0D, 0.9375D, 0.0D, 1.0D, 1.0D, 1.0D);

   protected rz() {
      super(net.y1.l.E);
      this.r(this.b.T().s(R, Integer.valueOf(0)));
      this.R(true);
      this.R(255);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return d;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      g3.v.w();
      int var6 = ((Integer)var3.i(R)).intValue();
      if(!this.i(var1, var2) && !var1.F(var2.h())) {
         if(var6 > 0) {
            var1.k(var2, var3.s(R, Integer.valueOf(var6 - 1)), 2);
         }

         if(this.E(var1, var2)) {
            return;
         }

         N(var1, var2);
      }

      if(var6 < 7) {
         var1.k(var2, var3.s(R, Integer.valueOf(7)), 2);
      }

   }

   public void f(net.yv.r var1, net.u.j var2, net.ne.l var3, float var4) {
      if(!var1.x && var1.G.nextFloat() < var4 - 0.5F && var3 instanceof net.ne.a && (var3 instanceof net.r.r || var1.N().b("mobGriefing")) && var3.h9 * var3.h9 * var3.m > 0.512F) {
         N(var1, var2);
      }

      super.f(var1, var2, var3, var4);
   }

   protected static void N(net.yv.r var0, net.u.j var1) {
      var0.U(var1, net.nb.f.dl.p());
      net.u.e var2 = c.c(var1);

      for(net.ne.l var4 : var0.u((net.ne.l)null, var2)) {
         double var5 = Math.min(var2.c - var2.u, var2.c - var4.i().u);
         var4.a(var4.b, var4.hS + var5 + 0.001D, var4.hr);
      }

   }

   private boolean E(net.yv.r var1, net.u.j var2) {
      l var3 = var1.Z(var2.h()).Q();
      return var3 instanceof v || var3 instanceof zh;
   }

   private boolean i(net.yv.r var1, net.u.j var2) {
      for(net.u.j var4 : net.u.j.X(var2.F(-4, 0, -4), var2.F(4, 1, 4))) {
         if(var1.Z(var4).n() == net.y1.l.p) {
            return true;
         }
      }

      return false;
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      super.Z(var1, var2, var3, var4, var5);
      if(var2.Z(var3.h()).n().B()) {
         N(var2, var3);
      }

   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      super.b(var1, var2, var3);
      if(var1.Z(var2.h()).n().B()) {
         N(var1, var2);
      }

   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      switch(null.o[var4.ordinal()]) {
      case 1:
         return true;
      case 2:
      case 3:
      case 4:
      case 5:
         net.yw.n var5 = var2.Z(var3.C(var4));
         l var6 = var5.Q();
         return !var5.j() && var6 != net.nb.f.dJ && var6 != net.nb.f.A;
      default:
         return super.v(var1, var2, var3, var4);
      }
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.f.dl.X(net.nb.f.dl.p().s(rv.l, rv.m.DIRT), var2, var3);
   }

   public net.yw.n D(int var1) {
      return this.p().s(R, Integer.valueOf(var1 & 7));
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(R)).intValue();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{R});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return var4 == aq.DOWN?net.yw.g.SOLID:net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
