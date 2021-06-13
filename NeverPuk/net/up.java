package net;

import java.io.Serializable;
import net._w;
import net.bd;
import net.br;
import net.mt;
import net.ok;
import net.ra;
import net.rk;
import net.uo;
import net.we;
import net.xn;

public class up extends uo implements Serializable {
   static final long serialVersionUID = 7577479888820201099L;
   static final double H = 1.0E-12D;
   static final double K = 1.0E-3D;
   static final double S = 1.57079632679D;

   public up(double var1, double var3, double var5, double var7) {
      double var9 = 1.0D / Math.sqrt(var1 * var1 + var3 * var3 + var5 * var5 + var7 * var7);
      this.M = var1 * var9;
      this.b = var3 * var9;
      this.G = var5 * var9;
      this.d = var7 * var9;
   }

   public up(double[] var1) {
      double var2 = 1.0D / Math.sqrt(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2] + var1[3] * var1[3]);
      this.M = var1[0] * var2;
      this.b = var1[1] * var2;
      this.G = var1[2] * var2;
      this.d = var1[3] * var2;
   }

   public up(up var1) {
      super((uo)var1);
   }

   public up(rk var1) {
      super((ra)var1);
   }

   public up(ra var1) {
      double var2 = 1.0D / Math.sqrt((double)(var1.j * var1.j + var1.v * var1.v + var1.M * var1.M + var1.U * var1.U));
      this.M = (double)var1.j * var2;
      this.b = (double)var1.v * var2;
      this.G = (double)var1.M * var2;
      this.d = (double)var1.U * var2;
   }

   public up(uo var1) {
      double var2 = 1.0D / Math.sqrt(var1.M * var1.M + var1.b * var1.b + var1.G * var1.G + var1.d * var1.d);
      this.M = var1.M * var2;
      this.b = var1.b * var2;
      this.G = var1.G * var2;
      this.d = var1.d * var2;
   }

   public up() {
   }

   public final void D(up var1) {
      this.M = -var1.M;
      this.b = -var1.b;
      this.G = -var1.G;
      this.d = var1.d;
   }

   public final void E() {
      this.M = -this.M;
      this.b = -this.b;
      this.G = -this.G;
   }

   public final void c(up var1, up var2) {
      String[] var3 = ra.C();
      if(this != var1 && this != var2) {
         this.d = var1.d * var2.d - var1.M * var2.M - var1.b * var2.b - var1.G * var2.G;
         this.M = var1.d * var2.M + var2.d * var1.M + var1.b * var2.G - var1.G * var2.b;
         this.b = var1.d * var2.b + var2.d * var1.b - var1.M * var2.G + var1.G * var2.M;
         this.G = var1.d * var2.G + var2.d * var1.G + var1.M * var2.b - var1.b * var2.M;
      }

      double var8 = var1.d * var2.d - var1.M * var2.M - var1.b * var2.b - var1.G * var2.G;
      double var4 = var1.d * var2.M + var2.d * var1.M + var1.b * var2.G - var1.G * var2.b;
      double var6 = var1.d * var2.b + var2.d * var1.b - var1.M * var2.G + var1.G * var2.M;
      this.G = var1.d * var2.G + var2.d * var1.G + var1.M * var2.b - var1.b * var2.M;
      this.d = var8;
      this.M = var4;
      this.b = var6;
   }

   public final void a(up var1) {
      double var6 = this.d * var1.d - this.M * var1.M - this.b * var1.b - this.G * var1.G;
      double var2 = this.d * var1.M + var1.d * this.M + this.b * var1.G - this.G * var1.b;
      double var4 = this.d * var1.b + var1.d * this.b - this.M * var1.G + this.G * var1.M;
      this.G = this.d * var1.G + var1.d * this.G + this.M * var1.b - this.b * var1.M;
      this.d = var6;
      this.M = var2;
      this.b = var4;
   }

   public final void W(up var1, up var2) {
      up var3 = new up(var2);
      var3.H();
      this.c(var1, var3);
   }

   public final void B(up var1) {
      up var2 = new up(var1);
      var2.H();
      this.a(var2);
   }

   public final void E(up var1) {
      double var2 = 1.0D / (var1.d * var1.d + var1.M * var1.M + var1.b * var1.b + var1.G * var1.G);
      this.d = var2 * var1.d;
      this.M = -var2 * var1.M;
      this.b = -var2 * var1.b;
      this.G = -var2 * var1.G;
   }

   public final void H() {
      double var1 = 1.0D / (this.d * this.d + this.M * this.M + this.b * this.b + this.G * this.G);
      this.d *= var1;
      this.M *= -var1;
      this.b *= -var1;
      this.G *= -var1;
   }

   public final void i(up var1) {
      double var2 = var1.M * var1.M + var1.b * var1.b + var1.G * var1.G + var1.d * var1.d;
      if(var2 > 0.0D) {
         var2 = 1.0D / Math.sqrt(var2);
         this.M = var2 * var1.M;
         this.b = var2 * var1.b;
         this.G = var2 * var1.G;
         this.d = var2 * var1.d;
      } else {
         this.M = 0.0D;
         this.b = 0.0D;
         this.G = 0.0D;
         this.d = 0.0D;
      }

   }

   public final void I() {
      double var1 = this.M * this.M + this.b * this.b + this.G * this.G + this.d * this.d;
      if(var1 > 0.0D) {
         var1 = 1.0D / Math.sqrt(var1);
         this.M *= var1;
         this.b *= var1;
         this.G *= var1;
         this.d *= var1;
      } else {
         this.M = 0.0D;
         this.b = 0.0D;
         this.G = 0.0D;
         this.d = 0.0D;
      }

   }

   public final void q(bd var1) {
      double var2 = 0.25D * (double)(var1.i + var1.a + var1.y + var1.S);
      if(var2 >= 0.0D) {
         if(var2 >= 1.0E-3D) {
            this.d = Math.sqrt(var2);
            var2 = 0.25D / this.d;
            this.M = (double)(var1.G - var1.k) * var2;
            this.b = (double)(var1.R - var1.b) * var2;
            this.G = (double)(var1.M - var1.z) * var2;
         } else {
            this.d = 0.0D;
            var2 = -0.5D * (double)(var1.a + var1.y);
            if(var2 >= 0.0D) {
               if(var2 >= 1.0E-3D) {
                  this.M = Math.sqrt(var2);
                  var2 = 1.0D / (2.0D * this.M);
                  this.b = (double)var1.M * var2;
                  this.G = (double)var1.b * var2;
               } else {
                  this.M = 0.0D;
                  var2 = 0.5D * (1.0D - (double)var1.y);
                  if(var2 >= 1.0E-3D) {
                     this.b = Math.sqrt(var2);
                     this.G = (double)var1.G / (2.0D * this.b);
                  } else {
                     this.b = 0.0D;
                     this.G = 1.0D;
                  }
               }
            } else {
               this.M = 0.0D;
               this.b = 0.0D;
               this.G = 1.0D;
            }
         }
      } else {
         this.d = 0.0D;
         this.M = 0.0D;
         this.b = 0.0D;
         this.G = 1.0D;
      }
   }

   public final void Y(we var1) {
      double var2 = 0.25D * (var1.M + var1.o + var1.j + var1.O);
      if(var2 >= 0.0D) {
         if(var2 >= 1.0E-3D) {
            this.d = Math.sqrt(var2);
            var2 = 0.25D / this.d;
            this.M = (var1.i - var1.g) * var2;
            this.b = (var1.l - var1.T) * var2;
            this.G = (var1.h - var1.W) * var2;
         } else {
            this.d = 0.0D;
            var2 = -0.5D * (var1.o + var1.j);
            if(var2 >= 0.0D) {
               if(var2 >= 1.0E-3D) {
                  this.M = Math.sqrt(var2);
                  var2 = 0.5D / this.M;
                  this.b = var1.h * var2;
                  this.G = var1.T * var2;
               } else {
                  this.M = 0.0D;
                  var2 = 0.5D * (1.0D - var1.j);
                  if(var2 >= 1.0E-3D) {
                     this.b = Math.sqrt(var2);
                     this.G = var1.i / (2.0D * this.b);
                  } else {
                     this.b = 0.0D;
                     this.G = 1.0D;
                  }
               }
            } else {
               this.M = 0.0D;
               this.b = 0.0D;
               this.G = 1.0D;
            }
         }
      } else {
         this.d = 0.0D;
         this.M = 0.0D;
         this.b = 0.0D;
         this.G = 1.0D;
      }
   }

   public final void F(br var1) {
      double var2 = 0.25D * ((double)(var1.y + var1.Q + var1.t) + 1.0D);
      if(var2 >= 0.0D) {
         if(var2 >= 1.0E-3D) {
            this.d = Math.sqrt(var2);
            var2 = 0.25D / this.d;
            this.M = (double)(var1.m - var1.D) * var2;
            this.b = (double)(var1.q - var1.x) * var2;
            this.G = (double)(var1.e - var1.H) * var2;
         } else {
            this.d = 0.0D;
            var2 = -0.5D * (double)(var1.Q + var1.t);
            if(var2 >= 0.0D) {
               if(var2 >= 1.0E-3D) {
                  this.M = Math.sqrt(var2);
                  var2 = 0.5D / this.M;
                  this.b = (double)var1.e * var2;
                  this.G = (double)var1.x * var2;
               } else {
                  this.M = 0.0D;
                  var2 = 0.5D * (1.0D - (double)var1.t);
                  if(var2 >= 1.0E-3D) {
                     this.b = Math.sqrt(var2);
                     this.G = (double)var1.m / (2.0D * this.b);
                  }

                  this.b = 0.0D;
                  this.G = 1.0D;
               }
            } else {
               this.M = 0.0D;
               this.b = 0.0D;
               this.G = 1.0D;
            }
         }
      } else {
         this.d = 0.0D;
         this.M = 0.0D;
         this.b = 0.0D;
         this.G = 1.0D;
      }
   }

   public final void S(_w var1) {
      double var2 = 0.25D * (var1.u + var1.v + var1.l + 1.0D);
      if(var2 >= 0.0D) {
         if(var2 >= 1.0E-3D) {
            this.d = Math.sqrt(var2);
            var2 = 0.25D / this.d;
            this.M = (var1.q - var1.P) * var2;
            this.b = (var1.M - var1.Z) * var2;
            this.G = (var1.p - var1.n) * var2;
         } else {
            this.d = 0.0D;
            var2 = -0.5D * (var1.v + var1.l);
            if(var2 >= 0.0D) {
               if(var2 >= 1.0E-3D) {
                  this.M = Math.sqrt(var2);
                  var2 = 0.5D / this.M;
                  this.b = var1.p * var2;
                  this.G = var1.Z * var2;
               } else {
                  this.M = 0.0D;
                  var2 = 0.5D * (1.0D - var1.l);
                  if(var2 >= 1.0E-3D) {
                     this.b = Math.sqrt(var2);
                     this.G = var1.q / (2.0D * this.b);
                  } else {
                     this.b = 0.0D;
                     this.G = 1.0D;
                  }
               }
            } else {
               this.M = 0.0D;
               this.b = 0.0D;
               this.G = 1.0D;
            }
         }
      } else {
         this.d = 0.0D;
         this.M = 0.0D;
         this.b = 0.0D;
         this.G = 1.0D;
      }
   }

   public final void T(ok var1) {
      double var4 = Math.sqrt((double)(var1.y * var1.y + var1.D * var1.D + var1.U * var1.U));
      if(var4 < 1.0E-12D) {
         this.d = 0.0D;
         this.M = 0.0D;
         this.b = 0.0D;
         this.G = 0.0D;
      } else {
         double var2 = Math.sin((double)var1.k / 2.0D);
         var4 = 1.0D / var4;
         this.d = Math.cos((double)var1.k / 2.0D);
         this.M = (double)var1.y * var4 * var2;
         this.b = (double)var1.D * var4 * var2;
         this.G = (double)var1.U * var4 * var2;
      }

   }

   public final void m(mt var1) {
      double var4 = Math.sqrt(var1.b * var1.b + var1.C * var1.C + var1.L * var1.L);
      if(var4 < 1.0E-12D) {
         this.d = 0.0D;
         this.M = 0.0D;
         this.b = 0.0D;
         this.G = 0.0D;
      } else {
         var4 = 1.0D / var4;
         double var2 = Math.sin(var1.m / 2.0D);
         this.d = Math.cos(var1.m / 2.0D);
         this.M = var1.b * var4 * var2;
         this.b = var1.C * var4 * var2;
         this.G = var1.L * var4 * var2;
      }

   }

   public final void n(up var1, double var2) {
      double var4 = this.M * var1.M + this.b * var1.b + this.G * var1.G + this.d * var1.d;
      if(var4 < 0.0D) {
         var1.M = -var1.M;
         var1.b = -var1.b;
         var1.G = -var1.G;
         var1.d = -var1.d;
         var4 = -var4;
      }

      double var6;
      double var8;
      if(1.0D - var4 > 1.0E-12D) {
         double var10 = Math.acos(var4);
         double var12 = Math.sin(var10);
         var6 = Math.sin((1.0D - var2) * var10) / var12;
         var8 = Math.sin(var2 * var10) / var12;
      } else {
         var6 = 1.0D - var2;
         var8 = var2;
      }

      this.d = var6 * this.d + var8 * var1.d;
      this.M = var6 * this.M + var8 * var1.M;
      this.b = var6 * this.b + var8 * var1.b;
      this.G = var6 * this.G + var8 * var1.G;
   }

   public final void x(up var1, up var2, double var3) {
      double var5 = var2.M * var1.M + var2.b * var1.b + var2.G * var1.G + var2.d * var1.d;
      if(var5 < 0.0D) {
         var1.M = -var1.M;
         var1.b = -var1.b;
         var1.G = -var1.G;
         var1.d = -var1.d;
         var5 = -var5;
      }

      double var7;
      double var9;
      if(1.0D - var5 > 1.0E-12D) {
         double var11 = Math.acos(var5);
         double var13 = Math.sin(var11);
         var7 = Math.sin((1.0D - var3) * var11) / var13;
         var9 = Math.sin(var3 * var11) / var13;
      } else {
         var7 = 1.0D - var3;
         var9 = var3;
      }

      this.d = var7 * var1.d + var9 * var2.d;
      this.M = var7 * var1.M + var9 * var2.M;
      this.b = var7 * var1.b + var9 * var2.b;
      this.G = var7 * var1.G + var9 * var2.G;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
