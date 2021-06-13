package net;

import java.io.Serializable;
import net._w;
import net.bc;
import net.br;
import net.gp;
import net.mt;
import net.ok;
import net.op;
import net.pv;
import net.ra;
import net.rk;
import net.rl;
import net.up;
import net.we;
import net.x5;
import net.xn;
import net.u.d;

public class bd implements Serializable, Cloneable {
   static final long serialVersionUID = -8405036035410109353L;
   public float i;
   public float z;
   public float R;
   public float s;
   public float M;
   public float a;
   public float k;
   public float w;
   public float b;
   public float G;
   public float y;
   public float r;
   public float W;
   public float U;
   public float g;
   public float S;
   private static final double D = 1.0E-8D;

   public bd(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {
      this.i = var1;
      this.z = var2;
      this.R = var3;
      this.s = var4;
      this.M = var5;
      this.a = var6;
      this.k = var7;
      this.w = var8;
      this.b = var9;
      this.G = var10;
      this.y = var11;
      this.r = var12;
      this.W = var13;
      this.U = var14;
      this.g = var15;
      this.S = var16;
   }

   public bd(float[] var1) {
      this.i = var1[0];
      this.z = var1[1];
      this.R = var1[2];
      this.s = var1[3];
      this.M = var1[4];
      this.a = var1[5];
      this.k = var1[6];
      this.w = var1[7];
      this.b = var1[8];
      this.G = var1[9];
      this.y = var1[10];
      this.r = var1[11];
      this.W = var1[12];
      this.U = var1[13];
      this.g = var1[14];
      this.S = var1[15];
   }

   public bd(rk var1, pv var2, float var3) {
      this.i = (float)((double)var3 * (1.0D - 2.0D * (double)var1.v * (double)var1.v - 2.0D * (double)var1.M * (double)var1.M));
      this.M = (float)((double)var3 * 2.0D * (double)(var1.j * var1.v + var1.U * var1.M));
      this.b = (float)((double)var3 * 2.0D * (double)(var1.j * var1.M - var1.U * var1.v));
      this.z = (float)((double)var3 * 2.0D * (double)(var1.j * var1.v - var1.U * var1.M));
      this.a = (float)((double)var3 * (1.0D - 2.0D * (double)var1.j * (double)var1.j - 2.0D * (double)var1.M * (double)var1.M));
      this.G = (float)((double)var3 * 2.0D * (double)(var1.v * var1.M + var1.U * var1.j));
      this.R = (float)((double)var3 * 2.0D * (double)(var1.j * var1.M + var1.U * var1.v));
      this.k = (float)((double)var3 * 2.0D * (double)(var1.v * var1.M - var1.U * var1.j));
      this.y = (float)((double)var3 * (1.0D - 2.0D * (double)var1.j * (double)var1.j - 2.0D * (double)var1.v * (double)var1.v));
      this.s = var2.q;
      this.w = var2.Q;
      this.r = var2.G;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public bd(we var1) {
      this.i = (float)var1.M;
      this.z = (float)var1.W;
      this.R = (float)var1.l;
      this.s = (float)var1.s;
      this.M = (float)var1.h;
      this.a = (float)var1.o;
      this.k = (float)var1.g;
      this.w = (float)var1.a;
      this.b = (float)var1.T;
      this.G = (float)var1.i;
      this.y = (float)var1.j;
      this.r = (float)var1.X;
      this.W = (float)var1.L;
      this.U = (float)var1.r;
      this.g = (float)var1.H;
      this.S = (float)var1.O;
   }

   public bd(bd var1) {
      this.i = var1.i;
      this.z = var1.z;
      this.R = var1.R;
      this.s = var1.s;
      this.M = var1.M;
      this.a = var1.a;
      this.k = var1.k;
      this.w = var1.w;
      this.b = var1.b;
      this.G = var1.G;
      this.y = var1.y;
      this.r = var1.r;
      this.W = var1.W;
      this.U = var1.U;
      this.g = var1.g;
      this.S = var1.S;
   }

   public bd(br var1, pv var2, float var3) {
      this.i = var1.y * var3;
      this.z = var1.H * var3;
      this.R = var1.q * var3;
      this.s = var2.q;
      this.M = var1.e * var3;
      this.a = var1.Q * var3;
      this.k = var1.D * var3;
      this.w = var2.Q;
      this.b = var1.x * var3;
      this.G = var1.m * var3;
      this.y = var1.t * var3;
      this.r = var2.G;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public bd() {
      this.i = 0.0F;
      this.z = 0.0F;
      this.R = 0.0F;
      this.s = 0.0F;
      this.M = 0.0F;
      this.a = 0.0F;
      this.k = 0.0F;
      this.w = 0.0F;
      this.b = 0.0F;
      this.G = 0.0F;
      this.y = 0.0F;
      this.r = 0.0F;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 0.0F;
   }

   public String toString() {
      return this.i + ", " + this.z + ", " + this.R + ", " + this.s + "\n" + this.M + ", " + this.a + ", " + this.k + ", " + this.w + "\n" + this.b + ", " + this.G + ", " + this.y + ", " + this.r + "\n" + this.W + ", " + this.U + ", " + this.g + ", " + this.S + "\n";
   }

   public final void h() {
      this.i = 1.0F;
      this.z = 0.0F;
      this.R = 0.0F;
      this.s = 0.0F;
      this.M = 0.0F;
      this.a = 1.0F;
      this.k = 0.0F;
      this.w = 0.0F;
      this.b = 0.0F;
      this.G = 0.0F;
      this.y = 1.0F;
      this.r = 0.0F;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void I(int var1, int var2, float var3) {
      switch(var1) {
      case 0:
         switch(var2) {
         case 0:
            this.i = var3;
            return;
         case 1:
            this.z = var3;
            return;
         case 2:
            this.R = var3;
            return;
         case 3:
            this.s = var3;
            return;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4f0"));
         }
      case 1:
         switch(var2) {
         case 0:
            this.M = var3;
            return;
         case 1:
            this.a = var3;
            return;
         case 2:
            this.k = var3;
            return;
         case 3:
            this.w = var3;
            return;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4f0"));
         }
      case 2:
         switch(var2) {
         case 0:
            this.b = var3;
            return;
         case 1:
            this.G = var3;
            return;
         case 2:
            this.y = var3;
            return;
         case 3:
            this.r = var3;
            return;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4f0"));
         }
      case 3:
         switch(var2) {
         case 0:
            this.W = var3;
            return;
         case 1:
            this.U = var3;
            return;
         case 2:
            this.g = var3;
            return;
         case 3:
            this.S = var3;
            return;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4f0"));
         }
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4f0"));
      }
   }

   public final float Y(int var1, int var2) {
      switch(var1) {
      case 0:
         switch(var2) {
         case 0:
            return this.i;
         case 1:
            return this.z;
         case 2:
            return this.R;
         case 3:
            return this.s;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4f1"));
         }
      case 1:
         switch(var2) {
         case 0:
            return this.M;
         case 1:
            return this.a;
         case 2:
            return this.k;
         case 3:
            return this.w;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4f1"));
         }
      case 2:
         switch(var2) {
         case 0:
            return this.b;
         case 1:
            return this.G;
         case 2:
            return this.y;
         case 3:
            return this.r;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4f1"));
         }
      case 3:
         switch(var2) {
         case 0:
            return this.W;
         case 1:
            return this.U;
         case 2:
            return this.g;
         case 3:
            return this.S;
         }
      }

      throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4f1"));
   }

   public final void D(int var1, rl var2) {
      var2.j = this.i;
      var2.v = this.z;
      var2.M = this.R;
      var2.U = this.s;
   }

   public final void E(int var1, float[] var2) {
      var2[0] = this.i;
      var2[1] = this.z;
      var2[2] = this.R;
      var2[3] = this.s;
   }

   public final void h(int var1, rl var2) {
      var2.j = this.i;
      var2.v = this.M;
      var2.M = this.b;
      var2.U = this.W;
   }

   public final void J(int var1, float[] var2) {
      var2[0] = this.i;
      var2[1] = this.M;
      var2[2] = this.b;
      var2[3] = this.W;
   }

   public final void x(float var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.U(var3, var2);
      this.i = (float)(var2[0] * (double)var1);
      this.z = (float)(var2[1] * (double)var1);
      this.R = (float)(var2[2] * (double)var1);
      this.M = (float)(var2[3] * (double)var1);
      this.a = (float)(var2[4] * (double)var1);
      this.k = (float)(var2[5] * (double)var1);
      this.b = (float)(var2[6] * (double)var1);
      this.G = (float)(var2[7] * (double)var1);
      this.y = (float)(var2[8] * (double)var1);
   }

   public final void g(_w var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.U(var3, var2);
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

   public final void V(br var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.U(var3, var2);
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

   public final float D(br var1, pv var2) {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.U(var4, var3);
      var1.y = (float)var3[0];
      var1.H = (float)var3[1];
      var1.q = (float)var3[2];
      var1.e = (float)var3[3];
      var1.Q = (float)var3[4];
      var1.D = (float)var3[5];
      var1.x = (float)var3[6];
      var1.m = (float)var3[7];
      var1.t = (float)var3[8];
      var2.q = this.s;
      var2.Q = this.w;
      var2.G = this.r;
      return (float)_w.I(var4);
   }

   public final void m(rk var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.U(var3, var2);
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

   public final void t(pv var1) {
      var1.q = this.s;
      var1.Q = this.w;
      var1.G = this.r;
   }

   public final void h(br var1) {
      var1.y = this.i;
      var1.H = this.z;
      var1.q = this.R;
      var1.e = this.M;
      var1.Q = this.a;
      var1.D = this.k;
      var1.x = this.b;
      var1.m = this.G;
      var1.t = this.y;
   }

   public final float R() {
      double[] var1 = new double[9];
      double[] var2 = new double[3];
      this.U(var2, var1);
      return (float)_w.I(var2);
   }

   public final void U(br var1) {
      this.i = var1.y;
      this.z = var1.H;
      this.R = var1.q;
      this.M = var1.e;
      this.a = var1.Q;
      this.k = var1.D;
      this.b = var1.x;
      this.G = var1.m;
      this.y = var1.t;
   }

   public final void h(int var1, float var2, float var3, float var4, float var5) {
      switch(var1) {
      case 0:
         this.i = var2;
         this.z = var3;
         this.R = var4;
         this.s = var5;
         break;
      case 1:
         this.M = var2;
         this.a = var3;
         this.k = var4;
         this.w = var5;
         break;
      case 2:
         this.b = var2;
         this.G = var3;
         this.y = var4;
         this.r = var5;
         break;
      case 3:
         this.W = var2;
         this.U = var3;
         this.g = var4;
         this.S = var5;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4f6"));
      }

   }

   public final void m(int var1, rl var2) {
      switch(var1) {
      case 0:
         this.i = var2.j;
         this.z = var2.v;
         this.R = var2.M;
         this.s = var2.U;
         break;
      case 1:
         this.M = var2.j;
         this.a = var2.v;
         this.k = var2.M;
         this.w = var2.U;
         break;
      case 2:
         this.b = var2.j;
         this.G = var2.v;
         this.y = var2.M;
         this.r = var2.U;
         break;
      case 3:
         this.W = var2.j;
         this.U = var2.v;
         this.g = var2.M;
         this.S = var2.U;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4f6"));
      }

   }

   public final void C(int var1, float[] var2) {
      switch(var1) {
      case 0:
         this.i = var2[0];
         this.z = var2[1];
         this.R = var2[2];
         this.s = var2[3];
         break;
      case 1:
         this.M = var2[0];
         this.a = var2[1];
         this.k = var2[2];
         this.w = var2[3];
         break;
      case 2:
         this.b = var2[0];
         this.G = var2[1];
         this.y = var2[2];
         this.r = var2[3];
         break;
      case 3:
         this.W = var2[0];
         this.U = var2[1];
         this.g = var2[2];
         this.S = var2[3];
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4f6"));
      }

   }

   public final void e(int var1, float var2, float var3, float var4, float var5) {
      switch(var1) {
      case 0:
         this.i = var2;
         this.M = var3;
         this.b = var4;
         this.W = var5;
         break;
      case 1:
         this.z = var2;
         this.a = var3;
         this.G = var4;
         this.U = var5;
         break;
      case 2:
         this.R = var2;
         this.k = var3;
         this.y = var4;
         this.g = var5;
         break;
      case 3:
         this.s = var2;
         this.w = var3;
         this.r = var4;
         this.S = var5;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4f9"));
      }

   }

   public final void f(int var1, rl var2) {
      switch(var1) {
      case 0:
         this.i = var2.j;
         this.M = var2.v;
         this.b = var2.M;
         this.W = var2.U;
         break;
      case 1:
         this.z = var2.j;
         this.a = var2.v;
         this.G = var2.M;
         this.U = var2.U;
         break;
      case 2:
         this.R = var2.j;
         this.k = var2.v;
         this.y = var2.M;
         this.g = var2.U;
         break;
      case 3:
         this.s = var2.j;
         this.w = var2.v;
         this.r = var2.M;
         this.S = var2.U;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4f9"));
      }

   }

   public final void y(int var1, float[] var2) {
      switch(var1) {
      case 0:
         this.i = var2[0];
         this.M = var2[1];
         this.b = var2[2];
         this.W = var2[3];
         break;
      case 1:
         this.z = var2[0];
         this.a = var2[1];
         this.G = var2[2];
         this.U = var2[3];
         break;
      case 2:
         this.R = var2[0];
         this.k = var2[1];
         this.y = var2[2];
         this.g = var2[3];
         break;
      case 3:
         this.s = var2[0];
         this.w = var2[1];
         this.r = var2[2];
         this.S = var2[3];
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix4f9"));
      }

   }

   public final void o(float var1) {
      this.i += var1;
      this.z += var1;
      this.R += var1;
      this.s += var1;
      this.M += var1;
      this.a += var1;
      this.k += var1;
      this.w += var1;
      this.b += var1;
      this.G += var1;
      this.y += var1;
      this.r += var1;
      this.W += var1;
      this.U += var1;
      this.g += var1;
      this.S += var1;
   }

   public final void e(float var1, bd var2) {
      this.i = var2.i + var1;
      this.z = var2.z + var1;
      this.R = var2.R + var1;
      this.s = var2.s + var1;
      this.M = var2.M + var1;
      this.a = var2.a + var1;
      this.k = var2.k + var1;
      this.w = var2.w + var1;
      this.b = var2.b + var1;
      this.G = var2.G + var1;
      this.y = var2.y + var1;
      this.r = var2.r + var1;
      this.W = var2.W + var1;
      this.U = var2.U + var1;
      this.g = var2.g + var1;
      this.S = var2.S + var1;
   }

   public final void B(bd var1, bd var2) {
      this.i = var1.i + var2.i;
      this.z = var1.z + var2.z;
      this.R = var1.R + var2.R;
      this.s = var1.s + var2.s;
      this.M = var1.M + var2.M;
      this.a = var1.a + var2.a;
      this.k = var1.k + var2.k;
      this.w = var1.w + var2.w;
      this.b = var1.b + var2.b;
      this.G = var1.G + var2.G;
      this.y = var1.y + var2.y;
      this.r = var1.r + var2.r;
      this.W = var1.W + var2.W;
      this.U = var1.U + var2.U;
      this.g = var1.g + var2.g;
      this.S = var1.S + var2.S;
   }

   public final void j(bd var1) {
      this.i += var1.i;
      this.z += var1.z;
      this.R += var1.R;
      this.s += var1.s;
      this.M += var1.M;
      this.a += var1.a;
      this.k += var1.k;
      this.w += var1.w;
      this.b += var1.b;
      this.G += var1.G;
      this.y += var1.y;
      this.r += var1.r;
      this.W += var1.W;
      this.U += var1.U;
      this.g += var1.g;
      this.S += var1.S;
   }

   public final void f(bd var1, bd var2) {
      this.i = var1.i - var2.i;
      this.z = var1.z - var2.z;
      this.R = var1.R - var2.R;
      this.s = var1.s - var2.s;
      this.M = var1.M - var2.M;
      this.a = var1.a - var2.a;
      this.k = var1.k - var2.k;
      this.w = var1.w - var2.w;
      this.b = var1.b - var2.b;
      this.G = var1.G - var2.G;
      this.y = var1.y - var2.y;
      this.r = var1.r - var2.r;
      this.W = var1.W - var2.W;
      this.U = var1.U - var2.U;
      this.g = var1.g - var2.g;
      this.S = var1.S - var2.S;
   }

   public final void i(bd var1) {
      this.i -= var1.i;
      this.z -= var1.z;
      this.R -= var1.R;
      this.s -= var1.s;
      this.M -= var1.M;
      this.a -= var1.a;
      this.k -= var1.k;
      this.w -= var1.w;
      this.b -= var1.b;
      this.G -= var1.G;
      this.y -= var1.y;
      this.r -= var1.r;
      this.W -= var1.W;
      this.U -= var1.U;
      this.g -= var1.g;
      this.S -= var1.S;
   }

   public final void o() {
      float var1 = this.M;
      this.M = this.z;
      this.z = var1;
      var1 = this.b;
      this.b = this.R;
      this.R = var1;
      var1 = this.W;
      this.W = this.s;
      this.s = var1;
      var1 = this.G;
      this.G = this.k;
      this.k = var1;
      var1 = this.U;
      this.U = this.w;
      this.w = var1;
      var1 = this.g;
      this.g = this.r;
      this.r = var1;
   }

   public final void I(bd var1) {
      if(this != var1) {
         this.i = var1.i;
         this.z = var1.M;
         this.R = var1.b;
         this.s = var1.W;
         this.M = var1.z;
         this.a = var1.a;
         this.k = var1.G;
         this.w = var1.U;
         this.b = var1.R;
         this.G = var1.k;
         this.y = var1.y;
         this.r = var1.g;
         this.W = var1.s;
         this.U = var1.w;
         this.g = var1.r;
         this.S = var1.S;
      } else {
         this.o();
      }

   }

   public final void J(rk var1) {
      this.i = 1.0F - 2.0F * var1.v * var1.v - 2.0F * var1.M * var1.M;
      this.M = 2.0F * (var1.j * var1.v + var1.U * var1.M);
      this.b = 2.0F * (var1.j * var1.M - var1.U * var1.v);
      this.z = 2.0F * (var1.j * var1.v - var1.U * var1.M);
      this.a = 1.0F - 2.0F * var1.j * var1.j - 2.0F * var1.M * var1.M;
      this.G = 2.0F * (var1.v * var1.M + var1.U * var1.j);
      this.R = 2.0F * (var1.j * var1.M + var1.U * var1.v);
      this.k = 2.0F * (var1.v * var1.M - var1.U * var1.j);
      this.y = 1.0F - 2.0F * var1.j * var1.j - 2.0F * var1.v * var1.v;
      this.s = 0.0F;
      this.w = 0.0F;
      this.r = 0.0F;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void P(ok var1) {
      float var2 = (float)Math.sqrt((double)(var1.y * var1.y + var1.D * var1.D + var1.U * var1.U));
      if((double)var2 < 1.0E-8D) {
         this.i = 1.0F;
         this.z = 0.0F;
         this.R = 0.0F;
         this.M = 0.0F;
         this.a = 1.0F;
         this.k = 0.0F;
         this.b = 0.0F;
         this.G = 0.0F;
         this.y = 1.0F;
      } else {
         var2 = 1.0F / var2;
         float var3 = var1.y * var2;
         float var4 = var1.D * var2;
         float var5 = var1.U * var2;
         float var6 = (float)Math.sin((double)var1.k);
         float var7 = (float)Math.cos((double)var1.k);
         float var8 = 1.0F - var7;
         float var9 = var3 * var5;
         float var10 = var3 * var4;
         float var11 = var4 * var5;
         this.i = var8 * var3 * var3 + var7;
         this.z = var8 * var10 - var6 * var5;
         this.R = var8 * var9 + var6 * var4;
         this.M = var8 * var10 + var6 * var5;
         this.a = var8 * var4 * var4 + var7;
         this.k = var8 * var11 - var6 * var3;
         this.b = var8 * var9 - var6 * var4;
         this.G = var8 * var11 + var6 * var3;
         this.y = var8 * var5 * var5 + var7;
      }

      this.s = 0.0F;
      this.w = 0.0F;
      this.r = 0.0F;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void u(up var1) {
      this.i = (float)(1.0D - 2.0D * var1.b * var1.b - 2.0D * var1.G * var1.G);
      this.M = (float)(2.0D * (var1.M * var1.b + var1.d * var1.G));
      this.b = (float)(2.0D * (var1.M * var1.G - var1.d * var1.b));
      this.z = (float)(2.0D * (var1.M * var1.b - var1.d * var1.G));
      this.a = (float)(1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.G * var1.G);
      this.G = (float)(2.0D * (var1.b * var1.G + var1.d * var1.M));
      this.R = (float)(2.0D * (var1.M * var1.G + var1.d * var1.b));
      this.k = (float)(2.0D * (var1.b * var1.G - var1.d * var1.M));
      this.y = (float)(1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.b * var1.b);
      this.s = 0.0F;
      this.w = 0.0F;
      this.r = 0.0F;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void s(mt var1) {
      double var2 = Math.sqrt(var1.b * var1.b + var1.C * var1.C + var1.L * var1.L);
      if(var2 < 1.0E-8D) {
         this.i = 1.0F;
         this.z = 0.0F;
         this.R = 0.0F;
         this.M = 0.0F;
         this.a = 1.0F;
         this.k = 0.0F;
         this.b = 0.0F;
         this.G = 0.0F;
         this.y = 1.0F;
      } else {
         var2 = 1.0D / var2;
         double var4 = var1.b * var2;
         double var6 = var1.C * var2;
         double var8 = var1.L * var2;
         float var10 = (float)Math.sin(var1.m);
         float var11 = (float)Math.cos(var1.m);
         float var12 = 1.0F - var11;
         float var13 = (float)(var4 * var8);
         float var14 = (float)(var4 * var6);
         float var15 = (float)(var6 * var8);
         this.i = var12 * (float)(var4 * var4) + var11;
         this.z = var12 * var14 - var10 * (float)var8;
         this.R = var12 * var13 + var10 * (float)var6;
         this.M = var12 * var14 + var10 * (float)var8;
         this.a = var12 * (float)(var6 * var6) + var11;
         this.k = var12 * var15 - var10 * (float)var4;
         this.b = var12 * var13 - var10 * (float)var6;
         this.G = var12 * var15 + var10 * (float)var4;
         this.y = var12 * (float)(var8 * var8) + var11;
      }

      this.s = 0.0F;
      this.w = 0.0F;
      this.r = 0.0F;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void Y(up var1, gp var2, double var3) {
      this.i = (float)(var3 * (1.0D - 2.0D * var1.b * var1.b - 2.0D * var1.G * var1.G));
      this.M = (float)(var3 * 2.0D * (var1.M * var1.b + var1.d * var1.G));
      this.b = (float)(var3 * 2.0D * (var1.M * var1.G - var1.d * var1.b));
      this.z = (float)(var3 * 2.0D * (var1.M * var1.b - var1.d * var1.G));
      this.a = (float)(var3 * (1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.G * var1.G));
      this.G = (float)(var3 * 2.0D * (var1.b * var1.G + var1.d * var1.M));
      this.R = (float)(var3 * 2.0D * (var1.M * var1.G + var1.d * var1.b));
      this.k = (float)(var3 * 2.0D * (var1.b * var1.G - var1.d * var1.M));
      this.y = (float)(var3 * (1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.b * var1.b));
      this.s = (float)var2.n;
      this.w = (float)var2.Z;
      this.r = (float)var2.B;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void m(rk var1, pv var2, float var3) {
      this.i = var3 * (1.0F - 2.0F * var1.v * var1.v - 2.0F * var1.M * var1.M);
      this.M = var3 * 2.0F * (var1.j * var1.v + var1.U * var1.M);
      this.b = var3 * 2.0F * (var1.j * var1.M - var1.U * var1.v);
      this.z = var3 * 2.0F * (var1.j * var1.v - var1.U * var1.M);
      this.a = var3 * (1.0F - 2.0F * var1.j * var1.j - 2.0F * var1.M * var1.M);
      this.G = var3 * 2.0F * (var1.v * var1.M + var1.U * var1.j);
      this.R = var3 * 2.0F * (var1.j * var1.M + var1.U * var1.v);
      this.k = var3 * 2.0F * (var1.v * var1.M - var1.U * var1.j);
      this.y = var3 * (1.0F - 2.0F * var1.j * var1.j - 2.0F * var1.v * var1.v);
      this.s = var2.q;
      this.w = var2.Q;
      this.r = var2.G;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void N(we var1) {
      this.i = (float)var1.M;
      this.z = (float)var1.W;
      this.R = (float)var1.l;
      this.s = (float)var1.s;
      this.M = (float)var1.h;
      this.a = (float)var1.o;
      this.k = (float)var1.g;
      this.w = (float)var1.a;
      this.b = (float)var1.T;
      this.G = (float)var1.i;
      this.y = (float)var1.j;
      this.r = (float)var1.X;
      this.W = (float)var1.L;
      this.U = (float)var1.r;
      this.g = (float)var1.H;
      this.S = (float)var1.O;
   }

   public final void r(bd var1) {
      this.i = var1.i;
      this.z = var1.z;
      this.R = var1.R;
      this.s = var1.s;
      this.M = var1.M;
      this.a = var1.a;
      this.k = var1.k;
      this.w = var1.w;
      this.b = var1.b;
      this.G = var1.G;
      this.y = var1.y;
      this.r = var1.r;
      this.W = var1.W;
      this.U = var1.U;
      this.g = var1.g;
      this.S = var1.S;
   }

   public final void S(bd var1) {
      this.e(var1);
   }

   public final void a() {
      this.e(this);
   }

   final void e(bd var1) {
      double[] var2 = new double[16];
      double[] var3 = new double[16];
      int[] var4 = new int[4];
      var2[0] = (double)var1.i;
      var2[1] = (double)var1.z;
      var2[2] = (double)var1.R;
      var2[3] = (double)var1.s;
      var2[4] = (double)var1.M;
      var2[5] = (double)var1.a;
      var2[6] = (double)var1.k;
      var2[7] = (double)var1.w;
      var2[8] = (double)var1.b;
      var2[9] = (double)var1.G;
      var2[10] = (double)var1.y;
      var2[11] = (double)var1.r;
      var2[12] = (double)var1.W;
      var2[13] = (double)var1.U;
      var2[14] = (double)var1.g;
      var2[15] = (double)var1.S;
      if(x(var2, var4)) {
         int var5 = 0;

         while(true) {
            var3[var5] = 0.0D;
            ++var5;
         }
      }

      throw new xn(bc.I("Matrix4f12"));
   }

   static boolean x(double[] param0, int[] param1) {
      // $FF: Couldn't be decompiled
   }

   static void t(double[] var0, int[] var1, double[] var2) {
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

   public final float f() {
      float var1 = this.i * (this.a * this.y * this.S + this.k * this.r * this.U + this.w * this.G * this.g - this.w * this.y * this.U - this.a * this.r * this.g - this.k * this.G * this.S);
      var1 = var1 - this.z * (this.M * this.y * this.S + this.k * this.r * this.W + this.w * this.b * this.g - this.w * this.y * this.W - this.M * this.r * this.g - this.k * this.b * this.S);
      var1 = var1 + this.R * (this.M * this.G * this.S + this.a * this.r * this.W + this.w * this.b * this.U - this.w * this.G * this.W - this.M * this.r * this.U - this.a * this.b * this.S);
      var1 = var1 - this.s * (this.M * this.G * this.g + this.a * this.y * this.W + this.k * this.b * this.U - this.k * this.G * this.W - this.M * this.y * this.U - this.a * this.b * this.g);
      return var1;
   }

   public final void M(br var1) {
      this.i = var1.y;
      this.z = var1.H;
      this.R = var1.q;
      this.s = 0.0F;
      this.M = var1.e;
      this.a = var1.Q;
      this.k = var1.D;
      this.w = 0.0F;
      this.b = var1.x;
      this.G = var1.m;
      this.y = var1.t;
      this.r = 0.0F;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void c(_w var1) {
      this.i = (float)var1.u;
      this.z = (float)var1.n;
      this.R = (float)var1.M;
      this.s = 0.0F;
      this.M = (float)var1.p;
      this.a = (float)var1.v;
      this.k = (float)var1.P;
      this.w = 0.0F;
      this.b = (float)var1.Z;
      this.G = (float)var1.q;
      this.y = (float)var1.l;
      this.r = 0.0F;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void j(float var1) {
      this.i = var1;
      this.z = 0.0F;
      this.R = 0.0F;
      this.s = 0.0F;
      this.M = 0.0F;
      this.a = var1;
      this.k = 0.0F;
      this.w = 0.0F;
      this.b = 0.0F;
      this.G = 0.0F;
      this.y = var1;
      this.r = 0.0F;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void m(float[] var1) {
      this.i = var1[0];
      this.z = var1[1];
      this.R = var1[2];
      this.s = var1[3];
      this.M = var1[4];
      this.a = var1[5];
      this.k = var1[6];
      this.w = var1[7];
      this.b = var1[8];
      this.G = var1[9];
      this.y = var1[10];
      this.r = var1[11];
      this.W = var1[12];
      this.U = var1[13];
      this.g = var1[14];
      this.S = var1[15];
   }

   public final void o(pv var1) {
      this.i = 1.0F;
      this.z = 0.0F;
      this.R = 0.0F;
      this.s = var1.q;
      this.M = 0.0F;
      this.a = 1.0F;
      this.k = 0.0F;
      this.w = var1.Q;
      this.b = 0.0F;
      this.G = 0.0F;
      this.y = 1.0F;
      this.r = var1.G;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void b(float var1, pv var2) {
      this.i = var1;
      this.z = 0.0F;
      this.R = 0.0F;
      this.s = var2.q;
      this.M = 0.0F;
      this.a = var1;
      this.k = 0.0F;
      this.w = var2.Q;
      this.b = 0.0F;
      this.G = 0.0F;
      this.y = var1;
      this.r = var2.G;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void Y(pv var1, float var2) {
      this.i = var2;
      this.z = 0.0F;
      this.R = 0.0F;
      this.s = var2 * var1.q;
      this.M = 0.0F;
      this.a = var2;
      this.k = 0.0F;
      this.w = var2 * var1.Q;
      this.b = 0.0F;
      this.G = 0.0F;
      this.y = var2;
      this.r = var2 * var1.G;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void h(br var1, pv var2, float var3) {
      this.i = var1.y * var3;
      this.z = var1.H * var3;
      this.R = var1.q * var3;
      this.s = var2.q;
      this.M = var1.e * var3;
      this.a = var1.Q * var3;
      this.k = var1.D * var3;
      this.w = var2.Q;
      this.b = var1.x * var3;
      this.G = var1.m * var3;
      this.y = var1.t * var3;
      this.r = var2.G;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void C(_w var1, gp var2, double var3) {
      this.i = (float)(var1.u * var3);
      this.z = (float)(var1.n * var3);
      this.R = (float)(var1.M * var3);
      this.s = (float)var2.n;
      this.M = (float)(var1.p * var3);
      this.a = (float)(var1.v * var3);
      this.k = (float)(var1.P * var3);
      this.w = (float)var2.Z;
      this.b = (float)(var1.Z * var3);
      this.G = (float)(var1.q * var3);
      this.y = (float)(var1.l * var3);
      this.r = (float)var2.B;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void z(pv var1) {
      this.s = var1.q;
      this.w = var1.Q;
      this.r = var1.G;
   }

   public final void L(float var1) {
      float var2 = (float)Math.sin((double)var1);
      float var3 = (float)Math.cos((double)var1);
      this.i = 1.0F;
      this.z = 0.0F;
      this.R = 0.0F;
      this.s = 0.0F;
      this.M = 0.0F;
      this.a = var3;
      this.k = -var2;
      this.w = 0.0F;
      this.b = 0.0F;
      this.G = var2;
      this.y = var3;
      this.r = 0.0F;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void d(float var1) {
      float var2 = (float)Math.sin((double)var1);
      float var3 = (float)Math.cos((double)var1);
      this.i = var3;
      this.z = 0.0F;
      this.R = var2;
      this.s = 0.0F;
      this.M = 0.0F;
      this.a = 1.0F;
      this.k = 0.0F;
      this.w = 0.0F;
      this.b = -var2;
      this.G = 0.0F;
      this.y = var3;
      this.r = 0.0F;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void T(float var1) {
      float var2 = (float)Math.sin((double)var1);
      float var3 = (float)Math.cos((double)var1);
      this.i = var3;
      this.z = -var2;
      this.R = 0.0F;
      this.s = 0.0F;
      this.M = var2;
      this.a = var3;
      this.k = 0.0F;
      this.w = 0.0F;
      this.b = 0.0F;
      this.G = 0.0F;
      this.y = 1.0F;
      this.r = 0.0F;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 1.0F;
   }

   public final void v(float var1) {
      this.i *= var1;
      this.z *= var1;
      this.R *= var1;
      this.s *= var1;
      this.M *= var1;
      this.a *= var1;
      this.k *= var1;
      this.w *= var1;
      this.b *= var1;
      this.G *= var1;
      this.y *= var1;
      this.r *= var1;
      this.W *= var1;
      this.U *= var1;
      this.g *= var1;
      this.S *= var1;
   }

   public final void H(float var1, bd var2) {
      this.i = var2.i * var1;
      this.z = var2.z * var1;
      this.R = var2.R * var1;
      this.s = var2.s * var1;
      this.M = var2.M * var1;
      this.a = var2.a * var1;
      this.k = var2.k * var1;
      this.w = var2.w * var1;
      this.b = var2.b * var1;
      this.G = var2.G * var1;
      this.y = var2.y * var1;
      this.r = var2.r * var1;
      this.W = var2.W * var1;
      this.U = var2.U * var1;
      this.g = var2.g * var1;
      this.S = var2.S * var1;
   }

   public final void x(bd var1) {
      float var2 = this.i * var1.i + this.z * var1.M + this.R * var1.b + this.s * var1.W;
      float var3 = this.i * var1.z + this.z * var1.a + this.R * var1.G + this.s * var1.U;
      float var4 = this.i * var1.R + this.z * var1.k + this.R * var1.y + this.s * var1.g;
      float var5 = this.i * var1.s + this.z * var1.w + this.R * var1.r + this.s * var1.S;
      float var6 = this.M * var1.i + this.a * var1.M + this.k * var1.b + this.w * var1.W;
      float var7 = this.M * var1.z + this.a * var1.a + this.k * var1.G + this.w * var1.U;
      float var8 = this.M * var1.R + this.a * var1.k + this.k * var1.y + this.w * var1.g;
      float var9 = this.M * var1.s + this.a * var1.w + this.k * var1.r + this.w * var1.S;
      float var10 = this.b * var1.i + this.G * var1.M + this.y * var1.b + this.r * var1.W;
      float var11 = this.b * var1.z + this.G * var1.a + this.y * var1.G + this.r * var1.U;
      float var12 = this.b * var1.R + this.G * var1.k + this.y * var1.y + this.r * var1.g;
      float var13 = this.b * var1.s + this.G * var1.w + this.y * var1.r + this.r * var1.S;
      float var14 = this.W * var1.i + this.U * var1.M + this.g * var1.b + this.S * var1.W;
      float var15 = this.W * var1.z + this.U * var1.a + this.g * var1.G + this.S * var1.U;
      float var16 = this.W * var1.R + this.U * var1.k + this.g * var1.y + this.S * var1.g;
      float var17 = this.W * var1.s + this.U * var1.w + this.g * var1.r + this.S * var1.S;
      this.i = var2;
      this.z = var3;
      this.R = var4;
      this.s = var5;
      this.M = var6;
      this.a = var7;
      this.k = var8;
      this.w = var9;
      this.b = var10;
      this.G = var11;
      this.y = var12;
      this.r = var13;
      this.W = var14;
      this.U = var15;
      this.g = var16;
      this.S = var17;
   }

   public final void E(bd var1, bd var2) {
      if(this != var1 && this != var2) {
         this.i = var1.i * var2.i + var1.z * var2.M + var1.R * var2.b + var1.s * var2.W;
         this.z = var1.i * var2.z + var1.z * var2.a + var1.R * var2.G + var1.s * var2.U;
         this.R = var1.i * var2.R + var1.z * var2.k + var1.R * var2.y + var1.s * var2.g;
         this.s = var1.i * var2.s + var1.z * var2.w + var1.R * var2.r + var1.s * var2.S;
         this.M = var1.M * var2.i + var1.a * var2.M + var1.k * var2.b + var1.w * var2.W;
         this.a = var1.M * var2.z + var1.a * var2.a + var1.k * var2.G + var1.w * var2.U;
         this.k = var1.M * var2.R + var1.a * var2.k + var1.k * var2.y + var1.w * var2.g;
         this.w = var1.M * var2.s + var1.a * var2.w + var1.k * var2.r + var1.w * var2.S;
         this.b = var1.b * var2.i + var1.G * var2.M + var1.y * var2.b + var1.r * var2.W;
         this.G = var1.b * var2.z + var1.G * var2.a + var1.y * var2.G + var1.r * var2.U;
         this.y = var1.b * var2.R + var1.G * var2.k + var1.y * var2.y + var1.r * var2.g;
         this.r = var1.b * var2.s + var1.G * var2.w + var1.y * var2.r + var1.r * var2.S;
         this.W = var1.W * var2.i + var1.U * var2.M + var1.g * var2.b + var1.S * var2.W;
         this.U = var1.W * var2.z + var1.U * var2.a + var1.g * var2.G + var1.S * var2.U;
         this.g = var1.W * var2.R + var1.U * var2.k + var1.g * var2.y + var1.S * var2.g;
         this.S = var1.W * var2.s + var1.U * var2.w + var1.g * var2.r + var1.S * var2.S;
      } else {
         float var3 = var1.i * var2.i + var1.z * var2.M + var1.R * var2.b + var1.s * var2.W;
         float var4 = var1.i * var2.z + var1.z * var2.a + var1.R * var2.G + var1.s * var2.U;
         float var5 = var1.i * var2.R + var1.z * var2.k + var1.R * var2.y + var1.s * var2.g;
         float var6 = var1.i * var2.s + var1.z * var2.w + var1.R * var2.r + var1.s * var2.S;
         float var7 = var1.M * var2.i + var1.a * var2.M + var1.k * var2.b + var1.w * var2.W;
         float var8 = var1.M * var2.z + var1.a * var2.a + var1.k * var2.G + var1.w * var2.U;
         float var9 = var1.M * var2.R + var1.a * var2.k + var1.k * var2.y + var1.w * var2.g;
         float var10 = var1.M * var2.s + var1.a * var2.w + var1.k * var2.r + var1.w * var2.S;
         float var11 = var1.b * var2.i + var1.G * var2.M + var1.y * var2.b + var1.r * var2.W;
         float var12 = var1.b * var2.z + var1.G * var2.a + var1.y * var2.G + var1.r * var2.U;
         float var13 = var1.b * var2.R + var1.G * var2.k + var1.y * var2.y + var1.r * var2.g;
         float var14 = var1.b * var2.s + var1.G * var2.w + var1.y * var2.r + var1.r * var2.S;
         float var15 = var1.W * var2.i + var1.U * var2.M + var1.g * var2.b + var1.S * var2.W;
         float var16 = var1.W * var2.z + var1.U * var2.a + var1.g * var2.G + var1.S * var2.U;
         float var17 = var1.W * var2.R + var1.U * var2.k + var1.g * var2.y + var1.S * var2.g;
         float var18 = var1.W * var2.s + var1.U * var2.w + var1.g * var2.r + var1.S * var2.S;
         this.i = var3;
         this.z = var4;
         this.R = var5;
         this.s = var6;
         this.M = var7;
         this.a = var8;
         this.k = var9;
         this.w = var10;
         this.b = var11;
         this.G = var12;
         this.y = var13;
         this.r = var14;
         this.W = var15;
         this.U = var16;
         this.g = var17;
         this.S = var18;
      }

   }

   public final void d(bd var1, bd var2) {
      if(this != var1 && this != var2) {
         this.i = var1.i * var2.i + var1.M * var2.z + var1.b * var2.R + var1.W * var2.s;
         this.z = var1.i * var2.M + var1.M * var2.a + var1.b * var2.k + var1.W * var2.w;
         this.R = var1.i * var2.b + var1.M * var2.G + var1.b * var2.y + var1.W * var2.r;
         this.s = var1.i * var2.W + var1.M * var2.U + var1.b * var2.g + var1.W * var2.S;
         this.M = var1.z * var2.i + var1.a * var2.z + var1.G * var2.R + var1.U * var2.s;
         this.a = var1.z * var2.M + var1.a * var2.a + var1.G * var2.k + var1.U * var2.w;
         this.k = var1.z * var2.b + var1.a * var2.G + var1.G * var2.y + var1.U * var2.r;
         this.w = var1.z * var2.W + var1.a * var2.U + var1.G * var2.g + var1.U * var2.S;
         this.b = var1.R * var2.i + var1.k * var2.z + var1.y * var2.R + var1.g * var2.s;
         this.G = var1.R * var2.M + var1.k * var2.a + var1.y * var2.k + var1.g * var2.w;
         this.y = var1.R * var2.b + var1.k * var2.G + var1.y * var2.y + var1.g * var2.r;
         this.r = var1.R * var2.W + var1.k * var2.U + var1.y * var2.g + var1.g * var2.S;
         this.W = var1.s * var2.i + var1.w * var2.z + var1.r * var2.R + var1.S * var2.s;
         this.U = var1.s * var2.M + var1.w * var2.a + var1.r * var2.k + var1.S * var2.w;
         this.g = var1.s * var2.b + var1.w * var2.G + var1.r * var2.y + var1.S * var2.r;
         this.S = var1.s * var2.W + var1.w * var2.U + var1.r * var2.g + var1.S * var2.S;
      } else {
         float var3 = var1.i * var2.i + var1.M * var2.z + var1.b * var2.R + var1.W * var2.s;
         float var4 = var1.i * var2.M + var1.M * var2.a + var1.b * var2.k + var1.W * var2.w;
         float var5 = var1.i * var2.b + var1.M * var2.G + var1.b * var2.y + var1.W * var2.r;
         float var6 = var1.i * var2.W + var1.M * var2.U + var1.b * var2.g + var1.W * var2.S;
         float var7 = var1.z * var2.i + var1.a * var2.z + var1.G * var2.R + var1.U * var2.s;
         float var8 = var1.z * var2.M + var1.a * var2.a + var1.G * var2.k + var1.U * var2.w;
         float var9 = var1.z * var2.b + var1.a * var2.G + var1.G * var2.y + var1.U * var2.r;
         float var10 = var1.z * var2.W + var1.a * var2.U + var1.G * var2.g + var1.U * var2.S;
         float var11 = var1.R * var2.i + var1.k * var2.z + var1.y * var2.R + var1.g * var2.s;
         float var12 = var1.R * var2.M + var1.k * var2.a + var1.y * var2.k + var1.g * var2.w;
         float var13 = var1.R * var2.b + var1.k * var2.G + var1.y * var2.y + var1.g * var2.r;
         float var14 = var1.R * var2.W + var1.k * var2.U + var1.y * var2.g + var1.g * var2.S;
         float var15 = var1.s * var2.i + var1.w * var2.z + var1.r * var2.R + var1.S * var2.s;
         float var16 = var1.s * var2.M + var1.w * var2.a + var1.r * var2.k + var1.S * var2.w;
         float var17 = var1.s * var2.b + var1.w * var2.G + var1.r * var2.y + var1.S * var2.r;
         float var18 = var1.s * var2.W + var1.w * var2.U + var1.r * var2.g + var1.S * var2.S;
         this.i = var3;
         this.z = var4;
         this.R = var5;
         this.s = var6;
         this.M = var7;
         this.a = var8;
         this.k = var9;
         this.w = var10;
         this.b = var11;
         this.G = var12;
         this.y = var13;
         this.r = var14;
         this.W = var15;
         this.U = var16;
         this.g = var17;
         this.S = var18;
      }

   }

   public final void O(bd var1, bd var2) {
      String[] var3 = ra.C();
      if(this != var1 && this != var2) {
         this.i = var1.i * var2.i + var1.z * var2.z + var1.R * var2.R + var1.s * var2.s;
         this.z = var1.i * var2.M + var1.z * var2.a + var1.R * var2.k + var1.s * var2.w;
         this.R = var1.i * var2.b + var1.z * var2.G + var1.R * var2.y + var1.s * var2.r;
         this.s = var1.i * var2.W + var1.z * var2.U + var1.R * var2.g + var1.s * var2.S;
         this.M = var1.M * var2.i + var1.a * var2.z + var1.k * var2.R + var1.w * var2.s;
         this.a = var1.M * var2.M + var1.a * var2.a + var1.k * var2.k + var1.w * var2.w;
         this.k = var1.M * var2.b + var1.a * var2.G + var1.k * var2.y + var1.w * var2.r;
         this.w = var1.M * var2.W + var1.a * var2.U + var1.k * var2.g + var1.w * var2.S;
         this.b = var1.b * var2.i + var1.G * var2.z + var1.y * var2.R + var1.r * var2.s;
         this.G = var1.b * var2.M + var1.G * var2.a + var1.y * var2.k + var1.r * var2.w;
         this.y = var1.b * var2.b + var1.G * var2.G + var1.y * var2.y + var1.r * var2.r;
         this.r = var1.b * var2.W + var1.G * var2.U + var1.y * var2.g + var1.r * var2.S;
         this.W = var1.W * var2.i + var1.U * var2.z + var1.g * var2.R + var1.S * var2.s;
         this.U = var1.W * var2.M + var1.U * var2.a + var1.g * var2.k + var1.S * var2.w;
         this.g = var1.W * var2.b + var1.U * var2.G + var1.g * var2.y + var1.S * var2.r;
         this.S = var1.W * var2.W + var1.U * var2.U + var1.g * var2.g + var1.S * var2.S;
         d.h(new d[2]);
      }

      float var4 = var1.i * var2.i + var1.z * var2.z + var1.R * var2.R + var1.s * var2.s;
      float var5 = var1.i * var2.M + var1.z * var2.a + var1.R * var2.k + var1.s * var2.w;
      float var6 = var1.i * var2.b + var1.z * var2.G + var1.R * var2.y + var1.s * var2.r;
      float var7 = var1.i * var2.W + var1.z * var2.U + var1.R * var2.g + var1.s * var2.S;
      float var8 = var1.M * var2.i + var1.a * var2.z + var1.k * var2.R + var1.w * var2.s;
      float var9 = var1.M * var2.M + var1.a * var2.a + var1.k * var2.k + var1.w * var2.w;
      float var10 = var1.M * var2.b + var1.a * var2.G + var1.k * var2.y + var1.w * var2.r;
      float var11 = var1.M * var2.W + var1.a * var2.U + var1.k * var2.g + var1.w * var2.S;
      float var12 = var1.b * var2.i + var1.G * var2.z + var1.y * var2.R + var1.r * var2.s;
      float var13 = var1.b * var2.M + var1.G * var2.a + var1.y * var2.k + var1.r * var2.w;
      float var14 = var1.b * var2.b + var1.G * var2.G + var1.y * var2.y + var1.r * var2.r;
      float var15 = var1.b * var2.W + var1.G * var2.U + var1.y * var2.g + var1.r * var2.S;
      float var16 = var1.W * var2.i + var1.U * var2.z + var1.g * var2.R + var1.S * var2.s;
      float var17 = var1.W * var2.M + var1.U * var2.a + var1.g * var2.k + var1.S * var2.w;
      float var18 = var1.W * var2.b + var1.U * var2.G + var1.g * var2.y + var1.S * var2.r;
      float var19 = var1.W * var2.W + var1.U * var2.U + var1.g * var2.g + var1.S * var2.S;
      this.i = var4;
      this.z = var5;
      this.R = var6;
      this.s = var7;
      this.M = var8;
      this.a = var9;
      this.k = var10;
      this.w = var11;
      this.b = var12;
      this.G = var13;
      this.y = var14;
      this.r = var15;
      this.W = var16;
      this.U = var17;
      this.g = var18;
      this.S = var19;
   }

   public final void M(bd var1, bd var2) {
      if(this != var1 && this != var2) {
         this.i = var1.i * var2.i + var1.M * var2.M + var1.b * var2.b + var1.W * var2.W;
         this.z = var1.i * var2.z + var1.M * var2.a + var1.b * var2.G + var1.W * var2.U;
         this.R = var1.i * var2.R + var1.M * var2.k + var1.b * var2.y + var1.W * var2.g;
         this.s = var1.i * var2.s + var1.M * var2.w + var1.b * var2.r + var1.W * var2.S;
         this.M = var1.z * var2.i + var1.a * var2.M + var1.G * var2.b + var1.U * var2.W;
         this.a = var1.z * var2.z + var1.a * var2.a + var1.G * var2.G + var1.U * var2.U;
         this.k = var1.z * var2.R + var1.a * var2.k + var1.G * var2.y + var1.U * var2.g;
         this.w = var1.z * var2.s + var1.a * var2.w + var1.G * var2.r + var1.U * var2.S;
         this.b = var1.R * var2.i + var1.k * var2.M + var1.y * var2.b + var1.g * var2.W;
         this.G = var1.R * var2.z + var1.k * var2.a + var1.y * var2.G + var1.g * var2.U;
         this.y = var1.R * var2.R + var1.k * var2.k + var1.y * var2.y + var1.g * var2.g;
         this.r = var1.R * var2.s + var1.k * var2.w + var1.y * var2.r + var1.g * var2.S;
         this.W = var1.s * var2.i + var1.w * var2.M + var1.r * var2.b + var1.S * var2.W;
         this.U = var1.s * var2.z + var1.w * var2.a + var1.r * var2.G + var1.S * var2.U;
         this.g = var1.s * var2.R + var1.w * var2.k + var1.r * var2.y + var1.S * var2.g;
         this.S = var1.s * var2.s + var1.w * var2.w + var1.r * var2.r + var1.S * var2.S;
      } else {
         float var3 = var1.i * var2.i + var1.M * var2.M + var1.b * var2.b + var1.W * var2.W;
         float var4 = var1.i * var2.z + var1.M * var2.a + var1.b * var2.G + var1.W * var2.U;
         float var5 = var1.i * var2.R + var1.M * var2.k + var1.b * var2.y + var1.W * var2.g;
         float var6 = var1.i * var2.s + var1.M * var2.w + var1.b * var2.r + var1.W * var2.S;
         float var7 = var1.z * var2.i + var1.a * var2.M + var1.G * var2.b + var1.U * var2.W;
         float var8 = var1.z * var2.z + var1.a * var2.a + var1.G * var2.G + var1.U * var2.U;
         float var9 = var1.z * var2.R + var1.a * var2.k + var1.G * var2.y + var1.U * var2.g;
         float var10 = var1.z * var2.s + var1.a * var2.w + var1.G * var2.r + var1.U * var2.S;
         float var11 = var1.R * var2.i + var1.k * var2.M + var1.y * var2.b + var1.g * var2.W;
         float var12 = var1.R * var2.z + var1.k * var2.a + var1.y * var2.G + var1.g * var2.U;
         float var13 = var1.R * var2.R + var1.k * var2.k + var1.y * var2.y + var1.g * var2.g;
         float var14 = var1.R * var2.s + var1.k * var2.w + var1.y * var2.r + var1.g * var2.S;
         float var15 = var1.s * var2.i + var1.w * var2.M + var1.r * var2.b + var1.S * var2.W;
         float var16 = var1.s * var2.z + var1.w * var2.a + var1.r * var2.G + var1.S * var2.U;
         float var17 = var1.s * var2.R + var1.w * var2.k + var1.r * var2.y + var1.S * var2.g;
         float var18 = var1.s * var2.s + var1.w * var2.w + var1.r * var2.r + var1.S * var2.S;
         this.i = var3;
         this.z = var4;
         this.R = var5;
         this.s = var6;
         this.M = var7;
         this.a = var8;
         this.k = var9;
         this.w = var10;
         this.b = var11;
         this.G = var12;
         this.y = var13;
         this.r = var14;
         this.W = var15;
         this.U = var16;
         this.g = var17;
         this.S = var18;
      }

   }

   public boolean q(bd var1) {
      return this.i == var1.i && this.z == var1.z && this.R == var1.R && this.s == var1.s && this.M == var1.M && this.a == var1.a && this.k == var1.k && this.w == var1.w && this.b == var1.b && this.G == var1.G && this.y == var1.y && this.r == var1.r && this.W == var1.W && this.U == var1.U && this.g == var1.g && this.S == var1.S;
   }

   public boolean equals(Object var1) {
      bd var2 = (bd)var1;
      return this.i == var2.i && this.z == var2.z && this.R == var2.R && this.s == var2.s && this.M == var2.M && this.a == var2.a && this.k == var2.k && this.w == var2.w && this.b == var2.b && this.G == var2.G && this.y == var2.y && this.r == var2.r && this.W == var2.W && this.U == var2.U && this.g == var2.g && this.S == var2.S;
   }

   public boolean w(bd var1, float var2) {
      boolean var3 = Math.abs(this.i - var1.i) <= var2;
      if(Math.abs(this.z - var1.z) > var2) {
         var3 = false;
      }

      if(Math.abs(this.R - var1.R) > var2) {
         var3 = false;
      }

      if(Math.abs(this.s - var1.s) > var2) {
         var3 = false;
      }

      if(Math.abs(this.M - var1.M) > var2) {
         var3 = false;
      }

      if(Math.abs(this.a - var1.a) > var2) {
         var3 = false;
      }

      if(Math.abs(this.k - var1.k) > var2) {
         var3 = false;
      }

      if(Math.abs(this.w - var1.w) > var2) {
         var3 = false;
      }

      if(Math.abs(this.b - var1.b) > var2) {
         var3 = false;
      }

      if(Math.abs(this.G - var1.G) > var2) {
         var3 = false;
      }

      if(Math.abs(this.y - var1.y) > var2) {
         var3 = false;
      }

      if(Math.abs(this.r - var1.r) > var2) {
         var3 = false;
      }

      if(Math.abs(this.W - var1.W) > var2) {
         var3 = false;
      }

      if(Math.abs(this.U - var1.U) > var2) {
         var3 = false;
      }

      if(Math.abs(this.g - var1.g) > var2) {
         var3 = false;
      }

      if(Math.abs(this.S - var1.S) > var2) {
         var3 = false;
      }

      return var3;
   }

   public int hashCode() {
      long var1 = 1L;
      var1 = op.F(var1, this.i);
      var1 = op.F(var1, this.z);
      var1 = op.F(var1, this.R);
      var1 = op.F(var1, this.s);
      var1 = op.F(var1, this.M);
      var1 = op.F(var1, this.a);
      var1 = op.F(var1, this.k);
      var1 = op.F(var1, this.w);
      var1 = op.F(var1, this.b);
      var1 = op.F(var1, this.G);
      var1 = op.F(var1, this.y);
      var1 = op.F(var1, this.r);
      var1 = op.F(var1, this.W);
      var1 = op.F(var1, this.U);
      var1 = op.F(var1, this.g);
      var1 = op.F(var1, this.S);
      return op.K(var1);
   }

   public final void V(ra var1, ra var2) {
      float var3 = this.i * var1.j + this.z * var1.v + this.R * var1.M + this.s * var1.U;
      float var4 = this.M * var1.j + this.a * var1.v + this.k * var1.M + this.w * var1.U;
      float var5 = this.b * var1.j + this.G * var1.v + this.y * var1.M + this.r * var1.U;
      var2.U = this.W * var1.j + this.U * var1.v + this.g * var1.M + this.S * var1.U;
      var2.j = var3;
      var2.v = var4;
      var2.M = var5;
   }

   public final void C(ra var1) {
      float var2 = this.i * var1.j + this.z * var1.v + this.R * var1.M + this.s * var1.U;
      float var3 = this.M * var1.j + this.a * var1.v + this.k * var1.M + this.w * var1.U;
      float var4 = this.b * var1.j + this.G * var1.v + this.y * var1.M + this.r * var1.U;
      var1.U = this.W * var1.j + this.U * var1.v + this.g * var1.M + this.S * var1.U;
      var1.j = var2;
      var1.v = var3;
      var1.M = var4;
   }

   public final void N(x5 var1, x5 var2) {
      float var3 = this.i * var1.q + this.z * var1.Q + this.R * var1.G + this.s;
      float var4 = this.M * var1.q + this.a * var1.Q + this.k * var1.G + this.w;
      var2.G = this.b * var1.q + this.G * var1.Q + this.y * var1.G + this.r;
      var2.q = var3;
      var2.Q = var4;
   }

   public final void B(x5 var1) {
      float var2 = this.i * var1.q + this.z * var1.Q + this.R * var1.G + this.s;
      float var3 = this.M * var1.q + this.a * var1.Q + this.k * var1.G + this.w;
      var1.G = this.b * var1.q + this.G * var1.Q + this.y * var1.G + this.r;
      var1.q = var2;
      var1.Q = var3;
   }

   public final void I(pv var1, pv var2) {
      float var3 = this.i * var1.q + this.z * var1.Q + this.R * var1.G;
      float var4 = this.M * var1.q + this.a * var1.Q + this.k * var1.G;
      var2.G = this.b * var1.q + this.G * var1.Q + this.y * var1.G;
      var2.q = var3;
      var2.Q = var4;
   }

   public final void l(pv var1) {
      float var2 = this.i * var1.q + this.z * var1.Q + this.R * var1.G;
      float var3 = this.M * var1.q + this.a * var1.Q + this.k * var1.G;
      var1.G = this.b * var1.q + this.G * var1.Q + this.y * var1.G;
      var1.q = var2;
      var1.Q = var3;
   }

   public final void Y(_w var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.U(var3, var2);
      this.i = (float)(var1.u * var3[0]);
      this.z = (float)(var1.n * var3[1]);
      this.R = (float)(var1.M * var3[2]);
      this.M = (float)(var1.p * var3[0]);
      this.a = (float)(var1.v * var3[1]);
      this.k = (float)(var1.P * var3[2]);
      this.b = (float)(var1.Z * var3[0]);
      this.G = (float)(var1.q * var3[1]);
      this.y = (float)(var1.l * var3[2]);
   }

   public final void Y(br var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.U(var3, var2);
      this.i = (float)((double)var1.y * var3[0]);
      this.z = (float)((double)var1.H * var3[1]);
      this.R = (float)((double)var1.q * var3[2]);
      this.M = (float)((double)var1.e * var3[0]);
      this.a = (float)((double)var1.Q * var3[1]);
      this.k = (float)((double)var1.D * var3[2]);
      this.b = (float)((double)var1.x * var3[0]);
      this.G = (float)((double)var1.m * var3[1]);
      this.y = (float)((double)var1.t * var3[2]);
   }

   public final void L(rk var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.U(var3, var2);
      this.i = (float)((double)(1.0F - 2.0F * var1.v * var1.v - 2.0F * var1.M * var1.M) * var3[0]);
      this.M = (float)((double)(2.0F * (var1.j * var1.v + var1.U * var1.M)) * var3[0]);
      this.b = (float)((double)(2.0F * (var1.j * var1.M - var1.U * var1.v)) * var3[0]);
      this.z = (float)((double)(2.0F * (var1.j * var1.v - var1.U * var1.M)) * var3[1]);
      this.a = (float)((double)(1.0F - 2.0F * var1.j * var1.j - 2.0F * var1.M * var1.M) * var3[1]);
      this.G = (float)((double)(2.0F * (var1.v * var1.M + var1.U * var1.j)) * var3[1]);
      this.R = (float)((double)(2.0F * (var1.j * var1.M + var1.U * var1.v)) * var3[2]);
      this.k = (float)((double)(2.0F * (var1.v * var1.M - var1.U * var1.j)) * var3[2]);
      this.y = (float)((double)(1.0F - 2.0F * var1.j * var1.j - 2.0F * var1.v * var1.v) * var3[2]);
   }

   public final void b(up var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.U(var3, var2);
      this.i = (float)((1.0D - 2.0D * var1.b * var1.b - 2.0D * var1.G * var1.G) * var3[0]);
      this.M = (float)(2.0D * (var1.M * var1.b + var1.d * var1.G) * var3[0]);
      this.b = (float)(2.0D * (var1.M * var1.G - var1.d * var1.b) * var3[0]);
      this.z = (float)(2.0D * (var1.M * var1.b - var1.d * var1.G) * var3[1]);
      this.a = (float)((1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.G * var1.G) * var3[1]);
      this.G = (float)(2.0D * (var1.b * var1.G + var1.d * var1.M) * var3[1]);
      this.R = (float)(2.0D * (var1.M * var1.G + var1.d * var1.b) * var3[2]);
      this.k = (float)(2.0D * (var1.b * var1.G - var1.d * var1.M) * var3[2]);
      this.y = (float)((1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.b * var1.b) * var3[2]);
   }

   public final void d(ok var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.U(var3, var2);
      double var4 = Math.sqrt((double)(var1.y * var1.y + var1.D * var1.D + var1.U * var1.U));
      if(var4 < 1.0E-8D) {
         this.i = 1.0F;
         this.z = 0.0F;
         this.R = 0.0F;
         this.M = 0.0F;
         this.a = 1.0F;
         this.k = 0.0F;
         this.b = 0.0F;
         this.G = 0.0F;
         this.y = 1.0F;
      } else {
         var4 = 1.0D / var4;
         double var6 = (double)var1.y * var4;
         double var8 = (double)var1.D * var4;
         double var10 = (double)var1.U * var4;
         double var12 = Math.sin((double)var1.k);
         double var14 = Math.cos((double)var1.k);
         double var16 = 1.0D - var14;
         double var18 = (double)(var1.y * var1.U);
         double var20 = (double)(var1.y * var1.D);
         double var22 = (double)(var1.D * var1.U);
         this.i = (float)((var16 * var6 * var6 + var14) * var3[0]);
         this.z = (float)((var16 * var20 - var12 * var10) * var3[1]);
         this.R = (float)((var16 * var18 + var12 * var8) * var3[2]);
         this.M = (float)((var16 * var20 + var12 * var10) * var3[0]);
         this.a = (float)((var16 * var8 * var8 + var14) * var3[1]);
         this.k = (float)((var16 * var22 - var12 * var6) * var3[2]);
         this.b = (float)((var16 * var18 - var12 * var8) * var3[0]);
         this.G = (float)((var16 * var22 + var12 * var6) * var3[1]);
         this.y = (float)((var16 * var10 * var10 + var14) * var3[2]);
      }

   }

   public final void x() {
      this.i = 0.0F;
      this.z = 0.0F;
      this.R = 0.0F;
      this.s = 0.0F;
      this.M = 0.0F;
      this.a = 0.0F;
      this.k = 0.0F;
      this.w = 0.0F;
      this.b = 0.0F;
      this.G = 0.0F;
      this.y = 0.0F;
      this.r = 0.0F;
      this.W = 0.0F;
      this.U = 0.0F;
      this.g = 0.0F;
      this.S = 0.0F;
   }

   public final void j() {
      this.i = -this.i;
      this.z = -this.z;
      this.R = -this.R;
      this.s = -this.s;
      this.M = -this.M;
      this.a = -this.a;
      this.k = -this.k;
      this.w = -this.w;
      this.b = -this.b;
      this.G = -this.G;
      this.y = -this.y;
      this.r = -this.r;
      this.W = -this.W;
      this.U = -this.U;
      this.g = -this.g;
      this.S = -this.S;
   }

   public final void m(bd var1) {
      this.i = -var1.i;
      this.z = -var1.z;
      this.R = -var1.R;
      this.s = -var1.s;
      this.M = -var1.M;
      this.a = -var1.a;
      this.k = -var1.k;
      this.w = -var1.w;
      this.b = -var1.b;
      this.G = -var1.G;
      this.y = -var1.y;
      this.r = -var1.r;
      this.W = -var1.W;
      this.U = -var1.U;
      this.g = -var1.g;
      this.S = -var1.S;
   }

   private final void U(double[] var1, double[] var2) {
      double[] var3 = new double[]{(double)this.i, (double)this.z, (double)this.R, (double)this.M, (double)this.a, (double)this.k, (double)this.b, (double)this.G, (double)this.y};
      _w.g(var3, var1, var2);
   }

   public Object clone() {
      bd var1 = null;
      var1 = (bd)super.clone();
      return var1;
   }

   public final float m() {
      return this.i;
   }

   public final void c(float var1) {
      this.i = var1;
   }

   public final float A() {
      return this.z;
   }

   public final void P(float var1) {
      this.z = var1;
   }

   public final float I() {
      return this.R;
   }

   public final void O(float var1) {
      this.R = var1;
   }

   public final float k() {
      return this.M;
   }

   public final void p(float var1) {
      this.M = var1;
   }

   public final float Y() {
      return this.a;
   }

   public final void Q(float var1) {
      this.a = var1;
   }

   public final float e() {
      return this.k;
   }

   public final void g(float var1) {
      this.k = var1;
   }

   public final float B() {
      return this.b;
   }

   public final void A(float var1) {
      this.b = var1;
   }

   public final float n() {
      return this.G;
   }

   public final void E(float var1) {
      this.G = var1;
   }

   public final float J() {
      return this.y;
   }

   public final void q(float var1) {
      this.y = var1;
   }

   public final float p() {
      return this.s;
   }

   public final void N(float var1) {
      this.s = var1;
   }

   public final float g() {
      return this.w;
   }

   public final void C(float var1) {
      this.w = var1;
   }

   public final float H() {
      return this.r;
   }

   public final void r(float var1) {
      this.r = var1;
   }

   public final float o() {
      return this.W;
   }

   public final void V(float var1) {
      this.W = var1;
   }

   public final float X() {
      return this.U;
   }

   public final void u(float var1) {
      this.U = var1;
   }

   public final float w() {
      return this.g;
   }

   public final void X(float var1) {
      this.g = var1;
   }

   public final float l() {
      return this.S;
   }

   public final void M(float var1) {
      this.S = var1;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
