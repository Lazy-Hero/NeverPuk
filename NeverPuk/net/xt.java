package net;

import net.df;
import net.oz;
import net.uv;
import net.xn;
import net.cy.b;
import net.u.t;

public class xt extends b {
   private static final xt y = new xt();
   float[] j = new float[6];
   float[][] H = new float[10][4];
   int C;
   float[] I = new float[16];
   float[] L = new float[4];

   public boolean r(double var1, double var3, double var5, double var7, double var9, double var11) {
      for(int var13 = 0; var13 < this.C; ++var13) {
         float[] var14 = this.H[var13];
         if(this.h(var14, var1, var3, var5) <= 0.0D && this.h(var14, var7, var3, var5) <= 0.0D && this.h(var14, var1, var9, var5) <= 0.0D && this.h(var14, var7, var9, var5) <= 0.0D && this.h(var14, var1, var3, var11) <= 0.0D && this.h(var14, var7, var3, var11) <= 0.0D && this.h(var14, var1, var9, var11) <= 0.0D && this.h(var14, var7, var9, var11) <= 0.0D) {
            return false;
         }
      }

      return true;
   }

   private double h(float[] var1, double var2, double var4, double var6) {
      return (double)var1[0] * var2 + (double)var1[1] * var4 + (double)var1[2] * var6 + (double)var1[3];
   }

   private double I(float[] var1, float[] var2) {
      return (double)var1[0] * (double)var2[0] + (double)var1[1] * (double)var2[1] + (double)var1[2] * (double)var2[2];
   }

   public static b Y() {
      y.K();
      return y;
   }

   private void x(float[] var1) {
      float var2 = t.g(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2]);
      var1[0] /= var2;
      var1[1] /= var2;
      var1[2] /= var2;
      var1[3] /= var2;
   }

   private void V(float[] var1) {
      float var2 = t.g(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2]);
      if(var2 == 0.0F) {
         var2 = 1.0F;
      }

      var1[0] /= var2;
      var1[1] /= var2;
      var1[2] /= var2;
   }

   private void M(float[] var1, float var2, float var3, float var4, float var5) {
      float var6 = (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = var2 / var6;
      var1[1] = var3 / var6;
      var1[2] = var4 / var6;
      var1[3] = var5 / var6;
   }

   private void m(float[] var1, float[] var2) {
      var1[0] = var2[0];
      var1[1] = var2[1];
      var1[2] = var2[2];
      var1[3] = var2[3];
   }

   private void p(float[] var1, float[] var2, float[] var3) {
      var1[0] = var2[1] * var3[2] - var2[2] * var3[1];
      var1[1] = var2[2] * var3[0] - var2[0] * var3[2];
      var1[2] = var2[0] * var3[1] - var2[1] * var3[0];
   }

   private void p(float[] var1) {
      this.m(this.H[this.C++], var1);
   }

   private float u(float var1, float var2, float var3) {
      return (float)Math.sqrt((double)(var1 * var1 + var2 * var2 + var3 * var3));
   }

   private float g(float var1, float var2, float var3, float var4, float var5, float var6) {
      return this.u(var1 - var4, var2 - var5, var3 - var6);
   }

   private void h(float[] var1, float[] var2, float[] var3, float[] var4) {
      this.p(this.L, var2, var3);
      this.p(var1, this.L, var4);
      this.V(var1);
      float var5 = (float)this.I(var2, var3);
      float var6 = (float)this.I(var1, var3);
      float var7 = this.g(var1[0], var1[1], var1[2], var3[0] * var6, var3[1] * var6, var3[2] * var6);
      float var8 = this.g(var2[0], var2[1], var2[2], var3[0] * var5, var3[1] * var5, var3[2] * var5);
      float var9 = var7 / var8;
      float var10 = (float)this.I(var1, var2);
      float var11 = this.g(var1[0], var1[1], var1[2], var2[0] * var10, var2[1] * var10, var2[2] * var10);
      float var12 = this.g(var3[0], var3[1], var3[2], var2[0] * var5, var2[1] * var5, var2[2] * var5);
      float var13 = var11 / var12;
      var1[3] = var2[3] * var9 + var3[3] * var13;
   }

   public void K() {
      uv.l();
      float[] var2 = this.u;
      float[] var3 = this.X;
      float[] var4 = this.U;
      System.arraycopy(oz.ES, 0, var2, 0, 16);
      System.arraycopy(oz.k, 0, var3, 0, 16);
      df.L(var4, var3, var2);
      this.M(this.q[0], var4[3] - var4[0], var4[7] - var4[4], var4[11] - var4[8], var4[15] - var4[12]);
      this.M(this.q[1], var4[3] + var4[0], var4[7] + var4[4], var4[11] + var4[8], var4[15] + var4[12]);
      this.M(this.q[2], var4[3] + var4[1], var4[7] + var4[5], var4[11] + var4[9], var4[15] + var4[13]);
      this.M(this.q[3], var4[3] - var4[1], var4[7] - var4[5], var4[11] - var4[9], var4[15] - var4[13]);
      this.M(this.q[4], var4[3] - var4[2], var4[7] - var4[6], var4[11] - var4[10], var4[15] - var4[14]);
      this.M(this.q[5], var4[3] + var4[2], var4[7] + var4[6], var4[11] + var4[10], var4[15] + var4[14]);
      float[] var5 = oz.KL;
      float var6 = (float)this.I(this.q[0], var5);
      float var7 = (float)this.I(this.q[1], var5);
      float var8 = (float)this.I(this.q[2], var5);
      float var9 = (float)this.I(this.q[3], var5);
      float var10 = (float)this.I(this.q[4], var5);
      float var11 = (float)this.I(this.q[5], var5);
      this.C = 0;
      if(Float.compare(var6, 0.0F) >= 0) {
         this.m(this.H[this.C++], this.q[0]);
         if(Float.compare(var6, 0.0F) > 0) {
            if(Float.compare(var8, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[0], this.q[2], var5);
            }

            if(Float.compare(var9, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[0], this.q[3], var5);
            }

            if(Float.compare(var10, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[0], this.q[4], var5);
            }

            if(Float.compare(var11, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[0], this.q[5], var5);
            }
         }
      }

      if(Float.compare(var7, 0.0F) >= 0) {
         this.m(this.H[this.C++], this.q[1]);
         if(Float.compare(var7, 0.0F) > 0) {
            if(Float.compare(var8, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[1], this.q[2], var5);
            }

            if(Float.compare(var9, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[1], this.q[3], var5);
            }

            if(Float.compare(var10, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[1], this.q[4], var5);
            }

            if(Float.compare(var11, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[1], this.q[5], var5);
            }
         }
      }

      if(Float.compare(var8, 0.0F) >= 0) {
         this.m(this.H[this.C++], this.q[2]);
         if(Float.compare(var8, 0.0F) > 0) {
            if(Float.compare(var6, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[2], this.q[0], var5);
            }

            if(Float.compare(var7, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[2], this.q[1], var5);
            }

            if(Float.compare(var10, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[2], this.q[4], var5);
            }

            if(Float.compare(var11, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[2], this.q[5], var5);
            }
         }
      }

      if(Float.compare(var9, 0.0F) >= 0) {
         this.m(this.H[this.C++], this.q[3]);
         if(Float.compare(var9, 0.0F) > 0) {
            if(Float.compare(var6, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[3], this.q[0], var5);
            }

            if(Float.compare(var7, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[3], this.q[1], var5);
            }

            if(Float.compare(var10, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[3], this.q[4], var5);
            }

            if(Float.compare(var11, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[3], this.q[5], var5);
            }
         }
      }

      if(Float.compare(var10, 0.0F) >= 0) {
         this.m(this.H[this.C++], this.q[4]);
         if(Float.compare(var10, 0.0F) > 0) {
            if(Float.compare(var6, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[4], this.q[0], var5);
            }

            if(Float.compare(var7, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[4], this.q[1], var5);
            }

            if(Float.compare(var8, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[4], this.q[2], var5);
            }

            if(Float.compare(var9, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[4], this.q[3], var5);
            }
         }
      }

      if(Float.compare(var11, 0.0F) >= 0) {
         this.m(this.H[this.C++], this.q[5]);
         if(var11 > 0.0F) {
            if(var6 < 0.0F) {
               this.h(this.H[this.C++], this.q[5], this.q[0], var5);
            }

            if(Float.compare(var7, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[5], this.q[1], var5);
            }

            if(Float.compare(var8, 0.0F) < 0) {
               this.h(this.H[this.C++], this.q[5], this.q[2], var5);
            }

            if(var9 < 0.0F) {
               this.h(this.H[this.C++], this.q[5], this.q[3], var5);
            }
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
