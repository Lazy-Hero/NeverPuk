package net.y6;

import net.y6.jb;

public class ee extends net.y6.z {
   public jb W;
   public jb I;
   public jb B;
   public jb y;
   public jb k;
   public jb U;
   public jb h;
   public jb d;
   public jb J;
   public jb O;
   public jb m;

   public ee() {
      float var10000 = 0.0F;
      boolean var3 = true;
      this.W = new jb(this, 32, 4);
      this.W.d(-4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F);
      this.W.n(0.0F, 15.0F, -3.0F);
      this.I = new jb(this, 0, 0);
      this.I.d(-3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
      this.I.n(0.0F, 15.0F, 0.0F);
      this.B = new jb(this, 0, 12);
      this.B.d(-5.0F, -4.0F, -6.0F, 10, 8, 12, 0.0F);
      this.B.n(0.0F, 15.0F, 9.0F);
      this.y = new jb(this, 18, 0);
      this.y.d(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
      this.y.n(-4.0F, 15.0F, 2.0F);
      this.k = new jb(this, 18, 0);
      this.k.d(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
      this.k.n(4.0F, 15.0F, 2.0F);
      this.U = new jb(this, 18, 0);
      this.U.d(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
      this.U.n(-4.0F, 15.0F, 1.0F);
      this.h = new jb(this, 18, 0);
      this.h.d(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
      this.h.n(4.0F, 15.0F, 1.0F);
      this.d = new jb(this, 18, 0);
      this.d.d(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
      this.d.n(-4.0F, 15.0F, 0.0F);
      this.J = new jb(this, 18, 0);
      this.J.d(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
      this.J.n(4.0F, 15.0F, 0.0F);
      this.O = new jb(this, 18, 0);
      this.O.d(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
      this.O.n(-4.0F, 15.0F, -1.0F);
      this.m = new jb(this, 18, 0);
      this.m.d(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
      this.m.n(4.0F, 15.0F, -1.0F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      this.W.B(var7);
      this.I.B(var7);
      this.B.B(var7);
      this.y.B(var7);
      this.k.B(var7);
      this.U.B(var7);
      this.h.B(var7);
      this.d.B(var7);
      this.J.B(var7);
      this.O.B(var7);
      this.m.B(var7);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      this.W.N = var4 * 0.017453292F;
      this.W.b = var5 * 0.017453292F;
      float var10000 = 0.7853982F;
      this.y.c = -0.7853982F;
      this.k.c = 0.7853982F;
      this.U.c = -0.58119464F;
      this.h.c = 0.58119464F;
      this.d.c = -0.58119464F;
      this.J.c = 0.58119464F;
      this.O.c = -0.7853982F;
      this.m.c = 0.7853982F;
      var10000 = -0.0F;
      var10000 = 0.3926991F;
      this.y.N = 0.7853982F;
      this.k.N = -0.7853982F;
      this.U.N = 0.3926991F;
      this.h.N = -0.3926991F;
      this.d.N = -0.3926991F;
      this.J.N = 0.3926991F;
      this.O.N = -0.7853982F;
      this.m.N = 0.7853982F;
      float var11 = -(net.u.t.m(var1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * var2;
      float var12 = -(net.u.t.m(var1 * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * var2;
      float var13 = -(net.u.t.m(var1 * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * var2;
      float var14 = -(net.u.t.m(var1 * 0.6662F * 2.0F + 4.712389F) * 0.4F) * var2;
      float var15 = Math.abs(net.u.t.A(var1 * 0.6662F + 0.0F) * 0.4F) * var2;
      float var16 = Math.abs(net.u.t.A(var1 * 0.6662F + 3.1415927F) * 0.4F) * var2;
      float var17 = Math.abs(net.u.t.A(var1 * 0.6662F + 1.5707964F) * 0.4F) * var2;
      float var18 = Math.abs(net.u.t.A(var1 * 0.6662F + 4.712389F) * 0.4F) * var2;
      this.y.N += var11;
      this.k.N += -var11;
      this.U.N += var12;
      this.h.N += -var12;
      this.d.N += var13;
      this.J.N += -var13;
      this.O.N += var14;
      this.m.N += -var14;
      this.y.c += var15;
      this.k.c += -var15;
      this.U.c += var16;
      this.h.c += -var16;
      this.d.c += var17;
      this.J.c += -var17;
      this.O.c += var18;
      this.m.c += -var18;
   }
}
