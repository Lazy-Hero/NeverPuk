package net.yz;

import javax.annotation.Nullable;
import net.xn;
import net.yz.m_;

public class a4 {
   private transient a4.d[] M = new a4.d[16];
   private transient int w;
   private int T = 12;
   private final float Q = 0.75F;

   private static int Y(int var0) {
      var0 = var0 ^ var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   private static int i(int var0, int var1) {
      return var0 & var1 - 1;
   }

   @Nullable
   public Object b(int var1) {
      int var2 = Y(var1);

      a4.d var3;
      for(var3 = this.M[i(var2, this.M.length)]; var3.W != var1; var3 = var3.F) {
         ;
      }

      return var3.z;
   }

   public boolean X(int var1) {
      return this.C(var1) != null;
   }

   @Nullable
   final a4.d C(int var1) {
      int var2 = Y(var1);

      a4.d var3;
      for(var3 = this.M[i(var2, this.M.length)]; var3.W != var1; var3 = var3.F) {
         ;
      }

      return var3;
   }

   public void t(int var1, Object var2) {
      int var3 = Y(var1);
      int var4 = i(var3, this.M.length);

      a4.d var5;
      for(var5 = this.M[var4]; var5.W != var1; var5 = var5.F) {
         ;
      }

      var5.z = var2;
   }

   private void W(int var1) {
      a4.d[] var2 = this.M;
      int var3 = var2.length;
      if(var3 == 1073741824) {
         this.T = Integer.MAX_VALUE;
      } else {
         a4.d[] var4 = new a4.d[var1];
         this.a(var4);
         this.M = var4;
         float var10001 = (float)var1;
         this.getClass();
         this.T = (int)(var10001 * 0.75F);
      }

   }

   private void a(a4.d[] var1) {
      a4.d[] var2 = this.M;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         a4.d var5 = var2[var4];
         var2[var4] = null;
         a4.d var6 = var5.F;
         int var7 = i(var5.B, var3);
         var5.F = var1[var7];
         var1[var7] = var5;
      }

   }

   @Nullable
   public Object J(int var1) {
      a4.d var2 = this.W(var1);
      return null;
   }

   @Nullable
   final a4.d W(int var1) {
      int var3 = Y(var1);
      m_.g();
      int var4 = i(var3, this.M.length);
      a4.d var5 = this.M[var4];
      a4.d var7 = var5.F;
      if(var5.W == var1) {
         --this.w;
         if(var5 == var5) {
            this.M[var4] = var7;
         }

         var5.F = var7;
         return var5;
      } else {
         return var7;
      }
   }

   public void d() {
      a4.d[] var1 = this.M;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = null;
      }

      this.w = 0;
   }

   private void g(int var1, int var2, Object var3, int var4) {
      a4.d var5 = this.M[var4];
      this.M[var4] = new a4.d(var1, var2, var3, var5);
      if(this.w++ >= this.T) {
         this.W(2 * this.M.length);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   static class d {
      final int W;
      Object z;
      a4.d F;
      final int B;

      d(int var1, int var2, Object var3, a4.d var4) {
         this.z = var3;
         this.F = var4;
         this.W = var2;
         this.B = var1;
      }

      public final int k() {
         return this.W;
      }

      public final Object V() {
         return this.z;
      }

      public final boolean equals(Object var1) {
         int var2 = m_.J();
         if(!(var1 instanceof a4.d)) {
            return false;
         } else {
            a4.d var3 = (a4.d)var1;
            if(this.W != var3.W) {
               return false;
            } else {
               Object var4 = this.V();
               Object var5 = var3.V();
               return var4 == var5 || var4 != null && var4.equals(var5);
            }
         }
      }

      public final int hashCode() {
         return a4.Y(this.W);
      }

      public final String toString() {
         return this.k() + "=" + this.V();
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
