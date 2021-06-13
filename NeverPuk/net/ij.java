package net;

import java.awt.Font;
import net.im;
import net.n9.x;
import net.y.d;
import net.z.r;
import org.lwjgl.opengl.GL11;

public class ij extends im {
   private final int[] F = new int[32];
   protected im.a[] f = new im.a[256];
   protected im.a[] w = new im.a[256];
   protected im.a[] b = new im.a[256];
   protected x O;
   protected x A;
   protected x n;

   public ij(Font var1, boolean var2, boolean var3) {
      super(var1, var2, var3);
      this.N();
      this.z();
   }

   public static void K(String var0, ij var1, float var2, float var3, int var4) {
      var1.X(var0, (double)var2 + 0.5D, (double)var3, 0);
      var1.X(var0, (double)var2 - 0.5D, (double)var3, 0);
      var1.X(var0, (double)var2, (double)var3 + 0.5D, 0);
      var1.X(var0, (double)var2, (double)var3 - 0.5D, 0);
      var1.s(var0, var2, var3, var4);
   }

   public static void o(String var0, r var1, float var2, float var3, int var4) {
      var1.v(var0, var2 + 1.0F, var3, 0);
      var1.v(var0, var2 - 1.0F, var3, 0);
      var1.v(var0, var2, var3 + 1.0F, 0);
      var1.v(var0, var2, var3 - 1.0F, 0);
      var1.v(var0, var2, var3, var4);
   }

   public static void s(String var0, ij var1, float var2, float var3, int var4, boolean var5, float var6) {
      d.c();
      d.W(var6, var6, var6);
      var1.k(var0, (double)var2, (double)var3, var4, var5);
      d.Y();
   }

   public float s(String var1, float var2, float var3, int var4) {
      return this.k(var1, (double)var2, (double)var3, var4, false);
   }

   public float X(String var1, double var2, double var4, int var6) {
      return this.k(var1, var2, var4, var6, false);
   }

   public float i(String var1, float var2, float var3, int var4) {
      float var5 = this.k(var1, (double)var2 + 0.5D, (double)var3 + 0.5D, var4, true);
      return Math.max(var5, this.k(var1, (double)var2, (double)var3, var4, false));
   }

   public float E(String var1, double var2, double var4, int var6) {
      float var7 = this.k(var1, var2 + 0.5D, var4 + 0.5D, var6, true);
      return Math.max(var7, this.k(var1, var2, var4, var6, false));
   }

   public float I(String var1, float var2, float var3, int var4) {
      return this.s(var1, var2 - (float)this.s(var1) / 2.0F, var3, var4);
   }

   public float c(String var1, double var2, double var4, int var6) {
      return this.X(var1, var2 - (double)((float)this.s(var1) / 2.0F), var4, var6);
   }

   public float k(String var1, float var2, float var3, int var4) {
      this.k(var1, (double)(var2 - (float)this.s(var1) / 2.0F) + 0.45D, (double)var3 + 0.5D, var4, true);
      return this.s(var1, var2 - (float)this.s(var1) / 2.0F, var3, var4);
   }

   public void l(String var1, double var2, double var4, int var6) {
      this.X(var1, var2 - 0.5D, var4, 0);
      this.X(var1, var2 + 0.5D, var4, 0);
      this.X(var1, var2, var4 - 0.5D, 0);
      this.X(var1, var2, var4 + 0.5D, 0);
      this.X(var1, var2, var4, var6);
   }

   public void C(String var1, double var2, double var4, int var6) {
      this.c(var1, var2 - 0.5D, var4, 0);
      this.c(var1, var2 + 0.5D, var4, 0);
      this.c(var1, var2, var4 - 0.5D, 0);
      this.c(var1, var2, var4 + 0.5D, 0);
      this.c(var1, var2, var4, var6);
   }

   public void i(r var1, String var2, float var3, float var4, int var5) {
      var1.v(var2, var3 - 0.5F, var4, 0);
      var1.v(var2, var3 + 0.5F, var4, 0);
      var1.v(var2, var3, var4 - 0.5F, 0);
      var1.v(var2, var3, var4 + 0.5F, 0);
      var1.v(var2, var3, var4, var5);
   }

   public float y(String var1, double var2, double var4, int var6) {
      this.k(var1, var2 - (double)((float)this.s(var1) / 2.0F) + 0.45D, var4 + 0.5D, var6, true);
      return this.X(var1, var2 - (double)((float)this.s(var1) / 2.0F), var4, var6);
   }

   public float k(String var1, double var2, double var4, int var6, boolean var7) {
      im.C();
      --var2;
      return 0.0F;
   }

   public int s(String var1) {
      return 0;
   }

   public void i(Font var1) {
      super.i(var1);
      this.z();
   }

   public void J(boolean var1) {
      super.J(var1);
      this.z();
   }

   public void c(boolean var1) {
      super.c(var1);
      this.z();
   }

   private void z() {
      this.O = this.u(this.p.deriveFont(1), this.E, this.W, this.f);
      this.A = this.u(this.p.deriveFont(2), this.E, this.W, this.w);
      this.n = this.u(this.p.deriveFont(3), this.E, this.W, this.b);
   }

   private void e(double var1, double var3, double var5, double var7, float var9) {
      GL11.glDisable(3553);
      GL11.glLineWidth(var9);
      GL11.glBegin(1);
      GL11.glVertex2d(var1, var3);
      GL11.glVertex2d(var5, var7);
      GL11.glEnd();
      GL11.glEnable(3553);
   }

   private void N() {
      int var1 = 0;

      while(true) {
         int var2 = (var1 >> 3 & 1) * 85;
         int var3 = (var1 >> 2 & 1) * 170 + var2;
         int var4 = (var1 >> 1 & 1) * 170 + var2;
         int var5 = (var1 & 1) * 170 + var2;
         this.F[var1] = (var3 & 255) << 16 | (var4 & 255) << 8 | var5 & 255;
         ++var1;
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
