package net.y4;

import com.google.common.base.MoreObjects;
import net.xn;
import net.u.d;
import net.y4.p;
import net.yz.aq;

public class v {
   public int i;
   public int D;
   public int p;
   public int e;
   public int P;
   public int J;

   public v() {
   }

   public v(int[] var1) {
      if(var1.length == 6) {
         this.i = var1[0];
         this.D = var1[1];
         this.p = var1[2];
         this.e = var1[3];
         this.P = var1[4];
         this.J = var1[5];
      }

   }

   public static v T() {
      return new v(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
   }

   public static v V(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, aq var9) {
      switch(null.r[var9.ordinal()]) {
      case 1:
         return new v(var0 + var3, var1 + var4, var2 - var8 + 1 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var5);
      case 2:
         return new v(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
      case 3:
         return new v(var0 - var8 + 1 + var5, var1 + var4, var2 + var3, var0 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
      case 4:
         return new v(var0 + var5, var1 + var4, var2 + var3, var0 + var8 - 1 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
      default:
         return new v(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
      }
   }

   public static v c(int var0, int var1, int var2, int var3, int var4, int var5) {
      return new v(Math.min(var0, var3), Math.min(var1, var4), Math.min(var2, var5), Math.max(var0, var3), Math.max(var1, var4), Math.max(var2, var5));
   }

   public v(v var1) {
      this.i = var1.i;
      this.D = var1.D;
      this.p = var1.p;
      this.e = var1.e;
      this.P = var1.P;
      this.J = var1.J;
   }

   public v(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.i = var1;
      this.D = var2;
      this.p = var3;
      this.e = var4;
      this.P = var5;
      this.J = var6;
   }

   public v(d var1, d var2) {
      this.i = Math.min(var1.t(), var2.t());
      this.D = Math.min(var1.h(), var2.h());
      this.p = Math.min(var1.y(), var2.y());
      this.e = Math.max(var1.t(), var2.t());
      this.P = Math.max(var1.h(), var2.h());
      this.J = Math.max(var1.y(), var2.y());
   }

   public v(int var1, int var2, int var3, int var4) {
      this.i = var1;
      this.p = var2;
      this.e = var3;
      this.J = var4;
      this.D = 1;
      this.P = 512;
   }

   public boolean F(v var1) {
      return this.e >= var1.i && this.i <= var1.e && this.J >= var1.p && this.p <= var1.J && this.P >= var1.D && this.D <= var1.P;
   }

   public boolean D(int var1, int var2, int var3, int var4) {
      return this.e >= var1 && this.i <= var3 && this.J >= var2 && this.p <= var4;
   }

   public void W(v var1) {
      this.i = Math.min(this.i, var1.i);
      this.D = Math.min(this.D, var1.D);
      this.p = Math.min(this.p, var1.p);
      this.e = Math.max(this.e, var1.e);
      this.P = Math.max(this.P, var1.P);
      this.J = Math.max(this.J, var1.J);
   }

   public void D(int var1, int var2, int var3) {
      this.i += var1;
      this.D += var2;
      this.p += var3;
      this.e += var1;
      this.P += var2;
      this.J += var3;
   }

   public boolean Y(d var1) {
      int[] var2 = p.d();
      return var1.t() >= this.i && var1.t() <= this.e && var1.y() >= this.p && var1.y() <= this.J && var1.h() >= this.D && var1.h() <= this.P;
   }

   public d C() {
      return new d(this.e - this.i, this.P - this.D, this.J - this.p);
   }

   public int t() {
      return this.e - this.i + 1;
   }

   public int I() {
      return this.P - this.D + 1;
   }

   public int X() {
      return this.J - this.p + 1;
   }

   public String toString() {
      return MoreObjects.toStringHelper(this).add("x0", this.i).add("y0", this.D).add("z0", this.p).add("x1", this.e).add("y1", this.P).add("z1", this.J).toString();
   }

   public net.nj.n I() {
      return new net.nj.n(new int[]{this.i, this.D, this.p, this.e, this.P, this.J});
   }

   private static xn a(xn var0) {
      return var0;
   }
}
