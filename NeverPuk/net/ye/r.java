package net.ye;

import net.xn;
import net.nk.f0;
import net.y0.dz;
import net.y6.eh;
import net.ye.p;
import net.ye.wr;

public class r implements wr {
   private final dz W;
   private final net.y6.z B = new eh(0);

   public r(dz var1) {
      this.W = var1;
   }

   public void o(f0 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = p.j();
      if(!var1.e()) {
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         net.y.d.Q();
         net.y.d.C();
         net.y.d.m(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA);
         this.B.q(this.W.v());
         this.B.V(var1, var2, var3, var5, var6, var7, var8);
         net.y.d.E();
         net.y.d.h();
      }

   }

   public boolean y() {
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
