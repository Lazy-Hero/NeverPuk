package net;

import net._6;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zg;

public class s6 extends mk {
   public static mc t;
   _6 o = new _6();

   public s6() {
      super("WallClimb", or.Movement);
      gn.Q.J.d(t = new mc("Climb Ticks", this, 1.0D, 0.5D, 5.0D, 0.5D));
   }

   @mr
   public void N(zg var1) {
      mk.Y();
      this.t("" + t.e());
      if(p.sf.FD() && p.sf.t && this.o.Z((double)(t.e() * 100.0F))) {
         var1.B(true);
         p.sf.k = true;
         p.sf.Z();
         this.o.B();
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
