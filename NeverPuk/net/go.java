package net;

import java.io.Serializable;
import net.gl;
import net.op;
import net.ra;
import net.x_;

public abstract class go implements Serializable, Cloneable {
   static final long serialVersionUID = 5542096614926168415L;
   public double n;
   public double Z;
   public double B;

   public go(double var1, double var3, double var5) {
      this.n = var1;
      this.Z = var3;
      this.B = var5;
   }

   public go(double[] var1) {
      this.n = var1[0];
      this.Z = var1[1];
      this.B = var1[2];
   }

   public go(go var1) {
      this.n = var1.n;
      this.Z = var1.Z;
      this.B = var1.B;
   }

   public go(x_ var1) {
      this.n = (double)var1.q;
      this.Z = (double)var1.Q;
      this.B = (double)var1.G;
   }

   public go() {
      this.n = 0.0D;
      this.Z = 0.0D;
      this.B = 0.0D;
   }

   public final void w(double var1, double var3, double var5) {
      this.n = var1;
      this.Z = var3;
      this.B = var5;
   }

   public final void H(double[] var1) {
      this.n = var1[0];
      this.Z = var1[1];
      this.B = var1[2];
   }

   public final void t(go var1) {
      this.n = var1.n;
      this.Z = var1.Z;
      this.B = var1.B;
   }

   public final void H(x_ var1) {
      this.n = (double)var1.q;
      this.Z = (double)var1.Q;
      this.B = (double)var1.G;
   }

   public final void Z(double[] var1) {
      var1[0] = this.n;
      var1[1] = this.Z;
      var1[2] = this.B;
   }

   public final void i(go var1) {
      var1.n = this.n;
      var1.Z = this.Z;
      var1.B = this.B;
   }

   public final void u(go var1, go var2) {
      this.n = var1.n + var2.n;
      this.Z = var1.Z + var2.Z;
      this.B = var1.B + var2.B;
   }

   public final void C(go var1) {
      this.n += var1.n;
      this.Z += var1.Z;
      this.B += var1.B;
   }

   public final void n(go var1, go var2) {
      this.n = var1.n - var2.n;
      this.Z = var1.Z - var2.Z;
      this.B = var1.B - var2.B;
   }

   public final void I(go var1) {
      this.n -= var1.n;
      this.Z -= var1.Z;
      this.B -= var1.B;
   }

   public final void E(go var1) {
      this.n = -var1.n;
      this.Z = -var1.Z;
      this.B = -var1.B;
   }

   public final void B() {
      this.n = -this.n;
      this.Z = -this.Z;
      this.B = -this.B;
   }

   public final void M(double var1, go var3) {
      this.n = var1 * var3.n;
      this.Z = var1 * var3.Z;
      this.B = var1 * var3.B;
   }

   public final void w(double var1) {
      this.n *= var1;
      this.Z *= var1;
      this.B *= var1;
   }

   public final void Y(double var1, go var3, go var4) {
      this.n = var1 * var3.n + var4.n;
      this.Z = var1 * var3.Z + var4.Z;
      this.B = var1 * var3.B + var4.B;
   }

   /** @deprecated */
   public final void A(double var1, x_ var3) {
      this.b(var1, new gl(var3));
   }

   public final void b(double var1, go var3) {
      this.n = var1 * this.n + var3.n;
      this.Z = var1 * this.Z + var3.Z;
      this.B = var1 * this.B + var3.B;
   }

   public String toString() {
      return "(" + this.n + ", " + this.Z + ", " + this.B + ")";
   }

   public int hashCode() {
      long var1 = 1L;
      var1 = op.l(var1, this.n);
      var1 = op.l(var1, this.Z);
      var1 = op.l(var1, this.B);
      return op.K(var1);
   }

   public boolean K(go var1) {
      return this.n == var1.n && this.Z == var1.Z && this.B == var1.B;
   }

   public boolean equals(Object var1) {
      go var2 = (go)var1;
      return this.n == var2.n && this.Z == var2.Z && this.B == var2.B;
   }

   public boolean z(go var1, double var2) {
      double var4 = this.n - var1.n;
      if(Double.isNaN(var4)) {
         return false;
      } else if((var4 < 0.0D?-var4:var4) > var2) {
         return false;
      } else {
         var4 = this.Z - var1.Z;
         if(Double.isNaN(var4)) {
            return false;
         } else if((var4 < 0.0D?-var4:var4) > var2) {
            return false;
         } else {
            var4 = this.B - var1.B;
            return Double.isNaN(var4)?false:(var4 < 0.0D?-var4:var4) <= var2;
         }
      }
   }

   /** @deprecated */
   public final void I(float var1, float var2, go var3) {
      this.Q((double)var1, (double)var2, var3);
   }

   public final void Q(double var1, double var3, go var5) {
      String[] var6 = ra.C();
      if(Double.compare(var5.n, var3) > 0) {
         this.n = var3;
      }

      if(var5.n < var1) {
         this.n = var1;
      }

      this.n = var5.n;
      if(Double.compare(var5.Z, var3) > 0) {
         this.Z = var3;
      }

      if(var5.Z < var1) {
         this.Z = var1;
      }

      this.Z = var5.Z;
      if(Double.compare(var5.B, var3) > 0) {
         this.B = var3;
      }

      if(var5.B < var1) {
         this.B = var1;
      }

      this.B = var5.B;
   }

   /** @deprecated */
   public final void a(float var1, go var2) {
      this.X((double)var1, var2);
   }

   public final void X(double var1, go var3) {
      if(var3.n < var1) {
         this.n = var1;
      } else {
         this.n = var3.n;
      }

      if(var3.Z < var1) {
         this.Z = var1;
      } else {
         this.Z = var3.Z;
      }

      if(var3.B < var1) {
         this.B = var1;
      } else {
         this.B = var3.B;
      }

   }

   /** @deprecated */
   public final void c(float var1, go var2) {
      this.G((double)var1, var2);
   }

   public final void G(double var1, go var3) {
      if(var3.n > var1) {
         this.n = var1;
      } else {
         this.n = var3.n;
      }

      if(var3.Z > var1) {
         this.Z = var1;
      } else {
         this.Z = var3.Z;
      }

      if(var3.B > var1) {
         this.B = var1;
      } else {
         this.B = var3.B;
      }

   }

   public final void s(go var1) {
      this.n = Math.abs(var1.n);
      this.Z = Math.abs(var1.Z);
      this.B = Math.abs(var1.B);
   }

   /** @deprecated */
   public final void e(float var1, float var2) {
      this.X((double)var1, (double)var2);
   }

   public final void X(double var1, double var3) {
      if(this.n > var3) {
         this.n = var3;
      } else if(this.n < var1) {
         this.n = var1;
      }

      if(this.Z > var3) {
         this.Z = var3;
      } else if(this.Z < var1) {
         this.Z = var1;
      }

      if(this.B > var3) {
         this.B = var3;
      } else if(this.B < var1) {
         this.B = var1;
      }

   }

   /** @deprecated */
   public final void N(float var1) {
      this.h((double)var1);
   }

   public final void h(double var1) {
      if(this.n < var1) {
         this.n = var1;
      }

      if(this.Z < var1) {
         this.Z = var1;
      }

      if(this.B < var1) {
         this.B = var1;
      }

   }

   /** @deprecated */
   public final void T(float var1) {
      this.Q((double)var1);
   }

   public final void Q(double var1) {
      if(this.n > var1) {
         this.n = var1;
      }

      if(this.Z > var1) {
         this.Z = var1;
      }

      if(this.B > var1) {
         this.B = var1;
      }

   }

   public final void q() {
      this.n = Math.abs(this.n);
      this.Z = Math.abs(this.Z);
      this.B = Math.abs(this.B);
   }

   /** @deprecated */
   public final void v(go var1, go var2, float var3) {
      this.o(var1, var2, (double)var3);
   }

   public final void o(go var1, go var2, double var3) {
      this.n = (1.0D - var3) * var1.n + var3 * var2.n;
      this.Z = (1.0D - var3) * var1.Z + var3 * var2.Z;
      this.B = (1.0D - var3) * var1.B + var3 * var2.B;
   }

   /** @deprecated */
   public final void N(go var1, float var2) {
      this.z(var1, (double)var2);
   }

   public final void z(go var1, double var2) {
      this.n = (1.0D - var2) * this.n + var2 * var1.n;
      this.Z = (1.0D - var2) * this.Z + var2 * var1.Z;
      this.B = (1.0D - var2) * this.B + var2 * var1.B;
   }

   public Object clone() {
      return super.clone();
   }

   public final double W() {
      return this.n;
   }

   public final void G(double var1) {
      this.n = var1;
   }

   public final double I() {
      return this.Z;
   }

   public final void Y(double var1) {
      this.Z = var1;
   }

   public final double U() {
      return this.B;
   }

   public final void d(double var1) {
      this.B = var1;
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }
}
