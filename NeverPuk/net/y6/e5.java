package net.y6;

import net.y6.ey;
import net.y6.jb;

public class e5 extends ey {
   private float Z;

   public e5() {
      super(12, 0.0F);
      this.H = new jb(this, 0, 0);
      this.H.d(-3.0F, -4.0F, -4.0F, 6, 6, 6, 0.6F);
      this.H.n(0.0F, 6.0F, -8.0F);
      this.h = new jb(this, 28, 8);
      this.h.d(-4.0F, -10.0F, -7.0F, 8, 16, 6, 1.75F);
      this.h.n(0.0F, 5.0F, 2.0F);
      float var10000 = 0.5F;
      this.r = new jb(this, 0, 16);
      this.r.d(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F);
      this.r.n(-3.0F, 12.0F, 7.0F);
      this.p = new jb(this, 0, 16);
      this.p.d(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F);
      this.p.n(3.0F, 12.0F, 7.0F);
      this.O = new jb(this, 0, 16);
      this.O.d(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F);
      this.O.n(-3.0F, 12.0F, -5.0F);
      this.a = new jb(this, 0, 16);
      this.a.d(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F);
      this.a.n(3.0F, 12.0F, -5.0F);
   }

   public void x(net.ne.a var1, float var2, float var3, float var4) {
      super.x(var1, var2, var3, var4);
      this.H.I = 6.0F + ((net.yn.b)var1).I(var4) * 9.0F;
      this.Z = ((net.yn.b)var1).c(var4);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      super.p(var1, var2, var3, var4, var5, var6, var7);
      this.H.b = this.Z;
   }
}
