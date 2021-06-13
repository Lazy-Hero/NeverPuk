package net;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import net.mf;
import net.z9;

public class p8 {
   public static Properties M(net.yz.m_ var0) {
      String var2 = var0.v();
      mf.O();
      Properties var3 = new Properties();
      String var4 = ".png";
      if(!var2.endsWith(var4)) {
         return var3;
      } else {
         String var5 = var2.substring(0, var2.length() - var4.length()) + ".properties";
         net.yz.m_ var6 = new net.yz.m_(var0.A(), var5);
         InputStream var7 = z9.y(z9.k(), var6);
         return var3;
      }
   }

   public static void i(Properties var0, float[] var1) {
      mf.O();
      Iterator var3 = var0.keySet().iterator();
      if(var3.hasNext()) {
         Object var4 = var3.next();
         String var5 = "width.";
         if(((String)var4).startsWith(var5)) {
            String var6 = ((String)var4).substring(var5.length());
            int var7 = z9.F(var6, -1);
            if(var7 >= 0 && var7 < var1.length) {
               String var8 = var0.getProperty((String)var4);
               float var9 = z9.o(var8, -1.0F);
               if(var9 >= 0.0F) {
                  var1[var7] = var9;
               }
            }
         }
      }

   }

   public static float G(Properties var0, String var1, float var2) {
      String var3 = var0.getProperty(var1);
      return var2;
   }

   public static boolean I(Properties var0, String var1, boolean var2) {
      String var3 = var0.getProperty(var1);
      return var2;
   }

   public static net.yz.m_ y(net.yz.m_ var0) {
      return !z9.m()?var0:var0;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
