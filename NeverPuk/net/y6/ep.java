package net.y6;

import net.xn;
import net.y6.jb;

public class ep extends net.y6.z {
   jb r;
   jb K;
   jb e;
   jb u;
   jb b;
   jb G;
   jb g;
   jb l;
   jb Z;
   jb L;
   jb F;
   private ep.d R = ep.d.STANDING;

   public ep() {
      this.f = 32;
      this.C = 32;
      this.r = new jb(this, 2, 8);
      this.r.U(-1.5F, 0.0F, -1.5F, 3, 6, 3);
      this.r.n(0.0F, 16.5F, -3.0F);
      this.K = new jb(this, 22, 1);
      this.K.U(-1.5F, -1.0F, -1.0F, 3, 4, 1);
      this.K.n(0.0F, 21.07F, 1.16F);
      this.e = new jb(this, 19, 8);
      this.e.U(-0.5F, 0.0F, -1.5F, 1, 5, 3);
      this.e.n(1.5F, 16.94F, -2.76F);
      this.u = new jb(this, 19, 8);
      this.u.U(-0.5F, 0.0F, -1.5F, 1, 5, 3);
      this.u.n(-1.5F, 16.94F, -2.76F);
      this.b = new jb(this, 2, 2);
      this.b.U(-1.0F, -1.5F, -1.0F, 2, 3, 2);
      this.b.n(0.0F, 15.69F, -2.76F);
      this.G = new jb(this, 10, 0);
      this.G.U(-1.0F, -0.5F, -2.0F, 2, 1, 4);
      this.G.n(0.0F, -2.0F, -1.0F);
      this.b.s(this.G);
      this.g = new jb(this, 11, 7);
      this.g.U(-0.5F, -1.0F, -0.5F, 1, 2, 1);
      this.g.n(0.0F, -0.5F, -1.5F);
      this.b.s(this.g);
      this.l = new jb(this, 16, 7);
      this.l.U(-0.5F, 0.0F, -0.5F, 1, 2, 1);
      this.l.n(0.0F, -1.75F, -2.45F);
      this.b.s(this.l);
      this.Z = new jb(this, 2, 18);
      this.Z.U(0.0F, -4.0F, -2.0F, 0, 5, 4);
      this.Z.n(0.0F, -2.15F, 0.15F);
      this.b.s(this.Z);
      this.L = new jb(this, 14, 18);
      this.L.U(-0.5F, 0.0F, -0.5F, 1, 2, 1);
      this.L.n(1.0F, 22.0F, -1.05F);
      this.F = new jb(this, 14, 18);
      this.F.U(-0.5F, 0.0F, -0.5F, 1, 2, 1);
      this.F.n(-1.0F, 22.0F, -1.05F);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.r.B(var7);
      this.e.B(var7);
      this.u.B(var7);
      this.K.B(var7);
      this.b.B(var7);
      this.L.B(var7);
      this.F.B(var7);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      float var9 = var3 * 0.3F;
      net.y6.z.W();
      this.b.b = var5 * 0.017453292F;
      this.b.N = var4 * 0.017453292F;
      this.b.c = 0.0F;
      this.b.l = 0.0F;
      this.r.l = 0.0F;
      this.K.l = 0.0F;
      this.u.l = -1.5F;
      this.e.l = 1.5F;
      if(this.R != ep.d.FLYING) {
         if(this.R == ep.d.SITTING) {
            return;
         }

         if(this.R == ep.d.PARTY) {
            float var10 = net.u.t.m((float)var7.x);
            float var11 = net.u.t.A((float)var7.x);
            this.b.l = var10;
            this.b.I = 15.69F + var11;
            this.b.b = 0.0F;
            this.b.N = 0.0F;
            this.b.c = net.u.t.A((float)var7.x) * 0.4F;
            this.r.l = var10;
            this.r.I = 16.5F + var11;
            this.e.c = -0.0873F - var3;
            this.e.l = 1.5F + var10;
            this.e.I = 16.94F + var11;
            this.u.c = 0.0873F + var3;
            this.u.l = -1.5F + var10;
            this.u.I = 16.94F + var11;
            this.K.l = var10;
            this.K.I = 21.07F + var11;
            return;
         }

         this.L.b += net.u.t.m(var1 * 0.6662F) * 1.4F * var2;
         this.F.b += net.u.t.m(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      }

      this.b.I = 15.69F + var9;
      this.K.b = 1.015F + net.u.t.m(var1 * 0.6662F) * 0.3F * var2;
      this.K.I = 21.07F + var9;
      this.r.I = 16.5F + var9;
      this.e.c = -0.0873F - var3;
      this.e.I = 16.94F + var9;
      this.u.c = 0.0873F + var3;
      this.u.I = 16.94F + var9;
      this.L.I = 22.0F + var9;
      this.F.I = 22.0F + var9;
   }

   public void x(net.ne.a var1, float var2, float var3, float var4) {
      this.Z.b = -0.2214F;
      this.r.b = 0.4937F;
      this.e.b = -0.69813174F;
      this.e.N = -3.1415927F;
      this.u.b = -0.69813174F;
      this.u.N = -3.1415927F;
      this.L.b = -0.0299F;
      this.F.b = -0.0299F;
      this.L.I = 22.0F;
      this.F.I = 22.0F;
      if(var1 instanceof net.yn.k) {
         net.yn.k var5 = (net.yn.k)var1;
         if(var5.yl()) {
            this.L.c = -0.34906584F;
            this.F.c = 0.34906584F;
            this.R = ep.d.PARTY;
            return;
         }

         if(var5.Ke()) {
            float var10000 = 1.9F;
            this.b.I = 17.59F;
            this.K.b = 1.5388988F;
            this.K.I = 22.97F;
            this.r.I = 18.4F;
            this.e.c = -0.0873F;
            this.e.I = 18.84F;
            this.u.c = 0.0873F;
            this.u.I = 18.84F;
            ++this.L.I;
            ++this.F.I;
            ++this.L.b;
            ++this.F.b;
            this.R = ep.d.SITTING;
         } else if(var5.yk()) {
            this.L.b += 0.69813174F;
            this.F.b += 0.69813174F;
            this.R = ep.d.FLYING;
         } else {
            this.R = ep.d.STANDING;
         }

         this.L.c = 0.0F;
         this.F.c = 0.0F;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   static enum d {
      FLYING,
      STANDING,
      SITTING,
      PARTY;
   }
}
