package net;

import java.io.Serializable;
import net.op;
import net.ra;

public abstract class uo implements Serializable, Cloneable {
   static final long serialVersionUID = -4748953690425311052L;
   public double M;
   public double b;
   public double G;
   public double d;

   public uo(double var1, double var3, double var5, double var7) {
      this.M = var1;
      this.b = var3;
      this.G = var5;
      this.d = var7;
   }

   public uo(double[] var1) {
      this.M = var1[0];
      this.b = var1[1];
      this.G = var1[2];
      this.d = var1[3];
   }

   public uo(uo var1) {
      this.M = var1.M;
      this.b = var1.b;
      this.G = var1.G;
      this.d = var1.d;
   }

   public uo(ra var1) {
      this.M = (double)var1.j;
      this.b = (double)var1.v;
      this.G = (double)var1.M;
      this.d = (double)var1.U;
   }

   public uo() {
      this.M = 0.0D;
      this.b = 0.0D;
      this.G = 0.0D;
      this.d = 0.0D;
   }

   public final void p(double var1, double var3, double var5, double var7) {
      this.M = var1;
      this.b = var3;
      this.G = var5;
      this.d = var7;
   }

   public final void s(double[] var1) {
      this.M = var1[0];
      this.b = var1[1];
      this.G = var1[2];
      this.d = var1[3];
   }

   public final void K(uo var1) {
      this.M = var1.M;
      this.b = var1.b;
      this.G = var1.G;
      this.d = var1.d;
   }

   public final void g(ra var1) {
      this.M = (double)var1.j;
      this.b = (double)var1.v;
      this.G = (double)var1.M;
      this.d = (double)var1.U;
   }

   public final void z(double[] var1) {
      var1[0] = this.M;
      var1[1] = this.b;
      var1[2] = this.G;
      var1[3] = this.d;
   }

   public final void F(uo var1) {
      var1.M = this.M;
      var1.b = this.b;
      var1.G = this.G;
      var1.d = this.d;
   }

   public final void V(uo var1, uo var2) {
      this.M = var1.M + var2.M;
      this.b = var1.b + var2.b;
      this.G = var1.G + var2.G;
      this.d = var1.d + var2.d;
   }

   public final void q(uo var1) {
      this.M += var1.M;
      this.b += var1.b;
      this.G += var1.G;
      this.d += var1.d;
   }

   public final void U(uo var1, uo var2) {
      this.M = var1.M - var2.M;
      this.b = var1.b - var2.b;
      this.G = var1.G - var2.G;
      this.d = var1.d - var2.d;
   }

   public final void r(uo var1) {
      this.M -= var1.M;
      this.b -= var1.b;
      this.G -= var1.G;
      this.d -= var1.d;
   }

   public final void G(uo var1) {
      this.M = -var1.M;
      this.b = -var1.b;
      this.G = -var1.G;
      this.d = -var1.d;
   }

   public final void q() {
      this.M = -this.M;
      this.b = -this.b;
      this.G = -this.G;
      this.d = -this.d;
   }

   public final void I(double var1, uo var3) {
      this.M = var1 * var3.M;
      this.b = var1 * var3.b;
      this.G = var1 * var3.G;
      this.d = var1 * var3.d;
   }

   public final void E(double var1) {
      this.M *= var1;
      this.b *= var1;
      this.G *= var1;
      this.d *= var1;
   }

   public final void p(double var1, uo var3, uo var4) {
      this.M = var1 * var3.M + var4.M;
      this.b = var1 * var3.b + var4.b;
      this.G = var1 * var3.G + var4.G;
      this.d = var1 * var3.d + var4.d;
   }

   /** @deprecated */
   public final void h(float var1, uo var2) {
      this.P((double)var1, var2);
   }

   public final void P(double var1, uo var3) {
      this.M = var1 * this.M + var3.M;
      this.b = var1 * this.b + var3.b;
      this.G = var1 * this.G + var3.G;
      this.d = var1 * this.d + var3.d;
   }

   public String toString() {
      return "(" + this.M + ", " + this.b + ", " + this.G + ", " + this.d + ")";
   }

   public boolean t(uo var1) {
      return this.M == var1.M && this.b == var1.b && this.G == var1.G && this.d == var1.d;
   }

   public boolean equals(Object var1) {
      uo var2 = (uo)var1;
      return this.M == var2.M && this.b == var2.b && this.G == var2.G && this.d == var2.d;
   }

   public boolean E(uo var1, double var2) {
      double var4 = this.M - var1.M;
      if(Double.isNaN(var4)) {
         return false;
      } else if((var4 < 0.0D?-var4:var4) > var2) {
         return false;
      } else {
         var4 = this.b - var1.b;
         if(Double.isNaN(var4)) {
            return false;
         } else if((var4 < 0.0D?-var4:var4) > var2) {
            return false;
         } else {
            var4 = this.G - var1.G;
            if(Double.isNaN(var4)) {
               return false;
            } else if((var4 < 0.0D?-var4:var4) > var2) {
               return false;
            } else {
               var4 = this.d - var1.d;
               return Double.isNaN(var4)?false:(var4 < 0.0D?-var4:var4) <= var2;
            }
         }
      }
   }

   public int hashCode() {
      long var1 = 1L;
      var1 = op.l(var1, this.M);
      var1 = op.l(var1, this.b);
      var1 = op.l(var1, this.G);
      var1 = op.l(var1, this.d);
      return op.K(var1);
   }

   /** @deprecated */
   public final void I(float var1, float var2, uo var3) {
      this.O((double)var1, (double)var2, var3);
   }

   public final void O(double var1, double var3, uo var5) {
      String[] var6 = ra.C();
      if(Double.compare(var5.M, var3) > 0) {
         this.M = var3;
      }

      if(var5.M < var1) {
         this.M = var1;
      }

      this.M = var5.M;
      if(Double.compare(var5.b, var3) > 0) {
         this.b = var3;
      }

      if(var5.b < var1) {
         this.b = var1;
      }

      this.b = var5.b;
      if(Double.compare(var5.G, var3) > 0) {
         this.G = var3;
      }

      if(var5.G < var1) {
         this.G = var1;
      }

      this.G = var5.G;
      if(Double.compare(var5.d, var3) > 0) {
         this.d = var3;
      }

      if(var5.d < var1) {
         this.d = var1;
      }

      this.d = var5.d;
   }

   /** @deprecated */
   public final void k(float var1, uo var2) {
      this.n((double)var1, var2);
   }

   public final void n(double var1, uo var3) {
      if(var3.M < var1) {
         this.M = var1;
      } else {
         this.M = var3.M;
      }

      if(var3.b < var1) {
         this.b = var1;
      } else {
         this.b = var3.b;
      }

      if(var3.G < var1) {
         this.G = var1;
      } else {
         this.G = var3.G;
      }

      if(var3.d < var1) {
         this.d = var1;
      } else {
         this.d = var3.d;
      }

   }

   /** @deprecated */
   public final void i(float var1, uo var2) {
      this.y((double)var1, var2);
   }

   public final void y(double var1, uo var3) {
      if(var3.M > var1) {
         this.M = var1;
      } else {
         this.M = var3.M;
      }

      if(var3.b > var1) {
         this.b = var1;
      } else {
         this.b = var3.b;
      }

      if(var3.G > var1) {
         this.G = var1;
      } else {
         this.G = var3.G;
      }

      if(var3.d > var1) {
         this.d = var1;
      } else {
         this.d = var3.G;
      }

   }

   public final void o(uo var1) {
      this.M = Math.abs(var1.M);
      this.b = Math.abs(var1.b);
      this.G = Math.abs(var1.G);
      this.d = Math.abs(var1.d);
   }

   /** @deprecated */
   public final void q(float var1, float var2) {
      this.d((double)var1, (double)var2);
   }

   public final void d(double var1, double var3) {
      if(this.M > var3) {
         this.M = var3;
      } else if(this.M < var1) {
         this.M = var1;
      }

      if(this.b > var3) {
         this.b = var3;
      } else if(this.b < var1) {
         this.b = var1;
      }

      if(this.G > var3) {
         this.G = var3;
      } else if(this.G < var1) {
         this.G = var1;
      }

      if(this.d > var3) {
         this.d = var3;
      } else if(this.d < var1) {
         this.d = var1;
      }

   }

   /** @deprecated */
   public final void S(float var1) {
      this.P((double)var1);
   }

   public final void P(double var1) {
      if(this.M < var1) {
         this.M = var1;
      }

      if(this.b < var1) {
         this.b = var1;
      }

      if(this.G < var1) {
         this.G = var1;
      }

      if(this.d < var1) {
         this.d = var1;
      }

   }

   /** @deprecated */
   public final void F(float var1) {
      this.h((double)var1);
   }

   public final void h(double var1) {
      if(this.M > var1) {
         this.M = var1;
      }

      if(this.b > var1) {
         this.b = var1;
      }

      if(this.G > var1) {
         this.G = var1;
      }

      if(this.d > var1) {
         this.d = var1;
      }

   }

   public final void c() {
      this.M = Math.abs(this.M);
      this.b = Math.abs(this.b);
      this.G = Math.abs(this.G);
      this.d = Math.abs(this.d);
   }

   /** @deprecated */
   public void h(uo var1, uo var2, float var3) {
      this.N(var1, var2, (double)var3);
   }

   public void N(uo var1, uo var2, double var3) {
      this.M = (1.0D - var3) * var1.M + var3 * var2.M;
      this.b = (1.0D - var3) * var1.b + var3 * var2.b;
      this.G = (1.0D - var3) * var1.G + var3 * var2.G;
      this.d = (1.0D - var3) * var1.d + var3 * var2.d;
   }

   /** @deprecated */
   public void W(uo var1, float var2) {
      this.q(var1, (double)var2);
   }

   public void q(uo var1, double var2) {
      this.M = (1.0D - var2) * this.M + var2 * var1.M;
      this.b = (1.0D - var2) * this.b + var2 * var1.b;
      this.G = (1.0D - var2) * this.G + var2 * var1.G;
      this.d = (1.0D - var2) * this.d + var2 * var1.d;
   }

   public Object clone() {
      return super.clone();
   }

   public final double r() {
      return this.M;
   }

   public final void D(double var1) {
      this.M = var1;
   }

   public final double H() {
      return this.b;
   }

   public final void m(double var1) {
      this.b = var1;
   }

   public final double s() {
      return this.G;
   }

   public final void g(double var1) {
      this.G = var1;
   }

   public final double e() {
      return this.d;
   }

   public final void i(double var1) {
      this.d = var1;
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }
}
