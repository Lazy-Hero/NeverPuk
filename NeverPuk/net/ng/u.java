package net.ng;

import net.xn;
import net.c0.b;
import net.c0.l;
import net.ng.i;
import net.nj.f;
import net.u.d;

public class u extends i {
   private final String[] S;

   public u(Class var1, String... var2) {
      super(var1);
      this.S = var2;
   }

   f m(l var1, f var2, int var3) {
      i.V();
      String[] var5 = this.S;
      int var6 = var5.length;
      int var7 = 0;
      if(var7 < var6) {
         String var8 = var5[var7];
         var2 = b.c(var1, var2, var3, var8);
         ++var7;
      }

      if(d.y() == null) {
         i.W(new d[3]);
      }

      return var2;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
