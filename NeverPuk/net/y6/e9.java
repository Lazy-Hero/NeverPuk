package net.y6;

import net.y6.jb;

public class e9 extends net.y6.z {
   public jb E;

   public e9() {
      this.f = 64;
      this.C = 32;
      this.E = new jb(this);
      this.E.k(0, 0).d(-4.0F, -4.0F, -1.0F, 8, 8, 2, 0.0F);
      this.E.k(0, 10).d(-1.0F, -4.0F, -4.0F, 2, 8, 8, 0.0F);
      this.E.k(20, 0).d(-4.0F, -1.0F, -4.0F, 8, 2, 8, 0.0F);
      this.E.n(0.0F, 0.0F, 0.0F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      this.E.B(var7);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      super.p(var1, var2, var3, var4, var5, var6, var7);
      this.E.N = var4 * 0.017453292F;
      this.E.b = var5 * 0.017453292F;
   }
}
