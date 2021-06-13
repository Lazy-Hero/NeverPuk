package net.y9;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.gh;
import net.y9.l;
import net.y9.r2;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;
import net.yz.ax;

public class g8 extends l {
   public static final net.yr.o l = net.yr.o.k("north");
   public static final net.yr.o k = net.yr.o.k("east");
   public static final net.yr.o n = net.yr.o.k("south");
   public static final net.yr.o d = net.yr.o.k("west");
   protected static final net.u.e[] o = new net.u.e[]{new net.u.e(0.4375D, 0.0D, 0.4375D, 0.5625D, 1.0D, 0.5625D), new net.u.e(0.4375D, 0.0D, 0.4375D, 0.5625D, 1.0D, 1.0D), new net.u.e(0.0D, 0.0D, 0.4375D, 0.5625D, 1.0D, 0.5625D), new net.u.e(0.0D, 0.0D, 0.4375D, 0.5625D, 1.0D, 1.0D), new net.u.e(0.4375D, 0.0D, 0.0D, 0.5625D, 1.0D, 0.5625D), new net.u.e(0.4375D, 0.0D, 0.0D, 0.5625D, 1.0D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 0.5625D, 1.0D, 0.5625D), new net.u.e(0.0D, 0.0D, 0.0D, 0.5625D, 1.0D, 1.0D), new net.u.e(0.4375D, 0.0D, 0.4375D, 1.0D, 1.0D, 0.5625D), new net.u.e(0.4375D, 0.0D, 0.4375D, 1.0D, 1.0D, 1.0D), new net.u.e(0.0D, 0.0D, 0.4375D, 1.0D, 1.0D, 0.5625D), new net.u.e(0.0D, 0.0D, 0.4375D, 1.0D, 1.0D, 1.0D), new net.u.e(0.4375D, 0.0D, 0.0D, 1.0D, 1.0D, 0.5625D), new net.u.e(0.4375D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.5625D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};
   private final boolean A;

   protected g8(net.y1.l var1, boolean var2) {
      super(var1);
      this.r(this.b.T().s(l, Boolean.valueOf(false)).s(k, Boolean.valueOf(false)).s(n, Boolean.valueOf(false)).s(d, Boolean.valueOf(false)));
      this.A = var2;
      this.f(net.ys.r.X);
   }

   public void S(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.e var4, List var5, @Nullable net.ne.l var6, boolean var7) {
      int[] var8 = g3.v.w();
      if(!var7) {
         var1 = this.v(var1, var2, var3);
      }

      F(var3, var4, var5, o[0]);
      if(((Boolean)var1.i(l)).booleanValue()) {
         F(var3, var4, var5, o[z(aq.NORTH)]);
      }

      if(((Boolean)var1.i(n)).booleanValue()) {
         F(var3, var4, var5, o[z(aq.SOUTH)]);
      }

      if(((Boolean)var1.i(k)).booleanValue()) {
         F(var3, var4, var5, o[z(aq.EAST)]);
      }

      if(((Boolean)var1.i(d)).booleanValue()) {
         F(var3, var4, var5, o[z(aq.WEST)]);
      }

   }

   private static int z(aq var0) {
      return 1 << var0.u();
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      var1 = this.v(var1, var2, var3);
      return o[k(var1)];
   }

   private static int k(net.yw.n var0) {
      int var1 = 0;
      if(((Boolean)var0.i(l)).booleanValue()) {
         var1 |= z(aq.NORTH);
      }

      if(((Boolean)var0.i(k)).booleanValue()) {
         var1 |= z(aq.EAST);
      }

      if(((Boolean)var0.i(n)).booleanValue()) {
         var1 |= z(aq.SOUTH);
      }

      if(((Boolean)var0.i(d)).booleanValue()) {
         var1 |= z(aq.WEST);
      }

      return var1;
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      return var1.s(l, Boolean.valueOf(this.l(var2, var2.Z(var3.D()), var3.D(), aq.SOUTH))).s(n, Boolean.valueOf(this.l(var2, var2.Z(var3.d()), var3.d(), aq.NORTH))).s(d, Boolean.valueOf(this.l(var2, var2.Z(var3.H()), var3.H(), aq.EAST))).s(k, Boolean.valueOf(this.l(var2, var2.Z(var3.g()), var3.g(), aq.WEST)));
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return !this.A?net.nb.j.SL:super.X(var1, var2, var3);
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return var2.Z(var3.C(var4)).Q() != this && super.v(var1, var2, var3, var4);
   }

   public final boolean l(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      l var5 = var2.Q();
      net.yw.g var6 = var2.B(var1, var3, var4);
      return !T(var5) && var6 == net.yw.g.SOLID || var6 == net.yw.g.MIDDLE_POLE_THIN;
   }

   protected static boolean T(l var0) {
      return var0 instanceof r2 || var0 instanceof gh || var0 == net.nb.f.uB || var0 == net.nb.f.dh || var0 == net.nb.f.Tr || var0 == net.nb.f.oD || var0 == net.nb.f.uO || var0 == net.nb.f.TP || var0 == net.nb.f.oG || var0 == net.nb.f.dZ || var0 == net.nb.f.dm || var0 == net.nb.f.TS || var0 == net.nb.f.N || var0 == net.nb.f.dr;
   }

   protected boolean u() {
      return true;
   }

   public ac k() {
      return ac.CUTOUT_MIPPED;
   }

   public int d(net.yw.n var1) {
      return 0;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      switch(null.l[var2.ordinal()]) {
      case 1:
         return var1.s(l, var1.i(n)).s(k, var1.i(d)).s(n, var1.i(l)).s(d, var1.i(k));
      case 2:
         return var1.s(l, var1.i(k)).s(k, var1.i(n)).s(n, var1.i(d)).s(d, var1.i(l));
      case 3:
         return var1.s(l, var1.i(d)).s(k, var1.i(l)).s(n, var1.i(k)).s(d, var1.i(n));
      default:
         return var1;
      }
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      switch(null.f[var2.ordinal()]) {
      case 1:
         return var1.s(l, var1.i(n)).s(n, var1.i(l));
      case 2:
         return var1.s(k, var1.i(d)).s(d, var1.i(k));
      default:
         return super.P(var1, var2);
      }
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{l, k, d, n});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return var4 != aq.UP && var4 != aq.DOWN?net.yw.g.MIDDLE_POLE_THIN:net.yw.g.CENTER_SMALL;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
