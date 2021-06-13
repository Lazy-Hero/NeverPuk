package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yz.ai;
import net.yz.aq;

public class gw extends l {
   private final boolean O;

   public gw(boolean var1) {
      super(net.y1.l.z);
      this.R(true);
      this.O = var1;
   }

   public int u(net.yv.r var1) {
      return 30;
   }

   public void w(net.yv.r var1, net.u.j var2, net.r.r var3) {
      this.I(var1, var2);
      super.w(var1, var2, var3);
   }

   public void m(net.yv.r var1, net.u.j var2, net.ne.l var3) {
      this.I(var1, var2);
      super.m(var1, var2, var3);
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      this.I(var1, var2);
      return super.N(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   private void I(net.yv.r var1, net.u.j var2) {
      this.v(var1, var2);
      if(this == net.nb.f.uT) {
         var1.U(var2, net.nb.f.r.p());
      }

   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(this == net.nb.f.r) {
         var1.U(var2, net.nb.f.uT.p());
      }

   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.A;
   }

   public int q(int var1, Random var2) {
      return this.T(var2) + var2.nextInt(var1 + 1);
   }

   public int T(Random var1) {
      return 4 + var1.nextInt(2);
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
      super.P(var1, var2, var3, var4, var5);
      if(this.X(var3, var1.G, var5) != net.n0.y.q(this)) {
         int var6 = 1 + var1.G.nextInt(5);
         this.F(var1, var2, var6);
      }

   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      if(this.O) {
         this.v(var2, var3);
      }

   }

   private void v(net.yv.r var1, net.u.j var2) {
      Random var4 = var1.G;
      double var10000 = 0.0625D;
      g3.v.w();
      int var7 = 0;
      double var8 = (double)((float)var2.t() + var4.nextFloat());
      double var10 = (double)((float)var2.h() + var4.nextFloat());
      double var12 = (double)((float)var2.y() + var4.nextFloat());
      if(!var1.Z(var2.h()).j()) {
         var10 = (double)var2.h() + 0.0625D + 1.0D;
      }

      if(Double.compare(var8, (double)var2.t()) < 0 || var8 > (double)(var2.t() + 1) || var10 < 0.0D || var10 > (double)(var2.h() + 1) || var12 < (double)var2.y() || var12 > (double)(var2.y() + 1)) {
         var1.n(ai.REDSTONE, var8, var10, var12, 0.0D, 0.0D, 0.0D, new int[0]);
      }

      ++var7;
   }

   protected ks l(net.yw.n var1) {
      return new ks(net.nb.f.uT);
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.n0.y.q(net.nb.f.uT), 1, this.z(var3));
   }

   private static xn a(xn var0) {
      return var0;
   }
}
