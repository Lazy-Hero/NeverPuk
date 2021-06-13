package net.ng;

import net.c0.b;
import net.c0.l;
import net.ng.i;
import net.nj.f;

public class c extends i {
   private final String[] t;

   public c(Class var1, String... var2) {
      super(var1);
      this.t = var2;
   }

   f m(l var1, f var2, int var3) {
      String[] var5 = this.t;
      int var6 = var5.length;
      i.V();
      int var7 = 0;
      if(var7 < var6) {
         String var8 = var5[var7];
         var2 = b.V(var1, var2, var3, var8);
         ++var7;
      }

      return var2;
   }
}
