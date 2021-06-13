package net;

import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.o0;
import net.or;
import net.xn;
import net.zn;
import net.ne.j;
import net.ne.l;

public class mx extends mk {
   public static mc x;

   public mx() {
      super("HitBox", or.Combat);
      gn.Q.J.d(x = new mc("Expand", this, 0.2D, 0.01D, 2.0D, 0.01D));
   }

   public static float z(l var0) {
      String var1 = j.D();
      return !var0.equals(p.sf) && gn.Q.j.d(mx.class).v()?x.e():0.0F;
   }

   @mr
   public void a(zn var1) {
      this.t("" + o0.T(x.e(), 1));
   }

   private static xn b(xn var0) {
      return var0;
   }
}
