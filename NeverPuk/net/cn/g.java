package net.cn;

import com.google.common.base.MoreObjects;
import java.util.Random;
import net.xn;
import net.cn.w;
import net.l.o;
import net.u.j;
import net.yv.r;

public class g extends w {
   protected static final net.yw.n s = net.nb.f.TL.p();
   protected static final net.yw.n K = net.nb.f.ou.p();
   protected static final net.yw.n O = net.nb.f.ul.p();
   protected static final net.yw.n G = net.nb.f.Tj.p();

   protected void I(long var1, int var3, int var4, o var5, double var6, double var8, double var10) {
      this.o(var1, var3, var4, var5, var6, var8, var10, 1.0F + this.N.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5D);
   }

   protected void o(long var1, int var3, int var4, o var5, double var6, double var8, double var10, float var12, float var13, float var14, int var15, int var16, double var17) {
      w.a();
      double var20 = (double)(var3 * 16 + 8);
      double var22 = (double)(var4 * 16 + 8);
      float var24 = 0.0F;
      float var25 = 0.0F;
      Random var26 = new Random(var1);
      if(var16 <= 0) {
         int var27 = this.o * 16 - 16;
         var16 = var27 - var26.nextInt(var27 / 4);
      }

      boolean var74 = false;
      if(var15 == -1) {
         var15 = var16 / 2;
         var74 = true;
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
         if(var15 == var28 && Float.compare(var12, 1.0F) > 0 && var16 > 0) {
            this.o(var26.nextLong(), var3, var4, var5, var6, var8, var10, var26.nextFloat() * 0.5F + 0.5F, var13 - 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
            this.o(var26.nextLong(), var3, var4, var5, var6, var8, var10, var26.nextFloat() * 0.5F + 0.5F, var13 + 1.5707964F, var14 / 3.0F, var15, var16, 1.0D);
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

               if(var47 > 248) {
                  var47 = 248;
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
                        if(var53 >= 0 && var53 < 256) {
                           net.yw.n var54 = var5.b(var44, var53, var48);
                           if(var54.Q() == net.nb.f.dy || var54.Q() == net.nb.f.uM) {
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

               j.v var77 = new j.v();
               if(var44 < var45) {
                  double var80 = ((double)(var44 + var3 * 16) + 0.5D - var6) / var30;
                  if(var48 < var49) {
                     double var56 = ((double)(var48 + var4 * 16) + 0.5D - var10) / var30;
                     boolean var58 = false;
                     if(Double.compare(var80 * var80 + var56 * var56, 1.0D) < 0 && var47 > var46) {
                        double var60 = ((double)(var47 - 1) + 0.5D - var8) / var32;
                        if(Double.compare(var60, -0.7D) > 0 && var80 * var80 + var60 * var60 + var56 * var56 < 1.0D) {
                           net.yw.n var62 = var5.b(var44, var47, var48);
                           net.yw.n var63 = (net.yw.n)MoreObjects.firstNonNull(var5.b(var44, var47 + 1, var48), K);
                           if(var62.Q() == net.nb.f.p || var62.Q() == net.nb.f.u2) {
                              var58 = true;
                           }

                           if(this.I(var62, var63)) {
                              if(var47 - 1 < 10) {
                                 var5.Q(var44, var47, var48, s);
                              }

                              var5.Q(var44, var47, var48, K);
                              if(var5.b(var44, var47 - 1, var48).Q() == net.nb.f.dl) {
                                 var77.V(var44 + var3 * 16, 0, var48 + var4 * 16);
                                 var5.Q(var44, var47 - 1, var48, this.Q.P(var77).j.Q().p());
                              }
                           }
                        }

                        int var59 = var47 - 1;
                     }

                     int var55 = var48 + 1;
                  }

                  int var78 = var44 + 1;
               }
            }
         }

         ++var15;
      }

   }

   protected boolean I(net.yw.n var1, net.yw.n var2) {
      return var1.Q() == net.nb.f.oy?true:(var1.Q() == net.nb.f.dl?true:(var1.Q() == net.nb.f.p?true:(var1.Q() == net.nb.f.oY?true:(var1.Q() == net.nb.f.Ty?true:(var1.Q() == net.nb.f.ul?true:(var1.Q() == net.nb.f.Tj?true:(var1.Q() == net.nb.f.u2?true:(var1.Q() == net.nb.f.Tl?true:(var1.Q() == net.nb.f.TF || var1.Q() == net.nb.f.D) && var2.n() != net.y1.l.p))))))));
   }

   protected void S(r var1, int var2, int var3, int var4, int var5, o var6) {
      int var7 = this.N.nextInt(this.N.nextInt(this.N.nextInt(15) + 1) + 1);
      if(this.N.nextInt(7) != 0) {
         var7 = 0;
      }

      byte var8 = 0;
      if(var8 < var7) {
         double var9 = (double)(var2 * 16 + this.N.nextInt(16));
         double var11 = (double)this.N.nextInt(this.N.nextInt(120) + 8);
         double var13 = (double)(var3 * 16 + this.N.nextInt(16));
         int var15 = 1;
         if(this.N.nextInt(4) == 0) {
            this.I(this.N.nextLong(), var4, var5, var6, var9, var11, var13);
            var15 = var15 + this.N.nextInt(4);
         }

         int var16 = 0;

         while(true) {
            float var17 = this.N.nextFloat() * 6.2831855F;
            float var18 = (this.N.nextFloat() - 0.5F) * 2.0F / 8.0F;
            float var19 = this.N.nextFloat() * 2.0F + this.N.nextFloat();
            if(this.N.nextInt(10) == 0) {
               var19 *= this.N.nextFloat() * this.N.nextFloat() * 3.0F + 1.0F;
            }

            this.o(this.N.nextLong(), var4, var5, var6, var9, var11, var13, var19, var17, var18, 0, 0, 1.0D);
            ++var16;
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
