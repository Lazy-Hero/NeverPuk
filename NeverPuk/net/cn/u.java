package net.cn;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.cn.d;
import net.cn.e;
import net.cn.g;
import net.cn.q;
import net.cn.v;
import net.cn.w;
import net.l.o;
import net.ns.i;
import net.w.fu;
import net.y9.r1;
import net.yv.j;
import net.yv.o4;
import net.yv.r;

public class u implements e {
   protected static final net.yw.n m = net.nb.f.oy.p();
   private final Random d;
   private final q u;
   private final q v;
   private final q V;
   private final d N;
   public q n;
   public q F;
   public q g;
   private final r z;
   private final boolean e;
   private final j b;
   private final double[] o;
   private final float[] W;
   private net.cn.z r;
   private net.yw.n K = net.nb.f.uM.p();
   private double[] y = new double[256];
   private final w R = new g();
   private final net.y4.l S = new net.y4.l();
   private final net.y4.q j = new net.y4.q();
   private final net.y4.k A = new net.y4.k();
   private final net.y4.j E = new net.y4.j();
   private final w P = new v();
   private final net.y4.y Z = new net.y4.y();
   private final net.y4.u I = new net.y4.u(this);
   private i[] L;
   double[] J;
   double[] w;
   double[] O;
   double[] s;

   public u(r var1, long var2, boolean var4, String var5) {
      this.z = var1;
      this.e = var4;
      this.b = var1.B().h();
      this.d = new Random(var2);
      this.u = new q(this.d, 16);
      this.v = new q(this.d, 16);
      this.V = new q(this.d, 8);
      this.N = new d(this.d, 4);
      this.n = new q(this.d, 10);
      this.F = new q(this.d, 16);
      this.g = new q(this.d, 8);
      this.o = new double[825];
      this.W = new float[25];
      byte var6 = -2;
      int var7 = -2;

      while(true) {
         float var8 = 10.0F / net.u.t.g((float)(var6 * var6 + var7 * var7) + 0.2F);
         this.W[var6 + 2 + (var7 + 2) * 5] = var8;
         ++var7;
      }
   }

   public void g(int var1, int var2, o var3) {
      this.L = this.z.V().U(this.L, var1 * 4 - 2, var2 * 4 - 2, 10, 10);
      this.i(var1 * 4, 0, var2 * 4);
      byte var4 = 0;
      int var5 = var4 * 5;
      int var6 = (var4 + 1) * 5;
      byte var7 = 0;
      int var8 = (var5 + var7) * 33;
      int var9 = (var5 + var7 + 1) * 33;
      int var10 = (var6 + var7) * 33;
      int var11 = (var6 + var7 + 1) * 33;
      byte var12 = 0;
      double var10000 = 0.125D;
      double var15 = this.o[var8 + var12];
      double var17 = this.o[var9 + var12];
      double var19 = this.o[var10 + var12];
      double var21 = this.o[var11 + var12];
      var10000 = (this.o[var8 + var12 + 1] - var15) * 0.125D;
      var10000 = (this.o[var9 + var12 + 1] - var17) * 0.125D;
      var10000 = (this.o[var10 + var12 + 1] - var19) * 0.125D;
      var10000 = (this.o[var11 + var12 + 1] - var21) * 0.125D;
      byte var31 = 0;
      var10000 = 0.25D;
      var10000 = (var19 - var15) * 0.25D;
      var10000 = (var21 - var17) * 0.25D;
      byte var42 = 0;
      var10000 = 0.25D;
      double var45 = (var17 - var15) * 0.25D;
      double var47 = var15 - var45;
      int var49 = 0;

      while(true) {
         if((var47 += var45) > 0.0D) {
            var3.Q(var4 * 4 + var42, var12 * 8 + var31, var7 * 4 + var49, m);
         } else if(var12 * 8 + var31 < this.r.vW) {
            var3.Q(var4 * 4 + var42, var12 * 8 + var31, var7 * 4 + var49, this.K);
         }

         ++var49;
      }
   }

   public void h(int var1, int var2, o var3, i[] var4) {
      double var10000 = 0.03125D;
      this.y = this.N.X(this.y, (double)(var1 * 16), (double)(var2 * 16), 16, 16, 0.0625D, 0.0625D, 1.0D);
      byte var7 = 0;
      int var8 = 0;

      while(true) {
         i var9 = var4[var8 + var7 * 16];
         var9.y(this.z, this.d, var3, var1 * 16 + var7, var2 * 16 + var8, this.y[var8 + var7 * 16]);
         ++var8;
      }
   }

   public net.l.q g(int var1, int var2) {
      this.d.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      o var3 = new o();
      this.g(var1, var2, var3);
      this.L = this.z.V().h(this.L, var1 * 16, var2 * 16, 16, 16);
      this.h(var1, var2, var3, this.L);
      if(this.r.vR) {
         this.R.x(this.z, var1, var2, var3);
      }

      if(this.r.I) {
         this.P.x(this.z, var1, var2, var3);
      }

      if(this.e) {
         if(this.r.vv) {
            this.A.x(this.z, var1, var2, var3);
         }

         if(this.r.l) {
            this.j.x(this.z, var1, var2, var3);
         }

         if(this.r.q) {
            this.S.x(this.z, var1, var2, var3);
         }

         if(this.r.P) {
            this.E.x(this.z, var1, var2, var3);
         }

         if(this.r.c) {
            this.Z.x(this.z, var1, var2, var3);
         }

         if(this.r.vD) {
            this.I.x(this.z, var1, var2, var3);
         }
      }

      net.l.q var4 = new net.l.q(this.z, var3, var1, var2);
      byte[] var5 = var4.O();

      for(int var6 = 0; var6 < var5.length; ++var6) {
         var5[var6] = (byte)i.y(this.L[var6]);
      }

      var4.Q();
      return var4;
   }

   private void i(int var1, int var2, int var3) {
      this.s = this.F.w(this.s, var1, var3, 5, 5, (double)this.r.D, (double)this.r.V, (double)this.r.v);
      float var4 = this.r.r;
      float var5 = this.r.T;
      this.J = this.V.u(this.J, var1, var2, var3, 5, 33, 5, (double)(var4 / this.r.vp), (double)(var5 / this.r.e), (double)(var4 / this.r.Y));
      this.w = this.u.u(this.w, var1, var2, var3, 5, 33, 5, (double)var4, (double)var5, (double)var4);
      this.O = this.v.u(this.O, var1, var2, var3, 5, 33, 5, (double)var4, (double)var5, (double)var4);
      byte var8 = 0;
      byte var9 = 0;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      boolean var10000 = true;
      i var14 = this.L[var8 + 2 + (var9 + 2) * 10];
      byte var15 = -2;
      int var16 = -2;

      while(true) {
         i var17 = this.L[var8 + var15 + 2 + (var9 + var16 + 2) * 10];
         float var18 = this.r.vN + var17.Q() * this.r.Z;
         float var19 = this.r.t + var17.c() * this.r.vU;
         if(this.b == j.I && var18 > 0.0F) {
            var18 = 1.0F + var18 * 2.0F;
            var19 = 1.0F + var19 * 4.0F;
         }

         float var20 = this.W[var15 + 2 + (var16 + 2) * 5] / (var18 + 2.0F);
         if(var17.Q() > var14.Q()) {
            var20 /= 2.0F;
         }

         var10 += var19 * var20;
         var11 += var18 * var20;
         var12 += var20;
         ++var16;
      }
   }

   public void u(int var1, int var2) {
      r1.D = true;
      int var4 = var1 * 16;
      int var5 = var2 * 16;
      net.u.j var6 = new net.u.j(var4, 0, var5);
      w.S();
      i var7 = this.z.P(var6.F(16, 0, 16));
      this.d.setSeed(this.z.a());
      long var8 = this.d.nextLong() / 2L * 2L + 1L;
      long var10 = this.d.nextLong() / 2L * 2L + 1L;
      this.d.setSeed((long)var1 * var8 + (long)var2 * var10 ^ this.z.a());
      boolean var12 = false;
      net.u.p var13 = new net.u.p(var1, var2);
      if(this.e) {
         if(this.r.vv) {
            this.A.m(this.z, this.d, var13);
         }

         if(this.r.l) {
            var12 = this.j.m(this.z, this.d, var13);
         }

         if(this.r.q) {
            this.S.m(this.z, this.d, var13);
         }

         if(this.r.P) {
            this.E.m(this.z, this.d, var13);
         }

         if(this.r.c) {
            this.Z.m(this.z, this.d, var13);
         }

         if(this.r.vD) {
            this.I.m(this.z, this.d, var13);
         }
      }

      if(var7 != net.nb.x.m && var7 != net.nb.x.H && this.r.vc && this.d.nextInt(this.r.ve) == 0) {
         int var14 = this.d.nextInt(16) + 8;
         int var15 = this.d.nextInt(256);
         int var16 = this.d.nextInt(16) + 8;
         (new fu(net.nb.f.uM)).K(this.z, this.d, var6.F(var14, var15, var16));
      }

      if(this.d.nextInt(this.r.N / 10) == 0 && this.r.J) {
         int var20 = this.d.nextInt(16) + 8;
         int var25 = this.d.nextInt(this.d.nextInt(248) + 8);
         int var29 = this.d.nextInt(16) + 8;
         if(var25 < this.z.k() || this.d.nextInt(this.r.N / 8) == 0) {
            (new fu(net.nb.f.TL)).K(this.z, this.d, var6.F(var20, var25, var29));
         }
      }

      if(this.r.v1) {
         int var21 = 0;
         if(var21 < this.r.vL) {
            int var26 = this.d.nextInt(16) + 8;
            int var30 = this.d.nextInt(256);
            int var17 = this.d.nextInt(16) + 8;
            (new net.w.s()).K(this.z, this.d, var6.F(var26, var30, var17));
            ++var21;
         }
      }

      var7.f(this.z, this.d, new net.u.j(var4, 0, var5));
      o4.F(this.z, var7, var4 + 8, var5 + 8, 16, 16, this.d);
      var6 = var6.F(8, 0, 8);
      int var23 = 0;
      int var27 = 0;
      net.u.j var31 = this.z.d(var6.F(var23, 0, var27));
      net.u.j var32 = var31.b();
      if(this.z.l(var32)) {
         this.z.k(var32, net.nb.f.oD.p(), 2);
      }

      if(this.z.b(var31, true)) {
         this.z.k(var31, net.nb.f.Tl.p(), 2);
      }

      ++var27;
      ++var23;
      r1.D = false;
   }

   public boolean c(net.l.q var1, int var2, int var3) {
      boolean var4 = false;
      if(this.r.c && this.e && var1.K() < 3600L) {
         var4 |= this.Z.m(this.z, this.d, new net.u.p(var2, var3));
      }

      return var4;
   }

   public List x(net.ne.q var1, net.u.j var2) {
      i var3 = this.z.P(var2);
      if(this.e) {
         if(var1 == net.ne.q.MONSTER && this.E.w(var2)) {
            return this.E.o();
         }

         if(var1 == net.ne.q.MONSTER && this.r.c && this.Z.o(this.z, var2)) {
            return this.Z.R();
         }
      }

      return var3.v(var1);
   }

   public boolean z(r var1, String var2, net.u.j var3) {
      return !this.e?false:("Stronghold".equals(var2) && this.S != null?this.S.Z(var3):("Mansion".equals(var2) && this.I != null?this.I.Z(var3):("Monument".equals(var2) && this.Z != null?this.Z.Z(var3):("Village".equals(var2) && this.j != null?this.j.Z(var3):("Mineshaft".equals(var2) && this.A != null?this.A.Z(var3):"Temple".equals(var2) && this.E != null && this.E.Z(var3))))));
   }

   @Nullable
   public net.u.j P(r var1, String var2, net.u.j var3, boolean var4) {
      return !this.e?null:("Stronghold".equals(var2) && this.S != null?this.S.h(var1, var3, var4):("Mansion".equals(var2) && this.I != null?this.I.h(var1, var3, var4):("Monument".equals(var2) && this.Z != null?this.Z.h(var1, var3, var4):("Village".equals(var2) && this.j != null?this.j.h(var1, var3, var4):("Mineshaft".equals(var2) && this.A != null?this.A.h(var1, var3, var4):("Temple".equals(var2) && this.E != null?this.E.h(var1, var3, var4):null))))));
   }

   public void W(net.l.q var1, int var2, int var3) {
      if(this.e) {
         if(this.r.vv) {
            this.A.x(this.z, var2, var3, (o)null);
         }

         if(this.r.l) {
            this.j.x(this.z, var2, var3, (o)null);
         }

         if(this.r.q) {
            this.S.x(this.z, var2, var3, (o)null);
         }

         if(this.r.P) {
            this.E.x(this.z, var2, var3, (o)null);
         }

         if(this.r.c) {
            this.Z.x(this.z, var2, var3, (o)null);
         }

         if(this.r.vD) {
            this.I.x(this.z, var2, var3, (o)null);
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
