package net.y9;

import java.util.Random;
import net.y9.l;

public class gj extends l {
   protected gj() {
      super(net.y1.l.H, net.y1.h.z);
      this.f(net.ys.r.M);
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.k;
   }

   public int T(Random var1) {
      return 3 + var1.nextInt(5);
   }

   public int q(int var1, Random var2) {
      return Math.min(9, this.T(var2) + var2.nextInt(1 + var1));
   }
}
