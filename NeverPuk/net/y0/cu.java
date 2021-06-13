package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y6.e1;
import net.yz.a5;
import net.yz.m_;

public class cu extends c {
   private static final m_ U = new m_("textures/entity/minecart.png");
   protected net.y6.z L = new e1();

   public cu(d var1) {
      super(var1);
      this.W = 0.5F;
   }

   public void D(net.nm.w var1, double var2, double var4, double var6, float var8, float var9) {
      net.y.d.c();
      this.j(var1);
      long var11 = (long)var1.G() * 493286711L;
      var11 = var11 * var11 * 4392167121L + var11 * 98761L;
      float var13 = (((float)(var11 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      c.C();
      float var14 = (((float)(var11 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var15 = (((float)(var11 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      net.y.d.O(var13, var14, var15);
      double var16 = var1.hL + (var1.b - var1.hL) * (double)var9;
      double var18 = var1.F + (var1.hS - var1.F) * (double)var9;
      double var20 = var1.A + (var1.hr - var1.A) * (double)var9;
      double var10000 = 0.30000001192092896D;
      net.u.r var24 = var1.G(var16, var18, var20);
      float var25 = var1.d + (var1.V - var1.d) * var9;
      net.u.r var26 = var1.a(var16, var18, var20, 0.30000001192092896D);
      net.u.r var27 = var1.a(var16, var18, var20, -0.30000001192092896D);
      if(var26 == null) {
         var26 = var24;
      }

      if(var27 == null) {
         var27 = var24;
      }

      var2 = var2 + (var24.p - var16);
      var4 = var4 + ((var26.H + var27.H) / 2.0D - var18);
      var6 = var6 + (var24.a - var20);
      net.u.r var28 = var27.s(-var26.p, -var26.H, -var26.a);
      if(Double.compare(var28.c(), 0.0D) != 0) {
         var28 = var28.I();
         var8 = (float)(Math.atan2(var28.a, var28.p) * 180.0D / 3.141592653589793D);
         var25 = (float)(Math.atan(var28.H) * 73.0D);
      }

      net.y.d.O((float)var2, (float)var4 + 0.375F, (float)var6);
      net.y.d.P(180.0F - var8, 0.0F, 1.0F, 0.0F);
      net.y.d.P(-var25, 0.0F, 0.0F, 1.0F);
      float var35 = (float)var1.P() - var9;
      float var36 = var1.O() - var9;
      if(Float.compare(var36, 0.0F) < 0) {
         var36 = 0.0F;
      }

      if(Float.compare(var35, 0.0F) > 0) {
         net.y.d.P(net.u.t.A(var35) * var35 * var36 / 10.0F * (float)var1.T(), 1.0F, 0.0F, 0.0F);
      }

      int var38 = var1.d();
      if(this.g) {
         net.y.d.G();
         net.y.d.o(this.B(var1));
      }

      net.yw.n var29 = var1.N();
      if(var29.C() != a5.INVISIBLE) {
         net.y.d.c();
         this.i(net.n9.b.N);
         float var39 = 0.75F;
         net.y.d.W(0.75F, 0.75F, 0.75F);
         net.y.d.O(-0.5F, (float)(var38 - 8) / 16.0F, 0.5F);
         this.M(var1, var9, var29);
         net.y.d.Y();
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         this.j(var1);
      }

      net.y.d.W(-1.0F, -1.0F, 1.0F);
      this.L.V(var1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      net.y.d.Y();
      if(this.g) {
         net.y.d.o();
         net.y.d.e();
      }

      super.w(var1, var2, var4, var6, var8, var9);
   }

   protected m_ y(net.nm.w var1) {
      return U;
   }

   protected void M(net.nm.w var1, float var2, net.yw.n var3) {
      net.y.d.c();
      net.nn.j.b().x().M(var3, var1.d());
      net.y.d.Y();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
