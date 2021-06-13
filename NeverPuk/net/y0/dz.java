package net.y0;

import net.nk.f0;
import net.y0.d;
import net.y0.l;
import net.y6.eh;
import net.yz.m_;

public class dz extends l {
   private static final m_ X = new m_("textures/entity/slime/slime.png");

   public dz(d var1) {
      super(var1, new eh(16), 0.25F);
      this.k(new net.ye.r(this));
   }

   public void L(f0 var1, double var2, double var4, double var6, float var8, float var9) {
      this.W = 0.25F * (float)var1.A();
      super.C(var1, var2, var4, var6, var8, var9);
   }

   protected void F(f0 var1, float var2) {
      float var10000 = 0.999F;
      net.y.d.W(0.999F, 0.999F, 0.999F);
      float var4 = (float)var1.A();
      float var5 = (var1.ur + (var1.uK - var1.ur) * var2) / (var4 * 0.5F + 1.0F);
      float var6 = 1.0F / (var5 + 1.0F);
      net.y.d.W(var6 * var4, 1.0F / var6 * var4, var6 * var4);
   }

   protected m_ g(f0 var1) {
      return X;
   }
}
