package net.nj;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.xn;
import net.nj.o;
import net.nj.q;

public class j extends net.nj.z {
   private float a;

   j() {
   }

   public j(float var1) {
      this.a = var1;
   }

   void J(DataOutput var1) throws IOException {
      var1.writeFloat(this.a);
   }

   void n(DataInput var1, int var2, o var3) throws IOException {
      var3.r(96L);
      this.a = var1.readFloat();
   }

   public byte C() {
      return (byte)5;
   }

   public String toString() {
      return this.a + "f";
   }

   public j p() {
      return new j(this.a);
   }

   public boolean equals(Object var1) {
      int var2 = q.V();
      return super.equals(var1) && this.a == ((j)var1).a;
   }

   public int hashCode() {
      return super.hashCode() ^ Float.floatToIntBits(this.a);
   }

   public long q() {
      return (long)this.a;
   }

   public int Q() {
      return net.u.t.M(this.a);
   }

   public short z() {
      return (short)(net.u.t.M(this.a) & '\uffff');
   }

   public byte k() {
      return (byte)(net.u.t.M(this.a) & 255);
   }

   public double G() {
      return (double)this.a;
   }

   public float d() {
      return this.a;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
