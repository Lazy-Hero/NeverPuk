package net.nj;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import net.xn;
import net.nj.o;
import net.nj.q;

public class d extends q {
   private long[] h;

   d() {
   }

   public d(long[] var1) {
      this.h = var1;
   }

   public d(List var1) {
      this(Z(var1));
   }

   private static long[] Z(List var0) {
      q.H();
      long[] var2 = new long[var0.size()];
      int var3 = 0;
      if(var3 < var0.size()) {
         Long var4 = (Long)var0.get(var3);
         var2[var3] = var4 == null?0L:var4.longValue();
         ++var3;
      }

      return var2;
   }

   void J(DataOutput var1) throws IOException {
      var1.writeInt(this.h.length);

      for(long var5 : this.h) {
         var1.writeLong(var5);
      }

   }

   void n(DataInput var1, int var2, o var3) throws IOException {
      var3.r(192L);
      q.V();
      int var5 = var1.readInt();
      var3.r((long)(64 * var5));
      this.h = new long[var5];
      int var6 = 0;
      if(var6 < var5) {
         this.h[var6] = var1.readLong();
         ++var6;
      }

   }

   public byte C() {
      return (byte)12;
   }

   public String toString() {
      q.H();
      StringBuilder var2 = new StringBuilder("[L;");
      int var3 = 0;
      if(var3 < this.h.length) {
         var2.append(',');
         var2.append(this.h[var3]).append('L');
         ++var3;
      }

      return var2.append(']').toString();
   }

   public d Q() {
      long[] var1 = new long[this.h.length];
      System.arraycopy(this.h, 0, var1, 0, this.h.length);
      return new d(var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1) && Arrays.equals(this.h, ((d)var1).h);
   }

   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.h);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
