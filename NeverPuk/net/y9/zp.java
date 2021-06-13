package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.g6;
import net.y9.gc;
import net.y9.gh;
import net.y9.l7;
import net.y9.lm;
import net.y9.t;
import net.yv.o8;

public class zp extends t implements lm {
   public static final net.yr.w O = net.yr.w.l("type", gc.i.class);
   public static final net.yr.l i = net.yr.l.J("stage", 0, 1);
   protected static final net.u.e M = new net.u.e(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);

   protected zp() {
      this.r(this.b.T().s(O, gc.i.OAK).s(i, Integer.valueOf(0)));
      this.f(net.ys.r.X);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return M;
   }

   public String U() {
      return net.yq.e.E(this.j() + "." + gc.i.OAK.m() + ".name");
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(!var1.x) {
         super.P(var1, var2, var3, var4);
         if(var1.y(var2.h()) >= 9 && var4.nextInt(7) == 0) {
            this.q(var1, var2, var3, var4);
         }
      }

   }

   public void q(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(((Integer)var3.i(i)).intValue() == 0) {
         var1.k(var2, var3.C(i), 4);
      } else {
         this.o(var1, var2, var3, var4);
      }

   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      int[] var5 = g3.v.w();
      Object var6 = var4.nextInt(10) == 0?new net.w.g(true):new net.w.w(true);
      int var7 = 0;
      int var8 = 0;
      boolean var9 = false;
      switch(null.J[((gc.i)var3.i(O)).ordinal()]) {
      case 1:
         var7 = 0;
         var8 = 0;
         if(this.O(var1, var2, var7, var8, gc.i.SPRUCE)) {
            new net.w.c(false, var4.nextBoolean());
            var9 = true;
         }

         --var8;
         --var7;
         var7 = 0;
         var8 = 0;
         new net.w.h(true);
      case 2:
         new net.w.k(true, false);
      case 3:
         net.yw.n var10 = net.nb.f.u6.p().s(l7.d, gc.i.JUNGLE);
         net.yw.n var11 = net.nb.f.Tu.p().s(g6.A, gc.i.JUNGLE).s(gh.u, Boolean.valueOf(false));
         var7 = 0;
         var8 = 0;
         if(this.O(var1, var2, var7, var8, gc.i.JUNGLE)) {
            new net.w.d(true, 10, 20, var10, var11);
            var9 = true;
         }

         --var8;
         --var7;
         var7 = 0;
         var8 = 0;
         new net.w.w(true, 4 + var4.nextInt(7), var10, var11, false);
      case 4:
         new net.w.l(true);
      case 5:
         var7 = 0;
         var8 = 0;
         if(this.O(var1, var2, var7, var8, gc.i.DARK_OAK)) {
            new net.w.i(true);
            var9 = true;
         }

         --var8;
         --var7;
         return;
      case 6:
      default:
         net.yw.n var31 = net.nb.f.ou.p();
         var1.k(var2, var31, 4);
         if(!((net.w.f)var6).K(var1, var4, var2.F(var7, 0, var8))) {
            var1.k(var2, var3, 4);
         }

      }
   }

   private boolean O(net.yv.r var1, net.u.j var2, int var3, int var4, gc.i var5) {
      return this.E(var1, var2.F(var3, 0, var4), var5) && this.E(var1, var2.F(var3 + 1, 0, var4), var5) && this.E(var1, var2.F(var3, 0, var4 + 1), var5) && this.E(var1, var2.F(var3 + 1, 0, var4 + 1), var5);
   }

   public boolean E(net.yv.r var1, net.u.j var2, gc.i var3) {
      net.yw.n var4 = var1.Z(var2);
      return var4.Q() == this && var4.i(O) == var3;
   }

   public int z(net.yw.n var1) {
      return ((gc.i)var1.i(O)).B();
   }

   public void C(net.ys.r var1, net.yz.w var2) {
      for(gc.i var6 : gc.i.values()) {
         var2.add(new ks(this, 1, var6.B()));
      }

   }

   public boolean L(net.yv.r var1, net.u.j var2, net.yw.n var3, boolean var4) {
      return true;
   }

   public boolean p(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      return (double)var1.G.nextFloat() < 0.45D;
   }

   public void e(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      this.q(var1, var3, var4, var2);
   }

   public net.yw.n D(int var1) {
      return this.p().s(O, gc.i.r(var1 & 7)).s(i, Integer.valueOf((var1 & 8) >> 3));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((gc.i)var1.i(O)).B();
      var2 = var2 | ((Integer)var1.i(i)).intValue() << 3;
      return var2;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{O, i});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
