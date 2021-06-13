package net.y6;

import net.y6.jb;

public class e2 extends net.y6.z {
   public jb S;
   public jb H;
   public jb q;
   public jb I;
   public jb L;
   public jb U;

   public e2(float var1) {
      this(var1, 0.0F, 64, 64);
   }

   public e2(float var1, float var2, int var3, int var4) {
      this.S = (new jb(this)).R(var3, var4);
      this.S.n(0.0F, 0.0F + var2, 0.0F);
      this.S.k(0, 0).d(-4.0F, -10.0F, -4.0F, 8, 10, 8, var1);
      this.U = (new jb(this)).R(var3, var4);
      this.U.n(0.0F, var2 - 2.0F, 0.0F);
      this.U.k(24, 0).d(-1.0F, -1.0F, -6.0F, 2, 4, 2, var1);
      this.S.s(this.U);
      this.H = (new jb(this)).R(var3, var4);
      this.H.n(0.0F, 0.0F + var2, 0.0F);
      this.H.k(16, 20).d(-4.0F, 0.0F, -3.0F, 8, 12, 6, var1);
      this.H.k(0, 38).d(-4.0F, 0.0F, -3.0F, 8, 18, 6, var1 + 0.5F);
      this.q = (new jb(this)).R(var3, var4);
      this.q.n(0.0F, 0.0F + var2 + 2.0F, 0.0F);
      this.q.k(44, 22).d(-8.0F, -2.0F, -2.0F, 4, 8, 4, var1);
      this.q.k(44, 22).d(4.0F, -2.0F, -2.0F, 4, 8, 4, var1);
      this.q.k(40, 38).d(-4.0F, 2.0F, -2.0F, 8, 4, 4, var1);
      this.I = (new jb(this, 0, 22)).R(var3, var4);
      this.I.n(-2.0F, 12.0F + var2, 0.0F);
      this.I.d(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.L = (new jb(this, 0, 22)).R(var3, var4);
      this.L.x = true;
      this.L.n(2.0F, 12.0F + var2, 0.0F);
      this.L.d(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      this.S.B(var7);
      this.H.B(var7);
      this.I.B(var7);
      this.L.B(var7);
      this.q.B(var7);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      this.S.N = var4 * 0.017453292F;
      this.S.b = var5 * 0.017453292F;
      this.q.I = 3.0F;
      this.q.h = -1.0F;
      this.q.b = -0.75F;
      this.I.b = net.u.t.m(var1 * 0.6662F) * 1.4F * var2 * 0.5F;
      this.L.b = net.u.t.m(var1 * 0.6662F + 3.1415927F) * 1.4F * var2 * 0.5F;
      this.I.N = 0.0F;
      this.L.N = 0.0F;
   }
}
