package net.u;

import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;
import net.xn;
import net.u.d;
import net.u.j;
import net.u.m;
import net.u.r;
import net.yz.aq;

public class e {
   public final double n;
   public final double u;
   public final double N;
   public final double d;
   public final double c;
   public final double r;
   private static d[] j;

   public e(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.n = Math.min(var1, var7);
      this.u = Math.min(var3, var9);
      this.N = Math.min(var5, var11);
      this.d = Math.max(var1, var7);
      this.c = Math.max(var3, var9);
      this.r = Math.max(var5, var11);
   }

   public e(j var1) {
      this((double)var1.t(), (double)var1.h(), (double)var1.y(), (double)(var1.t() + 1), (double)(var1.h() + 1), (double)(var1.y() + 1));
   }

   public e(j var1, j var2) {
      this((double)var1.t(), (double)var1.h(), (double)var1.y(), (double)var2.t(), (double)var2.h(), (double)var2.y());
   }

   public e(r var1, r var2) {
      this(var1.p, var1.H, var1.a, var2.p, var2.H, var2.a);
   }

   public e w(double var1) {
      return new e(this.n, this.u, this.N, this.d, var1, this.r);
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof e)) {
         return false;
      } else {
         e var2 = (e)var1;
         return Double.compare(var2.n, this.n) != 0?false:(Double.compare(var2.u, this.u) != 0?false:(Double.compare(var2.N, this.N) != 0?false:(Double.compare(var2.d, this.d) != 0?false:(Double.compare(var2.c, this.c) != 0?false:Double.compare(var2.r, this.r) == 0))));
      }
   }

   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.n);
      int var3 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.u);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.N);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.d);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.c);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.r);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      return var3;
   }

   public e e(double var1, double var3, double var5) {
      double var7 = this.n;
      double var9 = this.u;
      double var11 = this.N;
      double var13 = this.d;
      double var15 = this.c;
      double var17 = this.r;
      if(var1 < 0.0D) {
         var7 -= var1;
      } else if(var1 > 0.0D) {
         var13 -= var1;
      }

      if(var3 < 0.0D) {
         var9 -= var3;
      } else if(var3 > 0.0D) {
         var15 -= var3;
      }

      if(var5 < 0.0D) {
         var11 -= var5;
      } else if(var5 > 0.0D) {
         var17 -= var5;
      }

      return new e(var7, var9, var11, var13, var15, var17);
   }

   public e T(double var1, double var3, double var5) {
      double var7 = this.n;
      double var9 = this.u;
      double var11 = this.N;
      double var13 = this.d;
      double var15 = this.c;
      double var17 = this.r;
      if(var1 < 0.0D) {
         var7 += var1;
      } else if(var1 > 0.0D) {
         var13 += var1;
      }

      if(var3 < 0.0D) {
         var9 += var3;
      } else if(var3 > 0.0D) {
         var15 += var3;
      }

      if(var5 < 0.0D) {
         var11 += var5;
      } else if(var5 > 0.0D) {
         var17 += var5;
      }

      return new e(var7, var9, var11, var13, var15, var17);
   }

   public e f(double var1, double var3, double var5) {
      double var7 = this.n - var1;
      double var9 = this.u - var3;
      double var11 = this.N - var5;
      double var13 = this.d + var1;
      double var15 = this.c + var3;
      double var17 = this.r + var5;
      return new e(var7, var9, var11, var13, var15, var17);
   }

   public e x(double var1) {
      return this.f(var1, var1, var1);
   }

   public e c(e var1) {
      double var2 = Math.max(this.n, var1.n);
      double var4 = Math.max(this.u, var1.u);
      double var6 = Math.max(this.N, var1.N);
      double var8 = Math.min(this.d, var1.d);
      double var10 = Math.min(this.c, var1.c);
      double var12 = Math.min(this.r, var1.r);
      return new e(var2, var4, var6, var8, var10, var12);
   }

   public e Z(e var1) {
      double var2 = Math.min(this.n, var1.n);
      double var4 = Math.min(this.u, var1.u);
      double var6 = Math.min(this.N, var1.N);
      double var8 = Math.max(this.d, var1.d);
      double var10 = Math.max(this.c, var1.c);
      double var12 = Math.max(this.r, var1.r);
      return new e(var2, var4, var6, var8, var10, var12);
   }

   public e w(double var1, double var3, double var5) {
      return new e(this.n + var1, this.u + var3, this.N + var5, this.d + var1, this.c + var3, this.r + var5);
   }

   public e c(j var1) {
      return new e(this.n + (double)var1.t(), this.u + (double)var1.h(), this.N + (double)var1.y(), this.d + (double)var1.t(), this.c + (double)var1.h(), this.r + (double)var1.y());
   }

   public e n(r var1) {
      return this.w(var1.p, var1.H, var1.a);
   }

   public double s(e var1, double var2) {
      if(var1.c > this.u && var1.u < this.c && var1.r > this.N && var1.N < this.r) {
         if(var2 > 0.0D && var1.d <= this.n) {
            double var6 = this.n - var1.d;
            if(var6 < var2) {
               var2 = var6;
            }
         } else if(var2 < 0.0D && var1.n >= this.d) {
            double var4 = this.d - var1.n;
            if(var4 > var2) {
               var2 = var4;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public double j(e var1, double var2) {
      if(var1.d > this.n && var1.n < this.d && var1.r > this.N && var1.N < this.r) {
         if(var2 > 0.0D && var1.c <= this.u) {
            double var6 = this.u - var1.c;
            if(var6 < var2) {
               var2 = var6;
            }
         } else if(var2 < 0.0D && var1.u >= this.c) {
            double var4 = this.c - var1.u;
            if(var4 > var2) {
               var2 = var4;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public double N(e var1, double var2) {
      if(var1.d > this.n && var1.n < this.d && var1.c > this.u && var1.u < this.c) {
         if(var2 > 0.0D && var1.r <= this.N) {
            double var6 = this.N - var1.r;
            if(var6 < var2) {
               var2 = var6;
            }
         } else if(var2 < 0.0D && var1.N >= this.r) {
            double var4 = this.r - var1.N;
            if(var4 > var2) {
               var2 = var4;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public boolean O(e var1) {
      return this.J(var1.n, var1.u, var1.N, var1.d, var1.c, var1.r);
   }

   public boolean J(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.n < var7 && this.d > var1 && this.u < var9 && this.c > var3 && this.N < var11 && this.r > var5;
   }

   public boolean O(r var1, r var2) {
      return this.J(Math.min(var1.p, var2.p), Math.min(var1.H, var2.H), Math.min(var1.a, var2.a), Math.max(var1.p, var2.p), Math.max(var1.H, var2.H), Math.max(var1.a, var2.a));
   }

   public boolean R(r var1) {
      return var1.p > this.n && var1.p < this.d?(var1.H > this.u && var1.H < this.c?var1.a > this.N && var1.a < this.r:false):false;
   }

   public double O() {
      double var1 = this.d - this.n;
      double var3 = this.c - this.u;
      double var5 = this.r - this.N;
      return (var1 + var3 + var5) / 3.0D;
   }

   public e d(double var1) {
      return this.x(-var1);
   }

   @Nullable
   public m G(r var1, r var2) {
      j.n();
      r var4 = this.d(this.n, var1, var2);
      aq var5 = aq.WEST;
      r var6 = this.d(this.d, var1, var2);
      if(var6 != null && this.P(var1, var4, var6)) {
         var4 = var6;
         var5 = aq.EAST;
      }

      var6 = this.Y(this.u, var1, var2);
      if(var6 != null && this.P(var1, var4, var6)) {
         var4 = var6;
         var5 = aq.DOWN;
      }

      var6 = this.Y(this.c, var1, var2);
      if(var6 != null && this.P(var1, var4, var6)) {
         var4 = var6;
         var5 = aq.UP;
      }

      var6 = this.P(this.N, var1, var2);
      if(var6 != null && this.P(var1, var4, var6)) {
         var4 = var6;
         var5 = aq.NORTH;
      }

      var6 = this.P(this.r, var1, var2);
      if(var6 != null && this.P(var1, var4, var6)) {
         var4 = var6;
         var5 = aq.SOUTH;
      }

      m var10000 = var4 == null?null:new m(var4, var5);
      if(d.y() == null) {
         j.G(new d[1]);
      }

      return var10000;
   }

   @VisibleForTesting
   boolean P(r var1, @Nullable r var2, r var3) {
      return var1.Y(var3) < var1.Y(var2);
   }

   @Nullable
   @VisibleForTesting
   r d(double var1, r var3, r var4) {
      r var5 = var3.U(var4, var1);
      return this.g(var5)?var5:null;
   }

   @Nullable
   @VisibleForTesting
   r Y(double var1, r var3, r var4) {
      r var5 = var3.d(var4, var1);
      return this.v(var5)?var5:null;
   }

   @Nullable
   @VisibleForTesting
   r P(double var1, r var3, r var4) {
      r var5 = var3.S(var4, var1);
      return this.k(var5)?var5:null;
   }

   @VisibleForTesting
   public boolean g(r var1) {
      return var1.H >= this.u && var1.H <= this.c && var1.a >= this.N && var1.a <= this.r;
   }

   @VisibleForTesting
   public boolean v(r var1) {
      return var1.p >= this.n && var1.p <= this.d && var1.a >= this.N && var1.a <= this.r;
   }

   @VisibleForTesting
   public boolean k(r var1) {
      return var1.p >= this.n && var1.p <= this.d && var1.H >= this.u && var1.H <= this.c;
   }

   public String toString() {
      return "box[" + this.n + ", " + this.u + ", " + this.N + " -> " + this.d + ", " + this.c + ", " + this.r + "]";
   }

   public boolean p() {
      return Double.isNaN(this.n) || Double.isNaN(this.u) || Double.isNaN(this.N) || Double.isNaN(this.d) || Double.isNaN(this.c) || Double.isNaN(this.r);
   }

   public r z() {
      return new r(this.n + (this.d - this.n) * 0.5D, this.u + (this.c - this.u) * 0.5D, this.N + (this.r - this.N) * 0.5D);
   }

   public static void P(d[] var0) {
      j = var0;
   }

   public static d[] T() {
      return j;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      P((d[])null);
   }
}
