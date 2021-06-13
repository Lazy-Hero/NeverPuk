package net.h;

import net.xn;
import net.h.d;
import net.h.l;
import net.h.w;
import net.yz.p;

public class q extends w {
   private final net.nk.z m;

   public q(net.nk.z var1) {
      super(net.nb.l.Cs, p.HOSTILE);
      this.m = var1;
      this.Z = d.x.NONE;
      this.B = true;
      this.y = 0;
   }

   public void m() {
      String[] var1 = l.l();
      if(!this.m.Z && this.m.Oe()) {
         this.g = (float)this.m.b;
         this.C = (float)this.m.hS;
         this.t = (float)this.m.hr;
         float var2 = this.m.a(0.0F);
         this.e = 0.0F + 1.0F * var2 * var2;
         this.J = 0.7F + 0.5F * var2;
      }

      this.r = true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
