package net.y6;

import net.y6.el;
import net.y6.jb;

public class ec extends el {
   private final jb h = new jb(this, 32, 0);

   public ec() {
      super(0, 0, 64, 64);
      this.h.d(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F);
      this.h.n(0.0F, 0.0F, 0.0F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.V(var1, var2, var3, var4, var5, var6, var7);
      this.h.B(var7);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      super.p(var1, var2, var3, var4, var5, var6, var7);
      this.h.N = this.Y.N;
      this.h.b = this.Y.b;
   }
}
