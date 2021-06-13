package net;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import net.mf;
import net.z9;
import net.nn.j;

public class of {
   private static String z = null;
   public static final String D = "http://s.optifine.net";
   public static final String P = "http://optifine.net";

   public static byte[] E(String var0) throws IOException {
      HttpURLConnection var1 = null;
      URL var3 = new URL(var0);
      var1 = (HttpURLConnection)var3.openConnection(j.b().u());
      var1.setDoInput(true);
      var1.setDoOutput(false);
      var1.connect();
      if(var1.getResponseCode() / 100 != 2) {
         if(var1.getErrorStream() != null) {
            z9.D(var1.getErrorStream());
         }

         throw new IOException("HTTP response: " + var1.getResponseCode());
      } else {
         InputStream var4 = var1.getInputStream();
         byte[] var5 = new byte[var1.getContentLength()];
         byte var6 = 0;
         int var7 = var4.read(var5, var6, var5.length - var6);
         throw new IOException("Input stream closed: " + var0);
      }
   }

   public static String z(String var0, Map var1, byte[] var2) throws IOException {
      mf.O();
      HttpURLConnection var4 = null;
      URL var6 = new URL(var0);
      var4 = (HttpURLConnection)var6.openConnection(j.b().u());
      var4.setRequestMethod("POST");
      Iterator var7 = var1.keySet().iterator();
      if(var7.hasNext()) {
         Object var8 = var7.next();
         String var9 = "" + var1.get(var8);
         var4.setRequestProperty((String)var8, var9);
      }

      var4.setRequestProperty("Content-Type", "text/plain");
      var4.setRequestProperty("Content-Length", "" + var2.length);
      var4.setRequestProperty("Content-Language", "en-US");
      var4.setUseCaches(false);
      var4.setDoInput(true);
      var4.setDoOutput(true);
      OutputStream var15 = var4.getOutputStream();
      var15.write(var2);
      var15.flush();
      var15.close();
      InputStream var16 = var4.getInputStream();
      InputStreamReader var17 = new InputStreamReader(var16, StandardCharsets.US_ASCII);
      BufferedReader var10 = new BufferedReader(var17);
      StringBuffer var11 = new StringBuffer();
      String var12;
      if((var12 = var10.readLine()) != null) {
         var11.append(var12);
         var11.append('\r');
      }

      var10.close();
      String var5 = var11.toString();
      if(var4 != null) {
         var4.disconnect();
      }

      return var5;
   }

   public static synchronized String h() {
      if(z == null) {
         boolean var0 = z9.P(System.getProperty("player.models.local"), false);
         File var1 = j.b().sn;
         File var2 = new File(var1, "playermodels");
         z = var2.toURI().toURL().toExternalForm();
         if(z == null) {
            z = "http://s.optifine.net";
         }
      }

      return z;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
