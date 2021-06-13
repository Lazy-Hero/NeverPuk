package net;

import java.io.Serializable;
import net.bc;
import net.br;
import net.go;
import net.gp;
import net.mt;
import net.ok;
import net.op;
import net.ra;
import net.rk;
import net.up;
import net.xn;

public class _w implements Serializable, Cloneable {
   static final long serialVersionUID = 6837536777072402710L;
   public double u;
   public double n;
   public double M;
   public double p;
   public double v;
   public double P;
   public double Z;
   public double q;
   public double l;
   private static final double o = 1.110223024E-16D;

   public _w(double var1, double var3, double var5, double var7, double var9, double var11, double var13, double var15, double var17) {
      this.u = var1;
      this.n = var3;
      this.M = var5;
      this.p = var7;
      this.v = var9;
      this.P = var11;
      this.Z = var13;
      this.q = var15;
      this.l = var17;
   }

   public _w(double[] var1) {
      this.u = var1[0];
      this.n = var1[1];
      this.M = var1[2];
      this.p = var1[3];
      this.v = var1[4];
      this.P = var1[5];
      this.Z = var1[6];
      this.q = var1[7];
      this.l = var1[8];
   }

   public _w(_w var1) {
      this.u = var1.u;
      this.n = var1.n;
      this.M = var1.M;
      this.p = var1.p;
      this.v = var1.v;
      this.P = var1.P;
      this.Z = var1.Z;
      this.q = var1.q;
      this.l = var1.l;
   }

   public _w(br var1) {
      this.u = (double)var1.y;
      this.n = (double)var1.H;
      this.M = (double)var1.q;
      this.p = (double)var1.e;
      this.v = (double)var1.Q;
      this.P = (double)var1.D;
      this.Z = (double)var1.x;
      this.q = (double)var1.m;
      this.l = (double)var1.t;
   }

   public _w() {
      this.u = 0.0D;
      this.n = 0.0D;
      this.M = 0.0D;
      this.p = 0.0D;
      this.v = 0.0D;
      this.P = 0.0D;
      this.Z = 0.0D;
      this.q = 0.0D;
      this.l = 0.0D;
   }

   public String toString() {
      return this.u + ", " + this.n + ", " + this.M + "\n" + this.p + ", " + this.v + ", " + this.P + "\n" + this.Z + ", " + this.q + ", " + this.l + "\n";
   }

   public final void s() {
      this.u = 1.0D;
      this.n = 0.0D;
      this.M = 0.0D;
      this.p = 0.0D;
      this.v = 1.0D;
      this.P = 0.0D;
      this.Z = 0.0D;
      this.q = 0.0D;
      this.l = 1.0D;
   }

   public final void U(double var1) {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.h(var4, var3);
      this.u = var3[0] * var1;
      this.n = var3[1] * var1;
      this.M = var3[2] * var1;
      this.p = var3[3] * var1;
      this.v = var3[4] * var1;
      this.P = var3[5] * var1;
      this.Z = var3[6] * var1;
      this.q = var3[7] * var1;
      this.l = var3[8] * var1;
   }

   public final void J(int var1, int var2, double var3) {
      switch(var1) {
      case 0:
         switch(var2) {
         case 0:
            this.u = var3;
            return;
         case 1:
            this.n = var3;
            return;
         case 2:
            this.M = var3;
            return;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3d0"));
         }
      case 1:
         switch(var2) {
         case 0:
            this.p = var3;
            return;
         case 1:
            this.v = var3;
            return;
         case 2:
            this.P = var3;
            return;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3d0"));
         }
      case 2:
         switch(var2) {
         case 0:
            this.Z = var3;
            return;
         case 1:
            this.q = var3;
            return;
         case 2:
            this.l = var3;
            return;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3d0"));
         }
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3d0"));
      }
   }

   public final double u(int var1, int var2) {
      switch(var1) {
      case 0:
         switch(var2) {
         case 0:
            return this.u;
         case 1:
            return this.n;
         case 2:
            return this.M;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3d1"));
         }
      case 1:
         switch(var2) {
         case 0:
            return this.p;
         case 1:
            return this.v;
         case 2:
            return this.P;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3d1"));
         }
      case 2:
         switch(var2) {
         case 0:
            return this.Z;
         case 1:
            return this.q;
         case 2:
            return this.l;
         }
      }

      throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3d1"));
   }

   public final void l(int var1, gp var2) {
      var2.n = this.u;
      var2.Z = this.n;
      var2.B = this.M;
   }

   public final void f(int var1, double[] var2) {
      var2[0] = this.u;
      var2[1] = this.n;
      var2[2] = this.M;
   }

   public final void V(int var1, gp var2) {
      var2.n = this.u;
      var2.Z = this.p;
      var2.B = this.Z;
   }

   public final void I(int var1, double[] var2) {
      var2[0] = this.u;
      var2[1] = this.p;
      var2[2] = this.Z;
   }

   public final void D(int var1, double var2, double var4, double var6) {
      switch(var1) {
      case 0:
         this.u = var2;
         this.n = var4;
         this.M = var6;
         break;
      case 1:
         this.p = var2;
         this.v = var4;
         this.P = var6;
         break;
      case 2:
         this.Z = var2;
         this.q = var4;
         this.l = var6;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3d6"));
      }

   }

   public final void Z(int var1, gp var2) {
      switch(var1) {
      case 0:
         this.u = var2.n;
         this.n = var2.Z;
         this.M = var2.B;
         break;
      case 1:
         this.p = var2.n;
         this.v = var2.Z;
         this.P = var2.B;
         break;
      case 2:
         this.Z = var2.n;
         this.q = var2.Z;
         this.l = var2.B;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3d6"));
      }

   }

   public final void X(int var1, double[] var2) {
      switch(var1) {
      case 0:
         this.u = var2[0];
         this.n = var2[1];
         this.M = var2[2];
         break;
      case 1:
         this.p = var2[0];
         this.v = var2[1];
         this.P = var2[2];
         break;
      case 2:
         this.Z = var2[0];
         this.q = var2[1];
         this.l = var2[2];
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3d6"));
      }

   }

   public final void q(int var1, double var2, double var4, double var6) {
      switch(var1) {
      case 0:
         this.u = var2;
         this.p = var4;
         this.Z = var6;
         break;
      case 1:
         this.n = var2;
         this.v = var4;
         this.q = var6;
         break;
      case 2:
         this.M = var2;
         this.P = var4;
         this.l = var6;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3d9"));
      }

   }

   public final void h(int var1, gp var2) {
      switch(var1) {
      case 0:
         this.u = var2.n;
         this.p = var2.Z;
         this.Z = var2.B;
         break;
      case 1:
         this.n = var2.n;
         this.v = var2.Z;
         this.q = var2.B;
         break;
      case 2:
         this.M = var2.n;
         this.P = var2.Z;
         this.l = var2.B;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3d9"));
      }

   }

   public final void F(int var1, double[] var2) {
      switch(var1) {
      case 0:
         this.u = var2[0];
         this.p = var2[1];
         this.Z = var2[2];
         break;
      case 1:
         this.n = var2[0];
         this.v = var2[1];
         this.q = var2[2];
         break;
      case 2:
         this.M = var2[0];
         this.P = var2[1];
         this.l = var2[2];
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3d9"));
      }

   }

   public final double S() {
      double[] var1 = new double[3];
      double[] var2 = new double[9];
      this.h(var1, var2);
      return I(var1);
   }

   public final void M(double var1) {
      this.u += var1;
      this.n += var1;
      this.M += var1;
      this.p += var1;
      this.v += var1;
      this.P += var1;
      this.Z += var1;
      this.q += var1;
      this.l += var1;
   }

   public final void b(double var1, _w var3) {
      this.u = var3.u + var1;
      this.n = var3.n + var1;
      this.M = var3.M + var1;
      this.p = var3.p + var1;
      this.v = var3.v + var1;
      this.P = var3.P + var1;
      this.Z = var3.Z + var1;
      this.q = var3.q + var1;
      this.l = var3.l + var1;
   }

   public final void V(_w var1, _w var2) {
      this.u = var1.u + var2.u;
      this.n = var1.n + var2.n;
      this.M = var1.M + var2.M;
      this.p = var1.p + var2.p;
      this.v = var1.v + var2.v;
      this.P = var1.P + var2.P;
      this.Z = var1.Z + var2.Z;
      this.q = var1.q + var2.q;
      this.l = var1.l + var2.l;
   }

   public final void H(_w var1) {
      this.u += var1.u;
      this.n += var1.n;
      this.M += var1.M;
      this.p += var1.p;
      this.v += var1.v;
      this.P += var1.P;
      this.Z += var1.Z;
      this.q += var1.q;
      this.l += var1.l;
   }

   public final void k(_w var1, _w var2) {
      this.u = var1.u - var2.u;
      this.n = var1.n - var2.n;
      this.M = var1.M - var2.M;
      this.p = var1.p - var2.p;
      this.v = var1.v - var2.v;
      this.P = var1.P - var2.P;
      this.Z = var1.Z - var2.Z;
      this.q = var1.q - var2.q;
      this.l = var1.l - var2.l;
   }

   public final void r(_w var1) {
      this.u -= var1.u;
      this.n -= var1.n;
      this.M -= var1.M;
      this.p -= var1.p;
      this.v -= var1.v;
      this.P -= var1.P;
      this.Z -= var1.Z;
      this.q -= var1.q;
      this.l -= var1.l;
   }

   public final void h() {
      double var1 = this.p;
      this.p = this.n;
      this.n = var1;
      var1 = this.Z;
      this.Z = this.M;
      this.M = var1;
      var1 = this.q;
      this.q = this.P;
      this.P = var1;
   }

   public final void k(_w var1) {
      if(this != var1) {
         this.u = var1.u;
         this.n = var1.p;
         this.M = var1.Z;
         this.p = var1.n;
         this.v = var1.v;
         this.P = var1.q;
         this.Z = var1.M;
         this.q = var1.P;
         this.l = var1.l;
      } else {
         this.h();
      }

   }

   public final void d(up var1) {
      this.u = 1.0D - 2.0D * var1.b * var1.b - 2.0D * var1.G * var1.G;
      this.p = 2.0D * (var1.M * var1.b + var1.d * var1.G);
      this.Z = 2.0D * (var1.M * var1.G - var1.d * var1.b);
      this.n = 2.0D * (var1.M * var1.b - var1.d * var1.G);
      this.v = 1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.G * var1.G;
      this.q = 2.0D * (var1.b * var1.G + var1.d * var1.M);
      this.M = 2.0D * (var1.M * var1.G + var1.d * var1.b);
      this.P = 2.0D * (var1.b * var1.G - var1.d * var1.M);
      this.l = 1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.b * var1.b;
   }

   public final void U(mt var1) {
      double var2 = Math.sqrt(var1.b * var1.b + var1.C * var1.C + var1.L * var1.L);
      if(var2 < 1.110223024E-16D) {
         this.u = 1.0D;
         this.n = 0.0D;
         this.M = 0.0D;
         this.p = 0.0D;
         this.v = 1.0D;
         this.P = 0.0D;
         this.Z = 0.0D;
         this.q = 0.0D;
         this.l = 1.0D;
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
         this.u = var14 * var4 * var4 + var12;
         this.n = var14 * var18 - var10 * var8;
         this.M = var14 * var16 + var10 * var6;
         this.p = var14 * var18 + var10 * var8;
         this.v = var14 * var6 * var6 + var12;
         this.P = var14 * var20 - var10 * var4;
         this.Z = var14 * var16 - var10 * var6;
         this.q = var14 * var20 + var10 * var4;
         this.l = var14 * var8 * var8 + var12;
      }

   }

   public final void S(rk var1) {
      this.u = 1.0D - 2.0D * (double)var1.v * (double)var1.v - 2.0D * (double)var1.M * (double)var1.M;
      this.p = 2.0D * (double)(var1.j * var1.v + var1.U * var1.M);
      this.Z = 2.0D * (double)(var1.j * var1.M - var1.U * var1.v);
      this.n = 2.0D * (double)(var1.j * var1.v - var1.U * var1.M);
      this.v = 1.0D - 2.0D * (double)var1.j * (double)var1.j - 2.0D * (double)var1.M * (double)var1.M;
      this.q = 2.0D * (double)(var1.v * var1.M + var1.U * var1.j);
      this.M = 2.0D * (double)(var1.j * var1.M + var1.U * var1.v);
      this.P = 2.0D * (double)(var1.v * var1.M - var1.U * var1.j);
      this.l = 1.0D - 2.0D * (double)var1.j * (double)var1.j - 2.0D * (double)var1.v * (double)var1.v;
   }

   public final void q(ok var1) {
      double var2 = Math.sqrt((double)(var1.y * var1.y + var1.D * var1.D + var1.U * var1.U));
      if(var2 < 1.110223024E-16D) {
         this.u = 1.0D;
         this.n = 0.0D;
         this.M = 0.0D;
         this.p = 0.0D;
         this.v = 1.0D;
         this.P = 0.0D;
         this.Z = 0.0D;
         this.q = 0.0D;
         this.l = 1.0D;
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
         this.u = var14 * var4 * var4 + var12;
         this.n = var14 * var18 - var10 * var8;
         this.M = var14 * var16 + var10 * var6;
         this.p = var14 * var18 + var10 * var8;
         this.v = var14 * var6 * var6 + var12;
         this.P = var14 * var20 - var10 * var4;
         this.Z = var14 * var16 - var10 * var6;
         this.q = var14 * var20 + var10 * var4;
         this.l = var14 * var8 * var8 + var12;
      }

   }

   public final void W(br var1) {
      this.u = (double)var1.y;
      this.n = (double)var1.H;
      this.M = (double)var1.q;
      this.p = (double)var1.e;
      this.v = (double)var1.Q;
      this.P = (double)var1.D;
      this.Z = (double)var1.x;
      this.q = (double)var1.m;
      this.l = (double)var1.t;
   }

   public final void s(_w var1) {
      this.u = var1.u;
      this.n = var1.n;
      this.M = var1.M;
      this.p = var1.p;
      this.v = var1.v;
      this.P = var1.P;
      this.Z = var1.Z;
      this.q = var1.q;
      this.l = var1.l;
   }

   public final void P(double[] var1) {
      this.u = var1[0];
      this.n = var1[1];
      this.M = var1[2];
      this.p = var1[3];
      this.v = var1[4];
      this.P = var1[5];
      this.Z = var1[6];
      this.q = var1[7];
      this.l = var1[8];
   }

   public final void Y(_w var1) {
      this.x(var1);
   }

   public final void r() {
      this.x(this);
   }

   private final void x(_w var1) {
      double[] var2 = new double[9];
      int[] var3 = new int[3];
      double[] var5 = new double[]{var1.u, var1.n, var1.M, var1.p, var1.v, var1.P, var1.Z, var1.q, var1.l};
      if(v(var5, var3)) {
         int var4 = 0;

         while(true) {
            var2[var4] = 0.0D;
            ++var4;
         }
      }

      throw new xn(bc.I("Matrix3d12"));
   }

   static boolean v(double[] param0, int[] param1) {
      // $FF: Couldn't be decompiled
   }

   static void f(double[] var0, int[] var1, double[] var2) {
      byte var8 = 0;
      byte var7 = 0;
      byte var9 = var7;
      byte var4 = -1;
      byte var3 = 0;
      int var5 = var1[var8 + var3];
      double var11 = var2[var7 + 3 * var5];
      var2[var7 + 3 * var5] = var2[var7 + 3 * var3];
      int var10 = var3 * 3;
      int var6 = var4;

      while(true) {
         int var10001 = var3 - 1;
         var11 -= var0[var10 + var6] * var2[var9 + 3 * var6];
         ++var6;
      }
   }

   public final double D() {
      double var1 = this.u * (this.v * this.l - this.P * this.q) + this.n * (this.P * this.Z - this.p * this.l) + this.M * (this.p * this.q - this.v * this.Z);
      return var1;
   }

   public final void u(double var1) {
      this.u = var1;
      this.n = 0.0D;
      this.M = 0.0D;
      this.p = 0.0D;
      this.v = var1;
      this.P = 0.0D;
      this.Z = 0.0D;
      this.q = 0.0D;
      this.l = var1;
   }

   public final void o(double var1) {
      double var3 = Math.sin(var1);
      double var5 = Math.cos(var1);
      this.u = 1.0D;
      this.n = 0.0D;
      this.M = 0.0D;
      this.p = 0.0D;
      this.v = var5;
      this.P = -var3;
      this.Z = 0.0D;
      this.q = var3;
      this.l = var5;
   }

   public final void x(double var1) {
      double var3 = Math.sin(var1);
      double var5 = Math.cos(var1);
      this.u = var5;
      this.n = 0.0D;
      this.M = var3;
      this.p = 0.0D;
      this.v = 1.0D;
      this.P = 0.0D;
      this.Z = -var3;
      this.q = 0.0D;
      this.l = var5;
   }

   public final void y(double var1) {
      double var3 = Math.sin(var1);
      double var5 = Math.cos(var1);
      this.u = var5;
      this.n = -var3;
      this.M = 0.0D;
      this.p = var3;
      this.v = var5;
      this.P = 0.0D;
      this.Z = 0.0D;
      this.q = 0.0D;
      this.l = 1.0D;
   }

   public final void p(double var1) {
      this.u *= var1;
      this.n *= var1;
      this.M *= var1;
      this.p *= var1;
      this.v *= var1;
      this.P *= var1;
      this.Z *= var1;
      this.q *= var1;
      this.l *= var1;
   }

   public final void W(double var1, _w var3) {
      this.u = var1 * var3.u;
      this.n = var1 * var3.n;
      this.M = var1 * var3.M;
      this.p = var1 * var3.p;
      this.v = var1 * var3.v;
      this.P = var1 * var3.P;
      this.Z = var1 * var3.Z;
      this.q = var1 * var3.q;
      this.l = var1 * var3.l;
   }

   public final void b(_w var1) {
      double var2 = this.u * var1.u + this.n * var1.p + this.M * var1.Z;
      double var4 = this.u * var1.n + this.n * var1.v + this.M * var1.q;
      double var6 = this.u * var1.M + this.n * var1.P + this.M * var1.l;
      double var8 = this.p * var1.u + this.v * var1.p + this.P * var1.Z;
      double var10 = this.p * var1.n + this.v * var1.v + this.P * var1.q;
      double var12 = this.p * var1.M + this.v * var1.P + this.P * var1.l;
      double var14 = this.Z * var1.u + this.q * var1.p + this.l * var1.Z;
      double var16 = this.Z * var1.n + this.q * var1.v + this.l * var1.q;
      double var18 = this.Z * var1.M + this.q * var1.P + this.l * var1.l;
      this.u = var2;
      this.n = var4;
      this.M = var6;
      this.p = var8;
      this.v = var10;
      this.P = var12;
      this.Z = var14;
      this.q = var16;
      this.l = var18;
   }

   public final void G(_w var1, _w var2) {
      if(this != var1 && this != var2) {
         this.u = var1.u * var2.u + var1.n * var2.p + var1.M * var2.Z;
         this.n = var1.u * var2.n + var1.n * var2.v + var1.M * var2.q;
         this.M = var1.u * var2.M + var1.n * var2.P + var1.M * var2.l;
         this.p = var1.p * var2.u + var1.v * var2.p + var1.P * var2.Z;
         this.v = var1.p * var2.n + var1.v * var2.v + var1.P * var2.q;
         this.P = var1.p * var2.M + var1.v * var2.P + var1.P * var2.l;
         this.Z = var1.Z * var2.u + var1.q * var2.p + var1.l * var2.Z;
         this.q = var1.Z * var2.n + var1.q * var2.v + var1.l * var2.q;
         this.l = var1.Z * var2.M + var1.q * var2.P + var1.l * var2.l;
      } else {
         double var3 = var1.u * var2.u + var1.n * var2.p + var1.M * var2.Z;
         double var5 = var1.u * var2.n + var1.n * var2.v + var1.M * var2.q;
         double var7 = var1.u * var2.M + var1.n * var2.P + var1.M * var2.l;
         double var9 = var1.p * var2.u + var1.v * var2.p + var1.P * var2.Z;
         double var11 = var1.p * var2.n + var1.v * var2.v + var1.P * var2.q;
         double var13 = var1.p * var2.M + var1.v * var2.P + var1.P * var2.l;
         double var15 = var1.Z * var2.u + var1.q * var2.p + var1.l * var2.Z;
         double var17 = var1.Z * var2.n + var1.q * var2.v + var1.l * var2.q;
         double var19 = var1.Z * var2.M + var1.q * var2.P + var1.l * var2.l;
         this.u = var3;
         this.n = var5;
         this.M = var7;
         this.p = var9;
         this.v = var11;
         this.P = var13;
         this.Z = var15;
         this.q = var17;
         this.l = var19;
      }

   }

   public final void J(_w var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      var2[0] = this.u * var1.u + this.n * var1.p + this.M * var1.Z;
      var2[1] = this.u * var1.n + this.n * var1.v + this.M * var1.q;
      var2[2] = this.u * var1.M + this.n * var1.P + this.M * var1.l;
      var2[3] = this.p * var1.u + this.v * var1.p + this.P * var1.Z;
      var2[4] = this.p * var1.n + this.v * var1.v + this.P * var1.q;
      var2[5] = this.p * var1.M + this.v * var1.P + this.P * var1.l;
      var2[6] = this.Z * var1.u + this.q * var1.p + this.l * var1.Z;
      var2[7] = this.Z * var1.n + this.q * var1.v + this.l * var1.q;
      var2[8] = this.Z * var1.M + this.q * var1.P + this.l * var1.l;
      g(var2, var4, var3);
      this.u = var3[0];
      this.n = var3[1];
      this.M = var3[2];
      this.p = var3[3];
      this.v = var3[4];
      this.P = var3[5];
      this.Z = var3[6];
      this.q = var3[7];
      this.l = var3[8];
   }

   public final void q(_w var1, _w var2) {
      double[] var3 = new double[9];
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      var3[0] = var1.u * var2.u + var1.n * var2.p + var1.M * var2.Z;
      var3[1] = var1.u * var2.n + var1.n * var2.v + var1.M * var2.q;
      var3[2] = var1.u * var2.M + var1.n * var2.P + var1.M * var2.l;
      var3[3] = var1.p * var2.u + var1.v * var2.p + var1.P * var2.Z;
      var3[4] = var1.p * var2.n + var1.v * var2.v + var1.P * var2.q;
      var3[5] = var1.p * var2.M + var1.v * var2.P + var1.P * var2.l;
      var3[6] = var1.Z * var2.u + var1.q * var2.p + var1.l * var2.Z;
      var3[7] = var1.Z * var2.n + var1.q * var2.v + var1.l * var2.q;
      var3[8] = var1.Z * var2.M + var1.q * var2.P + var1.l * var2.l;
      g(var3, var5, var4);
      this.u = var4[0];
      this.n = var4[1];
      this.M = var4[2];
      this.p = var4[3];
      this.v = var4[4];
      this.P = var4[5];
      this.Z = var4[6];
      this.q = var4[7];
      this.l = var4[8];
   }

   public final void x(_w var1, _w var2) {
      if(this != var1 && this != var2) {
         this.u = var1.u * var2.u + var1.p * var2.n + var1.Z * var2.M;
         this.n = var1.u * var2.p + var1.p * var2.v + var1.Z * var2.P;
         this.M = var1.u * var2.Z + var1.p * var2.q + var1.Z * var2.l;
         this.p = var1.n * var2.u + var1.v * var2.n + var1.q * var2.M;
         this.v = var1.n * var2.p + var1.v * var2.v + var1.q * var2.P;
         this.P = var1.n * var2.Z + var1.v * var2.q + var1.q * var2.l;
         this.Z = var1.M * var2.u + var1.P * var2.n + var1.l * var2.M;
         this.q = var1.M * var2.p + var1.P * var2.v + var1.l * var2.P;
         this.l = var1.M * var2.Z + var1.P * var2.q + var1.l * var2.l;
      } else {
         double var3 = var1.u * var2.u + var1.p * var2.n + var1.Z * var2.M;
         double var5 = var1.u * var2.p + var1.p * var2.v + var1.Z * var2.P;
         double var7 = var1.u * var2.Z + var1.p * var2.q + var1.Z * var2.l;
         double var9 = var1.n * var2.u + var1.v * var2.n + var1.q * var2.M;
         double var11 = var1.n * var2.p + var1.v * var2.v + var1.q * var2.P;
         double var13 = var1.n * var2.Z + var1.v * var2.q + var1.q * var2.l;
         double var15 = var1.M * var2.u + var1.P * var2.n + var1.l * var2.M;
         double var17 = var1.M * var2.p + var1.P * var2.v + var1.l * var2.P;
         double var19 = var1.M * var2.Z + var1.P * var2.q + var1.l * var2.l;
         this.u = var3;
         this.n = var5;
         this.M = var7;
         this.p = var9;
         this.v = var11;
         this.P = var13;
         this.Z = var15;
         this.q = var17;
         this.l = var19;
      }

   }

   public final void h(_w var1, _w var2) {
      if(this != var1 && this != var2) {
         this.u = var1.u * var2.u + var1.n * var2.n + var1.M * var2.M;
         this.n = var1.u * var2.p + var1.n * var2.v + var1.M * var2.P;
         this.M = var1.u * var2.Z + var1.n * var2.q + var1.M * var2.l;
         this.p = var1.p * var2.u + var1.v * var2.n + var1.P * var2.M;
         this.v = var1.p * var2.p + var1.v * var2.v + var1.P * var2.P;
         this.P = var1.p * var2.Z + var1.v * var2.q + var1.P * var2.l;
         this.Z = var1.Z * var2.u + var1.q * var2.n + var1.l * var2.M;
         this.q = var1.Z * var2.p + var1.q * var2.v + var1.l * var2.P;
         this.l = var1.Z * var2.Z + var1.q * var2.q + var1.l * var2.l;
      } else {
         double var3 = var1.u * var2.u + var1.n * var2.n + var1.M * var2.M;
         double var5 = var1.u * var2.p + var1.n * var2.v + var1.M * var2.P;
         double var7 = var1.u * var2.Z + var1.n * var2.q + var1.M * var2.l;
         double var9 = var1.p * var2.u + var1.v * var2.n + var1.P * var2.M;
         double var11 = var1.p * var2.p + var1.v * var2.v + var1.P * var2.P;
         double var13 = var1.p * var2.Z + var1.v * var2.q + var1.P * var2.l;
         double var15 = var1.Z * var2.u + var1.q * var2.n + var1.l * var2.M;
         double var17 = var1.Z * var2.p + var1.q * var2.v + var1.l * var2.P;
         double var19 = var1.Z * var2.Z + var1.q * var2.q + var1.l * var2.l;
         this.u = var3;
         this.n = var5;
         this.M = var7;
         this.p = var9;
         this.v = var11;
         this.P = var13;
         this.Z = var15;
         this.q = var17;
         this.l = var19;
      }

   }

   public final void B(_w var1, _w var2) {
      if(this != var1 && this != var2) {
         this.u = var1.u * var2.u + var1.p * var2.p + var1.Z * var2.Z;
         this.n = var1.u * var2.n + var1.p * var2.v + var1.Z * var2.q;
         this.M = var1.u * var2.M + var1.p * var2.P + var1.Z * var2.l;
         this.p = var1.n * var2.u + var1.v * var2.p + var1.q * var2.Z;
         this.v = var1.n * var2.n + var1.v * var2.v + var1.q * var2.q;
         this.P = var1.n * var2.M + var1.v * var2.P + var1.q * var2.l;
         this.Z = var1.M * var2.u + var1.P * var2.p + var1.l * var2.Z;
         this.q = var1.M * var2.n + var1.P * var2.v + var1.l * var2.q;
         this.l = var1.M * var2.M + var1.P * var2.P + var1.l * var2.l;
      } else {
         double var3 = var1.u * var2.u + var1.p * var2.p + var1.Z * var2.Z;
         double var5 = var1.u * var2.n + var1.p * var2.v + var1.Z * var2.q;
         double var7 = var1.u * var2.M + var1.p * var2.P + var1.Z * var2.l;
         double var9 = var1.n * var2.u + var1.v * var2.p + var1.q * var2.Z;
         double var11 = var1.n * var2.n + var1.v * var2.v + var1.q * var2.q;
         double var13 = var1.n * var2.M + var1.v * var2.P + var1.q * var2.l;
         double var15 = var1.M * var2.u + var1.P * var2.p + var1.l * var2.Z;
         double var17 = var1.M * var2.n + var1.P * var2.v + var1.l * var2.q;
         double var19 = var1.M * var2.M + var1.P * var2.P + var1.l * var2.l;
         this.u = var3;
         this.n = var5;
         this.M = var7;
         this.p = var9;
         this.v = var11;
         this.P = var13;
         this.Z = var15;
         this.q = var17;
         this.l = var19;
      }

   }

   public final void G() {
      double[] var1 = new double[9];
      double[] var2 = new double[3];
      this.h(var2, var1);
      this.u = var1[0];
      this.n = var1[1];
      this.M = var1[2];
      this.p = var1[3];
      this.v = var1[4];
      this.P = var1[5];
      this.Z = var1[6];
      this.q = var1[7];
      this.l = var1[8];
   }

   public final void y(_w var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      var2[0] = var1.u;
      var2[1] = var1.n;
      var2[2] = var1.M;
      var2[3] = var1.p;
      var2[4] = var1.v;
      var2[5] = var1.P;
      var2[6] = var1.Z;
      var2[7] = var1.q;
      var2[8] = var1.l;
      g(var2, var4, var3);
      this.u = var3[0];
      this.n = var3[1];
      this.M = var3[2];
      this.p = var3[3];
      this.v = var3[4];
      this.P = var3[5];
      this.Z = var3[6];
      this.q = var3[7];
      this.l = var3[8];
   }

   public final void B() {
      double var1 = 1.0D / Math.sqrt(this.u * this.u + this.p * this.p + this.Z * this.Z);
      this.u *= var1;
      this.p *= var1;
      this.Z *= var1;
      var1 = 1.0D / Math.sqrt(this.n * this.n + this.v * this.v + this.q * this.q);
      this.n *= var1;
      this.v *= var1;
      this.q *= var1;
      this.M = this.p * this.q - this.v * this.Z;
      this.P = this.n * this.Z - this.u * this.q;
      this.l = this.u * this.v - this.n * this.p;
   }

   public final void j(_w var1) {
      double var2 = 1.0D / Math.sqrt(var1.u * var1.u + var1.p * var1.p + var1.Z * var1.Z);
      this.u = var1.u * var2;
      this.p = var1.p * var2;
      this.Z = var1.Z * var2;
      var2 = 1.0D / Math.sqrt(var1.n * var1.n + var1.v * var1.v + var1.q * var1.q);
      this.n = var1.n * var2;
      this.v = var1.v * var2;
      this.q = var1.q * var2;
      this.M = this.p * this.q - this.v * this.Z;
      this.P = this.n * this.Z - this.u * this.q;
      this.l = this.u * this.v - this.n * this.p;
   }

   public boolean G(_w var1) {
      return this.u == var1.u && this.n == var1.n && this.M == var1.M && this.p == var1.p && this.v == var1.v && this.P == var1.P && this.Z == var1.Z && this.q == var1.q && this.l == var1.l;
   }

   public boolean equals(Object var1) {
      _w var2 = (_w)var1;
      return this.u == var2.u && this.n == var2.n && this.M == var2.M && this.p == var2.p && this.v == var2.v && this.P == var2.P && this.Z == var2.Z && this.q == var2.q && this.l == var2.l;
   }

   public boolean U(_w var1, double var2) {
      double var4 = this.u - var1.u;
      if((var4 < 0.0D?-var4:var4) > var2) {
         return false;
      } else {
         var4 = this.n - var1.n;
         if((var4 < 0.0D?-var4:var4) > var2) {
            return false;
         } else {
            var4 = this.M - var1.M;
            if((var4 < 0.0D?-var4:var4) > var2) {
               return false;
            } else {
               var4 = this.p - var1.p;
               if((var4 < 0.0D?-var4:var4) > var2) {
                  return false;
               } else {
                  var4 = this.v - var1.v;
                  if((var4 < 0.0D?-var4:var4) > var2) {
                     return false;
                  } else {
                     var4 = this.P - var1.P;
                     if((var4 < 0.0D?-var4:var4) > var2) {
                        return false;
                     } else {
                        var4 = this.Z - var1.Z;
                        if((var4 < 0.0D?-var4:var4) > var2) {
                           return false;
                        } else {
                           var4 = this.q - var1.q;
                           if((var4 < 0.0D?-var4:var4) > var2) {
                              return false;
                           } else {
                              var4 = this.l - var1.l;
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

   public int hashCode() {
      long var1 = 1L;
      var1 = op.l(var1, this.u);
      var1 = op.l(var1, this.n);
      var1 = op.l(var1, this.M);
      var1 = op.l(var1, this.p);
      var1 = op.l(var1, this.v);
      var1 = op.l(var1, this.P);
      var1 = op.l(var1, this.Z);
      var1 = op.l(var1, this.q);
      var1 = op.l(var1, this.l);
      return op.K(var1);
   }

   public final void F() {
      this.u = 0.0D;
      this.n = 0.0D;
      this.M = 0.0D;
      this.p = 0.0D;
      this.v = 0.0D;
      this.P = 0.0D;
      this.Z = 0.0D;
      this.q = 0.0D;
      this.l = 0.0D;
   }

   public final void V() {
      this.u = -this.u;
      this.n = -this.n;
      this.M = -this.M;
      this.p = -this.p;
      this.v = -this.v;
      this.P = -this.P;
      this.Z = -this.Z;
      this.q = -this.q;
      this.l = -this.l;
   }

   public final void B(_w var1) {
      this.u = -var1.u;
      this.n = -var1.n;
      this.M = -var1.M;
      this.p = -var1.p;
      this.v = -var1.v;
      this.P = -var1.P;
      this.Z = -var1.Z;
      this.q = -var1.q;
      this.l = -var1.l;
   }

   public final void A(go var1) {
      double var2 = this.u * var1.n + this.n * var1.Z + this.M * var1.B;
      double var4 = this.p * var1.n + this.v * var1.Z + this.P * var1.B;
      double var6 = this.Z * var1.n + this.q * var1.Z + this.l * var1.B;
      var1.w(var2, var4, var6);
   }

   public final void a(go var1, go var2) {
      double var3 = this.u * var1.n + this.n * var1.Z + this.M * var1.B;
      double var5 = this.p * var1.n + this.v * var1.Z + this.P * var1.B;
      var2.B = this.Z * var1.n + this.q * var1.Z + this.l * var1.B;
      var2.n = var3;
      var2.Z = var5;
   }

   final void h(double[] var1, double[] var2) {
      double[] var3 = new double[]{this.u, this.n, this.M, this.p, this.v, this.P, this.Z, this.q, this.l};
      g(var3, var1, var2);
   }

   static void g(double[] var0, double[] var1, double[] var2) {
      ra.C();
      double[] var10 = new double[9];
      double[] var11 = new double[9];
      double[] var12 = new double[9];
      double[] var13 = new double[9];
      double[] var16 = new double[9];
      double[] var17 = new double[3];
      double[] var18 = new double[3];
      boolean var20 = false;
      int var4 = 0;
      var16[var4] = var0[var4];
      ++var4;
      if(Double.compare(var0[3] * var0[3], 1.110223024E-16D) < 0) {
         var10[0] = 1.0D;
         var10[1] = 0.0D;
         var10[2] = 0.0D;
         var10[3] = 0.0D;
         var10[4] = 1.0D;
         var10[5] = 0.0D;
         var10[6] = 0.0D;
         var10[7] = 0.0D;
         var10[8] = 1.0D;
      }

      if(var0[0] * var0[0] < 1.110223024E-16D) {
         var12[0] = var0[0];
         var12[1] = var0[1];
         var12[2] = var0[2];
         var0[0] = var0[3];
         var0[1] = var0[4];
         var0[2] = var0[5];
         var0[3] = -var12[0];
         var0[4] = -var12[1];
         var0[5] = -var12[2];
         var10[0] = 0.0D;
         var10[1] = 1.0D;
         var10[2] = 0.0D;
         var10[3] = -1.0D;
         var10[4] = 0.0D;
         var10[5] = 0.0D;
         var10[6] = 0.0D;
         var10[7] = 0.0D;
         var10[8] = 1.0D;
      }

      double var6 = 1.0D / Math.sqrt(var0[0] * var0[0] + var0[3] * var0[3]);
      double var25 = var0[0] * var6;
      double var33 = var0[3] * var6;
      var12[0] = var25 * var0[0] + var33 * var0[3];
      var12[1] = var25 * var0[1] + var33 * var0[4];
      var12[2] = var25 * var0[2] + var33 * var0[5];
      var0[3] = -var33 * var0[0] + var25 * var0[3];
      var0[4] = -var33 * var0[1] + var25 * var0[4];
      var0[5] = -var33 * var0[2] + var25 * var0[5];
      var0[0] = var12[0];
      var0[1] = var12[1];
      var0[2] = var12[2];
      var10[0] = var25;
      var10[1] = var33;
      var10[2] = 0.0D;
      var10[3] = -var33;
      var10[4] = var25;
      var10[5] = 0.0D;
      var10[6] = 0.0D;
      var10[7] = 0.0D;
      var10[8] = 1.0D;
      if(Double.compare(var0[6] * var0[6], 1.110223024E-16D) >= 0) {
         if(var0[0] * var0[0] < 1.110223024E-16D) {
            var12[0] = var0[0];
            var12[1] = var0[1];
            var12[2] = var0[2];
            var0[0] = var0[6];
            var0[1] = var0[7];
            var0[2] = var0[8];
            var0[6] = -var12[0];
            var0[7] = -var12[1];
            var0[8] = -var12[2];
            var12[0] = var10[0];
            var12[1] = var10[1];
            var12[2] = var10[2];
            var10[0] = var10[6];
            var10[1] = var10[7];
            var10[2] = var10[8];
            var10[6] = -var12[0];
            var10[7] = -var12[1];
            var10[8] = -var12[2];
         }

         var6 = 1.0D / Math.sqrt(var0[0] * var0[0] + var0[6] * var0[6]);
         double var27 = var0[0] * var6;
         double var35 = var0[6] * var6;
         var12[0] = var27 * var0[0] + var35 * var0[6];
         var12[1] = var27 * var0[1] + var35 * var0[7];
         var12[2] = var27 * var0[2] + var35 * var0[8];
         var0[6] = -var35 * var0[0] + var27 * var0[6];
         var0[7] = -var35 * var0[1] + var27 * var0[7];
         var0[8] = -var35 * var0[2] + var27 * var0[8];
         var0[0] = var12[0];
         var0[1] = var12[1];
         var0[2] = var12[2];
         var12[0] = var27 * var10[0];
         var12[1] = var27 * var10[1];
         var10[2] = var35;
         var12[6] = -var10[0] * var35;
         var12[7] = -var10[1] * var35;
         var10[8] = var27;
         var10[0] = var12[0];
         var10[1] = var12[1];
         var10[6] = var12[6];
         var10[7] = var12[7];
      }

      if(Double.compare(var0[2] * var0[2], 1.110223024E-16D) < 0) {
         var11[0] = 1.0D;
         var11[1] = 0.0D;
         var11[2] = 0.0D;
         var11[3] = 0.0D;
         var11[4] = 1.0D;
         var11[5] = 0.0D;
         var11[6] = 0.0D;
         var11[7] = 0.0D;
         var11[8] = 1.0D;
      }

      if(var0[1] * var0[1] < 1.110223024E-16D) {
         var12[2] = var0[2];
         var12[5] = var0[5];
         var12[8] = var0[8];
         var0[2] = -var0[1];
         var0[5] = -var0[4];
         var0[8] = -var0[7];
         var0[1] = var12[2];
         var0[4] = var12[5];
         var0[7] = var12[8];
         var11[0] = 1.0D;
         var11[1] = 0.0D;
         var11[2] = 0.0D;
         var11[3] = 0.0D;
         var11[4] = 0.0D;
         var11[5] = -1.0D;
         var11[6] = 0.0D;
         var11[7] = 1.0D;
         var11[8] = 0.0D;
      }

      var6 = 1.0D / Math.sqrt(var0[1] * var0[1] + var0[2] * var0[2]);
      double var29 = var0[1] * var6;
      double var37 = var0[2] * var6;
      var12[1] = var29 * var0[1] + var37 * var0[2];
      var0[2] = -var37 * var0[1] + var29 * var0[2];
      var0[1] = var12[1];
      var12[4] = var29 * var0[4] + var37 * var0[5];
      var0[5] = -var37 * var0[4] + var29 * var0[5];
      var0[4] = var12[4];
      var12[7] = var29 * var0[7] + var37 * var0[8];
      var0[8] = -var37 * var0[7] + var29 * var0[8];
      var0[7] = var12[7];
      var11[0] = 1.0D;
      var11[1] = 0.0D;
      var11[2] = 0.0D;
      var11[3] = 0.0D;
      var11[4] = var29;
      var11[5] = -var37;
      var11[6] = 0.0D;
      var11[7] = var37;
      var11[8] = var29;
      if(Double.compare(var0[7] * var0[7], 1.110223024E-16D) >= 0) {
         if(var0[4] * var0[4] < 1.110223024E-16D) {
            var12[3] = var0[3];
            var12[4] = var0[4];
            var12[5] = var0[5];
            var0[3] = var0[6];
            var0[4] = var0[7];
            var0[5] = var0[8];
            var0[6] = -var12[3];
            var0[7] = -var12[4];
            var0[8] = -var12[5];
            var12[3] = var10[3];
            var12[4] = var10[4];
            var12[5] = var10[5];
            var10[3] = var10[6];
            var10[4] = var10[7];
            var10[5] = var10[8];
            var10[6] = -var12[3];
            var10[7] = -var12[4];
            var10[8] = -var12[5];
         }

         var6 = 1.0D / Math.sqrt(var0[4] * var0[4] + var0[7] * var0[7]);
         double var31 = var0[4] * var6;
         double var39 = var0[7] * var6;
         var12[3] = var31 * var0[3] + var39 * var0[6];
         var0[6] = -var39 * var0[3] + var31 * var0[6];
         var0[3] = var12[3];
         var12[4] = var31 * var0[4] + var39 * var0[7];
         var0[7] = -var39 * var0[4] + var31 * var0[7];
         var0[4] = var12[4];
         var12[5] = var31 * var0[5] + var39 * var0[8];
         var0[8] = -var39 * var0[5] + var31 * var0[8];
         var0[5] = var12[5];
         var12[3] = var31 * var10[3] + var39 * var10[6];
         var10[6] = -var39 * var10[3] + var31 * var10[6];
         var10[3] = var12[3];
         var12[4] = var31 * var10[4] + var39 * var10[7];
         var10[7] = -var39 * var10[4] + var31 * var10[7];
         var10[4] = var12[4];
         var12[5] = var31 * var10[5] + var39 * var10[8];
         var10[8] = -var39 * var10[5] + var31 * var10[8];
         var10[5] = var12[5];
      }

      var13[0] = var0[0];
      var13[1] = var0[4];
      var13[2] = var0[8];
      var17[0] = var0[1];
      var17[1] = var0[5];
      Double.compare(var17[0] * var17[0], 1.110223024E-16D);
      Double.compare(var17[1] * var17[1], 1.110223024E-16D);
      var18[0] = var13[0];
      var18[1] = var13[1];
      var18[2] = var13[2];
      if(R(Math.abs(var18[0]), 1.0D) && R(Math.abs(var18[1]), 1.0D) && R(Math.abs(var18[2]), 1.0D)) {
         var4 = 0;
         Double.compare(var18[var4], 0.0D);
         ++var4;
         var1[0] = var1[1] = var1[2] = 1.0D;
         var4 = 0;
         var2[var4] = var16[var4];
         ++var4;
      } else {
         U(var10, var12);
         U(var11, var13);
         Q(var0, var12, var13, var18, var2, var1);
      }
   }

   static void Q(double[] var0, double[] var1, double[] var2, double[] var3, double[] var4, double[] var5) {
      int[] var6 = new int[3];
      int[] var10000 = new int[3];
      double[] var13 = new double[3];
      double[] var14 = new double[9];
      if(var3[0] < 0.0D) {
         var3[0] = -var3[0];
         var2[0] = -var2[0];
         var2[1] = -var2[1];
         var2[2] = -var2[2];
      }

      if(var3[1] < 0.0D) {
         var3[1] = -var3[1];
         var2[3] = -var2[3];
         var2[4] = -var2[4];
         var2[5] = -var2[5];
      }

      if(var3[2] < 0.0D) {
         var3[2] = -var3[2];
         var2[6] = -var2[6];
         var2[7] = -var2[7];
         var2[8] = -var2[8];
      }

      y(var1, var2, var14);
      if(R(Math.abs(var3[0]), Math.abs(var3[1])) && R(Math.abs(var3[1]), Math.abs(var3[2]))) {
         int var12 = 0;

         while(true) {
            var4[var12] = var14[var12];
            ++var12;
         }
      }

      if(var3[0] > var3[1]) {
         if(var3[0] > var3[2]) {
            if(var3[2] > var3[1]) {
               var6[0] = 0;
               var6[1] = 2;
               var6[2] = 1;
            } else {
               var6[0] = 0;
               var6[1] = 1;
               var6[2] = 2;
            }
         } else {
            var6[0] = 2;
            var6[1] = 0;
            var6[2] = 1;
         }
      } else if(var3[1] > var3[2]) {
         if(var3[2] > var3[0]) {
            var6[0] = 1;
            var6[1] = 2;
            var6[2] = 0;
         } else {
            var6[0] = 1;
            var6[1] = 0;
            var6[2] = 2;
         }
      } else {
         var6[0] = 2;
         var6[1] = 1;
         var6[2] = 0;
      }

      var13[0] = var0[0] * var0[0] + var0[1] * var0[1] + var0[2] * var0[2];
      var13[1] = var0[3] * var0[3] + var0[4] * var0[4] + var0[5] * var0[5];
      var13[2] = var0[6] * var0[6] + var0[7] * var0[7] + var0[8] * var0[8];
      double var28;
      int var26 = (var28 = var13[0] - var13[1]) == 0.0D?0:(var28 < 0.0D?-1:1);
      double var29;
      var26 = (var29 = var13[1] - var13[2]) == 0.0D?0:(var29 < 0.0D?-1:1);
      byte var10 = 0;
      byte var9 = 1;
      byte var8 = 2;
      int var11 = var6[var8];
      var5[0] = var3[var11];
      var11 = var6[var9];
      var5[1] = var3[var11];
      var11 = var6[var10];
      var5[2] = var3[var11];
      var11 = var6[var8];
      var4[0] = var14[var11];
      var11 = var6[var8] + 3;
      var4[3] = var14[var11];
      var11 = var6[var8] + 6;
      var4[6] = var14[var11];
      var11 = var6[var9];
      var4[1] = var14[var11];
      var11 = var6[var9] + 3;
      var4[4] = var14[var11];
      var11 = var6[var9] + 6;
      var4[7] = var14[var11];
      var11 = var6[var10];
      var4[2] = var14[var11];
      var11 = var6[var10] + 3;
      var4[5] = var14[var11];
      var11 = var6[var10] + 6;
      var4[8] = var14[var11];
   }

   static int P(double[] var0, double[] var1, double[] var2, double[] var3) {
      double[] var16 = new double[2];
      double[] var17 = new double[2];
      double[] var18 = new double[2];
      double[] var19 = new double[2];
      double[] var20 = new double[9];
      boolean var10000 = true;
      double var58 = 4.89E-15D;
      double var32 = 1.0D;
      var58 = -1.0D;
      boolean var7 = false;
      byte var36 = 1;
      if(Math.abs(var1[1]) < 4.89E-15D || Math.abs(var1[0]) < 4.89E-15D) {
         var7 = true;
      }

      int var6 = 0;

      while(true) {
         double var8 = V(var0[1], var1[1], var0[2]);
         double var25 = (Math.abs(var0[0]) - var8) * (V(var32, var0[0]) + var8 / var0[0]);
         double var27 = var1[0];
         t(var25, var27, var19, var17, 0, var36);
         var25 = var17[0] * var0[0] + var19[0] * var1[0];
         var1[0] = var17[0] * var1[0] - var19[0] * var0[0];
         var27 = var19[0] * var0[1];
         var0[1] = var17[0] * var0[1];
         double var14 = t(var25, var27, var18, var16, 0, var36);
         var36 = 0;
         var0[0] = var14;
         var25 = var16[0] * var1[0] + var18[0] * var0[1];
         var0[1] = var16[0] * var0[1] - var18[0] * var1[0];
         var27 = var18[0] * var1[1];
         var1[1] = var16[0] * var1[1];
         var14 = t(var25, var27, var19, var17, 1, var36);
         var1[0] = var14;
         var25 = var17[1] * var0[1] + var19[1] * var1[1];
         var1[1] = var17[1] * var1[1] - var19[1] * var0[1];
         var27 = var19[1] * var0[2];
         var0[2] = var17[1] * var0[2];
         var14 = t(var25, var27, var18, var16, 1, var36);
         var0[1] = var14;
         var25 = var16[1] * var1[1] + var18[1] * var0[2];
         var0[2] = var16[1] * var0[2] - var18[1] * var1[1];
         var1[1] = var25;
         double var21 = var2[0];
         var2[0] = var16[0] * var21 + var18[0] * var2[3];
         var2[3] = -var18[0] * var21 + var16[0] * var2[3];
         var21 = var2[1];
         var2[1] = var16[0] * var21 + var18[0] * var2[4];
         var2[4] = -var18[0] * var21 + var16[0] * var2[4];
         var21 = var2[2];
         var2[2] = var16[0] * var21 + var18[0] * var2[5];
         var2[5] = -var18[0] * var21 + var16[0] * var2[5];
         var21 = var2[3];
         var2[3] = var16[1] * var21 + var18[1] * var2[6];
         var2[6] = -var18[1] * var21 + var16[1] * var2[6];
         var21 = var2[4];
         var2[4] = var16[1] * var21 + var18[1] * var2[7];
         var2[7] = -var18[1] * var21 + var16[1] * var2[7];
         var21 = var2[5];
         var2[5] = var16[1] * var21 + var18[1] * var2[8];
         var2[8] = -var18[1] * var21 + var16[1] * var2[8];
         double var23 = var3[0];
         var3[0] = var17[0] * var23 + var19[0] * var3[1];
         var3[1] = -var19[0] * var23 + var17[0] * var3[1];
         var23 = var3[3];
         var3[3] = var17[0] * var23 + var19[0] * var3[4];
         var3[4] = -var19[0] * var23 + var17[0] * var3[4];
         var23 = var3[6];
         var3[6] = var17[0] * var23 + var19[0] * var3[7];
         var3[7] = -var19[0] * var23 + var17[0] * var3[7];
         var23 = var3[1];
         var3[1] = var17[1] * var23 + var19[1] * var3[2];
         var3[2] = -var19[1] * var23 + var17[1] * var3[2];
         var23 = var3[4];
         var3[4] = var17[1] * var23 + var19[1] * var3[5];
         var3[5] = -var19[1] * var23 + var17[1] * var3[5];
         var23 = var3[7];
         var3[7] = var17[1] * var23 + var19[1] * var3[8];
         var3[8] = -var19[1] * var23 + var17[1] * var3[8];
         var20[0] = var0[0];
         var20[1] = var1[0];
         var20[2] = 0.0D;
         var20[3] = 0.0D;
         var20[4] = var0[1];
         var20[5] = var1[1];
         var20[6] = 0.0D;
         var20[7] = 0.0D;
         var20[8] = var0[2];
         if(Math.abs(var1[1]) < 4.89E-15D || Math.abs(var1[0]) < 4.89E-15D) {
            var7 = true;
         }

         ++var6;
      }
   }

   static double B(double var0, double var2) {
      return var0 > var2?var0:var2;
   }

   static double I(double var0, double var2) {
      return var0 < var2?var0:var2;
   }

   static double V(double var0, double var2) {
      double var4 = var0 >= 0.0D?var0:-var0;
      return var2 >= 0.0D?var4:-var4;
   }

   static double V(double var0, double var2, double var4) {
      double var16 = Math.abs(var0);
      double var18 = Math.abs(var2);
      double var20 = Math.abs(var4);
      double var10 = I(var16, var20);
      double var12 = B(var16, var20);
      double var28;
      if(var10 == 0.0D) {
         var28 = 0.0D;
         if(var12 != 0.0D) {
            double var6 = I(var12, var18) / B(var12, var18);
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

   static int F(double var0, double var2, double var4, double[] var6, double[] var7, double[] var8, double[] var9, double[] var10, int var11) {
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
            if(var42 / var40 < 1.110223024E-16D) {
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
            if(var42 / var40 < 1.110223024E-16D) {
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
               var34 = V(var12, var4) * V(var14, var2);
            } else {
               var34 = var2 / V(var24, var4) + var28 / var34;
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
         var36 = V(var14, var9[0]) * V(var14, var7[0]) * V(var14, var4);
         var6[var11] = V(var65, var36);
         double var16 = var36 * V(var14, var0) * V(var14, var4);
         var6[var11 + 1] = V(var63, var16);
      }

      return 0;
   }

   static double t(double var0, double var2, double[] var4, double[] var5, int var6, int var7) {
      double var10000 = 2.002083095183101E-146D;
      var10000 = 4.9947976805055876E145D;
      double var13;
      double var15;
      double var25;
      if(var2 == 0.0D) {
         var13 = 1.0D;
         var15 = 0.0D;
         var25 = var0;
      } else if(var0 == 0.0D) {
         var13 = 0.0D;
         var15 = 1.0D;
         var25 = var2;
      } else {
         double var21 = var0;
         double var23 = var2;
         double var18 = B(Math.abs(var0), Math.abs(var2));
         if(var18 >= 4.9947976805055876E145D) {
            for(int var32 = 0; var18 >= 4.9947976805055876E145D; var18 = B(Math.abs(var21), Math.abs(var23))) {
               ++var32;
               var21 *= 2.002083095183101E-146D;
               var23 *= 2.002083095183101E-146D;
            }

            var25 = Math.sqrt(var21 * var21 + var23 * var23);
            var13 = var21 / var25;
            var15 = var23 / var25;
            boolean var31 = true;
         } else if(var18 > 2.002083095183101E-146D) {
            var25 = Math.sqrt(var0 * var0 + var2 * var2);
            var13 = var0 / var25;
            var15 = var2 / var25;
         } else {
            for(int var20 = 0; var18 <= 2.002083095183101E-146D; var18 = B(Math.abs(var21), Math.abs(var23))) {
               ++var20;
               var21 *= 4.9947976805055876E145D;
               var23 *= 4.9947976805055876E145D;
            }

            var25 = Math.sqrt(var21 * var21 + var23 * var23);
            var13 = var21 / var25;
            var15 = var23 / var25;
            boolean var17 = true;
         }

         if(Math.abs(var0) > Math.abs(var2) && var13 < 0.0D) {
            var13 = -var13;
            var15 = -var15;
            var25 = -var25;
         }
      }

      var4[var6] = var15;
      var5[var6] = var13;
      return var25;
   }

   static void I(double[] var0) {
      int var1 = 0;

      while(true) {
         System.out.println(var0[var1 * 3 + 0] + " " + var0[var1 * 3 + 1] + " " + var0[var1 * 3 + 2] + "\n");
         ++var1;
      }
   }

   static void a(double[] var0) {
      double var1 = var0[0] * var0[4] * var0[8] + var0[1] * var0[5] * var0[6] + var0[2] * var0[3] * var0[7] - var0[2] * var0[4] * var0[6] - var0[0] * var0[5] * var0[7] - var0[1] * var0[3] * var0[8];
      System.out.println("det= " + var1);
   }

   static void y(double[] var0, double[] var1, double[] var2) {
      double[] var4 = new double[]{var0[0] * var1[0] + var0[1] * var1[3] + var0[2] * var1[6], var0[0] * var1[1] + var0[1] * var1[4] + var0[2] * var1[7], var0[0] * var1[2] + var0[1] * var1[5] + var0[2] * var1[8], var0[3] * var1[0] + var0[4] * var1[3] + var0[5] * var1[6], var0[3] * var1[1] + var0[4] * var1[4] + var0[5] * var1[7], var0[3] * var1[2] + var0[4] * var1[5] + var0[5] * var1[8], var0[6] * var1[0] + var0[7] * var1[3] + var0[8] * var1[6], var0[6] * var1[1] + var0[7] * var1[4] + var0[8] * var1[7], var0[6] * var1[2] + var0[7] * var1[5] + var0[8] * var1[8]};
      int var3 = 0;

      while(true) {
         var2[var3] = var4[var3];
         ++var3;
      }
   }

   static void U(double[] var0, double[] var1) {
      var1[0] = var0[0];
      var1[1] = var0[3];
      var1[2] = var0[6];
      var1[3] = var0[1];
      var1[4] = var0[4];
      var1[5] = var0[7];
      var1[6] = var0[2];
      var1[7] = var0[5];
      var1[8] = var0[8];
   }

   static double I(double[] var0) {
      return var0[0] > var0[1]?(var0[0] > var0[2]?var0[0]:var0[2]):(var0[1] > var0[2]?var0[1]:var0[2]);
   }

   private static final boolean R(double var0, double var2) {
      if(var0 == var2) {
         return true;
      } else {
         double var10000 = 1.0E-6D;
         var10000 = 1.0E-4D;
         double var8 = Math.abs(var0 - var2);
         double var10 = Math.abs(var0);
         double var12 = Math.abs(var2);
         double var14 = var10 >= var12?var10:var12;
         return var8 < 1.0E-6D?true:var8 / var14 < 1.0E-4D;
      }
   }

   public Object clone() {
      _w var1 = null;
      var1 = (_w)super.clone();
      return var1;
   }

   public final double h() {
      return this.u;
   }

   public final void N(double var1) {
      this.u = var1;
   }

   public final double M() {
      return this.n;
   }

   public final void k(double var1) {
      this.n = var1;
   }

   public final double e() {
      return this.M;
   }

   public final void W(double var1) {
      this.M = var1;
   }

   public final double g() {
      return this.p;
   }

   public final void L(double var1) {
      this.p = var1;
   }

   public final double V() {
      return this.v;
   }

   public final void h(double var1) {
      this.v = var1;
   }

   public final double f() {
      return this.P;
   }

   public final void d(double var1) {
      this.P = var1;
   }

   public final double C() {
      return this.Z;
   }

   public final void Q(double var1) {
      this.Z = var1;
   }

   public final double l() {
      return this.q;
   }

   public final void T(double var1) {
      this.q = var1;
   }

   public final double s() {
      return this.l;
   }

   public final void Z(double var1) {
      this.l = var1;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
