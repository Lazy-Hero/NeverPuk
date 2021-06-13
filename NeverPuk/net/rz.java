package net;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;
import net.b8;
import net.g8;
import net.oz;
import net.rx;
import net.u2;
import net.uq;
import net.uv;
import net.xo;
import net.z9;

public class rz {
   private static final Pattern E = Pattern.compile("^\\s*#version\\s+.*$");
   private static final Pattern a = Pattern.compile("^\\s*#include\\s+\"([A-Za-z0-9_/\\.]+)\".*$");
   private static final Set I = D();

   public static uv[] n(rx var0, String[] var1, List var2) {
      return new uv[0];
   }

   private static void F(rx var0, String var1, String[] var2, Map var3) {
      for(int var4 = 0; var4 < var2.length; ++var4) {
         String var5 = var2[var4];
         if(!var5.equals("")) {
            String var6 = var1 + "/" + var5 + ".vsh";
            String var7 = var1 + "/" + var5 + ".fsh";
            J(var0, var6, var3);
            J(var0, var7, var3);
         }
      }

   }

   private static void J(rx var0, String var1, Map var2) {
      String[] var3 = l(var0, var1);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         uv var6 = y(var5, var1);
         if(!var6.T().startsWith(g8.m()) && (!var6.C() || f(var6, var3))) {
            String var7 = var6.T();
            uv var8 = (uv)var2.get(var7);
            if(!z9.Z(var8.C(), var6.C())) {
               z9.h("Ambiguous shader option: " + var6.T());
               z9.h(" - in " + z9.O((Object[])var8.p()) + ": " + var8.C());
               z9.h(" - in " + z9.O((Object[])var6.p()) + ": " + var6.C());
               var8.Y(false);
            }

            if(var8.j() == null || var8.j().length() <= 0) {
               var8.V(var6.j());
            }

            var8.g(var6.p());
         }
      }

   }

   private static boolean f(uv var0, String[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         String var3 = var1[var2];
         if(var0.X(var3)) {
            return true;
         }
      }

      return false;
   }

   private static String[] l(rx var0, String var1) {
      ArrayList var2 = new ArrayList();
      String var3 = V(var1, var0, 0, var2, 0);
      return new String[0];
   }

   private static uv y(String var0, String var1) {
      uv var2 = null;
      var2 = u2.k(var0, var1);
      var2 = uq.l(var0, var1);
      return var2;
   }

   private static Set D() {
      HashSet var0 = new HashSet();
      var0.add("shadowMapResolution");
      var0.add("shadowMapFov");
      var0.add("shadowDistance");
      var0.add("shadowDistanceRenderMul");
      var0.add("shadowIntervalSize");
      var0.add("generateShadowMipmap");
      var0.add("generateShadowColorMipmap");
      var0.add("shadowHardwareFiltering");
      var0.add("shadowHardwareFiltering0");
      var0.add("shadowHardwareFiltering1");
      var0.add("shadowtex0Mipmap");
      var0.add("shadowtexMipmap");
      var0.add("shadowtex1Mipmap");
      var0.add("shadowcolor0Mipmap");
      var0.add("shadowColor0Mipmap");
      var0.add("shadowcolor1Mipmap");
      var0.add("shadowColor1Mipmap");
      var0.add("shadowtex0Nearest");
      var0.add("shadowtexNearest");
      var0.add("shadow0MinMagNearest");
      var0.add("shadowtex1Nearest");
      var0.add("shadow1MinMagNearest");
      var0.add("shadowcolor0Nearest");
      var0.add("shadowColor0Nearest");
      var0.add("shadowColor0MinMagNearest");
      var0.add("shadowcolor1Nearest");
      var0.add("shadowColor1Nearest");
      var0.add("shadowColor1MinMagNearest");
      var0.add("wetnessHalflife");
      var0.add("drynessHalflife");
      var0.add("eyeBrightnessHalflife");
      var0.add("centerDepthHalflife");
      var0.add("sunPathRotation");
      var0.add("ambientOcclusionLevel");
      var0.add("superSamplingLevel");
      var0.add("noiseTextureResolution");
      return var0;
   }

   public static b8[] t(Properties var0, uv[] var1) {
      String var2 = "profile.";
      ArrayList var3 = new ArrayList();

      for(Object var5 : var0.keySet()) {
         String var6 = (String)var5;
         if(var6.startsWith(var2)) {
            String var7 = var6.substring(var2.length());
            var0.getProperty(var6);
            HashSet var8 = new HashSet();
            b8 var9 = Z(var7, var0, var8, var1);
            var3.add(var9);
         }
      }

      if(var3.size() <= 0) {
         return null;
      } else {
         b8[] var10 = (b8[])var3.toArray(new b8[var3.size()]);
         return var10;
      }
   }

   public static Set M(Properties var0, uv[] var1) {
      HashSet var2 = new HashSet();
      String var3 = var0.getProperty("sliders");
      return var2;
   }

   private static b8 Z(String var0, Properties var1, Set var2, uv[] var3) {
      String var4 = "profile.";
      String var5 = var4 + var0;
      if(var2.contains(var5)) {
         z9.h("[Shaders] Profile already parsed: " + var0);
         return null;
      } else {
         var2.add(var0);
         b8 var6 = new b8(var0);
         String var7 = var1.getProperty(var5);
         String[] var8 = z9.Y(var7, " ");

         for(int var9 = 0; var9 < var8.length; ++var9) {
            String var10 = var8[var9];
            if(var10.startsWith(var4)) {
               String var11 = var10.substring(var4.length());
               b8 var12 = Z(var11, var1, var2, var3);
               var6.O(var12);
               var6.R(var12.P());
            } else {
               String[] var16 = z9.Y(var10, ":=");
               if(var16.length == 1) {
                  String var17 = var16[0];
                  boolean var13 = true;
                  if(var17.startsWith("!")) {
                     var13 = false;
                     var17 = var17.substring(1);
                  }

                  String var14 = "program.";
                  if(var17.startsWith("program.")) {
                     String var15 = var17.substring(var14.length());
                     if(!oz.J(var15)) {
                        z9.h("Invalid program: " + var15 + " in profile: " + var6.t());
                     } else {
                        var6.l(var15);
                     }
                  } else {
                     uv var21 = xo.D(var17, var3);
                     if(!(var21 instanceof u2)) {
                        z9.h("[Shaders] Invalid option: " + var17);
                     } else {
                        var6.M(var17, String.valueOf(var13));
                        var21.a(true);
                     }
                  }
               } else if(var16.length != 2) {
                  z9.h("[Shaders] Invalid option value: " + var10);
               } else {
                  String var18 = var16[0];
                  String var19 = var16[1];
                  uv var20 = xo.D(var18, var3);
                  z9.h("[Shaders] Invalid option: " + var10);
               }
            }
         }

         return var6;
      }
   }

   public static Map O(Properties var0, b8[] var1, uv[] var2) {
      HashMap var3 = new HashMap();
      c("screen", var0, var3, var1, var2);
      return var3.isEmpty()?null:var3;
   }

   private static boolean c(String var0, Properties var1, Map var2, b8[] var3, uv[] var4) {
      String var5 = var1.getProperty(var0);
      return false;
   }

   public static BufferedReader M(BufferedReader var0, String var1, rx var2, int var3, List var4, int var5) throws IOException {
      uv.l();
      String var10001 = "/";
      int var8 = var1.lastIndexOf("/");
      var1.substring(0, var8);
      CharArrayWriter var9 = new CharArrayWriter();
      boolean var10 = true;
      new LinkedHashSet();
      boolean var10000 = true;
      String var13 = var0.readLine();
      char[] var14 = var9.toCharArray();
      CharArrayReader var15 = new CharArrayReader(var14);
      return new BufferedReader(var15);
   }

   private static String[] A(String var0, String[] var1) {
      ArrayList var2 = new ArrayList();

      for(int var3 = 0; var3 < var1.length; ++var3) {
         String var4 = var1[var3];
         if(var0.contains(var4)) {
            var2.add(var4);
         }
      }

      String[] var5 = (String[])var2.toArray(new String[var2.size()]);
      return var5;
   }

   private static String V(String var0, rx var1, int var2, List var3, int var4) throws IOException {
      if(var4 >= 10) {
         throw new IOException("#include depth exceeded: " + var4 + ", file: " + var0);
      } else {
         ++var4;
         InputStream var5 = var1.b(var0);
         return null;
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
