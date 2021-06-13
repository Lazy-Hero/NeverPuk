package net;

import java.io.Serializable;
import net._w;
import net.bc;
import net.bd;
import net.br;
import net.dm;
import net.op;
import net.ra;
import net.we;
import net.xn;
import net.zx;

public class _m implements Serializable, Cloneable {
   static final long serialVersionUID = 2777097312029690941L;
   private static final boolean Q = false;
   int u;
   int Z;
   double[][] d;
   private static final double k = 1.0E-1D;

   public _m(int var1, int var2) {
      this.d = new double[var1][var2];
      this.u = var1;
      this.Z = var2;

      for(int var3 = 0; var3 < var1; ++var3) {
         for(int var4 = 0; var4 < var2; ++var4) {
            this.d[var3][var4] = 0.0D;
         }
      }

      int var5;
      if(var1 < var2) {
         var5 = var1;
      } else {
         var5 = var2;
      }

      for(int var6 = 0; var6 < var5; ++var6) {
         this.d[var6][var6] = 1.0D;
      }

   }

   public _m(int var1, int var2, double[] var3) {
      this.d = new double[var1][var2];
      this.u = var1;
      this.Z = var2;

      for(int var4 = 0; var4 < var1; ++var4) {
         for(int var5 = 0; var5 < var2; ++var5) {
            this.d[var4][var5] = var3[var4 * var2 + var5];
         }
      }

   }

   public _m(_m var1) {
      this.u = var1.u;
      this.Z = var1.Z;
      this.d = new double[this.u][this.Z];

      for(int var2 = 0; var2 < this.u; ++var2) {
         for(int var3 = 0; var3 < this.Z; ++var3) {
            this.d[var2][var3] = var1.d[var2][var3];
         }
      }

   }

   public final void V(_m var1) {
      if(this.Z == var1.u && this.Z == var1.Z) {
         double[][] var5 = new double[this.u][this.Z];

         for(int var2 = 0; var2 < this.u; ++var2) {
            for(int var3 = 0; var3 < this.Z; ++var3) {
               var5[var2][var3] = 0.0D;

               for(int var4 = 0; var4 < this.Z; ++var4) {
                  var5[var2][var3] += this.d[var2][var4] * var1.d[var4][var3];
               }
            }
         }

         this.d = var5;
      } else {
         throw new dm(bc.I("GMatrix0"));
      }
   }

   public final void h(_m var1, _m var2) {
      if(var1.Z == var2.u && this.u == var1.u && this.Z == var2.Z) {
         double[][] var6 = new double[this.u][this.Z];

         for(int var3 = 0; var3 < var1.u; ++var3) {
            for(int var4 = 0; var4 < var2.Z; ++var4) {
               var6[var3][var4] = 0.0D;

               for(int var5 = 0; var5 < var1.Z; ++var5) {
                  var6[var3][var4] += var1.d[var3][var5] * var2.d[var5][var4];
               }
            }
         }

         this.d = var6;
      } else {
         throw new dm(bc.I("GMatrix1"));
      }
   }

   public final void N(zx var1, zx var2) {
      if(this.u < var1.K()) {
         throw new dm(bc.I("GMatrix2"));
      } else if(this.Z < var2.K()) {
         throw new dm(bc.I("GMatrix3"));
      } else {
         for(int var3 = 0; var3 < var1.K(); ++var3) {
            for(int var4 = 0; var4 < var2.K(); ++var4) {
               this.d[var3][var4] = var1.K[var3] * var2.K[var4];
            }
         }

      }
   }

   public final void a(_m var1) {
      if(this.u != var1.u) {
         throw new dm(bc.I("GMatrix4"));
      } else if(this.Z != var1.Z) {
         throw new dm(bc.I("GMatrix5"));
      } else {
         for(int var2 = 0; var2 < this.u; ++var2) {
            for(int var3 = 0; var3 < this.Z; ++var3) {
               this.d[var2][var3] += var1.d[var2][var3];
            }
         }

      }
   }

   public final void W(_m var1, _m var2) {
      if(var2.u != var1.u) {
         throw new dm(bc.I("GMatrix6"));
      } else if(var2.Z != var1.Z) {
         throw new dm(bc.I("GMatrix7"));
      } else if(this.Z == var1.Z && this.u == var1.u) {
         for(int var3 = 0; var3 < this.u; ++var3) {
            for(int var4 = 0; var4 < this.Z; ++var4) {
               this.d[var3][var4] = var1.d[var3][var4] + var2.d[var3][var4];
            }
         }

      } else {
         throw new dm(bc.I("GMatrix8"));
      }
   }

   public final void u(_m var1) {
      if(this.u != var1.u) {
         throw new dm(bc.I("GMatrix9"));
      } else if(this.Z != var1.Z) {
         throw new dm(bc.I("GMatrix28"));
      } else {
         for(int var2 = 0; var2 < this.u; ++var2) {
            for(int var3 = 0; var3 < this.Z; ++var3) {
               this.d[var2][var3] -= var1.d[var2][var3];
            }
         }

      }
   }

   public final void c(_m var1, _m var2) {
      if(var2.u != var1.u) {
         throw new dm(bc.I("GMatrix10"));
      } else if(var2.Z != var1.Z) {
         throw new dm(bc.I("GMatrix11"));
      } else if(this.u == var1.u && this.Z == var1.Z) {
         for(int var3 = 0; var3 < this.u; ++var3) {
            for(int var4 = 0; var4 < this.Z; ++var4) {
               this.d[var3][var4] = var1.d[var3][var4] - var2.d[var3][var4];
            }
         }

      } else {
         throw new dm(bc.I("GMatrix12"));
      }
   }

   public final void x() {
      for(int var1 = 0; var1 < this.u; ++var1) {
         for(int var2 = 0; var2 < this.Z; ++var2) {
            this.d[var1][var2] = -this.d[var1][var2];
         }
      }

   }

   public final void e(_m var1) {
      if(this.u == var1.u && this.Z == var1.Z) {
         for(int var2 = 0; var2 < this.u; ++var2) {
            for(int var3 = 0; var3 < this.Z; ++var3) {
               this.d[var2][var3] = -var1.d[var2][var3];
            }
         }

      } else {
         throw new dm(bc.I("GMatrix13"));
      }
   }

   public final void T() {
      for(int var1 = 0; var1 < this.u; ++var1) {
         for(int var2 = 0; var2 < this.Z; ++var2) {
            this.d[var1][var2] = 0.0D;
         }
      }

      int var3;
      if(this.u < this.Z) {
         var3 = this.u;
      } else {
         var3 = this.Z;
      }

      for(int var4 = 0; var4 < var3; ++var4) {
         this.d[var4][var4] = 1.0D;
      }

   }

   public final void J() {
      for(int var1 = 0; var1 < this.u; ++var1) {
         for(int var2 = 0; var2 < this.Z; ++var2) {
            this.d[var1][var2] = 0.0D;
         }
      }

   }

   public final void U() {
      for(int var1 = 0; var1 < this.u; ++var1) {
         for(int var2 = 0; var2 < this.Z; ++var2) {
            this.d[var1][var2] = -this.d[var1][var2];
         }
      }

      int var3;
      if(this.u < this.Z) {
         var3 = this.u;
      } else {
         var3 = this.Z;
      }

      for(int var4 = 0; var4 < var3; ++var4) {
         ++this.d[var4][var4];
      }

   }

   public final void r() {
      this.r(this);
   }

   public final void w(_m var1) {
      this.r(var1);
   }

   public final void E(int var1, int var2, int var3, int var4, int var5, int var6, _m var7) {
      if(this != var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            for(int var9 = 0; var9 < var4; ++var9) {
               var7.d[var5 + var8][var6 + var9] = this.d[var1 + var8][var2 + var9];
            }
         }
      } else {
         double[][] var10 = new double[var3][var4];

         for(int var11 = 0; var11 < var3; ++var11) {
            for(int var13 = 0; var13 < var4; ++var13) {
               var10[var11][var13] = this.d[var1 + var11][var2 + var13];
            }
         }

         for(int var12 = 0; var12 < var3; ++var12) {
            for(int var14 = 0; var14 < var4; ++var14) {
               var7.d[var5 + var12][var6 + var14] = var10[var12][var14];
            }
         }
      }

   }

   public final void V(int var1, int var2) {
      double[][] var3 = new double[var1][var2];
      int var6;
      if(this.u < var1) {
         var6 = this.u;
      } else {
         var6 = var1;
      }

      int var7;
      if(this.Z < var2) {
         var7 = this.Z;
      } else {
         var7 = var2;
      }

      for(int var4 = 0; var4 < var6; ++var4) {
         for(int var5 = 0; var5 < var7; ++var5) {
            var3[var4][var5] = this.d[var4][var5];
         }
      }

      this.u = var1;
      this.Z = var2;
      this.d = var3;
   }

   public final void y(double[] var1) {
      for(int var2 = 0; var2 < this.u; ++var2) {
         for(int var3 = 0; var3 < this.Z; ++var3) {
            this.d[var2][var3] = var1[this.Z * var2 + var3];
         }
      }

   }

   public final void B(br var1) {
      if(this.Z < 3 || this.u < 3) {
         this.Z = 3;
         this.u = 3;
         this.d = new double[this.u][this.Z];
      }

      this.d[0][0] = (double)var1.y;
      this.d[0][1] = (double)var1.H;
      this.d[0][2] = (double)var1.q;
      this.d[1][0] = (double)var1.e;
      this.d[1][1] = (double)var1.Q;
      this.d[1][2] = (double)var1.D;
      this.d[2][0] = (double)var1.x;
      this.d[2][1] = (double)var1.m;
      this.d[2][2] = (double)var1.t;

      for(int var2 = 3; var2 < this.u; ++var2) {
         for(int var3 = 3; var3 < this.Z; ++var3) {
            this.d[var2][var3] = 0.0D;
         }
      }

   }

   public final void R(_w var1) {
      if(this.u < 3 || this.Z < 3) {
         this.d = new double[3][3];
         this.u = 3;
         this.Z = 3;
      }

      this.d[0][0] = var1.u;
      this.d[0][1] = var1.n;
      this.d[0][2] = var1.M;
      this.d[1][0] = var1.p;
      this.d[1][1] = var1.v;
      this.d[1][2] = var1.P;
      this.d[2][0] = var1.Z;
      this.d[2][1] = var1.q;
      this.d[2][2] = var1.l;

      for(int var2 = 3; var2 < this.u; ++var2) {
         for(int var3 = 3; var3 < this.Z; ++var3) {
            this.d[var2][var3] = 0.0D;
         }
      }

   }

   public final void n(bd var1) {
      if(this.u < 4 || this.Z < 4) {
         this.d = new double[4][4];
         this.u = 4;
         this.Z = 4;
      }

      this.d[0][0] = (double)var1.i;
      this.d[0][1] = (double)var1.z;
      this.d[0][2] = (double)var1.R;
      this.d[0][3] = (double)var1.s;
      this.d[1][0] = (double)var1.M;
      this.d[1][1] = (double)var1.a;
      this.d[1][2] = (double)var1.k;
      this.d[1][3] = (double)var1.w;
      this.d[2][0] = (double)var1.b;
      this.d[2][1] = (double)var1.G;
      this.d[2][2] = (double)var1.y;
      this.d[2][3] = (double)var1.r;
      this.d[3][0] = (double)var1.W;
      this.d[3][1] = (double)var1.U;
      this.d[3][2] = (double)var1.g;
      this.d[3][3] = (double)var1.S;

      for(int var2 = 4; var2 < this.u; ++var2) {
         for(int var3 = 4; var3 < this.Z; ++var3) {
            this.d[var2][var3] = 0.0D;
         }
      }

   }

   public final void j(we var1) {
      if(this.u < 4 || this.Z < 4) {
         this.d = new double[4][4];
         this.u = 4;
         this.Z = 4;
      }

      this.d[0][0] = var1.M;
      this.d[0][1] = var1.W;
      this.d[0][2] = var1.l;
      this.d[0][3] = var1.s;
      this.d[1][0] = var1.h;
      this.d[1][1] = var1.o;
      this.d[1][2] = var1.g;
      this.d[1][3] = var1.a;
      this.d[2][0] = var1.T;
      this.d[2][1] = var1.i;
      this.d[2][2] = var1.j;
      this.d[2][3] = var1.X;
      this.d[3][0] = var1.L;
      this.d[3][1] = var1.r;
      this.d[3][2] = var1.H;
      this.d[3][3] = var1.O;

      for(int var2 = 4; var2 < this.u; ++var2) {
         for(int var3 = 4; var3 < this.Z; ++var3) {
            this.d[var2][var3] = 0.0D;
         }
      }

   }

   public final void o(_m var1) {
      if(this.u < var1.u || this.Z < var1.Z) {
         this.u = var1.u;
         this.Z = var1.Z;
         this.d = new double[this.u][this.Z];
      }

      for(int var2 = 0; var2 < Math.min(this.u, var1.u); ++var2) {
         for(int var3 = 0; var3 < Math.min(this.Z, var1.Z); ++var3) {
            this.d[var2][var3] = var1.d[var2][var3];
         }
      }

      for(int var4 = var1.u; var4 < this.u; ++var4) {
         for(int var5 = var1.Z; var5 < this.Z; ++var5) {
            this.d[var4][var5] = 0.0D;
         }
      }

   }

   public final int p() {
      return this.u;
   }

   public final int W() {
      return this.Z;
   }

   public final double L(int var1, int var2) {
      return this.d[var1][var2];
   }

   public final void w(int var1, int var2, double var3) {
      this.d[var1][var2] = var3;
   }

   public final void x(int var1, double[] var2) {
      for(int var3 = 0; var3 < this.Z; ++var3) {
         var2[var3] = this.d[var1][var3];
      }

   }

   public final void i(int var1, zx var2) {
      if(var2.K() < this.Z) {
         var2.X(this.Z);
      }

      for(int var3 = 0; var3 < this.Z; ++var3) {
         var2.K[var3] = this.d[var1][var3];
      }

   }

   public final void o(int var1, double[] var2) {
      for(int var3 = 0; var3 < this.u; ++var3) {
         var2[var3] = this.d[var3][var1];
      }

   }

   public final void H(int var1, zx var2) {
      if(var2.K() < this.u) {
         var2.X(this.u);
      }

      for(int var3 = 0; var3 < this.u; ++var3) {
         var2.K[var3] = this.d[var3][var1];
      }

   }

   public final void b(_w var1) {
      if(this.u >= 3 && this.Z >= 3) {
         var1.u = this.d[0][0];
         var1.n = this.d[0][1];
         var1.M = this.d[0][2];
         var1.p = this.d[1][0];
         var1.v = this.d[1][1];
         var1.P = this.d[1][2];
         var1.Z = this.d[2][0];
         var1.q = this.d[2][1];
         var1.l = this.d[2][2];
      } else {
         var1.F();
         if(this.Z > 0) {
            if(this.u > 0) {
               var1.u = this.d[0][0];
               if(this.u > 1) {
                  var1.p = this.d[1][0];
                  if(this.u > 2) {
                     var1.Z = this.d[2][0];
                  }
               }
            }

            if(this.Z > 1) {
               if(this.u > 0) {
                  var1.n = this.d[0][1];
                  if(this.u > 1) {
                     var1.v = this.d[1][1];
                     if(this.u > 2) {
                        var1.q = this.d[2][1];
                     }
                  }
               }

               if(this.Z > 2 && this.u > 0) {
                  var1.M = this.d[0][2];
                  if(this.u > 1) {
                     var1.P = this.d[1][2];
                     if(this.u > 2) {
                        var1.l = this.d[2][2];
                     }
                  }
               }
            }
         }
      }

   }

   public final void x(br var1) {
      if(this.u >= 3 && this.Z >= 3) {
         var1.y = (float)this.d[0][0];
         var1.H = (float)this.d[0][1];
         var1.q = (float)this.d[0][2];
         var1.e = (float)this.d[1][0];
         var1.Q = (float)this.d[1][1];
         var1.D = (float)this.d[1][2];
         var1.x = (float)this.d[2][0];
         var1.m = (float)this.d[2][1];
         var1.t = (float)this.d[2][2];
      } else {
         var1.e();
         if(this.Z > 0) {
            if(this.u > 0) {
               var1.y = (float)this.d[0][0];
               if(this.u > 1) {
                  var1.e = (float)this.d[1][0];
                  if(this.u > 2) {
                     var1.x = (float)this.d[2][0];
                  }
               }
            }

            if(this.Z > 1) {
               if(this.u > 0) {
                  var1.H = (float)this.d[0][1];
                  if(this.u > 1) {
                     var1.Q = (float)this.d[1][1];
                     if(this.u > 2) {
                        var1.m = (float)this.d[2][1];
                     }
                  }
               }

               if(this.Z > 2 && this.u > 0) {
                  var1.q = (float)this.d[0][2];
                  if(this.u > 1) {
                     var1.D = (float)this.d[1][2];
                     if(this.u > 2) {
                        var1.t = (float)this.d[2][2];
                     }
                  }
               }
            }
         }
      }

   }

   public final void v(we var1) {
      if(this.u >= 4 && this.Z >= 4) {
         var1.M = this.d[0][0];
         var1.W = this.d[0][1];
         var1.l = this.d[0][2];
         var1.s = this.d[0][3];
         var1.h = this.d[1][0];
         var1.o = this.d[1][1];
         var1.g = this.d[1][2];
         var1.a = this.d[1][3];
         var1.T = this.d[2][0];
         var1.i = this.d[2][1];
         var1.j = this.d[2][2];
         var1.X = this.d[2][3];
         var1.L = this.d[3][0];
         var1.r = this.d[3][1];
         var1.H = this.d[3][2];
         var1.O = this.d[3][3];
      } else {
         var1.f();
         if(this.Z > 0) {
            if(this.u > 0) {
               var1.M = this.d[0][0];
               if(this.u > 1) {
                  var1.h = this.d[1][0];
                  if(this.u > 2) {
                     var1.T = this.d[2][0];
                     if(this.u > 3) {
                        var1.L = this.d[3][0];
                     }
                  }
               }
            }

            if(this.Z > 1) {
               if(this.u > 0) {
                  var1.W = this.d[0][1];
                  if(this.u > 1) {
                     var1.o = this.d[1][1];
                     if(this.u > 2) {
                        var1.i = this.d[2][1];
                        if(this.u > 3) {
                           var1.r = this.d[3][1];
                        }
                     }
                  }
               }

               if(this.Z > 2) {
                  if(this.u > 0) {
                     var1.l = this.d[0][2];
                     if(this.u > 1) {
                        var1.g = this.d[1][2];
                        if(this.u > 2) {
                           var1.j = this.d[2][2];
                           if(this.u > 3) {
                              var1.H = this.d[3][2];
                           }
                        }
                     }
                  }

                  if(this.Z > 3 && this.u > 0) {
                     var1.s = this.d[0][3];
                     if(this.u > 1) {
                        var1.a = this.d[1][3];
                        if(this.u > 2) {
                           var1.X = this.d[2][3];
                           if(this.u > 3) {
                              var1.O = this.d[3][3];
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public final void U(bd var1) {
      if(this.u >= 4 && this.Z >= 4) {
         var1.i = (float)this.d[0][0];
         var1.z = (float)this.d[0][1];
         var1.R = (float)this.d[0][2];
         var1.s = (float)this.d[0][3];
         var1.M = (float)this.d[1][0];
         var1.a = (float)this.d[1][1];
         var1.k = (float)this.d[1][2];
         var1.w = (float)this.d[1][3];
         var1.b = (float)this.d[2][0];
         var1.G = (float)this.d[2][1];
         var1.y = (float)this.d[2][2];
         var1.r = (float)this.d[2][3];
         var1.W = (float)this.d[3][0];
         var1.U = (float)this.d[3][1];
         var1.g = (float)this.d[3][2];
         var1.S = (float)this.d[3][3];
      } else {
         var1.x();
         if(this.Z > 0) {
            if(this.u > 0) {
               var1.i = (float)this.d[0][0];
               if(this.u > 1) {
                  var1.M = (float)this.d[1][0];
                  if(this.u > 2) {
                     var1.b = (float)this.d[2][0];
                     if(this.u > 3) {
                        var1.W = (float)this.d[3][0];
                     }
                  }
               }
            }

            if(this.Z > 1) {
               if(this.u > 0) {
                  var1.z = (float)this.d[0][1];
                  if(this.u > 1) {
                     var1.a = (float)this.d[1][1];
                     if(this.u > 2) {
                        var1.G = (float)this.d[2][1];
                        if(this.u > 3) {
                           var1.U = (float)this.d[3][1];
                        }
                     }
                  }
               }

               if(this.Z > 2) {
                  if(this.u > 0) {
                     var1.R = (float)this.d[0][2];
                     if(this.u > 1) {
                        var1.k = (float)this.d[1][2];
                        if(this.u > 2) {
                           var1.y = (float)this.d[2][2];
                           if(this.u > 3) {
                              var1.g = (float)this.d[3][2];
                           }
                        }
                     }
                  }

                  if(this.Z > 3 && this.u > 0) {
                     var1.s = (float)this.d[0][3];
                     if(this.u > 1) {
                        var1.w = (float)this.d[1][3];
                        if(this.u > 2) {
                           var1.r = (float)this.d[2][3];
                           if(this.u > 3) {
                              var1.S = (float)this.d[3][3];
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public final void d(_m var1) {
      int var4;
      if(this.Z < var1.Z) {
         var4 = this.Z;
      } else {
         var4 = var1.Z;
      }

      int var5;
      if(this.u < var1.u) {
         var5 = this.u;
      } else {
         var5 = var1.u;
      }

      for(int var2 = 0; var2 < var5; ++var2) {
         for(int var3 = 0; var3 < var4; ++var3) {
            var1.d[var2][var3] = this.d[var2][var3];
         }
      }

      for(int var6 = var5; var6 < var1.u; ++var6) {
         for(int var8 = 0; var8 < var1.Z; ++var8) {
            var1.d[var6][var8] = 0.0D;
         }
      }

      for(int var9 = var4; var9 < var1.Z; ++var9) {
         for(int var7 = 0; var7 < var5; ++var7) {
            var1.d[var7][var9] = 0.0D;
         }
      }

   }

   public final void v(int var1, double[] var2) {
      for(int var3 = 0; var3 < this.Z; ++var3) {
         this.d[var1][var3] = var2[var3];
      }

   }

   public final void s(int var1, zx var2) {
      for(int var3 = 0; var3 < this.Z; ++var3) {
         this.d[var1][var3] = var2.K[var3];
      }

   }

   public final void L(int var1, double[] var2) {
      for(int var3 = 0; var3 < this.u; ++var3) {
         this.d[var3][var1] = var2[var3];
      }

   }

   public final void o(int var1, zx var2) {
      for(int var3 = 0; var3 < this.u; ++var3) {
         this.d[var3][var1] = var2.K[var3];
      }

   }

   public final void y(_m var1, _m var2) {
      if(var1.u == var2.Z && this.u == var1.Z && this.Z == var2.u) {
         if(var1 != this && var2 != this) {
            for(int var7 = 0; var7 < this.u; ++var7) {
               for(int var8 = 0; var8 < this.Z; ++var8) {
                  this.d[var7][var8] = 0.0D;

                  for(int var9 = 0; var9 < var1.u; ++var9) {
                     this.d[var7][var8] += var1.d[var9][var7] * var2.d[var8][var9];
                  }
               }
            }
         } else {
            double[][] var6 = new double[this.u][this.Z];

            for(int var3 = 0; var3 < this.u; ++var3) {
               for(int var4 = 0; var4 < this.Z; ++var4) {
                  var6[var3][var4] = 0.0D;

                  for(int var5 = 0; var5 < var1.u; ++var5) {
                     var6[var3][var4] += var1.d[var5][var3] * var2.d[var4][var5];
                  }
               }
            }

            this.d = var6;
         }

      } else {
         throw new dm(bc.I("GMatrix14"));
      }
   }

   public final void e(_m var1, _m var2) {
      if(var1.Z == var2.Z && this.Z == var2.u && this.u == var1.u) {
         if(var1 != this && var2 != this) {
            for(int var7 = 0; var7 < this.u; ++var7) {
               for(int var8 = 0; var8 < this.Z; ++var8) {
                  this.d[var7][var8] = 0.0D;

                  for(int var9 = 0; var9 < var1.Z; ++var9) {
                     this.d[var7][var8] += var1.d[var7][var9] * var2.d[var8][var9];
                  }
               }
            }
         } else {
            double[][] var6 = new double[this.u][this.Z];

            for(int var3 = 0; var3 < this.u; ++var3) {
               for(int var4 = 0; var4 < this.Z; ++var4) {
                  var6[var3][var4] = 0.0D;

                  for(int var5 = 0; var5 < var1.Z; ++var5) {
                     var6[var3][var4] += var1.d[var3][var5] * var2.d[var4][var5];
                  }
               }
            }

            this.d = var6;
         }

      } else {
         throw new dm(bc.I("GMatrix15"));
      }
   }

   public final void x(_m var1, _m var2) {
      if(var1.u == var2.u && this.Z == var2.Z && this.u == var1.Z) {
         if(var1 != this && var2 != this) {
            for(int var7 = 0; var7 < this.u; ++var7) {
               for(int var8 = 0; var8 < this.Z; ++var8) {
                  this.d[var7][var8] = 0.0D;

                  for(int var9 = 0; var9 < var1.u; ++var9) {
                     this.d[var7][var8] += var1.d[var9][var7] * var2.d[var9][var8];
                  }
               }
            }
         } else {
            double[][] var6 = new double[this.u][this.Z];

            for(int var3 = 0; var3 < this.u; ++var3) {
               for(int var4 = 0; var4 < this.Z; ++var4) {
                  var6[var3][var4] = 0.0D;

                  for(int var5 = 0; var5 < var1.u; ++var5) {
                     var6[var3][var4] += var1.d[var5][var3] * var2.d[var5][var4];
                  }
               }
            }

            this.d = var6;
         }

      } else {
         throw new dm(bc.I("GMatrix16"));
      }
   }

   public final void a() {
      if(this.u != this.Z) {
         int var1 = this.u;
         this.u = this.Z;
         this.Z = var1;
         double[][] var3 = new double[this.u][this.Z];

         for(var1 = 0; var1 < this.u; ++var1) {
            for(int var2 = 0; var2 < this.Z; ++var2) {
               var3[var1][var2] = this.d[var2][var1];
            }
         }

         this.d = var3;
      } else {
         for(int var6 = 0; var6 < this.u; ++var6) {
            boolean var7 = false;
         }
      }

   }

   public final void x(_m var1) {
      if(this.u == var1.Z && this.Z == var1.u) {
         if(var1 != this) {
            for(int var2 = 0; var2 < this.u; ++var2) {
               for(int var3 = 0; var3 < this.Z; ++var3) {
                  this.d[var2][var3] = var1.d[var3][var2];
               }
            }
         } else {
            this.a();
         }

      } else {
         throw new dm(bc.I("GMatrix17"));
      }
   }

   public String toString() {
      StringBuffer var1 = new StringBuffer(this.u * this.Z * 8);

      for(int var2 = 0; var2 < this.u; ++var2) {
         for(int var3 = 0; var3 < this.Z; ++var3) {
            var1.append(this.d[var2][var3]).append(" ");
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   private static void F(_m var0) {
      for(int var1 = 0; var1 < var0.u; ++var1) {
         for(int var2 = 0; var2 < var0.Z; ++var2) {
            if(Math.abs(var0.d[var1][var2]) < 1.0E-1D) {
               System.out.print(" 0.0     ");
            } else {
               System.out.print(" " + var0.d[var1][var2]);
            }
         }

         System.out.print("\n");
      }

   }

   public int hashCode() {
      long var1 = 1L;
      var1 = op.e(var1, (long)this.u);
      var1 = op.e(var1, (long)this.Z);

      for(int var3 = 0; var3 < this.u; ++var3) {
         for(int var4 = 0; var4 < this.Z; ++var4) {
            var1 = op.l(var1, this.d[var3][var4]);
         }
      }

      return op.K(var1);
   }

   public boolean E(_m var1) {
      if(this.u == var1.u && this.Z == var1.Z) {
         for(int var2 = 0; var2 < this.u; ++var2) {
            for(int var3 = 0; var3 < this.Z; ++var3) {
               if(this.d[var2][var3] != var1.d[var2][var3]) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean equals(Object var1) {
      _m var2 = (_m)var1;
      if(this.u == var2.u && this.Z == var2.Z) {
         for(int var3 = 0; var3 < this.u; ++var3) {
            for(int var4 = 0; var4 < this.Z; ++var4) {
               if(this.d[var3][var4] != var2.d[var3][var4]) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   /** @deprecated */
   public boolean m(_m var1, float var2) {
      return this.c(var1, (double)var2);
   }

   public boolean c(_m var1, double var2) {
      if(this.u == var1.u && this.Z == var1.Z) {
         for(int var4 = 0; var4 < this.u; ++var4) {
            for(int var5 = 0; var5 < this.Z; ++var5) {
               double var6 = this.d[var4][var5] - var1.d[var4][var5];
               if((var6 < 0.0D?-var6:var6) > var2) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public final double Z() {
      int var2;
      if(this.u < this.Z) {
         var2 = this.u;
      } else {
         var2 = this.Z;
      }

      double var3 = 0.0D;

      for(int var1 = 0; var1 < var2; ++var1) {
         var3 += this.d[var1][var1];
      }

      return var3;
   }

   public final int f(_m var1, _m var2, _m var3) {
      if(this.Z == var3.Z && this.Z == var3.u) {
         if(this.u == var1.u && this.u == var1.Z) {
            if(this.u == var2.u && this.Z == var2.Z) {
               if(this.u == 2 && this.Z == 2 && this.d[1][0] == 0.0D) {
                  var1.T();
                  var3.T();
                  if(this.d[0][1] == 0.0D) {
                     return 2;
                  } else {
                     double[] var4 = new double[1];
                     double[] var5 = new double[1];
                     double[] var6 = new double[1];
                     double[] var7 = new double[1];
                     double[] var8 = new double[]{this.d[0][0], this.d[1][1]};
                     M(this.d[0][0], this.d[0][1], this.d[1][1], var8, var4, var6, var5, var7, 0);
                     a(0, var1, var6, var4);
                     m(0, var3, var7, var5);
                     return 2;
                  }
               } else {
                  return U(this, var1, var2, var3);
               }
            } else {
               throw new dm(bc.I("GMatrix26"));
            }
         } else {
            throw new dm(bc.I("GMatrix25"));
         }
      } else {
         throw new dm(bc.I("GMatrix18"));
      }
   }

   public final int N(_m var1, zx var2) {
      int var3 = var1.u * var1.Z;
      double[] var4 = new double[var3];
      int[] var5 = new int[1];
      int[] var6 = new int[var1.u];
      if(this.u != this.Z) {
         throw new dm(bc.I("GMatrix19"));
      } else if(this.u != var1.u) {
         throw new dm(bc.I("GMatrix27"));
      } else if(this.Z != var1.Z) {
         throw new dm(bc.I("GMatrix27"));
      } else if(var1.u != var2.K()) {
         throw new dm(bc.I("GMatrix20"));
      } else {
         for(int var7 = 0; var7 < this.u; ++var7) {
            for(int var8 = 0; var8 < this.Z; ++var8) {
               var4[var7 * this.Z + var8] = this.d[var7][var8];
            }
         }

         if(!P(var1.u, var4, var6, var5)) {
            throw new xn(bc.I("GMatrix21"));
         } else {
            for(int var9 = 0; var9 < this.u; ++var9) {
               for(int var11 = 0; var11 < this.Z; ++var11) {
                  var1.d[var9][var11] = var4[var9 * this.Z + var11];
               }
            }

            for(int var10 = 0; var10 < var1.u; ++var10) {
               var2.K[var10] = (double)var6[var10];
            }

            return var5[0];
         }
      }
   }

   public final void P(double var1) {
      int var5;
      if(this.u < this.Z) {
         var5 = this.u;
      } else {
         var5 = this.Z;
      }

      for(int var3 = 0; var3 < this.u; ++var3) {
         for(int var4 = 0; var4 < this.Z; ++var4) {
            this.d[var3][var4] = 0.0D;
         }
      }

      for(int var6 = 0; var6 < var5; ++var6) {
         this.d[var6][var6] = var1;
      }

   }

   final void r(_m var1) {
      int var2 = var1.u * var1.Z;
      double[] var3 = new double[var2];
      double[] var4 = new double[var2];
      int[] var5 = new int[var1.u];
      int[] var6 = new int[1];
      if(var1.u != var1.Z) {
         throw new dm(bc.I("GMatrix22"));
      } else {
         for(int var7 = 0; var7 < this.u; ++var7) {
            for(int var8 = 0; var8 < this.Z; ++var8) {
               var3[var7 * this.Z + var8] = var1.d[var7][var8];
            }
         }

         if(!P(var1.u, var3, var5, var6)) {
            throw new xn(bc.I("GMatrix21"));
         } else {
            for(int var9 = 0; var9 < var2; ++var9) {
               var4[var9] = 0.0D;
            }

            for(int var10 = 0; var10 < this.Z; ++var10) {
               var4[var10 + var10 * this.Z] = 1.0D;
            }

            g(var1.u, var3, var5, var4);

            for(int var11 = 0; var11 < this.u; ++var11) {
               for(int var12 = 0; var12 < this.Z; ++var12) {
                  this.d[var11][var12] = var4[var11 * this.Z + var12];
               }
            }

         }
      }
   }

   static boolean P(int var0, double[] var1, int[] var2, int[] var3) {
      double[] var4 = new double[var0];
      int var7 = 0;
      int var10000 = 0;
      var3[0] = 1;
      int var5 = var0 - 1;
      if(var0 != 0) {
         double var24 = 0.0D;
         int var23 = var0;

         while(var23-- != 0) {
            double var25 = var1[var7++];
            var25 = Math.abs(var25);
            if(var25 > var24) {
               var24 = var25;
            }
         }

         double var31;
         var10000 = (var31 = var24 - 0.0D) == 0.0D?0:(var31 < 0.0D?-1:1);
         return false;
      } else {
         byte var9 = 0;
         byte var6 = 0;
         if(var6 < var0) {
            var5 = 0;
            double var10 = 0.0D;
            boolean var14 = true;

            for(var5 = var6; var5 < var0; ++var5) {
               int var16 = var9 + var0 * var5 + var6;
               double var19 = var1[var16];
               int var10001 = var9 + var0 * var5;
               var10001 = var9 + var6;
               int var15 = var6 - 1;
               var1[var16] = var19;
               double var12;
               if((var12 = var4[var5] * Math.abs(var19)) >= var10) {
                  var10 = var12;
               }
            }

            throw new RuntimeException(bc.I("GMatrix24"));
         } else {
            return true;
         }
      }
   }

   static void g(int var0, double[] var1, int[] var2, double[] var3) {
      byte var9 = 0;

      for(int var8 = 0; var8 < var0; ++var8) {
         int var10 = var8;
         byte var5 = -1;
         int var4 = 0;
         if(var4 < var0) {
            int var6 = var2[var9 + var4];
            double var15 = var3[var8 + var0 * var6];
            var3[var8 + var0 * var6] = var3[var8 + var0 * var4];
            int var19 = var4 * var0;
            int var18 = var5;

            while(true) {
               int var10001 = var4 - 1;
               var15 -= var1[var19 + var18] * var3[var10 + var0 * var18];
               ++var18;
            }
         }

         for(var4 = 0; var4 < var0; ++var4) {
            int var12 = var0 - 1 - var4;
            int var11 = var0 * var12;
            double var13 = 0.0D;
            boolean var7 = true;
            var3[var10 + var0 * var12] = (var3[var10 + var0 * var12] - var13) / var1[var11 + var12];
         }
      }

   }

   static int U(_m var0, _m var1, _m var2, _m var3) {
      ra.C();
      _m var28 = new _m(var0.u, var0.Z);
      _m var29 = new _m(var0.u, var0.Z);
      _m var30 = new _m(var0.u, var0.Z);
      _m var31 = new _m(var0);
      if(var31.u >= var31.Z) {
         int var26 = var31.Z;
         int var25 = var31.Z - 1;
      }

      int var109 = var31.u;
      int var108 = var31.u;
      if(var31.u > var31.Z) {
         int var27 = var31.u;
      }

      int var110 = var31.Z;
      double[] var32 = new double[var110];
      double[] var33 = new double[var109];
      double[] var34 = new double[var108];
      int var12 = 0;
      var1.T();
      var3.T();
      int var8 = var31.u;
      int var9 = var31.Z;
      int var10 = 0;
      if(var10 < var109) {
         if(var8 > 1) {
            double var19 = 0.0D;
            int var5 = 0;
            if(var5 < var8) {
               var19 += var31.d[var5 + var10][var10] * var31.d[var5 + var10][var10];
               ++var5;
            }

            var19 = Math.sqrt(var19);
            if(var31.d[var10][var10] == 0.0D) {
               var32[0] = var19;
            }

            var32[0] = var31.d[var10][var10] + C(var19, var31.d[var10][var10]);
            var5 = 1;
            if(var5 < var8) {
               var32[var5] = var31.d[var10 + var5][var10];
               ++var5;
            }

            double var21 = 0.0D;
            var5 = 0;
            if(var5 < var8) {
               var21 += var32[var5] * var32[var5];
               ++var5;
            }

            var21 = 2.0D / var21;
            if(var10 < var31.u) {
               if(var10 < var31.u) {
                  var29.d[var10][var10] = -var21 * var32[var10 - var10] * var32[var10 - var10];
                  int var7 = var10 + 1;
               }

               int var6 = var10 + 1;
            }

            if(var10 < var31.u) {
               ++var29.d[var10][var10];
               var5 = var10 + 1;
            }

            double var23 = 0.0D;
            if(var10 < var31.u) {
               var23 += var29.d[var10][var10] * var31.d[var10][var10];
               var5 = var10 + 1;
            }

            var31.d[var10][var10] = var23;
            if(var10 < var31.u) {
               int var79 = var10 + 1;
               if(var79 < var31.Z) {
                  var28.d[var10][var79] = 0.0D;
                  if(var10 < var31.Z) {
                     var28.d[var10][var79] += var29.d[var10][var10] * var31.d[var10][var79];
                     var5 = var10 + 1;
                  }

                  ++var79;
               }

               int var65 = var10 + 1;
            }

            if(var10 < var31.u) {
               int var81 = var10 + 1;
               if(var81 < var31.Z) {
                  var31.d[var10][var81] = var28.d[var10][var81];
                  ++var81;
               }

               int var66 = var10 + 1;
            }

            if(var10 < var31.u) {
               int var83 = 0;
               if(var83 < var31.Z) {
                  var28.d[var10][var83] = 0.0D;
                  if(var10 < var31.Z) {
                     var28.d[var10][var83] += var29.d[var10][var10] * var1.d[var10][var83];
                     var5 = var10 + 1;
                  }

                  ++var83;
               }

               int var67 = var10 + 1;
            }

            if(var10 < var31.u) {
               int var85 = 0;
               if(var85 < var31.Z) {
                  var1.d[var10][var85] = var28.d[var10][var85];
                  ++var85;
               }

               int var68 = var10 + 1;
            }

            --var8;
         }

         if(var9 > 2) {
            double var102 = 0.0D;
            int var48 = 1;
            if(var48 < var9) {
               var102 += var31.d[var10][var10 + var48] * var31.d[var10][var10 + var48];
               ++var48;
            }

            var102 = Math.sqrt(var102);
            if(var31.d[var10][var10 + 1] == 0.0D) {
               var32[0] = var102;
            }

            var32[0] = var31.d[var10][var10 + 1] + C(var102, var31.d[var10][var10 + 1]);
            var48 = 1;
            if(var48 < var9 - 1) {
               var32[var48] = var31.d[var10][var10 + var48 + 1];
               ++var48;
            }

            double var105 = 0.0D;
            var48 = 0;
            if(var48 < var9 - 1) {
               var105 += var32[var48] * var32[var48];
               ++var48;
            }

            var105 = 2.0D / var105;
            int var69 = var10 + 1;
            if(var69 < var9) {
               int var87 = var10 + 1;
               if(var87 < var31.Z) {
                  var30.d[var69][var87] = -var105 * var32[var69 - var10 - 1] * var32[var87 - var10 - 1];
                  ++var87;
               }

               ++var69;
            }

            var48 = var10 + 1;
            if(var48 < var31.Z) {
               ++var30.d[var48][var48];
               ++var48;
            }

            double var107 = 0.0D;
            if(var10 < var31.Z) {
               var107 += var30.d[var10][var10 + 1] * var31.d[var10][var10];
               var48 = var10 + 1;
            }

            var31.d[var10][var10 + 1] = var107;
            var69 = var10 + 1;
            if(var69 < var31.u) {
               int var89 = var10 + 1;
               if(var89 < var31.Z) {
                  var28.d[var69][var89] = 0.0D;
                  var48 = var10 + 1;
                  if(var48 < var31.Z) {
                     var28.d[var69][var89] += var30.d[var48][var89] * var31.d[var69][var48];
                     ++var48;
                  }

                  ++var89;
               }

               ++var69;
            }

            var69 = var10 + 1;
            if(var69 < var31.u) {
               int var91 = var10 + 1;
               if(var91 < var31.Z) {
                  var31.d[var69][var91] = var28.d[var69][var91];
                  ++var91;
               }

               ++var69;
            }

            var69 = 0;
            if(var69 < var31.u) {
               int var93 = var10 + 1;
               if(var93 < var31.Z) {
                  var28.d[var69][var93] = 0.0D;
                  var48 = var10 + 1;
                  if(var48 < var31.Z) {
                     var28.d[var69][var93] += var30.d[var48][var93] * var3.d[var69][var48];
                     ++var48;
                  }

                  ++var93;
               }

               ++var69;
            }

            var69 = 0;
            if(var69 < var31.u) {
               int var95 = var10 + 1;
               if(var95 < var31.Z) {
                  var3.d[var69][var95] = var28.d[var69][var95];
                  ++var95;
               }

               ++var69;
            }

            --var9;
         }

         ++var10;
      }

      int var61 = 0;
      if(var61 < var109) {
         var33[var61] = var31.d[var61][var61];
         ++var61;
      }

      var61 = 0;
      if(var61 < var108) {
         var34[var61] = var31.d[var61][var61 + 1];
         ++var61;
      }

      if(var31.u == 2 && var31.Z == 2) {
         double[] var35 = new double[1];
         double[] var36 = new double[1];
         double[] var37 = new double[1];
         double[] var38 = new double[1];
         M(var33[0], var34[0], var33[1], var33, var37, var35, var38, var36, 0);
         a(0, var1, var35, var37);
         m(0, var3, var36, var38);
         return 2;
      } else {
         p(0, var34.length - 1, var33, var34, var1, var3);
         var12 = var33.length;
         return var12;
      }
   }

   static void p(int var0, int var1, double[] var2, double[] var3, _m var4, _m var5) {
      double[] var24 = new double[1];
      double[] var25 = new double[1];
      double[] var26 = new double[1];
      double[] var27 = new double[1];
      new _m(var4.Z, var5.u);
      boolean var10000 = true;
      double var39 = 4.89E-15D;
      double var32 = 1.0D;
      var39 = -1.0D;
      boolean var11 = false;
      double var20 = 0.0D;
      double var22 = 0.0D;
      int var8 = 0;

      while(true) {
         int var6;
         for(var6 = var0; var6 <= var1; ++var6) {
            if(var6 == var0) {
               int var10;
               if(var3.length == var2.length) {
                  var10 = var1;
               } else {
                  var10 = var1 + 1;
               }

               double var12 = y(var2[var10 - 1], var3[var1], var2[var10]);
               var20 = (Math.abs(var2[var6]) - var12) * (C(var32, var2[var6]) + var12 / var2[var6]);
               var22 = var3[var6];
            }

            double var14 = s(var20, var22, var27, var25);
            if(var6 != var0) {
               var3[var6 - 1] = var14;
            }

            var20 = var25[0] * var2[var6] + var27[0] * var3[var6];
            var3[var6] = var25[0] * var3[var6] - var27[0] * var2[var6];
            var22 = var27[0] * var2[var6 + 1];
            var2[var6 + 1] = var25[0] * var2[var6 + 1];
            m(var6, var5, var25, var27);
            var14 = s(var20, var22, var26, var24);
            var2[var6] = var14;
            var20 = var24[0] * var3[var6] + var26[0] * var2[var6 + 1];
            var2[var6 + 1] = var24[0] * var2[var6 + 1] - var26[0] * var3[var6];
            if(var6 < var1) {
               var22 = var26[0] * var3[var6 + 1];
               var3[var6 + 1] = var24[0] * var3[var6 + 1];
            }

            a(var6, var4, var24, var26);
         }

         if(var2.length == var3.length) {
            s(var20, var22, var27, var25);
            var20 = var25[0] * var2[var6] + var27[0] * var3[var6];
            var3[var6] = var25[0] * var3[var6] - var27[0] * var2[var6];
            var2[var6 + 1] = var25[0] * var2[var6 + 1];
            m(var6, var5, var25, var27);
         }

         while(var1 - var0 > 1 && Math.abs(var3[var1]) < 4.89E-15D) {
            --var1;
         }

         for(int var9 = var1 - 2; var9 > var0; --var9) {
            if(Math.abs(var3[var9]) < 4.89E-15D) {
               p(var9 + 1, var1, var2, var3, var4, var5);

               for(var1 = var9 - 1; var1 - var0 > 1 && Math.abs(var3[var1]) < 4.89E-15D; --var1) {
                  ;
               }
            }
         }

         if(var1 - var0 <= 1 && Math.abs(var3[var0 + 1]) < 4.89E-15D) {
            var11 = true;
         }

         ++var8;
      }
   }

   private static void q(double[] var0, double[] var1) {
      System.out.println("\ns =" + var0[0] + " " + var0[1] + " " + var0[2]);
      System.out.println("e =" + var1[0] + " " + var1[1]);
   }

   private static void m(int var0, _m var1, double[] var2, double[] var3) {
      for(int var4 = 0; var4 < var1.u; ++var4) {
         double var5 = var1.d[var4][var0];
         var1.d[var4][var0] = var2[0] * var5 + var3[0] * var1.d[var4][var0 + 1];
         var1.d[var4][var0 + 1] = -var3[0] * var5 + var2[0] * var1.d[var4][var0 + 1];
      }

   }

   private static void m(double[] var0, double[] var1, int var2, _m var3) {
      double[] var10 = new double[1];
      double[] var11 = new double[1];
      _m var13 = new _m(var3.u, var3.Z);
      _m var14 = new _m(var3.u, var3.Z);
      double var4 = var1[var2];
      double var6 = var0[var2];
      int var12 = var2;

      while(true) {
         double var8 = s(var4, var6, var11, var10);
         var4 = -var1[var12 - 1] * var11[0];
         var6 = var0[var12 - 1];
         var0[var12] = var8;
         var1[var12 - 1] *= var10[0];
         S(var12, var2 + 1, var3, var10, var11, var13, var14);
         --var12;
      }
   }

   private static void F(double[] var0, double[] var1, int var2, _m var3) {
      double[] var10 = new double[1];
      double[] var11 = new double[1];
      _m var13 = new _m(var3.u, var3.Z);
      _m var14 = new _m(var3.u, var3.Z);
      double var6 = var1[var2];
      double var4 = var0[var2 + 1];

      int var12;
      for(var12 = var2; var12 < var3.Z - 2; ++var12) {
         double var8 = s(var4, var6, var11, var10);
         var6 = -var1[var12 + 1] * var11[0];
         var4 = var0[var12 + 2];
         var0[var12 + 1] = var8;
         var1[var12 + 1] *= var10[0];
         i(var2, var12 + 1, var3, var10, var11, var13, var14);
      }

      var0[var12 + 1] = s(var4, var6, var11, var10);
      i(var2, var12 + 1, var3, var10, var11, var13, var14);
   }

   private static void S(int var0, int var1, _m var2, double[] var3, double[] var4, _m var5, _m var6) {
      for(int var7 = 0; var7 < var2.u; ++var7) {
         double var8 = var2.d[var7][var0];
         var2.d[var7][var0] = var3[0] * var8 - var4[0] * var2.d[var7][var1];
         var2.d[var7][var1] = var4[0] * var8 + var3[0] * var2.d[var7][var1];
      }

      System.out.println("topr    =" + var0);
      System.out.println("bottomr =" + var1);
      System.out.println("cosr =" + var3[0]);
      System.out.println("sinr =" + var4[0]);
      System.out.println("\nm =");
      F(var6);
      System.out.println("\nv =");
      F(var5);
      var6.h(var6, var5);
      System.out.println("\nt*m =");
      F(var6);
   }

   private static void i(int var0, int var1, _m var2, double[] var3, double[] var4, _m var5, _m var6) {
      for(int var7 = 0; var7 < var2.Z; ++var7) {
         double var8 = var2.d[var0][var7];
         var2.d[var0][var7] = var3[0] * var8 - var4[0] * var2.d[var1][var7];
         var2.d[var1][var7] = var4[0] * var8 + var3[0] * var2.d[var1][var7];
      }

      System.out.println("\nm=");
      F(var6);
      System.out.println("\nu=");
      F(var5);
      var6.h(var5, var6);
      System.out.println("\nt*m=");
      F(var6);
   }

   private static void a(int var0, _m var1, double[] var2, double[] var3) {
      for(int var4 = 0; var4 < var1.Z; ++var4) {
         double var5 = var1.d[var0][var4];
         var1.d[var0][var4] = var2[0] * var5 + var3[0] * var1.d[var0 + 1][var4];
         var1.d[var0 + 1][var4] = -var3[0] * var5 + var2[0] * var1.d[var0 + 1][var4];
      }

   }

   private static void p(_m var0, _m var1, _m var2) {
      _m var3 = new _m(var0.Z, var0.u);
      var3.h(var1, var3);
      var3.h(var3, var2);
      System.out.println("\n m = \n" + f(var3));
   }

   private static String f(_m var0) {
      StringBuffer var1 = new StringBuffer(var0.u * var0.Z * 8);

      for(int var2 = 0; var2 < var0.u; ++var2) {
         for(int var3 = 0; var3 < var0.Z; ++var3) {
            if(Math.abs(var0.d[var2][var3]) < 1.0E-9D) {
               var1.append("0.0000 ");
            } else {
               var1.append(var0.d[var2][var3]).append(" ");
            }
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   private static void V(double[] var0, double[] var1, _m var2, _m var3) {
      _m var5 = new _m(var2.Z, var3.u);
      System.out.println(" \ns = ");

      for(int var4 = 0; var4 < var0.length; ++var4) {
         System.out.println(" " + var0[var4]);
      }

      System.out.println(" \ne = ");

      for(int var6 = 0; var6 < var1.length; ++var6) {
         System.out.println(" " + var1[var6]);
      }

      System.out.println(" \nu  = \n" + var2);
      System.out.println(" \nv  = \n" + var3);
      var5.T();

      for(int var7 = 0; var7 < var0.length; ++var7) {
         var5.d[var7][var7] = var0[var7];
      }

      for(int var8 = 0; var8 < var1.length; ++var8) {
         var5.d[var8][var8 + 1] = var1[var8];
      }

      System.out.println(" \nm  = \n" + var5);
      var5.x(var2, var5);
      var5.e(var5, var3);
      System.out.println(" \n u.transpose*m*v.transpose  = \n" + var5);
   }

   static double x(double var0, double var2) {
      return var0 > var2?var0:var2;
   }

   static double k(double var0, double var2) {
      return var0 < var2?var0:var2;
   }

   static double y(double var0, double var2, double var4) {
      double var16 = Math.abs(var0);
      double var18 = Math.abs(var2);
      double var20 = Math.abs(var4);
      double var10 = k(var16, var20);
      double var12 = x(var16, var20);
      double var28;
      if(var10 == 0.0D) {
         var28 = 0.0D;
         if(var12 != 0.0D) {
            double var6 = k(var12, var18) / x(var12, var18);
         }
      } else if(var18 < var12) {
         double var22 = var10 / var12 + 1.0D;
         double var24 = (var12 - var10) / var12;
         double var30 = var18 / var12;
         double var26 = var30 * var30;
         double var14 = 2.0D / (Math.sqrt(var22 * var22 + var26) + Math.sqrt(var24 * var24 + var26));
         var28 = var10 * var14;
      } else {
         double var35 = var12 / var18;
         if(var35 == 0.0D) {
            var28 = var10 * var12 / var18;
         } else {
            double var33 = var10 / var12 + 1.0D;
            double var34 = (var12 - var10) / var12;
            double var31 = var33 * var35;
            double var8 = var34 * var35;
            double var32 = 1.0D / (Math.sqrt(var31 * var31 + 1.0D) + Math.sqrt(var8 * var8 + 1.0D));
            var28 = var10 * var32 * var35;
            var28 = var28 + var28;
         }
      }

      return var28;
   }

   static int M(double var0, double var2, double var4, double[] var6, double[] var7, double[] var8, double[] var9, double[] var10, int var11) {
      double var12 = 2.0D;
      double var14 = 1.0D;
      double var65 = var6[0];
      double var63 = var6[1];
      double var55 = 0.0D;
      double var57 = 0.0D;
      double var59 = 0.0D;
      double var61 = 0.0D;
      double var36 = 0.0D;
      double var38 = Math.abs(var0);
      double var42 = Math.abs(var4);
      boolean var18 = true;
      boolean var21 = var42 > var38;
      var18 = true;
      double var40 = Math.abs(var2);
      if(var40 == 0.0D) {
         var6[1] = var38;
         var6[0] = var42;
         var55 = 1.0D;
         var57 = 1.0D;
         var59 = 0.0D;
         var61 = 0.0D;
      } else {
         boolean var52 = true;
         if(var40 > var42) {
            var18 = true;
            if(var42 / var40 < 1.0E-1D) {
               var52 = false;
               if(var38 > 1.0D) {
                  double var10000 = var42 / (var40 / var38);
               } else {
                  var63 = var42 / var40 * var38;
               }

               var55 = 1.0D;
               double var102 = var0 / var2;
               var61 = 1.0D;
               var57 = var4 / var2;
            }
         }

         double var24 = var42 - var38;
         double var26;
         if(var24 == var42) {
            var26 = 1.0D;
         } else {
            var26 = var24 / var42;
         }

         double var28 = var2 / var4;
         double var34 = 2.0D - var26;
         double var50 = var28 * var28;
         double var53 = var34 * var34;
         double var32 = Math.sqrt(var53 + var50);
         double var30;
         if(var26 == 0.0D) {
            var30 = Math.abs(var28);
         } else {
            var30 = Math.sqrt(var26 * var26 + var50);
         }

         double var22 = (var32 + var30) * 0.5D;
         if(var40 > var42) {
            var18 = true;
            if(var42 / var40 < 1.0E-1D) {
               var52 = false;
               if(var38 > 1.0D) {
                  double var103 = var42 / (var40 / var38);
               } else {
                  var63 = var42 / var40 * var38;
               }

               var55 = 1.0D;
               double var104 = var0 / var2;
               var61 = 1.0D;
               var57 = var4 / var2;
            }
         }

         var24 = var42 - var38;
         if(var24 == var42) {
            var26 = 1.0D;
         } else {
            var26 = var24 / var42;
         }

         var28 = var2 / var4;
         var34 = 2.0D - var26;
         var50 = var28 * var28;
         var53 = var34 * var34;
         var32 = Math.sqrt(var53 + var50);
         if(var26 == 0.0D) {
            var30 = Math.abs(var28);
         } else {
            var30 = Math.sqrt(var26 * var26 + var50);
         }

         var22 = (var32 + var30) * 0.5D;
         var63 = var38 / var22;
         var65 = var42 * var22;
         if(var50 == 0.0D) {
            if(var26 == 0.0D) {
               var34 = C(var12, var4) * C(var14, var2);
            } else {
               var34 = var2 / C(var24, var4) + var28 / var34;
            }
         } else {
            var34 = (var28 / (var32 + var34) + var28 / (var30 + var26)) * (var22 + 1.0D);
         }

         var26 = Math.sqrt(var34 * var34 + 4.0D);
         var57 = 2.0D / var26;
         var61 = var34 / var26;
         var55 = (var57 + var61 * var28) / var22;
         var59 = var0 / var4 * var61 / var22;
         var8[0] = var61;
         var7[0] = var57;
         var10[0] = var59;
         var9[0] = var55;
         var36 = C(var14, var9[0]) * C(var14, var7[0]) * C(var14, var4);
         var6[var11] = C(var65, var36);
         double var16 = var36 * C(var14, var0) * C(var14, var4);
         var6[var11 + 1] = C(var63, var16);
      }

      return 0;
   }

   static double s(double var0, double var2, double[] var4, double[] var5) {
      double var10000 = 2.002083095183101E-146D;
      var10000 = 4.9947976805055876E145D;
      double var11;
      double var13;
      double var23;
      if(var2 == 0.0D) {
         var11 = 1.0D;
         var13 = 0.0D;
         var23 = var0;
      } else if(var0 == 0.0D) {
         var11 = 0.0D;
         var13 = 1.0D;
         var23 = var2;
      } else {
         double var19 = var0;
         double var21 = var2;
         double var16 = x(Math.abs(var0), Math.abs(var2));
         if(var16 >= 4.9947976805055876E145D) {
            for(int var30 = 0; var16 >= 4.9947976805055876E145D; var16 = x(Math.abs(var19), Math.abs(var21))) {
               ++var30;
               var19 *= 2.002083095183101E-146D;
               var21 *= 2.002083095183101E-146D;
            }

            var23 = Math.sqrt(var19 * var19 + var21 * var21);
            var11 = var19 / var23;
            var13 = var21 / var23;
            boolean var29 = true;
         } else if(var16 > 2.002083095183101E-146D) {
            var23 = Math.sqrt(var0 * var0 + var2 * var2);
            var11 = var0 / var23;
            var13 = var2 / var23;
         } else {
            for(int var18 = 0; var16 <= 2.002083095183101E-146D; var16 = x(Math.abs(var19), Math.abs(var21))) {
               ++var18;
               var19 *= 4.9947976805055876E145D;
               var21 *= 4.9947976805055876E145D;
            }

            var23 = Math.sqrt(var19 * var19 + var21 * var21);
            var11 = var19 / var23;
            var13 = var21 / var23;
            boolean var15 = true;
         }

         if(Math.abs(var0) > Math.abs(var2) && var11 < 0.0D) {
            var11 = -var11;
            var13 = -var13;
            var23 = -var23;
         }
      }

      var4[0] = var13;
      var5[0] = var11;
      return var23;
   }

   static double C(double var0, double var2) {
      double var4 = var0 >= 0.0D?var0:-var0;
      return var2 >= 0.0D?var4:-var4;
   }

   public Object clone() {
      _m var1 = null;
      var1 = (_m)super.clone();
      var1.d = new double[this.u][this.Z];

      for(int var2 = 0; var2 < this.u; ++var2) {
         for(int var3 = 0; var3 < this.Z; ++var3) {
            var1.d[var2][var3] = this.d[var2][var3];
         }
      }

      return var1;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
