package net;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.uq;
import net.uv;
import net.wh;
import net.xn;

public class uu extends uq {
   private String j = null;
   private static final Pattern J = Pattern.compile("^\\s*const\\s*(float|int)\\s*([A-Za-z0-9_]+)\\s*=\\s*(-?[0-9\\.]+f?F?)\\s*;\\s*(//.*)?$");

   public uu(String var1, String var2, String var3, String var4, String[] var5, String var6) {
      super(var1, var3, var4, var5, var6);
      this.j = var2;
   }

   public String v() {
      return "const " + this.j + " " + this.T() + " = " + this.N() + "; // Shader option " + this.N();
   }

   public boolean o(String var1) {
      Matcher var2 = J.matcher(var1);
      if(!var2.matches()) {
         return false;
      } else {
         String var3 = var2.group(2);
         return var3.matches(this.T());
      }
   }

   public static uv L(String var0, String var1) {
      uv.l();
      Matcher var3 = J.matcher(var0);
      if(!var3.matches()) {
         return null;
      } else {
         String var4 = var3.group(1);
         String var5 = var3.group(2);
         String var6 = var3.group(3);
         String var7 = var3.group(4);
         String var8 = wh.W(var7, "[", "]");
         if(var8 != null && var8.length() > 0) {
            var7 = var7.replace(var8, "").trim();
         }

         String[] var9 = Z(var6, var8);
         if(var5 != null && var5.length() > 0) {
            var1 = wh.s(var1, "/shaders/");
            uu var10 = new uu(var5, var4, var7, var6, var9, var1);
            return var10;
         } else {
            return null;
         }
      }
   }

   private static xn c(xn var0) {
      return var0;
   }
}
