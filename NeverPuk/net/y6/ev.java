package net.y6;

import net.y6.jb;

public class ev extends net.y6.z {
   public jb y;

   public ev() {
      this(0, 0, 32, 32);
   }

   public ev(int var1, int var2, int var3, int var4) {
      this.f = var3;
      this.C = var4;
      this.y = new jb(this, var1, var2);
      this.y.d(-3.0F, -6.0F, -3.0F, 6, 8, 6, 0.0F);
      this.y.n(0.0F, 0.0F, 0.0F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      this.y.B(var7);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      super.p(var1, var2, var3, var4, var5, var6, var7);
      this.y.N = var4 * 0.017453292F;
      this.y.b = var5 * 0.017453292F;
   }
}
