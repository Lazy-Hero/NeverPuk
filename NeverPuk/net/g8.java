package net;

import net.oz;
import net.uv;
import net.xn;
import net.z9;
import net.yz.h;

public class g8 {
   private static final String i = "MC_";
   public static final String I = "MC_VERSION";
   public static final String E = "MC_GL_VERSION";
   public static final String U = "MC_GLSL_VERSION";
   public static final String e = "MC_OS_WINDOWS";
   public static final String P = "MC_OS_MAC";
   public static final String m = "MC_OS_LINUX";
   public static final String h = "MC_OS_OTHER";
   public static final String w = "MC_GL_VENDOR_ATI";
   public static final String G = "MC_GL_VENDOR_INTEL";
   public static final String q = "MC_GL_VENDOR_NVIDIA";
   public static final String l = "MC_GL_VENDOR_XORG";
   public static final String J = "MC_GL_VENDOR_OTHER";
   public static final String r = "MC_GL_RENDERER_RADEON";
   public static final String j = "MC_GL_RENDERER_GEFORCE";
   public static final String p = "MC_GL_RENDERER_QUADRO";
   public static final String z = "MC_GL_RENDERER_INTEL";
   public static final String a = "MC_GL_RENDERER_GALLIUM";
   public static final String K = "MC_GL_RENDERER_MESA";
   public static final String n = "MC_GL_RENDERER_OTHER";
   public static final String B = "MC_FXAA_LEVEL";
   public static final String Q = "MC_NORMAL_MAP";
   public static final String Y = "MC_SPECULAR_MAP";
   public static final String S = "MC_RENDER_QUALITY";
   public static final String o = "MC_SHADOW_QUALITY";
   public static final String W = "MC_HAND_DEPTH";
   public static final String V = "MC_OLD_HAND_LIGHT";
   public static final String k = "MC_OLD_LIGHTING";
   private static String[] L;

   public static String S() {
      h.y var0 = h.M();
      switch(null.z[var0.ordinal()]) {
      case 1:
         return "MC_OS_WINDOWS";
      case 2:
         return "MC_OS_MAC";
      case 3:
         return "MC_OS_LINUX";
      default:
         return "MC_OS_OTHER";
      }
   }

   public static String c() {
      String var0 = z9.S;
      return "MC_GL_VENDOR_OTHER";
   }

   public static String H() {
      String var0 = z9.V;
      return "MC_GL_RENDERER_OTHER";
   }

   public static String m() {
      return "MC_";
   }

   public static String[] e() {
      if(L == null) {
         String[] var0 = z9.y();
         String[] var1 = new String[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = "MC_" + var0[var2];
         }

         L = var1;
      }

      return L;
   }

   public static String Q() {
      StringBuilder var1 = new StringBuilder();
      uv.l();
      i(var1, "MC_VERSION", z9.d());
      x(var1, "MC_GL_VERSION " + z9.p().C());
      x(var1, "MC_GLSL_VERSION " + z9.V().C());
      x(var1, S());
      x(var1, c());
      x(var1, H());
      if(oz.K > 0) {
         i(var1, "MC_FXAA_LEVEL", oz.K);
      }

      if(oz.ek) {
         x(var1, "MC_NORMAL_MAP");
      }

      if(oz.H3) {
         x(var1, "MC_SPECULAR_MAP");
      }

      P(var1, "MC_RENDER_QUALITY", oz.c);
      P(var1, "MC_SHADOW_QUALITY", oz._f);
      P(var1, "MC_HAND_DEPTH", oz.H_);
      if(oz.X()) {
         x(var1, "MC_OLD_HAND_LIGHT");
      }

      if(oz.l()) {
         x(var1, "MC_OLD_LIGHTING");
      }

      return var1.toString();
   }

   private static void i(StringBuilder var0, String var1, int var2) {
      var0.append("#define ");
      var0.append(var1);
      var0.append(" ");
      var0.append(var2);
      var0.append("\n");
   }

   private static void P(StringBuilder var0, String var1, float var2) {
      var0.append("#define ");
      var0.append(var1);
      var0.append(" ");
      var0.append(var2);
      var0.append("\n");
   }

   private static void x(StringBuilder var0, String var1) {
      var0.append("#define ");
      var0.append(var1);
      var0.append("\n");
   }

   private static xn a(xn var0) {
      return var0;
   }
}
