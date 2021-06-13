package net;

import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zn;
import net.m.m;
import net.n0.e;
import net.n2.k;
import net.ne.j;

public class m5 extends mk {
   private final mc e;

   public m5() {
      super("FastBow", or.Combat);
      gn.Q.J.d(this.e = new mc("Bow Ticks", this, 1.5D, 1.5D, 10.0D, 0.5D));
   }

   @mr
   public void e(zn var1) {
      String var2 = j.D();
      if(p.sf.a8.r().Z() instanceof e && p.sf.F() && (float)p.sf.d() >= this.e.e()) {
         p.sf.x3.L((k)(new m(m.n.RELEASE_USE_ITEM, net.u.j.V, p.sf.V())));
         p.sf.x3.L((k)(new net.m.j(net.yz.k.MAIN_HAND)));
         p.sf.h();
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
