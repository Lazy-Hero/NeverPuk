package net.cn;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.cn.e;
import net.cn.q;
import net.cn.s;
import net.cn.w;
import net.l.o;
import net.ns.i;
import net.u.j;
import net.w.m;
import net.y9.r1;
import net.y9.z0;
import net.yv.r;

public class y implements e {
   private final Random I;
   protected static final net.yw.n O = net.nb.f.Tz.p();
   protected static final net.yw.n B = net.nb.f.ou.p();
   private final q E;
   private final q Z;
   private final q M;
   public q Y;
   public q A;
   private final r S;
   private final boolean b;
   private final j s;
   private final net.y4.t D = new net.y4.t(this);
   private final s X;
   private double[] H;
   private i[] e;
   double[] C;
   double[] i;
   double[] P;
   private final net.w.p c = new net.w.p();

   public y(r var1, boolean var2, long var3, j var5) {
      this.S = var1;
      this.b = var2;
      this.s = var5;
      this.I = new Random(var3);
      this.E = new q(this.I, 16);
      this.Z = new q(this.I, 16);
      this.M = new q(this.I, 8);
      this.Y = new q(this.I, 10);
      this.A = new q(this.I, 16);
      this.X = new s(this.I);
   }

   public void g(int var1, int var2, o var3) {
      boolean var10000 = true;
      var10000 = true;
      var10000 = true;
      var10000 = true;
      this.H = this.v(this.H, var1 * 2, 0, var2 * 2, 3, 33, 3);
      byte var8 = 0;
      byte var9 = 0;
      byte var10 = 0;
      double var55 = 0.25D;
      double var13 = this.H[((var8 + 0) * 3 + var9 + 0) * 33 + var10 + 0];
      double var15 = this.H[((var8 + 0) * 3 + var9 + 1) * 33 + var10 + 0];
      double var17 = this.H[((var8 + 1) * 3 + var9 + 0) * 33 + var10 + 0];
      double var19 = this.H[((var8 + 1) * 3 + var9 + 1) * 33 + var10 + 0];
      var55 = (this.H[((var8 + 0) * 3 + var9 + 0) * 33 + var10 + 1] - var13) * 0.25D;
      var55 = (this.H[((var8 + 0) * 3 + var9 + 1) * 33 + var10 + 1] - var15) * 0.25D;
      var55 = (this.H[((var8 + 1) * 3 + var9 + 0) * 33 + var10 + 1] - var17) * 0.25D;
      var55 = (this.H[((var8 + 1) * 3 + var9 + 1) * 33 + var10 + 1] - var19) * 0.25D;
      byte var29 = 0;
      var55 = 0.125D;
      var55 = (var17 - var13) * 0.125D;
      var55 = (var19 - var15) * 0.125D;
      byte var40 = 0;
      var55 = 0.125D;
      double var43 = var13;
      double var45 = (var15 - var13) * 0.125D;
      int var47 = 0;

      while(true) {
         net.yw.n var48 = B;
         if(var43 > 0.0D) {
            var48 = O;
         }

         int var49 = var40 + var8 * 8;
         int var50 = var29 + var10 * 4;
         int var51 = var47 + var9 * 8;
         var3.Q(var49, var50, var51, var48);
         var43 += var45;
         ++var47;
      }
   }

   public void F(o var1) {
      byte var2 = 0;
      byte var3 = 0;
      boolean var10000 = true;
      boolean var5 = true;
      net.yw.n var6 = O;
      net.yw.n var12 = O;
      int var8 = 127;

      while(true) {
         net.yw.n var9 = var1.b(var2, var8, var3);
         if(var9.n() == net.y1.l.q) {
            var5 = true;
         } else if(var9.Q() == net.nb.f.oy) {
            var5 = true;
            var1.Q(var2, var8, var3, var6);
         }

         --var8;
      }
   }

   public net.l.q g(int var1, int var2) {
      this.I.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      o var3 = new o();
      this.e = this.S.V().h(this.e, var1 * 16, var2 * 16, 16, 16);
      this.g(var1, var2, var3);
      this.F(var3);
      if(this.b) {
         this.D.x(this.S, var1, var2, var3);
      }

      net.l.q var4 = new net.l.q(this.S, var3, var1, var2);
      byte[] var5 = var4.O();

      for(int var6 = 0; var6 < var5.length; ++var6) {
         var5[var6] = (byte)i.y(this.e[var6]);
      }

      var4.Q();
      return var4;
   }

   private float B(int var1, int var2, int var3, int var4) {
      float var5 = (float)(var1 * 2 + var3);
      float var6 = (float)(var2 * 2 + var4);
      float var7 = 100.0F - net.u.t.g(var5 * var5 + var6 * var6) * 8.0F;
      if(var7 > 80.0F) {
         var7 = 80.0F;
      }

      if(var7 < -100.0F) {
         var7 = -100.0F;
      }

      byte var8 = -12;
      int var9 = -12;

      while(true) {
         long var10 = (long)(var1 + var8);
         long var12 = (long)(var2 + var9);
         if(var10 * var10 + var12 * var12 > 4096L && this.X.B((double)var10, (double)var12) < -0.8999999761581421D) {
            float var14 = (net.u.t.J((float)var10) * 3439.0F + net.u.t.J((float)var12) * 147.0F) % 13.0F + 9.0F;
            var5 = (float)(var3 - var8 * 2);
            var6 = (float)(var4 - var9 * 2);
            float var15 = 100.0F - net.u.t.g(var5 * var5 + var6 * var6) * var14;
            if(var15 > 80.0F) {
               var15 = 80.0F;
            }

            if(var15 < -100.0F) {
               var15 = -100.0F;
            }

            if(var15 > var7) {
               var7 = var15;
            }
         }

         ++var9;
      }
   }

   public boolean D(int var1, int var2) {
      return (long)var1 * (long)var1 + (long)var2 * (long)var2 > 4096L && this.B(var1, var2, 1, 1) >= 0.0F;
   }

   private double[] v(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      var1 = new double[var5 * var6 * var7];
      double var8 = 684.412D;
      double var10000 = 684.412D;
      var8 = var8 * 2.0D;
      this.C = this.M.u(this.C, var2, var3, var4, var5, var6, var7, var8 / 80.0D, 4.277575000000001D, var8 / 80.0D);
      this.i = this.E.u(this.i, var2, var3, var4, var5, var6, var7, var8, 684.412D, var8);
      this.P = this.Z.u(this.P, var2, var3, var4, var5, var6, var7, var8, 684.412D, var8);
      int var12 = var2 / 2;
      int var13 = var4 / 2;
      int var14 = 0;

      for(int var15 = 0; var15 < var5; ++var15) {
         for(int var16 = 0; var16 < var7; ++var16) {
            float var17 = this.B(var12, var13, var15, var16);

            for(int var18 = 0; var18 < var6; ++var18) {
               double var19 = this.i[var14] / 512.0D;
               double var21 = this.P[var14] / 512.0D;
               double var23 = (this.C[var14] / 10.0D + 1.0D) / 2.0D;
               double var25;
               if(var23 < 0.0D) {
                  var25 = var19;
               } else if(var23 > 1.0D) {
                  var25 = var21;
               } else {
                  var25 = var19 + (var21 - var19) * var23;
               }

               var25 = var25 - 8.0D;
               var25 = var25 + (double)var17;
               byte var27 = 2;
               if(var18 > var6 / 2 - var27) {
                  double var28 = (double)((float)(var18 - (var6 / 2 - var27)) / 64.0F);
                  var28 = net.u.t.F(var28, 0.0D, 1.0D);
                  var25 = var25 * (1.0D - var28) + -3000.0D * var28;
               }

               var27 = 8;
               double var37 = (double)((float)(var27 - var18) / ((float)var27 - 1.0F));
               var25 = var25 * (1.0D - var37) + -30.0D * var37;
               var1[var14] = var25;
               ++var14;
            }
         }
      }

      return var1;
   }

   public void u(int var1, int var2) {
      r1.D = true;
      w.a();
      j var4 = new j(var1 * 16, 0, var2 * 16);
      if(this.b) {
         this.D.m(this.S, this.I, new net.u.p(var1, var2));
      }

      this.S.P(var4.F(16, 0, 16)).f(this.S, this.S.G, var4);
      long var5 = (long)var1 * (long)var1 + (long)var2 * (long)var2;
      if(Long.compare(var5, 4096L) > 0) {
         float var7 = this.B(var1, var2, 1, 1);
         if(Float.compare(var7, -20.0F) < 0 && this.I.nextInt(14) == 0) {
            this.c.K(this.S, this.I, var4.F(this.I.nextInt(16) + 8, 55 + this.I.nextInt(16), this.I.nextInt(16) + 8));
            if(this.I.nextInt(4) == 0) {
               this.c.K(this.S, this.I, var4.F(this.I.nextInt(16) + 8, 55 + this.I.nextInt(16), this.I.nextInt(16) + 8));
            }
         }

         if(Float.compare(this.B(var1, var2, 1, 1), 40.0F) > 0) {
            int var8 = this.I.nextInt(5);
            int var9 = 0;
            if(var9 < var8) {
               int var10 = this.I.nextInt(16) + 8;
               int var11 = this.I.nextInt(16) + 8;
               int var12 = this.S.A(var4.F(var10, 0, var11)).h();
               if(var12 > 0) {
                  int var13 = var12 - 1;
                  if(this.S.y(var4.F(var10, var13 + 1, var11)) && this.S.Z(var4.F(var10, var13, var11)).Q() == net.nb.f.Tz) {
                     z0.T(this.S, var4.F(var10, var13 + 1, var11), this.I, 8);
                  }
               }

               ++var9;
            }

            if(this.I.nextInt(700) == 0) {
               var9 = this.I.nextInt(16) + 8;
               int var18 = this.I.nextInt(16) + 8;
               int var19 = this.S.A(var4.F(var9, 0, var18)).h();
               if(var19 > 0) {
                  int var20 = var19 + 3 + this.I.nextInt(7);
                  j var21 = var4.F(var9, var20, var18);
                  (new m()).K(this.S, this.I, var21);
                  net.ni.v var14 = this.S.L(var21);
                  if(var14 instanceof net.ni.z) {
                     net.ni.z var15 = (net.ni.z)var14;
                     var15.A(this.s);
                  }
               }
            }
         }
      }

      r1.D = false;
   }

   public boolean c(net.l.q var1, int var2, int var3) {
      return false;
   }

   public List x(net.ne.q var1, j var2) {
      return this.S.P(var2).v(var1);
   }

   @Nullable
   public j P(r var1, String var2, j var3, boolean var4) {
      return "EndCity".equals(var2) && this.D != null?this.D.h(var1, var3, var4):null;
   }

   public boolean z(r var1, String var2, j var3) {
      return "EndCity".equals(var2) && this.D != null && this.D.Z(var3);
   }

   public void W(net.l.q var1, int var2, int var3) {
   }

   private static xn a(xn var0) {
      return var0;
   }
}
