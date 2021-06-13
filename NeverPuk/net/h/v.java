package net.h;

import net.xn;
import net.h.l;
import net.h.w;
import net.u.t;
import net.yz.p;

public class v extends w {
   private final net.nm.w i;
   private float j = 0.0F;

   public v(net.nm.w var1) {
      super(net.nb.l.wI, p.NEUTRAL);
      this.i = var1;
      this.B = true;
      this.y = 0;
   }

   public void m() {
      String[] var1 = l.l();
      if(this.i.Z) {
         this.r = true;
      }

      this.g = (float)this.i.b;
      this.C = (float)this.i.hS;
      this.t = (float)this.i.hr;
      float var2 = t.R(this.i.hf * this.i.hf + this.i.J * this.i.J);
      if((double)var2 >= 0.01D) {
         this.j = t.T(this.j + 0.0025F, 0.0F, 1.0F);
         this.e = 0.0F + t.T(var2, 0.0F, 0.5F) * 0.7F;
      }

      this.j = 0.0F;
      this.e = 0.0F;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
