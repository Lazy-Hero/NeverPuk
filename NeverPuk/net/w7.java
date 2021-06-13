package net;

import net.mf;
import net.xn;
import net.u.t;
import net.y.d;
import net.y.p;
import net.y.r;
import net.y6.jb;
import net.y8.x;
import org.lwjgl.opengl.GL11;

public class w7 {
   private jb h = null;
   private int U = 0;
   private int b = 0;
   private float D = 0.0F;
   private float Q = 0.0F;
   private float A = 0.0F;
   private int I = 0;
   private int q = 0;
   private int t = 0;
   private float H = 0.0F;
   private float M = 0.0F;
   private float d = 0.0F;
   private float G = 0.0F;
   private float v = 0.0F;

   public w7(jb var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, float var10) {
      this.h = var1;
      this.U = var2;
      this.b = var3;
      this.D = var4;
      this.Q = var5;
      this.A = var6;
      this.I = var7;
      this.q = var8;
      this.t = var9;
      this.H = var10;
      this.M = (float)var2 / var1.E;
      this.d = (float)var3 / var1.K;
      this.G = (float)(var2 + var7) / var1.E;
      this.v = (float)(var3 + var8) / var1.K;
   }

   public void A(r var1, float var2) {
      d.O(this.D * var2, this.Q * var2, this.A * var2);
      float var3 = this.M;
      float var4 = this.G;
      float var5 = this.d;
      float var6 = this.v;
      if(this.h.x) {
         var3 = this.G;
         var4 = this.M;
      }

      if(this.h.Z) {
         var5 = this.v;
         var6 = this.d;
      }

      z(var1, var3, var5, var4, var6, this.I, this.q, var2 * (float)this.t, this.h.E, this.h.K);
      d.O(-this.D * var2, -this.Q * var2, -this.A * var2);
   }

   public static void z(r var0, float var1, float var2, float var3, float var4, int var5, int var6, float var7, float var8, float var9) {
      String var10 = mf.O();
      if(var7 < 6.25E-4F) {
         var7 = 6.25E-4F;
      }

      float var11 = var3 - var1;
      float var12 = var4 - var2;
      double var13 = (double)(t.J(var11) * (var8 / 16.0F));
      double var15 = (double)(t.J(var12) * (var9 / 16.0F));
      p var17 = var0.k();
      GL11.glNormal3f(0.0F, 0.0F, -1.0F);
      var17.m(7, x.H);
      var17.H(0.0D, var15, 0.0D).Y((double)var1, (double)var4).W();
      var17.H(var13, var15, 0.0D).Y((double)var3, (double)var4).W();
      var17.H(var13, 0.0D, 0.0D).Y((double)var3, (double)var2).W();
      var17.H(0.0D, 0.0D, 0.0D).Y((double)var1, (double)var2).W();
      var0.p();
      GL11.glNormal3f(0.0F, 0.0F, 1.0F);
      var17.m(7, x.H);
      var17.H(0.0D, 0.0D, (double)var7).Y((double)var1, (double)var2).W();
      var17.H(var13, 0.0D, (double)var7).Y((double)var3, (double)var2).W();
      var17.H(var13, var15, (double)var7).Y((double)var3, (double)var4).W();
      var17.H(0.0D, var15, (double)var7).Y((double)var1, (double)var4).W();
      var0.p();
      float var18 = 0.5F * var11 / (float)var5;
      float var19 = 0.5F * var12 / (float)var6;
      GL11.glNormal3f(-1.0F, 0.0F, 0.0F);
      var17.m(7, x.H);
      int var20 = 0;
      if(var20 < var5) {
         float var21 = (float)var20 / (float)var5;
         float var22 = var1 + var11 * var21 + var18;
         var17.H((double)var21 * var13, var15, (double)var7).Y((double)var22, (double)var4).W();
         var17.H((double)var21 * var13, var15, 0.0D).Y((double)var22, (double)var4).W();
         var17.H((double)var21 * var13, 0.0D, 0.0D).Y((double)var22, (double)var2).W();
         var17.H((double)var21 * var13, 0.0D, (double)var7).Y((double)var22, (double)var2).W();
         ++var20;
      }

      var0.p();
      GL11.glNormal3f(1.0F, 0.0F, 0.0F);
      var17.m(7, x.H);
      var20 = 0;
      if(var20 < var5) {
         float var31 = (float)var20 / (float)var5;
         float var34 = var1 + var11 * var31 + var18;
         float var23 = var31 + 1.0F / (float)var5;
         var17.H((double)var23 * var13, 0.0D, (double)var7).Y((double)var34, (double)var2).W();
         var17.H((double)var23 * var13, 0.0D, 0.0D).Y((double)var34, (double)var2).W();
         var17.H((double)var23 * var13, var15, 0.0D).Y((double)var34, (double)var4).W();
         var17.H((double)var23 * var13, var15, (double)var7).Y((double)var34, (double)var4).W();
         ++var20;
      }

      var0.p();
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      var17.m(7, x.H);
      var20 = 0;
      if(var20 < var6) {
         float var32 = (float)var20 / (float)var6;
         float var35 = var2 + var12 * var32 + var19;
         float var37 = var32 + 1.0F / (float)var6;
         var17.H(0.0D, (double)var37 * var15, (double)var7).Y((double)var1, (double)var35).W();
         var17.H(var13, (double)var37 * var15, (double)var7).Y((double)var3, (double)var35).W();
         var17.H(var13, (double)var37 * var15, 0.0D).Y((double)var3, (double)var35).W();
         var17.H(0.0D, (double)var37 * var15, 0.0D).Y((double)var1, (double)var35).W();
         ++var20;
      }

      var0.p();
      GL11.glNormal3f(0.0F, -1.0F, 0.0F);
      var17.m(7, x.H);
      var20 = 0;
      if(var20 < var6) {
         float var33 = (float)var20 / (float)var6;
         float var36 = var2 + var12 * var33 + var19;
         var17.H(var13, (double)var33 * var15, (double)var7).Y((double)var3, (double)var36).W();
         var17.H(0.0D, (double)var33 * var15, (double)var7).Y((double)var1, (double)var36).W();
         var17.H(0.0D, (double)var33 * var15, 0.0D).Y((double)var1, (double)var36).W();
         var17.H(var13, (double)var33 * var15, 0.0D).Y((double)var3, (double)var36).W();
         ++var20;
      }

      var0.p();
      if(net.u.d.y() == null) {
         mf.u("HrXyDc");
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
