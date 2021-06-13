package net.y0;

import net.xn;
import net.y.ui;
import net.y0.c;
import net.y0.d;
import net.yz.aq;
import net.yz.m_;

public class cs extends c {
   private static final m_ v = new m_("textures/painting/paintings_kristoffer_zetterstrand.png");

   public cs(d var1) {
      super(var1);
   }

   public void Y(net.nm.l var1, double var2, double var4, double var6, float var8, float var9) {
      net.y.d.c();
      net.y.d.J(var2, var4, var6);
      net.y.d.P(180.0F - var8, 0.0F, 1.0F, 0.0F);
      net.y.d.F();
      this.j(var1);
      net.nm.l var10 = var1.dN;
      float var10000 = 0.0625F;
      net.y.d.W(0.0625F, 0.0625F, 0.0625F);
      if(this.g) {
         net.y.d.G();
         net.y.d.o(this.B(var1));
      }

      this.X(var1, var10.sizeX, var10.sizeY, var10.offsetX, var10.offsetY);
      if(this.g) {
         net.y.d.o();
         net.y.d.e();
      }

      net.y.d.g();
      net.y.d.Y();
      super.w(var1, var2, var4, var6, var8, var9);
   }

   protected m_ e(net.nm.l var1) {
      return v;
   }

   private void X(net.nm.l var1, int var2, int var3, int var4, int var5) {
      float var7 = (float)(-var2) / 2.0F;
      c.C();
      float var8 = (float)(-var3) / 2.0F;
      float var10001 = 0.5F;
      var10001 = 0.75F;
      float var10000 = 0.8125F;
      var10000 = 0.0F;
      var10000 = 0.0625F;
      var10000 = 0.75F;
      var10000 = 0.8125F;
      var10000 = 0.001953125F;
      var10000 = 0.001953125F;
      var10000 = 0.7519531F;
      var10000 = 0.7519531F;
      var10000 = 0.0F;
      var10000 = 0.0625F;
      int var22 = 0;
      if(var22 < var2 / 16) {
         int var23 = 0;
         if(var23 < var3 / 16) {
            float var24 = var7 + (float)((var22 + 1) * 16);
            float var25 = var7 + (float)(var22 * 16);
            float var26 = var8 + (float)((var23 + 1) * 16);
            float var27 = var8 + (float)(var23 * 16);
            this.C(var1, (var24 + var25) / 2.0F, (var26 + var27) / 2.0F);
            float var28 = (float)(var4 + var2 - var22 * 16) / 256.0F;
            float var29 = (float)(var4 + var2 - (var22 + 1) * 16) / 256.0F;
            float var30 = (float)(var5 + var3 - var23 * 16) / 256.0F;
            float var31 = (float)(var5 + var3 - (var23 + 1) * 16) / 256.0F;
            net.y.r var32 = net.y.r.f();
            net.y.p var33 = var32.k();
            var33.m(7, net.y8.x.T);
            var33.H((double)var24, (double)var27, -0.5D).Y((double)var29, (double)var30).d(0.0F, 0.0F, -1.0F).W();
            var33.H((double)var25, (double)var27, -0.5D).Y((double)var28, (double)var30).d(0.0F, 0.0F, -1.0F).W();
            var33.H((double)var25, (double)var26, -0.5D).Y((double)var28, (double)var31).d(0.0F, 0.0F, -1.0F).W();
            var33.H((double)var24, (double)var26, -0.5D).Y((double)var29, (double)var31).d(0.0F, 0.0F, -1.0F).W();
            var33.H((double)var24, (double)var26, 0.5D).Y(0.75D, 0.0D).d(0.0F, 0.0F, 1.0F).W();
            var33.H((double)var25, (double)var26, 0.5D).Y(0.8125D, 0.0D).d(0.0F, 0.0F, 1.0F).W();
            var33.H((double)var25, (double)var27, 0.5D).Y(0.8125D, 0.0625D).d(0.0F, 0.0F, 1.0F).W();
            var33.H((double)var24, (double)var27, 0.5D).Y(0.75D, 0.0625D).d(0.0F, 0.0F, 1.0F).W();
            var33.H((double)var24, (double)var26, -0.5D).Y(0.75D, 0.001953125D).d(0.0F, 1.0F, 0.0F).W();
            var33.H((double)var25, (double)var26, -0.5D).Y(0.8125D, 0.001953125D).d(0.0F, 1.0F, 0.0F).W();
            var33.H((double)var25, (double)var26, 0.5D).Y(0.8125D, 0.001953125D).d(0.0F, 1.0F, 0.0F).W();
            var33.H((double)var24, (double)var26, 0.5D).Y(0.75D, 0.001953125D).d(0.0F, 1.0F, 0.0F).W();
            var33.H((double)var24, (double)var27, 0.5D).Y(0.75D, 0.001953125D).d(0.0F, -1.0F, 0.0F).W();
            var33.H((double)var25, (double)var27, 0.5D).Y(0.8125D, 0.001953125D).d(0.0F, -1.0F, 0.0F).W();
            var33.H((double)var25, (double)var27, -0.5D).Y(0.8125D, 0.001953125D).d(0.0F, -1.0F, 0.0F).W();
            var33.H((double)var24, (double)var27, -0.5D).Y(0.75D, 0.001953125D).d(0.0F, -1.0F, 0.0F).W();
            var33.H((double)var24, (double)var26, 0.5D).Y(0.751953125D, 0.0D).d(-1.0F, 0.0F, 0.0F).W();
            var33.H((double)var24, (double)var27, 0.5D).Y(0.751953125D, 0.0625D).d(-1.0F, 0.0F, 0.0F).W();
            var33.H((double)var24, (double)var27, -0.5D).Y(0.751953125D, 0.0625D).d(-1.0F, 0.0F, 0.0F).W();
            var33.H((double)var24, (double)var26, -0.5D).Y(0.751953125D, 0.0D).d(-1.0F, 0.0F, 0.0F).W();
            var33.H((double)var25, (double)var26, -0.5D).Y(0.751953125D, 0.0D).d(1.0F, 0.0F, 0.0F).W();
            var33.H((double)var25, (double)var27, -0.5D).Y(0.751953125D, 0.0625D).d(1.0F, 0.0F, 0.0F).W();
            var33.H((double)var25, (double)var27, 0.5D).Y(0.751953125D, 0.0625D).d(1.0F, 0.0F, 0.0F).W();
            var33.H((double)var25, (double)var26, 0.5D).Y(0.751953125D, 0.0D).d(1.0F, 0.0F, 0.0F).W();
            var32.p();
            ++var23;
         }

         ++var22;
      }

   }

   private void C(net.nm.l var1, float var2, float var3) {
      int var4 = net.u.t.L(var1.b);
      int var5 = net.u.t.L(var1.hS + (double)(var3 / 16.0F));
      int var6 = net.u.t.L(var1.hr);
      aq var7 = var1.uz;
      if(var7 == aq.NORTH) {
         var4 = net.u.t.L(var1.b + (double)(var2 / 16.0F));
      }

      if(var7 == aq.WEST) {
         var6 = net.u.t.L(var1.hr - (double)(var2 / 16.0F));
      }

      if(var7 == aq.SOUTH) {
         var4 = net.u.t.L(var1.b - (double)(var2 / 16.0F));
      }

      if(var7 == aq.EAST) {
         var6 = net.u.t.L(var1.hr + (double)(var2 / 16.0F));
      }

      int var8 = this.A.q.z(new net.u.j(var4, var5, var6), 0);
      int var9 = var8 % 65536;
      int var10 = var8 / 65536;
      ui.c(ui.w, (float)var9, (float)var10);
      net.y.d.Z(1.0F, 1.0F, 1.0F);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
