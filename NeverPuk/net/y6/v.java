package net.y6;

import net.xn;
import net.nk.fu;
import net.y6.jb;
import net.y6.t;

public class v extends t {
   public v() {
      this(0.0F, 0.0F, false);
   }

   public v(float var1, float var2, boolean var3) {
      boolean var4 = net.y6.z.C();
      super(var1, 0.0F, 64, 32);
      this.G = new jb(this, 0, 0);
      this.G.d(-4.0F, -10.0F, -4.0F, 8, 8, 8, var1);
      this.G.n(0.0F, 0.0F + var2, 0.0F);
      this.N = new jb(this, 16, 16);
      this.N.n(0.0F, 0.0F + var2, 0.0F);
      this.N.d(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1 + 0.1F);
      this.H = new jb(this, 0, 16);
      this.H.n(-2.0F, 12.0F + var2, 0.0F);
      this.H.d(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1 + 0.1F);
      this.a = new jb(this, 0, 16);
      this.a.x = true;
      this.a.n(2.0F, 12.0F + var2, 0.0F);
      this.a.d(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1 + 0.1F);
      this.G = new jb(this, 0, 0);
      this.G.n(0.0F, var2, 0.0F);
      this.G.k(0, 0).d(-4.0F, -10.0F, -4.0F, 8, 10, 8, var1);
      this.G.k(24, 0).d(-1.0F, -3.0F, -6.0F, 2, 4, 2, var1);
      this.N = new jb(this, 16, 20);
      this.N.n(0.0F, 0.0F + var2, 0.0F);
      this.N.d(-4.0F, 0.0F, -3.0F, 8, 12, 6, var1);
      this.N.k(0, 38).d(-4.0F, 0.0F, -3.0F, 8, 18, 6, var1 + 0.05F);
      this.A = new jb(this, 44, 38);
      this.A.d(-3.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.A.n(-5.0F, 2.0F + var2, 0.0F);
      this.B = new jb(this, 44, 38);
      this.B.x = true;
      this.B.d(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.B.n(5.0F, 2.0F + var2, 0.0F);
      this.H = new jb(this, 0, 22);
      this.H.n(-2.0F, 12.0F + var2, 0.0F);
      this.H.d(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.a = new jb(this, 0, 22);
      this.a.x = true;
      this.a.n(2.0F, 12.0F + var2, 0.0F);
      this.a.d(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      super.p(var1, var2, var3, var4, var5, var6, var7);
      fu var8 = (fu)var7;
      float var9 = net.u.t.A(this.v * 3.1415927F);
      float var10 = net.u.t.A((1.0F - (1.0F - this.v) * (1.0F - this.v)) * 3.1415927F);
      this.A.c = 0.0F;
      this.B.c = 0.0F;
      this.A.N = -(0.1F - var9 * 0.6F);
      this.B.N = 0.1F - var9 * 0.6F;
      float var11 = -3.1415927F / (var8.Ir()?1.5F:2.25F);
      this.A.b = var11;
      this.B.b = var11;
      this.A.b += var9 * 1.2F - var10 * 0.4F;
      this.B.b += var9 * 1.2F - var10 * 0.4F;
      this.A.c += net.u.t.m(var3 * 0.09F) * 0.05F + 0.05F;
      this.B.c -= net.u.t.m(var3 * 0.09F) * 0.05F + 0.05F;
      this.A.b += net.u.t.A(var3 * 0.067F) * 0.05F;
      this.B.b -= net.u.t.A(var3 * 0.067F) * 0.05F;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
