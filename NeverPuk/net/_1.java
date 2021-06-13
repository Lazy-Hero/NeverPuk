package net;

import net.bf;
import net.mf;
import net.xn;
import net.z9;

public class _1 {
   private bf[] Z = new bf[0];

   public void f(bf var1) {
      this.Z = (bf[])((bf[])z9.F((Object[])this.Z, (Object)var1));
   }

   public boolean b(int var1) {
      for(int var2 = 0; var2 < this.Z.length; ++var2) {
         bf var3 = this.Z[var2];
         if(var3.s(var1)) {
            return true;
         }
      }

      return false;
   }

   public int q() {
      return this.Z.length;
   }

   public bf S(int var1) {
      return this.Z[var1];
   }

   public String toString() {
      StringBuffer var2 = new StringBuffer();
      mf.O();
      var2.append("[");
      int var3 = 0;
      if(var3 < this.Z.length) {
         bf var4 = this.Z[var3];
         var2.append(", ");
         var2.append(var4.toString());
         ++var3;
      }

      var2.append("]");
      return var2.toString();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
