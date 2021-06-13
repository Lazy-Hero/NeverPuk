package net.y6;

import net.xn;
import net.y6.jb;

public class eo extends net.y6.z {
   private final jb k;
   private final jb D;
   private final jb[] o;
   private final jb[] O;

   public eo() {
      this.f = 64;
      this.C = 64;
      this.o = new jb[12];
      this.k = new jb(this);
      this.k.k(0, 0).U(-6.0F, 10.0F, -8.0F, 12, 12, 16);
      this.k.k(0, 28).U(-8.0F, 10.0F, -6.0F, 2, 12, 12);
      this.k.k(0, 28).u(6.0F, 10.0F, -6.0F, 2, 12, 12, true);
      this.k.k(16, 40).U(-6.0F, 8.0F, -6.0F, 12, 2, 12);
      this.k.k(16, 40).U(-6.0F, 22.0F, -6.0F, 12, 2, 12);

      for(int var1 = 0; var1 < this.o.length; ++var1) {
         this.o[var1] = new jb(this, 0, 0);
         this.o[var1].U(-1.0F, -4.5F, -1.0F, 2, 9, 2);
         this.k.s(this.o[var1]);
      }

      this.D = new jb(this, 8, 0);
      this.D.U(-1.0F, 15.0F, 0.0F, 2, 2, 1);
      this.k.s(this.D);
      this.O = new jb[3];
      this.O[0] = new jb(this, 40, 0);
      this.O[0].U(-2.0F, 14.0F, 7.0F, 4, 4, 8);
      this.O[1] = new jb(this, 0, 54);
      this.O[1].U(0.0F, 14.0F, 0.0F, 3, 3, 7);
      this.O[2] = new jb(this);
      this.O[2].k(41, 32).U(0.0F, 14.0F, 0.0F, 2, 2, 6);
      this.O[2].k(25, 19).U(1.0F, 10.5F, 3.0F, 1, 9, 9);
      this.k.s(this.O[0]);
      this.O[0].s(this.O[1]);
      this.O[1].s(this.O[2]);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.p(var2, var3, var4, var5, var6, var7, var1);
      this.k.B(var7);
   }

   public void p(float var1, float var2, float var3, float var4, float var5, float var6, net.ne.l var7) {
      net.nk.z var9 = (net.nk.z)var7;
      net.y6.z.W();
      float var10 = var3 - (float)var9.x;
      this.k.N = var4 * 0.017453292F;
      this.k.b = var5 * 0.017453292F;
      float[] var11 = new float[]{1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F};
      float[] var12 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F};
      float[] var13 = new float[]{0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F};
      float[] var14 = new float[]{0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F};
      float[] var15 = new float[]{-8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F};
      float[] var16 = new float[]{8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F};
      float var17 = (1.0F - var9.N(var10)) * 0.55F;
      int var18 = 0;
      this.o[var18].b = 3.1415927F * var11[var18];
      this.o[var18].N = 3.1415927F * var12[var18];
      this.o[var18].c = 3.1415927F * var13[var18];
      this.o[var18].l = var14[var18] * (1.0F + net.u.t.m(var3 * 1.5F + (float)var18) * 0.01F - var17);
      this.o[var18].I = 16.0F + var15[var18] * (1.0F + net.u.t.m(var3 * 1.5F + (float)var18) * 0.01F - var17);
      this.o[var18].h = var16[var18] * (1.0F + net.u.t.m(var3 * 1.5F + (float)var18) * 0.01F - var17);
      ++var18;
      this.D.h = -8.25F;
      Object var28 = net.nn.j.b().A();
      if(var9.Oe()) {
         var28 = var9.s();
      }

      if(var28 != null) {
         net.u.r var19 = ((net.ne.l)var28).E(0.0F);
         net.u.r var20 = var7.E(0.0F);
         double var21 = var19.H - var20.H;
         if(var21 > 0.0D) {
            this.D.I = 0.0F;
         }

         this.D.I = 1.0F;
         net.u.r var23 = var7.r(0.0F);
         var23 = new net.u.r(var23.p, 0.0D, var23.a);
         net.u.r var24 = (new net.u.r(var20.p - var19.p, 0.0D, var20.a - var19.a)).I().T(1.5707964F);
         double var25 = var23.d(var24);
         this.D.l = net.u.t.g((float)Math.abs(var25)) * 2.0F * (float)Math.signum(var25);
      }

      this.D.B = true;
      float var29 = var9.g(var10);
      this.O[0].N = net.u.t.A(var29) * 3.1415927F * 0.05F;
      this.O[1].N = net.u.t.A(var29) * 3.1415927F * 0.1F;
      this.O[1].l = -1.5F;
      this.O[1].I = 0.5F;
      this.O[1].h = 14.0F;
      this.O[2].N = net.u.t.A(var29) * 3.1415927F * 0.15F;
      this.O[2].l = 0.5F;
      this.O[2].I = 0.5F;
      this.O[2].h = 6.0F;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
