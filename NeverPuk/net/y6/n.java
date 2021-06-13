package net.y6;

import net.xn;
import net.y6.e;
import net.y6.jb;

public class n extends net.y6.z implements e {
   public jb[] L = new jb[5];
   public jb[] q = new jb[2];
   public jb g;
   private final int K = net.y.m.X(1);

   public n() {
      this.L[0] = (new jb(this, 0, 0)).R(128, 64);
      this.L[1] = (new jb(this, 0, 19)).R(128, 64);
      this.L[2] = (new jb(this, 0, 27)).R(128, 64);
      this.L[3] = (new jb(this, 0, 35)).R(128, 64);
      this.L[4] = (new jb(this, 0, 43)).R(128, 64);
      boolean var10000 = true;
      var10000 = true;
      var10000 = true;
      var10000 = true;
      var10000 = true;
      this.L[0].d(-14.0F, -9.0F, -3.0F, 28, 16, 3, 0.0F);
      this.L[0].n(0.0F, 3.0F, 1.0F);
      this.L[1].d(-13.0F, -7.0F, -1.0F, 18, 6, 2, 0.0F);
      this.L[1].n(-15.0F, 4.0F, 4.0F);
      this.L[2].d(-8.0F, -7.0F, -1.0F, 16, 6, 2, 0.0F);
      this.L[2].n(15.0F, 4.0F, 0.0F);
      this.L[3].d(-14.0F, -7.0F, -1.0F, 28, 6, 2, 0.0F);
      this.L[3].n(0.0F, 4.0F, -9.0F);
      this.L[4].d(-14.0F, -7.0F, -1.0F, 28, 6, 2, 0.0F);
      this.L[4].n(0.0F, 4.0F, 9.0F);
      this.L[0].b = 1.5707964F;
      this.L[1].N = 4.712389F;
      this.L[2].N = 1.5707964F;
      this.L[3].N = 3.1415927F;
      this.q[0] = this.Y(true);
      this.q[0].n(3.0F, -5.0F, 9.0F);
      this.q[1] = this.Y(false);
      this.q[1].n(3.0F, -5.0F, -9.0F);
      this.q[1].N = 3.1415927F;
      this.q[0].c = 0.19634955F;
      this.q[1].c = 0.19634955F;
      this.g = (new jb(this, 0, 0)).R(128, 64);
      this.g.d(-14.0F, -9.0F, -3.0F, 28, 16, 3, 0.0F);
      this.g.n(0.0F, -3.0F, 1.0F);
      this.g.b = 1.5707964F;
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      net.y6.z.C();
      net.y.d.P(90.0F, 0.0F, 1.0F, 0.0F);
      net.nm.b var9 = (net.nm.b)var1;
      this.p(var2, var3, var4, var5, var6, var7, var1);
      int var10 = 0;
      this.L[var10].B(var7);
      ++var10;
      this.V(var9, 0, var7, var2);
      this.V(var9, 1, var7, var2);
   }

   public void B(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      net.y.d.P(90.0F, 0.0F, 1.0F, 0.0F);
      net.y.d.q(false, false, false, false);
      this.g.B(var7);
      net.y.d.q(true, true, true, true);
   }

   protected jb Y(boolean var1) {
      boolean var2 = net.y6.z.W();
      jb var3 = (new jb(this, 62, 0)).R(128, 64);
      boolean var10000 = true;
      var10000 = true;
      var10000 = true;
      float var10 = -5.0F;
      var3.U(-1.0F, 0.0F, -5.0F, 2, 2, 18);
      var3.U(-1.001F, -3.0F, 8.0F, 1, 6, 7);
      return var3;
   }

   protected void V(net.nm.b var1, int var2, float var3, float var4) {
      float var6 = var1.r(var2, var4);
      jb var7 = this.q[var2];
      net.y6.z.W();
      var7.b = (float)net.u.t.z(-1.0471975803375244D, -0.2617993950843811D, (double)((net.u.t.A(-var6) + 1.0F) / 2.0F));
      var7.N = (float)net.u.t.z(-0.7853981633974483D, 0.7853981633974483D, (double)((net.u.t.A(-var6 + 1.0F) + 1.0F) / 2.0F));
      if(var2 == 1) {
         var7.N = 3.1415927F - var7.N;
      }

      var7.B(var3);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
