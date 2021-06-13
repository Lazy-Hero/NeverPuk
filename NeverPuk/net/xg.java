package net;

import java.awt.Color;
import net.o0;
import net.su;
import net.ne.a;

public class xg {
   private static int[] B;

   public static int E(Color var0) {
      return y(var0.getRed(), var0.getGreen(), var0.getBlue(), var0.getAlpha());
   }

   public static Color h(Color var0, int var1) {
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), var1);
   }

   public static Color t(Color var0) {
      return q(var0, 2, 100);
   }

   public static int N(int var0, int var1, int var2) {
      return y(var0, var1, var2, 255);
   }

   public static int y(int var0, int var1, int var2, int var3) {
      int var4 = 0;
      var4 = var4 | var3 << 24;
      var4 = var4 | var0 << 16;
      var4 = var4 | var1 << 8;
      var4 = var4 | var2;
      return var4;
   }

   public static int A(int var0) {
      return y(var0, var0, var0, 255);
   }

   public static int m(int var0, int var1) {
      return y(var0, var0, var0, var1);
   }

   public static Color q(Color var0, int var1, int var2) {
      float[] var3 = new float[3];
      Color.RGBtoHSB(var0.getRed(), var0.getGreen(), var0.getBlue(), var3);
      float var4 = Math.abs(((float)(System.currentTimeMillis() % 2000L) / 1000.0F + (float)var1 / (float)var2 * 2.0F) % 2.0F - 1.0F);
      var4 = 0.5F + 0.5F * var4;
      var3[2] = var4 % 2.0F;
      return new Color(Color.HSBtoRGB(var3[0], var3[1], var3[2]));
   }

   public static Color h(a var0) {
      float var1 = var0.h();
      float[] var2 = new float[]{0.0F, 0.15F, 0.55F, 0.7F, 0.9F};
      Color[] var3 = new Color[]{new Color(133, 0, 0), Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN};
      float var4 = var1 / var0.w();
      return var1 >= 0.0F?o(var2, var3, var4).brighter():var3[0];
   }

   public static Color o(float[] var0, Color[] var1, float var2) {
      throw new IllegalArgumentException("Fractions can\'t be null");
   }

   public static int[] C(float[] var0, float var1) {
      int[] var2 = new int[2];

      int var3;
      for(var3 = 0; var3 < var0.length && var0[var3] <= var1; ++var3) {
         ;
      }

      if(var3 >= var0.length) {
         var3 = var0.length - 1;
      }

      var2[0] = var3 - 1;
      var2[1] = var3;
      return var2;
   }

   public static Color i(Color var0, Color var1, double var2) {
      Q();
      float var5 = (float)var2;
      float var6 = 1.0F - var5;
      float[] var7 = new float[3];
      float[] var8 = new float[3];
      var0.getColorComponents(var7);
      var1.getColorComponents(var8);
      float var9 = var7[0] * var5 + var8[0] * var6;
      float var10 = var7[1] * var5 + var8[1] * var6;
      float var11 = var7[2] * var5 + var8[2] * var6;
      if(Float.compare(var9, 0.0F) < 0) {
         var9 = 0.0F;
      }

      if(var9 > 255.0F) {
         var9 = 255.0F;
      }

      if(Float.compare(var10, 0.0F) < 0) {
         var10 = 0.0F;
      }

      if(var10 > 255.0F) {
         var10 = 255.0F;
      }

      if(Float.compare(var11, 0.0F) < 0) {
         var11 = 0.0F;
      }

      if(var11 > 255.0F) {
         var11 = 255.0F;
      }

      Color var12 = null;
      var12 = new Color(var9, var10, var11);
      return var12;
   }

   public static Color C(Color var0, Color var1, double var2) {
      double var4 = var2 / 4.0D % 1.0D;
      float var6 = o0.O((float)Math.sin(18.84955592153876D * var4) / 2.0F + 0.5F, 0.0F, 1.0F);
      return new Color(o0.e((float)var0.getRed() / 255.0F, (float)var1.getRed() / 255.0F, var6), o0.e((float)var0.getGreen() / 255.0F, (float)var1.getGreen() / 255.0F, var6), o0.e((float)var0.getBlue() / 255.0F, (float)var1.getBlue() / 255.0F, var6));
   }

   public static int p(int var0, int var1) {
      float var2 = su.f.e() * 1000.0F;

      float var3;
      for(var3 = (float)(System.currentTimeMillis() % (long)((int)var2) + (long)(var0 - var1) * 9L); var3 > var2; var3 -= var2) {
         ;
      }

      var3 = var3 / var2;
      if((double)var3 > 0.5D) {
         var3 = 0.5F - (var3 - 0.5F);
      }

      var3 = var3 + 0.5F;
      return Color.HSBtoRGB(var3, 0.6F, 1.0F);
   }

   public static Color t(int var0, int var1) {
      float var2 = 2900.0F;

      float var3;
      for(var3 = (float)(System.currentTimeMillis() % (long)((int)var2)) + (float)((var1 - var0) * 9); var3 > var2; var3 -= var2) {
         ;
      }

      var3 = var3 / var2;
      if((double)var3 > 0.5D) {
         var3 = 0.5F - (var3 - 0.5F);
      }

      var3 = var3 + 0.5F;
      return new Color(var3, 0.5F, 1.0F);
   }

   public static Color j(int var0, float var1, float var2) {
      double var3 = Math.ceil((double)((System.currentTimeMillis() + (long)var0) / 16L));
      var3 = var3 % 360.0D;
      return Color.getHSBColor((float)(var3 / 360.0D), var1, var2);
   }

   public static Color w(Color var0, Color var1, double var2) {
      if(var2 > 1.0D) {
         double var4 = var2 % 1.0D;
         int var6 = (int)var2;
         var2 = var6 % 2 == 0?var4:1.0D - var4;
      }

      double var9 = 1.0D - var2;
      int var10 = (int)((double)var0.getRed() * var9 + (double)var1.getRed() * var2);
      int var7 = (int)((double)var0.getGreen() * var9 + (double)var1.getGreen() * var2);
      int var8 = (int)((double)var0.getBlue() * var9 + (double)var1.getBlue() * var2);
      return new Color(var10, var7, var8);
   }

   public static int w(int var0, float var1, float var2) {
      double var3 = Math.ceil((double)((System.currentTimeMillis() + (long)var0) / 16L));
      var3 = var3 % 360.0D;
      return Color.getHSBColor((float)(var3 / 360.0D), var1, var2).getRGB();
   }

   public static void P(int[] var0) {
      B = var0;
   }

   public static int[] Q() {
      return B;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   static {
      P(new int[5]);
   }
}
