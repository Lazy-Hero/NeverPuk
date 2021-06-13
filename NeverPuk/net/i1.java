package net;

import java.io.Serializable;
import net._0;
import net.op;
import net.ra;

public abstract class i1 implements Serializable, Cloneable {
   static final long serialVersionUID = 6205762482756093838L;
   public double c;
   public double f;

   public i1(double var1, double var3) {
      this.c = var1;
      this.f = var3;
   }

   public i1(double[] var1) {
      this.c = var1[0];
      this.f = var1[1];
   }

   public i1(i1 var1) {
      this.c = var1.c;
      this.f = var1.f;
   }

   public i1(_0 var1) {
      this.c = (double)var1.t;
      this.f = (double)var1.J;
   }

   public i1() {
      this.c = 0.0D;
      this.f = 0.0D;
   }

   public final void x(double var1, double var3) {
      this.c = var1;
      this.f = var3;
   }

   public final void r(double[] var1) {
      this.c = var1[0];
      this.f = var1[1];
   }

   public final void f(i1 var1) {
      this.c = var1.c;
      this.f = var1.f;
   }

   public final void S(_0 var1) {
      this.c = (double)var1.t;
      this.f = (double)var1.J;
   }

   public final void f(double[] var1) {
      var1[0] = this.c;
      var1[1] = this.f;
   }

   public final void c(i1 var1, i1 var2) {
      this.c = var1.c + var2.c;
      this.f = var1.f + var2.f;
   }

   public final void A(i1 var1) {
      this.c += var1.c;
      this.f += var1.f;
   }

   public final void C(i1 var1, i1 var2) {
      this.c = var1.c - var2.c;
      this.f = var1.f - var2.f;
   }

   public final void y(i1 var1) {
      this.c -= var1.c;
      this.f -= var1.f;
   }

   public final void m(i1 var1) {
      this.c = -var1.c;
      this.f = -var1.f;
   }

   public final void M() {
      this.c = -this.c;
      this.f = -this.f;
   }

   public final void N(double var1, i1 var3) {
      this.c = var1 * var3.c;
      this.f = var1 * var3.f;
   }

   public final void n(double var1) {
      this.c *= var1;
      this.f *= var1;
   }

   public final void B(double var1, i1 var3, i1 var4) {
      this.c = var1 * var3.c + var4.c;
      this.f = var1 * var3.f + var4.f;
   }

   public final void Z(double var1, i1 var3) {
      this.c = var1 * this.c + var3.c;
      this.f = var1 * this.f + var3.f;
   }

   public int hashCode() {
      long var1 = 1L;
      var1 = op.l(var1, this.c);
      var1 = op.l(var1, this.f);
      return op.K(var1);
   }

   public boolean a(i1 var1) {
      return this.c == var1.c && this.f == var1.f;
   }

   public boolean equals(Object var1) {
      i1 var2 = (i1)var1;
      return this.c == var2.c && this.f == var2.f;
   }

   public boolean m(i1 var1, double var2) {
      double var4 = this.c - var1.c;
      if(Double.isNaN(var4)) {
         return false;
      } else if((var4 < 0.0D?-var4:var4) > var2) {
         return false;
      } else {
         var4 = this.f - var1.f;
         return Double.isNaN(var4)?false:(var4 < 0.0D?-var4:var4) <= var2;
      }
   }

   public String toString() {
      return "(" + this.c + ", " + this.f + ")";
   }

   public final void L(double var1, double var3, i1 var5) {
      String[] var6 = ra.C();
      if(Double.compare(var5.c, var3) > 0) {
         this.c = var3;
      }

      if(var5.c < var1) {
         this.c = var1;
      }

      this.c = var5.c;
      if(Double.compare(var5.f, var3) > 0) {
         this.f = var3;
      }

      if(var5.f < var1) {
         this.f = var1;
      }

      this.f = var5.f;
   }

   public final void R(double var1, i1 var3) {
      if(var3.c < var1) {
         this.c = var1;
      } else {
         this.c = var3.c;
      }

      if(var3.f < var1) {
         this.f = var1;
      } else {
         this.f = var3.f;
      }

   }

   public final void q(double var1, i1 var3) {
      if(var3.c > var1) {
         this.c = var1;
      } else {
         this.c = var3.c;
      }

      if(var3.f > var1) {
         this.f = var1;
      } else {
         this.f = var3.f;
      }

   }

   public final void n(i1 var1) {
      this.c = Math.abs(var1.c);
      this.f = Math.abs(var1.f);
   }

   public final void p(double var1, double var3) {
      if(this.c > var3) {
         this.c = var3;
      } else if(this.c < var1) {
         this.c = var1;
      }

      if(this.f > var3) {
         this.f = var3;
      } else if(this.f < var1) {
         this.f = var1;
      }

   }

   public final void I(double var1) {
      if(this.c < var1) {
         this.c = var1;
      }

      if(this.f < var1) {
         this.f = var1;
      }

   }

   public final void Q(double var1) {
      if(this.c > var1) {
         this.c = var1;
      }

      if(this.f > var1) {
         this.f = var1;
      }

   }

   public final void z() {
      this.c = Math.abs(this.c);
      this.f = Math.abs(this.f);
   }

   public final void I(i1 var1, i1 var2, double var3) {
      this.c = (1.0D - var3) * var1.c + var3 * var2.c;
      this.f = (1.0D - var3) * var1.f + var3 * var2.f;
   }

   public final void H(i1 var1, double var2) {
      this.c = (1.0D - var2) * this.c + var2 * var1.c;
      this.f = (1.0D - var2) * this.f + var2 * var1.f;
   }

   public Object clone() {
      return super.clone();
   }

   public final double V() {
      return this.c;
   }

   public final void F(double var1) {
      this.c = var1;
   }

   public final double Z() {
      return this.f;
   }

   public final void M(double var1) {
      this.f = var1;
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }
}
