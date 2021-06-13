package net;

import java.io.Serializable;
import net.go;
import net.op;
import net.ra;

public abstract class x_ implements Serializable, Cloneable {
   static final long serialVersionUID = 5019834619484343712L;
   public float q;
   public float Q;
   public float G;

   public x_(float var1, float var2, float var3) {
      this.q = var1;
      this.Q = var2;
      this.G = var3;
   }

   public x_(float[] var1) {
      this.q = var1[0];
      this.Q = var1[1];
      this.G = var1[2];
   }

   public x_(x_ var1) {
      this.q = var1.q;
      this.Q = var1.Q;
      this.G = var1.G;
   }

   public x_(go var1) {
      this.q = (float)var1.n;
      this.Q = (float)var1.Z;
      this.G = (float)var1.B;
   }

   public x_() {
      this.q = 0.0F;
      this.Q = 0.0F;
      this.G = 0.0F;
   }

   public String toString() {
      return "(" + this.q + ", " + this.Q + ", " + this.G + ")";
   }

   public final void X(float var1, float var2, float var3) {
      this.q = var1;
      this.Q = var2;
      this.G = var3;
   }

   public final void g(float[] var1) {
      this.q = var1[0];
      this.Q = var1[1];
      this.G = var1[2];
   }

   public final void g(x_ var1) {
      this.q = var1.q;
      this.Q = var1.Q;
      this.G = var1.G;
   }

   public final void k(go var1) {
      this.q = (float)var1.n;
      this.Q = (float)var1.Z;
      this.G = (float)var1.B;
   }

   public final void e(float[] var1) {
      var1[0] = this.q;
      var1[1] = this.Q;
      var1[2] = this.G;
   }

   public final void U(x_ var1) {
      var1.q = this.q;
      var1.Q = this.Q;
      var1.G = this.G;
   }

   public final void t(x_ var1, x_ var2) {
      this.q = var1.q + var2.q;
      this.Q = var1.Q + var2.Q;
      this.G = var1.G + var2.G;
   }

   public final void R(x_ var1) {
      this.q += var1.q;
      this.Q += var1.Q;
      this.G += var1.G;
   }

   public final void P(x_ var1, x_ var2) {
      this.q = var1.q - var2.q;
      this.Q = var1.Q - var2.Q;
      this.G = var1.G - var2.G;
   }

   public final void b(x_ var1) {
      this.q -= var1.q;
      this.Q -= var1.Q;
      this.G -= var1.G;
   }

   public final void u(x_ var1) {
      this.q = -var1.q;
      this.Q = -var1.Q;
      this.G = -var1.G;
   }

   public final void w() {
      this.q = -this.q;
      this.Q = -this.Q;
      this.G = -this.G;
   }

   public final void i(float var1, x_ var2) {
      this.q = var1 * var2.q;
      this.Q = var1 * var2.Q;
      this.G = var1 * var2.G;
   }

   public final void V(float var1) {
      this.q *= var1;
      this.Q *= var1;
      this.G *= var1;
   }

   public final void R(float var1, x_ var2, x_ var3) {
      this.q = var1 * var2.q + var3.q;
      this.Q = var1 * var2.Q + var3.Q;
      this.G = var1 * var2.G + var3.G;
   }

   public final void u(float var1, x_ var2) {
      this.q = var1 * this.q + var2.q;
      this.Q = var1 * this.Q + var2.Q;
      this.G = var1 * this.G + var2.G;
   }

   public boolean P(x_ var1) {
      return this.q == var1.q && this.Q == var1.Q && this.G == var1.G;
   }

   public boolean equals(Object var1) {
      x_ var2 = (x_)var1;
      return this.q == var2.q && this.Q == var2.Q && this.G == var2.G;
   }

   public boolean q(x_ var1, float var2) {
      float var3 = this.q - var1.q;
      if(Float.isNaN(var3)) {
         return false;
      } else if((var3 < 0.0F?-var3:var3) > var2) {
         return false;
      } else {
         var3 = this.Q - var1.Q;
         if(Float.isNaN(var3)) {
            return false;
         } else if((var3 < 0.0F?-var3:var3) > var2) {
            return false;
         } else {
            var3 = this.G - var1.G;
            return Float.isNaN(var3)?false:(var3 < 0.0F?-var3:var3) <= var2;
         }
      }
   }

   public int hashCode() {
      long var1 = 1L;
      var1 = op.F(var1, this.q);
      var1 = op.F(var1, this.Q);
      var1 = op.F(var1, this.G);
      return op.K(var1);
   }

   public final void J(float var1, float var2, x_ var3) {
      String[] var4 = ra.C();
      if(Float.compare(var3.q, var2) > 0) {
         this.q = var2;
      }

      if(var3.q < var1) {
         this.q = var1;
      }

      this.q = var3.q;
      if(Float.compare(var3.Q, var2) > 0) {
         this.Q = var2;
      }

      if(var3.Q < var1) {
         this.Q = var1;
      }

      this.Q = var3.Q;
      if(Float.compare(var3.G, var2) > 0) {
         this.G = var2;
      }

      if(var3.G < var1) {
         this.G = var1;
      }

      this.G = var3.G;
   }

   public final void J(float var1, x_ var2) {
      if(var2.q < var1) {
         this.q = var1;
      } else {
         this.q = var2.q;
      }

      if(var2.Q < var1) {
         this.Q = var1;
      } else {
         this.Q = var2.Q;
      }

      if(var2.G < var1) {
         this.G = var1;
      } else {
         this.G = var2.G;
      }

   }

   public final void K(float var1, x_ var2) {
      if(var2.q > var1) {
         this.q = var1;
      } else {
         this.q = var2.q;
      }

      if(var2.Q > var1) {
         this.Q = var1;
      } else {
         this.Q = var2.Q;
      }

      if(var2.G > var1) {
         this.G = var1;
      } else {
         this.G = var2.G;
      }

   }

   public final void J(x_ var1) {
      this.q = Math.abs(var1.q);
      this.Q = Math.abs(var1.Q);
      this.G = Math.abs(var1.G);
   }

   public final void L(float var1, float var2) {
      if(this.q > var2) {
         this.q = var2;
      } else if(this.q < var1) {
         this.q = var1;
      }

      if(this.Q > var2) {
         this.Q = var2;
      } else if(this.Q < var1) {
         this.Q = var1;
      }

      if(this.G > var2) {
         this.G = var2;
      } else if(this.G < var1) {
         this.G = var1;
      }

   }

   public final void S(float var1) {
      if(this.q < var1) {
         this.q = var1;
      }

      if(this.Q < var1) {
         this.Q = var1;
      }

      if(this.G < var1) {
         this.G = var1;
      }

   }

   public final void N(float var1) {
      if(this.q > var1) {
         this.q = var1;
      }

      if(this.Q > var1) {
         this.Q = var1;
      }

      if(this.G > var1) {
         this.G = var1;
      }

   }

   public final void B() {
      this.q = Math.abs(this.q);
      this.Q = Math.abs(this.Q);
      this.G = Math.abs(this.G);
   }

   public final void a(x_ var1, x_ var2, float var3) {
      this.q = (1.0F - var3) * var1.q + var3 * var2.q;
      this.Q = (1.0F - var3) * var1.Q + var3 * var2.Q;
      this.G = (1.0F - var3) * var1.G + var3 * var2.G;
   }

   public final void u(x_ var1, float var2) {
      this.q = (1.0F - var2) * this.q + var2 * var1.q;
      this.Q = (1.0F - var2) * this.Q + var2 * var1.Q;
      this.G = (1.0F - var2) * this.G + var2 * var1.G;
   }

   public Object clone() {
      return super.clone();
   }

   public final float p() {
      return this.q;
   }

   public final void r(float var1) {
      this.q = var1;
   }

   public final float z() {
      return this.Q;
   }

   public final void k(float var1) {
      this.Q = var1;
   }

   public final float W() {
      return this.G;
   }

   public final void s(float var1) {
      this.G = var1;
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }
}
