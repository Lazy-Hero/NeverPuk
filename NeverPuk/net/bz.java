package net;

import java.io.Serializable;
import net.ra;

public abstract class bz implements Serializable, Cloneable {
   static final long serialVersionUID = -3555701650170169638L;
   public int B;
   public int t;

   public bz(int var1, int var2) {
      this.B = var1;
      this.t = var2;
   }

   public bz(int[] var1) {
      this.B = var1[0];
      this.t = var1[1];
   }

   public bz(bz var1) {
      this.B = var1.B;
      this.t = var1.t;
   }

   public bz() {
      this.B = 0;
      this.t = 0;
   }

   public final void T(int var1, int var2) {
      this.B = var1;
      this.t = var2;
   }

   public final void D(int[] var1) {
      this.B = var1[0];
      this.t = var1[1];
   }

   public final void N(bz var1) {
      this.B = var1.B;
      this.t = var1.t;
   }

   public final void u(int[] var1) {
      var1[0] = this.B;
      var1[1] = this.t;
   }

   public final void a(bz var1) {
      var1.B = this.B;
      var1.t = this.t;
   }

   public final void W(bz var1, bz var2) {
      this.B = var1.B + var2.B;
      this.t = var1.t + var2.t;
   }

   public final void c(bz var1) {
      this.B += var1.B;
      this.t += var1.t;
   }

   public final void u(bz var1, bz var2) {
      this.B = var1.B - var2.B;
      this.t = var1.t - var2.t;
   }

   public final void l(bz var1) {
      this.B -= var1.B;
      this.t -= var1.t;
   }

   public final void t(bz var1) {
      this.B = -var1.B;
      this.t = -var1.t;
   }

   public final void z() {
      this.B = -this.B;
      this.t = -this.t;
   }

   public final void X(int var1, bz var2) {
      this.B = var1 * var2.B;
      this.t = var1 * var2.t;
   }

   public final void Z(int var1) {
      this.B *= var1;
      this.t *= var1;
   }

   public final void I(int var1, bz var2, bz var3) {
      this.B = var1 * var2.B + var3.B;
      this.t = var1 * var2.t + var3.t;
   }

   public final void b(int var1, bz var2) {
      this.B = var1 * this.B + var2.B;
      this.t = var1 * this.t + var2.t;
   }

   public String toString() {
      return "(" + this.B + ", " + this.t + ")";
   }

   public boolean equals(Object var1) {
      bz var2 = (bz)var1;
      return this.B == var2.B && this.t == var2.t;
   }

   public int hashCode() {
      long var1 = 1L;
      var1 = 31L * var1 + (long)this.B;
      var1 = 31L * var1 + (long)this.t;
      return (int)(var1 ^ var1 >> 32);
   }

   public final void e(int var1, int var2, bz var3) {
      String[] var4 = ra.C();
      if(var3.B > var2) {
         this.B = var2;
      }

      if(var3.B < var1) {
         this.B = var1;
      }

      this.B = var3.B;
      if(var3.t > var2) {
         this.t = var2;
      }

      if(var3.t < var1) {
         this.t = var1;
      }

      this.t = var3.t;
   }

   public final void L(int var1, bz var2) {
      if(var2.B < var1) {
         this.B = var1;
      } else {
         this.B = var2.B;
      }

      if(var2.t < var1) {
         this.t = var1;
      } else {
         this.t = var2.t;
      }

   }

   public final void M(int var1, bz var2) {
      if(var2.B > var1) {
         this.B = var1;
      } else {
         this.B = var2.B;
      }

      if(var2.t > var1) {
         this.t = var1;
      } else {
         this.t = var2.t;
      }

   }

   public final void i(bz var1) {
      this.B = Math.abs(var1.B);
      this.t = Math.abs(var1.t);
   }

   public final void i(int var1, int var2) {
      if(this.B > var2) {
         this.B = var2;
      } else if(this.B < var1) {
         this.B = var1;
      }

      if(this.t > var2) {
         this.t = var2;
      } else if(this.t < var1) {
         this.t = var1;
      }

   }

   public final void U(int var1) {
      if(this.B < var1) {
         this.B = var1;
      }

      if(this.t < var1) {
         this.t = var1;
      }

   }

   public final void a(int var1) {
      if(this.B > var1) {
         this.B = var1;
      }

      if(this.t > var1) {
         this.t = var1;
      }

   }

   public final void r() {
      this.B = Math.abs(this.B);
      this.t = Math.abs(this.t);
   }

   public Object clone() {
      return super.clone();
   }

   public final int d() {
      return this.B;
   }

   public final void z(int var1) {
      this.B = var1;
   }

   public final int V() {
      return this.t;
   }

   public final void b(int var1) {
      this.t = var1;
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }
}
