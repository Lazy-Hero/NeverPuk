package net.y6;

import net.xn;
import net.y6.jb;

public class e8 extends net.y6.z {
   private final jb[] w;
   private final jb[] X;

   public e8(float var1) {
      this.f = 64;
      this.C = 64;
      this.w = new jb[3];
      this.w[0] = new jb(this, 0, 16);
      this.w[0].d(-10.0F, 3.9F, -0.5F, 20, 3, 3, var1);
      this.w[1] = (new jb(this)).R(this.f, this.C);
      this.w[1].n(-2.0F, 6.9F, -0.5F);
      this.w[1].k(0, 22).d(0.0F, 0.0F, 0.0F, 3, 10, 3, var1);
      this.w[1].k(24, 22).d(-4.0F, 1.5F, 0.5F, 11, 2, 2, var1);
      this.w[1].k(24, 22).d(-4.0F, 4.0F, 0.5F, 11, 2, 2, var1);
      this.w[1].k(24, 22).d(-4.0F, 6.5F, 0.5F, 11, 2, 2, var1);
      this.w[2] = new jb(this, 12, 22);
      this.w[2].d(0.0F, 0.0F, 0.0F, 3, 6, 3, var1);
      this.X = new jb[3];
      this.X[0] = new jb(this, 0, 0);
      this.X[0].d(-4.0F, -4.0F, -4.0F, 8, 8, 8, var1);
      this.X[1] = new jb(this, 32, 0);
      this.X[1].d(-4.0F, -4.0F, -4.0F, 6, 6, 6, var1);
      this.X[1].l = -8.0F;
      this.X[1].I = 4.0F;
      this.X[2] = new jb(this, 32, 0);
      this.X[2].d(-4.0F, -4.0F, -4.0F, 6, 6, 6, var1);
      this.X[2].l = 10.0F;
      this.X[2].I = 4.0F;
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      net.y6.z.C();
      this.p(var2, var3, var4, var5, var6, var7, var1);
      jb[] var9 = this.X;
      int var10 = var9.length;
      int var11 = 0;
      if(var11 < var10) {
         jb var12 = var9[var11];
         var12.B(var7);
         ++var11;
      }

      var9 = this.w;
      var10 = var9.length;
      var11 = 0;
      if(var11 < var10) {
         jb var18 = var9[var11];
         var18.B(var7);
         ++var11;
      }

   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      float var8 = net.u.t.m(var3 * 0.1F);
      this.w[1].b = (0.065F + 0.05F * var8) * 3.1415927F;
      this.w[2].n(-2.0F, 6.9F + net.u.t.m(this.w[1].b) * 10.0F, -0.5F + net.u.t.A(this.w[1].b) * 10.0F);
      this.w[2].b = (0.265F + 0.1F * var8) * 3.1415927F;
      this.X[0].N = var4 * 0.017453292F;
      this.X[0].b = var5 * 0.017453292F;
   }

   public void x(net.ne.a var1, float var2, float var3, float var4) {
      net.a.z var5 = (net.a.z)var1;
      int var6 = 1;

      while(true) {
         this.X[var6].N = (var5.i(var6 - 1) - var1.AK) * 0.017453292F;
         this.X[var6].b = var5.v(var6 - 1) * 0.017453292F;
         ++var6;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
