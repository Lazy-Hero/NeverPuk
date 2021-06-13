package net.y9;

import java.util.Random;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.ru;
import net.yv.o8;
import net.yz.aq;
import net.yz.ax;

public class r0 extends ru {
   public static final net.yr.o W = net.yr.o.k("powered");

   public r0() {
      super(net.y1.l.z);
      this.r(this.b.T().s(n, aq.SOUTH).s(W, Boolean.valueOf(false)));
      this.f(net.ys.r.i);
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{n, W});
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(n, var2.d((aq)var1.i(n)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(n)));
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      int[] var5 = g3.v.w();
      if(((Boolean)var3.i(W)).booleanValue()) {
         var1.k(var2, var3.s(W, Boolean.valueOf(false)), 2);
      }

      var1.k(var2, var3.s(W, Boolean.valueOf(true)), 2);
      var1.c(var2, this, 2);
      this.K(var1, var2, var3);
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
   }

   public void m(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!var2.x && var3.C((aq)var1.i(n)).equals(var5)) {
         this.N(var1, var2, var3);
      }

   }

   private void N(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      if(!((Boolean)var1.i(W)).booleanValue() && !var2.o(var3, this)) {
         var2.c(var3, this, 2);
      }

   }

   protected void K(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      aq var4 = (aq)var3.i(n);
      net.u.j var5 = var2.C(var4.f());
      var1.H(var5, this, var2);
      var1.Q((net.u.j)var5, (l)this, var4);
   }

   public boolean s(net.yw.n var1) {
      return true;
   }

   public int n(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return var1.M(var2, var3, var4);
   }

   public int L(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return ((Boolean)var1.i(W)).booleanValue() && var1.i(n) == var4?15:0;
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(!var1.x) {
         if(((Boolean)var3.i(W)).booleanValue()) {
            this.P(var1, var2, var3, var1.G);
         }

         this.N(var3, var1, var2);
      }

   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int[] var4 = g3.v.w();
      if(((Boolean)var3.i(W)).booleanValue() && var1.o(var2, this)) {
         this.K(var1, var2, var3.s(W, Boolean.valueOf(false)));
      }

   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      return this.p().s(n, aq.i(var2, var8).f());
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((aq)var1.i(n)).w();
      if(((Boolean)var1.i(W)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   public net.yw.n D(int var1) {
      return this.p().s(n, aq.l(var1 & 7));
   }

   private static xn a(xn var0) {
      return var0;
   }
}
