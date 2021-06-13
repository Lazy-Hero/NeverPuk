package net.cn;

import java.util.Random;
import net.xn;
import net.cn.k;
import net.cn.w;

public class b extends k {
   private final int[] I;
   public double i;
   public double u;
   public double Y;
   private static final double[] b = new double[]{1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, -1.0D, 0.0D};
   private static final double[] S = new double[]{1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D};
   private static final double[] B = new double[]{0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 1.0D, -1.0D, -1.0D, 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 1.0D, 0.0D, -1.0D};
   private static final double[] Z = new double[]{1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, -1.0D, 0.0D};
   private static final double[] f = new double[]{0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 1.0D, -1.0D, -1.0D, 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 1.0D, 0.0D, -1.0D};

   public b() {
      this(new Random());
   }

   public b(Random var1) {
      this.I = new int[512];
      this.i = var1.nextDouble() * 256.0D;
      this.u = var1.nextDouble() * 256.0D;
      this.Y = var1.nextDouble() * 256.0D;
      int var2 = 0;

      while(true) {
         this.I[var2] = var2++;
      }
   }

   public final double G(double var1, double var3, double var5) {
      return var3 + var1 * (var5 - var3);
   }

   public final double Y(int var1, double var2, double var4) {
      int var6 = var1 & 15;
      return Z[var6] * var2 + f[var6] * var4;
   }

   public final double V(int var1, double var2, double var4, double var6) {
      int var8 = var1 & 15;
      return b[var8] * var2 + S[var8] * var4 + B[var8] * var6;
   }

   public void H(double[] var1, double var2, double var4, double var6, int var8, int var9, int var10, double var11, double var13, double var15, double var17) {
      int var19 = w.a();
      if(var9 == 1) {
         int var20 = 0;
         int var21 = 0;
         int var22 = 0;
         int var23 = 0;
         double var24 = 0.0D;
         double var26 = 0.0D;
         int var28 = 0;
         double var29 = 1.0D / var17;
         int var31 = 0;
         if(var31 < var8) {
            double var32 = var2 + (double)var31 * var11 + this.i;
            int var34 = (int)var32;
            if(Double.compare(var32, (double)var34) < 0) {
               --var34;
            }

            int var35 = var34 & 255;
            var32 = var32 - (double)var34;
            double var36 = var32 * var32 * var32 * (var32 * (var32 * 6.0D - 15.0D) + 10.0D);
            int var38 = 0;
            if(var38 < var10) {
               double var39 = var6 + (double)var38 * var15 + this.Y;
               int var41 = (int)var39;
               if(Double.compare(var39, (double)var41) < 0) {
                  --var41;
               }

               int var42 = var41 & 255;
               var39 = var39 - (double)var41;
               double var43 = var39 * var39 * var39 * (var39 * (var39 * 6.0D - 15.0D) + 10.0D);
               var20 = this.I[var35] + 0;
               var21 = this.I[var20] + var42;
               var22 = this.I[var35 + 1] + 0;
               var23 = this.I[var22] + var42;
               var24 = this.G(var36, this.Y(this.I[var21], var32, var39), this.V(this.I[var23], var32 - 1.0D, 0.0D, var39));
               var26 = this.G(var36, this.V(this.I[var21 + 1], var32, 0.0D, var39 - 1.0D), this.V(this.I[var23 + 1], var32 - 1.0D, 0.0D, var39 - 1.0D));
               double var45 = this.G(var43, var24, var26);
               int var47 = var28++;
               var1[var47] += var45 * var29;
               ++var38;
            }

            ++var31;
         }
      }

      int var67 = 0;
      double var70 = 1.0D / var17;
      boolean var73 = true;
      int var75 = 0;
      int var25 = 0;
      int var79 = 0;
      int var27 = 0;
      int var83 = 0;
      int var85 = 0;
      double var30 = 0.0D;
      double var90 = 0.0D;
      double var92 = 0.0D;
      double var94 = 0.0D;
      int var97 = 0;
      if(var97 < var8) {
         double var100 = var2 + (double)var97 * var11 + this.i;
         int var102 = (int)var100;
         if(Double.compare(var100, (double)var102) < 0) {
            --var102;
         }

         int var103 = var102 & 255;
         var100 = var100 - (double)var102;
         double var104 = var100 * var100 * var100 * (var100 * (var100 * 6.0D - 15.0D) + 10.0D);
         int var105 = 0;
         if(var105 < var10) {
            double var46 = var6 + (double)var105 * var15 + this.Y;
            int var48 = (int)var46;
            if(Double.compare(var46, (double)var48) < 0) {
               --var48;
            }

            int var49 = var48 & 255;
            var46 = var46 - (double)var48;
            double var50 = var46 * var46 * var46 * (var46 * (var46 * 6.0D - 15.0D) + 10.0D);
            int var52 = 0;
            if(var52 < var9) {
               double var53 = var4 + (double)var52 * var13 + this.u;
               int var55 = (int)var53;
               if(Double.compare(var53, (double)var55) < 0) {
                  --var55;
               }

               int var56 = var55 & 255;
               var53 = var53 - (double)var55;
               double var57 = var53 * var53 * var53 * (var53 * (var53 * 6.0D - 15.0D) + 10.0D);
               var75 = this.I[var103] + var56;
               var25 = this.I[var75] + var49;
               var79 = this.I[var75 + 1] + var49;
               var27 = this.I[var103 + 1] + var56;
               var83 = this.I[var27] + var49;
               var85 = this.I[var27 + 1] + var49;
               var30 = this.G(var104, this.V(this.I[var25], var100, var53, var46), this.V(this.I[var83], var100 - 1.0D, var53, var46));
               var90 = this.G(var104, this.V(this.I[var79], var100, var53 - 1.0D, var46), this.V(this.I[var85], var100 - 1.0D, var53 - 1.0D, var46));
               var92 = this.G(var104, this.V(this.I[var25 + 1], var100, var53, var46 - 1.0D), this.V(this.I[var83 + 1], var100 - 1.0D, var53, var46 - 1.0D));
               var94 = this.G(var104, this.V(this.I[var79 + 1], var100, var53 - 1.0D, var46 - 1.0D), this.V(this.I[var85 + 1], var100 - 1.0D, var53 - 1.0D, var46 - 1.0D));
               double var59 = this.G(var57, var30, var90);
               double var61 = this.G(var57, var92, var94);
               double var63 = this.G(var50, var59, var61);
               int var65 = var67++;
               var1[var65] += var63 * var70;
               ++var52;
            }

            ++var105;
         }

         ++var97;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
