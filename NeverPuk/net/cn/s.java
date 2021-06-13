package net.cn;

import java.util.Random;
import net.xn;
import net.cn.w;

public class s {
   private static final int[][] R = new int[][]{{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}};
   public static final double s = Math.sqrt(3.0D);
   private final int[] I;
   public double P;
   public double z;
   public double v;
   private static final double m = 0.5D * (s - 1.0D);
   private static final double Y = (3.0D - s) / 6.0D;

   public s() {
      this(new Random());
   }

   public s(Random var1) {
      this.I = new int[512];
      this.P = var1.nextDouble() * 256.0D;
      this.z = var1.nextDouble() * 256.0D;
      this.v = var1.nextDouble() * 256.0D;
      int var2 = 0;

      while(true) {
         this.I[var2] = var2++;
      }
   }

   private static int S(double var0) {
      return var0 > 0.0D?(int)var0:(int)var0 - 1;
   }

   private static double X(int[] var0, double var1, double var3) {
      return (double)var0[0] * var1 + (double)var0[1] * var3;
   }

   public double B(double var1, double var3) {
      double var5 = 0.5D * (s - 1.0D);
      double var7 = (var1 + var3) * var5;
      int var9 = S(var1 + var7);
      int var10 = S(var3 + var7);
      double var11 = (3.0D - s) / 6.0D;
      double var13 = (double)(var9 + var10) * var11;
      double var15 = (double)var9 - var13;
      double var17 = (double)var10 - var13;
      double var19 = var1 - var15;
      double var21 = var3 - var17;
      byte var23;
      byte var24;
      if(var19 > var21) {
         var23 = 1;
         var24 = 0;
      } else {
         var23 = 0;
         var24 = 1;
      }

      double var25 = var19 - (double)var23 + var11;
      double var27 = var21 - (double)var24 + var11;
      double var29 = var19 - 1.0D + 2.0D * var11;
      double var31 = var21 - 1.0D + 2.0D * var11;
      int var33 = var9 & 255;
      int var34 = var10 & 255;
      int var35 = this.I[var33 + this.I[var34]] % 12;
      int var36 = this.I[var33 + var23 + this.I[var34 + var24]] % 12;
      int var37 = this.I[var33 + 1 + this.I[var34 + 1]] % 12;
      double var38 = 0.5D - var19 * var19 - var21 * var21;
      double var40;
      if(var38 < 0.0D) {
         var40 = 0.0D;
      } else {
         var38 = var38 * var38;
         var40 = var38 * var38 * X(R[var35], var19, var21);
      }

      double var42 = 0.5D - var25 * var25 - var27 * var27;
      double var44;
      if(var42 < 0.0D) {
         var44 = 0.0D;
      } else {
         var42 = var42 * var42;
         var44 = var42 * var42 * X(R[var36], var25, var27);
      }

      double var46 = 0.5D - var29 * var29 - var31 * var31;
      double var48;
      if(var46 < 0.0D) {
         var48 = 0.0D;
      } else {
         var46 = var46 * var46;
         var48 = var46 * var46 * X(R[var37], var29, var31);
      }

      return 70.0D * (var40 + var44 + var48);
   }

   public void e(double[] var1, double var2, double var4, int var6, int var7, double var8, double var10, double var12) {
      w.S();
      int var15 = 0;
      int var16 = 0;
      if(var16 < var7) {
         double var17 = (var4 + (double)var16) * var10 + this.z;
         int var19 = 0;
         if(var19 < var6) {
            double var20 = (var2 + (double)var19) * var8 + this.P;
            double var22 = (var20 + var17) * m;
            int var24 = S(var20 + var22);
            int var25 = S(var17 + var22);
            double var26 = (double)(var24 + var25) * Y;
            double var28 = (double)var24 - var26;
            double var30 = (double)var25 - var26;
            double var32 = var20 - var28;
            double var34 = var17 - var30;
            if(Double.compare(var32, var34) > 0) {
               boolean var36 = true;
               boolean var37 = false;
            }

            byte var67 = 0;
            byte var68 = 1;
            double var38 = var32 - (double)var67 + Y;
            double var40 = var34 - (double)var68 + Y;
            double var42 = var32 - 1.0D + 2.0D * Y;
            double var44 = var34 - 1.0D + 2.0D * Y;
            int var46 = var24 & 255;
            int var47 = var25 & 255;
            int var48 = this.I[var46 + this.I[var47]] % 12;
            int var49 = this.I[var46 + var67 + this.I[var47 + var68]] % 12;
            int var50 = this.I[var46 + 1 + this.I[var47 + 1]] % 12;
            double var51 = 0.5D - var32 * var32 - var34 * var34;
            if(var51 < 0.0D) {
               double var53 = 0.0D;
            }

            var51 = var51 * var51;
            double var70 = var51 * var51 * X(R[var48], var32, var34);
            double var55 = 0.5D - var38 * var38 - var40 * var40;
            if(var55 < 0.0D) {
               double var57 = 0.0D;
            }

            var55 = var55 * var55;
            double var72 = var55 * var55 * X(R[var49], var38, var40);
            double var59 = 0.5D - var42 * var42 - var44 * var44;
            if(var59 < 0.0D) {
               double var61 = 0.0D;
            }

            var59 = var59 * var59;
            double var74 = var59 * var59 * X(R[var50], var42, var44);
            int var63 = var15++;
            var1[var63] += 70.0D * (var70 + var72 + var74) * var12;
            ++var19;
         }

         ++var16;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
