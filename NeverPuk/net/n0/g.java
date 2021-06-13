package net.n0;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.ad;
import net.yz.am;

public class g extends y {
   private final net.nm.b N;

   public g(net.nm.b var1) {
      this.N = var1;
      this.S = 1;
      this.M(net.ys.r.Y);
      this.e("boat." + var1.P());
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      ks var5 = var2.o((net.yz.k)var3);
      kw.b();
      float var10001 = 1.0F;
      float var7 = var2.d + (var2.V - var2.d) * 1.0F;
      float var8 = var2.hq + (var2.hN - var2.hq) * 1.0F;
      double var9 = var2.h + (var2.b - var2.h) * 1.0D;
      double var11 = var2.h6 + (var2.hS - var2.h6) * 1.0D + (double)var2.A();
      double var13 = var2.l + (var2.hr - var2.l) * 1.0D;
      net.u.r var15 = new net.u.r(var9, var11, var13);
      float var16 = net.u.t.m(-var8 * 0.017453292F - 3.1415927F);
      float var17 = net.u.t.A(-var8 * 0.017453292F - 3.1415927F);
      float var18 = -net.u.t.m(-var7 * 0.017453292F);
      float var19 = net.u.t.A(-var7 * 0.017453292F);
      float var20 = var17 * var18;
      float var21 = var16 * var18;
      double var10000 = 5.0D;
      net.u.r var24 = var15.s((double)var20 * 5.0D, (double)var19 * 5.0D, (double)var21 * 5.0D);
      net.u.m var25 = var1.v(var15, var24, true);
      return new am(ad.PASS, var5);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
