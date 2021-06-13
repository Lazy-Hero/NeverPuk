package net.y9;

import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.re;
import net.yv.o8;
import net.yz.aq;
import net.yz.au;

public class ln extends l {
   public static final net.yr.o D = net.yr.o.k("up");
   public static final net.yr.o O = net.yr.o.k("north");
   public static final net.yr.o k = net.yr.o.k("east");
   public static final net.yr.o R = net.yr.o.k("south");
   public static final net.yr.o Y = net.yr.o.k("west");
   public static final net.yr.w Q = net.yr.w.l("variant", ln.n.class);
   protected static final net.u.e[] J = new net.u.e[]{new net.u.e(0.25D, 0.0D, 0.25D, 0.75D, 1.0D, 0.75D), new net.u.e(0.25D, 0.0D, 0.25D, 0.75D, 1.0D, 1.0D), new net.u.e(0.0D, 0.0D, 0.25D, 0.75D, 1.0D, 0.75D), new net.u.e(0.0D, 0.0D, 0.25D, 0.75D, 1.0D, 1.0D), new net.u.e(0.25D, 0.0D, 0.0D, 0.75D, 1.0D, 0.75D), new net.u.e(0.3125D, 0.0D, 0.0D, 0.6875D, 0.875D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 0.75D, 1.0D, 0.75D), new net.u.e(0.0D, 0.0D, 0.0D, 0.75D, 1.0D, 1.0D), new net.u.e(0.25D, 0.0D, 0.25D, 1.0D, 1.0D, 0.75D), new net.u.e(0.25D, 0.0D, 0.25D, 1.0D, 1.0D, 1.0D), new net.u.e(0.0D, 0.0D, 0.3125D, 1.0D, 0.875D, 0.6875D), new net.u.e(0.0D, 0.0D, 0.25D, 1.0D, 1.0D, 1.0D), new net.u.e(0.25D, 0.0D, 0.0D, 1.0D, 1.0D, 0.75D), new net.u.e(0.25D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.75D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};
   protected static final net.u.e[] p = new net.u.e[]{J[0].w(1.5D), J[1].w(1.5D), J[2].w(1.5D), J[3].w(1.5D), J[4].w(1.5D), J[5].w(1.5D), J[6].w(1.5D), J[7].w(1.5D), J[8].w(1.5D), J[9].w(1.5D), J[10].w(1.5D), J[11].w(1.5D), J[12].w(1.5D), J[13].w(1.5D), J[14].w(1.5D), J[15].w(1.5D)};

   public ln(l var1) {
      super(var1.C);
      this.r(this.b.T().s(D, Boolean.valueOf(false)).s(O, Boolean.valueOf(false)).s(k, Boolean.valueOf(false)).s(R, Boolean.valueOf(false)).s(Y, Boolean.valueOf(false)).s(Q, ln.n.NORMAL));
      this.r(var1.S);
      this.M(var1.V / 3.0F);
      this.i(var1.B);
      this.f(net.ys.r.X);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      var1 = this.v(var1, var2, var3);
      return J[t(var1)];
   }

   public void S(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.e var4, List var5, @Nullable net.ne.l var6, boolean var7) {
      var1 = this.v((net.yw.n)var1, (o8)var2, (net.u.j)var3);
      F(var3, var4, var5, p[t(var1)]);
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      var1 = this.v(var1, var2, var3);
      return p[t(var1)];
   }

   private static int t(net.yw.n var0) {
      int var1 = 0;
      if(((Boolean)var0.i(O)).booleanValue()) {
         var1 |= 1 << aq.NORTH.u();
      }

      if(((Boolean)var0.i(k)).booleanValue()) {
         var1 |= 1 << aq.EAST.u();
      }

      if(((Boolean)var0.i(R)).booleanValue()) {
         var1 |= 1 << aq.SOUTH.u();
      }

      if(((Boolean)var0.i(Y)).booleanValue()) {
         var1 |= 1 << aq.WEST.u();
      }

      return var1;
   }

   public String U() {
      return net.yq.e.E(this.j() + "." + ln.n.NORMAL.G() + ".name");
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean c(o8 var1, net.u.j var2) {
      return false;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   private boolean v(o8 var1, net.u.j var2, aq var3) {
      net.yw.n var4 = var1.Z(var2);
      l var5 = var4.Q();
      net.yw.g var6 = var4.B(var1, var2, var3);
      if(var6 != net.yw.g.MIDDLE_POLE_THICK && (var6 != net.yw.g.MIDDLE_POLE || !(var5 instanceof re))) {
         boolean var8 = false;
      } else {
         boolean var10000 = true;
      }

      if(y(var5) || var6 != net.yw.g.SOLID) {
         ;
      }

      return true;
   }

   protected static boolean y(l var0) {
      return l.m(var0) || var0 == net.nb.f.dr || var0 == net.nb.f.dm || var0 == net.nb.f.TS || var0 == net.nb.f.N;
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      for(ln.n var6 : ln.n.values()) {
         var2.add(new ks(this, 1, var6.p()));
      }

   }

   public int z(net.yw.n var1) {
      return ((ln.n)var1.i(Q)).p();
   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return var4 != aq.DOWN || super.v(var1, var2, var3, var4);
   }

   public net.yw.n D(int var1) {
      return this.p().s(Q, ln.n.L(var1));
   }

   public int d(net.yw.n var1) {
      return ((ln.n)var1.i(Q)).p();
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      g3.v.w();
      boolean var5 = this.v(var2, var3.D(), aq.SOUTH);
      boolean var6 = this.v(var2, var3.g(), aq.WEST);
      boolean var7 = this.v(var2, var3.d(), aq.NORTH);
      boolean var8 = this.v(var2, var3.H(), aq.EAST);
      if((!var5 || var6 || !var7 || var8) && (var5 || !var6 || var7 || !var8)) {
         boolean var10 = false;
      } else {
         boolean var10000 = true;
      }

      return var1.s(D, Boolean.valueOf(true)).s(O, Boolean.valueOf(var5)).s(k, Boolean.valueOf(var6)).s(R, Boolean.valueOf(var7)).s(Y, Boolean.valueOf(var8));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{D, O, k, Y, R, Q});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return var4 != aq.UP && var4 != aq.DOWN?net.yw.g.MIDDLE_POLE_THICK:net.yw.g.CENTER_BIG;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum n implements au {
      NORMAL,
      MOSSY;

      private static final ln.n[] r;
      private final int G;
      private final String q;
      private final String V;

      private n(int var3, String var4, String var5) {
         this.G = var3;
         this.q = var4;
         this.V = var5;
      }

      public int p() {
         return this.G;
      }

      public String toString() {
         return this.q;
      }

      public static ln.n L(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= r.length) {
            var0 = 0;
         }

         return r[var0];
      }

      public String f() {
         return this.q;
      }

      public String G() {
         return this.V;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
