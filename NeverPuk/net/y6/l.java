package net.y6;

import net.y6.jb;

public class l extends net.y6.z {
   public jb L;
   public jb S;
   public jb J;
   public jb R;
   public jb M;
   public jb m;
   public jb E;

   public l() {
      this(0.0F);
   }

   public l(float var1) {
      boolean var10000 = true;
      this.L = new jb(this, 0, 0);
      this.L.d(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.L.n(0.0F, 6.0F, 0.0F);
      this.S = new jb(this, 32, 0);
      this.S.d(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.S.n(0.0F, 6.0F, 0.0F);
      this.J = new jb(this, 16, 16);
      this.J.d(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.J.n(0.0F, 6.0F, 0.0F);
      this.R = new jb(this, 0, 16);
      this.R.d(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.R.n(-2.0F, 18.0F, 4.0F);
      this.M = new jb(this, 0, 16);
      this.M.d(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.M.n(2.0F, 18.0F, 4.0F);
      this.m = new jb(this, 0, 16);
      this.m.d(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.m.n(-2.0F, 18.0F, -4.0F);
      this.E = new jb(this, 0, 16);
      this.E.d(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.E.n(2.0F, 18.0F, -4.0F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      this.L.B(var7);
      this.J.B(var7);
      this.R.B(var7);
      this.M.B(var7);
      this.m.B(var7);
      this.E.B(var7);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      this.L.N = var4 * 0.017453292F;
      this.L.b = var5 * 0.017453292F;
      this.R.b = net.u.t.m(var1 * 0.6662F) * 1.4F * var2;
      this.M.b = net.u.t.m(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.m.b = net.u.t.m(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.E.b = net.u.t.m(var1 * 0.6662F) * 1.4F * var2;
   }
}
