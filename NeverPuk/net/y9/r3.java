package net.y9;

import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.y8;
import net.y9.g3;
import net.y9.l;
import net.y9.re;
import net.yv.o8;
import net.yz.aq;
import net.yz.ax;

public class r3 extends l {
   public static final net.yr.o u = net.yr.o.k("north");
   public static final net.yr.o H = net.yr.o.k("east");
   public static final net.yr.o F = net.yr.o.k("south");
   public static final net.yr.o r = net.yr.o.k("west");
   protected static final net.u.e[] E = new net.u.e[]{new net.u.e(0.375D, 0.0D, 0.375D, 0.625D, 1.0D, 0.625D), new net.u.e(0.375D, 0.0D, 0.375D, 0.625D, 1.0D, 1.0D), new net.u.e(0.0D, 0.0D, 0.375D, 0.625D, 1.0D, 0.625D), new net.u.e(0.0D, 0.0D, 0.375D, 0.625D, 1.0D, 1.0D), new net.u.e(0.375D, 0.0D, 0.0D, 0.625D, 1.0D, 0.625D), new net.u.e(0.375D, 0.0D, 0.0D, 0.625D, 1.0D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 0.625D, 1.0D, 0.625D), new net.u.e(0.0D, 0.0D, 0.0D, 0.625D, 1.0D, 1.0D), new net.u.e(0.375D, 0.0D, 0.375D, 1.0D, 1.0D, 0.625D), new net.u.e(0.375D, 0.0D, 0.375D, 1.0D, 1.0D, 1.0D), new net.u.e(0.0D, 0.0D, 0.375D, 1.0D, 1.0D, 0.625D), new net.u.e(0.0D, 0.0D, 0.375D, 1.0D, 1.0D, 1.0D), new net.u.e(0.375D, 0.0D, 0.0D, 1.0D, 1.0D, 0.625D), new net.u.e(0.375D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.625D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};
   public static final net.u.e p = new net.u.e(0.375D, 0.0D, 0.375D, 0.625D, 1.5D, 0.625D);
   public static final net.u.e N = new net.u.e(0.375D, 0.0D, 0.625D, 0.625D, 1.5D, 1.0D);
   public static final net.u.e f = new net.u.e(0.0D, 0.0D, 0.375D, 0.375D, 1.5D, 0.625D);
   public static final net.u.e Q = new net.u.e(0.375D, 0.0D, 0.0D, 0.625D, 1.5D, 0.375D);
   public static final net.u.e h = new net.u.e(0.625D, 0.0D, 0.375D, 1.0D, 1.5D, 0.625D);

   public r3(net.y1.l var1, net.y1.h var2) {
      super(var1, var2);
      this.r(this.b.T().s(u, Boolean.valueOf(false)).s(H, Boolean.valueOf(false)).s(F, Boolean.valueOf(false)).s(r, Boolean.valueOf(false)));
      this.f(net.ys.r.X);
   }

   public void S(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.e var4, List var5, @Nullable net.ne.l var6, boolean var7) {
      int[] var8 = g3.v.w();
      if(!var7) {
         var1 = var1.J(var2, var3);
      }

      F(var3, var4, var5, p);
      if(((Boolean)var1.i(u)).booleanValue()) {
         F(var3, var4, var5, Q);
      }

      if(((Boolean)var1.i(H)).booleanValue()) {
         F(var3, var4, var5, h);
      }

      if(((Boolean)var1.i(F)).booleanValue()) {
         F(var3, var4, var5, N);
      }

      if(((Boolean)var1.i(r)).booleanValue()) {
         F(var3, var4, var5, f);
      }

   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      var1 = this.v(var1, var2, var3);
      return E[e(var1)];
   }

   private static int e(net.yw.n var0) {
      int var1 = 0;
      if(((Boolean)var0.i(u)).booleanValue()) {
         var1 |= 1 << aq.NORTH.u();
      }

      if(((Boolean)var0.i(H)).booleanValue()) {
         var1 |= 1 << aq.EAST.u();
      }

      if(((Boolean)var0.i(F)).booleanValue()) {
         var1 |= 1 << aq.SOUTH.u();
      }

      if(((Boolean)var0.i(r)).booleanValue()) {
         var1 |= 1 << aq.WEST.u();
      }

      return var1;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean c(o8 var1, net.u.j var2) {
      return false;
   }

   public boolean T(o8 var1, net.u.j var2, aq var3) {
      net.yw.n var4 = var1.Z(var2);
      net.yw.g var5 = var4.B(var1, var2, var3);
      l var6 = var4.Q();
      if(var5 != net.yw.g.MIDDLE_POLE || var4.n() != this.C && !(var6 instanceof re)) {
         boolean var8 = false;
      } else {
         boolean var10000 = true;
      }

      if(G(var6) || var5 != net.yw.g.SOLID) {
         ;
      }

      return true;
   }

   protected static boolean G(l var0) {
      return l.m(var0) || var0 == net.nb.f.dr || var0 == net.nb.f.dm || var0 == net.nb.f.TS || var0 == net.nb.f.N;
   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return true;
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(!var1.x) {
         return y8.V(var4, var1, var2);
      } else {
         ks var10 = var4.o((net.yz.k)var5);
         return var10.Z() == net.nb.j.S6 || var10.B();
      }
   }

   public int d(net.yw.n var1) {
      return 0;
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      return var1.s(u, Boolean.valueOf(this.T(var2, var3.D(), aq.SOUTH))).s(H, Boolean.valueOf(this.T(var2, var3.g(), aq.WEST))).s(F, Boolean.valueOf(this.T(var2, var3.d(), aq.NORTH))).s(r, Boolean.valueOf(this.T(var2, var3.H(), aq.EAST)));
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      switch(null.i[var2.ordinal()]) {
      case 1:
         return var1.s(u, var1.i(F)).s(H, var1.i(r)).s(F, var1.i(u)).s(r, var1.i(H));
      case 2:
         return var1.s(u, var1.i(H)).s(H, var1.i(F)).s(F, var1.i(r)).s(r, var1.i(u));
      case 3:
         return var1.s(u, var1.i(r)).s(H, var1.i(u)).s(F, var1.i(H)).s(r, var1.i(F));
      default:
         return var1;
      }
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      switch(null.w[var2.ordinal()]) {
      case 1:
         return var1.s(u, var1.i(F)).s(F, var1.i(u));
      case 2:
         return var1.s(H, var1.i(r)).s(r, var1.i(H));
      default:
         return super.P(var1, var2);
      }
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{u, H, r, F});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return var4 != aq.UP && var4 != aq.DOWN?net.yw.g.MIDDLE_POLE:net.yw.g.CENTER;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
