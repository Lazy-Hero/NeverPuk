package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.lk;
import net.y9.lm;
import net.y9.rz;
import net.y9.t;
import net.yv.o8;

public class v extends t implements lm {
   public static final net.yr.l N = net.yr.l.J("age", 0, 7);
   private static final net.u.e[] E = new net.u.e[]{new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};

   protected v() {
      this.r(this.b.T().s(this.K(), Integer.valueOf(0)));
      this.R(true);
      this.f((net.ys.r)null);
      this.r(0.0F);
      this.i(lk.G);
      this.y();
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return E[((Integer)var1.i(this.K())).intValue()];
   }

   protected boolean H(net.yw.n var1) {
      return var1.Q() == net.nb.f.dJ;
   }

   protected net.yr.l K() {
      return N;
   }

   public int E() {
      return 7;
   }

   protected int s(net.yw.n var1) {
      return ((Integer)var1.i(this.K())).intValue();
   }

   public net.yw.n r(int var1) {
      return this.p().s(this.K(), Integer.valueOf(var1));
   }

   public boolean z(net.yw.n var1) {
      return ((Integer)var1.i(this.K())).intValue() >= this.E();
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      super.P(var1, var2, var3, var4);
      if(var1.y(var2.h()) >= 9) {
         int var5 = this.s(var3);
         if(var5 < this.E()) {
            float var6 = D(this, var1, var2);
            if(var4.nextInt((int)(25.0F / var6) + 1) == 0) {
               var1.k(var2, this.r(var5 + 1), 2);
            }
         }
      }

   }

   public void a(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int var4 = this.s(var3) + this.r(var1);
      int var5 = this.E();
      if(var4 > var5) {
         var4 = var5;
      }

      var1.k(var2, this.r(var4), 2);
   }

   protected int r(net.yv.r var1) {
      return net.u.t.A(var1.G, 2, 5);
   }

   protected static float D(l var0, net.yv.r var1, net.u.j var2) {
      float var4 = 1.0F;
      g3.v.w();
      net.u.j var5 = var2.b();
      int var6 = -1;
      int var7 = -1;
      float var8 = 0.0F;
      net.yw.n var9 = var1.Z(var5.F(var6, 0, var7));
      if(var9.Q() == net.nb.f.dJ) {
         var8 = 1.0F;
         if(((Integer)var9.i(rz.R)).intValue() > 0) {
            var8 = 3.0F;
         }
      }

      var8 = var8 / 4.0F;
      var4 = var4 + var8;
      ++var7;
      ++var6;
      net.u.j var17 = var2.D();
      net.u.j var19 = var2.d();
      net.u.j var21 = var2.H();
      net.u.j var22 = var2.g();
      if(var0 != var1.Z(var21).Q() && var0 != var1.Z(var22).Q()) {
         boolean var23 = false;
      } else {
         boolean var10000 = true;
      }

      if(var0 != var1.Z(var17).Q() && var0 != var1.Z(var19).Q()) {
         boolean var25 = false;
      } else {
         boolean var24 = true;
      }

      var4 = var4 / 2.0F;
      if(var0 != var1.Z(var21.D()).Q() && var0 != var1.Z(var22.D()).Q() && var0 != var1.Z(var22.d()).Q() && var0 != var1.Z(var21.d()).Q()) {
         boolean var27 = false;
      } else {
         boolean var26 = true;
      }

      var4 = var4 / 2.0F;
      return var4;
   }

   public boolean p(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return (var1.s(var2) >= 8 || var1.V(var2)) && this.H(var1.Z(var2.b()));
   }

   protected net.n0.y c() {
      return net.nb.j.Q;
   }

   protected net.n0.y Z() {
      return net.nb.j.Sd;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
      super.P(var1, var2, var3, var4, 0);
      if(!var1.x) {
         int var6 = this.s(var3);
         if(var6 >= this.E()) {
            int var7 = 3 + var5;

            for(int var8 = 0; var8 < var7; ++var8) {
               if(var1.G.nextInt(2 * this.E()) <= var6) {
                  e(var1, var2, new ks(this.c()));
               }
            }
         }
      }

   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return this.z(var1)?this.Z():this.c();
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(this.c());
   }

   public boolean L(net.yv.r var1, net.u.j var2, net.yw.n var3, boolean var4) {
      return !this.z(var3);
   }

   public boolean p(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      return true;
   }

   public void e(net.yv.r var1, Random var2, net.u.j var3, net.yw.n var4) {
      this.a(var1, var3, var4);
   }

   public net.yw.n D(int var1) {
      return this.r(var1);
   }

   public int d(net.yw.n var1) {
      return this.s(var1);
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{N});
   }

   private static xn c(xn var0) {
      return var0;
   }
}
