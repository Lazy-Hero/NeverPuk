package net.y6;

import net.xn;
import net.y6.jb;

public class g extends net.y6.z {
   private final jb T;
   private final jb W;
   private final jb k;
   private final jb g;
   private final jb M;
   private final jb F;

   public g() {
      this.f = 64;
      this.C = 64;
      this.T = new jb(this, 0, 0);
      this.T.U(-3.0F, -3.0F, -3.0F, 6, 6, 6);
      jb var1 = new jb(this, 24, 0);
      var1.U(-4.0F, -6.0F, -2.0F, 3, 4, 1);
      this.T.s(var1);
      jb var2 = new jb(this, 24, 0);
      var2.x = true;
      var2.U(1.0F, -6.0F, -2.0F, 3, 4, 1);
      this.T.s(var2);
      this.W = new jb(this, 0, 16);
      this.W.U(-3.0F, 4.0F, -3.0F, 6, 12, 6);
      this.W.k(0, 34).U(-5.0F, 16.0F, 0.0F, 10, 6, 1);
      this.k = new jb(this, 42, 0);
      this.k.U(-12.0F, 1.0F, 1.5F, 10, 16, 1);
      this.M = new jb(this, 24, 16);
      this.M.n(-12.0F, 1.0F, 1.5F);
      this.M.U(-8.0F, 1.0F, 0.0F, 8, 12, 1);
      this.g = new jb(this, 42, 0);
      this.g.x = true;
      this.g.U(2.0F, 1.0F, 1.5F, 10, 16, 1);
      this.F = new jb(this, 24, 16);
      this.F.x = true;
      this.F.n(12.0F, 1.0F, 1.5F);
      this.F.U(0.0F, 1.0F, 0.0F, 8, 12, 1);
      this.W.s(this.k);
      this.W.s(this.g);
      this.k.s(this.M);
      this.g.s(this.F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      this.T.B(var7);
      this.W.B(var7);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      boolean var8 = net.y6.z.C();
      if(((net.yn.y)var7).D()) {
         this.T.b = var5 * 0.017453292F;
         this.T.N = 3.1415927F - var4 * 0.017453292F;
         this.T.c = 3.1415927F;
         this.T.n(0.0F, -2.0F, 0.0F);
         this.k.n(-3.0F, 0.0F, 3.0F);
         this.g.n(3.0F, 0.0F, 3.0F);
         this.W.b = 3.1415927F;
         this.k.b = -0.15707964F;
         this.k.N = -1.2566371F;
         this.M.N = -1.7278761F;
         this.g.b = this.k.b;
         this.g.N = -this.k.N;
         this.F.N = -this.M.N;
      }

      this.T.b = var5 * 0.017453292F;
      this.T.N = var4 * 0.017453292F;
      this.T.c = 0.0F;
      this.T.n(0.0F, 0.0F, 0.0F);
      this.k.n(0.0F, 0.0F, 0.0F);
      this.g.n(0.0F, 0.0F, 0.0F);
      this.W.b = 0.7853982F + net.u.t.m(var3 * 0.1F) * 0.15F;
      this.W.N = 0.0F;
      this.k.N = net.u.t.m(var3 * 1.3F) * 3.1415927F * 0.25F;
      this.g.N = -this.k.N;
      this.M.N = this.k.N * 0.5F;
      this.F.N = -this.k.N * 0.5F;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
