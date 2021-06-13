package net;

import java.util.ArrayList;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zg;
import net.n2.k;
import net.yn.w;

public class v7 extends mk {
   public v7() {
      super("NoFall", or.Player);
      ArrayList var1 = new ArrayList();
      var1.add("Vanilla");
      var1.add("Matrix");
      gn.Q.J.d(new mc("NoFall Mode", this, "Vanilla", var1));
   }

   @mr
   public void w(zg var1) {
      int[] var2 = w.I();
      if(p.sf != null && p.s8 != null) {
         String var3 = gn.Q.J.S("NoFall Mode").M();
         this.t(var3);
         if(var3.equalsIgnoreCase("Vanilla")) {
            if(p.sf.hI <= 2.0F) {
               return;
            }

            p.sf.x3.L((k)(new net.m.qo(true)));
         }

         if(var3.equalsIgnoreCase("Matrix") && p.sf.hI >= 4.0F) {
            var1.B(p.sf.x % 2 != 0);
            p.sf.hI = 0.0F;
         }

      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
