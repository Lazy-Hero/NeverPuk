package net.y6;

import net.y6.jb;

public class e0 extends net.y6.z {
   public jb d;
   public jb J;
   public jb a;
   public jb N;
   public jb H;

   public e0() {
      float var10000 = 4.0F;
      var10000 = 0.0F;
      this.a = (new jb(this, 0, 0)).R(64, 64);
      this.a.d(-4.0F, -8.0F, -4.0F, 8, 8, 8, -0.5F);
      this.a.n(0.0F, 4.0F, 0.0F);
      this.N = (new jb(this, 32, 0)).R(64, 64);
      this.N.d(-1.0F, 0.0F, -1.0F, 12, 2, 2, -0.5F);
      this.N.n(0.0F, 6.0F, 0.0F);
      this.H = (new jb(this, 32, 0)).R(64, 64);
      this.H.d(-1.0F, 0.0F, -1.0F, 12, 2, 2, -0.5F);
      this.H.n(0.0F, 6.0F, 0.0F);
      this.d = (new jb(this, 0, 16)).R(64, 64);
      this.d.d(-5.0F, -10.0F, -5.0F, 10, 10, 10, -0.5F);
      this.d.n(0.0F, 13.0F, 0.0F);
      this.J = (new jb(this, 0, 36)).R(64, 64);
      this.J.d(-6.0F, -12.0F, -6.0F, 12, 12, 12, -0.5F);
      this.J.n(0.0F, 24.0F, 0.0F);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      super.p(var1, var2, var3, var4, var5, var6, var7);
      this.a.N = var4 * 0.017453292F;
      this.a.b = var5 * 0.017453292F;
      this.d.N = var4 * 0.017453292F * 0.25F;
      float var8 = net.u.t.A(this.d.N);
      float var9 = net.u.t.m(this.d.N);
      this.N.c = 1.0F;
      this.H.c = -1.0F;
      this.N.N = 0.0F + this.d.N;
      this.H.N = 3.1415927F + this.d.N;
      this.N.l = var9 * 5.0F;
      this.N.h = -var8 * 5.0F;
      this.H.l = -var9 * 5.0F;
      this.H.h = var8 * 5.0F;
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      this.d.B(var7);
      this.J.B(var7);
      this.a.B(var7);
      this.N.B(var7);
      this.H.B(var7);
   }
}
