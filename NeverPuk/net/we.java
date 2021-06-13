package net;

import java.io.Serializable;
import net._w;
import net.bc;
import net.bd;
import net.br;
import net.gl;
import net.gp;
import net.mt;
import net.ok;
import net.op;
import net.pv;
import net.ra;
import net.rk;
import net.uo;
import net.up;
import net.uz;
import net.x5;
import net.xn;
import net.u.d;

public class we implements Serializable, Cloneable {
   static final long serialVersionUID = 8223903484171633710L;
   public double M;
   public double W;
   public double l;
   public double s;
   public double h;
   public double o;
   public double g;
   public double a;
   public double T;
   public double i;
   public double j;
   public double X;
   public double L;
   public double r;
   public double H;
   public double O;
   private static final double m = 1.0E-1D;

   public we(double var1, double var3, double var5, double var7, double var9, double var11, double var13, double var15, double var17, double var19, double var21, double var23, double var25, double var27, double var29, double var31) {
      this.M = var1;
      this.W = var3;
      this.l = var5;
      this.s = var7;
      this.h = var9;
      this.o = var11;
      this.g = var13;
      this.a = var15;
      this.T = var17;
      this.i = var19;
      this.j = var21;
      this.X = var23;
      this.L = var25;
      this.r = var27;
      this.H = var29;
      this.O = var31;
   }

   public we(double[] var1) {
      this.M = var1[0];
      this.W = var1[1];
      this.l = var1[2];
      this.s = var1[3];
      this.h = var1[4];
      this.o = var1[5];
      this.g = var1[6];
      this.a = var1[7];
      this.T = var1[8];
      this.i = var1[9];
      this.j = var1[10];
      this.X = var1[11];
      this.L = var1[12];
      this.r = var1[13];
      this.H = var1[14];
      this.O = var1[15];
   }

   public we(up var1, gp var2, double var3) {
      this.M = var3 * (1.0D - 2.0D * var1.b * var1.b - 2.0D * var1.G * var1.G);
      this.h = var3 * 2.0D * (var1.M * var1.b + var1.d * var1.G);
      this.T = var3 * 2.0D * (var1.M * var1.G - var1.d * var1.b);
      this.W = var3 * 2.0D * (var1.M * var1.b - var1.d * var1.G);
      this.o = var3 * (1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.G * var1.G);
      this.i = var3 * 2.0D * (var1.b * var1.G + var1.d * var1.M);
      this.l = var3 * 2.0D * (var1.M * var1.G + var1.d * var1.b);
      this.g = var3 * 2.0D * (var1.b * var1.G - var1.d * var1.M);
      this.j = var3 * (1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.b * var1.b);
      this.s = var2.n;
      this.a = var2.Z;
      this.X = var2.B;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public we(rk var1, gp var2, double var3) {
      this.M = var3 * (1.0D - 2.0D * (double)var1.v * (double)var1.v - 2.0D * (double)var1.M * (double)var1.M);
      this.h = var3 * 2.0D * (double)(var1.j * var1.v + var1.U * var1.M);
      this.T = var3 * 2.0D * (double)(var1.j * var1.M - var1.U * var1.v);
      this.W = var3 * 2.0D * (double)(var1.j * var1.v - var1.U * var1.M);
      this.o = var3 * (1.0D - 2.0D * (double)var1.j * (double)var1.j - 2.0D * (double)var1.M * (double)var1.M);
      this.i = var3 * 2.0D * (double)(var1.v * var1.M + var1.U * var1.j);
      this.l = var3 * 2.0D * (double)(var1.j * var1.M + var1.U * var1.v);
      this.g = var3 * 2.0D * (double)(var1.v * var1.M - var1.U * var1.j);
      this.j = var3 * (1.0D - 2.0D * (double)var1.j * (double)var1.j - 2.0D * (double)var1.v * (double)var1.v);
      this.s = var2.n;
      this.a = var2.Z;
      this.X = var2.B;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public we(we var1) {
      this.M = var1.M;
      this.W = var1.W;
      this.l = var1.l;
      this.s = var1.s;
      this.h = var1.h;
      this.o = var1.o;
      this.g = var1.g;
      this.a = var1.a;
      this.T = var1.T;
      this.i = var1.i;
      this.j = var1.j;
      this.X = var1.X;
      this.L = var1.L;
      this.r = var1.r;
      this.H = var1.H;
      this.O = var1.O;
   }

   public we(bd var1) {
      this.M = (double)var1.i;
      this.W = (double)var1.z;
      this.l = (double)var1.R;
      this.s = (double)var1.s;
      this.h = (double)var1.M;
      this.o = (double)var1.a;
      this.g = (double)var1.k;
      this.a = (double)var1.w;
      this.T = (double)var1.b;
      this.i = (double)var1.G;
      this.j = (double)var1.y;
      this.X = (double)var1.r;
      this.L = (double)var1.W;
      this.r = (double)var1.U;
      this.H = (double)var1.g;
      this.O = (double)var1.S;
   }

   public we(br var1, gp var2, double var3) {
      this.M = (double)var1.y * var3;
      this.W = (double)var1.H * var3;
      this.l = (double)var1.q * var3;
      this.s = var2.n;
      this.h = (double)var1.e * var3;
      this.o = (double)var1.Q * var3;
      this.g = (double)var1.D * var3;
      this.a = var2.Z;
      this.T = (double)var1.x * var3;
      this.i = (double)var1.m * var3;
      this.j = (double)var1.t * var3;
      this.X = var2.B;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public we(_w var1, gp var2, double var3) {
      this.M = var1.u * var3;
      this.W = var1.n * var3;
      this.l = var1.M * var3;
      this.s = var2.n;
      this.h = var1.p * var3;
      this.o = var1.v * var3;
      this.g = var1.P * var3;
      this.a = var2.Z;
      this.T = var1.Z * var3;
      this.i = var1.q * var3;
      this.j = var1.l * var3;
      this.X = var2.B;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public we() {
      this.M = 0.0D;
      this.W = 0.0D;
      this.l = 0.0D;
      this.s = 0.0D;
      this.h = 0.0D;
      this.o = 0.0D;
      this.g = 0.0D;
      this.a = 0.0D;
      this.T = 0.0D;
      this.i = 0.0D;
      this.j = 0.0D;
      this.X = 0.0D;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 0.0D;
   }

   public String toString() {
      return this.M + ", " + this.W + ", " + this.l + ", " + this.s + "\n" + this.h + ", " + this.o + ", " + this.g + ", " + this.a + "\n" + this.T + ", " + this.i + ", " + this.j + ", " + this.X + "\n" + this.L + ", " + this.r + ", " + this.H + ", " + this.O + "\n";
   }

   public final void r() {
      this.M = 1.0D;
      this.W = 0.0D;
      this.l = 0.0D;
      this.s = 0.0D;
      this.h = 0.0D;
      this.o = 1.0D;
      this.g = 0.0D;
      this.a = 0.0D;
      this.T = 0.0D;
      this.i = 0.0D;
      this.j = 1.0D;
      this.X = 0.0D;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void N(int var1, int var2, double var3) {
      switch(var1) {
      case 0:
         switch(var2) {
         case 0:
            this.M = var3;
            return;
         case 1:
            this.W = var3;
            return;
         case 2:
            this.l = var3;
            return;
         case 3:
            this.s = var3;
            return;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4d0"));
         }
      case 1:
         switch(var2) {
         case 0:
            this.h = var3;
            return;
         case 1:
            this.o = var3;
            return;
         case 2:
            this.g = var3;
            return;
         case 3:
            this.a = var3;
            return;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4d0"));
         }
      case 2:
         switch(var2) {
         case 0:
            this.T = var3;
            return;
         case 1:
            this.i = var3;
            return;
         case 2:
            this.j = var3;
            return;
         case 3:
            this.X = var3;
            return;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4d0"));
         }
      case 3:
         switch(var2) {
         case 0:
            this.L = var3;
            return;
         case 1:
            this.r = var3;
            return;
         case 2:
            this.H = var3;
            return;
         case 3:
            this.O = var3;
            return;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4d0"));
         }
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4d0"));
      }
   }

   public final double p(int var1, int var2) {
      switch(var1) {
      case 0:
         switch(var2) {
         case 0:
            return this.M;
         case 1:
            return this.W;
         case 2:
            return this.l;
         case 3:
            return this.s;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4d1"));
         }
      case 1:
         switch(var2) {
         case 0:
            return this.h;
         case 1:
            return this.o;
         case 2:
            return this.g;
         case 3:
            return this.a;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4d1"));
         }
      case 2:
         switch(var2) {
         case 0:
            return this.T;
         case 1:
            return this.i;
         case 2:
            return this.j;
         case 3:
            return this.X;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4d1"));
         }
      case 3:
         switch(var2) {
         case 0:
            return this.L;
         case 1:
            return this.r;
         case 2:
            return this.H;
         case 3:
            return this.O;
         }
      }

      throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4d1"));
   }

   public final void N(int var1, uz var2) {
      var2.M = this.M;
      var2.b = this.W;
      var2.G = this.l;
      var2.d = this.s;
   }

   public final void z(int var1, double[] var2) {
      var2[0] = this.M;
      var2[1] = this.W;
      var2[2] = this.l;
      var2[3] = this.s;
   }

   public final void t(int var1, uz var2) {
      var2.M = this.M;
      var2.b = this.h;
      var2.G = this.T;
      var2.d = this.L;
   }

   public final void H(int var1, double[] var2) {
      var2[0] = this.M;
      var2[1] = this.h;
      var2[2] = this.T;
      var2[3] = this.L;
   }

   public final void d(_w var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.P(var3, var2);
      var1.u = var2[0];
      var1.n = var2[1];
      var1.M = var2[2];
      var1.p = var2[3];
      var1.v = var2[4];
      var1.P = var2[5];
      var1.Z = var2[6];
      var1.q = var2[7];
      var1.l = var2[8];
   }

   public final void M(br var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.P(var3, var2);
      var1.y = (float)var2[0];
      var1.H = (float)var2[1];
      var1.q = (float)var2[2];
      var1.e = (float)var2[3];
      var1.Q = (float)var2[4];
      var1.D = (float)var2[5];
      var1.x = (float)var2[6];
      var1.m = (float)var2[7];
      var1.t = (float)var2[8];
   }

   public final double y(_w var1, gp var2) {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.P(var4, var3);
      var1.u = var3[0];
      var1.n = var3[1];
      var1.M = var3[2];
      var1.p = var3[3];
      var1.v = var3[4];
      var1.P = var3[5];
      var1.Z = var3[6];
      var1.q = var3[7];
      var1.l = var3[8];
      var2.n = this.s;
      var2.Z = this.a;
      var2.B = this.X;
      return _w.I(var4);
   }

   public final double e(br var1, gp var2) {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.P(var4, var3);
      var1.y = (float)var3[0];
      var1.H = (float)var3[1];
      var1.q = (float)var3[2];
      var1.e = (float)var3[3];
      var1.Q = (float)var3[4];
      var1.D = (float)var3[5];
      var1.x = (float)var3[6];
      var1.m = (float)var3[7];
      var1.t = (float)var3[8];
      var2.n = this.s;
      var2.Z = this.a;
      var2.B = this.X;
      return _w.I(var4);
   }

   public final void z(rk var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.P(var3, var2);
      double var4 = 0.25D * (1.0D + var2[0] + var2[4] + var2[8]);
      double var8;
      int var10000 = (var8 = var4 - 0.0D) == 0.0D?0:(var8 < 0.0D?-1:1);
      double var9;
      var10000 = (var9 = var4 - 1.0E-3D) == 0.0D?0:(var9 < 0.0D?-1:1);
      var1.U = (float)Math.sqrt(var4);
      var4 = 0.25D / (double)var1.U;
      var1.j = (float)((var2[7] - var2[5]) * var4);
      var1.v = (float)((var2[2] - var2[6]) * var4);
      var1.M = (float)((var2[3] - var2[1]) * var4);
   }

   public final void G(up var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.P(var3, var2);
      double var4 = 0.25D * (1.0D + var2[0] + var2[4] + var2[8]);
      double var8;
      int var10000 = (var8 = var4 - 0.0D) == 0.0D?0:(var8 < 0.0D?-1:1);
      double var9;
      var10000 = (var9 = var4 - 1.0E-3D) == 0.0D?0:(var9 < 0.0D?-1:1);
      var1.d = Math.sqrt(var4);
      var4 = 0.25D / var1.d;
      var1.M = (var2[7] - var2[5]) * var4;
      var1.b = (var2[2] - var2[6]) * var4;
      var1.G = (var2[3] - var2[1]) * var4;
   }

   public final void n(gp var1) {
      var1.n = this.s;
      var1.Z = this.a;
      var1.B = this.X;
   }

   public final void n(br var1) {
      var1.y = (float)this.M;
      var1.H = (float)this.W;
      var1.q = (float)this.l;
      var1.e = (float)this.h;
      var1.Q = (float)this.o;
      var1.D = (float)this.g;
      var1.x = (float)this.T;
      var1.m = (float)this.i;
      var1.t = (float)this.j;
   }

   public final void P(_w var1) {
      var1.u = this.M;
      var1.n = this.W;
      var1.M = this.l;
      var1.p = this.h;
      var1.v = this.o;
      var1.P = this.g;
      var1.Z = this.T;
      var1.q = this.i;
      var1.l = this.j;
   }

   public final double J() {
      double[] var1 = new double[9];
      double[] var2 = new double[3];
      this.P(var2, var1);
      return _w.I(var2);
   }

   public final void S(_w var1) {
      this.M = var1.u;
      this.W = var1.n;
      this.l = var1.M;
      this.h = var1.p;
      this.o = var1.v;
      this.g = var1.P;
      this.T = var1.Z;
      this.i = var1.q;
      this.j = var1.l;
   }

   public final void b(br var1) {
      this.M = (double)var1.y;
      this.W = (double)var1.H;
      this.l = (double)var1.q;
      this.h = (double)var1.e;
      this.o = (double)var1.Q;
      this.g = (double)var1.D;
      this.T = (double)var1.x;
      this.i = (double)var1.m;
      this.j = (double)var1.t;
   }

   public final void F(double var1) {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.P(var4, var3);
      this.M = var3[0] * var1;
      this.W = var3[1] * var1;
      this.l = var3[2] * var1;
      this.h = var3[3] * var1;
      this.o = var3[4] * var1;
      this.g = var3[5] * var1;
      this.T = var3[6] * var1;
      this.i = var3[7] * var1;
      this.j = var3[8] * var1;
   }

   public final void F(int var1, double var2, double var4, double var6, double var8) {
      switch(var1) {
      case 0:
         this.M = var2;
         this.W = var4;
         this.l = var6;
         this.s = var8;
         break;
      case 1:
         this.h = var2;
         this.o = var4;
         this.g = var6;
         this.a = var8;
         break;
      case 2:
         this.T = var2;
         this.i = var4;
         this.j = var6;
         this.X = var8;
         break;
      case 3:
         this.L = var2;
         this.r = var4;
         this.H = var6;
         this.O = var8;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4d4"));
      }

   }

   public final void J(int var1, uz var2) {
      switch(var1) {
      case 0:
         this.M = var2.M;
         this.W = var2.b;
         this.l = var2.G;
         this.s = var2.d;
         break;
      case 1:
         this.h = var2.M;
         this.o = var2.b;
         this.g = var2.G;
         this.a = var2.d;
         break;
      case 2:
         this.T = var2.M;
         this.i = var2.b;
         this.j = var2.G;
         this.X = var2.d;
         break;
      case 3:
         this.L = var2.M;
         this.r = var2.b;
         this.H = var2.G;
         this.O = var2.d;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4d4"));
      }

   }

   public final void n(int var1, double[] var2) {
      switch(var1) {
      case 0:
         this.M = var2[0];
         this.W = var2[1];
         this.l = var2[2];
         this.s = var2[3];
         break;
      case 1:
         this.h = var2[0];
         this.o = var2[1];
         this.g = var2[2];
         this.a = var2[3];
         break;
      case 2:
         this.T = var2[0];
         this.i = var2[1];
         this.j = var2[2];
         this.X = var2[3];
         break;
      case 3:
         this.L = var2[0];
         this.r = var2[1];
         this.H = var2[2];
         this.O = var2[3];
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4d4"));
      }

   }

   public final void X(int var1, double var2, double var4, double var6, double var8) {
      switch(var1) {
      case 0:
         this.M = var2;
         this.h = var4;
         this.T = var6;
         this.L = var8;
         break;
      case 1:
         this.W = var2;
         this.o = var4;
         this.i = var6;
         this.r = var8;
         break;
      case 2:
         this.l = var2;
         this.g = var4;
         this.j = var6;
         this.H = var8;
         break;
      case 3:
         this.s = var2;
         this.a = var4;
         this.X = var6;
         this.O = var8;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4d7"));
      }

   }

   public final void p(int var1, uz var2) {
      switch(var1) {
      case 0:
         this.M = var2.M;
         this.h = var2.b;
         this.T = var2.G;
         this.L = var2.d;
         break;
      case 1:
         this.W = var2.M;
         this.o = var2.b;
         this.i = var2.G;
         this.r = var2.d;
         break;
      case 2:
         this.l = var2.M;
         this.g = var2.b;
         this.j = var2.G;
         this.H = var2.d;
         break;
      case 3:
         this.s = var2.M;
         this.a = var2.b;
         this.X = var2.G;
         this.O = var2.d;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4d7"));
      }

   }

   public final void Q(int var1, double[] var2) {
      switch(var1) {
      case 0:
         this.M = var2[0];
         this.h = var2[1];
         this.T = var2[2];
         this.L = var2[3];
         break;
      case 1:
         this.W = var2[0];
         this.o = var2[1];
         this.i = var2[2];
         this.r = var2[3];
         break;
      case 2:
         this.l = var2[0];
         this.g = var2[1];
         this.j = var2[2];
         this.H = var2[3];
         break;
      case 3:
         this.s = var2[0];
         this.a = var2[1];
         this.X = var2[2];
         this.O = var2[3];
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4d7"));
      }

   }

   public final void w(double var1) {
      this.M += var1;
      this.W += var1;
      this.l += var1;
      this.s += var1;
      this.h += var1;
      this.o += var1;
      this.g += var1;
      this.a += var1;
      this.T += var1;
      this.i += var1;
      this.j += var1;
      this.X += var1;
      this.L += var1;
      this.r += var1;
      this.H += var1;
      this.O += var1;
   }

   public final void r(double var1, we var3) {
      this.M = var3.M + var1;
      this.W = var3.W + var1;
      this.l = var3.l + var1;
      this.s = var3.s + var1;
      this.h = var3.h + var1;
      this.o = var3.o + var1;
      this.g = var3.g + var1;
      this.a = var3.a + var1;
      this.T = var3.T + var1;
      this.i = var3.i + var1;
      this.j = var3.j + var1;
      this.X = var3.X + var1;
      this.L = var3.L + var1;
      this.r = var3.r + var1;
      this.H = var3.H + var1;
      this.O = var3.O + var1;
   }

   public final void L(we var1, we var2) {
      this.M = var1.M + var2.M;
      this.W = var1.W + var2.W;
      this.l = var1.l + var2.l;
      this.s = var1.s + var2.s;
      this.h = var1.h + var2.h;
      this.o = var1.o + var2.o;
      this.g = var1.g + var2.g;
      this.a = var1.a + var2.a;
      this.T = var1.T + var2.T;
      this.i = var1.i + var2.i;
      this.j = var1.j + var2.j;
      this.X = var1.X + var2.X;
      this.L = var1.L + var2.L;
      this.r = var1.r + var2.r;
      this.H = var1.H + var2.H;
      this.O = var1.O + var2.O;
   }

   public final void H(we var1) {
      this.M += var1.M;
      this.W += var1.W;
      this.l += var1.l;
      this.s += var1.s;
      this.h += var1.h;
      this.o += var1.o;
      this.g += var1.g;
      this.a += var1.a;
      this.T += var1.T;
      this.i += var1.i;
      this.j += var1.j;
      this.X += var1.X;
      this.L += var1.L;
      this.r += var1.r;
      this.H += var1.H;
      this.O += var1.O;
   }

   public final void e(we var1, we var2) {
      this.M = var1.M - var2.M;
      this.W = var1.W - var2.W;
      this.l = var1.l - var2.l;
      this.s = var1.s - var2.s;
      this.h = var1.h - var2.h;
      this.o = var1.o - var2.o;
      this.g = var1.g - var2.g;
      this.a = var1.a - var2.a;
      this.T = var1.T - var2.T;
      this.i = var1.i - var2.i;
      this.j = var1.j - var2.j;
      this.X = var1.X - var2.X;
      this.L = var1.L - var2.L;
      this.r = var1.r - var2.r;
      this.H = var1.H - var2.H;
      this.O = var1.O - var2.O;
   }

   public final void l(we var1) {
      this.M -= var1.M;
      this.W -= var1.W;
      this.l -= var1.l;
      this.s -= var1.s;
      this.h -= var1.h;
      this.o -= var1.o;
      this.g -= var1.g;
      this.a -= var1.a;
      this.T -= var1.T;
      this.i -= var1.i;
      this.j -= var1.j;
      this.X -= var1.X;
      this.L -= var1.L;
      this.r -= var1.r;
      this.H -= var1.H;
      this.O -= var1.O;
   }

   public final void T() {
      double var1 = this.h;
      this.h = this.W;
      this.W = var1;
      var1 = this.T;
      this.T = this.l;
      this.l = var1;
      var1 = this.L;
      this.L = this.s;
      this.s = var1;
      var1 = this.i;
      this.i = this.g;
      this.g = var1;
      var1 = this.r;
      this.r = this.a;
      this.a = var1;
      var1 = this.H;
      this.H = this.X;
      this.X = var1;
   }

   public final void u(we var1) {
      if(this != var1) {
         this.M = var1.M;
         this.W = var1.h;
         this.l = var1.T;
         this.s = var1.L;
         this.h = var1.W;
         this.o = var1.o;
         this.g = var1.i;
         this.a = var1.r;
         this.T = var1.l;
         this.i = var1.g;
         this.j = var1.j;
         this.X = var1.H;
         this.L = var1.s;
         this.r = var1.a;
         this.H = var1.X;
         this.O = var1.O;
      } else {
         this.T();
      }

   }

   public final void O(double[] var1) {
      this.M = var1[0];
      this.W = var1[1];
      this.l = var1[2];
      this.s = var1[3];
      this.h = var1[4];
      this.o = var1[5];
      this.g = var1[6];
      this.a = var1[7];
      this.T = var1[8];
      this.i = var1[9];
      this.j = var1[10];
      this.X = var1[11];
      this.L = var1[12];
      this.r = var1[13];
      this.H = var1[14];
      this.O = var1[15];
   }

   public final void E(br var1) {
      this.M = (double)var1.y;
      this.W = (double)var1.H;
      this.l = (double)var1.q;
      this.s = 0.0D;
      this.h = (double)var1.e;
      this.o = (double)var1.Q;
      this.g = (double)var1.D;
      this.a = 0.0D;
      this.T = (double)var1.x;
      this.i = (double)var1.m;
      this.j = (double)var1.t;
      this.X = 0.0D;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void n(_w var1) {
      this.M = var1.u;
      this.W = var1.n;
      this.l = var1.M;
      this.s = 0.0D;
      this.h = var1.p;
      this.o = var1.v;
      this.g = var1.P;
      this.a = 0.0D;
      this.T = var1.Z;
      this.i = var1.q;
      this.j = var1.l;
      this.X = 0.0D;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void r(up var1) {
      this.M = 1.0D - 2.0D * var1.b * var1.b - 2.0D * var1.G * var1.G;
      this.h = 2.0D * (var1.M * var1.b + var1.d * var1.G);
      this.T = 2.0D * (var1.M * var1.G - var1.d * var1.b);
      this.W = 2.0D * (var1.M * var1.b - var1.d * var1.G);
      this.o = 1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.G * var1.G;
      this.i = 2.0D * (var1.b * var1.G + var1.d * var1.M);
      this.l = 2.0D * (var1.M * var1.G + var1.d * var1.b);
      this.g = 2.0D * (var1.b * var1.G - var1.d * var1.M);
      this.j = 1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.b * var1.b;
      this.s = 0.0D;
      this.a = 0.0D;
      this.X = 0.0D;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void h(mt var1) {
      double var2 = Math.sqrt(var1.b * var1.b + var1.C * var1.C + var1.L * var1.L);
      if(var2 < 1.0E-1D) {
         this.M = 1.0D;
         this.W = 0.0D;
         this.l = 0.0D;
         this.h = 0.0D;
         this.o = 1.0D;
         this.g = 0.0D;
         this.T = 0.0D;
         this.i = 0.0D;
         this.j = 1.0D;
      } else {
         var2 = 1.0D / var2;
         double var4 = var1.b * var2;
         double var6 = var1.C * var2;
         double var8 = var1.L * var2;
         double var10 = Math.sin(var1.m);
         double var12 = Math.cos(var1.m);
         double var14 = 1.0D - var12;
         double var16 = var4 * var8;
         double var18 = var4 * var6;
         double var20 = var6 * var8;
         this.M = var14 * var4 * var4 + var12;
         this.W = var14 * var18 - var10 * var8;
         this.l = var14 * var16 + var10 * var6;
         this.h = var14 * var18 + var10 * var8;
         this.o = var14 * var6 * var6 + var12;
         this.g = var14 * var20 - var10 * var4;
         this.T = var14 * var16 - var10 * var6;
         this.i = var14 * var20 + var10 * var4;
         this.j = var14 * var8 * var8 + var12;
      }

      this.s = 0.0D;
      this.a = 0.0D;
      this.X = 0.0D;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void F(rk var1) {
      this.M = 1.0D - 2.0D * (double)var1.v * (double)var1.v - 2.0D * (double)var1.M * (double)var1.M;
      this.h = 2.0D * (double)(var1.j * var1.v + var1.U * var1.M);
      this.T = 2.0D * (double)(var1.j * var1.M - var1.U * var1.v);
      this.W = 2.0D * (double)(var1.j * var1.v - var1.U * var1.M);
      this.o = 1.0D - 2.0D * (double)var1.j * (double)var1.j - 2.0D * (double)var1.M * (double)var1.M;
      this.i = 2.0D * (double)(var1.v * var1.M + var1.U * var1.j);
      this.l = 2.0D * (double)(var1.j * var1.M + var1.U * var1.v);
      this.g = 2.0D * (double)(var1.v * var1.M - var1.U * var1.j);
      this.j = 1.0D - 2.0D * (double)var1.j * (double)var1.j - 2.0D * (double)var1.v * (double)var1.v;
      this.s = 0.0D;
      this.a = 0.0D;
      this.X = 0.0D;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void g(ok var1) {
      double var2 = Math.sqrt((double)(var1.y * var1.y + var1.D * var1.D + var1.U * var1.U));
      if(var2 < 1.0E-1D) {
         this.M = 1.0D;
         this.W = 0.0D;
         this.l = 0.0D;
         this.h = 0.0D;
         this.o = 1.0D;
         this.g = 0.0D;
         this.T = 0.0D;
         this.i = 0.0D;
         this.j = 1.0D;
      } else {
         var2 = 1.0D / var2;
         double var4 = (double)var1.y * var2;
         double var6 = (double)var1.D * var2;
         double var8 = (double)var1.U * var2;
         double var10 = Math.sin((double)var1.k);
         double var12 = Math.cos((double)var1.k);
         double var14 = 1.0D - var12;
         double var16 = var4 * var8;
         double var18 = var4 * var6;
         double var20 = var6 * var8;
         this.M = var14 * var4 * var4 + var12;
         this.W = var14 * var18 - var10 * var8;
         this.l = var14 * var16 + var10 * var6;
         this.h = var14 * var18 + var10 * var8;
         this.o = var14 * var6 * var6 + var12;
         this.g = var14 * var20 - var10 * var4;
         this.T = var14 * var16 - var10 * var6;
         this.i = var14 * var20 + var10 * var4;
         this.j = var14 * var8 * var8 + var12;
      }

      this.s = 0.0D;
      this.a = 0.0D;
      this.X = 0.0D;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void b(up var1, gp var2, double var3) {
      this.M = var3 * (1.0D - 2.0D * var1.b * var1.b - 2.0D * var1.G * var1.G);
      this.h = var3 * 2.0D * (var1.M * var1.b + var1.d * var1.G);
      this.T = var3 * 2.0D * (var1.M * var1.G - var1.d * var1.b);
      this.W = var3 * 2.0D * (var1.M * var1.b - var1.d * var1.G);
      this.o = var3 * (1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.G * var1.G);
      this.i = var3 * 2.0D * (var1.b * var1.G + var1.d * var1.M);
      this.l = var3 * 2.0D * (var1.M * var1.G + var1.d * var1.b);
      this.g = var3 * 2.0D * (var1.b * var1.G - var1.d * var1.M);
      this.j = var3 * (1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.b * var1.b);
      this.s = var2.n;
      this.a = var2.Z;
      this.X = var2.B;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void q(rk var1, gp var2, double var3) {
      this.M = var3 * (1.0D - 2.0D * (double)var1.v * (double)var1.v - 2.0D * (double)var1.M * (double)var1.M);
      this.h = var3 * 2.0D * (double)(var1.j * var1.v + var1.U * var1.M);
      this.T = var3 * 2.0D * (double)(var1.j * var1.M - var1.U * var1.v);
      this.W = var3 * 2.0D * (double)(var1.j * var1.v - var1.U * var1.M);
      this.o = var3 * (1.0D - 2.0D * (double)var1.j * (double)var1.j - 2.0D * (double)var1.M * (double)var1.M);
      this.i = var3 * 2.0D * (double)(var1.v * var1.M + var1.U * var1.j);
      this.l = var3 * 2.0D * (double)(var1.j * var1.M + var1.U * var1.v);
      this.g = var3 * 2.0D * (double)(var1.v * var1.M - var1.U * var1.j);
      this.j = var3 * (1.0D - 2.0D * (double)var1.j * (double)var1.j - 2.0D * (double)var1.v * (double)var1.v);
      this.s = var2.n;
      this.a = var2.Z;
      this.X = var2.B;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void K(rk var1, pv var2, float var3) {
      this.M = (double)var3 * (1.0D - 2.0D * (double)var1.v * (double)var1.v - 2.0D * (double)var1.M * (double)var1.M);
      this.h = (double)var3 * 2.0D * (double)(var1.j * var1.v + var1.U * var1.M);
      this.T = (double)var3 * 2.0D * (double)(var1.j * var1.M - var1.U * var1.v);
      this.W = (double)var3 * 2.0D * (double)(var1.j * var1.v - var1.U * var1.M);
      this.o = (double)var3 * (1.0D - 2.0D * (double)var1.j * (double)var1.j - 2.0D * (double)var1.M * (double)var1.M);
      this.i = (double)var3 * 2.0D * (double)(var1.v * var1.M + var1.U * var1.j);
      this.l = (double)var3 * 2.0D * (double)(var1.j * var1.M + var1.U * var1.v);
      this.g = (double)var3 * 2.0D * (double)(var1.v * var1.M - var1.U * var1.j);
      this.j = (double)var3 * (1.0D - 2.0D * (double)var1.j * (double)var1.j - 2.0D * (double)var1.v * (double)var1.v);
      this.s = (double)var2.q;
      this.a = (double)var2.Q;
      this.X = (double)var2.G;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void C(bd var1) {
      this.M = (double)var1.i;
      this.W = (double)var1.z;
      this.l = (double)var1.R;
      this.s = (double)var1.s;
      this.h = (double)var1.M;
      this.o = (double)var1.a;
      this.g = (double)var1.k;
      this.a = (double)var1.w;
      this.T = (double)var1.b;
      this.i = (double)var1.G;
      this.j = (double)var1.y;
      this.X = (double)var1.r;
      this.L = (double)var1.W;
      this.r = (double)var1.U;
      this.H = (double)var1.g;
      this.O = (double)var1.S;
   }

   public final void L(we var1) {
      this.M = var1.M;
      this.W = var1.W;
      this.l = var1.l;
      this.s = var1.s;
      this.h = var1.h;
      this.o = var1.o;
      this.g = var1.g;
      this.a = var1.a;
      this.T = var1.T;
      this.i = var1.i;
      this.j = var1.j;
      this.X = var1.X;
      this.L = var1.L;
      this.r = var1.r;
      this.H = var1.H;
      this.O = var1.O;
   }

   public final void K(we var1) {
      this.d(var1);
   }

   public final void p() {
      this.d(this);
   }

   final void d(we var1) {
      double[] var2 = new double[16];
      int[] var3 = new int[4];
      double[] var7 = new double[]{var1.M, var1.W, var1.l, var1.s, var1.h, var1.o, var1.g, var1.a, var1.T, var1.i, var1.j, var1.X, var1.L, var1.r, var1.H, var1.O};
      if(k(var7, var3)) {
         int var4 = 0;

         while(true) {
            var2[var4] = 0.0D;
            ++var4;
         }
      }

      throw new xn(bc.I("Matrix4d10"));
   }

   static boolean k(double[] param0, int[] param1) {
      // $FF: Couldn't be decompiled
   }

   static void B(double[] var0, int[] var1, double[] var2) {
      byte var8 = 0;
      byte var7 = 0;
      byte var9 = var7;
      byte var4 = -1;
      byte var3 = 0;
      int var5 = var1[var8 + var3];
      double var11 = var2[var7 + 4 * var5];
      var2[var7 + 4 * var5] = var2[var7 + 4 * var3];
      int var10 = var3 * 4;
      int var6 = var4;

      while(true) {
         int var10001 = var3 - 1;
         var11 -= var0[var10 + var6] * var2[var9 + 4 * var6];
         ++var6;
      }
   }

   public final double s() {
      double var1 = this.M * (this.o * this.j * this.O + this.g * this.X * this.r + this.a * this.i * this.H - this.a * this.j * this.r - this.o * this.X * this.H - this.g * this.i * this.O);
      var1 = var1 - this.W * (this.h * this.j * this.O + this.g * this.X * this.L + this.a * this.T * this.H - this.a * this.j * this.L - this.h * this.X * this.H - this.g * this.T * this.O);
      var1 = var1 + this.l * (this.h * this.i * this.O + this.o * this.X * this.L + this.a * this.T * this.r - this.a * this.i * this.L - this.h * this.X * this.r - this.o * this.T * this.O);
      var1 = var1 - this.s * (this.h * this.i * this.H + this.o * this.j * this.L + this.g * this.T * this.r - this.g * this.i * this.L - this.h * this.j * this.r - this.o * this.T * this.H);
      return var1;
   }

   public final void k(double var1) {
      this.M = var1;
      this.W = 0.0D;
      this.l = 0.0D;
      this.s = 0.0D;
      this.h = 0.0D;
      this.o = var1;
      this.g = 0.0D;
      this.a = 0.0D;
      this.T = 0.0D;
      this.i = 0.0D;
      this.j = var1;
      this.X = 0.0D;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void F(gp var1) {
      this.M = 1.0D;
      this.W = 0.0D;
      this.l = 0.0D;
      this.s = var1.n;
      this.h = 0.0D;
      this.o = 1.0D;
      this.g = 0.0D;
      this.a = var1.Z;
      this.T = 0.0D;
      this.i = 0.0D;
      this.j = 1.0D;
      this.X = var1.B;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void w(double var1, gp var3) {
      this.M = var1;
      this.W = 0.0D;
      this.l = 0.0D;
      this.s = var3.n;
      this.h = 0.0D;
      this.o = var1;
      this.g = 0.0D;
      this.a = var3.Z;
      this.T = 0.0D;
      this.i = 0.0D;
      this.j = var1;
      this.X = var3.B;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void n(gp var1, double var2) {
      this.M = var2;
      this.W = 0.0D;
      this.l = 0.0D;
      this.s = var2 * var1.n;
      this.h = 0.0D;
      this.o = var2;
      this.g = 0.0D;
      this.a = var2 * var1.Z;
      this.T = 0.0D;
      this.i = 0.0D;
      this.j = var2;
      this.X = var2 * var1.B;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void w(br var1, pv var2, float var3) {
      this.M = (double)(var1.y * var3);
      this.W = (double)(var1.H * var3);
      this.l = (double)(var1.q * var3);
      this.s = (double)var2.q;
      this.h = (double)(var1.e * var3);
      this.o = (double)(var1.Q * var3);
      this.g = (double)(var1.D * var3);
      this.a = (double)var2.Q;
      this.T = (double)(var1.x * var3);
      this.i = (double)(var1.m * var3);
      this.j = (double)(var1.t * var3);
      this.X = (double)var2.G;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void E(_w var1, gp var2, double var3) {
      this.M = var1.u * var3;
      this.W = var1.n * var3;
      this.l = var1.M * var3;
      this.s = var2.n;
      this.h = var1.p * var3;
      this.o = var1.v * var3;
      this.g = var1.P * var3;
      this.a = var2.Z;
      this.T = var1.Z * var3;
      this.i = var1.q * var3;
      this.j = var1.l * var3;
      this.X = var2.B;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void V(gp var1) {
      this.s = var1.n;
      this.a = var1.Z;
      this.X = var1.B;
   }

   public final void y(double var1) {
      double var3 = Math.sin(var1);
      double var5 = Math.cos(var1);
      this.M = 1.0D;
      this.W = 0.0D;
      this.l = 0.0D;
      this.s = 0.0D;
      this.h = 0.0D;
      this.o = var5;
      this.g = -var3;
      this.a = 0.0D;
      this.T = 0.0D;
      this.i = var3;
      this.j = var5;
      this.X = 0.0D;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void B(double var1) {
      double var3 = Math.sin(var1);
      double var5 = Math.cos(var1);
      this.M = var5;
      this.W = 0.0D;
      this.l = var3;
      this.s = 0.0D;
      this.h = 0.0D;
      this.o = 1.0D;
      this.g = 0.0D;
      this.a = 0.0D;
      this.T = -var3;
      this.i = 0.0D;
      this.j = var5;
      this.X = 0.0D;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void A(double var1) {
      double var3 = Math.sin(var1);
      double var5 = Math.cos(var1);
      this.M = var5;
      this.W = -var3;
      this.l = 0.0D;
      this.s = 0.0D;
      this.h = var3;
      this.o = var5;
      this.g = 0.0D;
      this.a = 0.0D;
      this.T = 0.0D;
      this.i = 0.0D;
      this.j = 1.0D;
      this.X = 0.0D;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 1.0D;
   }

   public final void H(double var1) {
      this.M *= var1;
      this.W *= var1;
      this.l *= var1;
      this.s *= var1;
      this.h *= var1;
      this.o *= var1;
      this.g *= var1;
      this.a *= var1;
      this.T *= var1;
      this.i *= var1;
      this.j *= var1;
      this.X *= var1;
      this.L *= var1;
      this.r *= var1;
      this.H *= var1;
      this.O *= var1;
   }

   public final void X(double var1, we var3) {
      this.M = var3.M * var1;
      this.W = var3.W * var1;
      this.l = var3.l * var1;
      this.s = var3.s * var1;
      this.h = var3.h * var1;
      this.o = var3.o * var1;
      this.g = var3.g * var1;
      this.a = var3.a * var1;
      this.T = var3.T * var1;
      this.i = var3.i * var1;
      this.j = var3.j * var1;
      this.X = var3.X * var1;
      this.L = var3.L * var1;
      this.r = var3.r * var1;
      this.H = var3.H * var1;
      this.O = var3.O * var1;
   }

   public final void c(we var1) {
      double var2 = this.M * var1.M + this.W * var1.h + this.l * var1.T + this.s * var1.L;
      double var4 = this.M * var1.W + this.W * var1.o + this.l * var1.i + this.s * var1.r;
      double var6 = this.M * var1.l + this.W * var1.g + this.l * var1.j + this.s * var1.H;
      double var8 = this.M * var1.s + this.W * var1.a + this.l * var1.X + this.s * var1.O;
      double var10 = this.h * var1.M + this.o * var1.h + this.g * var1.T + this.a * var1.L;
      double var12 = this.h * var1.W + this.o * var1.o + this.g * var1.i + this.a * var1.r;
      double var14 = this.h * var1.l + this.o * var1.g + this.g * var1.j + this.a * var1.H;
      double var16 = this.h * var1.s + this.o * var1.a + this.g * var1.X + this.a * var1.O;
      double var18 = this.T * var1.M + this.i * var1.h + this.j * var1.T + this.X * var1.L;
      double var20 = this.T * var1.W + this.i * var1.o + this.j * var1.i + this.X * var1.r;
      double var22 = this.T * var1.l + this.i * var1.g + this.j * var1.j + this.X * var1.H;
      double var24 = this.T * var1.s + this.i * var1.a + this.j * var1.X + this.X * var1.O;
      double var26 = this.L * var1.M + this.r * var1.h + this.H * var1.T + this.O * var1.L;
      double var28 = this.L * var1.W + this.r * var1.o + this.H * var1.i + this.O * var1.r;
      double var30 = this.L * var1.l + this.r * var1.g + this.H * var1.j + this.O * var1.H;
      double var32 = this.L * var1.s + this.r * var1.a + this.H * var1.X + this.O * var1.O;
      this.M = var2;
      this.W = var4;
      this.l = var6;
      this.s = var8;
      this.h = var10;
      this.o = var12;
      this.g = var14;
      this.a = var16;
      this.T = var18;
      this.i = var20;
      this.j = var22;
      this.X = var24;
      this.L = var26;
      this.r = var28;
      this.H = var30;
      this.O = var32;
   }

   public final void T(we var1, we var2) {
      if(this != var1 && this != var2) {
         this.M = var1.M * var2.M + var1.W * var2.h + var1.l * var2.T + var1.s * var2.L;
         this.W = var1.M * var2.W + var1.W * var2.o + var1.l * var2.i + var1.s * var2.r;
         this.l = var1.M * var2.l + var1.W * var2.g + var1.l * var2.j + var1.s * var2.H;
         this.s = var1.M * var2.s + var1.W * var2.a + var1.l * var2.X + var1.s * var2.O;
         this.h = var1.h * var2.M + var1.o * var2.h + var1.g * var2.T + var1.a * var2.L;
         this.o = var1.h * var2.W + var1.o * var2.o + var1.g * var2.i + var1.a * var2.r;
         this.g = var1.h * var2.l + var1.o * var2.g + var1.g * var2.j + var1.a * var2.H;
         this.a = var1.h * var2.s + var1.o * var2.a + var1.g * var2.X + var1.a * var2.O;
         this.T = var1.T * var2.M + var1.i * var2.h + var1.j * var2.T + var1.X * var2.L;
         this.i = var1.T * var2.W + var1.i * var2.o + var1.j * var2.i + var1.X * var2.r;
         this.j = var1.T * var2.l + var1.i * var2.g + var1.j * var2.j + var1.X * var2.H;
         this.X = var1.T * var2.s + var1.i * var2.a + var1.j * var2.X + var1.X * var2.O;
         this.L = var1.L * var2.M + var1.r * var2.h + var1.H * var2.T + var1.O * var2.L;
         this.r = var1.L * var2.W + var1.r * var2.o + var1.H * var2.i + var1.O * var2.r;
         this.H = var1.L * var2.l + var1.r * var2.g + var1.H * var2.j + var1.O * var2.H;
         this.O = var1.L * var2.s + var1.r * var2.a + var1.H * var2.X + var1.O * var2.O;
      } else {
         double var3 = var1.M * var2.M + var1.W * var2.h + var1.l * var2.T + var1.s * var2.L;
         double var5 = var1.M * var2.W + var1.W * var2.o + var1.l * var2.i + var1.s * var2.r;
         double var7 = var1.M * var2.l + var1.W * var2.g + var1.l * var2.j + var1.s * var2.H;
         double var9 = var1.M * var2.s + var1.W * var2.a + var1.l * var2.X + var1.s * var2.O;
         double var11 = var1.h * var2.M + var1.o * var2.h + var1.g * var2.T + var1.a * var2.L;
         double var13 = var1.h * var2.W + var1.o * var2.o + var1.g * var2.i + var1.a * var2.r;
         double var15 = var1.h * var2.l + var1.o * var2.g + var1.g * var2.j + var1.a * var2.H;
         double var17 = var1.h * var2.s + var1.o * var2.a + var1.g * var2.X + var1.a * var2.O;
         double var19 = var1.T * var2.M + var1.i * var2.h + var1.j * var2.T + var1.X * var2.L;
         double var21 = var1.T * var2.W + var1.i * var2.o + var1.j * var2.i + var1.X * var2.r;
         double var23 = var1.T * var2.l + var1.i * var2.g + var1.j * var2.j + var1.X * var2.H;
         double var25 = var1.T * var2.s + var1.i * var2.a + var1.j * var2.X + var1.X * var2.O;
         double var27 = var1.L * var2.M + var1.r * var2.h + var1.H * var2.T + var1.O * var2.L;
         double var29 = var1.L * var2.W + var1.r * var2.o + var1.H * var2.i + var1.O * var2.r;
         double var31 = var1.L * var2.l + var1.r * var2.g + var1.H * var2.j + var1.O * var2.H;
         double var33 = var1.L * var2.s + var1.r * var2.a + var1.H * var2.X + var1.O * var2.O;
         this.M = var3;
         this.W = var5;
         this.l = var7;
         this.s = var9;
         this.h = var11;
         this.o = var13;
         this.g = var15;
         this.a = var17;
         this.T = var19;
         this.i = var21;
         this.j = var23;
         this.X = var25;
         this.L = var27;
         this.r = var29;
         this.H = var31;
         this.O = var33;
      }

   }

   public final void t(we var1, we var2) {
      if(this != var1 && this != var2) {
         this.M = var1.M * var2.M + var1.h * var2.W + var1.T * var2.l + var1.L * var2.s;
         this.W = var1.M * var2.h + var1.h * var2.o + var1.T * var2.g + var1.L * var2.a;
         this.l = var1.M * var2.T + var1.h * var2.i + var1.T * var2.j + var1.L * var2.X;
         this.s = var1.M * var2.L + var1.h * var2.r + var1.T * var2.H + var1.L * var2.O;
         this.h = var1.W * var2.M + var1.o * var2.W + var1.i * var2.l + var1.r * var2.s;
         this.o = var1.W * var2.h + var1.o * var2.o + var1.i * var2.g + var1.r * var2.a;
         this.g = var1.W * var2.T + var1.o * var2.i + var1.i * var2.j + var1.r * var2.X;
         this.a = var1.W * var2.L + var1.o * var2.r + var1.i * var2.H + var1.r * var2.O;
         this.T = var1.l * var2.M + var1.g * var2.W + var1.j * var2.l + var1.H * var2.s;
         this.i = var1.l * var2.h + var1.g * var2.o + var1.j * var2.g + var1.H * var2.a;
         this.j = var1.l * var2.T + var1.g * var2.i + var1.j * var2.j + var1.H * var2.X;
         this.X = var1.l * var2.L + var1.g * var2.r + var1.j * var2.H + var1.H * var2.O;
         this.L = var1.s * var2.M + var1.a * var2.W + var1.X * var2.l + var1.O * var2.s;
         this.r = var1.s * var2.h + var1.a * var2.o + var1.X * var2.g + var1.O * var2.a;
         this.H = var1.s * var2.T + var1.a * var2.i + var1.X * var2.j + var1.O * var2.X;
         this.O = var1.s * var2.L + var1.a * var2.r + var1.X * var2.H + var1.O * var2.O;
      } else {
         double var3 = var1.M * var2.M + var1.h * var2.W + var1.T * var2.l + var1.L * var2.s;
         double var5 = var1.M * var2.h + var1.h * var2.o + var1.T * var2.g + var1.L * var2.a;
         double var7 = var1.M * var2.T + var1.h * var2.i + var1.T * var2.j + var1.L * var2.X;
         double var9 = var1.M * var2.L + var1.h * var2.r + var1.T * var2.H + var1.L * var2.O;
         double var11 = var1.W * var2.M + var1.o * var2.W + var1.i * var2.l + var1.r * var2.s;
         double var13 = var1.W * var2.h + var1.o * var2.o + var1.i * var2.g + var1.r * var2.a;
         double var15 = var1.W * var2.T + var1.o * var2.i + var1.i * var2.j + var1.r * var2.X;
         double var17 = var1.W * var2.L + var1.o * var2.r + var1.i * var2.H + var1.r * var2.O;
         double var19 = var1.l * var2.M + var1.g * var2.W + var1.j * var2.l + var1.H * var2.s;
         double var21 = var1.l * var2.h + var1.g * var2.o + var1.j * var2.g + var1.H * var2.a;
         double var23 = var1.l * var2.T + var1.g * var2.i + var1.j * var2.j + var1.H * var2.X;
         double var25 = var1.l * var2.L + var1.g * var2.r + var1.j * var2.H + var1.H * var2.O;
         double var27 = var1.s * var2.M + var1.a * var2.W + var1.X * var2.l + var1.O * var2.s;
         double var29 = var1.s * var2.h + var1.a * var2.o + var1.X * var2.g + var1.O * var2.a;
         double var31 = var1.s * var2.T + var1.a * var2.i + var1.X * var2.j + var1.O * var2.X;
         double var33 = var1.s * var2.L + var1.a * var2.r + var1.X * var2.H + var1.O * var2.O;
         this.M = var3;
         this.W = var5;
         this.l = var7;
         this.s = var9;
         this.h = var11;
         this.o = var13;
         this.g = var15;
         this.a = var17;
         this.T = var19;
         this.i = var21;
         this.j = var23;
         this.X = var25;
         this.L = var27;
         this.r = var29;
         this.H = var31;
         this.O = var33;
      }

   }

   public final void Z(we var1, we var2) {
      String[] var3 = ra.C();
      if(this != var1 && this != var2) {
         this.M = var1.M * var2.M + var1.W * var2.W + var1.l * var2.l + var1.s * var2.s;
         this.W = var1.M * var2.h + var1.W * var2.o + var1.l * var2.g + var1.s * var2.a;
         this.l = var1.M * var2.T + var1.W * var2.i + var1.l * var2.j + var1.s * var2.X;
         this.s = var1.M * var2.L + var1.W * var2.r + var1.l * var2.H + var1.s * var2.O;
         this.h = var1.h * var2.M + var1.o * var2.W + var1.g * var2.l + var1.a * var2.s;
         this.o = var1.h * var2.h + var1.o * var2.o + var1.g * var2.g + var1.a * var2.a;
         this.g = var1.h * var2.T + var1.o * var2.i + var1.g * var2.j + var1.a * var2.X;
         this.a = var1.h * var2.L + var1.o * var2.r + var1.g * var2.H + var1.a * var2.O;
         this.T = var1.T * var2.M + var1.i * var2.W + var1.j * var2.l + var1.X * var2.s;
         this.i = var1.T * var2.h + var1.i * var2.o + var1.j * var2.g + var1.X * var2.a;
         this.j = var1.T * var2.T + var1.i * var2.i + var1.j * var2.j + var1.X * var2.X;
         this.X = var1.T * var2.L + var1.i * var2.r + var1.j * var2.H + var1.X * var2.O;
         this.L = var1.L * var2.M + var1.r * var2.W + var1.H * var2.l + var1.O * var2.s;
         this.r = var1.L * var2.h + var1.r * var2.o + var1.H * var2.g + var1.O * var2.a;
         this.H = var1.L * var2.T + var1.r * var2.i + var1.H * var2.j + var1.O * var2.X;
         this.O = var1.L * var2.L + var1.r * var2.r + var1.H * var2.H + var1.O * var2.O;
      }

      double var4 = var1.M * var2.M + var1.W * var2.W + var1.l * var2.l + var1.s * var2.s;
      double var6 = var1.M * var2.h + var1.W * var2.o + var1.l * var2.g + var1.s * var2.a;
      double var8 = var1.M * var2.T + var1.W * var2.i + var1.l * var2.j + var1.s * var2.X;
      double var10 = var1.M * var2.L + var1.W * var2.r + var1.l * var2.H + var1.s * var2.O;
      double var12 = var1.h * var2.M + var1.o * var2.W + var1.g * var2.l + var1.a * var2.s;
      double var14 = var1.h * var2.h + var1.o * var2.o + var1.g * var2.g + var1.a * var2.a;
      double var16 = var1.h * var2.T + var1.o * var2.i + var1.g * var2.j + var1.a * var2.X;
      double var18 = var1.h * var2.L + var1.o * var2.r + var1.g * var2.H + var1.a * var2.O;
      double var20 = var1.T * var2.M + var1.i * var2.W + var1.j * var2.l + var1.X * var2.s;
      double var22 = var1.T * var2.h + var1.i * var2.o + var1.j * var2.g + var1.X * var2.a;
      double var24 = var1.T * var2.T + var1.i * var2.i + var1.j * var2.j + var1.X * var2.X;
      double var26 = var1.T * var2.L + var1.i * var2.r + var1.j * var2.H + var1.X * var2.O;
      double var28 = var1.L * var2.M + var1.r * var2.W + var1.H * var2.l + var1.O * var2.s;
      double var30 = var1.L * var2.h + var1.r * var2.o + var1.H * var2.g + var1.O * var2.a;
      double var32 = var1.L * var2.T + var1.r * var2.i + var1.H * var2.j + var1.O * var2.X;
      double var34 = var1.L * var2.L + var1.r * var2.r + var1.H * var2.H + var1.O * var2.O;
      this.M = var4;
      this.W = var6;
      this.l = var8;
      this.s = var10;
      this.h = var12;
      this.o = var14;
      this.g = var16;
      this.a = var18;
      this.T = var20;
      this.i = var22;
      this.j = var24;
      this.X = var26;
      this.L = var28;
      this.r = var30;
      this.H = var32;
      this.O = var34;
      if(d.y() == null) {
         ra.w(new String[1]);
      }

   }

   public final void x(we var1, we var2) {
      if(this != var1 && this != var2) {
         this.M = var1.M * var2.M + var1.h * var2.h + var1.T * var2.T + var1.L * var2.L;
         this.W = var1.M * var2.W + var1.h * var2.o + var1.T * var2.i + var1.L * var2.r;
         this.l = var1.M * var2.l + var1.h * var2.g + var1.T * var2.j + var1.L * var2.H;
         this.s = var1.M * var2.s + var1.h * var2.a + var1.T * var2.X + var1.L * var2.O;
         this.h = var1.W * var2.M + var1.o * var2.h + var1.i * var2.T + var1.r * var2.L;
         this.o = var1.W * var2.W + var1.o * var2.o + var1.i * var2.i + var1.r * var2.r;
         this.g = var1.W * var2.l + var1.o * var2.g + var1.i * var2.j + var1.r * var2.H;
         this.a = var1.W * var2.s + var1.o * var2.a + var1.i * var2.X + var1.r * var2.O;
         this.T = var1.l * var2.M + var1.g * var2.h + var1.j * var2.T + var1.H * var2.L;
         this.i = var1.l * var2.W + var1.g * var2.o + var1.j * var2.i + var1.H * var2.r;
         this.j = var1.l * var2.l + var1.g * var2.g + var1.j * var2.j + var1.H * var2.H;
         this.X = var1.l * var2.s + var1.g * var2.a + var1.j * var2.X + var1.H * var2.O;
         this.L = var1.s * var2.M + var1.a * var2.h + var1.X * var2.T + var1.O * var2.L;
         this.r = var1.s * var2.W + var1.a * var2.o + var1.X * var2.i + var1.O * var2.r;
         this.H = var1.s * var2.l + var1.a * var2.g + var1.X * var2.j + var1.O * var2.H;
         this.O = var1.s * var2.s + var1.a * var2.a + var1.X * var2.X + var1.O * var2.O;
      } else {
         double var3 = var1.M * var2.M + var1.h * var2.h + var1.T * var2.T + var1.L * var2.L;
         double var5 = var1.M * var2.W + var1.h * var2.o + var1.T * var2.i + var1.L * var2.r;
         double var7 = var1.M * var2.l + var1.h * var2.g + var1.T * var2.j + var1.L * var2.H;
         double var9 = var1.M * var2.s + var1.h * var2.a + var1.T * var2.X + var1.L * var2.O;
         double var11 = var1.W * var2.M + var1.o * var2.h + var1.i * var2.T + var1.r * var2.L;
         double var13 = var1.W * var2.W + var1.o * var2.o + var1.i * var2.i + var1.r * var2.r;
         double var15 = var1.W * var2.l + var1.o * var2.g + var1.i * var2.j + var1.r * var2.H;
         double var17 = var1.W * var2.s + var1.o * var2.a + var1.i * var2.X + var1.r * var2.O;
         double var19 = var1.l * var2.M + var1.g * var2.h + var1.j * var2.T + var1.H * var2.L;
         double var21 = var1.l * var2.W + var1.g * var2.o + var1.j * var2.i + var1.H * var2.r;
         double var23 = var1.l * var2.l + var1.g * var2.g + var1.j * var2.j + var1.H * var2.H;
         double var25 = var1.l * var2.s + var1.g * var2.a + var1.j * var2.X + var1.H * var2.O;
         double var27 = var1.s * var2.M + var1.a * var2.h + var1.X * var2.T + var1.O * var2.L;
         double var29 = var1.s * var2.W + var1.a * var2.o + var1.X * var2.i + var1.O * var2.r;
         double var31 = var1.s * var2.l + var1.a * var2.g + var1.X * var2.j + var1.O * var2.H;
         double var33 = var1.s * var2.s + var1.a * var2.a + var1.X * var2.X + var1.O * var2.O;
         this.M = var3;
         this.W = var5;
         this.l = var7;
         this.s = var9;
         this.h = var11;
         this.o = var13;
         this.g = var15;
         this.a = var17;
         this.T = var19;
         this.i = var21;
         this.j = var23;
         this.X = var25;
         this.L = var27;
         this.r = var29;
         this.H = var31;
         this.O = var33;
      }

   }

   public boolean w(we var1) {
      return this.M == var1.M && this.W == var1.W && this.l == var1.l && this.s == var1.s && this.h == var1.h && this.o == var1.o && this.g == var1.g && this.a == var1.a && this.T == var1.T && this.i == var1.i && this.j == var1.j && this.X == var1.X && this.L == var1.L && this.r == var1.r && this.H == var1.H && this.O == var1.O;
   }

   public boolean equals(Object var1) {
      we var2 = (we)var1;
      return this.M == var2.M && this.W == var2.W && this.l == var2.l && this.s == var2.s && this.h == var2.h && this.o == var2.o && this.g == var2.g && this.a == var2.a && this.T == var2.T && this.i == var2.i && this.j == var2.j && this.X == var2.X && this.L == var2.L && this.r == var2.r && this.H == var2.H && this.O == var2.O;
   }

   /** @deprecated */
   public boolean h(we var1, float var2) {
      return this.E(var1, (double)var2);
   }

   public boolean E(we var1, double var2) {
      double var4 = this.M - var1.M;
      if((var4 < 0.0D?-var4:var4) > var2) {
         return false;
      } else {
         var4 = this.W - var1.W;
         if((var4 < 0.0D?-var4:var4) > var2) {
            return false;
         } else {
            var4 = this.l - var1.l;
            if((var4 < 0.0D?-var4:var4) > var2) {
               return false;
            } else {
               var4 = this.s - var1.s;
               if((var4 < 0.0D?-var4:var4) > var2) {
                  return false;
               } else {
                  var4 = this.h - var1.h;
                  if((var4 < 0.0D?-var4:var4) > var2) {
                     return false;
                  } else {
                     var4 = this.o - var1.o;
                     if((var4 < 0.0D?-var4:var4) > var2) {
                        return false;
                     } else {
                        var4 = this.g - var1.g;
                        if((var4 < 0.0D?-var4:var4) > var2) {
                           return false;
                        } else {
                           var4 = this.a - var1.a;
                           if((var4 < 0.0D?-var4:var4) > var2) {
                              return false;
                           } else {
                              var4 = this.T - var1.T;
                              if((var4 < 0.0D?-var4:var4) > var2) {
                                 return false;
                              } else {
                                 var4 = this.i - var1.i;
                                 if((var4 < 0.0D?-var4:var4) > var2) {
                                    return false;
                                 } else {
                                    var4 = this.j - var1.j;
                                    if((var4 < 0.0D?-var4:var4) > var2) {
                                       return false;
                                    } else {
                                       var4 = this.X - var1.X;
                                       if((var4 < 0.0D?-var4:var4) > var2) {
                                          return false;
                                       } else {
                                          var4 = this.L - var1.L;
                                          if((var4 < 0.0D?-var4:var4) > var2) {
                                             return false;
                                          } else {
                                             var4 = this.r - var1.r;
                                             if((var4 < 0.0D?-var4:var4) > var2) {
                                                return false;
                                             } else {
                                                var4 = this.H - var1.H;
                                                if((var4 < 0.0D?-var4:var4) > var2) {
                                                   return false;
                                                } else {
                                                   var4 = this.O - var1.O;
                                                   return (var4 < 0.0D?-var4:var4) <= var2;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public int hashCode() {
      long var1 = 1L;
      var1 = op.l(var1, this.M);
      var1 = op.l(var1, this.W);
      var1 = op.l(var1, this.l);
      var1 = op.l(var1, this.s);
      var1 = op.l(var1, this.h);
      var1 = op.l(var1, this.o);
      var1 = op.l(var1, this.g);
      var1 = op.l(var1, this.a);
      var1 = op.l(var1, this.T);
      var1 = op.l(var1, this.i);
      var1 = op.l(var1, this.j);
      var1 = op.l(var1, this.X);
      var1 = op.l(var1, this.L);
      var1 = op.l(var1, this.r);
      var1 = op.l(var1, this.H);
      var1 = op.l(var1, this.O);
      return op.K(var1);
   }

   public final void e(uo var1, uo var2) {
      double var3 = this.M * var1.M + this.W * var1.b + this.l * var1.G + this.s * var1.d;
      double var5 = this.h * var1.M + this.o * var1.b + this.g * var1.G + this.a * var1.d;
      double var7 = this.T * var1.M + this.i * var1.b + this.j * var1.G + this.X * var1.d;
      var2.d = this.L * var1.M + this.r * var1.b + this.H * var1.G + this.O * var1.d;
      var2.M = var3;
      var2.b = var5;
      var2.G = var7;
   }

   public final void O(uo var1) {
      double var2 = this.M * var1.M + this.W * var1.b + this.l * var1.G + this.s * var1.d;
      double var4 = this.h * var1.M + this.o * var1.b + this.g * var1.G + this.a * var1.d;
      double var6 = this.T * var1.M + this.i * var1.b + this.j * var1.G + this.X * var1.d;
      var1.d = this.L * var1.M + this.r * var1.b + this.H * var1.G + this.O * var1.d;
      var1.M = var2;
      var1.b = var4;
      var1.G = var6;
   }

   public final void e(ra var1, ra var2) {
      float var3 = (float)(this.M * (double)var1.j + this.W * (double)var1.v + this.l * (double)var1.M + this.s * (double)var1.U);
      float var4 = (float)(this.h * (double)var1.j + this.o * (double)var1.v + this.g * (double)var1.M + this.a * (double)var1.U);
      float var5 = (float)(this.T * (double)var1.j + this.i * (double)var1.v + this.j * (double)var1.M + this.X * (double)var1.U);
      var2.U = (float)(this.L * (double)var1.j + this.r * (double)var1.v + this.H * (double)var1.M + this.O * (double)var1.U);
      var2.j = var3;
      var2.v = var4;
      var2.M = var5;
   }

   public final void T(ra var1) {
      float var2 = (float)(this.M * (double)var1.j + this.W * (double)var1.v + this.l * (double)var1.M + this.s * (double)var1.U);
      float var3 = (float)(this.h * (double)var1.j + this.o * (double)var1.v + this.g * (double)var1.M + this.a * (double)var1.U);
      float var4 = (float)(this.T * (double)var1.j + this.i * (double)var1.v + this.j * (double)var1.M + this.X * (double)var1.U);
      var1.U = (float)(this.L * (double)var1.j + this.r * (double)var1.v + this.H * (double)var1.M + this.O * (double)var1.U);
      var1.j = var2;
      var1.v = var3;
      var1.M = var4;
   }

   public final void h(gl var1, gl var2) {
      double var3 = this.M * var1.n + this.W * var1.Z + this.l * var1.B + this.s;
      double var5 = this.h * var1.n + this.o * var1.Z + this.g * var1.B + this.a;
      var2.B = this.T * var1.n + this.i * var1.Z + this.j * var1.B + this.X;
      var2.n = var3;
      var2.Z = var5;
   }

   public final void c(gl var1) {
      double var2 = this.M * var1.n + this.W * var1.Z + this.l * var1.B + this.s;
      double var4 = this.h * var1.n + this.o * var1.Z + this.g * var1.B + this.a;
      var1.B = this.T * var1.n + this.i * var1.Z + this.j * var1.B + this.X;
      var1.n = var2;
      var1.Z = var4;
   }

   public final void R(x5 var1, x5 var2) {
      float var3 = (float)(this.M * (double)var1.q + this.W * (double)var1.Q + this.l * (double)var1.G + this.s);
      float var4 = (float)(this.h * (double)var1.q + this.o * (double)var1.Q + this.g * (double)var1.G + this.a);
      var2.G = (float)(this.T * (double)var1.q + this.i * (double)var1.Q + this.j * (double)var1.G + this.X);
      var2.q = var3;
      var2.Q = var4;
   }

   public final void m(x5 var1) {
      float var2 = (float)(this.M * (double)var1.q + this.W * (double)var1.Q + this.l * (double)var1.G + this.s);
      float var3 = (float)(this.h * (double)var1.q + this.o * (double)var1.Q + this.g * (double)var1.G + this.a);
      var1.G = (float)(this.T * (double)var1.q + this.i * (double)var1.Q + this.j * (double)var1.G + this.X);
      var1.q = var2;
      var1.Q = var3;
   }

   public final void T(gp var1, gp var2) {
      double var3 = this.M * var1.n + this.W * var1.Z + this.l * var1.B;
      double var5 = this.h * var1.n + this.o * var1.Z + this.g * var1.B;
      var2.B = this.T * var1.n + this.i * var1.Z + this.j * var1.B;
      var2.n = var3;
      var2.Z = var5;
   }

   public final void i(gp var1) {
      double var2 = this.M * var1.n + this.W * var1.Z + this.l * var1.B;
      double var4 = this.h * var1.n + this.o * var1.Z + this.g * var1.B;
      var1.B = this.T * var1.n + this.i * var1.Z + this.j * var1.B;
      var1.n = var2;
      var1.Z = var4;
   }

   public final void F(pv var1, pv var2) {
      float var3 = (float)(this.M * (double)var1.q + this.W * (double)var1.Q + this.l * (double)var1.G);
      float var4 = (float)(this.h * (double)var1.q + this.o * (double)var1.Q + this.g * (double)var1.G);
      var2.G = (float)(this.T * (double)var1.q + this.i * (double)var1.Q + this.j * (double)var1.G);
      var2.q = var3;
      var2.Q = var4;
   }

   public final void N(pv var1) {
      float var2 = (float)(this.M * (double)var1.q + this.W * (double)var1.Q + this.l * (double)var1.G);
      float var3 = (float)(this.h * (double)var1.q + this.o * (double)var1.Q + this.g * (double)var1.G);
      var1.G = (float)(this.T * (double)var1.q + this.i * (double)var1.Q + this.j * (double)var1.G);
      var1.q = var2;
      var1.Q = var3;
   }

   public final void V(_w var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.P(var3, var2);
      this.M = var1.u * var3[0];
      this.W = var1.n * var3[1];
      this.l = var1.M * var3[2];
      this.h = var1.p * var3[0];
      this.o = var1.v * var3[1];
      this.g = var1.P * var3[2];
      this.T = var1.Z * var3[0];
      this.i = var1.q * var3[1];
      this.j = var1.l * var3[2];
   }

   public final void a(br var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.P(var3, var2);
      this.M = (double)var1.y * var3[0];
      this.W = (double)var1.H * var3[1];
      this.l = (double)var1.q * var3[2];
      this.h = (double)var1.e * var3[0];
      this.o = (double)var1.Q * var3[1];
      this.g = (double)var1.D * var3[2];
      this.T = (double)var1.x * var3[0];
      this.i = (double)var1.m * var3[1];
      this.j = (double)var1.t * var3[2];
   }

   public final void P(rk var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.P(var3, var2);
      this.M = (1.0D - (double)(2.0F * var1.v * var1.v) - (double)(2.0F * var1.M * var1.M)) * var3[0];
      this.h = 2.0D * (double)(var1.j * var1.v + var1.U * var1.M) * var3[0];
      this.T = 2.0D * (double)(var1.j * var1.M - var1.U * var1.v) * var3[0];
      this.W = 2.0D * (double)(var1.j * var1.v - var1.U * var1.M) * var3[1];
      this.o = (1.0D - (double)(2.0F * var1.j * var1.j) - (double)(2.0F * var1.M * var1.M)) * var3[1];
      this.i = 2.0D * (double)(var1.v * var1.M + var1.U * var1.j) * var3[1];
      this.l = 2.0D * (double)(var1.j * var1.M + var1.U * var1.v) * var3[2];
      this.g = 2.0D * (double)(var1.v * var1.M - var1.U * var1.j) * var3[2];
      this.j = (1.0D - (double)(2.0F * var1.j * var1.j) - (double)(2.0F * var1.v * var1.v)) * var3[2];
   }

   public final void c(up var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.P(var3, var2);
      this.M = (1.0D - 2.0D * var1.b * var1.b - 2.0D * var1.G * var1.G) * var3[0];
      this.h = 2.0D * (var1.M * var1.b + var1.d * var1.G) * var3[0];
      this.T = 2.0D * (var1.M * var1.G - var1.d * var1.b) * var3[0];
      this.W = 2.0D * (var1.M * var1.b - var1.d * var1.G) * var3[1];
      this.o = (1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.G * var1.G) * var3[1];
      this.i = 2.0D * (var1.b * var1.G + var1.d * var1.M) * var3[1];
      this.l = 2.0D * (var1.M * var1.G + var1.d * var1.b) * var3[2];
      this.g = 2.0D * (var1.b * var1.G - var1.d * var1.M) * var3[2];
      this.j = (1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.b * var1.b) * var3[2];
   }

   public final void P(mt var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.P(var3, var2);
      double var4 = 1.0D / Math.sqrt(var1.b * var1.b + var1.C * var1.C + var1.L * var1.L);
      double var6 = var1.b * var4;
      double var8 = var1.C * var4;
      double var10 = var1.L * var4;
      double var12 = Math.sin(var1.m);
      double var14 = Math.cos(var1.m);
      double var16 = 1.0D - var14;
      double var18 = var1.b * var1.L;
      double var20 = var1.b * var1.C;
      double var22 = var1.C * var1.L;
      this.M = (var16 * var6 * var6 + var14) * var3[0];
      this.W = (var16 * var20 - var12 * var10) * var3[1];
      this.l = (var16 * var18 + var12 * var8) * var3[2];
      this.h = (var16 * var20 + var12 * var10) * var3[0];
      this.o = (var16 * var8 * var8 + var14) * var3[1];
      this.g = (var16 * var22 - var12 * var6) * var3[2];
      this.T = (var16 * var18 - var12 * var8) * var3[0];
      this.i = (var16 * var22 + var12 * var6) * var3[1];
      this.j = (var16 * var10 * var10 + var14) * var3[2];
   }

   public final void f() {
      this.M = 0.0D;
      this.W = 0.0D;
      this.l = 0.0D;
      this.s = 0.0D;
      this.h = 0.0D;
      this.o = 0.0D;
      this.g = 0.0D;
      this.a = 0.0D;
      this.T = 0.0D;
      this.i = 0.0D;
      this.j = 0.0D;
      this.X = 0.0D;
      this.L = 0.0D;
      this.r = 0.0D;
      this.H = 0.0D;
      this.O = 0.0D;
   }

   public final void O() {
      this.M = -this.M;
      this.W = -this.W;
      this.l = -this.l;
      this.s = -this.s;
      this.h = -this.h;
      this.o = -this.o;
      this.g = -this.g;
      this.a = -this.a;
      this.T = -this.T;
      this.i = -this.i;
      this.j = -this.j;
      this.X = -this.X;
      this.L = -this.L;
      this.r = -this.r;
      this.H = -this.H;
      this.O = -this.O;
   }

   public final void S(we var1) {
      this.M = -var1.M;
      this.W = -var1.W;
      this.l = -var1.l;
      this.s = -var1.s;
      this.h = -var1.h;
      this.o = -var1.o;
      this.g = -var1.g;
      this.a = -var1.a;
      this.T = -var1.T;
      this.i = -var1.i;
      this.j = -var1.j;
      this.X = -var1.X;
      this.L = -var1.L;
      this.r = -var1.r;
      this.H = -var1.H;
      this.O = -var1.O;
   }

   private final void P(double[] var1, double[] var2) {
      double[] var3 = new double[]{this.M, this.W, this.l, this.h, this.o, this.g, this.T, this.i, this.j};
      _w.g(var3, var1, var2);
   }

   public Object clone() {
      we var1 = null;
      var1 = (we)super.clone();
      return var1;
   }

   public final double v() {
      return this.M;
   }

   public final void N(double var1) {
      this.M = var1;
   }

   public final double d() {
      return this.W;
   }

   public final void G(double var1) {
      this.W = var1;
   }

   public final double F() {
      return this.l;
   }

   public final void s(double var1) {
      this.l = var1;
   }

   public final double E() {
      return this.h;
   }

   public final void Y(double var1) {
      this.h = var1;
   }

   public final double i() {
      return this.o;
   }

   public final void c(double var1) {
      this.o = var1;
   }

   public final double M() {
      return this.g;
   }

   public final void v(double var1) {
      this.g = var1;
   }

   public final double O() {
      return this.T;
   }

   public final void C(double var1) {
      this.T = var1;
   }

   public final double P() {
      return this.i;
   }

   public final void r(double var1) {
      this.i = var1;
   }

   public final double Y() {
      return this.j;
   }

   public final void O(double var1) {
      this.j = var1;
   }

   public final double r() {
      return this.s;
   }

   public final void D(double var1) {
      this.s = var1;
   }

   public final double S() {
      return this.a;
   }

   public final void L(double var1) {
      this.a = var1;
   }

   public final double I() {
      return this.X;
   }

   public final void P(double var1) {
      this.X = var1;
   }

   public final double u() {
      return this.L;
   }

   public final void p(double var1) {
      this.L = var1;
   }

   public final double b() {
      return this.r;
   }

   public final void n(double var1) {
      this.r = var1;
   }

   public final double y() {
      return this.H;
   }

   public final void S(double var1) {
      this.H = var1;
   }

   public final double f() {
      return this.O;
   }

   public final void a(double var1) {
      this.O = var1;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
