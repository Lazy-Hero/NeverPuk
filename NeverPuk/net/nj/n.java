package net.nj;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import net.xn;
import net.nj.o;
import net.nj.q;

public class n extends q {
   private int[] m;

   n() {
   }

   public n(int[] var1) {
      this.m = var1;
   }

   public n(List var1) {
      this(T(var1));
   }

   private static int[] T(List var0) {
      q.V();
      int[] var2 = new int[var0.size()];
      int var3 = 0;
      if(var3 < var0.size()) {
         Integer var4 = (Integer)var0.get(var3);
         var2[var3] = var4 == null?0:var4.intValue();
         ++var3;
      }

      return var2;
   }

   void J(DataOutput var1) throws IOException {
      var1.writeInt(this.m.length);

      for(int var5 : this.m) {
         var1.writeInt(var5);
      }

   }

   void n(DataInput var1, int var2, o var3) throws IOException {
      var3.r(192L);
      int var5 = var1.readInt();
      q.H();
      var3.r((long)(32 * var5));
      this.m = new int[var5];
      int var6 = 0;
      if(var6 < var5) {
         this.m[var6] = var1.readInt();
         ++var6;
      }

   }

   public byte C() {
      return (byte)11;
   }

   public String toString() {
      q.V();
      StringBuilder var2 = new StringBuilder("[I;");
      int var3 = 0;
      if(var3 < this.m.length) {
         var2.append(',');
         var2.append(this.m[var3]);
         ++var3;
      }

      return var2.append(']').toString();
   }

   public n X() {
      int[] var1 = new int[this.m.length];
      System.arraycopy(this.m, 0, var1, 0, this.m.length);
      return new n(var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1) && Arrays.equals(this.m, ((n)var1).m);
   }

   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.m);
   }

   public int[] i() {
      return this.m;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
