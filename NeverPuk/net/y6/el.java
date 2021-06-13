package net.y6;

import net.y6.jb;

public class el extends net.y6.z {
   public jb Y;

   public el() {
      this(0, 35, 64, 64);
   }

   public el(int var1, int var2, int var3, int var4) {
      this.f = var3;
      this.C = var4;
      this.Y = new jb(this, var1, var2);
      this.Y.d(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
      this.Y.n(0.0F, 0.0F, 0.0F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      this.Y.B(var7);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      super.p(var1, var2, var3, var4, var5, var6, var7);
      this.Y.N = var4 * 0.017453292F;
      this.Y.b = var5 * 0.017453292F;
   }
}
