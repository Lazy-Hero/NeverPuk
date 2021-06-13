package net.y9;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.y9.g3;
import net.y9.l;
import net.y9.r;
import net.y9.rw;
import net.yv.o8;
import net.yz.a5;
import net.yz.ac;
import net.yz.aq;
import net.yz.au;
import net.yz.ax;

public class rn extends rw implements r {
   public static final net.yr.w d = net.yr.w.l("part", rn.a.class);
   public static final net.yr.o F = net.yr.o.k("occupied");
   protected static final net.u.e u = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.5625D, 1.0D);

   public rn() {
      super(net.y1.l.d);
      this.r(this.b.T().s(d, rn.a.FOOT).s(F, Boolean.valueOf(false)));
      this.U = true;
   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      if(var1.i(d) == rn.a.FOOT) {
         net.ni.v var4 = var2.L(var3);
         if(var4 instanceof net.ni.y) {
            kw var5 = ((net.ni.y)var4).f();
            return net.y1.h.o(var5);
         }
      }

      return net.y1.h.U;
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      int[] var10 = g3.v.w();
      if(var1.x) {
         return true;
      } else {
         if(var3.i(d) != rn.a.HEAD) {
            var2 = var2.C((aq)var3.i(N));
            var3 = var1.Z(var2);
            if(var3.Q() != this) {
               return true;
            }
         }

         if(var1.F.X() && var1.P(var2) != net.nb.x.l) {
            if(((Boolean)var3.i(F)).booleanValue()) {
               net.r.r var14 = this.Y(var1, var2);
               var4.g(new net.cb.h("tile.bed.occupied", new Object[0]), true);
               return true;
            } else {
               net.r.r var13 = var4.M(var2);
               if(var13 == net.r.r.OK) {
                  var3 = var3.s(F, Boolean.valueOf(true));
                  var1.k(var2, var3, 4);
                  return true;
               } else {
                  if(var13 == net.r.r.NOT_POSSIBLE_NOW) {
                     var4.g(new net.cb.h("tile.bed.noSleep", new Object[0]), true);
                  }

                  if(var13 == net.r.r.NOT_SAFE) {
                     var4.g(new net.cb.h("tile.bed.notSafe", new Object[0]), true);
                  }

                  if(var13 == net.r.r.TOO_FAR_AWAY) {
                     var4.g(new net.cb.h("tile.bed.tooFarAway", new Object[0]), true);
                  }

                  return true;
               }
            }
         } else {
            var1.J(var2);
            net.u.j var11 = var2.C(((aq)var3.i(N)).f());
            if(var1.Z(var11).Q() == this) {
               var1.J(var11);
            }

            var1.c((net.ne.l)null, (double)var2.t() + 0.5D, (double)var2.h() + 0.5D, (double)var2.y() + 0.5D, 5.0F, true, true);
            return true;
         }
      }
   }

   @Nullable
   private net.r.r Y(net.yv.r var1, net.u.j var2) {
      for(net.r.r var4 : var1.A) {
         if(var4.L() && var4.a0.equals(var2)) {
            return var4;
         }
      }

      return null;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public void f(net.yv.r var1, net.u.j var2, net.ne.l var3, float var4) {
      super.f(var1, var2, var3, var4 * 0.5F);
   }

   public void w(net.yv.r var1, net.ne.l var2) {
      if(var2.Q()) {
         super.w(var1, var2);
      } else if(var2.K < 0.0D) {
         var2.K = -var2.K * 0.6600000262260437D;
         if(!(var2 instanceof net.ne.a)) {
            var2.K *= 0.8D;
         }
      }

   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      aq var6 = (aq)var1.i(N);
      if(var1.i(d) == rn.a.FOOT) {
         if(var2.Z(var3.C(var6)).Q() != this) {
            var2.J(var3);
         }
      } else if(var2.Z(var3.C(var6.f())).Q() != this) {
         if(!var2.x) {
            this.N(var2, var3, var1, 0);
         }

         var2.J(var3);
      }

   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return var1.i(d) == rn.a.FOOT?net.nb.j.SL:net.nb.j.W1;
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return u;
   }

   public boolean j(net.yw.n var1) {
      return true;
   }

   @Nullable
   public static net.u.j V(net.yv.r var0, net.u.j var1, int var2) {
      aq var3 = (aq)var0.Z(var1).i(N);
      int var4 = var1.t();
      int var5 = var1.h();
      int var6 = var1.y();
      int var7 = 0;

      while(true) {
         int var8 = var4 - var3.v() * var7 - 1;
         int var9 = var6 - var3.P() * var7 - 1;
         int var10 = var8 + 2;
         int var11 = var9 + 2;

         for(int var12 = var8; var12 <= var10; ++var12) {
            for(int var13 = var9; var13 <= var11; ++var13) {
               net.u.j var14 = new net.u.j(var12, var5, var13);
               if(z(var0, var14)) {
                  return var14;
               }
            }
         }

         ++var7;
      }
   }

   protected static boolean z(net.yv.r var0, net.u.j var1) {
      return var0.Z(var1.b()).z() && !var0.Z(var1).n().B() && !var0.Z(var1.h()).n().B();
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
      if(var3.i(d) == rn.a.HEAD) {
         net.ni.v var6 = var1.L(var2);
         kw var7 = var6 instanceof net.ni.y?((net.ni.y)var6).f():kw.RED;
         e(var1, var2, new ks(net.nb.j.W1, 1, var7.d()));
      }

   }

   public net.y1.v T(net.yw.n var1) {
      return net.y1.v.DESTROY;
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public a5 o(net.yw.n var1) {
      return a5.ENTITYBLOCK_ANIMATED;
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      net.u.j var4 = var2;
      if(var3.i(d) == rn.a.FOOT) {
         var4 = var2.C((aq)var3.i(N));
      }

      net.ni.v var5 = var1.L(var4);
      kw var6 = var5 instanceof net.ni.y?((net.ni.y)var5).f():kw.RED;
      return new ks(net.nb.j.W1, 1, var6.d());
   }

   public void X(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4) {
      if(var4.a6.V && var3.i(d) == rn.a.FOOT) {
         net.u.j var5 = var2.C((aq)var3.i(N));
         if(var1.Z(var5).Q() == this) {
            var1.J(var5);
         }
      }

   }

   public void U(net.yv.r var1, net.r.r var2, net.u.j var3, net.yw.n var4, net.ni.v var5, ks var6) {
      if(var4.i(d) == rn.a.HEAD && var5 instanceof net.ni.y) {
         net.ni.y var7 = (net.ni.y)var5;
         ks var8 = var7.R();
         e(var1, var3, var8);
      } else {
         super.U(var1, var2, var3, var4, (net.ni.v)null, var6);
      }

   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      super.V(var1, var2, var3);
      var1.j(var2);
   }

   public net.yw.n D(int var1) {
      aq var2 = aq.Q(var1);
      return (var1 & 8) > 0?this.p().s(d, rn.a.HEAD).s(N, var2).s(F, Boolean.valueOf((var1 & 4) > 0)):this.p().s(d, rn.a.FOOT).s(N, var2);
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      if(var1.i(d) == rn.a.FOOT) {
         net.yw.n var4 = var2.Z(var3.C((aq)var1.i(N)));
         if(var4.Q() == this) {
            var1 = var1.s(F, var4.i(F));
         }
      }

      return var1;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(N, var2.d((aq)var1.i(N)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(N)));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((aq)var1.i(N)).u();
      if(var1.i(d) == rn.a.HEAD) {
         var2 |= 8;
         if(((Boolean)var1.i(F)).booleanValue()) {
            var2 |= 4;
         }
      }

      return var2;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{N, d, F});
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.y();
   }

   public static boolean A(int var0) {
      return (var0 & 8) != 0;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum a implements au {
      HEAD("head"),
      FOOT("foot");

      private final String m;

      private a(String var3) {
         this.m = var3;
      }

      public String toString() {
         return this.m;
      }

      public String f() {
         return this.m;
      }
   }
}
