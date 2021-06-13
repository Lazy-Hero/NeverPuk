package net.y6;

import net.y6.jb;

public class h extends net.y6.z {
   public jb S = (new jb(this)).k(0, 0).U(-6.0F, -5.0F, 0.0F, 6, 10, 0);
   public jb r = (new jb(this)).k(16, 0).U(0.0F, -5.0F, 0.0F, 6, 10, 0);
   public jb R = (new jb(this)).k(0, 10).U(0.0F, -4.0F, -0.99F, 5, 8, 1);
   public jb P = (new jb(this)).k(12, 10).U(0.0F, -4.0F, -0.01F, 5, 8, 1);
   public jb e = (new jb(this)).k(24, 10).U(0.0F, -4.0F, 0.0F, 5, 8, 0);
   public jb N = (new jb(this)).k(24, 10).U(0.0F, -4.0F, 0.0F, 5, 8, 0);
   public jb K = (new jb(this)).k(12, 0).U(-1.0F, -5.0F, 0.0F, 2, 10, 0);

   public h() {
      this.S.n(0.0F, 0.0F, -1.0F);
      this.r.n(0.0F, 0.0F, 1.0F);
      this.K.N = 1.5707964F;
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      this.S.B(var7);
      this.r.B(var7);
      this.K.B(var7);
      this.R.B(var7);
      this.P.B(var7);
      this.e.B(var7);
      this.N.B(var7);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      float var8 = (net.u.t.A(var1 * 0.02F) * 0.1F + 1.25F) * var4;
      this.S.N = 3.1415927F + var8;
      this.r.N = -var8;
      this.R.N = var8;
      this.P.N = -var8;
      this.e.N = var8 - var8 * 2.0F * var2;
      this.N.N = var8 - var8 * 2.0F * var3;
      this.R.l = net.u.t.A(var8);
      this.P.l = net.u.t.A(var8);
      this.e.l = net.u.t.A(var8);
      this.N.l = net.u.t.A(var8);
   }
}
