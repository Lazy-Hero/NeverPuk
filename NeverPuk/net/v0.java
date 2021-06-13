package net;

import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zf;
import net.m.j;
import net.n0.yd;
import net.nb.l;
import net.yz.k;
import net.yz.p;
import net.z.m;

public class v0 extends mk {
   public v0() {
      super("AutoFish", or.World);
   }

   @mr
   public void g(zf var1) {
      int[] var2 = m.a();
      if(var1.w() instanceof net.no.sl) {
         net.no.sl var3 = (net.no.sl)var1.w();
         if(var3.x() == p.NEUTRAL && var3.U() == l.MZ && (p.sf.S().Z() instanceof yd || p.sf.L().Z() instanceof yd)) {
            p.sf.x3.L((net.n2.k)(new j(k.MAIN_HAND)));
            p.sf.N(k.MAIN_HAND);
            p.sf.x3.L((net.n2.k)(new j(k.MAIN_HAND)));
            p.sf.N(k.MAIN_HAND);
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
