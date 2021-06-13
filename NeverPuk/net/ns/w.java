package net.ns;

import java.util.Arrays;
import java.util.Random;
import net.xn;
import net.n0.kw;
import net.ns.e;
import net.ns.i;
import net.ns.i9;
import net.y9.ri;
import net.y9.rv;
import net.y9.zv;

public class w extends i {
   protected static final net.yw.n l = net.nb.f.dl.p().s(rv.l, rv.m.COARSE_DIRT);
   protected static final net.yw.n B = net.nb.f.p.p();
   protected static final net.yw.n s = net.nb.f.oY.p();
   protected static final net.yw.n i = net.nb.f.Ty.p();
   protected static final net.yw.n p = i.s(zv.D, kw.ORANGE);
   protected static final net.yw.n a = net.nb.f.TF.p().s(ri.F, ri.g.RED_SAND);
   private net.yw.n[] A;
   private long U;
   private net.cn.d r;
   private net.cn.d Q;
   private net.cn.d k;
   private final boolean u;
   private final boolean o;

   public w(boolean var1, boolean var2, i.g var3) {
      super(var3);
      this.u = var1;
      this.o = var2;
      this.v.clear();
      this.j = a;
      this.y = i;
      this.K.E = -999;
      this.K.P = 20;
      this.K.g = 3;
      this.K.h = 5;
      this.K.D = 0;
      this.v.clear();
      this.K.E = 5;
   }

   protected e Q() {
      return new w.b();
   }

   public net.w.x q(Random var1) {
      return V;
   }

   public int d(net.u.j var1) {
      return 10387789;
   }

   public int r(net.u.j var1) {
      return 9470285;
   }

   public void y(net.yv.r var1, Random var2, net.l.o var3, int var4, int var5, double var6) {
      int[] var8 = i9.M();
      if(this.A == null || this.U != var1.a()) {
         this.Q(var1.a());
      }

      if(this.r == null || this.Q == null || this.U != var1.a()) {
         Random var9 = new Random(this.U);
         this.r = new net.cn.d(var9, 4);
         this.Q = new net.cn.d(var9, 1);
      }

      this.U = var1.a();
      double var24 = 0.0D;
      if(this.u) {
         int var11 = (var4 & -16) + (var5 & 15);
         int var12 = (var5 & -16) + (var4 & 15);
         double var13 = Math.min(Math.abs(var6), this.r.Q((double)var11 * 0.25D, (double)var12 * 0.25D));
         if(Double.compare(var13, 0.0D) > 0) {
            double var15 = 0.001953125D;
            double var17 = Math.abs(this.Q.Q((double)var11 * 0.001953125D, (double)var12 * 0.001953125D));
            var24 = var13 * var13 * 2.5D;
            double var19 = Math.ceil(var17 * 50.0D) + 14.0D;
            if(var24 > var19) {
               var24 = var19;
            }

            var24 = var24 + 64.0D;
         }
      }

      int var27 = var4 & 15;
      int var28 = var5 & 15;
      int var29 = var1.k();
      net.yw.n var14 = i;
      net.yw.n var31 = this.y;
      int var16 = (int)(var6 / 3.0D + 3.0D + var2.nextDouble() * 0.25D);
      boolean var32 = Double.compare(Math.cos(var6 / 3.0D * 3.141592653589793D), 0.0D) > 0;
      int var18 = -1;
      boolean var35 = false;
      int var20 = 0;
      int var21 = 255;
      if(var3.b(var28, var21, var27).n() == net.y1.l.q) {
         ;
      }

      if(var21 <= var2.nextInt(5)) {
         var3.Q(var28, var21, var27, E);
      }

      net.yw.n var22 = var3.b(var28, var21, var27);
      if(var22.n() == net.y1.l.q) {
         var18 = (boolean)-1;
      }

      if(var22.Q() == net.nb.f.oy) {
         var35 = false;
         if(var16 <= 0) {
            var14 = z;
            var31 = H;
         }

         if(var21 >= var29 - 4 && var21 <= var29 + 1) {
            var14 = i;
            var31 = this.y;
         }

         if(var21 < var29 && (var14 == null || var14.n() == net.y1.l.q)) {
            var14 = D;
         }

         var18 = var16 + Math.max(0, var21 - var29);
         if(var21 >= var29 - 1) {
            if(this.o && var21 > 86 + var16 * 2) {
               var3.Q(var28, var21, var27, l);
               var3.Q(var28, var21, var27, B);
            }

            if(var21 > var29 + 3 + var16) {
               net.yw.n var23 = p;
               var3.Q(var28, var21, var27, var23);
            }

            var3.Q(var28, var21, var27, this.j);
            var35 = true;
         }

         var3.Q(var28, var21, var27, var31);
         if(var31.Q() == net.nb.f.Ty) {
            var3.Q(var28, var21, var27, p);
         }

         ++var20;
      }

      --var21;
   }

   private void Q(long var1) {
      this.A = new net.yw.n[64];
      Arrays.fill(this.A, s);
      Random var3 = new Random(var1);
      this.k = new net.cn.d(var3, 1);
      int var12 = 0;

      while(true) {
         var12 += var3.nextInt(5) + 1;
         if(var12 < 64) {
            this.A[var12] = p;
         }

         ++var12;
      }
   }

   private net.yw.n x(int var1, int var2, int var3) {
      int var4 = (int)Math.round(this.k.Q((double)var1 / 512.0D, (double)var1 / 512.0D) * 2.0D);
      return this.A[(var2 + var4 + 64) % 64];
   }

   private static xn b(xn var0) {
      return var0;
   }

   class b extends e {
      private b() {
      }

      protected void T(net.yv.r var1, Random var2) {
         super.T(var1, var2);
         this.o(var1, var2, 20, this.R, 32, 80);
      }
   }
}
