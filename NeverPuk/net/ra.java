package net;

import java.io.Serializable;
import net.op;
import net.uo;

public abstract class ra implements Serializable, Cloneable {
   static final long serialVersionUID = 7068460319248845763L;
   public float j;
   public float v;
   public float M;
   public float U;
   private static String[] n;

   public ra(float var1, float var2, float var3, float var4) {
      this.j = var1;
      this.v = var2;
      this.M = var3;
      this.U = var4;
   }

   public ra(float[] var1) {
      this.j = var1[0];
      this.v = var1[1];
      this.M = var1[2];
      this.U = var1[3];
   }

   public ra(ra var1) {
      this.j = var1.j;
      this.v = var1.v;
      this.M = var1.M;
      this.U = var1.U;
   }

   public ra(uo var1) {
      this.j = (float)var1.M;
      this.v = (float)var1.b;
      this.M = (float)var1.G;
      this.U = (float)var1.d;
   }

   public ra() {
      this.j = 0.0F;
      this.v = 0.0F;
      this.M = 0.0F;
      this.U = 0.0F;
   }

   public final void v(float var1, float var2, float var3, float var4) {
      this.j = var1;
      this.v = var2;
      this.M = var3;
      this.U = var4;
   }

   public final void X(float[] var1) {
      this.j = var1[0];
      this.v = var1[1];
      this.M = var1[2];
      this.U = var1[3];
   }

   public final void r(ra var1) {
      this.j = var1.j;
      this.v = var1.v;
      this.M = var1.M;
      this.U = var1.U;
   }

   public final void z(uo var1) {
      this.j = (float)var1.M;
      this.v = (float)var1.b;
      this.M = (float)var1.G;
      this.U = (float)var1.d;
   }

   public final void a(float[] var1) {
      var1[0] = this.j;
      var1[1] = this.v;
      var1[2] = this.M;
      var1[3] = this.U;
   }

   public final void s(ra var1) {
      var1.j = this.j;
      var1.v = this.v;
      var1.M = this.M;
      var1.U = this.U;
   }

   public final void C(ra var1, ra var2) {
      this.j = var1.j + var2.j;
      this.v = var1.v + var2.v;
      this.M = var1.M + var2.M;
      this.U = var1.U + var2.U;
   }

   public final void T(ra var1) {
      this.j += var1.j;
      this.v += var1.v;
      this.M += var1.M;
      this.U += var1.U;
   }

   public final void E(ra var1, ra var2) {
      this.j = var1.j - var2.j;
      this.v = var1.v - var2.v;
      this.M = var1.M - var2.M;
      this.U = var1.U - var2.U;
   }

   public final void J(ra var1) {
      this.j -= var1.j;
      this.v -= var1.v;
      this.M -= var1.M;
      this.U -= var1.U;
   }

   public final void Q(ra var1) {
      this.j = -var1.j;
      this.v = -var1.v;
      this.M = -var1.M;
      this.U = -var1.U;
   }

   public final void F() {
      this.j = -this.j;
      this.v = -this.v;
      this.M = -this.M;
      this.U = -this.U;
   }

   public final void O(float var1, ra var2) {
      this.j = var1 * var2.j;
      this.v = var1 * var2.v;
      this.M = var1 * var2.M;
      this.U = var1 * var2.U;
   }

   public final void z(float var1) {
      this.j *= var1;
      this.v *= var1;
      this.M *= var1;
      this.U *= var1;
   }

   public final void b(float var1, ra var2, ra var3) {
      this.j = var1 * var2.j + var3.j;
      this.v = var1 * var2.v + var3.v;
      this.M = var1 * var2.M + var3.M;
      this.U = var1 * var2.U + var3.U;
   }

   public final void i(float var1, ra var2) {
      this.j = var1 * this.j + var2.j;
      this.v = var1 * this.v + var2.v;
      this.M = var1 * this.M + var2.M;
      this.U = var1 * this.U + var2.U;
   }

   public String toString() {
      return "(" + this.j + ", " + this.v + ", " + this.M + ", " + this.U + ")";
   }

   public boolean d(ra var1) {
      return this.j == var1.j && this.v == var1.v && this.M == var1.M && this.U == var1.U;
   }

   public boolean equals(Object var1) {
      ra var2 = (ra)var1;
      return this.j == var2.j && this.v == var2.v && this.M == var2.M && this.U == var2.U;
   }

   public boolean p(ra var1, float var2) {
      float var3 = this.j - var1.j;
      if(Float.isNaN(var3)) {
         return false;
      } else if((var3 < 0.0F?-var3:var3) > var2) {
         return false;
      } else {
         var3 = this.v - var1.v;
         if(Float.isNaN(var3)) {
            return false;
         } else if((var3 < 0.0F?-var3:var3) > var2) {
            return false;
         } else {
            var3 = this.M - var1.M;
            if(Float.isNaN(var3)) {
               return false;
            } else if((var3 < 0.0F?-var3:var3) > var2) {
               return false;
            } else {
               var3 = this.U - var1.U;
               return Float.isNaN(var3)?false:(var3 < 0.0F?-var3:var3) <= var2;
            }
         }
      }
   }

   public int hashCode() {
      long var1 = 1L;
      var1 = op.F(var1, this.j);
      var1 = op.F(var1, this.v);
      var1 = op.F(var1, this.M);
      var1 = op.F(var1, this.U);
      return op.K(var1);
   }

   public final void J(float var1, float var2, ra var3) {
      String[] var4 = C();
      if(Float.compare(var3.j, var2) > 0) {
         this.j = var2;
      }

      if(var3.j < var1) {
         this.j = var1;
      }

      this.j = var3.j;
      if(Float.compare(var3.v, var2) > 0) {
         this.v = var2;
      }

      if(var3.v < var1) {
         this.v = var1;
      }

      this.v = var3.v;
      if(Float.compare(var3.M, var2) > 0) {
         this.M = var2;
      }

      if(var3.M < var1) {
         this.M = var1;
      }

      this.M = var3.M;
      if(Float.compare(var3.U, var2) > 0) {
         this.U = var2;
      }

      if(var3.U < var1) {
         this.U = var1;
      }

      this.U = var3.U;
   }

   public final void b(float var1, ra var2) {
      if(var2.j < var1) {
         this.j = var1;
      } else {
         this.j = var2.j;
      }

      if(var2.v < var1) {
         this.v = var1;
      } else {
         this.v = var2.v;
      }

      if(var2.M < var1) {
         this.M = var1;
      } else {
         this.M = var2.M;
      }

      if(var2.U < var1) {
         this.U = var1;
      } else {
         this.U = var2.U;
      }

   }

   public final void y(float var1, ra var2) {
      if(var2.j > var1) {
         this.j = var1;
      } else {
         this.j = var2.j;
      }

      if(var2.v > var1) {
         this.v = var1;
      } else {
         this.v = var2.v;
      }

      if(var2.M > var1) {
         this.M = var1;
      } else {
         this.M = var2.M;
      }

      if(var2.U > var1) {
         this.U = var1;
      } else {
         this.U = var2.M;
      }

   }

   public final void W(ra var1) {
      this.j = Math.abs(var1.j);
      this.v = Math.abs(var1.v);
      this.M = Math.abs(var1.M);
      this.U = Math.abs(var1.U);
   }

   public final void G(float var1, float var2) {
      if(this.j > var2) {
         this.j = var2;
      } else if(this.j < var1) {
         this.j = var1;
      }

      if(this.v > var2) {
         this.v = var2;
      } else if(this.v < var1) {
         this.v = var1;
      }

      if(this.M > var2) {
         this.M = var2;
      } else if(this.M < var1) {
         this.M = var1;
      }

      if(this.U > var2) {
         this.U = var2;
      } else if(this.U < var1) {
         this.U = var1;
      }

   }

   public final void a(float var1) {
      if(this.j < var1) {
         this.j = var1;
      }

      if(this.v < var1) {
         this.v = var1;
      }

      if(this.M < var1) {
         this.M = var1;
      }

      if(this.U < var1) {
         this.U = var1;
      }

   }

   public final void E(float var1) {
      if(this.j > var1) {
         this.j = var1;
      }

      if(this.v > var1) {
         this.v = var1;
      }

      if(this.M > var1) {
         this.M = var1;
      }

      if(this.U > var1) {
         this.U = var1;
      }

   }

   public final void Y() {
      this.j = Math.abs(this.j);
      this.v = Math.abs(this.v);
      this.M = Math.abs(this.M);
      this.U = Math.abs(this.U);
   }

   public void B(ra var1, ra var2, float var3) {
      this.j = (1.0F - var3) * var1.j + var3 * var2.j;
      this.v = (1.0F - var3) * var1.v + var3 * var2.v;
      this.M = (1.0F - var3) * var1.M + var3 * var2.M;
      this.U = (1.0F - var3) * var1.U + var3 * var2.U;
   }

   public void H(ra var1, float var2) {
      this.j = (1.0F - var2) * this.j + var2 * var1.j;
      this.v = (1.0F - var2) * this.v + var2 * var1.v;
      this.M = (1.0F - var2) * this.M + var2 * var1.M;
      this.U = (1.0F - var2) * this.U + var2 * var1.U;
   }

   public Object clone() {
      return super.clone();
   }

   public final float g() {
      return this.j;
   }

   public final void u(float var1) {
      this.j = var1;
   }

   public final float W() {
      return this.v;
   }

   public final void b(float var1) {
      this.v = var1;
   }

   public final float A() {
      return this.M;
   }

   public final void G(float var1) {
      this.M = var1;
   }

   public final float P() {
      return this.U;
   }

   public final void x(float var1) {
      this.U = var1;
   }

   public static void w(String[] var0) {
      n = var0;
   }

   public static String[] C() {
      return n;
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }

   static {
      w((String[])null);
   }
}
