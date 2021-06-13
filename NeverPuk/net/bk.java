package net;

import net.r5;
import net.uv;
import net.xn;

public class bk {
   private final int m;
   private final r5[] d;

   public bk(int var1, r5[] var2) {
      this.m = var1;
      this.d = var2;
   }

   public int U() {
      return this.m;
   }

   public boolean l(int var1, int var2) {
      uv.l();
      int var4 = 0;
      if(var4 < this.d.length) {
         r5 var5 = this.d[var4];
         if(var5.E(var1, var2)) {
            return true;
         }

         ++var4;
      }

      return false;
   }

   public int[] U() {
      int[] var1 = new int[this.d.length];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = this.d[var2].K();
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
