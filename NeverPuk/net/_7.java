package net;

import net.mf;
import net.xn;

public class _7 {
   private int[] e = null;
   private int j = 0;
   private int F = 0;

   public _7(int var1) {
      this.e = new int[var1];
   }

   public void d(int var1) {
      this.e[this.j] = var1;
      ++this.j;
      if(this.F < this.j) {
         this.F = this.j;
      }

   }

   public void X(int var1, int var2) {
      this.e[var1] = var2;
      if(this.F < var1) {
         this.F = var1;
      }

   }

   public void c(int var1) {
      this.j = var1;
   }

   public void c(int[] var1) {
      int var3 = var1.length;
      mf.O();
      int var4 = 0;
      if(var4 < var3) {
         this.e[this.j] = var1[var4];
         ++this.j;
         ++var4;
      }

      if(this.F < this.j) {
         this.F = this.j;
      }

   }

   public int Y(int var1) {
      return this.e[var1];
   }

   public int[] W() {
      return this.e;
   }

   public void K() {
      this.j = 0;
      this.F = 0;
   }

   public int r() {
      return this.F;
   }

   public int t() {
      return this.j;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
