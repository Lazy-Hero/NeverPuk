package net.y0;

import java.util.Random;
import net.xn;
import net.y0.c;
import net.y0.d;
import net.y0.l;
import net.ye.w3;
import net.yz.m_;

public class ds extends l {
   private static final m_ j = new m_("textures/entity/enderman/enderman.png");
   private final Random B = new Random();

   public ds(d var1) {
      super(var1, new net.y6.c(0.0F), 0.5F);
      this.k(new net.ye.n(this));
      this.k(new w3(this));
   }

   public net.y6.c r() {
      return (net.y6.c)super.v();
   }

   public void L(net.nk.u var1, double var2, double var4, double var6, float var8, float var9) {
      c.C();
      net.yw.n var11 = var1.S();
      net.y6.c var12 = this.r();
      var12.S = true;
      var12.u = var1.xp();
      if(var1.xp()) {
         double var10000 = 0.02D;
         var2 += this.B.nextGaussian() * 0.02D;
         var6 += this.B.nextGaussian() * 0.02D;
      }

      super.C(var1, var2, var4, var6, var8, var9);
   }

   protected m_ y(net.nk.u var1) {
      return j;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
