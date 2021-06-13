package net.n0;

import net.xn;
import net.n0.ks;
import net.n0.kt;
import net.n0.kw;
import net.n0.yt;

public class ys extends yt {
   public ys(int var1, float var2, boolean var3) {
      super(var1, var2, var3);
      this.z(true);
   }

   public boolean F(ks var1) {
      return super.F(var1) || var1.n() > 0;
   }

   public kt B(ks var1) {
      return var1.n() == 0?kt.RARE:kt.EPIC;
   }

   protected void u(ks var1, net.yv.r var2, net.r.r var3) {
      int[] var4 = kw.b();
      if(!var2.x) {
         if(var1.n() > 0) {
            var3.o((net.n_.i)(new net.n_.i(net.nb.b.n, 400, 1)));
            var3.o((net.n_.i)(new net.n_.i(net.nb.b.D, 6000, 0)));
            var3.o((net.n_.i)(new net.n_.i(net.nb.b.t, 6000, 0)));
            var3.o((net.n_.i)(new net.n_.i(net.nb.b.H, 2400, 3)));
         }

         var3.o((net.n_.i)(new net.n_.i(net.nb.b.n, 100, 1)));
         var3.o((net.n_.i)(new net.n_.i(net.nb.b.H, 2400, 0)));
      }

   }

   public void M(net.ys.r var1, net.yz.w var2) {
      int[] var3 = kw.b();
      if(this.a(var1)) {
         var2.add(new ks(this));
         var2.add(new ks(this, 1, 1));
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
