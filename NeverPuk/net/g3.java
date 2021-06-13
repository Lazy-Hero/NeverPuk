package net;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.i6;
import net.mf;
import net.wh;
import net.z9;
import net.c9.a;
import net.c9.d;
import net.c9.k;
import net.c9.x;

public class g3 {
   public static String[] S(String var0, String var1) {
      return r(new String[]{var0}, new String[]{var1});
   }

   public static String[] r(String[] var0, String[] var1) {
      LinkedHashSet var2 = new LinkedHashSet();
      x[] var3 = z9.w();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         x var5 = var3[var4];
         String[] var6 = R(var5, var0, var1, (String[])null);
         var2.addAll(Arrays.asList(var6));
      }

      String[] var7 = (String[])var2.toArray(new String[var2.size()]);
      return var7;
   }

   public static String[] f(x var0, String var1, String var2, String[] var3) {
      return R(var0, new String[]{var1}, new String[]{var2}, var3);
   }

   public static String[] u(x var0, String[] var1, String[] var2) {
      return R(var0, var1, var2, (String[])null);
   }

   public static String[] R(x var0, String[] var1, String[] var2, String[] var3) {
      if(var0 instanceof a) {
         return l(var0, var3);
      } else if(var0 instanceof k) {
         x var6 = (x)i6.G((Object)var0, (mf)i6.Y);
         z9.h("LegacyV2Adapter base resource pack not found: " + var0);
         return new String[0];
      } else if(!(var0 instanceof d)) {
         z9.h("Unknown resource pack type: " + var0);
         return new String[0];
      } else {
         d var4 = (d)var0;
         File var5 = var4.v;
         return new String[0];
      }
   }

   private static String[] l(x var0, String[] var1) {
      return new String[0];
   }

   private static String[] n(File var0, String var1, String[] var2, String[] var3) {
      new ArrayList();
      String var10000 = "assets/minecraft/";
      mf.O();
      File[] var7 = var0.listFiles();
      return new String[0];
   }

   private static String[] U(File var0, String[] var1, String[] var2) {
      ArrayList var3 = new ArrayList();
      String var4 = "assets/minecraft/";
      ZipFile var5 = new ZipFile(var0);
      Enumeration var6 = var5.entries();

      while(var6.hasMoreElements()) {
         ZipEntry var7 = (ZipEntry)var6.nextElement();
         String var8 = var7.getName();
         if(var8.startsWith(var4)) {
            var8 = var8.substring(var4.length());
            if(wh.i(var8, var1) && wh.T(var8, var2)) {
               if(!t(var8)) {
                  z9.h("Skipping non-lowercase path: " + var8);
               } else {
                  var3.add(var8);
               }
            }
         }
      }

      var5.close();
      String[] var9 = (String[])((String[])var3.toArray(new String[var3.size()]));
      return var9;
   }

   private static boolean t(String var0) {
      return var0.equals(var0.toLowerCase(Locale.ROOT));
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
