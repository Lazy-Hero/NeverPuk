package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;

public class zb extends l {
   public static final net.yr.l u = net.yr.l.J("bites", 0, 6);
   protected static final net.u.e[] J = new net.u.e[]{new net.u.e(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.5D, 0.9375D), new net.u.e(0.1875D, 0.0D, 0.0625D, 0.9375D, 0.5D, 0.9375D), new net.u.e(0.3125D, 0.0D, 0.0625D, 0.9375D, 0.5D, 0.9375D), new net.u.e(0.4375D, 0.0D, 0.0625D, 0.9375D, 0.5D, 0.9375D), new net.u.e(0.5625D, 0.0D, 0.0625D, 0.9375D, 0.5D, 0.9375D), new net.u.e(0.6875D, 0.0D, 0.0625D, 0.9375D, 0.5D, 0.9375D), new net.u.e(0.8125D, 0.0D, 0.0625D, 0.9375D, 0.5D, 0.9375D)};

   protected zb() {
      super(net.y1.l.l);
      this.r(this.b.T().s(u, Integer.valueOf(0)));
      this.R(true);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return J[((Integer)var1.i(u)).intValue()];
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(!var1.x) {
         return this.q(var1, var2, var3, var4);
      } else {
         ks var10 = var4.o((net.yz.k)var5);
         return this.q(var1, var2, var3, var4) || var10.B();
      }
   }

   private boolean q(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4) {
      int[] var5 = g3.v.w();
      if(!var4.h(false)) {
         return false;
      } else {
         var4.S(net.v.q.C);
         var4.e().n(2, 0.1F);
         int var6 = ((Integer)var3.i(u)).intValue();
         if(var6 < 6) {
            var1.k(var2, var3.s(u, Integer.valueOf(var6 + 1)), 3);
         }

         var1.J(var2);
         return true;
      }
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return super.J(var1, var2) && this.Z(var1, var2);
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!this.Z(var2, var3)) {
         var2.J(var3);
      }

   }

   private boolean Z(net.yv.r var1, net.u.j var2) {
      return var1.Z(var2.b()).n().B();
   }

   public int T(Random var1) {
      return 0;
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.SL;
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.j.WS);
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.n D(int var1) {
      return this.p().s(u, Integer.valueOf(var1));
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(u)).intValue();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{u});
   }

   public int c(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      return (7 - ((Integer)var1.i(u)).intValue()) * 2;
   }

   public boolean t(net.yw.n var1) {
      return true;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
