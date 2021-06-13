package net;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.m8;
import net.uv;
import net.wh;
import net.xn;
import net.z9;

public class u2 extends uv {
   private static final Pattern S = Pattern.compile("^\\s*(//)?\\s*#define\\s+([A-Za-z0-9_]+)\\s*(//.*)?$");
   private static final Pattern K = Pattern.compile("^\\s*#if(n)?def\\s+([A-Za-z0-9_]+)(\\s*)?$");

   public u2(String var1, String var2, String var3, String var4) {
      super(var1, var2, var3, new String[]{"false", "true"}, var3, var4);
   }

   public String v() {
      return L(this.N())?"#define " + this.T() + " // Shader option ON":"//#define " + this.T() + " // Shader option OFF";
   }

   public String n(String var1) {
      String var2 = super.n(var1);
      return var2 != var1?var2:(L(var1)?m8.b():m8.o());
   }

   public String v(String var1) {
      return L(var1)?"§a":"§c";
   }

   public static uv k(String var0, String var1) {
      uv.l();
      Matcher var3 = S.matcher(var0);
      if(!var3.matches()) {
         return null;
      } else {
         String var4 = var3.group(1);
         String var5 = var3.group(2);
         String var6 = var3.group(3);
         if(var5 != null && var5.length() > 0) {
            boolean var7 = z9.Z(var4, "//");
            boolean var8 = !var7;
            var1 = wh.s(var1, "/shaders/");
            u2 var9 = new u2(var5, var6, String.valueOf(var8), var1);
            return var9;
         } else {
            return null;
         }
      }
   }

   public boolean o(String var1) {
      Matcher var2 = S.matcher(var1);
      if(!var2.matches()) {
         return false;
      } else {
         String var3 = var2.group(2);
         return var3.matches(this.T());
      }
   }

   public boolean C() {
      return true;
   }

   public boolean X(String var1) {
      Matcher var2 = K.matcher(var1);
      if(var2.matches()) {
         String var3 = var2.group(2);
         return var3.equals(this.T());
      } else {
         return false;
      }
   }

   public static boolean L(String var0) {
      return Boolean.valueOf(var0).booleanValue();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
