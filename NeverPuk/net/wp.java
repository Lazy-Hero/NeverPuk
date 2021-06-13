package net;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import javax.imageio.ImageIO;
import net.g3;
import net.mb;
import net.mf;
import net.os;
import net.z9;
import net.c9.x;

public class wp {
   private static mb[] d = null;

   public static void X() {
      d = null;
   }

   public static void J() {
      d = null;
      x[] var0 = z9.w();
      d = K(var0);
      if(z9.K()) {
         i();
      }

   }

   public static void m() {
      if(d != null && z9.K()) {
         i();
      }

   }

   public static void i() {
      if(d != null) {
         for(int var0 = 0; var0 < d.length; ++var0) {
            mb var1 = d[var0];
            var1.F();
         }
      }

   }

   public static mb[] K(x[] var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         x var3 = var0[var2];
         mb[] var4 = Z(var3);
         var1.addAll(Arrays.asList(var4));
      }

      mb[] var5 = (mb[])((mb[])var1.toArray(new mb[var1.size()]));
      return var5;
   }

   public static mb[] Z(x var0) {
      String[] var1 = g3.f(var0, "mcpatcher/anim/", ".properties", (String[])null);
      if(var1.length <= 0) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         for(int var3 = 0; var3 < var1.length; ++var3) {
            String var4 = var1[var3];
            z9.v("Texture animation: " + var4);
            net.yz.m_ var5 = new net.yz.m_(var4);
            InputStream var6 = var0.q(var5);
            Properties var7 = new Properties();
            var7.load(var6);
            mb var8 = H(var7, var5);
            net.yz.m_ var9 = new net.yz.m_(var8.N());
            if(z9.V(var9) != var0) {
               z9.v("Skipped: " + var4 + ", target texture not loaded from same resource pack");
            } else {
               var2.add(var8);
            }
         }

         mb[] var10 = (mb[])((mb[])var2.toArray(new mb[var2.size()]));
         return var10;
      }
   }

   public static mb H(Properties var0, net.yz.m_ var1) {
      String var3 = var0.getProperty("from");
      String var4 = var0.getProperty("to");
      int var5 = z9.F(var0.getProperty("x"), -1);
      mf.O();
      int var6 = z9.F(var0.getProperty("y"), -1);
      int var7 = z9.F(var0.getProperty("w"), -1);
      int var8 = z9.F(var0.getProperty("h"), -1);
      if(var3 != null && var4 != null) {
         if(var5 >= 0 && var6 >= 0 && var7 >= 0 && var8 >= 0) {
            var3 = var3.trim();
            var4 = var4.trim();
            String var9 = os.K(var1.v());
            var3 = os.b(var3, var9);
            var4 = os.b(var4, var9);
            byte[] var10 = z(var3, var7);
            if(var10 == null) {
               z9.h("TextureAnimation: Source texture not found: " + var4);
               return null;
            } else {
               int var11 = var10.length / 4;
               int var12 = var11 / (var7 * var8);
               int var13 = var12 * var7 * var8;
               if(var11 != var13) {
                  z9.h("TextureAnimation: Source texture has invalid number of frames: " + var3 + ", frames: " + (float)var11 / (float)(var7 * var8));
                  return null;
               } else {
                  net.yz.m_ var14 = new net.yz.m_(var4);
                  InputStream var15 = z9.I(var14);
                  if(var15 == null) {
                     z9.h("TextureAnimation: Target texture not found: " + var4);
                     return null;
                  } else {
                     BufferedImage var16 = N(var15);
                     if(var5 + var7 <= var16.getWidth() && var6 + var8 <= var16.getHeight()) {
                        mb var17 = new mb(var3, var10, var4, var14, var5, var6, var7, var8, var0, 1);
                        return var17;
                     } else {
                        z9.h("TextureAnimation: Animation coordinates are outside the target texture: " + var4);
                        return null;
                     }
                  }
               }
            }
         } else {
            z9.h("TextureAnimation: Invalid coordinates");
            return null;
         }
      } else {
         z9.h("TextureAnimation: Source or target texture not specified");
         return null;
      }
   }

   public static byte[] z(String var0, int var1) {
      byte[] var2 = y(var0, var1);
      var2 = y("/anim" + var0, var1);
      return var2;
   }

   private static byte[] y(String var0, int var1) {
      z9.d();
      net.yz.m_ var3 = new net.yz.m_(var0);
      InputStream var4 = z9.I(var3);
      return null;
   }

   private static BufferedImage N(InputStream var0) throws IOException {
      BufferedImage var1 = ImageIO.read(var0);
      var0.close();
      return var1;
   }

   public static BufferedImage c(BufferedImage var0, int var1, int var2) {
      BufferedImage var3 = new BufferedImage(var1, var2, 2);
      Graphics2D var4 = var3.createGraphics();
      var4.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
      var4.drawImage(var0, 0, 0, var1, var2, (ImageObserver)null);
      return var3;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
