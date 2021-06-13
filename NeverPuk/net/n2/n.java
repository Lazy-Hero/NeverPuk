package net.n2;

import net.n2.h;
import net.n2.k;
import net.n2.o;
import net.n2.u;
import net.yz.aw;

public class n {
   public static void d(final k var0, final o var1, aw var2) throws u {
      int var3 = h.X();
      if(!var2.R()) {
         var2.d(new Runnable() {
            public void run() {
               var0.k(var1);
            }
         });
         throw u.W;
      }
   }

   private static u a(u var0) {
      return var0;
   }
}
