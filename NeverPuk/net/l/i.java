package net.l;

import net.l.q;
import net.u.d;

public class i {
   private final byte[] F;

   public i() {
      this.F = new byte[2048];
   }

   public i(byte[] var1) {
      this.F = var1;
      if(var1.length != 2048) {
         throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + var1.length);
      }
   }

   public int J(int var1, int var2, int var3) {
      return this.F(this.H(var1, var2, var3));
   }

   public void i(int var1, int var2, int var3, int var4) {
      this.R(this.H(var1, var2, var3), var4);
   }

   private int H(int var1, int var2, int var3) {
      return var2 << 8 | var3 << 4 | var1;
   }

   public int F(int var1) {
      q.O();
      int var3 = this.W(var1);
      return this.e(var1)?this.F[var3] & 15:this.F[var3] >> 4 & 15;
   }

   public void R(int var1, int var2) {
      q.O();
      int var4 = this.W(var1);
      if(this.e(var1)) {
         this.F[var4] = (byte)(this.F[var4] & 240 | var2 & 15);
      }

      this.F[var4] = (byte)(this.F[var4] & 15 | (var2 & 15) << 4);
      if(d.y() == null) {
         q.Y("xGNUvc");
      }

   }

   private boolean e(int var1) {
      return (var1 & 1) == 0;
   }

   private int W(int var1) {
      return var1 >> 1;
   }

   public byte[] o() {
      return this.F;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
