package net.nj;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;
import net.xn;
import net.nj.o;
import net.nj.q;

public class y extends q {
   private String A;

   public y() {
      this("");
   }

   public y(String var1) {
      Objects.requireNonNull(var1, "Null string not allowed");
      this.A = var1;
   }

   void J(DataOutput var1) throws IOException {
      var1.writeUTF(this.A);
   }

   void n(DataInput var1, int var2, o var3) throws IOException {
      var3.r(288L);
      this.A = var1.readUTF();
      var3.r((long)(16 * this.A.length()));
   }

   public byte C() {
      return (byte)8;
   }

   public String toString() {
      return j(this.A);
   }

   public y H() {
      return new y(this.A);
   }

   public boolean N() {
      return this.A.isEmpty();
   }

   public boolean equals(Object var1) {
      if(!super.equals(var1)) {
         return false;
      } else {
         y var2 = (y)var1;
         return this.A == null && var2.A == null || Objects.equals(this.A, var2.A);
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.A.hashCode();
   }

   public String i() {
      return this.A;
   }

   public static String j(String var0) {
      q.H();
      StringBuilder var2 = new StringBuilder("\"");
      int var3 = 0;
      if(var3 < var0.length()) {
         char var4 = var0.charAt(var3);
         if(var4 == 92 || var4 == 34) {
            var2.append('\\');
         }

         var2.append(var4);
         ++var3;
      }

      return var2.append('\"').toString();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
