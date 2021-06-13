package net.nj;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import net.xn;
import net.nj.o;
import net.nj.q;

public class t extends q {
   private byte[] U;

   t() {
   }

   public t(byte[] var1) {
      this.U = var1;
   }

   public t(List var1) {
      this(F(var1));
   }

   private static byte[] F(List var0) {
      q.H();
      byte[] var2 = new byte[var0.size()];
      int var3 = 0;
      if(var3 < var0.size()) {
         Byte var4 = (Byte)var0.get(var3);
         var2[var3] = var4 == null?0:var4.byteValue();
         ++var3;
      }

      return var2;
   }

   void J(DataOutput var1) throws IOException {
      var1.writeInt(this.U.length);
      var1.write(this.U);
   }

   void n(DataInput var1, int var2, o var3) throws IOException {
      var3.r(192L);
      int var4 = var1.readInt();
      var3.r((long)(8 * var4));
      this.U = new byte[var4];
      var1.readFully(this.U);
   }

   public byte C() {
      return (byte)7;
   }

   public String toString() {
      q.H();
      StringBuilder var2 = new StringBuilder("[B;");
      int var3 = 0;
      if(var3 < this.U.length) {
         var2.append(',');
         var2.append(this.U[var3]).append('B');
         ++var3;
      }

      return var2.append(']').toString();
   }

   public q v() {
      byte[] var1 = new byte[this.U.length];
      System.arraycopy(this.U, 0, var1, 0, this.U.length);
      return new t(var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1) && Arrays.equals(this.U, ((t)var1).U);
   }

   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.U);
   }

   public byte[] u() {
      return this.U;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
