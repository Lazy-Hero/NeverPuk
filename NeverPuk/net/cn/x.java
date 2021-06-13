package net.cn;

import java.util.Random;
import net.xn;
import net.cn.w;
import net.l.o;
import net.yv.r;

public class x extends w {
   protected static final net.yw.n Y = net.nb.f.ou.p();

   protected void r(long var1, int var3, int var4, o var5, double var6, double var8, double var10) {
      this.b(var1, var3, var4, var5, var6, var8, var10, 1.0F + this.N.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5D);
   }

   protected void b(long var1, int var3, int var4, o var5, double var6, double var8, double var10, float var12, float var13, float var14, int var15, int var16, double var17) {
      double var20 = (double)(var3 * 16 + 8);
      double var22 = (double)(var4 * 16 + 8);
      float var24 = 0.0F;
      w.a();
      float var25 = 0.0F;
      Random var26 = new Random(var1);
      if(var16 <= 0) {
         int var27 = this.o * 16 - 16;
         var16 = var27 - var26.nextInt(var27 / 4);
      }

      boolean var71 = false;
      if(var15 == -1) {
         var15 = var16 / 2;
         var71 = true;
      }

      int var28 = var26.nextInt(var16 / 2) + var16 / 4;
      boolean var29 = var26.nextInt(6) == 0;
      if(var15 < var16) {
         double var30 = 1.5D + (double)(net.u.t.A((float)var15 * 3.1415927F / (float)var16) * var12);
         double var32 = var30 * var17;
         float var34 = net.u.t.m(var14);
         float var35 = net.u.t.A(var14);
         var6 = var6 + (double)(net.u.t.m(var13) * var34);
         var8 = var8 + (double)var35;
         var10 = var10 + (double)(net.u.t.A(var13) * var34);
         var14 = var14 * 0.92F;
         var14 = var14 * 0.7F;
         var14 = var14 + var25 * 0.1F;
         var13 = var13 + var24 * 0.1F;
         var25 = var25 * 0.9F;
         var24 = var24 * 0.75F;
         float var10000 = var25 + (var26.nextFloat() - var26.nextFloat()) * var26.nextFloat() * 2.0F;
         var10000 = var24 + (var26.nextFloat() - var26.nextFloat()) * var26.nextFloat() * 4.0F;
         if(var15 == var28 && Float.compare(var12, 1.0F) > 0) {
            this.b(var26.nextLong(), var3, var4, var5, var6, var8, var10, var26.nextFloat() * 0.5F + 0.5F, var13 - 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
            this.b(var26.nextLong(), var3, var4, var5, var6, var8, var10, var26.nextFloat() * 0.5F + 0.5F, var13 + 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
            return;
         }

         if(var26.nextInt(4) != 0) {
            double var36 = var6 - var20;
            double var38 = var10 - var22;
            double var40 = (double)(var16 - var15);
            double var42 = (double)(var12 + 2.0F + 16.0F);
            if(Double.compare(var36 * var36 + var38 * var38 - var40 * var40, var42 * var42) > 0) {
               return;
            }

            if(Double.compare(var6, var20 - 16.0D - var30 * 2.0D) >= 0 && var10 >= var22 - 16.0D - var30 * 2.0D && var6 <= var20 + 16.0D + var30 * 2.0D && var10 <= var22 + 16.0D + var30 * 2.0D) {
               int var44 = net.u.t.L(var6 - var30) - var3 * 16 - 1;
               int var45 = net.u.t.L(var6 + var30) - var3 * 16 + 1;
               int var46 = net.u.t.L(var8 - var32) - 1;
               int var47 = net.u.t.L(var8 + var32) + 1;
               int var48 = net.u.t.L(var10 - var30) - var4 * 16 - 1;
               int var49 = net.u.t.L(var10 + var30) - var4 * 16 + 1;
               if(var44 < 0) {
                  var44 = 0;
               }

               if(var45 > 16) {
                  var45 = 16;
               }

               if(var46 < 1) {
                  var46 = 1;
               }

               if(var47 > 120) {
                  var47 = 120;
               }

               if(var48 < 0) {
                  var48 = 0;
               }

               if(var49 > 16) {
                  var49 = 16;
               }

               boolean var50 = false;
               if(var44 < var45) {
                  if(var48 < var49) {
                     int var53 = var47 + 1;
                     if(var53 >= var46 - 1) {
                        if(var53 >= 0 && var53 < 128) {
                           net.yw.n var54 = var5.b(var44, var53, var48);
                           if(var54.Q() == net.nb.f.dj || var54.Q() == net.nb.f.TL) {
                              var50 = true;
                           }

                           if(var53 != var46 - 1 && var44 != var44 && var44 != var45 - 1 && var48 != var48 && var48 != var49 - 1) {
                              var53 = var46;
                           }
                        }

                        --var53;
                     }

                     int var52 = var48 + 1;
                  }

                  int var51 = var44 + 1;
               }

               if(var44 < var45) {
                  double var75 = ((double)(var44 + var3 * 16) + 0.5D - var6) / var30;
                  if(var48 < var49) {
                     double var55 = ((double)(var48 + var4 * 16) + 0.5D - var10) / var30;
                     if(var47 > var46) {
                        double var58 = ((double)(var47 - 1) + 0.5D - var8) / var32;
                        if(Double.compare(var58, -0.7D) > 0 && var75 * var75 + var58 * var58 + var55 * var55 < 1.0D) {
                           net.yw.n var60 = var5.b(var44, var47, var48);
                           if(var60.Q() == net.nb.f.R || var60.Q() == net.nb.f.dl || var60.Q() == net.nb.f.p) {
                              var5.Q(var44, var47, var48, Y);
                           }
                        }

                        int var57 = var47 - 1;
                     }

                     int var77 = var48 + 1;
                  }

                  int var74 = var44 + 1;
               }
            }
         }

         ++var15;
      }

   }

   protected void S(r var1, int var2, int var3, int var4, int var5, o var6) {
      int var7 = this.N.nextInt(this.N.nextInt(this.N.nextInt(10) + 1) + 1);
      if(this.N.nextInt(5) != 0) {
         var7 = 0;
      }

      byte var8 = 0;
      if(var8 < var7) {
         double var9 = (double)(var2 * 16 + this.N.nextInt(16));
         double var11 = (double)this.N.nextInt(128);
         double var13 = (double)(var3 * 16 + this.N.nextInt(16));
         int var15 = 1;
         if(this.N.nextInt(4) == 0) {
            this.r(this.N.nextLong(), var4, var5, var6, var9, var11, var13);
            var15 = var15 + this.N.nextInt(4);
         }

         int var16 = 0;

         while(true) {
            float var17 = this.N.nextFloat() * 6.2831855F;
            float var18 = (this.N.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var19 = this.N.nextFloat() * 2.0F + this.N.nextFloat();
            this.b(this.N.nextLong(), var4, var5, var6, var9, var11, var13, var19 * 2.0F, var17, var18, 0, 0, 0.5D);
            ++var16;
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
