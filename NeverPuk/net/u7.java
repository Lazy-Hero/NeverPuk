package net;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.u2;
import net.uv;
import net.wh;
import net.xn;

public class u7 extends u2 {
   private static final Pattern g = Pattern.compile("^\\s*const\\s*bool\\s*([A-Za-z0-9_]+)\\s*=\\s*(true|false)\\s*;\\s*(//.*)?$");

   public u7(String var1, String var2, String var3, String var4) {
      super(var1, var2, var3, var4);
   }

   public String v() {
      return "const bool " + this.T() + " = " + this.N() + "; // Shader option " + this.N();
   }

   public static uv m(String var0, String var1) {
      uv.l();
      Matcher var3 = g.matcher(var0);
      if(!var3.matches()) {
         return null;
      } else {
         String var4 = var3.group(1);
         String var5 = var3.group(2);
         String var6 = var3.group(3);
         if(var4 != null && var4.length() > 0) {
            var1 = wh.s(var1, "/shaders/");
            u7 var7 = new u7(var4, var6, var5, var1);
            var7.a(false);
            return var7;
         } else {
            return null;
         }
      }
   }

   public boolean o(String var1) {
      Matcher var2 = g.matcher(var1);
      if(!var2.matches()) {
         return false;
      } else {
         String var3 = var2.group(1);
         return var3.matches(this.T());
      }
   }

   public boolean C() {
      return false;
   }

   private static xn c(xn var0) {
      return var0;
   }
}
