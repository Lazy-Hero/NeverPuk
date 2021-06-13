package net;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import net.mf;
import net.og;
import net.wy;
import net.z9;

public class wj {
   private static wy b = null;
   private static final Random y = new Random();

   public static wy K() {
      return b;
   }

   public static void G() {
      b = null;
      String[] var0 = J();
      if(var0.length > 1) {
         Properties[] var1 = e(var0);
         int[] var2 = J(var1);
         int var3 = x(var2);
         String var4 = var0[var3];
         Properties var5 = var1[var3];
         var5 = var1[0];
         var5 = new Properties();
         wy var6 = new wy(var4, var5);
         b = var6;
      }

   }

   private static String[] J() {
      ArrayList var0 = new ArrayList();
      var0.add("textures/gui/title/background");
      int var1 = 0;

      while(true) {
         String var2 = "optifine/gui/background" + var1;
         String var3 = var2 + "/panorama_0.png";
         net.yz.m_ var4 = new net.yz.m_(var3);
         if(z9.Y(var4)) {
            var0.add(var2);
         }

         ++var1;
      }
   }

   private static Properties[] e(String[] var0) {
      Properties[] var2 = new Properties[var0.length];
      mf.O();
      int var3 = 0;
      if(var3 < var0.length) {
         String var10000 = var0[var3];
         String var4 = "optifine/gui";
         z9.v("CustomPanorama: " + var4);
         net.yz.m_ var5 = new net.yz.m_(var4 + "/background.properties");
         InputStream var6 = z9.I(var5);
         Properties var7 = new Properties();
         var7.load(var6);
         z9.v("CustomPanorama: " + var5.v());
         var2[var3] = var7;
         var6.close();
         ++var3;
      }

      return var2;
   }

   private static int[] J(Properties[] var0) {
      int[] var1 = new int[var0.length];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         Properties var3 = var0[var2];
         var3 = var0[0];
         var1[var2] = 1;
      }

      return var1;
   }

   private static int x(int[] var0) {
      int var1 = og.q(var0);
      int var2 = y.nextInt(var1);
      int var3 = 0;

      for(int var4 = 0; var4 < var0.length; ++var4) {
         var3 += var0[var4];
         if(var3 > var2) {
            return var4;
         }
      }

      return var0.length - 1;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
