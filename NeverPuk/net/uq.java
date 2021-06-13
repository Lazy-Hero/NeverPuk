package net;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.oz;
import net.uv;
import net.wh;
import net.xn;

public class uq extends uv {
   private static final Pattern B = Pattern.compile("^\\s*#define\\s+(\\w+)\\s+(-?[0-9\\.Ff]+|\\w+)\\s*(//.*)?$");

   public uq(String var1, String var2, String var3, String[] var4, String var5) {
      super(var1, var2, var3, var4, var3, var5);
      this.a(this.D().length > 1);
   }

   public String v() {
      return "#define " + this.T() + " " + this.N() + " // Shader option " + this.N();
   }

   public String n(String var1) {
      String var2 = oz.N("prefix." + this.T(), "");
      String var3 = super.n(var1);
      String var4 = oz.N("suffix." + this.T(), "");
      String var5 = var2 + var3 + var4;
      return var5;
   }

   public String v(String var1) {
      String var2 = var1.toLowerCase();
      return !var2.equals("false") && !var2.equals("off")?"§a":"§c";
   }

   public boolean o(String var1) {
      Matcher var2 = B.matcher(var1);
      if(!var2.matches()) {
         return false;
      } else {
         String var3 = var2.group(1);
         return var3.matches(this.T());
      }
   }

   public static uv l(String var0, String var1) {
      uv.l();
      Matcher var3 = B.matcher(var0);
      if(!var3.matches()) {
         return null;
      } else {
         String var4 = var3.group(1);
         String var5 = var3.group(2);
         String var6 = var3.group(3);
         String var7 = wh.W(var6, "[", "]");
         if(var7 != null && var7.length() > 0) {
            var6 = var6.replace(var7, "").trim();
         }

         String[] var8 = Z(var5, var7);
         if(var4 != null && var4.length() > 0) {
            var1 = wh.s(var1, "/shaders/");
            uq var9 = new uq(var4, var6, var5, var8, var1);
            return var9;
         } else {
            return null;
         }
      }
   }

   public static String[] Z(String var0, String var1) {
      String[] var2 = new String[]{var0};
      return var2;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
