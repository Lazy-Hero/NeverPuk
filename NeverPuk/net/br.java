package net;

import java.io.Serializable;
import net._w;
import net.bc;
import net.mt;
import net.ok;
import net.op;
import net.pv;
import net.ra;
import net.rk;
import net.up;
import net.x_;
import net.xn;

public class br implements Serializable, Cloneable {
   static final long serialVersionUID = 329697160112089834L;
   public float y;
   public float H;
   public float q;
   public float e;
   public float Q;
   public float D;
   public float x;
   public float m;
   public float t;
   private static final double V = 1.0E-8D;

   public br(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.y = var1;
      this.H = var2;
      this.q = var3;
      this.e = var4;
      this.Q = var5;
      this.D = var6;
      this.x = var7;
      this.m = var8;
      this.t = var9;
   }

   public br(float[] var1) {
      this.y = var1[0];
      this.H = var1[1];
      this.q = var1[2];
      this.e = var1[3];
      this.Q = var1[4];
      this.D = var1[5];
      this.x = var1[6];
      this.m = var1[7];
      this.t = var1[8];
   }

   public br(_w var1) {
      this.y = (float)var1.u;
      this.H = (float)var1.n;
      this.q = (float)var1.M;
      this.e = (float)var1.p;
      this.Q = (float)var1.v;
      this.D = (float)var1.P;
      this.x = (float)var1.Z;
      this.m = (float)var1.q;
      this.t = (float)var1.l;
   }

   public br(br var1) {
      this.y = var1.y;
      this.H = var1.H;
      this.q = var1.q;
      this.e = var1.e;
      this.Q = var1.Q;
      this.D = var1.D;
      this.x = var1.x;
      this.m = var1.m;
      this.t = var1.t;
   }

   public br() {
      this.y = 0.0F;
      this.H = 0.0F;
      this.q = 0.0F;
      this.e = 0.0F;
      this.Q = 0.0F;
      this.D = 0.0F;
      this.x = 0.0F;
      this.m = 0.0F;
      this.t = 0.0F;
   }

   public String toString() {
      return this.y + ", " + this.H + ", " + this.q + "\n" + this.e + ", " + this.Q + ", " + this.D + "\n" + this.x + ", " + this.m + ", " + this.t + "\n";
   }

   public final void K() {
      this.y = 1.0F;
      this.H = 0.0F;
      this.q = 0.0F;
      this.e = 0.0F;
      this.Q = 1.0F;
      this.D = 0.0F;
      this.x = 0.0F;
      this.m = 0.0F;
      this.t = 1.0F;
   }

   public final void x(float var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.k(var3, var2);
      this.y = (float)(var2[0] * (double)var1);
      this.H = (float)(var2[1] * (double)var1);
      this.q = (float)(var2[2] * (double)var1);
      this.e = (float)(var2[3] * (double)var1);
      this.Q = (float)(var2[4] * (double)var1);
      this.D = (float)(var2[5] * (double)var1);
      this.x = (float)(var2[6] * (double)var1);
      this.m = (float)(var2[7] * (double)var1);
      this.t = (float)(var2[8] * (double)var1);
   }

   public final void A(int var1, int var2, float var3) {
      switch(var1) {
      case 0:
         switch(var2) {
         case 0:
            this.y = var3;
            return;
         case 1:
            this.H = var3;
            return;
         case 2:
            this.q = var3;
            return;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3f0"));
         }
      case 1:
         switch(var2) {
         case 0:
            this.e = var3;
            return;
         case 1:
            this.Q = var3;
            return;
         case 2:
            this.D = var3;
            return;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3f0"));
         }
      case 2:
         switch(var2) {
         case 0:
            this.x = var3;
            return;
         case 1:
            this.m = var3;
            return;
         case 2:
            this.t = var3;
            return;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3f0"));
         }
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3f0"));
      }
   }

   public final void w(int var1, pv var2) {
      var2.q = this.y;
      var2.Q = this.H;
      var2.G = this.q;
   }

   public final void o(int var1, float[] var2) {
      var2[0] = this.y;
      var2[1] = this.H;
      var2[2] = this.q;
   }

   public final void n(int var1, pv var2) {
      var2.q = this.y;
      var2.Q = this.e;
      var2.G = this.x;
   }

   public final void q(int var1, float[] var2) {
      var2[0] = this.y;
      var2[1] = this.e;
      var2[2] = this.x;
   }

   public final float j(int var1, int var2) {
      switch(var1) {
      case 0:
         switch(var2) {
         case 0:
            return this.y;
         case 1:
            return this.H;
         case 2:
            return this.q;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3f5"));
         }
      case 1:
         switch(var2) {
         case 0:
            return this.e;
         case 1:
            return this.Q;
         case 2:
            return this.D;
         default:
            throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3f5"));
         }
      case 2:
         switch(var2) {
         case 0:
            return this.x;
         case 1:
            return this.m;
         case 2:
            return this.t;
         }
      }

      throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3f5"));
   }

   public final void k(int var1, float var2, float var3, float var4) {
      switch(var1) {
      case 0:
         this.y = var2;
         this.H = var3;
         this.q = var4;
         break;
      case 1:
         this.e = var2;
         this.Q = var3;
         this.D = var4;
         break;
      case 2:
         this.x = var2;
         this.m = var3;
         this.t = var4;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3f6"));
      }

   }

   public final void O(int var1, pv var2) {
      switch(var1) {
      case 0:
         this.y = var2.q;
         this.H = var2.Q;
         this.q = var2.G;
         break;
      case 1:
         this.e = var2.q;
         this.Q = var2.Q;
         this.D = var2.G;
         break;
      case 2:
         this.x = var2.q;
         this.m = var2.Q;
         this.t = var2.G;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3f6"));
      }

   }

   public final void W(int var1, float[] var2) {
      switch(var1) {
      case 0:
         this.y = var2[0];
         this.H = var2[1];
         this.q = var2[2];
         break;
      case 1:
         this.e = var2[0];
         this.Q = var2[1];
         this.D = var2[2];
         break;
      case 2:
         this.x = var2[0];
         this.m = var2[1];
         this.t = var2[2];
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3f6"));
      }

   }

   public final void t(int var1, float var2, float var3, float var4) {
      switch(var1) {
      case 0:
         this.y = var2;
         this.e = var3;
         this.x = var4;
         break;
      case 1:
         this.H = var2;
         this.Q = var3;
         this.m = var4;
         break;
      case 2:
         this.q = var2;
         this.D = var3;
         this.t = var4;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3f9"));
      }

   }

   public final void k(int var1, pv var2) {
      switch(var1) {
      case 0:
         this.y = var2.q;
         this.e = var2.Q;
         this.x = var2.G;
         break;
      case 1:
         this.H = var2.q;
         this.Q = var2.Q;
         this.m = var2.G;
         break;
      case 2:
         this.q = var2.q;
         this.D = var2.Q;
         this.t = var2.G;
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3f9"));
      }

   }

   public final void Q(int var1, float[] var2) {
      switch(var1) {
      case 0:
         this.y = var2[0];
         this.e = var2[1];
         this.x = var2[2];
         break;
      case 1:
         this.H = var2[0];
         this.Q = var2[1];
         this.m = var2[2];
         break;
      case 2:
         this.q = var2[0];
         this.D = var2[1];
         this.t = var2[2];
         break;
      default:
         throw new ArrayIndexOutOfBoundsException(bc.I("Matrix3f9"));
      }

   }

   public final float Q() {
      double[] var1 = new double[9];
      double[] var2 = new double[3];
      this.k(var2, var1);
      return (float)_w.I(var2);
   }

   public final void c(float var1) {
      this.y += var1;
      this.H += var1;
      this.q += var1;
      this.e += var1;
      this.Q += var1;
      this.D += var1;
      this.x += var1;
      this.m += var1;
      this.t += var1;
   }

   public final void g(float var1, br var2) {
      this.y = var2.y + var1;
      this.H = var2.H + var1;
      this.q = var2.q + var1;
      this.e = var2.e + var1;
      this.Q = var2.Q + var1;
      this.D = var2.D + var1;
      this.x = var2.x + var1;
      this.m = var2.m + var1;
      this.t = var2.t + var1;
   }

   public final void D(br var1, br var2) {
      this.y = var1.y + var2.y;
      this.H = var1.H + var2.H;
      this.q = var1.q + var2.q;
      this.e = var1.e + var2.e;
      this.Q = var1.Q + var2.Q;
      this.D = var1.D + var2.D;
      this.x = var1.x + var2.x;
      this.m = var1.m + var2.m;
      this.t = var1.t + var2.t;
   }

   public final void E(br var1) {
      this.y += var1.y;
      this.H += var1.H;
      this.q += var1.q;
      this.e += var1.e;
      this.Q += var1.Q;
      this.D += var1.D;
      this.x += var1.x;
      this.m += var1.m;
      this.t += var1.t;
   }

   public final void s(br var1, br var2) {
      this.y = var1.y - var2.y;
      this.H = var1.H - var2.H;
      this.q = var1.q - var2.q;
      this.e = var1.e - var2.e;
      this.Q = var1.Q - var2.Q;
      this.D = var1.D - var2.D;
      this.x = var1.x - var2.x;
      this.m = var1.m - var2.m;
      this.t = var1.t - var2.t;
   }

   public final void L(br var1) {
      this.y -= var1.y;
      this.H -= var1.H;
      this.q -= var1.q;
      this.e -= var1.e;
      this.Q -= var1.Q;
      this.D -= var1.D;
      this.x -= var1.x;
      this.m -= var1.m;
      this.t -= var1.t;
   }

   public final void H() {
      float var1 = this.e;
      this.e = this.H;
      this.H = var1;
      var1 = this.x;
      this.x = this.q;
      this.q = var1;
      var1 = this.m;
      this.m = this.D;
      this.D = var1;
   }

   public final void h(br var1) {
      if(this != var1) {
         this.y = var1.y;
         this.H = var1.e;
         this.q = var1.x;
         this.e = var1.H;
         this.Q = var1.Q;
         this.D = var1.m;
         this.x = var1.q;
         this.m = var1.D;
         this.t = var1.t;
      } else {
         this.H();
      }

   }

   public final void b(rk var1) {
      this.y = 1.0F - 2.0F * var1.v * var1.v - 2.0F * var1.M * var1.M;
      this.e = 2.0F * (var1.j * var1.v + var1.U * var1.M);
      this.x = 2.0F * (var1.j * var1.M - var1.U * var1.v);
      this.H = 2.0F * (var1.j * var1.v - var1.U * var1.M);
      this.Q = 1.0F - 2.0F * var1.j * var1.j - 2.0F * var1.M * var1.M;
      this.m = 2.0F * (var1.v * var1.M + var1.U * var1.j);
      this.q = 2.0F * (var1.j * var1.M + var1.U * var1.v);
      this.D = 2.0F * (var1.v * var1.M - var1.U * var1.j);
      this.t = 1.0F - 2.0F * var1.j * var1.j - 2.0F * var1.v * var1.v;
   }

   public final void T(ok var1) {
      float var2 = (float)Math.sqrt((double)(var1.y * var1.y + var1.D * var1.D + var1.U * var1.U));
      if((double)var2 < 1.0E-8D) {
         this.y = 1.0F;
         this.H = 0.0F;
         this.q = 0.0F;
         this.e = 0.0F;
         this.Q = 1.0F;
         this.D = 0.0F;
         this.x = 0.0F;
         this.m = 0.0F;
         this.t = 1.0F;
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
         this.y = var8 * var3 * var3 + var7;
         this.H = var8 * var10 - var6 * var5;
         this.q = var8 * var9 + var6 * var4;
         this.e = var8 * var10 + var6 * var5;
         this.Q = var8 * var4 * var4 + var7;
         this.D = var8 * var11 - var6 * var3;
         this.x = var8 * var9 - var6 * var4;
         this.m = var8 * var11 + var6 * var3;
         this.t = var8 * var5 * var5 + var7;
      }

   }

   public final void l(mt var1) {
      double var2 = Math.sqrt(var1.b * var1.b + var1.C * var1.C + var1.L * var1.L);
      if(var2 < 1.0E-8D) {
         this.y = 1.0F;
         this.H = 0.0F;
         this.q = 0.0F;
         this.e = 0.0F;
         this.Q = 1.0F;
         this.D = 0.0F;
         this.x = 0.0F;
         this.m = 0.0F;
         this.t = 1.0F;
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
         this.y = (float)(var14 * var4 * var4 + var12);
         this.H = (float)(var14 * var18 - var10 * var8);
         this.q = (float)(var14 * var16 + var10 * var6);
         this.e = (float)(var14 * var18 + var10 * var8);
         this.Q = (float)(var14 * var6 * var6 + var12);
         this.D = (float)(var14 * var20 - var10 * var4);
         this.x = (float)(var14 * var16 - var10 * var6);
         this.m = (float)(var14 * var20 + var10 * var4);
         this.t = (float)(var14 * var8 * var8 + var12);
      }

   }

   public final void a(up var1) {
      this.y = (float)(1.0D - 2.0D * var1.b * var1.b - 2.0D * var1.G * var1.G);
      this.e = (float)(2.0D * (var1.M * var1.b + var1.d * var1.G));
      this.x = (float)(2.0D * (var1.M * var1.G - var1.d * var1.b));
      this.H = (float)(2.0D * (var1.M * var1.b - var1.d * var1.G));
      this.Q = (float)(1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.G * var1.G);
      this.m = (float)(2.0D * (var1.b * var1.G + var1.d * var1.M));
      this.q = (float)(2.0D * (var1.M * var1.G + var1.d * var1.b));
      this.D = (float)(2.0D * (var1.b * var1.G - var1.d * var1.M));
      this.t = (float)(1.0D - 2.0D * var1.M * var1.M - 2.0D * var1.b * var1.b);
   }

   public final void w(float[] var1) {
      this.y = var1[0];
      this.H = var1[1];
      this.q = var1[2];
      this.e = var1[3];
      this.Q = var1[4];
      this.D = var1[5];
      this.x = var1[6];
      this.m = var1[7];
      this.t = var1[8];
   }

   public final void r(br var1) {
      this.y = var1.y;
      this.H = var1.H;
      this.q = var1.q;
      this.e = var1.e;
      this.Q = var1.Q;
      this.D = var1.D;
      this.x = var1.x;
      this.m = var1.m;
      this.t = var1.t;
   }

   public final void I(_w var1) {
      this.y = (float)var1.u;
      this.H = (float)var1.n;
      this.q = (float)var1.M;
      this.e = (float)var1.p;
      this.Q = (float)var1.v;
      this.D = (float)var1.P;
      this.x = (float)var1.Z;
      this.m = (float)var1.q;
      this.t = (float)var1.l;
   }

   public final void o(br var1) {
      this.q(var1);
   }

   public final void I() {
      this.q(this);
   }

   private final void q(br var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[9];
      int[] var4 = new int[3];
      var2[0] = (double)var1.y;
      var2[1] = (double)var1.H;
      var2[2] = (double)var1.q;
      var2[3] = (double)var1.e;
      var2[4] = (double)var1.Q;
      var2[5] = (double)var1.D;
      var2[6] = (double)var1.x;
      var2[7] = (double)var1.m;
      var2[8] = (double)var1.t;
      if(I(var2, var4)) {
         int var5 = 0;

         while(true) {
            var3[var5] = 0.0D;
            ++var5;
         }
      }

      throw new xn(bc.I("Matrix3f12"));
   }

   static boolean I(double[] param0, int[] param1) {
      // $FF: Couldn't be decompiled
   }

   static void T(double[] var0, int[] var1, double[] var2) {
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

   public final float Z() {
      float var1 = this.y * (this.Q * this.t - this.D * this.m) + this.H * (this.D * this.x - this.e * this.t) + this.q * (this.e * this.m - this.Q * this.x);
      return var1;
   }

   public final void i(float var1) {
      this.y = var1;
      this.H = 0.0F;
      this.q = 0.0F;
      this.e = 0.0F;
      this.Q = var1;
      this.D = 0.0F;
      this.x = 0.0F;
      this.m = 0.0F;
      this.t = var1;
   }

   public final void u(float var1) {
      float var2 = (float)Math.sin((double)var1);
      float var3 = (float)Math.cos((double)var1);
      this.y = 1.0F;
      this.H = 0.0F;
      this.q = 0.0F;
      this.e = 0.0F;
      this.Q = var3;
      this.D = -var2;
      this.x = 0.0F;
      this.m = var2;
      this.t = var3;
   }

   public final void Q(float var1) {
      float var2 = (float)Math.sin((double)var1);
      float var3 = (float)Math.cos((double)var1);
      this.y = var3;
      this.H = 0.0F;
      this.q = var2;
      this.e = 0.0F;
      this.Q = 1.0F;
      this.D = 0.0F;
      this.x = -var2;
      this.m = 0.0F;
      this.t = var3;
   }

   public final void T(float var1) {
      float var2 = (float)Math.sin((double)var1);
      float var3 = (float)Math.cos((double)var1);
      this.y = var3;
      this.H = -var2;
      this.q = 0.0F;
      this.e = var2;
      this.Q = var3;
      this.D = 0.0F;
      this.x = 0.0F;
      this.m = 0.0F;
      this.t = 1.0F;
   }

   public final void w(float var1) {
      this.y *= var1;
      this.H *= var1;
      this.q *= var1;
      this.e *= var1;
      this.Q *= var1;
      this.D *= var1;
      this.x *= var1;
      this.m *= var1;
      this.t *= var1;
   }

   public final void u(float var1, br var2) {
      this.y = var1 * var2.y;
      this.H = var1 * var2.H;
      this.q = var1 * var2.q;
      this.e = var1 * var2.e;
      this.Q = var1 * var2.Q;
      this.D = var1 * var2.D;
      this.x = var1 * var2.x;
      this.m = var1 * var2.m;
      this.t = var1 * var2.t;
   }

   public final void k(br var1) {
      float var2 = this.y * var1.y + this.H * var1.e + this.q * var1.x;
      float var3 = this.y * var1.H + this.H * var1.Q + this.q * var1.m;
      float var4 = this.y * var1.q + this.H * var1.D + this.q * var1.t;
      float var5 = this.e * var1.y + this.Q * var1.e + this.D * var1.x;
      float var6 = this.e * var1.H + this.Q * var1.Q + this.D * var1.m;
      float var7 = this.e * var1.q + this.Q * var1.D + this.D * var1.t;
      float var8 = this.x * var1.y + this.m * var1.e + this.t * var1.x;
      float var9 = this.x * var1.H + this.m * var1.Q + this.t * var1.m;
      float var10 = this.x * var1.q + this.m * var1.D + this.t * var1.t;
      this.y = var2;
      this.H = var3;
      this.q = var4;
      this.e = var5;
      this.Q = var6;
      this.D = var7;
      this.x = var8;
      this.m = var9;
      this.t = var10;
   }

   public final void a(br var1, br var2) {
      if(this != var1 && this != var2) {
         this.y = var1.y * var2.y + var1.H * var2.e + var1.q * var2.x;
         this.H = var1.y * var2.H + var1.H * var2.Q + var1.q * var2.m;
         this.q = var1.y * var2.q + var1.H * var2.D + var1.q * var2.t;
         this.e = var1.e * var2.y + var1.Q * var2.e + var1.D * var2.x;
         this.Q = var1.e * var2.H + var1.Q * var2.Q + var1.D * var2.m;
         this.D = var1.e * var2.q + var1.Q * var2.D + var1.D * var2.t;
         this.x = var1.x * var2.y + var1.m * var2.e + var1.t * var2.x;
         this.m = var1.x * var2.H + var1.m * var2.Q + var1.t * var2.m;
         this.t = var1.x * var2.q + var1.m * var2.D + var1.t * var2.t;
      } else {
         float var3 = var1.y * var2.y + var1.H * var2.e + var1.q * var2.x;
         float var4 = var1.y * var2.H + var1.H * var2.Q + var1.q * var2.m;
         float var5 = var1.y * var2.q + var1.H * var2.D + var1.q * var2.t;
         float var6 = var1.e * var2.y + var1.Q * var2.e + var1.D * var2.x;
         float var7 = var1.e * var2.H + var1.Q * var2.Q + var1.D * var2.m;
         float var8 = var1.e * var2.q + var1.Q * var2.D + var1.D * var2.t;
         float var9 = var1.x * var2.y + var1.m * var2.e + var1.t * var2.x;
         float var10 = var1.x * var2.H + var1.m * var2.Q + var1.t * var2.m;
         float var11 = var1.x * var2.q + var1.m * var2.D + var1.t * var2.t;
         this.y = var3;
         this.H = var4;
         this.q = var5;
         this.e = var6;
         this.Q = var7;
         this.D = var8;
         this.x = var9;
         this.m = var10;
         this.t = var11;
      }

   }

   public final void i(br var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      var2[0] = (double)(this.y * var1.y + this.H * var1.e + this.q * var1.x);
      var2[1] = (double)(this.y * var1.H + this.H * var1.Q + this.q * var1.m);
      var2[2] = (double)(this.y * var1.q + this.H * var1.D + this.q * var1.t);
      var2[3] = (double)(this.e * var1.y + this.Q * var1.e + this.D * var1.x);
      var2[4] = (double)(this.e * var1.H + this.Q * var1.Q + this.D * var1.m);
      var2[5] = (double)(this.e * var1.q + this.Q * var1.D + this.D * var1.t);
      var2[6] = (double)(this.x * var1.y + this.m * var1.e + this.t * var1.x);
      var2[7] = (double)(this.x * var1.H + this.m * var1.Q + this.t * var1.m);
      var2[8] = (double)(this.x * var1.q + this.m * var1.D + this.t * var1.t);
      _w.g(var2, var4, var3);
      this.y = (float)var3[0];
      this.H = (float)var3[1];
      this.q = (float)var3[2];
      this.e = (float)var3[3];
      this.Q = (float)var3[4];
      this.D = (float)var3[5];
      this.x = (float)var3[6];
      this.m = (float)var3[7];
      this.t = (float)var3[8];
   }

   public final void Q(br var1, br var2) {
      double[] var3 = new double[9];
      double[] var4 = new double[9];
      double[] var5 = new double[3];
      var3[0] = (double)(var1.y * var2.y + var1.H * var2.e + var1.q * var2.x);
      var3[1] = (double)(var1.y * var2.H + var1.H * var2.Q + var1.q * var2.m);
      var3[2] = (double)(var1.y * var2.q + var1.H * var2.D + var1.q * var2.t);
      var3[3] = (double)(var1.e * var2.y + var1.Q * var2.e + var1.D * var2.x);
      var3[4] = (double)(var1.e * var2.H + var1.Q * var2.Q + var1.D * var2.m);
      var3[5] = (double)(var1.e * var2.q + var1.Q * var2.D + var1.D * var2.t);
      var3[6] = (double)(var1.x * var2.y + var1.m * var2.e + var1.t * var2.x);
      var3[7] = (double)(var1.x * var2.H + var1.m * var2.Q + var1.t * var2.m);
      var3[8] = (double)(var1.x * var2.q + var1.m * var2.D + var1.t * var2.t);
      _w.g(var3, var5, var4);
      this.y = (float)var4[0];
      this.H = (float)var4[1];
      this.q = (float)var4[2];
      this.e = (float)var4[3];
      this.Q = (float)var4[4];
      this.D = (float)var4[5];
      this.x = (float)var4[6];
      this.m = (float)var4[7];
      this.t = (float)var4[8];
   }

   public final void H(br var1, br var2) {
      if(this != var1 && this != var2) {
         this.y = var1.y * var2.y + var1.e * var2.H + var1.x * var2.q;
         this.H = var1.y * var2.e + var1.e * var2.Q + var1.x * var2.D;
         this.q = var1.y * var2.x + var1.e * var2.m + var1.x * var2.t;
         this.e = var1.H * var2.y + var1.Q * var2.H + var1.m * var2.q;
         this.Q = var1.H * var2.e + var1.Q * var2.Q + var1.m * var2.D;
         this.D = var1.H * var2.x + var1.Q * var2.m + var1.m * var2.t;
         this.x = var1.q * var2.y + var1.D * var2.H + var1.t * var2.q;
         this.m = var1.q * var2.e + var1.D * var2.Q + var1.t * var2.D;
         this.t = var1.q * var2.x + var1.D * var2.m + var1.t * var2.t;
      } else {
         float var3 = var1.y * var2.y + var1.e * var2.H + var1.x * var2.q;
         float var4 = var1.y * var2.e + var1.e * var2.Q + var1.x * var2.D;
         float var5 = var1.y * var2.x + var1.e * var2.m + var1.x * var2.t;
         float var6 = var1.H * var2.y + var1.Q * var2.H + var1.m * var2.q;
         float var7 = var1.H * var2.e + var1.Q * var2.Q + var1.m * var2.D;
         float var8 = var1.H * var2.x + var1.Q * var2.m + var1.m * var2.t;
         float var9 = var1.q * var2.y + var1.D * var2.H + var1.t * var2.q;
         float var10 = var1.q * var2.e + var1.D * var2.Q + var1.t * var2.D;
         float var11 = var1.q * var2.x + var1.D * var2.m + var1.t * var2.t;
         this.y = var3;
         this.H = var4;
         this.q = var5;
         this.e = var6;
         this.Q = var7;
         this.D = var8;
         this.x = var9;
         this.m = var10;
         this.t = var11;
      }

   }

   public final void F(br var1, br var2) {
      String[] var3 = ra.C();
      if(this != var1 && this != var2) {
         this.y = var1.y * var2.y + var1.H * var2.H + var1.q * var2.q;
         this.H = var1.y * var2.e + var1.H * var2.Q + var1.q * var2.D;
         this.q = var1.y * var2.x + var1.H * var2.m + var1.q * var2.t;
         this.e = var1.e * var2.y + var1.Q * var2.H + var1.D * var2.q;
         this.Q = var1.e * var2.e + var1.Q * var2.Q + var1.D * var2.D;
         this.D = var1.e * var2.x + var1.Q * var2.m + var1.D * var2.t;
         this.x = var1.x * var2.y + var1.m * var2.H + var1.t * var2.q;
         this.m = var1.x * var2.e + var1.m * var2.Q + var1.t * var2.D;
         this.t = var1.x * var2.x + var1.m * var2.m + var1.t * var2.t;
      }

      float var4 = var1.y * var2.y + var1.H * var2.H + var1.q * var2.q;
      float var5 = var1.y * var2.e + var1.H * var2.Q + var1.q * var2.D;
      float var6 = var1.y * var2.x + var1.H * var2.m + var1.q * var2.t;
      float var7 = var1.e * var2.y + var1.Q * var2.H + var1.D * var2.q;
      float var8 = var1.e * var2.e + var1.Q * var2.Q + var1.D * var2.D;
      float var9 = var1.e * var2.x + var1.Q * var2.m + var1.D * var2.t;
      float var10 = var1.x * var2.y + var1.m * var2.H + var1.t * var2.q;
      float var11 = var1.x * var2.e + var1.m * var2.Q + var1.t * var2.D;
      float var12 = var1.x * var2.x + var1.m * var2.m + var1.t * var2.t;
      this.y = var4;
      this.H = var5;
      this.q = var6;
      this.e = var7;
      this.Q = var8;
      this.D = var9;
      this.x = var10;
      this.m = var11;
      this.t = var12;
   }

   public final void V(br var1, br var2) {
      if(this != var1 && this != var2) {
         this.y = var1.y * var2.y + var1.e * var2.e + var1.x * var2.x;
         this.H = var1.y * var2.H + var1.e * var2.Q + var1.x * var2.m;
         this.q = var1.y * var2.q + var1.e * var2.D + var1.x * var2.t;
         this.e = var1.H * var2.y + var1.Q * var2.e + var1.m * var2.x;
         this.Q = var1.H * var2.H + var1.Q * var2.Q + var1.m * var2.m;
         this.D = var1.H * var2.q + var1.Q * var2.D + var1.m * var2.t;
         this.x = var1.q * var2.y + var1.D * var2.e + var1.t * var2.x;
         this.m = var1.q * var2.H + var1.D * var2.Q + var1.t * var2.m;
         this.t = var1.q * var2.q + var1.D * var2.D + var1.t * var2.t;
      } else {
         float var3 = var1.y * var2.y + var1.e * var2.e + var1.x * var2.x;
         float var4 = var1.y * var2.H + var1.e * var2.Q + var1.x * var2.m;
         float var5 = var1.y * var2.q + var1.e * var2.D + var1.x * var2.t;
         float var6 = var1.H * var2.y + var1.Q * var2.e + var1.m * var2.x;
         float var7 = var1.H * var2.H + var1.Q * var2.Q + var1.m * var2.m;
         float var8 = var1.H * var2.q + var1.Q * var2.D + var1.m * var2.t;
         float var9 = var1.q * var2.y + var1.D * var2.e + var1.t * var2.x;
         float var10 = var1.q * var2.H + var1.D * var2.Q + var1.t * var2.m;
         float var11 = var1.q * var2.q + var1.D * var2.D + var1.t * var2.t;
         this.y = var3;
         this.H = var4;
         this.q = var5;
         this.e = var6;
         this.Q = var7;
         this.D = var8;
         this.x = var9;
         this.m = var10;
         this.t = var11;
      }

   }

   public final void X() {
      double[] var1 = new double[9];
      double[] var2 = new double[3];
      this.k(var2, var1);
      this.y = (float)var1[0];
      this.H = (float)var1[1];
      this.q = (float)var1[2];
      this.e = (float)var1[3];
      this.Q = (float)var1[4];
      this.D = (float)var1[5];
      this.x = (float)var1[6];
      this.m = (float)var1[7];
      this.t = (float)var1[8];
   }

   public final void V(br var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      var2[0] = (double)var1.y;
      var2[1] = (double)var1.H;
      var2[2] = (double)var1.q;
      var2[3] = (double)var1.e;
      var2[4] = (double)var1.Q;
      var2[5] = (double)var1.D;
      var2[6] = (double)var1.x;
      var2[7] = (double)var1.m;
      var2[8] = (double)var1.t;
      _w.g(var2, var4, var3);
      this.y = (float)var3[0];
      this.H = (float)var3[1];
      this.q = (float)var3[2];
      this.e = (float)var3[3];
      this.Q = (float)var3[4];
      this.D = (float)var3[5];
      this.x = (float)var3[6];
      this.m = (float)var3[7];
      this.t = (float)var3[8];
   }

   public final void O() {
      float var1 = 1.0F / (float)Math.sqrt((double)(this.y * this.y + this.e * this.e + this.x * this.x));
      this.y *= var1;
      this.e *= var1;
      this.x *= var1;
      var1 = 1.0F / (float)Math.sqrt((double)(this.H * this.H + this.Q * this.Q + this.m * this.m));
      this.H *= var1;
      this.Q *= var1;
      this.m *= var1;
      this.q = this.e * this.m - this.Q * this.x;
      this.D = this.H * this.x - this.y * this.m;
      this.t = this.y * this.Q - this.H * this.e;
   }

   public final void n(br var1) {
      float var2 = 1.0F / (float)Math.sqrt((double)(var1.y * var1.y + var1.e * var1.e + var1.x * var1.x));
      this.y = var1.y * var2;
      this.e = var1.e * var2;
      this.x = var1.x * var2;
      var2 = 1.0F / (float)Math.sqrt((double)(var1.H * var1.H + var1.Q * var1.Q + var1.m * var1.m));
      this.H = var1.H * var2;
      this.Q = var1.Q * var2;
      this.m = var1.m * var2;
      this.q = this.e * this.m - this.Q * this.x;
      this.D = this.H * this.x - this.y * this.m;
      this.t = this.y * this.Q - this.H * this.e;
   }

   public boolean w(br var1) {
      return this.y == var1.y && this.H == var1.H && this.q == var1.q && this.e == var1.e && this.Q == var1.Q && this.D == var1.D && this.x == var1.x && this.m == var1.m && this.t == var1.t;
   }

   public boolean equals(Object var1) {
      br var2 = (br)var1;
      return this.y == var2.y && this.H == var2.H && this.q == var2.q && this.e == var2.e && this.Q == var2.Q && this.D == var2.D && this.x == var2.x && this.m == var2.m && this.t == var2.t;
   }

   public boolean Q(br var1, float var2) {
      boolean var3 = Math.abs(this.y - var1.y) <= var2;
      if(Math.abs(this.H - var1.H) > var2) {
         var3 = false;
      }

      if(Math.abs(this.q - var1.q) > var2) {
         var3 = false;
      }

      if(Math.abs(this.e - var1.e) > var2) {
         var3 = false;
      }

      if(Math.abs(this.Q - var1.Q) > var2) {
         var3 = false;
      }

      if(Math.abs(this.D - var1.D) > var2) {
         var3 = false;
      }

      if(Math.abs(this.x - var1.x) > var2) {
         var3 = false;
      }

      if(Math.abs(this.m - var1.m) > var2) {
         var3 = false;
      }

      if(Math.abs(this.t - var1.t) > var2) {
         var3 = false;
      }

      return var3;
   }

   public int hashCode() {
      long var1 = 1L;
      var1 = op.F(var1, this.y);
      var1 = op.F(var1, this.H);
      var1 = op.F(var1, this.q);
      var1 = op.F(var1, this.e);
      var1 = op.F(var1, this.Q);
      var1 = op.F(var1, this.D);
      var1 = op.F(var1, this.x);
      var1 = op.F(var1, this.m);
      var1 = op.F(var1, this.t);
      return op.K(var1);
   }

   public final void e() {
      this.y = 0.0F;
      this.H = 0.0F;
      this.q = 0.0F;
      this.e = 0.0F;
      this.Q = 0.0F;
      this.D = 0.0F;
      this.x = 0.0F;
      this.m = 0.0F;
      this.t = 0.0F;
   }

   public final void L() {
      this.y = -this.y;
      this.H = -this.H;
      this.q = -this.q;
      this.e = -this.e;
      this.Q = -this.Q;
      this.D = -this.D;
      this.x = -this.x;
      this.m = -this.m;
      this.t = -this.t;
   }

   public final void c(br var1) {
      this.y = -var1.y;
      this.H = -var1.H;
      this.q = -var1.q;
      this.e = -var1.e;
      this.Q = -var1.Q;
      this.D = -var1.D;
      this.x = -var1.x;
      this.m = -var1.m;
      this.t = -var1.t;
   }

   public final void g(x_ var1) {
      float var2 = this.y * var1.q + this.H * var1.Q + this.q * var1.G;
      float var3 = this.e * var1.q + this.Q * var1.Q + this.D * var1.G;
      float var4 = this.x * var1.q + this.m * var1.Q + this.t * var1.G;
      var1.X(var2, var3, var4);
   }

   public final void f(x_ var1, x_ var2) {
      float var3 = this.y * var1.q + this.H * var1.Q + this.q * var1.G;
      float var4 = this.e * var1.q + this.Q * var1.Q + this.D * var1.G;
      var2.G = this.x * var1.q + this.m * var1.Q + this.t * var1.G;
      var2.q = var3;
      var2.Q = var4;
   }

   void k(double[] var1, double[] var2) {
      double[] var3 = new double[]{(double)this.y, (double)this.H, (double)this.q, (double)this.e, (double)this.Q, (double)this.D, (double)this.x, (double)this.m, (double)this.t};
      _w.g(var3, var1, var2);
   }

   public Object clone() {
      br var1 = null;
      var1 = (br)super.clone();
      return var1;
   }

   public final float u() {
      return this.y;
   }

   public final void j(float var1) {
      this.y = var1;
   }

   public final float k() {
      return this.H;
   }

   public final void q(float var1) {
      this.H = var1;
   }

   public final float E() {
      return this.q;
   }

   public final void B(float var1) {
      this.q = var1;
   }

   public final float J() {
      return this.e;
   }

   public final void U(float var1) {
      this.e = var1;
   }

   public final float i() {
      return this.Q;
   }

   public final void a(float var1) {
      this.Q = var1;
   }

   public final float I() {
      return this.D;
   }

   public final void G(float var1) {
      this.D = var1;
   }

   public final float d() {
      return this.x;
   }

   public final void t(float var1) {
      this.x = var1;
   }

   public final float O() {
      return this.m;
   }

   public final void g(float var1) {
      this.m = var1;
   }

   public final float M() {
      return this.t;
   }

   public final void e(float var1) {
      this.t = var1;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
