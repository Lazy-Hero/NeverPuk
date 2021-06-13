package net;

import java.util.ArrayList;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zg;
import net.m.m;
import net.n2.k;
import net.u.d;
import net.u.e;
import net.u.j;
import net.yz.aq;

public class s0 extends mk {
   public s0() {
      super("FastUse", or.Player);
      ArrayList var1 = new ArrayList();
      var1.add("Vanilla");
      gn.Q.J.d(new mc("FastUse Mode", this, "Vanilla", var1));
   }

   @mr
   public void z(zg var1) {
      String var3 = gn.Q.J.S("FastUse Mode").M();
      e.T();
      this.t(var3);
      if(var3.equalsIgnoreCase("Vanilla") && p.sf.P() == 16 && (p.sf.l() || p.sf.HP())) {
         int var4 = 0;
         p.sf.x3.L((k)(new net.m.qo(true)));
         ++var4;
         p.sf.x3.L((k)(new m(m.n.RELEASE_USE_ITEM, j.V, aq.DOWN)));
      }

      if(d.y() == null) {
         e.P(new d[5]);
      }

   }

   public void H() {
      p.s9.E = 1.0F;
      super.H();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
