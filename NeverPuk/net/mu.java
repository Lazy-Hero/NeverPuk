package net;

import net.mf;

public class mu {
   private int e = 18;
   private int E = 128;
   private int Q = 18;
   private int a = 0;
   private int M = 0;
   private int P = 0;
   private byte[][][] X = (byte[][][])null;
   private byte[] l = null;
   private int D = 0;

   public mu(int var1, int var2, int var3) {
      this.e = var1;
      this.E = var2;
      this.Q = var3;
      this.X = new byte[var1][var2][var3];
      this.Y();
   }

   public void Y() {
      mf.O();
      int var2 = 0;
      if(var2 < this.e) {
         byte[][] var3 = this.X[var2];
         int var4 = 0;
         if(var4 < this.E) {
            byte[] var5 = var3[var4];
            int var6 = 0;
            if(var6 < this.Q) {
               var5[var6] = -1;
               ++var6;
            }

            ++var4;
         }

         ++var2;
      }

   }

   public void g(int var1, int var2, int var3) {
      this.a = var1;
      this.M = var2;
      this.P = var3;
      this.Y();
   }

   public byte X(int var1, int var2, int var3) {
      this.l = this.X[var1 - this.a][var2 - this.M];
      this.D = var3 - this.P;
      return this.l[this.D];
   }

   public void e(byte var1) {
      this.l[this.D] = var1;
   }

   private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException var0) {
      return var0;
   }
}
