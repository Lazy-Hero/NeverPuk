package net;

import java.io.Serializable;
import net.ra;

public abstract class mv implements Serializable, Cloneable {
   static final long serialVersionUID = -732740491767276200L;
   public int t;
   public int n;
   public int e;

   public mv(int var1, int var2, int var3) {
      this.t = var1;
      this.n = var2;
      this.e = var3;
   }

   public mv(int[] var1) {
      this.t = var1[0];
      this.n = var1[1];
      this.e = var1[2];
   }

   public mv(mv var1) {
      this.t = var1.t;
      this.n = var1.n;
      this.e = var1.e;
   }

   public mv() {
      this.t = 0;
      this.n = 0;
      this.e = 0;
   }

   public final void b(int var1, int var2, int var3) {
      this.t = var1;
      this.n = var2;
      this.e = var3;
   }

   public final void x(int[] var1) {
      this.t = var1[0];
      this.n = var1[1];
      this.e = var1[2];
   }

   public final void F(mv var1) {
      this.t = var1.t;
      this.n = var1.n;
      this.e = var1.e;
   }

   public final void u(int[] var1) {
      var1[0] = this.t;
      var1[1] = this.n;
      var1[2] = this.e;
   }

   public final void K(mv var1) {
      var1.t = this.t;
      var1.n = this.n;
      var1.e = this.e;
   }

   public final void B(mv var1, mv var2) {
      this.t = var1.t + var2.t;
      this.n = var1.n + var2.n;
      this.e = var1.e + var2.e;
   }

   public final void A(mv var1) {
      this.t += var1.t;
      this.n += var1.n;
      this.e += var1.e;
   }

   public final void T(mv var1, mv var2) {
      this.t = var1.t - var2.t;
      this.n = var1.n - var2.n;
      this.e = var1.e - var2.e;
   }

   public final void f(mv var1) {
      this.t -= var1.t;
      this.n -= var1.n;
      this.e -= var1.e;
   }

   public final void I(mv var1) {
      this.t = -var1.t;
      this.n = -var1.n;
      this.e = -var1.e;
   }

   public final void Z() {
      this.t = -this.t;
      this.n = -this.n;
      this.e = -this.e;
   }

   public final void G(int var1, mv var2) {
      this.t = var1 * var2.t;
      this.n = var1 * var2.n;
      this.e = var1 * var2.e;
   }

   public final void D(int var1) {
      this.t *= var1;
      this.n *= var1;
      this.e *= var1;
   }

   public final void U(int var1, mv var2, mv var3) {
      this.t = var1 * var2.t + var3.t;
      this.n = var1 * var2.n + var3.n;
      this.e = var1 * var2.e + var3.e;
   }

   public final void i(int var1, mv var2) {
      this.t = var1 * this.t + var2.t;
      this.n = var1 * this.n + var2.n;
      this.e = var1 * this.e + var2.e;
   }

   public String toString() {
      return "(" + this.t + ", " + this.n + ", " + this.e + ")";
   }

   public boolean equals(Object var1) {
      mv var2 = (mv)var1;
      return this.t == var2.t && this.n == var2.n && this.e == var2.e;
   }

   public int hashCode() {
      long var1 = 1L;
      var1 = 31L * var1 + (long)this.t;
      var1 = 31L * var1 + (long)this.n;
      var1 = 31L * var1 + (long)this.e;
      return (int)(var1 ^ var1 >> 32);
   }

   public final void F(int var1, int var2, mv var3) {
      String[] var4 = ra.C();
      if(var3.t > var2) {
         this.t = var2;
      }

      if(var3.t < var1) {
         this.t = var1;
      }

      this.t = var3.t;
      if(var3.n > var2) {
         this.n = var2;
      }

      if(var3.n < var1) {
         this.n = var1;
      }

      this.n = var3.n;
      if(var3.e > var2) {
         this.e = var2;
      }

      if(var3.e < var1) {
         this.e = var1;
      }

      this.e = var3.e;
   }

   public final void J(int var1, mv var2) {
      if(var2.t < var1) {
         this.t = var1;
      } else {
         this.t = var2.t;
      }

      if(var2.n < var1) {
         this.n = var1;
      } else {
         this.n = var2.n;
      }

      if(var2.e < var1) {
         this.e = var1;
      } else {
         this.e = var2.e;
      }

   }

   public final void X(int var1, mv var2) {
      if(var2.t > var1) {
         this.t = var1;
      } else {
         this.t = var2.t;
      }

      if(var2.n > var1) {
         this.n = var1;
      } else {
         this.n = var2.n;
      }

      if(var2.e > var1) {
         this.e = var1;
      } else {
         this.e = var2.e;
      }

   }

   public final void P(mv var1) {
      this.t = Math.abs(var1.t);
      this.n = Math.abs(var1.n);
      this.e = Math.abs(var1.e);
   }

   public final void r(int var1, int var2) {
      if(this.t > var2) {
         this.t = var2;
      } else if(this.t < var1) {
         this.t = var1;
      }

      if(this.n > var2) {
         this.n = var2;
      } else if(this.n < var1) {
         this.n = var1;
      }

      if(this.e > var2) {
         this.e = var2;
      } else if(this.e < var1) {
         this.e = var1;
      }

   }

   public final void U(int var1) {
      if(this.t < var1) {
         this.t = var1;
      }

      if(this.n < var1) {
         this.n = var1;
      }

      if(this.e < var1) {
         this.e = var1;
      }

   }

   public final void W(int var1) {
      if(this.t > var1) {
         this.t = var1;
      }

      if(this.n > var1) {
         this.n = var1;
      }

      if(this.e > var1) {
         this.e = var1;
      }

   }

   public final void z() {
      this.t = Math.abs(this.t);
      this.n = Math.abs(this.n);
      this.e = Math.abs(this.e);
   }

   public Object clone() {
      return super.clone();
   }

   public final int Z() {
      return this.t;
   }

   public final void V(int var1) {
      this.t = var1;
   }

   public final int X() {
      return this.n;
   }

   public final void r(int var1) {
      this.n = var1;
   }

   public final int o() {
      return this.e;
   }

   public final void d(int var1) {
      this.e = var1;
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }
}
