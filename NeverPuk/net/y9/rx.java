package net.y9;

import java.util.Random;
import net.xn;
import net.y9.g3;
import net.y9.ru;
import net.yv.o8;
import net.yz.ac;
import net.yz.ai;
import net.yz.aq;
import net.yz.ax;

public class rx extends ru {
   protected static final net.u.e v = new net.u.e(0.375D, 0.0D, 0.375D, 0.625D, 1.0D, 0.625D);
   protected static final net.u.e A = new net.u.e(0.375D, 0.375D, 0.0D, 0.625D, 0.625D, 1.0D);
   protected static final net.u.e r = new net.u.e(0.0D, 0.375D, 0.375D, 1.0D, 0.625D, 0.625D);

   protected rx() {
      super(net.y1.l.c);
      this.r(this.b.T().s(n, aq.UP));
      this.f(net.ys.r.X);
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(n, var2.d((aq)var1.i(n)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.s(n, var2.Q((aq)var1.i(n)));
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      switch(null.x[((aq)var1.i(n)).r().ordinal()]) {
      case 1:
      default:
         return r;
      case 2:
         return A;
      case 3:
         return v;
      }
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return true;
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      g3.v.w();
      net.yw.n var10 = var1.Z(var2.C(var3.f()));
      if(var10.Q() == net.nb.f.dg) {
         aq var11 = (aq)var10.i(n);
         if(var11 == var3) {
            return this.p().s(n, var3.f());
         }
      }

      return this.p().s(n, var3);
   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      aq var5 = (aq)var1.i(n);
      double var6 = (double)var3.t() + 0.55D - (double)(var4.nextFloat() * 0.1F);
      double var8 = (double)var3.h() + 0.55D - (double)(var4.nextFloat() * 0.1F);
      double var10 = (double)var3.y() + 0.55D - (double)(var4.nextFloat() * 0.1F);
      double var12 = (double)(0.4F - (var4.nextFloat() + var4.nextFloat()) * 0.4F);
      if(var4.nextInt(5) == 0) {
         var2.n(ai.END_ROD, var6 + (double)var5.v() * var12, var8 + (double)var5.z() * var12, var10 + (double)var5.P() * var12, var4.nextGaussian() * 0.005D, var4.nextGaussian() * 0.005D, var4.nextGaussian() * 0.005D, new int[0]);
      }

   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.n D(int var1) {
      net.yw.n var2 = this.p();
      var2 = var2.s(n, aq.l(var1));
      return var2;
   }

   public int d(net.yw.n var1) {
      return ((aq)var1.i(n)).w();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{n});
   }

   public net.y1.v T(net.yw.n var1) {
      return net.y1.v.NORMAL;
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
