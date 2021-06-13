package net.nj;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.xn;
import net.nj.o;
import net.nj.q;

public class k extends net.nj.z {
   private long g;

   k() {
   }

   public k(long var1) {
      this.g = var1;
   }

   void J(DataOutput var1) throws IOException {
      var1.writeLong(this.g);
   }

   void n(DataInput var1, int var2, o var3) throws IOException {
      var3.r(128L);
      this.g = var1.readLong();
   }

   public byte C() {
      return (byte)4;
   }

   public String toString() {
      return this.g + "L";
   }

   public k m() {
      return new k(this.g);
   }

   public boolean equals(Object var1) {
      int var2 = q.V();
      return super.equals(var1) && this.g == ((k)var1).g;
   }

   public int hashCode() {
      return super.hashCode() ^ (int)(this.g ^ this.g >>> 32);
   }

   public long q() {
      return this.g;
   }

   public int Q() {
      return (int)(this.g & -1L);
   }

   public short z() {
      return (short)((int)(this.g & 65535L));
   }

   public byte k() {
      return (byte)((int)(this.g & 255L));
   }

   public double G() {
      return (double)this.g;
   }

   public float d() {
      return (float)this.g;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
