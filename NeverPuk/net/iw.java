package net;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.g6;

public class iw {
   public static void b(String var0, File var1) {
      int[] var2 = g6.z.W();
      if(var1.getParentFile() != null && !var1.getParentFile().exists()) {
         var1.getParentFile().mkdirs();
      }

      HttpsURLConnection var3 = (HttpsURLConnection)(new URL(var0)).openConnection();
      InputStream var4 = var3.getInputStream();
      Object var5 = null;
      FileOutputStream var6 = new FileOutputStream(var1);
      Object var7 = null;
      byte[] var8 = new byte[8192];
      int var9;
      if((var9 = var4.read(var8)) > -1) {
         var6.write(var8, 0, var9);
      }

      var6.close();
      var4.close();
      var3.disconnect();
   }

   public static void Y(String var0) {
      Desktop.getDesktop().browse(new URI(var0));
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
