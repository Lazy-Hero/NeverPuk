package net.cn;

import java.util.Random;
import net.xn;
import net.cn.w;
import net.l.o;
import net.u.j;
import net.yv.r;

public class v extends w {
   protected static final net.yw.n n = net.nb.f.dj.p();
   protected static final net.yw.n E = net.nb.f.ou.p();
   private final float[] d = new float[1024];

   protected void E(long var1, int var3, int var4, o var5, double var6, double var8, double var10, float var12, float var13, float var14, int var15, int var16, double var17) {
      Random var20 = new Random(var1);
      w.S();
      double var21 = (double)(var3 * 16 + 8);
      double var23 = (double)(var4 * 16 + 8);
      float var25 = 0.0F;
      float var26 = 0.0F;
      if(var16 <= 0) {
         int var27 = this.o * 16 - 16;
         var16 = var27 - var20.nextInt(var27 / 4);
      }

      boolean var69 = false;
      if(var15 == -1) {
         var15 = var16 / 2;
         var69 = true;
      }

      float var28 = 1.0F;
      int var29 = 0;
      var28 = 1.0F + var20.nextFloat() * var20.nextFloat();
      this.d[var29] = var28 * var28;
      ++var29;
      if(var15 < var16) {
         double var73 = 1.5D + (double)(net.u.t.A((float)var15 * 3.1415927F / (float)var16) * var12);
         double var31 = var73 * var17;
         var73 = var73 * ((double)var20.nextFloat() * 0.25D + 0.75D);
         var31 = var31 * ((double)var20.nextFloat() * 0.25D + 0.75D);
         float var33 = net.u.t.m(var14);
         float var34 = net.u.t.A(var14);
         var6 = var6 + (double)(net.u.t.m(var13) * var33);
         var8 = var8 + (double)var34;
         var10 = var10 + (double)(net.u.t.A(var13) * var33);
         var14 = var14 * 0.7F;
         float var10000 = var14 + var26 * 0.05F;
         var10000 = var13 + var25 * 0.05F;
         var26 = var26 * 0.8F;
         var25 = var25 * 0.5F;
         var10000 = var26 + (var20.nextFloat() - var20.nextFloat()) * var20.nextFloat() * 2.0F;
         var10000 = var25 + (var20.nextFloat() - var20.nextFloat()) * var20.nextFloat() * 4.0F;
         if(var20.nextInt(4) != 0) {
            double var35 = var6 - var21;
            double var37 = var10 - var23;
            double var39 = (double)(var16 - var15);
            double var41 = (double)(var12 + 2.0F + 16.0F);
            if(Double.compare(var35 * var35 + var37 * var37 - var39 * var39, var41 * var41) > 0) {
               return;
            }

            if(Double.compare(var6, var21 - 16.0D - var73 * 2.0D) >= 0 && var10 >= var23 - 16.0D - var73 * 2.0D && var6 <= var21 + 16.0D + var73 * 2.0D && var10 <= var23 + 16.0D + var73 * 2.0D) {
               int var43 = net.u.t.L(var6 - var73) - var3 * 16 - 1;
               int var44 = net.u.t.L(var6 + var73) - var3 * 16 + 1;
               int var45 = net.u.t.L(var8 - var31) - 1;
               int var46 = net.u.t.L(var8 + var31) + 1;
               int var47 = net.u.t.L(var10 - var73) - var4 * 16 - 1;
               int var48 = net.u.t.L(var10 + var73) - var4 * 16 + 1;
               if(var43 < 0) {
                  var43 = 0;
               }

               if(var44 > 16) {
                  var44 = 16;
               }

               if(var45 < 1) {
                  var45 = 1;
               }

               if(var46 > 248) {
                  var46 = 248;
               }

               if(var47 < 0) {
                  var47 = 0;
               }

               if(var48 > 16) {
                  var48 = 16;
               }

               boolean var49 = false;
               if(var43 < var44) {
                  if(var47 < var48) {
                     int var52 = var46 + 1;
                     if(var52 >= var45 - 1) {
                        if(var52 >= 0 && var52 < 256) {
                           net.yw.n var53 = var5.b(var43, var52, var47);
                           if(var53.Q() == net.nb.f.dy || var53.Q() == net.nb.f.uM) {
                              var49 = true;
                           }

                           if(var52 != var45 - 1 && var43 != var43 && var43 != var44 - 1 && var47 != var47 && var47 != var48 - 1) {
                              var52 = var45;
                           }
                        }

                        --var52;
                     }

                     int var51 = var47 + 1;
                  }

                  int var50 = var43 + 1;
               }

               new j.v();
               if(var43 < var44) {
                  double var79 = ((double)(var43 + var3 * 16) + 0.5D - var6) / var73;
                  if(var47 < var48) {
                     double var55 = ((double)(var47 + var4 * 16) + 0.5D - var10) / var73;
                     boolean var57 = false;
                     if(Double.compare(var79 * var79 + var55 * var55, 1.0D) < 0 && var46 > var45) {
                        double var59 = ((double)(var46 - 1) + 0.5D - var8) / var31;
                        if(Double.compare((var79 * var79 + var55 * var55) * (double)this.d[var46 - 1] + var59 * var59 / 6.0D, 1.0D) < 0) {
                           net.yw.n var61 = var5.b(var43, var46, var47);
                           if(var61.Q() == net.nb.f.p) {
                              var57 = true;
                           }

                           if(var61.Q() == net.nb.f.oy || var61.Q() == net.nb.f.dl || var61.Q() == net.nb.f.p) {
                              if(var46 - 1 < 10) {
                                 var5.Q(var43, var46, var47, n);
                              }

                              var5.Q(var43, var46, var47, E);
                           }
                        }

                        int var58 = var46 - 1;
                     }

                     int var54 = var47 + 1;
                  }

                  int var77 = var43 + 1;
               }
            }
         }

         ++var15;
      }

   }

   protected void S(r var1, int var2, int var3, int var4, int var5, o var6) {
      if(this.N.nextInt(50) == 0) {
         double var7 = (double)(var2 * 16 + this.N.nextInt(16));
         double var9 = (double)(this.N.nextInt(this.N.nextInt(40) + 8) + 20);
         double var11 = (double)(var3 * 16 + this.N.nextInt(16));
         boolean var10000 = true;
         int var14 = 0;

         while(true) {
            float var15 = this.N.nextFloat() * 6.2831855F;
            float var16 = (this.N.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var17 = (this.N.nextFloat() * 2.0F + this.N.nextFloat()) * 2.0F;
            this.E(this.N.nextLong(), var4, var5, var6, var7, var9, var11, var17, var15, var16, 0, 0, 3.0D);
            ++var14;
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
