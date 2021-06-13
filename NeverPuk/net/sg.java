package net;

import net.gn;
import net.mc;
import net.mk;
import net.or;

public class sg extends mk {
   public static mc r;
   public static mc L;

   public sg() {
      super("ClickGui", or.Hud);
      gn.Q.J.d(r = new mc("Particles", this, true));
      gn.Q.J.d(L = new mc("ScrollInversion", this, true));
      this.z(54);
   }

   public void c() {
      super.c();
      p.s(gn.Q.Z);
      this.g();
   }
}
