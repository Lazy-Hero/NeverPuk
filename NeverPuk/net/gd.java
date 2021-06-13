package net;

import java.io.Serializable;
import net.ra;

public abstract class gd implements Serializable, Cloneable {
   static final long serialVersionUID = 8064614250942616720L;
   public int q;
   public int o;
   public int v;
   public int j;

   public gd(int var1, int var2, int var3, int var4) {
      this.q = var1;
      this.o = var2;
      this.v = var3;
      this.j = var4;
   }

   public gd(int[] var1) {
      this.q = var1[0];
      this.o = var1[1];
      this.v = var1[2];
      this.j = var1[3];
   }

   public gd(gd var1) {
      this.q = var1.q;
      this.o = var1.o;
      this.v = var1.v;
      this.j = var1.j;
   }

   public gd() {
      this.q = 0;
      this.o = 0;
      this.v = 0;
      this.j = 0;
   }

   public final void f(int var1, int var2, int var3, int var4) {
      this.q = var1;
      this.o = var2;
      this.v = var3;
      this.j = var4;
   }

   public final void Q(int[] var1) {
      this.q = var1[0];
      this.o = var1[1];
      this.v = var1[2];
      this.j = var1[3];
   }

   public final void d(gd var1) {
      this.q = var1.q;
      this.o = var1.o;
      this.v = var1.v;
      this.j = var1.j;
   }

   public final void V(int[] var1) {
      var1[0] = this.q;
      var1[1] = this.o;
      var1[2] = this.v;
      var1[3] = this.j;
   }

   public final void h(gd var1) {
      var1.q = this.q;
      var1.o = this.o;
      var1.v = this.v;
      var1.j = this.j;
   }

   public final void i(gd var1, gd var2) {
      this.q = var1.q + var2.q;
      this.o = var1.o + var2.o;
      this.v = var1.v + var2.v;
      this.j = var1.j + var2.j;
   }

   public final void B(gd var1) {
      this.q += var1.q;
      this.o += var1.o;
      this.v += var1.v;
      this.j += var1.j;
   }

   public final void K(gd var1, gd var2) {
      this.q = var1.q - var2.q;
      this.o = var1.o - var2.o;
      this.v = var1.v - var2.v;
      this.j = var1.j - var2.j;
   }

   public final void E(gd var1) {
      this.q -= var1.q;
      this.o -= var1.o;
      this.v -= var1.v;
      this.j -= var1.j;
   }

   public final void k(gd var1) {
      this.q = -var1.q;
      this.o = -var1.o;
      this.v = -var1.v;
      this.j = -var1.j;
   }

   public final void B() {
      this.q = -this.q;
      this.o = -this.o;
      this.v = -this.v;
      this.j = -this.j;
   }

   public final void j(int var1, gd var2) {
      this.q = var1 * var2.q;
      this.o = var1 * var2.o;
      this.v = var1 * var2.v;
      this.j = var1 * var2.j;
   }

   public final void r(int var1) {
      this.q *= var1;
      this.o *= var1;
      this.v *= var1;
      this.j *= var1;
   }

   public final void W(int var1, gd var2, gd var3) {
      this.q = var1 * var2.q + var3.q;
      this.o = var1 * var2.o + var3.o;
      this.v = var1 * var2.v + var3.v;
      this.j = var1 * var2.j + var3.j;
   }

   public final void u(int var1, gd var2) {
      this.q = var1 * this.q + var2.q;
      this.o = var1 * this.o + var2.o;
      this.v = var1 * this.v + var2.v;
      this.j = var1 * this.j + var2.j;
   }

   public String toString() {
      return "(" + this.q + ", " + this.o + ", " + this.v + ", " + this.j + ")";
   }

   public boolean equals(Object var1) {
      gd var2 = (gd)var1;
      return this.q == var2.q && this.o == var2.o && this.v == var2.v && this.j == var2.j;
   }

   public int hashCode() {
      long var1 = 1L;
      var1 = 31L * var1 + (long)this.q;
      var1 = 31L * var1 + (long)this.o;
      var1 = 31L * var1 + (long)this.v;
      var1 = 31L * var1 + (long)this.j;
      return (int)(var1 ^ var1 >> 32);
   }

   public final void p(int var1, int var2, gd var3) {
      String[] var4 = ra.C();
      if(var3.q > var2) {
         this.q = var2;
      }

      if(var3.q < var1) {
         this.q = var1;
      }

      this.q = var3.q;
      if(var3.o > var2) {
         this.o = var2;
      }

      if(var3.o < var1) {
         this.o = var1;
      }

      this.o = var3.o;
      if(var3.v > var2) {
         this.v = var2;
      }

      if(var3.v < var1) {
         this.v = var1;
      }

      this.v = var3.v;
      if(var3.j > var2) {
         this.j = var2;
      }

      if(var3.j < var1) {
         this.j = var1;
      }

      this.j = var3.j;
   }

   public final void p(int var1, gd var2) {
      if(var2.q < var1) {
         this.q = var1;
      } else {
         this.q = var2.q;
      }

      if(var2.o < var1) {
         this.o = var1;
      } else {
         this.o = var2.o;
      }

      if(var2.v < var1) {
         this.v = var1;
      } else {
         this.v = var2.v;
      }

      if(var2.j < var1) {
         this.j = var1;
      } else {
         this.j = var2.j;
      }

   }

   public final void Q(int var1, gd var2) {
      if(var2.q > var1) {
         this.q = var1;
      } else {
         this.q = var2.q;
      }

      if(var2.o > var1) {
         this.o = var1;
      } else {
         this.o = var2.o;
      }

      if(var2.v > var1) {
         this.v = var1;
      } else {
         this.v = var2.v;
      }

      if(var2.j > var1) {
         this.j = var1;
      } else {
         this.j = var2.v;
      }

   }

   public final void C(gd var1) {
      this.q = Math.abs(var1.q);
      this.o = Math.abs(var1.o);
      this.v = Math.abs(var1.v);
      this.j = Math.abs(var1.j);
   }

   public final void d(int var1, int var2) {
      if(this.q > var2) {
         this.q = var2;
      } else if(this.q < var1) {
         this.q = var1;
      }

      if(this.o > var2) {
         this.o = var2;
      } else if(this.o < var1) {
         this.o = var1;
      }

      if(this.v > var2) {
         this.v = var2;
      } else if(this.v < var1) {
         this.v = var1;
      }

      if(this.j > var2) {
         this.j = var2;
      } else if(this.j < var1) {
         this.j = var1;
      }

   }

   public final void R(int var1) {
      if(this.q < var1) {
         this.q = var1;
      }

      if(this.o < var1) {
         this.o = var1;
      }

      if(this.v < var1) {
         this.v = var1;
      }

      if(this.j < var1) {
         this.j = var1;
      }

   }

   public final void e(int var1) {
      if(this.q > var1) {
         this.q = var1;
      }

      if(this.o > var1) {
         this.o = var1;
      }

      if(this.v > var1) {
         this.v = var1;
      }

      if(this.j > var1) {
         this.j = var1;
      }

   }

   public final void L() {
      this.q = Math.abs(this.q);
      this.o = Math.abs(this.o);
      this.v = Math.abs(this.v);
      this.j = Math.abs(this.j);
   }

   public Object clone() {
      return super.clone();
   }

   public final int w() {
      return this.q;
   }

   public final void w(int var1) {
      this.q = var1;
   }

   public final int f() {
      return this.o;
   }

   public final void g(int var1) {
      this.o = var1;
   }

   public final int R() {
      return this.v;
   }

   public final void D(int var1) {
      this.v = var1;
   }

   public final int H() {
      return this.j;
   }

   public final void u(int var1) {
      this.j = var1;
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }
}
