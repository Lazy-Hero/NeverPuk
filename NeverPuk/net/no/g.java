package net.no;

import java.io.IOException;
import net.no.s8;

public class g implements net.n2.k {
   private String[] a;

   public g() {
   }

   public g(String[] var1) {
      this.a = var1;
   }

   public void E(net.n2.h var1) throws IOException {
      s8.Y();
      this.a = new String[var1.q()];
      int var3 = 0;
      if(var3 < this.a.length) {
         this.a[var3] = var1.Z(32767);
         ++var3;
      }

   }

   public void O(net.n2.h var1) throws IOException {
      s8.Y();
      var1.a(this.a.length);
      String[] var3 = this.a;
      int var4 = var3.length;
      int var5 = 0;
      if(var5 < var4) {
         String var6 = var3[var5];
         var1.R(var6);
         ++var5;
      }

   }

   public void V(net.x.t var1) {
      var1.t(this);
   }

   public String[] j() {
      return this.a;
   }
}
