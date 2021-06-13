package net;

import net.m0;
import net.r3;
import net.x9;
import net.xn;

public class wd {
   private final m0[] X;

   public wd(m0[] var1) {
      this.X = var1;
   }

   public void D() {
      for(int var1 = 0; var1 < this.X.length; ++var1) {
         m0 var2 = this.X[var1];
         var2.V();
      }

   }

   public boolean V(r3 var1) {
      x9.y();
      int var3 = 0;
      if(var3 < this.X.length) {
         m0 var4 = this.X[var3];
         if(!var4.p(var1)) {
            return false;
         }

         ++var3;
      }

      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
