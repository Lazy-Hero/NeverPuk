package net.yn;

import net.xn;
import net.yn.d;

public abstract class r extends d {
   private int gJ;

   public r(net.yv.r var1) {
      super(var1);
   }

   public boolean x(net.r.r var1) {
      net.yn.z.C();
      net.nj.f var3 = new net.nj.f();
      var3.b("id", this.v());
      this.G(var3);
      if(var1.z(var3)) {
         this.hl.W((net.ne.l)this);
         return true;
      } else {
         return false;
      }
   }

   public void A() {
      ++this.gJ;
      super.A();
   }

   public boolean BW() {
      int var1 = net.yn.z.C();
      return this.gJ > 100;
   }

   private static xn e(xn var0) {
      return var0;
   }
}
