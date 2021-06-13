package net.z;

import net.xn;
import net.yz.m_;
import net.z.r;

public class g {
   public static final m_ v = new m_("textures/gui/options_background.png");
   public static final m_ G = new m_("textures/gui/container/stats_icons.png");
   public static final m_ e = new m_("textures/gui/icons.png");
   public static float d;
   private static boolean x;

   protected void Y(int var1, int var2, int var3, int var4) {
      if(var2 < var1) {
         int var5 = var1;
         var1 = var2;
         var2 = var5;
      }

      u(var1, var3, var2 + 1, var3 + 1, var4);
   }

   protected void z(int var1, int var2, int var3, int var4) {
      boolean var5 = C();
      if(var3 < var2) {
         int var6 = var2;
         var2 = var3;
         var3 = var6;
      }

      u(var1, var2 + 1, var1 + 1, var3, var4);
   }

   public static void u(int var0, int var1, int var2, int var3, int var4) {
      boolean var5 = B();
      if(var0 < var2) {
         int var6 = var0;
         var0 = var2;
         var2 = var6;
      }

      if(var1 < var3) {
         int var12 = var1;
         var1 = var3;
         var3 = var12;
      }

      float var13 = (float)(var4 >> 24 & 255) / 255.0F;
      float var7 = (float)(var4 >> 16 & 255) / 255.0F;
      float var8 = (float)(var4 >> 8 & 255) / 255.0F;
      float var9 = (float)(var4 & 255) / 255.0F;
      net.y.r var10 = net.y.r.f();
      net.y.p var11 = var10.k();
      net.y.d.C();
      net.y.d.w();
      net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
      net.y.d.T(var7, var8, var9, var13);
      var11.m(7, net.y8.x.y);
      var11.H((double)var0, (double)var3, 0.0D).W();
      var11.H((double)var2, (double)var3, 0.0D).W();
      var11.H((double)var2, (double)var1, 0.0D).W();
      var11.H((double)var0, (double)var1, 0.0D).W();
      var10.p();
      net.y.d.S();
      net.y.d.E();
   }

   public void T(int var1, int var2, double var3, double var5, int var7, int var8) {
      float var9 = (float)(var7 >> 24 & 255) / 255.0F;
      float var10 = (float)(var7 >> 16 & 255) / 255.0F;
      float var11 = (float)(var7 >> 8 & 255) / 255.0F;
      float var12 = (float)(var7 & 255) / 255.0F;
      float var13 = (float)(var8 >> 24 & 255) / 255.0F;
      float var14 = (float)(var8 >> 16 & 255) / 255.0F;
      float var15 = (float)(var8 >> 8 & 255) / 255.0F;
      float var16 = (float)(var8 & 255) / 255.0F;
      net.y.d.w();
      net.y.d.C();
      net.y.d.d();
      net.y.d.e(net.y.d.SRC_ALPHA, net.y.d.ONE_MINUS_SRC_ALPHA, net.y.d.ONE, net.y.d.ZERO);
      net.y.d.Q(7425);
      net.y.r var17 = net.y.r.f();
      net.y.p var18 = var17.k();
      var18.m(7, net.y8.x.F);
      var18.H(var3, (double)var2, (double)d).m(var10, var11, var12, var9).W();
      var18.H((double)var1, (double)var2, (double)d).m(var10, var11, var12, var9).W();
      var18.H((double)var1, var5, (double)d).m(var14, var15, var16, var13).W();
      var18.H(var3, var5, (double)d).m(var14, var15, var16, var13).W();
      var17.p();
      net.y.d.Q(7424);
      net.y.d.E();
      net.y.d.m();
      net.y.d.S();
   }

   public void d(r var1, String var2, int var3, int var4, int var5) {
      var1.U(var2, (float)(var3 - var1.r(var2) / 2), (float)var4, var5);
   }

   public void n(r var1, String var2, int var3, int var4, int var5) {
      var1.U(var2, (float)var3, (float)var4, var5);
   }

   public void g(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var10000 = 0.00390625F;
      var10000 = 0.00390625F;
      net.y.r var9 = net.y.r.f();
      net.y.p var10 = var9.k();
      var10.m(7, net.y8.x.H);
      var10.H((double)(var1 + 0), (double)(var2 + var6), (double)d).Y((double)((float)(var3 + 0) * 0.00390625F), (double)((float)(var4 + var6) * 0.00390625F)).W();
      var10.H((double)(var1 + var5), (double)(var2 + var6), (double)d).Y((double)((float)(var3 + var5) * 0.00390625F), (double)((float)(var4 + var6) * 0.00390625F)).W();
      var10.H((double)(var1 + var5), (double)(var2 + 0), (double)d).Y((double)((float)(var3 + var5) * 0.00390625F), (double)((float)(var4 + 0) * 0.00390625F)).W();
      var10.H((double)(var1 + 0), (double)(var2 + 0), (double)d).Y((double)((float)(var3 + 0) * 0.00390625F), (double)((float)(var4 + 0) * 0.00390625F)).W();
      var9.p();
   }

   public static void l(float var0, float var1, int var2, int var3, int var4, int var5) {
      float var10000 = 0.00390625F;
      var10000 = 0.00390625F;
      net.y.r var8 = net.y.r.f();
      net.y.p var9 = var8.k();
      var9.m(7, net.y8.x.H);
      var9.H((double)(var0 + 0.0F), (double)(var1 + (float)var5), (double)d).Y((double)((float)(var2 + 0) * 0.00390625F), (double)((float)(var3 + var5) * 0.00390625F)).W();
      var9.H((double)(var0 + (float)var4), (double)(var1 + (float)var5), (double)d).Y((double)((float)(var2 + var4) * 0.00390625F), (double)((float)(var3 + var5) * 0.00390625F)).W();
      var9.H((double)(var0 + (float)var4), (double)(var1 + 0.0F), (double)d).Y((double)((float)(var2 + var4) * 0.00390625F), (double)((float)(var3 + 0) * 0.00390625F)).W();
      var9.H((double)(var0 + 0.0F), (double)(var1 + 0.0F), (double)d).Y((double)((float)(var2 + 0) * 0.00390625F), (double)((float)(var3 + 0) * 0.00390625F)).W();
      var8.p();
   }

   public void P(int var1, int var2, net.n9.v var3, int var4, int var5) {
      net.y.r var6 = net.y.r.f();
      net.y.p var7 = var6.k();
      var7.m(7, net.y8.x.H);
      var7.H((double)(var1 + 0), (double)(var2 + var5), (double)d).Y((double)var3.q(), (double)var3.r()).W();
      var7.H((double)(var1 + var4), (double)(var2 + var5), (double)d).Y((double)var3.o(), (double)var3.r()).W();
      var7.H((double)(var1 + var4), (double)(var2 + 0), (double)d).Y((double)var3.o(), (double)var3.n()).W();
      var7.H((double)(var1 + 0), (double)(var2 + 0), (double)d).Y((double)var3.q(), (double)var3.n()).W();
      var6.p();
   }

   public static void r(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = 1.0F / var6;
      float var9 = 1.0F / var7;
      net.y.r var10 = net.y.r.f();
      net.y.p var11 = var10.k();
      var11.m(7, net.y8.x.H);
      var11.H((double)var0, (double)(var1 + var5), 0.0D).Y((double)(var2 * var8), (double)((var3 + var5) * var9)).W();
      var11.H((double)(var0 + var4), (double)(var1 + var5), 0.0D).Y((double)((var2 + var4) * var8), (double)((var3 + var5) * var9)).W();
      var11.H((double)(var0 + var4), (double)var1, 0.0D).Y((double)((var2 + var4) * var8), (double)(var3 * var9)).W();
      var11.H((double)var0, (double)var1, 0.0D).Y((double)(var2 * var8), (double)(var3 * var9)).W();
      var10.p();
   }

   public static void v(int var0, int var1, float var2, float var3, int var4, int var5, int var6, int var7, float var8, float var9) {
      float var10 = 1.0F / var8;
      float var11 = 1.0F / var9;
      net.y.r var12 = net.y.r.f();
      net.y.p var13 = var12.k();
      var13.m(7, net.y8.x.H);
      var13.H((double)var0, (double)(var1 + var7), 0.0D).Y((double)(var2 * var10), (double)((var3 + (float)var5) * var11)).W();
      var13.H((double)(var0 + var6), (double)(var1 + var7), 0.0D).Y((double)((var2 + (float)var4) * var10), (double)((var3 + (float)var5) * var11)).W();
      var13.H((double)(var0 + var6), (double)var1, 0.0D).Y((double)((var2 + (float)var4) * var10), (double)(var3 * var11)).W();
      var13.H((double)var0, (double)var1, 0.0D).Y((double)(var2 * var10), (double)(var3 * var11)).W();
      var12.p();
   }

   static {
      E(false);
   }

   public static void E(boolean var0) {
      x = var0;
   }

   public static boolean C() {
      return x;
   }

   public static boolean B() {
      boolean var0 = C();
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
