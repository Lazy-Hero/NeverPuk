package net.y9;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.z4;
import net.yv.o8;
import net.yz.a5;
import net.yz.ac;
import net.yz.ai;
import net.yz.aq;

public class z8 extends z4 {
   public static final net.yr.o[] F = new net.yr.o[]{net.yr.o.k("has_bottle_0"), net.yr.o.k("has_bottle_1"), net.yr.o.k("has_bottle_2")};
   protected static final net.u.e n = new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);
   protected static final net.u.e o = new net.u.e(0.4375D, 0.0D, 0.4375D, 0.5625D, 0.875D, 0.5625D);

   public z8() {
      super(net.y1.l.i);
      this.r(this.b.T().s(F[0], Boolean.valueOf(false)).s(F[1], Boolean.valueOf(false)).s(F[2], Boolean.valueOf(false)));
   }

   public String U() {
      return net.yq.e.E("item.brewingStand.name");
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public a5 o(net.yw.n var1) {
      return a5.MODEL;
   }

   public net.ni.v J(net.yv.r var1, int var2) {
      return new net.ni.o();
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public void S(net.yw.n var1, net.yv.r var2, net.u.j var3, net.u.e var4, List var5, @Nullable net.ne.l var6, boolean var7) {
      F(var3, var4, var5, o);
      F(var3, var4, var5, n);
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return n;
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(var1.x) {
         return true;
      } else {
         net.ni.v var10 = var1.L(var2);
         if(var10 instanceof net.ni.o) {
            var4.n((net.ni.o)var10);
            var4.S(net.v.q.Z);
         }

         return true;
      }
   }

   public void o(net.yv.r var1, net.u.j var2, net.yw.n var3, net.ne.a var4, ks var5) {
      if(var5.v()) {
         net.ni.v var6 = var1.L(var2);
         if(var6 instanceof net.ni.o) {
            ((net.ni.o)var6).T(var5.j());
         }
      }

   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      double var5 = (double)((float)var3.t() + 0.4F + var4.nextFloat() * 0.2F);
      double var7 = (double)((float)var3.h() + 0.7F + var4.nextFloat() * 0.3F);
      double var9 = (double)((float)var3.y() + 0.4F + var4.nextFloat() * 0.2F);
      var2.n(ai.SMOKE_NORMAL, var5, var7, var9, 0.0D, 0.0D, 0.0D, new int[0]);
   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      net.ni.v var4 = var1.L(var2);
      if(var4 instanceof net.ni.o) {
         net.nl.z3.Z(var1, var2, (net.ni.o)var4);
      }

      super.V(var1, var2, var3);
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.Wn;
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.j.Wn);
   }

   public boolean t(net.yw.n var1) {
      return true;
   }

   public int c(net.yw.n var1, net.yv.r var2, net.u.j var3) {
      return net.nl.v.D(var2.L(var3));
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.n D(int var1) {
      g3.v.w();
      net.yw.n var3 = this.p();
      int var4 = 0;
      var3 = var3.s(F[var4], Boolean.valueOf((var1 & 1 << var4) > 0));
      ++var4;
      return var3;
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         if(((Boolean)var1.i(F[var3])).booleanValue()) {
            var2 |= 1 << var3;
         }

         ++var3;
      }
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{F[0], F[1], F[2]});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
