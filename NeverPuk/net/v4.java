package net;

import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zh;
import net.zi;
import net.zr;
import net.yn.w;

public class v4 extends mk {
   public v4() {
      super("NoClip", or.Player);
   }

   @mr
   public void r(zi var1) {
      var1.H(true);
   }

   @mr
   public void l(zr var1) {
      var1.H(true);
   }

   @mr
   public void N(zh var1) {
      int[] var2 = w.I();
      if(p.sf != null) {
         p.sf.r = true;
         p.sf.K = 0.0D;
         p.sf.k = false;
         p.sf.a6.n = false;
         if(p.T.iD.o()) {
            p.sf.K += 0.5D;
         }

         if(p.T.w0.o()) {
            p.sf.K -= 0.5D;
         }

         var1.H(true);
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
