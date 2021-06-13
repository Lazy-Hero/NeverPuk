package net.h;

import net.xn;
import net.h.d;
import net.h.l;
import net.h.w;
import net.u.t;
import net.yz.p;

public class r extends w {
   private final net.r.r Q;
   private final net.nm.w G;

   public r(net.r.r var1, net.nm.w var2) {
      super(net.nb.l.DR, p.NEUTRAL);
      this.Q = var1;
      this.G = var2;
      this.Z = d.x.NONE;
      this.B = true;
      this.y = 0;
   }

   public void m() {
      String[] var1 = l.l();
      if(!this.G.Z && this.Q.M() && this.Q.D() == this.G) {
         float var2 = t.R(this.G.hf * this.G.hf + this.G.J * this.G.J);
         if((double)var2 >= 0.01D) {
            this.e = 0.0F + t.T(var2, 0.0F, 1.0F) * 0.75F;
         }

         this.e = 0.0F;
      }

      this.r = true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
