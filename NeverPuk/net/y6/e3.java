package net.y6;

import net.xn;
import net.y6.jb;
import net.yz.aa;

public class e3 extends net.y6.z {
   public jb B;
   public jb E;
   public jb X;
   public jb D;
   public jb y;
   public jb G;
   public jb A;
   public jb N;
   public jb J;

   public e3(float var1, float var2, int var3, int var4) {
      this.B = (new jb(this)).R(var3, var4);
      this.B.n(0.0F, 0.0F + var2, 0.0F);
      this.B.k(0, 0).d(-4.0F, -10.0F, -4.0F, 8, 10, 8, var1);
      this.E = (new jb(this, 32, 0)).R(var3, var4);
      this.E.d(-4.0F, -10.0F, -4.0F, 8, 12, 8, var1 + 0.45F);
      this.B.s(this.E);
      this.E.B = false;
      this.A = (new jb(this)).R(var3, var4);
      this.A.n(0.0F, var2 - 2.0F, 0.0F);
      this.A.k(24, 0).d(-1.0F, -1.0F, -6.0F, 2, 4, 2, var1);
      this.B.s(this.A);
      this.X = (new jb(this)).R(var3, var4);
      this.X.n(0.0F, 0.0F + var2, 0.0F);
      this.X.k(16, 20).d(-4.0F, 0.0F, -3.0F, 8, 12, 6, var1);
      this.X.k(0, 38).d(-4.0F, 0.0F, -3.0F, 8, 18, 6, var1 + 0.5F);
      this.D = (new jb(this)).R(var3, var4);
      this.D.n(0.0F, 0.0F + var2 + 2.0F, 0.0F);
      this.D.k(44, 22).d(-8.0F, -2.0F, -2.0F, 4, 8, 4, var1);
      jb var5 = (new jb(this, 44, 22)).R(var3, var4);
      var5.x = true;
      var5.d(4.0F, -2.0F, -2.0F, 4, 8, 4, var1);
      this.D.s(var5);
      this.D.k(40, 38).d(-4.0F, 2.0F, -2.0F, 8, 4, 4, var1);
      this.y = (new jb(this, 0, 22)).R(var3, var4);
      this.y.n(-2.0F, 12.0F + var2, 0.0F);
      this.y.d(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.G = (new jb(this, 0, 22)).R(var3, var4);
      this.G.x = true;
      this.G.n(2.0F, 12.0F + var2, 0.0F);
      this.G.d(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.N = (new jb(this, 40, 46)).R(var3, var4);
      this.N.d(-3.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.N.n(-5.0F, 2.0F + var2, 0.0F);
      this.J = (new jb(this, 40, 46)).R(var3, var4);
      this.J.x = true;
      this.J.d(-1.0F, -2.0F, -2.0F, 4, 12, 4, var1);
      this.J.n(5.0F, 2.0F + var2, 0.0F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      this.B.B(var7);
      this.X.B(var7);
      this.y.B(var7);
      this.G.B(var7);
      net.nk.r var8 = (net.nk.r)var1;
      if(var8.y() == net.nk.r.CROSSED) {
         this.D.B(var7);
      } else {
         this.N.B(var7);
         this.J.B(var7);
      }

   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      this.B.N = var4 * 0.017453292F;
      this.B.b = var5 * 0.017453292F;
      net.y6.z.W();
      this.D.I = 3.0F;
      this.D.h = -1.0F;
      this.D.b = -0.75F;
      this.y.b = net.u.t.m(var1 * 0.6662F) * 1.4F * var2 * 0.5F;
      this.G.b = net.u.t.m(var1 * 0.6662F + 3.1415927F) * 1.4F * var2 * 0.5F;
      this.y.N = 0.0F;
      this.G.N = 0.0F;
      net.nk.r var9 = ((net.nk.r)var7).y();
      if(var9 == net.nk.r.ATTACKING) {
         float var10 = net.u.t.A(this.v * 3.1415927F);
         float var11 = net.u.t.A((1.0F - (1.0F - this.v) * (1.0F - this.v)) * 3.1415927F);
         this.N.c = 0.0F;
         this.J.c = 0.0F;
         this.N.N = 0.15707964F;
         this.J.N = -0.15707964F;
         if(((net.ne.a)var7).a() == aa.RIGHT) {
            this.N.b = -1.8849558F + net.u.t.m(var3 * 0.09F) * 0.15F;
            this.J.b = -0.0F + net.u.t.m(var3 * 0.19F) * 0.5F;
            this.N.b += var10 * 2.2F - var11 * 0.4F;
            this.J.b += var10 * 1.2F - var11 * 0.4F;
         }

         this.N.b = -0.0F + net.u.t.m(var3 * 0.19F) * 0.5F;
         this.J.b = -1.8849558F + net.u.t.m(var3 * 0.09F) * 0.15F;
         this.N.b += var10 * 1.2F - var11 * 0.4F;
         this.J.b += var10 * 2.2F - var11 * 0.4F;
         this.N.c += net.u.t.m(var3 * 0.09F) * 0.05F + 0.05F;
         this.J.c -= net.u.t.m(var3 * 0.09F) * 0.05F + 0.05F;
         this.N.b += net.u.t.A(var3 * 0.067F) * 0.05F;
         this.J.b -= net.u.t.A(var3 * 0.067F) * 0.05F;
      }

      if(var9 == net.nk.r.SPELLCASTING) {
         this.N.h = 0.0F;
         this.N.l = -5.0F;
         this.J.h = 0.0F;
         this.J.l = 5.0F;
         this.N.b = net.u.t.m(var3 * 0.6662F) * 0.25F;
         this.J.b = net.u.t.m(var3 * 0.6662F) * 0.25F;
         this.N.c = 2.3561945F;
         this.J.c = -2.3561945F;
         this.N.N = 0.0F;
         this.J.N = 0.0F;
      }

      if(var9 == net.nk.r.BOW_AND_ARROW) {
         this.N.N = -0.1F + this.B.N;
         this.N.b = -1.5707964F + this.B.b;
         this.J.b = -0.9424779F + this.B.b;
         this.J.N = this.B.N - 0.4F;
         this.J.c = 1.5707964F;
      }

   }

   public jb V(aa var1) {
      return var1 == aa.LEFT?this.J:this.N;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
