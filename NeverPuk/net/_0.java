package net;

import java.io.Serializable;
import net.i1;
import net.op;
import net.ra;

public abstract class _0 implements Serializable, Cloneable {
   static final long serialVersionUID = 9011180388985266884L;
   public float t;
   public float J;

   public _0(float var1, float var2) {
      this.t = var1;
      this.J = var2;
   }

   public _0(float[] var1) {
      this.t = var1[0];
      this.J = var1[1];
   }

   public _0(_0 var1) {
      this.t = var1.t;
      this.J = var1.J;
   }

   public _0(i1 var1) {
      this.t = (float)var1.c;
      this.J = (float)var1.f;
   }

   public _0() {
      this.t = 0.0F;
      this.J = 0.0F;
   }

   public final void l(float var1, float var2) {
      this.t = var1;
      this.J = var2;
   }

   public final void F(float[] var1) {
      this.t = var1[0];
      this.J = var1[1];
   }

   public final void s(_0 var1) {
      this.t = var1.t;
      this.J = var1.J;
   }

   public final void G(i1 var1) {
      this.t = (float)var1.c;
      this.J = (float)var1.f;
   }

   public final void N(float[] var1) {
      var1[0] = this.t;
      var1[1] = this.J;
   }

   public final void x(_0 var1, _0 var2) {
      this.t = var1.t + var2.t;
      this.J = var1.J + var2.J;
   }

   public final void Y(_0 var1) {
      this.t += var1.t;
      this.J += var1.J;
   }

   public final void m(_0 var1, _0 var2) {
      this.t = var1.t - var2.t;
      this.J = var1.J - var2.J;
   }

   public final void V(_0 var1) {
      this.t -= var1.t;
      this.J -= var1.J;
   }

   public final void n(_0 var1) {
      this.t = -var1.t;
      this.J = -var1.J;
   }

   public final void b() {
      this.t = -this.t;
      this.J = -this.J;
   }

   public final void z(float var1, _0 var2) {
      this.t = var1 * var2.t;
      this.J = var1 * var2.J;
   }

   public final void l(float var1) {
      this.t *= var1;
      this.J *= var1;
   }

   public final void Z(float var1, _0 var2, _0 var3) {
      this.t = var1 * var2.t + var3.t;
      this.J = var1 * var2.J + var3.J;
   }

   public final void e(float var1, _0 var2) {
      this.t = var1 * this.t + var2.t;
      this.J = var1 * this.J + var2.J;
   }

   public int hashCode() {
      long var1 = 1L;
      var1 = op.F(var1, this.t);
      var1 = op.F(var1, this.J);
      return op.K(var1);
   }

   public boolean d(_0 var1) {
      return this.t == var1.t && this.J == var1.J;
   }

   public boolean equals(Object var1) {
      _0 var2 = (_0)var1;
      return this.t == var2.t && this.J == var2.J;
   }

   public boolean S(_0 var1, float var2) {
      float var3 = this.t - var1.t;
      if(Float.isNaN(var3)) {
         return false;
      } else if((var3 < 0.0F?-var3:var3) > var2) {
         return false;
      } else {
         var3 = this.J - var1.J;
         return Float.isNaN(var3)?false:(var3 < 0.0F?-var3:var3) <= var2;
      }
   }

   public String toString() {
      return "(" + this.t + ", " + this.J + ")";
   }

   public final void t(float var1, float var2, _0 var3) {
      String[] var4 = ra.C();
      if(Float.compare(var3.t, var2) > 0) {
         this.t = var2;
      }

      if(var3.t < var1) {
         this.t = var1;
      }

      this.t = var3.t;
      if(Float.compare(var3.J, var2) > 0) {
         this.J = var2;
      }

      if(var3.J < var1) {
         this.J = var1;
      }

      this.J = var3.J;
   }

   public final void p(float var1, _0 var2) {
      if(var2.t < var1) {
         this.t = var1;
      } else {
         this.t = var2.t;
      }

      if(var2.J < var1) {
         this.J = var1;
      } else {
         this.J = var2.J;
      }

   }

   public final void x(float var1, _0 var2) {
      if(var2.t > var1) {
         this.t = var1;
      } else {
         this.t = var2.t;
      }

      if(var2.J > var1) {
         this.J = var1;
      } else {
         this.J = var2.J;
      }

   }

   public final void f(_0 var1) {
      this.t = Math.abs(var1.t);
      this.J = Math.abs(var1.J);
   }

   public final void k(float var1, float var2) {
      if(this.t > var2) {
         this.t = var2;
      } else if(this.t < var1) {
         this.t = var1;
      }

      if(this.J > var2) {
         this.J = var2;
      } else if(this.J < var1) {
         this.J = var1;
      }

   }

   public final void Z(float var1) {
      if(this.t < var1) {
         this.t = var1;
      }

      if(this.J < var1) {
         this.J = var1;
      }

   }

   public final void Q(float var1) {
      if(this.t > var1) {
         this.t = var1;
      }

      if(this.J > var1) {
         this.J = var1;
      }

   }

   public final void h() {
      this.t = Math.abs(this.t);
      this.J = Math.abs(this.J);
   }

   public final void t(_0 var1, _0 var2, float var3) {
      this.t = (1.0F - var3) * var1.t + var3 * var2.t;
      this.J = (1.0F - var3) * var1.J + var3 * var2.J;
   }

   public final void y(_0 var1, float var2) {
      this.t = (1.0F - var2) * this.t + var2 * var1.t;
      this.J = (1.0F - var2) * this.J + var2 * var1.J;
   }

   public Object clone() {
      return super.clone();
   }

   public final float l() {
      return this.t;
   }

   public final void f(float var1) {
      this.t = var1;
   }

   public final float M() {
      return this.J;
   }

   public final void w(float var1) {
      this.J = var1;
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }
}
