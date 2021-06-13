package net;

import java.io.Serializable;
import net._w;
import net.bd;
import net.br;
import net.gp;
import net.ok;
import net.op;
import net.ra;
import net.rk;
import net.up;
import net.we;

public class mt implements Serializable, Cloneable {
   static final long serialVersionUID = 3644296204459140589L;
   public double b;
   public double C;
   public double L;
   public double m;
   static final double t = 1.0E-12D;

   public mt(double var1, double var3, double var5, double var7) {
      this.b = var1;
      this.C = var3;
      this.L = var5;
      this.m = var7;
   }

   public mt(double[] var1) {
      this.b = var1[0];
      this.C = var1[1];
      this.L = var1[2];
      this.m = var1[3];
   }

   public mt(mt var1) {
      this.b = var1.b;
      this.C = var1.C;
      this.L = var1.L;
      this.m = var1.m;
   }

   public mt(ok var1) {
      this.b = (double)var1.y;
      this.C = (double)var1.D;
      this.L = (double)var1.U;
      this.m = (double)var1.k;
   }

   public mt(gp var1, double var2) {
      this.b = var1.n;
      this.C = var1.Z;
      this.L = var1.B;
      this.m = var2;
   }

   public mt() {
      this.b = 0.0D;
      this.C = 0.0D;
      this.L = 1.0D;
      this.m = 0.0D;
   }

   public final void o(double var1, double var3, double var5, double var7) {
      this.b = var1;
      this.C = var3;
      this.L = var5;
      this.m = var7;
   }

   public final void c(double[] var1) {
      this.b = var1[0];
      this.C = var1[1];
      this.L = var1[2];
      this.m = var1[3];
   }

   public final void g(mt var1) {
      this.b = var1.b;
      this.C = var1.C;
      this.L = var1.L;
      this.m = var1.m;
   }

   public final void W(ok var1) {
      this.b = (double)var1.y;
      this.C = (double)var1.D;
      this.L = (double)var1.U;
      this.m = (double)var1.k;
   }

   public final void H(gp var1, double var2) {
      this.b = var1.n;
      this.C = var1.Z;
      this.L = var1.B;
      this.m = var2;
   }

   public final void H(double[] var1) {
      var1[0] = this.b;
      var1[1] = this.C;
      var1[2] = this.L;
      var1[3] = this.m;
   }

   public final void J(bd var1) {
      ra.C();
      _w var3 = new _w();
      var1.g(var3);
      this.b = (double)((float)(var3.q - var3.P));
      this.C = (double)((float)(var3.M - var3.Z));
      this.L = (double)((float)(var3.p - var3.n));
      double var4 = this.b * this.b + this.C * this.C + this.L * this.L;
      if(var4 > 1.0E-12D) {
         var4 = Math.sqrt(var4);
         double var6 = 0.5D * var4;
         double var8 = 0.5D * (var3.u + var3.v + var3.l - 1.0D);
         this.m = (double)((float)Math.atan2(var6, var8));
         double var10 = 1.0D / var4;
         this.b *= var10;
         this.C *= var10;
         this.L *= var10;
      }

      this.b = 0.0D;
      this.C = 1.0D;
      this.L = 0.0D;
      this.m = 0.0D;
   }

   public final void U(we var1) {
      _w var3 = new _w();
      var1.d(var3);
      this.b = (double)((float)(var3.q - var3.P));
      ra.C();
      this.C = (double)((float)(var3.M - var3.Z));
      this.L = (double)((float)(var3.p - var3.n));
      double var4 = this.b * this.b + this.C * this.C + this.L * this.L;
      if(var4 > 1.0E-12D) {
         var4 = Math.sqrt(var4);
         double var6 = 0.5D * var4;
         double var8 = 0.5D * (var3.u + var3.v + var3.l - 1.0D);
         this.m = (double)((float)Math.atan2(var6, var8));
         double var10 = 1.0D / var4;
         this.b *= var10;
         this.C *= var10;
         this.L *= var10;
      }

      this.b = 0.0D;
      this.C = 1.0D;
      this.L = 0.0D;
      this.m = 0.0D;
   }

   public final void R(br var1) {
      this.b = (double)(var1.m - var1.D);
      this.C = (double)(var1.q - var1.x);
      this.L = (double)(var1.e - var1.H);
      double var2 = this.b * this.b + this.C * this.C + this.L * this.L;
      if(var2 > 1.0E-12D) {
         var2 = Math.sqrt(var2);
         double var4 = 0.5D * var2;
         double var6 = 0.5D * ((double)(var1.y + var1.Q + var1.t) - 1.0D);
         this.m = (double)((float)Math.atan2(var4, var6));
         double var8 = 1.0D / var2;
         this.b *= var8;
         this.C *= var8;
         this.L *= var8;
      } else {
         this.b = 0.0D;
         this.C = 1.0D;
         this.L = 0.0D;
         this.m = 0.0D;
      }

   }

   public final void v(_w var1) {
      this.b = (double)((float)(var1.q - var1.P));
      this.C = (double)((float)(var1.M - var1.Z));
      this.L = (double)((float)(var1.p - var1.n));
      double var2 = this.b * this.b + this.C * this.C + this.L * this.L;
      if(var2 > 1.0E-12D) {
         var2 = Math.sqrt(var2);
         double var4 = 0.5D * var2;
         double var6 = 0.5D * (var1.u + var1.v + var1.l - 1.0D);
         this.m = (double)((float)Math.atan2(var4, var6));
         double var8 = 1.0D / var2;
         this.b *= var8;
         this.C *= var8;
         this.L *= var8;
      } else {
         this.b = 0.0D;
         this.C = 1.0D;
         this.L = 0.0D;
         this.m = 0.0D;
      }

   }

   public final void A(rk var1) {
      double var2 = (double)(var1.j * var1.j + var1.v * var1.v + var1.M * var1.M);
      if(var2 > 1.0E-12D) {
         var2 = Math.sqrt(var2);
         double var4 = 1.0D / var2;
         this.b = (double)var1.j * var4;
         this.C = (double)var1.v * var4;
         this.L = (double)var1.M * var4;
         this.m = 2.0D * Math.atan2(var2, (double)var1.U);
      } else {
         this.b = 0.0D;
         this.C = 1.0D;
         this.L = 0.0D;
         this.m = 0.0D;
      }

   }

   public final void Y(up var1) {
      double var2 = var1.M * var1.M + var1.b * var1.b + var1.G * var1.G;
      if(var2 > 1.0E-12D) {
         var2 = Math.sqrt(var2);
         double var4 = 1.0D / var2;
         this.b = var1.M * var4;
         this.C = var1.b * var4;
         this.L = var1.G * var4;
         this.m = 2.0D * Math.atan2(var2, var1.d);
      } else {
         this.b = 0.0D;
         this.C = 1.0D;
         this.L = 0.0D;
         this.m = 0.0D;
      }

   }

   public String toString() {
      return "(" + this.b + ", " + this.C + ", " + this.L + ", " + this.m + ")";
   }

   public boolean Z(mt var1) {
      return this.b == var1.b && this.C == var1.C && this.L == var1.L && this.m == var1.m;
   }

   public boolean equals(Object var1) {
      mt var2 = (mt)var1;
      return this.b == var2.b && this.C == var2.C && this.L == var2.L && this.m == var2.m;
   }

   public boolean A(mt var1, double var2) {
      double var4 = this.b - var1.b;
      if((var4 < 0.0D?-var4:var4) > var2) {
         return false;
      } else {
         var4 = this.C - var1.C;
         if((var4 < 0.0D?-var4:var4) > var2) {
            return false;
         } else {
            var4 = this.L - var1.L;
            if((var4 < 0.0D?-var4:var4) > var2) {
               return false;
            } else {
               var4 = this.m - var1.m;
               return (var4 < 0.0D?-var4:var4) <= var2;
            }
         }
      }
   }

   public int hashCode() {
      long var1 = 1L;
      var1 = op.l(var1, this.b);
      var1 = op.l(var1, this.C);
      var1 = op.l(var1, this.L);
      var1 = op.l(var1, this.m);
      return op.K(var1);
   }

   public Object clone() {
      return super.clone();
   }

   public final double L() {
      return this.m;
   }

   public final void A(double var1) {
      this.m = var1;
   }

   public double c() {
      return this.b;
   }

   public final void D(double var1) {
      this.b = var1;
   }

   public final double y() {
      return this.C;
   }

   public final void a(double var1) {
      this.C = var1;
   }

   public double s() {
      return this.L;
   }

   public final void P(double var1) {
      this.L = var1;
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }
}
