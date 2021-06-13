package net.nj;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.xn;
import net.nj.o;
import net.nj.q;

public class r extends net.nj.z {
   private short e;

   public r() {
   }

   public r(short var1) {
      this.e = var1;
   }

   void J(DataOutput var1) throws IOException {
      var1.writeShort(this.e);
   }

   void n(DataInput var1, int var2, o var3) throws IOException {
      var3.r(80L);
      this.e = var1.readShort();
   }

   public byte C() {
      return (byte)2;
   }

   public String toString() {
      return this.e + "s";
   }

   public r w() {
      return new r(this.e);
   }

   public boolean equals(Object var1) {
      int var2 = q.V();
      return super.equals(var1) && this.e == ((r)var1).e;
   }

   public int hashCode() {
      return super.hashCode() ^ this.e;
   }

   public long q() {
      return (long)this.e;
   }

   public int Q() {
      return this.e;
   }

   public short z() {
      return this.e;
   }

   public byte k() {
      return (byte)(this.e & 255);
   }

   public double G() {
      return (double)this.e;
   }

   public float d() {
      return (float)this.e;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
