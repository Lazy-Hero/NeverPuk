package net.nj;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.xn;
import net.nj.o;
import net.nj.q;

public class v extends net.nj.z {
   private double R;

   v() {
   }

   public v(double var1) {
      this.R = var1;
   }

   void J(DataOutput var1) throws IOException {
      var1.writeDouble(this.R);
   }

   void n(DataInput var1, int var2, o var3) throws IOException {
      var3.r(128L);
      this.R = var1.readDouble();
   }

   public byte C() {
      return (byte)6;
   }

   public String toString() {
      return this.R + "d";
   }

   public v J() {
      return new v(this.R);
   }

   public boolean equals(Object var1) {
      int var2 = q.V();
      return super.equals(var1) && this.R == ((v)var1).R;
   }

   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.R);
      return super.hashCode() ^ (int)(var1 ^ var1 >>> 32);
   }

   public long q() {
      return (long)Math.floor(this.R);
   }

   public int Q() {
      return net.u.t.L(this.R);
   }

   public short z() {
      return (short)(net.u.t.L(this.R) & '\uffff');
   }

   public byte k() {
      return (byte)(net.u.t.L(this.R) & 255);
   }

   public double G() {
      return this.R;
   }

   public float d() {
      return (float)this.R;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
