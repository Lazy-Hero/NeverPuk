package net;

import java.awt.Color;
import net.gn;
import net.in;
import net.va;
import net.vm;
import net.xg;
import net.xn;
import net.cy.n;
import net.n0.ks;
import net.ne.l;
import net.u.e;
import net.u.j;
import net.u.t;
import net.y.d;
import net.y.p;
import net.y.r;
import net.y8.x;
import net.z.g;
import org.lwjgl.opengl.GL11;

public class xh implements in {
   private static final n V = new n();
   private static final double x = 6.283185307179586D;
   protected static float S;

   public static double m(double var0, double var2, double var4) {
      return var2 + (var0 - var2) * var4;
   }

   public static void x(ks var0, int var1, int var2) {
      d.C();
      d.G(770, 771, 1, 0);
      d.B();
      net.y.u1.A();
      E.K().M(var0, var1, var2);
      E.K().q(E.sO, var0, var1, var2);
      net.y.u1.m();
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      d.z();
   }

   public static void k(double var0, double var2, double var4, double var6, int var8) {
      J(var0, var2, var0 + var4, var2 + var6, var8);
   }

   public static void f(double var0, double var2, double var4, double var6, Color var8, Color var9) {
      J(var0, var2, var0 + var4, var2 + var6, var8.getRGB());
      int var10 = var9.getRGB();
      J(var0 - 1.0D, var2, var0, var2 + var6, var10);
      J(var0 + var4, var2, var0 + var4 + 1.0D, var2 + var6, var10);
      J(var0 - 1.0D, var2 - 1.0D, var0 + var4 + 1.0D, var2, var10);
      J(var0 - 1.0D, var2 + var6, var0 + var4 + 1.0D, var2 + var6 + 1.0D, var10);
   }

   public static boolean Q(double var0, double var2, double var4, double var6, int var8, int var9) {
      return (double)var8 > var0 && (double)var9 > var2 && (double)var8 < var4 && (double)var9 < var6;
   }

   public static void s(float var0, float var1, float var2, float var3, int var4, int var5) {
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glShadeModel(7425);
      GL11.glPushMatrix();
      GL11.glBegin(7);
      U(var4);
      GL11.glVertex2f(var0, var1 + var3);
      GL11.glVertex2f(var0 + var2, var1 + var3);
      U(var5);
      GL11.glVertex2f(var0 + var2, var1);
      GL11.glVertex2f(var0, var1);
      GL11.glEnd();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glDisable(2848);
      GL11.glShadeModel(7424);
   }

   public static void U(int var0) {
      float var1 = (float)(var0 >> 24 & 255) / 255.0F;
      float var2 = (float)(var0 >> 16 & 255) / 255.0F;
      float var3 = (float)(var0 >> 8 & 255) / 255.0F;
      float var4 = (float)(var0 & 255) / 255.0F;
      GL11.glColor4f(var2, var3, var4, var1);
   }

   public static Color w(Color var0, float var1) {
      var1 = t.T(var1, 0.001F, 0.999F);
      return new Color(Math.max((int)((float)var0.getRed() * var1), 0), Math.max((int)((float)var0.getGreen() * var1), 0), Math.max((int)((float)var0.getBlue() * var1), 0), var0.getAlpha());
   }

   public static Color n(Color var0, float var1) {
      var1 = t.T(var1, 0.001F, 0.999F);
      int var2 = var0.getRed();
      int var3 = var0.getGreen();
      int var4 = var0.getBlue();
      int var5 = var0.getAlpha();
      int var6 = (int)(1.0D / (1.0D - (double)var1));
      return new Color(var6, var6, var6, var5);
   }

   public static void T(net.yz.m_ var0, float var1, float var2, float var3, float var4, Color var5) {
      d.c();
      GL11.glDisable(2929);
      GL11.glEnable(3042);
      GL11.glDepthMask(false);
      net.y.ui.X(770, 771, 1, 0);
      d.T((float)var5.getRed() / 255.0F, (float)var5.getGreen() / 255.0F, (float)var5.getBlue() / 255.0F, (float)var5.getAlpha());
      E.n().E(var0);
      g.r(var1, var2, 0.0F, 0.0F, var3, var4, var3, var4);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glEnable(2929);
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      d.Y();
   }

   public static void u(float var0, float var1, double var2, double var4, int var6) {
      GL11.glEnable(3042);
      GL11.glEnable(2848);
      J((double)var0, (double)var1, var2, var4, var6);
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      J((double)(var0 * 2.0F - 1.0F), (double)(var1 * 2.0F), (double)(var0 * 2.0F), var4 * 2.0D - 1.0D, var6);
      J((double)(var0 * 2.0F), (double)(var1 * 2.0F - 1.0F), var2 * 2.0D, (double)(var1 * 2.0F), var6);
      J(var2 * 2.0D, (double)(var1 * 2.0F), var2 * 2.0D + 1.0D, var4 * 2.0D - 1.0D, var6);
      J((double)(var0 * 2.0F), var4 * 2.0D - 1.0D, var2 * 2.0D, var4 * 2.0D, var6);
      GL11.glDisable(2848);
      GL11.glDisable(3042);
      GL11.glScalef(2.0F, 2.0F, 2.0F);
   }

   public static void Z(float var0, float var1, float var2, double var3) {
      net.z.t var5 = new net.z.t(E);
      int var6 = net.z.t.K();
      GL11.glScissor((int)(var0 * (float)var6), (int)(((double)((float)var5.v()) - var3) * (double)((float)var6)), (int)((var2 - var0) * (float)var6), (int)((var3 - (double)var1) * (double)((float)var6)));
   }

   public static void z(double var0, double var2, double var4, double var6, int var8, int var9) {
      float var10 = (float)(var8 >> 24 & 255) / 255.0F;
      float var11 = (float)(var8 >> 16 & 255) / 255.0F;
      float var12 = (float)(var8 >> 8 & 255) / 255.0F;
      float var13 = (float)(var8 & 255) / 255.0F;
      float var14 = (float)(var9 >> 24 & 255) / 255.0F;
      float var15 = (float)(var9 >> 16 & 255) / 255.0F;
      float var16 = (float)(var9 >> 8 & 255) / 255.0F;
      float var17 = (float)(var9 & 255) / 255.0F;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glShadeModel(7425);
      GL11.glPushMatrix();
      GL11.glBegin(7);
      GL11.glColor4f(var11, var12, var13, var10);
      GL11.glVertex2d(var0, var2);
      GL11.glVertex2d(var0, var6);
      GL11.glColor4f(var15, var16, var17, var14);
      GL11.glVertex2d(var4, var6);
      GL11.glVertex2d(var4, var2);
      GL11.glEnd();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
   }

   public static void T(double var0, double var2, double var4, double var6, double var8, int var10, int var11, boolean var12) {
      J(var0 - var8, var2 - var8, var4 + var8, var6 + var8, var11);
      J(var0 + var8, var2 + var8, var4 - var8, var6 - var8, var10);
   }

   public static void J(double var0, double var2, double var4, double var6, int var8) {
      if(var0 < var4) {
         double var9 = var0;
         var0 = var4;
         var4 = var9;
      }

      if(var2 < var6) {
         double var15 = var2;
         var2 = var6;
         var6 = var15;
      }

      float var16 = (float)(var8 >> 24 & 255) / 255.0F;
      float var10 = (float)(var8 >> 16 & 255) / 255.0F;
      float var11 = (float)(var8 >> 8 & 255) / 255.0F;
      float var12 = (float)(var8 & 255) / 255.0F;
      r var13 = r.f();
      p var14 = var13.k();
      d.C();
      d.w();
      d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
      d.T(var10, var11, var12, var16);
      var14.m(7, x.y);
      var14.H(var0, var6, 0.0D).W();
      var14.H(var4, var6, 0.0D).W();
      var14.H(var4, var2, 0.0D).W();
      var14.H(var0, var2, 0.0D).W();
      var13.p();
      d.S();
      d.E();
   }

   public static void N(l var0, double var1, float var3, int var4, float var5, int var6) {
      GL11.glPushMatrix();
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glHint(3154, 4354);
      GL11.glDisable(2929);
      GL11.glLineWidth(var5);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(2929);
      GL11.glBegin(3);
      double var7 = var0.hL + (var0.b - var0.hL) * (double)var3 - E.N().K;
      double var9 = var0.F + (var0.hS - var0.F) * (double)var3 - E.N().y;
      double var11 = var0.A + (var0.hr - var0.A) * (double)var3 - E.N().v;
      F(var6);

      for(int var13 = 0; var13 <= var4; ++var13) {
         GL11.glVertex3d(var7 + var1 * Math.cos((double)var13 * 6.283185307179586D / (double)var4), var9, var11 + var1 * Math.sin((double)var13 * 6.283185307179586D / (double)var4));
      }

      GL11.glEnd();
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glEnable(2929);
      GL11.glEnable(3553);
      GL11.glPopMatrix();
   }

   public static void F(int var0) {
      GL11.glColor4ub((byte)(var0 >> 16 & 255), (byte)(var0 >> 8 & 255), (byte)(var0 & 255), (byte)(var0 >> 24 & 255));
   }

   public static void g(l var0, float var1, Color var2) {
      boolean var4 = E.T.Y;
      E.T.Y = false;
      E.s4.R(var1, 2);
      E.T.Y = var4;
      GL11.glPushMatrix();
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDisable(3553);
      GL11.glDisable(2896);
      xg.Q();
      GL11.glDepthMask(false);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glLineWidth(1.5F);
      double var5 = var0.hL + (var0.b - var0.hL) * (double)var1 - E.N().h;
      double var7 = var0.F + (var0.hS - var0.F) * (double)var1 - E.N().e;
      double var9 = var0.A + (var0.hr - var0.A) * (double)var1 - E.N().w;
      if(gn.Q.z.o(var0.Q()) && va.a.Q()) {
         GL11.glColor4f(0.0F, 255.0F, 0.0F, 255.0F);
      }

      GL11.glColor4f((float)var2.getRed() / 255.0F, (float)var2.getGreen() / 255.0F, (float)var2.getBlue() / 255.0F, (float)var2.getAlpha() / 255.0F);
      net.u.r var11 = new net.u.r(0.0D, 0.0D, 1.0D);
      var11 = var11.f((float)(-Math.toRadians((double)E.sf.V)));
      net.u.r var12 = var11.T(-((float)Math.toRadians((double)E.sf.hN)));
      GL11.glBegin(2);
      GL11.glVertex3d(var12.p, (double)E.sf.A() + var12.H, var12.a);
      GL11.glVertex3d(var5, var7 + 1.1D, var9);
      GL11.glEnd();
      GL11.glDisable(3042);
      GL11.glDepthMask(true);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glPopMatrix();
      if(net.u.d.y() == null) {
         xg.P(new int[3]);
      }

   }

   public static void A(l var0, float var1, float var2, float var3, float var4) {
      double var5 = m(var0.b, var0.hL, (double)E.s9.x);
      double var7 = m(var0.hS, var0.F, (double)E.s9.x);
      double var9 = m(var0.hr, var0.A, (double)E.s9.x);
      GL11.glPushMatrix();
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glLineWidth(2.0F);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      B(new e(var0.S().n - 0.05D - var5 + (var5 - net.c5.g.T), var0.S().u - var7 + (var7 - net.c5.g.w), var0.S().N - 0.05D - var9 + (var9 - net.c5.g.i), var0.S().d + 0.05D - var0.b + (var0.b - net.c5.g.T), var0.S().c + 0.1D - var0.hS + (var0.hS - net.c5.g.w), var0.S().r + 0.05D - var0.hr + (var0.hr - net.c5.g.i)), 0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glLineWidth(2.0F);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void H(j var0, Color var1, double var2, double var4) {
      double var6 = (double)var0.t() - E.N().K;
      double var8 = (double)var0.h() - E.N().y;
      double var10 = (double)var0.y() - E.N().v;
      GL11.glPushMatrix();
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glLineWidth(2.0F);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      d.T((float)var1.getRed() / 255.0F, (float)var1.getGreen() / 255.0F, (float)var1.getBlue() / 255.0F, 0.15F);
      B(new e(var6, var8, var10, var6 + var4, var8 + 1.0D, var10 + var2), 0.0F, 0.0F, 0.0F, 0.0F);
      if(gn.Q.j.d(vm.class).v() && vm.V.Q()) {
         d.T(0.0F, 0.0F, 0.0F, 0.5F);
         f(new e(var6, var8, var10, var6 + var4, var8 + 1.0D, var10 + var2));
      }

      GL11.glLineWidth(2.0F);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void B(j var0, double var1, double var3, double var5) {
      double var7 = (double)var0.t() - E.N().K;
      double var9 = (double)var0.h() - E.N().y;
      double var11 = (double)var0.y() - E.N().v;
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glColor4d(var1, var3, var5, 0.5D);
      f(new e(var7, var9, var11, var7 + 1.0D, var9 + 1.0D, var11 + 1.0D));
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
   }

   public static void f(e var0) {
      r var1 = r.f();
      p var2 = var1.k();
      var2.m(3, x.y);
      var2.H(var0.n, var0.u, var0.N).W();
      var2.H(var0.d, var0.u, var0.N).W();
      var2.H(var0.d, var0.u, var0.r).W();
      var2.H(var0.n, var0.u, var0.r).W();
      var2.H(var0.n, var0.u, var0.N).W();
      var1.p();
      var2.m(3, x.y);
      var2.H(var0.n, var0.c, var0.N).W();
      var2.H(var0.d, var0.c, var0.N).W();
      var2.H(var0.d, var0.c, var0.r).W();
      var2.H(var0.n, var0.c, var0.r).W();
      var2.H(var0.n, var0.c, var0.N).W();
      var1.p();
      var2.m(1, x.y);
      var2.H(var0.n, var0.u, var0.N).W();
      var2.H(var0.n, var0.c, var0.N).W();
      var2.H(var0.d, var0.u, var0.N).W();
      var2.H(var0.d, var0.c, var0.N).W();
      var2.H(var0.d, var0.u, var0.r).W();
      var2.H(var0.d, var0.c, var0.r).W();
      var2.H(var0.n, var0.u, var0.r).W();
      var2.H(var0.n, var0.c, var0.r).W();
      var1.p();
   }

   public static void B(e var0, float var1, float var2, float var3, float var4) {
      r var6 = r.f();
      p var7 = var6.k();
      var7.m(7, x.H);
      var7.H(var0.n, var0.u, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.c, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.u, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.c, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.u, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.c, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.u, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.c, var0.r).m(var1, var2, var3, var4).W();
      var6.p();
      var7.m(7, x.H);
      var7.H(var0.d, var0.c, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.u, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.c, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.u, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.c, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.u, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.c, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.u, var0.r).m(var1, var2, var3, var4).W();
      var6.p();
      var7.m(7, x.H);
      var7.H(var0.n, var0.c, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.c, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.c, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.c, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.c, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.c, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.c, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.c, var0.N).m(var1, var2, var3, var4).W();
      var6.p();
      var7.m(7, x.H);
      var7.H(var0.n, var0.u, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.u, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.u, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.u, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.u, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.u, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.u, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.u, var0.N).m(var1, var2, var3, var4).W();
      var6.p();
      xg.Q();
      var7.m(7, x.H);
      var7.H(var0.n, var0.u, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.c, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.u, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.c, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.u, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.c, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.u, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.c, var0.N).m(var1, var2, var3, var4).W();
      var6.p();
      var7.m(7, x.H);
      var7.H(var0.n, var0.c, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.u, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.c, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.n, var0.u, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.c, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.u, var0.N).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.c, var0.r).m(var1, var2, var3, var4).W();
      var7.H(var0.d, var0.u, var0.r).m(var1, var2, var3, var4).W();
      var6.p();
      net.u.d.h(new net.u.d[3]);
   }

   public static boolean F(l var0) {
      return C(var0.i()) || var0.hz;
   }

   private static boolean C(e var0) {
      l var1 = E.A();
      V.o(var1.b, var1.hS, var1.hr);
      return V.E(var0);
   }

   public static void a(int var0) {
      float var1 = (float)(var0 & 255) / 255.0F;
      float var2 = (float)(var0 >> 8 & 255) / 255.0F;
      float var3 = (float)(var0 >> 16 & 255) / 255.0F;
      float var4 = (float)(var0 >> 24 & 255) / 255.0F;
      d.T(var1, var2, var3, var4);
   }

   public static void f(double var0, double var2, double var4, double var6, float var8, int var9) {
      float var10 = (float)(var9 >> 24 & 255) / 255.0F;
      float var11 = (float)(var9 >> 16 & 255) / 255.0F;
      float var12 = (float)(var9 >> 8 & 255) / 255.0F;
      float var13 = (float)(var9 & 255) / 255.0F;
      d.C();
      d.w();
      d.G(770, 771, 1, 0);
      d.T(var11, var12, var13, var10);
      GL11.glPushMatrix();
      GL11.glLineWidth(var8);
      GL11.glBegin(3);
      GL11.glVertex2d(var0, var2);
      GL11.glVertex2d(var4, var6);
      GL11.glEnd();
      GL11.glLineWidth(1.0F);
      GL11.glPopMatrix();
      d.S();
      d.E();
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void u(double var0, double var2, double var4, double var6, double var8, int var10, int var11) {
      J(var0, var2, var4, var6, var11);
      I(var0, var2, var4, var6, var10, var8);
   }

   public static void I(double var0, double var2, double var4, double var6, int var8, double var9) {
      f(var0, var2, var4, var2, (float)var9, var8);
      f(var4, var2, var4, var6, (float)var9, var8);
      f(var0, var6, var4, var6, (float)var9, var8);
      f(var0, var6, var0, var2, (float)var9, var8);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
