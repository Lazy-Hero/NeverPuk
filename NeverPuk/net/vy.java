package net;

import net._e;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.nb.j;
import net.y.d;

public class vy extends mk {
   public mc b;
   public mc w;

   public vy() {
      super("Scoreboard", or.Visuals);
      gn.Q.J.d(new mc("NoScoreBoard", this, false));
      gn.Q.J.d(this.b = new mc("Scoreboard X", this, 0.0D, -1000.0D, 1000.0D, 1.0D));
      gn.Q.J.d(this.w = new mc("Scoreboard Y", this, 0.0D, -500.0D, 500.0D, 1.0D));
   }

   @mr
   public void b(_e var1) {
      int var2 = j.V();
      if(var1.u()) {
         d.J(-this.b.p(), this.w.p(), 1.0D);
      }

      d.J(this.b.p(), -this.w.p(), 1.0D);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
