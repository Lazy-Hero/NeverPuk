package net;

import net.mf;

public class bv {
   private int j = 18;
   private int H = 128;
   private int G = 18;
   private int T = 0;
   private int r = 0;
   private int k = 0;
   private int[][][] V = (int[][][])null;
   private int[] e = null;
   private int Q = 0;

   public bv(int var1, int var2, int var3) {
      this.j = var1;
      this.H = var2;
      this.G = var3;
      this.V = new int[var1][var2][var3];
      this.R();
   }

   public void R() {
      mf.O();
      int var2 = 0;
      if(var2 < this.j) {
         int[][] var3 = this.V[var2];
         int var4 = 0;
         if(var4 < this.H) {
            int[] var5 = var3[var4];
            int var6 = 0;
            if(var6 < this.G) {
               var5[var6] = -1;
               ++var6;
            }

            ++var4;
         }

         ++var2;
      }

   }

   public void O(int var1, int var2, int var3) {
      this.T = var1;
      this.r = var2;
      this.k = var3;
      this.R();
   }

   public int F(int var1, int var2, int var3) {
      this.e = this.V[var1 - this.T][var2 - this.r];
      this.Q = var3 - this.k;
      return this.e[this.Q];
   }

   public void B(int var1) {
      this.e[this.Q] = var1;
   }

   private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException var0) {
      return var0;
   }
}
