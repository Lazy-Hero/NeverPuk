package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g2;
import net.y9.g3;
import net.yv.o8;
import net.yz.ai;
import net.yz.aq;
import net.yz.ax;

public class g7 extends g2 {
   public static final net.yr.o Q = net.yr.o.k("locked");
   public static final net.yr.l E = net.yr.l.J("delay", 1, 4);

   protected g7(boolean var1) {
      super(var1);
      this.r(this.b.T().s(N, aq.NORTH).s(E, Integer.valueOf(1)).s(Q, Boolean.valueOf(false)));
   }

   public String U() {
      return net.yq.e.E("item.diode.name");
   }

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      return var1.s(Q, Boolean.valueOf(this.w(var2, var3, var1)));
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      return var1.s(N, var2.d((aq)var1.i(N)));
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S((aq)var1.i(N)));
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      int[] var10 = g3.v.w();
      if(!var4.a6.s) {
         return false;
      } else {
         var1.k(var2, var3.C(E), 3);
         return true;
      }
   }

   protected int j(net.yw.n var1) {
      return ((Integer)var1.i(E)).intValue() * 2;
   }

   protected net.yw.n w(net.yw.n var1) {
      Integer var2 = (Integer)var1.i(E);
      Boolean var3 = (Boolean)var1.i(Q);
      aq var4 = (aq)var1.i(N);
      return net.nb.f.da.p().s(N, var4).s(E, var2).s(Q, var3);
   }

   protected net.yw.n h(net.yw.n var1) {
      Integer var2 = (Integer)var1.i(E);
      Boolean var3 = (Boolean)var1.i(Q);
      aq var4 = (aq)var1.i(N);
      return net.nb.f.dQ.p().s(N, var4).s(E, var2).s(Q, var3);
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.Wr;
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.j.Wr);
   }

   public boolean w(o8 var1, net.u.j var2, net.yw.n var3) {
      int[] var4 = g3.v.w();
      return this.x(var1, var2, var3) > 0;
   }

   protected boolean x(net.yw.n var1) {
      return R(var1);
   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      int[] var5 = g3.v.w();
      if(this.W) {
         aq var6 = (aq)var1.i(N);
         double var7 = (double)((float)var3.t() + 0.5F) + (double)(var4.nextFloat() - 0.5F) * 0.2D;
         double var9 = (double)((float)var3.h() + 0.4F) + (double)(var4.nextFloat() - 0.5F) * 0.2D;
         double var11 = (double)((float)var3.y() + 0.5F) + (double)(var4.nextFloat() - 0.5F) * 0.2D;
         float var13 = -5.0F;
         if(var4.nextBoolean()) {
            var13 = (float)(((Integer)var1.i(E)).intValue() * 2 - 1);
         }

         var13 = var13 / 16.0F;
         double var14 = (double)(var13 * (float)var6.v());
         double var16 = (double)(var13 * (float)var6.P());
         var2.n(ai.REDSTONE, var7 + var14, var9, var11 + var16, 0.0D, 0.0D, 0.0D, new int[0]);
      }

   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      super.V(var1, var2, var3);
      this.q(var1, var2, var3);
   }

   public net.yw.n D(int var1) {
      return this.p().s(N, aq.Q(var1)).s(Q, Boolean.valueOf(false)).s(E, Integer.valueOf(1 + (var1 >> 2)));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((aq)var1.i(N)).u();
      var2 = var2 | ((Integer)var1.i(E)).intValue() - 1 << 2;
      return var2;
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{N, E, Q});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
