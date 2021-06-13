package net;

import java.io.Serializable;
import net._w;
import net.bd;
import net.br;
import net.mt;
import net.ok;
import net.ra;
import net.uo;
import net.up;
import net.we;
import net.xn;

public class rk extends ra implements Serializable {
   static final long serialVersionUID = 2675933778405442383L;
   static final double Z = 1.0E-6D;
   static final double E = 1.0E-3D;
   static final double B = 1.57079632679D;

   public rk(float var1, float var2, float var3, float var4) {
      float var5 = (float)(1.0D / Math.sqrt((double)(var1 * var1 + var2 * var2 + var3 * var3 + var4 * var4)));
      this.j = var1 * var5;
      this.v = var2 * var5;
      this.M = var3 * var5;
      this.U = var4 * var5;
   }

   public rk(float[] var1) {
      float var2 = (float)(1.0D / Math.sqrt((double)(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2] + var1[3] * var1[3])));
      this.j = var1[0] * var2;
      this.v = var1[1] * var2;
      this.M = var1[2] * var2;
      this.U = var1[3] * var2;
   }

   public rk(rk var1) {
      super((ra)var1);
   }

   public rk(up var1) {
      super((uo)var1);
   }

   public rk(ra var1) {
      float var2 = (float)(1.0D / Math.sqrt((double)(var1.j * var1.j + var1.v * var1.v + var1.M * var1.M + var1.U * var1.U)));
      this.j = var1.j * var2;
      this.v = var1.v * var2;
      this.M = var1.M * var2;
      this.U = var1.U * var2;
   }

   public rk(uo var1) {
      double var2 = 1.0D / Math.sqrt(var1.M * var1.M + var1.b * var1.b + var1.G * var1.G + var1.d * var1.d);
      this.j = (float)(var1.M * var2);
      this.v = (float)(var1.b * var2);
      this.M = (float)(var1.G * var2);
      this.U = (float)(var1.d * var2);
   }

   public rk() {
   }

   public final void u(rk var1) {
      this.j = -var1.j;
      this.v = -var1.v;
      this.M = -var1.M;
      this.U = var1.U;
   }

   public final void j() {
      this.j = -this.j;
      this.v = -this.v;
      this.M = -this.M;
   }

   public final void v(rk var1, rk var2) {
      String[] var3 = ra.C();
      if(this != var1 && this != var2) {
         this.U = var1.U * var2.U - var1.j * var2.j - var1.v * var2.v - var1.M * var2.M;
         this.j = var1.U * var2.j + var2.U * var1.j + var1.v * var2.M - var1.M * var2.v;
         this.v = var1.U * var2.v + var2.U * var1.v - var1.j * var2.M + var1.M * var2.j;
         this.M = var1.U * var2.M + var2.U * var1.M + var1.j * var2.v - var1.v * var2.j;
      }

      float var6 = var1.U * var2.U - var1.j * var2.j - var1.v * var2.v - var1.M * var2.M;
      float var4 = var1.U * var2.j + var2.U * var1.j + var1.v * var2.M - var1.M * var2.v;
      float var5 = var1.U * var2.v + var2.U * var1.v - var1.j * var2.M + var1.M * var2.j;
      this.M = var1.U * var2.M + var2.U * var1.M + var1.j * var2.v - var1.v * var2.j;
      this.U = var6;
      this.j = var4;
      this.v = var5;
   }

   public final void r(rk var1) {
      float var4 = this.U * var1.U - this.j * var1.j - this.v * var1.v - this.M * var1.M;
      float var2 = this.U * var1.j + var1.U * this.j + this.v * var1.M - this.M * var1.v;
      float var3 = this.U * var1.v + var1.U * this.v - this.j * var1.M + this.M * var1.j;
      this.M = this.U * var1.M + var1.U * this.M + this.j * var1.v - this.v * var1.j;
      this.U = var4;
      this.j = var2;
      this.v = var3;
   }

   public final void e(rk var1, rk var2) {
      rk var3 = new rk(var2);
      var3.K();
      this.v(var1, var3);
   }

   public final void w(rk var1) {
      rk var2 = new rk(var1);
      var2.K();
      this.r(var2);
   }

   public final void q(rk var1) {
      float var2 = 1.0F / (var1.U * var1.U + var1.j * var1.j + var1.v * var1.v + var1.M * var1.M);
      this.U = var2 * var1.U;
      this.j = -var2 * var1.j;
      this.v = -var2 * var1.v;
      this.M = -var2 * var1.M;
   }

   public final void K() {
      float var1 = 1.0F / (this.U * this.U + this.j * this.j + this.v * this.v + this.M * this.M);
      this.U *= var1;
      this.j *= -var1;
      this.v *= -var1;
      this.M *= -var1;
   }

   public final void N(rk var1) {
      float var2 = var1.j * var1.j + var1.v * var1.v + var1.M * var1.M + var1.U * var1.U;
      if(var2 > 0.0F) {
         var2 = 1.0F / (float)Math.sqrt((double)var2);
         this.j = var2 * var1.j;
         this.v = var2 * var1.v;
         this.M = var2 * var1.M;
         this.U = var2 * var1.U;
      } else {
         this.j = 0.0F;
         this.v = 0.0F;
         this.M = 0.0F;
         this.U = 0.0F;
      }

   }

   public final void i() {
      float var1 = this.j * this.j + this.v * this.v + this.M * this.M + this.U * this.U;
      if(var1 > 0.0F) {
         var1 = 1.0F / (float)Math.sqrt((double)var1);
         this.j *= var1;
         this.v *= var1;
         this.M *= var1;
         this.U *= var1;
      } else {
         this.j = 0.0F;
         this.v = 0.0F;
         this.M = 0.0F;
         this.U = 0.0F;
      }

   }

   public final void i(bd var1) {
      float var2 = 0.25F * (var1.i + var1.a + var1.y + var1.S);
      if(var2 >= 0.0F) {
         if((double)var2 >= 1.0E-3D) {
            this.U = (float)Math.sqrt((double)var2);
            var2 = 0.25F / this.U;
            this.j = (var1.G - var1.k) * var2;
            this.v = (var1.R - var1.b) * var2;
            this.M = (var1.M - var1.z) * var2;
         } else {
            this.U = 0.0F;
            var2 = -0.5F * (var1.a + var1.y);
            if(var2 >= 0.0F) {
               if((double)var2 >= 1.0E-3D) {
                  this.j = (float)Math.sqrt((double)var2);
                  var2 = 1.0F / (2.0F * this.j);
                  this.v = var1.M * var2;
                  this.M = var1.b * var2;
               } else {
                  this.j = 0.0F;
                  var2 = 0.5F * (1.0F - var1.y);
                  if((double)var2 >= 1.0E-3D) {
                     this.v = (float)Math.sqrt((double)var2);
                     this.M = var1.G / (2.0F * this.v);
                  } else {
                     this.v = 0.0F;
                     this.M = 1.0F;
                  }
               }
            } else {
               this.j = 0.0F;
               this.v = 0.0F;
               this.M = 1.0F;
            }
         }
      } else {
         this.U = 0.0F;
         this.j = 0.0F;
         this.v = 0.0F;
         this.M = 1.0F;
      }
   }

   public final void w(we var1) {
      double var2 = 0.25D * (var1.M + var1.o + var1.j + var1.O);
      if(var2 >= 0.0D) {
         if(var2 >= 1.0E-3D) {
            this.U = (float)Math.sqrt(var2);
            var2 = 0.25D / (double)this.U;
            this.j = (float)((var1.i - var1.g) * var2);
            this.v = (float)((var1.l - var1.T) * var2);
            this.M = (float)((var1.h - var1.W) * var2);
         } else {
            this.U = 0.0F;
            var2 = -0.5D * (var1.o + var1.j);
            if(var2 >= 0.0D) {
               if(var2 >= 1.0E-3D) {
                  this.j = (float)Math.sqrt(var2);
                  var2 = 0.5D / (double)this.j;
                  this.v = (float)(var1.h * var2);
                  this.M = (float)(var1.T * var2);
               } else {
                  this.j = 0.0F;
                  var2 = 0.5D * (1.0D - var1.j);
                  if(var2 >= 1.0E-3D) {
                     this.v = (float)Math.sqrt(var2);
                     this.M = (float)(var1.i / (2.0D * (double)this.v));
                  } else {
                     this.v = 0.0F;
                     this.M = 1.0F;
                  }
               }
            } else {
               this.j = 0.0F;
               this.v = 0.0F;
               this.M = 1.0F;
            }
         }
      } else {
         this.U = 0.0F;
         this.j = 0.0F;
         this.v = 0.0F;
         this.M = 1.0F;
      }
   }

   public final void R(br var1) {
      float var2 = 0.25F * (var1.y + var1.Q + var1.t + 1.0F);
      if(var2 >= 0.0F) {
         if((double)var2 >= 1.0E-3D) {
            this.U = (float)Math.sqrt((double)var2);
            var2 = 0.25F / this.U;
            this.j = (var1.m - var1.D) * var2;
            this.v = (var1.q - var1.x) * var2;
            this.M = (var1.e - var1.H) * var2;
         } else {
            this.U = 0.0F;
            var2 = -0.5F * (var1.Q + var1.t);
            if(var2 >= 0.0F) {
               if((double)var2 >= 1.0E-3D) {
                  this.j = (float)Math.sqrt((double)var2);
                  var2 = 0.5F / this.j;
                  this.v = var1.e * var2;
                  this.M = var1.x * var2;
               } else {
                  this.j = 0.0F;
                  var2 = 0.5F * (1.0F - var1.t);
                  if((double)var2 >= 1.0E-3D) {
                     this.v = (float)Math.sqrt((double)var2);
                     this.M = var1.m / (2.0F * this.v);
                  } else {
                     this.v = 0.0F;
                     this.M = 1.0F;
                  }
               }
            } else {
               this.j = 0.0F;
               this.v = 0.0F;
               this.M = 1.0F;
            }
         }
      } else {
         this.U = 0.0F;
         this.j = 0.0F;
         this.v = 0.0F;
         this.M = 1.0F;
      }
   }

   public final void y(_w var1) {
      double var2 = 0.25D * (var1.u + var1.v + var1.l + 1.0D);
      if(var2 >= 0.0D) {
         if(var2 >= 1.0E-3D) {
            this.U = (float)Math.sqrt(var2);
            var2 = 0.25D / (double)this.U;
            this.j = (float)((var1.q - var1.P) * var2);
            this.v = (float)((var1.M - var1.Z) * var2);
            this.M = (float)((var1.p - var1.n) * var2);
         } else {
            this.U = 0.0F;
            var2 = -0.5D * (var1.v + var1.l);
            if(var2 >= 0.0D) {
               if(var2 >= 1.0E-3D) {
                  this.j = (float)Math.sqrt(var2);
                  var2 = 0.5D / (double)this.j;
                  this.v = (float)(var1.p * var2);
                  this.M = (float)(var1.Z * var2);
               } else {
                  this.j = 0.0F;
                  var2 = 0.5D * (1.0D - var1.l);
                  if(var2 >= 1.0E-3D) {
                     this.v = (float)Math.sqrt(var2);
                     this.M = (float)(var1.q / (2.0D * (double)this.v));
                  } else {
                     this.v = 0.0F;
                     this.M = 1.0F;
                  }
               }
            } else {
               this.j = 0.0F;
               this.v = 0.0F;
               this.M = 1.0F;
            }
         }
      } else {
         this.U = 0.0F;
         this.j = 0.0F;
         this.v = 0.0F;
         this.M = 1.0F;
      }
   }

   public final void w(ok var1) {
      float var3 = (float)Math.sqrt((double)(var1.y * var1.y + var1.D * var1.D + var1.U * var1.U));
      if((double)var3 < 1.0E-6D) {
         this.U = 0.0F;
         this.j = 0.0F;
         this.v = 0.0F;
         this.M = 0.0F;
      } else {
         var3 = 1.0F / var3;
         float var2 = (float)Math.sin((double)var1.k / 2.0D);
         this.U = (float)Math.cos((double)var1.k / 2.0D);
         this.j = var1.y * var3 * var2;
         this.v = var1.D * var3 * var2;
         this.M = var1.U * var3 * var2;
      }

   }

   public final void f(mt var1) {
      float var3 = (float)(1.0D / Math.sqrt(var1.b * var1.b + var1.C * var1.C + var1.L * var1.L));
      if((double)var3 < 1.0E-6D) {
         this.U = 0.0F;
         this.j = 0.0F;
         this.v = 0.0F;
         this.M = 0.0F;
      } else {
         var3 = 1.0F / var3;
         float var2 = (float)Math.sin(var1.m / 2.0D);
         this.U = (float)Math.cos(var1.m / 2.0D);
         this.j = (float)var1.b * var3 * var2;
         this.v = (float)var1.C * var3 * var2;
         this.M = (float)var1.L * var3 * var2;
      }

   }

   public final void E(rk var1, float var2) {
      double var3 = (double)(this.j * var1.j + this.v * var1.v + this.M * var1.M + this.U * var1.U);
      if(var3 < 0.0D) {
         var1.j = -var1.j;
         var1.v = -var1.v;
         var1.M = -var1.M;
         var1.U = -var1.U;
         var3 = -var3;
      }

      double var5;
      double var7;
      if(1.0D - var3 > 1.0E-6D) {
         double var9 = Math.acos(var3);
         double var11 = Math.sin(var9);
         var5 = Math.sin((1.0D - (double)var2) * var9) / var11;
         var7 = Math.sin((double)var2 * var9) / var11;
      } else {
         var5 = 1.0D - (double)var2;
         var7 = (double)var2;
      }

      this.U = (float)(var5 * (double)this.U + var7 * (double)var1.U);
      this.j = (float)(var5 * (double)this.j + var7 * (double)var1.j);
      this.v = (float)(var5 * (double)this.v + var7 * (double)var1.v);
      this.M = (float)(var5 * (double)this.M + var7 * (double)var1.M);
   }

   public final void T(rk var1, rk var2, float var3) {
      double var4 = (double)(var2.j * var1.j + var2.v * var1.v + var2.M * var1.M + var2.U * var1.U);
      if(var4 < 0.0D) {
         var1.j = -var1.j;
         var1.v = -var1.v;
         var1.M = -var1.M;
         var1.U = -var1.U;
         var4 = -var4;
      }

      double var6;
      double var8;
      if(1.0D - var4 > 1.0E-6D) {
         double var10 = Math.acos(var4);
         double var12 = Math.sin(var10);
         var6 = Math.sin((1.0D - (double)var3) * var10) / var12;
         var8 = Math.sin((double)var3 * var10) / var12;
      } else {
         var6 = 1.0D - (double)var3;
         var8 = (double)var3;
      }

      this.U = (float)(var6 * (double)var1.U + var8 * (double)var2.U);
      this.j = (float)(var6 * (double)var1.j + var8 * (double)var2.j);
      this.v = (float)(var6 * (double)var1.v + var8 * (double)var2.v);
      this.M = (float)(var6 * (double)var1.M + var8 * (double)var2.M);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
