package net.u;

import com.google.common.base.MoreObjects;
import javax.annotation.concurrent.Immutable;
import net.xn;
import net.u.j;
import net.u.t;

@Immutable
public class d implements Comparable {
   public static final d S = new d(0, 0, 0);
   private final int G;
   private final int i;
   private final int F;
   private static d[] L;

   public d(int var1, int var2, int var3) {
      this.G = var1;
      this.i = var2;
      this.F = var3;
   }

   public d(double var1, double var3, double var5) {
      this(t.L(var1), t.L(var3), t.L(var5));
   }

   public boolean equals(Object var1) {
      d[] var2 = j.n();
      if(this == var1) {
         return true;
      } else if(!(var1 instanceof d)) {
         return false;
      } else {
         d var3 = (d)var1;
         return this.t() != var3.t()?false:(this.h() != var3.h()?false:this.y() == var3.y());
      }
   }

   public int hashCode() {
      return (this.h() + this.y() * 31) * 31 + this.t();
   }

   public int f(d var1) {
      return this.h() == var1.h()?(this.y() == var1.y()?this.t() - var1.t():this.y() - var1.y()):this.h() - var1.h();
   }

   public int t() {
      return this.G;
   }

   public int h() {
      return this.i;
   }

   public int y() {
      return this.F;
   }

   public d o(d var1) {
      return new d(this.h() * var1.y() - this.y() * var1.h(), this.y() * var1.t() - this.t() * var1.y(), this.t() * var1.h() - this.h() * var1.t());
   }

   public double L(int var1, int var2, int var3) {
      double var4 = (double)(this.t() - var1);
      double var6 = (double)(this.h() - var2);
      double var8 = (double)(this.y() - var3);
      return Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
   }

   public double s(double var1, double var3, double var5) {
      double var7 = (double)this.t() - var1;
      double var9 = (double)this.h() - var3;
      double var11 = (double)this.y() - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double S(double var1, double var3, double var5) {
      double var7 = (double)this.t() + 0.5D - var1;
      double var9 = (double)this.h() + 0.5D - var3;
      double var11 = (double)this.y() + 0.5D - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double n(d var1) {
      return this.s((double)var1.t(), (double)var1.h(), (double)var1.y());
   }

   public String toString() {
      return MoreObjects.toStringHelper(this).add("x", this.t()).add("y", this.h()).add("z", this.y()).toString();
   }

   static {
      d[] var10000 = new d[5];
      h(var10000);
   }

   public static void h(d[] var0) {
      L = var0;
   }

   public static d[] y() {
      return L;
   }

   private static xn c(xn var0) {
      return var0;
   }
}
