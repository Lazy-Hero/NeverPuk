package net.no;

import java.io.IOException;
import net.no.s8;

public class n implements net.n2.k {
   private int[] f;

   public n() {
   }

   public n(int... var1) {
      this.f = var1;
   }

   public void E(net.n2.h var1) throws IOException {
      s8.x();
      this.f = new int[var1.q()];
      int var3 = 0;
      if(var3 < this.f.length) {
         this.f[var3] = var1.q();
         ++var3;
      }

   }

   public void O(net.n2.h var1) throws IOException {
      s8.x();
      var1.a(this.f.length);
      int[] var3 = this.f;
      int var4 = var3.length;
      int var5 = 0;
      if(var5 < var4) {
         int var6 = var3[var5];
         var1.a(var6);
         ++var5;
      }

   }

   public void C(net.x.t var1) {
      var1.j(this);
   }

   public int[] D() {
      return this.f;
   }
}
