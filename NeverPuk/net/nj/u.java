package net.nj;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.xn;
import net.nj.o;
import net.nj.q;

public class u extends net.nj.z {
   private int D;

   u() {
   }

   public u(int var1) {
      this.D = var1;
   }

   void J(DataOutput var1) throws IOException {
      var1.writeInt(this.D);
   }

   void n(DataInput var1, int var2, o var3) throws IOException {
      var3.r(96L);
      this.D = var1.readInt();
   }

   public byte C() {
      return (byte)3;
   }

   public String toString() {
      return String.valueOf(this.D);
   }

   public u j() {
      return new u(this.D);
   }

   public boolean equals(Object var1) {
      int var2 = q.H();
      return super.equals(var1) && this.D == ((u)var1).D;
   }

   public int hashCode() {
      return super.hashCode() ^ this.D;
   }

   public long q() {
      return (long)this.D;
   }

   public int Q() {
      return this.D;
   }

   public short z() {
      return (short)(this.D & '\uffff');
   }

   public byte k() {
      return (byte)(this.D & 255);
   }

   public double G() {
      return (double)this.D;
   }

   public float d() {
      return (float)this.D;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
