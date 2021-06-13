package net.u;

import javax.annotation.Nullable;
import net.xn;
import net.u.d;
import net.u.j;
import net.u.t;
import net.u.x;

public class r {
   public static final r r = new r(0.0D, 0.0D, 0.0D);
   public final double p;
   public final double H;
   public final double a;
   private static int m;

   public r(double var1, double var3, double var5) {
      if(var1 == -0.0D) {
         var1 = 0.0D;
      }

      if(var3 == -0.0D) {
         var3 = 0.0D;
      }

      if(var5 == -0.0D) {
         var5 = 0.0D;
      }

      this.p = var1;
      this.H = var3;
      this.a = var5;
   }

   public r(d var1) {
      this((double)var1.t(), (double)var1.h(), (double)var1.y());
   }

   public r I(r var1) {
      return new r(var1.p - this.p, var1.H - this.H, var1.a - this.a);
   }

   public r I() {
      double var1 = (double)t.R(this.p * this.p + this.H * this.H + this.a * this.a);
      return var1 < 1.0E-4D?r:new r(this.p / var1, this.H / var1, this.a / var1);
   }

   public double d(r var1) {
      return this.p * var1.p + this.H * var1.H + this.a * var1.a;
   }

   public r M(r var1) {
      return new r(this.H * var1.a - this.a * var1.H, this.a * var1.p - this.p * var1.a, this.p * var1.H - this.H * var1.p);
   }

   public r q(r var1) {
      return this.I(var1.p, var1.H, var1.a);
   }

   public r I(double var1, double var3, double var5) {
      return this.s(-var1, -var3, -var5);
   }

   public r v(r var1) {
      return this.s(var1.p, var1.H, var1.a);
   }

   public r s(double var1, double var3, double var5) {
      return new r(this.p + var1, this.H + var3, this.a + var5);
   }

   public double w(r var1) {
      double var2 = var1.p - this.p;
      double var4 = var1.H - this.H;
      double var6 = var1.a - this.a;
      return (double)t.R(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public double Y(r var1) {
      double var2 = var1.p - this.p;
      double var4 = var1.H - this.H;
      double var6 = var1.a - this.a;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public double s(double var1, double var3, double var5) {
      double var7 = var1 - this.p;
      double var9 = var3 - this.H;
      double var11 = var5 - this.a;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public r T(double var1) {
      return new r(this.p * var1, this.H * var1, this.a * var1);
   }

   public double c() {
      return (double)t.R(this.p * this.p + this.H * this.H + this.a * this.a);
   }

   public double G() {
      return this.p * this.p + this.H * this.H + this.a * this.a;
   }

   @Nullable
   public r U(r var1, double var2) {
      double var4 = var1.p - this.p;
      double var6 = var1.H - this.H;
      double var8 = var1.a - this.a;
      if(var4 * var4 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.p) / var4;
         return var10 >= 0.0D && var10 <= 1.0D?new r(this.p + var4 * var10, this.H + var6 * var10, this.a + var8 * var10):null;
      }
   }

   @Nullable
   public r d(r var1, double var2) {
      j.n();
      double var5 = var1.p - this.p;
      double var7 = var1.H - this.H;
      double var9 = var1.a - this.a;
      if(var7 * var7 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var11 = (var2 - this.H) / var7;
         return Double.compare(var11, 0.0D) >= 0 && var11 <= 1.0D?new r(this.p + var5 * var11, this.H + var7 * var11, this.a + var9 * var11):null;
      }
   }

   @Nullable
   public r S(r var1, double var2) {
      j.n();
      double var5 = var1.p - this.p;
      double var7 = var1.H - this.H;
      double var9 = var1.a - this.a;
      if(var9 * var9 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var11 = (var2 - this.a) / var9;
         return Double.compare(var11, 0.0D) >= 0 && var11 <= 1.0D?new r(this.p + var5 * var11, this.H + var7 * var11, this.a + var9 * var11):null;
      }
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof r)) {
         return false;
      } else {
         r var2 = (r)var1;
         return Double.compare(var2.p, this.p) != 0?false:(Double.compare(var2.H, this.H) != 0?false:Double.compare(var2.a, this.a) == 0);
      }
   }

   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.p);
      int var3 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.H);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.a);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      return var3;
   }

   public String toString() {
      return "(" + this.p + ", " + this.H + ", " + this.a + ")";
   }

   public r f(float var1) {
      float var2 = t.m(var1);
      float var3 = t.A(var1);
      double var4 = this.p;
      double var6 = this.H * (double)var2 + this.a * (double)var3;
      double var8 = this.a * (double)var2 - this.H * (double)var3;
      return new r(var4, var6, var8);
   }

   public r T(float var1) {
      float var2 = t.m(var1);
      float var3 = t.A(var1);
      double var4 = this.p * (double)var2 + this.a * (double)var3;
      double var6 = this.H;
      double var8 = this.a * (double)var2 - this.p * (double)var3;
      return new r(var4, var6, var8);
   }

   public static r W(x var0) {
      return S(var0.E, var0.I);
   }

   public static r S(float var0, float var1) {
      float var2 = t.m(-var1 * 0.017453292F - 3.1415927F);
      float var3 = t.A(-var1 * 0.017453292F - 3.1415927F);
      float var4 = -t.m(-var0 * 0.017453292F);
      float var5 = t.A(-var0 * 0.017453292F);
      return new r((double)(var3 * var4), (double)var5, (double)(var2 * var4));
   }

   static {
      o(60);
   }

   public static void o(int var0) {
      m = var0;
   }

   public static int T() {
      return m;
   }

   public static int O() {
      int var0 = T();
      return 22;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
