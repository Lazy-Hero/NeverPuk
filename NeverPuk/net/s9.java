package net;

import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zn;

public class s9 extends mk {
   public s9() {
      super("Timer", or.Movement);
      gn.Q.J.d(new mc("Timer", this, 1.0D, 0.1D, 10.0D, 0.1D));
   }

   @mr
   public void Z(zn var1) {
      String[] var2 = mk.Y();
      if(this.v()) {
         this.t("" + gn.Q.J.S("Timer").e());
         p.s9.E = gn.Q.J.S("Timer").e();
      }
   }

   public void H() {
      super.H();
      p.s9.E = 1.0F;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
