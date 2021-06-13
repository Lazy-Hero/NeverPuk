package net.n0;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.yt;

public class yy extends yt {
   public yy(int var1, float var2) {
      super(var1, var2, false);
   }

   public ks V(ks var1, net.yv.r var2, net.ne.a var3) {
      kw.b();
      ks var5 = super.V(var1, var2, var3);
      if(!var2.x) {
         double var6 = var3.b;
         double var8 = var3.hS;
         double var10 = var3.hr;
         int var12 = 0;
         double var13 = var3.b + (var3.Q().nextDouble() - 0.5D) * 16.0D;
         double var15 = net.u.t.F(var3.hS + (double)(var3.Q().nextInt(16) - 8), 0.0D, (double)(var2.d() - 1));
         double var17 = var3.hr + (var3.Q().nextDouble() - 0.5D) * 16.0D;
         if(var3.M()) {
            var3.O();
         }

         if(var3.W(var13, var15, var17)) {
            var2.L((net.r.r)null, var6, var8, var10, net.nb.l.wD, net.yz.p.PLAYERS, 1.0F, 1.0F);
            var3.I(net.nb.l.wD, 1.0F, 1.0F);
         }

         ++var12;
         if(var3 instanceof net.r.r) {
            ((net.r.r)var3).H().V(this, 20);
         }
      }

      return var5;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
