package net.nj;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.xn;
import net.nj.o;
import net.nj.q;

public class a extends net.nj.z {
   private byte c;

   a() {
   }

   public a(byte var1) {
      this.c = var1;
   }

   void J(DataOutput var1) throws IOException {
      var1.writeByte(this.c);
   }

   void n(DataInput var1, int var2, o var3) throws IOException {
      var3.r(72L);
      this.c = var1.readByte();
   }

   public byte C() {
      return (byte)1;
   }

   public String toString() {
      return this.c + "b";
   }

   public a F() {
      return new a(this.c);
   }

   public boolean equals(Object var1) {
      int var2 = q.V();
      return super.equals(var1) && this.c == ((a)var1).c;
   }

   public int hashCode() {
      return super.hashCode() ^ this.c;
   }

   public long q() {
      return (long)this.c;
   }

   public int Q() {
      return this.c;
   }

   public short z() {
      return (short)this.c;
   }

   public byte k() {
      return this.c;
   }

   public double G() {
      return (double)this.c;
   }

   public float d() {
      return (float)this.c;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
