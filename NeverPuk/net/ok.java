package net;

import java.io.Serializable;
import net._w;
import net.bd;
import net.br;
import net.mt;
import net.op;
import net.pv;
import net.ra;
import net.rk;
import net.up;
import net.we;

public class ok implements Serializable, Cloneable {
   static final long serialVersionUID = -163246355858070601L;
   public float y;
   public float D;
   public float U;
   public float k;
   static final double Q = 1.0E-6D;

   public ok(float var1, float var2, float var3, float var4) {
      this.y = var1;
      this.D = var2;
      this.U = var3;
      this.k = var4;
   }

   public ok(float[] var1) {
      this.y = var1[0];
      this.D = var1[1];
      this.U = var1[2];
      this.k = var1[3];
   }

   public ok(ok var1) {
      this.y = var1.y;
      this.D = var1.D;
      this.U = var1.U;
      this.k = var1.k;
   }

   public ok(mt var1) {
      this.y = (float)var1.b;
      this.D = (float)var1.C;
      this.U = (float)var1.L;
      this.k = (float)var1.m;
   }

   public ok(pv var1, float var2) {
      this.y = var1.q;
      this.D = var1.Q;
      this.U = var1.G;
      this.k = var2;
   }

   public ok() {
      this.y = 0.0F;
      this.D = 0.0F;
      this.U = 1.0F;
      this.k = 0.0F;
   }

   public final void S(float var1, float var2, float var3, float var4) {
      this.y = var1;
      this.D = var2;
      this.U = var3;
      this.k = var4;
   }

   public final void B(float[] var1) {
      this.y = var1[0];
      this.D = var1[1];
      this.U = var1[2];
      this.k = var1[3];
   }

   public final void s(ok var1) {
      this.y = var1.y;
      this.D = var1.D;
      this.U = var1.U;
      this.k = var1.k;
   }

   public final void t(mt var1) {
      this.y = (float)var1.b;
      this.D = (float)var1.C;
      this.U = (float)var1.L;
      this.k = (float)var1.m;
   }

   public final void b(pv var1, float var2) {
      this.y = var1.q;
      this.D = var1.Q;
      this.U = var1.G;
      this.k = var2;
   }

   public final void v(float[] var1) {
      var1[0] = this.y;
      var1[1] = this.D;
      var1[2] = this.U;
      var1[3] = this.k;
   }

   public final void x(rk var1) {
      double var2 = (double)(var1.j * var1.j + var1.v * var1.v + var1.M * var1.M);
      if(var2 > 1.0E-6D) {
         var2 = Math.sqrt(var2);
         double var4 = 1.0D / var2;
         this.y = (float)((double)var1.j * var4);
         this.D = (float)((double)var1.v * var4);
         this.U = (float)((double)var1.M * var4);
         this.k = (float)(2.0D * Math.atan2(var2, (double)var1.U));
      } else {
         this.y = 0.0F;
         this.D = 1.0F;
         this.U = 0.0F;
         this.k = 0.0F;
      }

   }

   public final void K(up var1) {
      double var2 = var1.M * var1.M + var1.b * var1.b + var1.G * var1.G;
      if(var2 > 1.0E-6D) {
         var2 = Math.sqrt(var2);
         double var4 = 1.0D / var2;
         this.y = (float)(var1.M * var4);
         this.D = (float)(var1.b * var4);
         this.U = (float)(var1.G * var4);
         this.k = (float)(2.0D * Math.atan2(var2, var1.d));
      } else {
         this.y = 0.0F;
         this.D = 1.0F;
         this.U = 0.0F;
         this.k = 0.0F;
      }

   }

   public final void b(bd var1) {
      br var3 = new br();
      ra.C();
      var1.V(var3);
      this.y = var3.m - var3.D;
      this.D = var3.q - var3.x;
      this.U = var3.e - var3.H;
      double var4 = (double)(this.y * this.y + this.D * this.D + this.U * this.U);
      if(var4 > 1.0E-6D) {
         var4 = Math.sqrt(var4);
         double var6 = 0.5D * var4;
         double var8 = 0.5D * ((double)(var3.y + var3.Q + var3.t) - 1.0D);
         this.k = (float)Math.atan2(var6, var8);
         double var10 = 1.0D / var4;
         this.y = (float)((double)this.y * var10);
         this.D = (float)((double)this.D * var10);
         this.U = (float)((double)this.U * var10);
      }

      this.y = 0.0F;
      this.D = 1.0F;
      this.U = 0.0F;
      this.k = 0.0F;
   }

   public final void S(we var1) {
      _w var3 = new _w();
      var1.d(var3);
      this.y = (float)(var3.q - var3.P);
      ra.C();
      this.D = (float)(var3.M - var3.Z);
      this.U = (float)(var3.p - var3.n);
      double var4 = (double)(this.y * this.y + this.D * this.D + this.U * this.U);
      if(var4 > 1.0E-6D) {
         var4 = Math.sqrt(var4);
         double var6 = 0.5D * var4;
         double var8 = 0.5D * (var3.u + var3.v + var3.l - 1.0D);
         this.k = (float)Math.atan2(var6, var8);
         double var10 = 1.0D / var4;
         this.y = (float)((double)this.y * var10);
         this.D = (float)((double)this.D * var10);
         this.U = (float)((double)this.U * var10);
      }

      this.y = 0.0F;
      this.D = 1.0F;
      this.U = 0.0F;
      this.k = 0.0F;
   }

   public final void P(br var1) {
      this.y = var1.m - var1.D;
      this.D = var1.q - var1.x;
      this.U = var1.e - var1.H;
      double var2 = (double)(this.y * this.y + this.D * this.D + this.U * this.U);
      if(var2 > 1.0E-6D) {
         var2 = Math.sqrt(var2);
         double var4 = 0.5D * var2;
         double var6 = 0.5D * ((double)(var1.y + var1.Q + var1.t) - 1.0D);
         this.k = (float)Math.atan2(var4, var6);
         double var8 = 1.0D / var2;
         this.y = (float)((double)this.y * var8);
         this.D = (float)((double)this.D * var8);
         this.U = (float)((double)this.U * var8);
      } else {
         this.y = 0.0F;
         this.D = 1.0F;
         this.U = 0.0F;
         this.k = 0.0F;
      }

   }

   public final void O(_w var1) {
      this.y = (float)(var1.q - var1.P);
      this.D = (float)(var1.M - var1.Z);
      this.U = (float)(var1.p - var1.n);
      double var2 = (double)(this.y * this.y + this.D * this.D + this.U * this.U);
      if(var2 > 1.0E-6D) {
         var2 = Math.sqrt(var2);
         double var4 = 0.5D * var2;
         double var6 = 0.5D * (var1.u + var1.v + var1.l - 1.0D);
         this.k = (float)Math.atan2(var4, var6);
         double var8 = 1.0D / var2;
         this.y = (float)((double)this.y * var8);
         this.D = (float)((double)this.D * var8);
         this.U = (float)((double)this.U * var8);
      } else {
         this.y = 0.0F;
         this.D = 1.0F;
         this.U = 0.0F;
         this.k = 0.0F;
      }

   }

   public String toString() {
      return "(" + this.y + ", " + this.D + ", " + this.U + ", " + this.k + ")";
   }

   public boolean d(ok var1) {
      return this.y == var1.y && this.D == var1.D && this.U == var1.U && this.k == var1.k;
   }

   public boolean equals(Object var1) {
      ok var2 = (ok)var1;
      return this.y == var2.y && this.D == var2.D && this.U == var2.U && this.k == var2.k;
   }

   public boolean p(ok var1, float var2) {
      float var3 = this.y - var1.y;
      if((var3 < 0.0F?-var3:var3) > var2) {
         return false;
      } else {
         var3 = this.D - var1.D;
         if((var3 < 0.0F?-var3:var3) > var2) {
            return false;
         } else {
            var3 = this.U - var1.U;
            if((var3 < 0.0F?-var3:var3) > var2) {
               return false;
            } else {
               var3 = this.k - var1.k;
               return (var3 < 0.0F?-var3:var3) <= var2;
            }
         }
      }
   }

   public int hashCode() {
      long var1 = 1L;
      var1 = op.F(var1, this.y);
      var1 = op.F(var1, this.D);
      var1 = op.F(var1, this.U);
      var1 = op.F(var1, this.k);
      return op.K(var1);
   }

   public Object clone() {
      return super.clone();
   }

   public final float K() {
      return this.k;
   }

   public final void d(float var1) {
      this.k = var1;
   }

   public final float t() {
      return this.y;
   }

   public final void R(float var1) {
      this.y = var1;
   }

   public final float u() {
      return this.D;
   }

   public final void u(float var1) {
      this.D = var1;
   }

   public final float n() {
      return this.U;
   }

   public final void Y(float var1) {
      this.U = var1;
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }
}
