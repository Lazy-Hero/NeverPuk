package net;

import net.bg;
import net.ga;
import net.gn;
import net.in;
import net.si;
import net.xn;
import net.ne.a;
import net.ne.l;
import net.u.d;
import net.u.e;
import net.u.m;
import net.u.r;
import net.u.t;

public class uy implements in {
   private static String d;

   public static float[] o(r var0, r var1) {
      double var2 = var1.p - var0.p;
      double var4 = var1.H - var0.H;
      double var6 = var1.a - var0.a;
      double var8 = (double)t.R(var2 * var2 + var6 * var6);
      float var10 = (float)(Math.atan2(var6, var2) * 180.0D / 3.141592653589793D) - 90.0F;
      float var11 = (float)(-(Math.atan2(var4, var8) * 180.0D / 3.141592653589793D));
      return new float[]{Y(E.sf.hN, var10, 360.0F), Y(E.sf.V, var11, 360.0F)};
   }

   public static float[] i(a var0, l var1) {
      return new float[]{var0.hN, var0.V};
   }

   public static float r(float var0, float var1) {
      float var2 = Math.abs(var1 - var0) % 360.0F;
      return var2 > 180.0F?360.0F - var2:var2;
   }

   public static float[] U(double var0, double var2, double var4) {
      double var7 = var0 + 0.5D - E.sf.b;
      b();
      double var9 = (var2 + 0.5D) / 2.0D - (E.sf.hS + (double)E.sf.A());
      double var11 = var4 + 0.5D - E.sf.hr;
      double var13 = (double)t.R(var7 * var7 + var11 * var11);
      float var15 = (float)(Math.atan2(var11, var7) * 180.0D / 3.141592653589793D - 90.0D) + bg.p(-2.0F, 2.0F);
      float var16 = (float)(-(Math.atan2(var9, var13) * 180.0D / 3.141592653589793D)) + bg.p(-2.0F, 2.0F);
      var15 = E.sf.hN + ga.x(t.k(var15 - E.sf.hN));
      var16 = E.sf.V + ga.x(t.k(var16 - E.sf.V));
      var16 = t.T(var16, -90.0F, 90.0F);
      float[] var10000 = new float[]{var15, var16};
      if(d.y() == null) {
         r("Jzy77b");
      }

      return var10000;
   }

   public static float[] B(r var0) {
      float[] var1 = new float[]{(float)(Math.atan2(E.sf.hr - var0.a, E.sf.b - var0.p) / 3.141592653589793D * 180.0D) + 90.0F, 0.0F};
      float var2 = (float)(E.sf.hS + (double)E.sf.A() - var0.H);
      float var3 = (float)Math.sqrt((E.sf.hr - var0.a) * (E.sf.hr - var0.a) + (E.sf.b - var0.p) * (E.sf.b - var0.p));
      var1[1] = (float)(Math.atan2((double)var2, (double)var3) / 3.141592653589793D * 180.0D);
      return var1;
   }

   public static boolean m(float var0, float var1, l var2, double var3) {
      r var6 = E.sf.E(1.0F);
      b();
      r var7 = l.z(var1, var0);
      r var8 = var6.s(var7.p * var3, var7.H * var3, var7.a * var3);
      m var9 = E.s8.s(var6, var8, false, false, true);
      return var9 == null?false:var2.i().f(0.06D, 0.06D, 0.06D).G(var6, var8) != null;
   }

   public static boolean m(r var0) {
      b();
      float[] var2 = B(var0);
      float var3 = Math.abs(t.k(var2[0] - gn.D())) / 0.6F;
      return Float.compare(var3, 20.0F) < 0;
   }

   public static float[] s(l var0) {
      double var1 = var0.b;
      double var3 = var0.hr;
      double var5 = var0.hS + (double)(var0.A() / 2.0F);
      return Y(var1, var3, var5);
   }

   public static r b(e var0) {
      return new r(var0.n + (var0.d - var0.n) * 0.5D, var0.u + (var0.c - var0.u) * 0.5D, var0.N + (var0.r - var0.N) * 0.5D);
   }

   public static float[] Y(double var0, double var2, double var4) {
      double var6 = var0 - E.sf.b;
      double var8 = var2 - E.sf.hr;
      double var10 = var4 - E.sf.hS - 1.2D;
      double var12 = (double)t.R(var6 * var6 + var8 * var8);
      float var14 = (float)(Math.atan2(var8, var6) * 180.0D / 3.141592653589793D) - 90.0F;
      float var15 = (float)(-(Math.atan2(var10, var12) * 180.0D / 3.141592653589793D));
      var14 = E.sf.hN + ga.x(t.k(var14 - E.sf.hN));
      var15 = E.sf.V + ga.x(t.k(var15 - E.sf.V));
      var15 = t.T(var15, -90.0F, 90.0F);
      return new float[]{var14, var15};
   }

   public static r y() {
      return new r(E.sf.b, E.sf.i().u + (double)E.sf.A(), E.sf.hr);
   }

   public static float[] a(r var0, boolean var1) {
      r var3 = y();
      b();
      double var4 = var0.p - var3.p;
      double var6 = var0.a - var3.a;
      if(si.o.Q()) {
         double var8 = var0.H - var3.H + 0.5D;
         d.h(new d[3]);
      }

      double var16 = var0.H - var3.H + 0.3D;
      double var10 = (double)t.R(var4 * var4 + var6 * var6);
      float var12 = 0.0F;
      var12 = bg.p(-2.0F, 2.0F);
      float var13 = 0.0F;
      var13 = bg.p(-2.0F, 2.0F);
      float var14 = (float)(Math.atan2(var6, var4) * 180.0D / 3.141592653589793D - 90.0D) + var12;
      float var15 = (float)(-(Math.atan2(var16, var10) * 180.0D / 3.141592653589793D)) + var13;
      var14 = E.sf.hN + ga.x(t.k(var14 - E.sf.hN));
      var15 = E.sf.V + ga.x(t.k(var15 - E.sf.V));
      var15 = t.T(var15, -90.0F, 90.0F);
      return new float[]{var14, var15};
   }

   public static float J(l var0) {
      return B(E.sf.hN, E.sf.b, E.sf.hr, var0.b, var0.hr);
   }

   public static float B(float var0, double var1, double var3, double var5, double var7) {
      double var9 = var5 - var1;
      double var11 = var7 - var3;
      float var13 = (float)(StrictMath.atan2(var11, var9) * 180.0D / 3.141592653589793D) - 90.0F;
      return var0 + t.k(var13 - var0);
   }

   public static float Y(float var0, float var1, float var2) {
      float var3 = t.k(var1 - var0);
      if(var3 > var2) {
         var3 = var2;
      }

      if(var3 < -var2) {
         var3 = -var2;
      }

      return var0 + var3;
   }

   public static void r(String var0) {
      d = var0;
   }

   public static String b() {
      return d;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(b() == null) {
         r("j1hxS");
      }

   }
}
