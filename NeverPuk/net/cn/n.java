package net.cn;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.cn.e;
import net.cn.q;
import net.cn.w;
import net.cn.x;
import net.cw.c;
import net.l.o;
import net.ns.i;
import net.u.j;
import net.w.f0;
import net.w.f2;
import net.w.f9;
import net.w.fs;
import net.w.ft;
import net.y9.r1;
import net.yv.r;

public class n implements e {
   protected static final net.yw.n F = net.nb.f.ou.p();
   protected static final net.yw.n q = net.nb.f.R.p();
   protected static final net.yw.n I = net.nb.f.T8.p();
   protected static final net.yw.n K = net.nb.f.TL.p();
   protected static final net.yw.n B = net.nb.f.D.p();
   protected static final net.yw.n a = net.nb.f.u9.p();
   private final r C;
   private final boolean p;
   private final Random S;
   private double[] r = new double[256];
   private double[] s = new double[256];
   private double[] o = new double[256];
   private double[] T;
   private final q n;
   private final q x;
   private final q i;
   private final q z;
   private final q j;
   public final q U;
   public final q E;
   private final f2 l = new f2();
   private final fs L = new fs();
   private final f9 H = new f9();
   private final net.w.f X = new f0(net.nb.f.s.p(), 14, c.c(net.nb.f.R));
   private final net.w.f Y = new f0(net.nb.f.U.p(), 33, c.c(net.nb.f.R));
   private final ft v = new ft(net.nb.f.dj, true);
   private final ft e = new ft(net.nb.f.dj, false);
   private final net.w.b G = new net.w.b(net.nb.f.df);
   private final net.w.b M = new net.w.b(net.nb.f.T);
   private final net.y4.n f = new net.y4.n();
   private final w Q = new x();
   double[] J;
   double[] A;
   double[] k;
   double[] w;
   double[] W;

   public n(r var1, boolean var2, long var3) {
      this.C = var1;
      this.p = var2;
      this.S = new Random(var3);
      this.n = new q(this.S, 16);
      this.x = new q(this.S, 16);
      this.i = new q(this.S, 8);
      this.z = new q(this.S, 4);
      this.j = new q(this.S, 4);
      this.U = new q(this.S, 10);
      this.E = new q(this.S, 16);
      var1.l(63);
   }

   public void w(int var1, int var2, o var3) {
      boolean var10000 = true;
      int var5 = this.C.k() / 2 + 1;
      var10000 = true;
      var10000 = true;
      var10000 = true;
      this.T = this.p(this.T, var1 * 4, 0, var2 * 4, 5, 17, 5);
      byte var9 = 0;
      byte var10 = 0;
      byte var11 = 0;
      double var56 = 0.125D;
      double var14 = this.T[((var9 + 0) * 5 + var10 + 0) * 17 + var11 + 0];
      double var16 = this.T[((var9 + 0) * 5 + var10 + 1) * 17 + var11 + 0];
      double var18 = this.T[((var9 + 1) * 5 + var10 + 0) * 17 + var11 + 0];
      double var20 = this.T[((var9 + 1) * 5 + var10 + 1) * 17 + var11 + 0];
      var56 = (this.T[((var9 + 0) * 5 + var10 + 0) * 17 + var11 + 1] - var14) * 0.125D;
      var56 = (this.T[((var9 + 0) * 5 + var10 + 1) * 17 + var11 + 1] - var16) * 0.125D;
      var56 = (this.T[((var9 + 1) * 5 + var10 + 0) * 17 + var11 + 1] - var18) * 0.125D;
      var56 = (this.T[((var9 + 1) * 5 + var10 + 1) * 17 + var11 + 1] - var20) * 0.125D;
      byte var30 = 0;
      var56 = 0.25D;
      var56 = (var18 - var14) * 0.25D;
      var56 = (var20 - var16) * 0.25D;
      byte var41 = 0;
      var56 = 0.25D;
      double var44 = var14;
      double var46 = (var16 - var14) * 0.25D;
      int var48 = 0;

      while(true) {
         net.yw.n var49 = null;
         if(var11 * 8 + var30 < var5) {
            var49 = K;
         }

         if(var44 > 0.0D) {
            var49 = q;
         }

         int var50 = var41 + var9 * 4;
         int var51 = var30 + var11 * 8;
         int var52 = var48 + var10 * 4;
         var3.Q(var50, var51, var52, var49);
         var44 += var46;
         ++var48;
      }
   }

   public void k(int var1, int var2, o var3) {
      int var4 = this.C.k() + 1;
      double var10000 = 0.03125D;
      this.r = this.z.u(this.r, var1 * 16, var2 * 16, 0, 16, 16, 1, 0.03125D, 0.03125D, 1.0D);
      this.s = this.z.u(this.s, var1 * 16, 109, var2 * 16, 16, 1, 16, 0.03125D, 1.0D, 0.03125D);
      this.o = this.j.u(this.o, var1 * 16, var2 * 16, 0, 16, 16, 1, 0.0625D, 0.0625D, 0.0625D);
      byte var7 = 0;
      byte var8 = 0;
      if(this.r[var7 + var8 * 16] + this.S.nextDouble() * 0.2D > 0.0D) {
         boolean var20 = true;
      } else {
         boolean var21 = false;
      }

      if(this.s[var7 + var8 * 16] + this.S.nextDouble() * 0.2D > 0.0D) {
         boolean var22 = true;
      } else {
         boolean var23 = false;
      }

      int var11 = (int)(this.o[var7 + var8 * 16] / 3.0D + 3.0D + this.S.nextDouble() * 0.25D);
      boolean var12 = true;
      net.yw.n var13 = q;
      net.yw.n var14 = q;
      int var15 = 127;

      while(true) {
         if(var15 < 127 - this.S.nextInt(5) && var15 > this.S.nextInt(5)) {
            net.yw.n var16 = var3.b(var8, var15, var7);
            if(var16.Q() != null && var16.n() != net.y1.l.q) {
               if(var16.Q() == net.nb.f.R) {
                  var13 = F;
                  var14 = q;
                  if(var15 < var4 && var13.n() == net.y1.l.q) {
                     var13 = K;
                  }

                  if(var15 >= var4 - 1) {
                     var3.Q(var8, var15, var7, var13);
                  } else {
                     var3.Q(var8, var15, var7, var14);
                  }
               }
            } else {
               var12 = true;
            }
         } else {
            var3.Q(var8, var15, var7, I);
         }

         --var15;
      }
   }

   public net.l.q g(int var1, int var2) {
      this.S.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      o var3 = new o();
      this.w(var1, var2, var3);
      this.k(var1, var2, var3);
      this.Q.x(this.C, var1, var2, var3);
      if(this.p) {
         this.f.x(this.C, var1, var2, var3);
      }

      net.l.q var4 = new net.l.q(this.C, var3, var1, var2);
      i[] var5 = this.C.V().h((i[])null, var1 * 16, var2 * 16, 16, 16);
      byte[] var6 = var4.O();

      for(int var7 = 0; var7 < var6.length; ++var7) {
         var6[var7] = (byte)i.y(var5[var7]);
      }

      var4.I();
      return var4;
   }

   private double[] p(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      var1 = new double[var5 * var6 * var7];
      double var10000 = 684.412D;
      var10000 = 2053.236D;
      this.w = this.U.u(this.w, var2, var3, var4, var5, 1, var7, 1.0D, 0.0D, 1.0D);
      this.W = this.E.u(this.W, var2, var3, var4, var5, 1, var7, 100.0D, 0.0D, 100.0D);
      this.J = this.i.u(this.J, var2, var3, var4, var5, var6, var7, 8.555150000000001D, 34.2206D, 8.555150000000001D);
      this.A = this.n.u(this.A, var2, var3, var4, var5, var6, var7, 684.412D, 2053.236D, 684.412D);
      this.k = this.x.u(this.k, var2, var3, var4, var5, var6, var7, 684.412D, 2053.236D, 684.412D);
      int var12 = 0;
      double[] var13 = new double[var6];

      for(int var14 = 0; var14 < var6; ++var14) {
         var13[var14] = Math.cos((double)var14 * 3.141592653589793D * 6.0D / (double)var6) * 2.0D;
         double var15 = (double)var14;
         if(var14 > var6 / 2) {
            var15 = (double)(var6 - 1 - var14);
         }

         double var40;
         int var37 = (var40 = var15 - 4.0D) == 0.0D?0:(var40 < 0.0D?-1:1);
         var15 = 4.0D - var15;
         var13[var14] -= var15 * var15 * var15 * 10.0D;
      }

      for(int var32 = 0; var32 < var5; ++var32) {
         for(int var34 = 0; var34 < var7; ++var34) {
            var10000 = 0.0D;

            for(int var18 = 0; var18 < var6; ++var18) {
               double var19 = var13[var18];
               double var21 = this.A[var12] / 512.0D;
               double var23 = this.k[var12] / 512.0D;
               double var25 = (this.J[var12] / 10.0D + 1.0D) / 2.0D;
               double var27;
               if(var25 < 0.0D) {
                  var27 = var21;
               } else if(var25 > 1.0D) {
                  var27 = var23;
               } else {
                  var27 = var21 + (var23 - var21) * var25;
               }

               var27 = var27 - var19;
               if(var18 > var6 - 4) {
                  double var29 = (double)((float)(var18 - (var6 - 4)) / 3.0F);
                  var27 = var27 * (1.0D - var29) + -10.0D * var29;
               }

               double var41;
               int var39 = (var41 = (double)var18 - 0.0D) == 0.0D?0:(var41 < 0.0D?-1:1);
               var1[var12] = var27;
               ++var12;
            }
         }
      }

      return var1;
   }

   public void u(int var1, int var2) {
      r1.D = true;
      int var4 = var1 * 16;
      int var5 = var2 * 16;
      j var6 = new j(var4, 0, var5);
      i var7 = this.C.P(var6.F(16, 0, 16));
      int var10000 = w.a();
      net.u.p var8 = new net.u.p(var1, var2);
      int var3 = var10000;
      this.f.m(this.C, this.S, var8);
      int var9 = 0;
      this.e.K(this.C, this.S, var6.F(this.S.nextInt(16) + 8, this.S.nextInt(120) + 4, this.S.nextInt(16) + 8));
      ++var9;
      var9 = 0;
      if(var9 < this.S.nextInt(this.S.nextInt(10) + 1) + 1) {
         this.l.K(this.C, this.S, var6.F(this.S.nextInt(16) + 8, this.S.nextInt(120) + 4, this.S.nextInt(16) + 8));
         ++var9;
      }

      var9 = 0;
      if(var9 < this.S.nextInt(this.S.nextInt(10) + 1)) {
         this.L.K(this.C, this.S, var6.F(this.S.nextInt(16) + 8, this.S.nextInt(120) + 4, this.S.nextInt(16) + 8));
         ++var9;
      }

      var9 = 0;
      this.H.K(this.C, this.S, var6.F(this.S.nextInt(16) + 8, this.S.nextInt(128), this.S.nextInt(16) + 8));
      ++var9;
      if(this.S.nextBoolean()) {
         this.G.K(this.C, this.S, var6.F(this.S.nextInt(16) + 8, this.S.nextInt(128), this.S.nextInt(16) + 8));
      }

      if(this.S.nextBoolean()) {
         this.M.K(this.C, this.S, var6.F(this.S.nextInt(16) + 8, this.S.nextInt(128), this.S.nextInt(16) + 8));
      }

      var9 = 0;
      this.X.K(this.C, this.S, var6.F(this.S.nextInt(16), this.S.nextInt(108) + 10, this.S.nextInt(16)));
      ++var9;
      var9 = this.C.k() / 2 + 1;
      int var10 = 0;
      this.Y.K(this.C, this.S, var6.F(this.S.nextInt(16), var9 - 5 + this.S.nextInt(10), this.S.nextInt(16)));
      ++var10;
      var10 = 0;
      this.v.K(this.C, this.S, var6.F(this.S.nextInt(16), this.S.nextInt(108) + 10, this.S.nextInt(16)));
      ++var10;
      var7.f(this.C, this.S, new j(var4, 0, var5));
      r1.D = false;
      if(net.u.d.y() == null) {
         ++var3;
         w.u(var3);
      }

   }

   public boolean c(net.l.q var1, int var2, int var3) {
      return false;
   }

   public List x(net.ne.q var1, j var2) {
      if(var1 == net.ne.q.MONSTER) {
         if(this.f.Z(var2)) {
            return this.f.e();
         }

         if(this.f.o(this.C, var2) && this.C.Z(var2.b()).Q() == net.nb.f.Tb) {
            return this.f.e();
         }
      }

      i var3 = this.C.P(var2);
      return var3.v(var1);
   }

   @Nullable
   public j P(r var1, String var2, j var3, boolean var4) {
      return "Fortress".equals(var2) && this.f != null?this.f.h(var1, var3, var4):null;
   }

   public boolean z(r var1, String var2, j var3) {
      return "Fortress".equals(var2) && this.f != null && this.f.Z(var3);
   }

   public void W(net.l.q var1, int var2, int var3) {
      this.f.x(this.C, var2, var3, (o)null);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
