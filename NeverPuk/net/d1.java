package net;

import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zq;

public class d1 extends mk {
   public static mc v;
   public static mc u;
   public static mc f;

   public d1() {
      super("StreamerMode", or.World);
      gn.Q.J.d(u = new mc("Name Spoof", this, true));
      gn.Q.J.d(f = new mc("Skin Spoof", this, true));
      gn.Q.J.d(v = new mc("Tab Spoof", this, true));
   }

   @mr
   public void A(zq var1) {
      if(u.Q()) {
         var1.i("Protected");
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
