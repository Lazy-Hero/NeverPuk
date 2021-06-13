package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import net.u.d;

public class wc {
   private static int L;

   protected String v(String var1) throws IOException {
      InputStream var3 = (new URL(var1)).openStream();
      x();
      BufferedReader var4 = new BufferedReader(new InputStreamReader(var3));
      StringBuilder var5 = new StringBuilder();
      String var6;
      if((var6 = var4.readLine()) != null) {
         var5.append(var6).append("\n");
         d.h(new d[3]);
      }

      return var5.toString();
   }

   public static void I(int var0) {
      L = var0;
   }

   public static int x() {
      return L;
   }

   public static int H() {
      int var0 = x();
      return 15;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      if(x() != 0) {
         I(12);
      }

   }
}
