package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import net.mf;
import net.ph;
import net.w2;
import net.xw;
import net.xz;
import net.z9;
import net.ze;

public class oo {
   private static final Map C = new HashMap();
   public static final String d = "User-Agent";
   public static final String r = "Host";
   public static final String t = "Accept";
   public static final String R = "Location";
   public static final String V = "Keep-Alive";
   public static final String S = "Connection";
   public static final String Q = "keep-alive";
   public static final String K = "Transfer-Encoding";
   public static final String h = "chunked";

   public static void b(String var0, xz var1) throws IOException {
      x(var0, var1, Proxy.NO_PROXY);
   }

   public static void x(String var0, xz var1, Proxy var2) throws IOException {
      xw var3 = l(var0, var2);
      ze var4 = new ze(var3, var1);
      p(var4);
   }

   public static xw l(String var0, Proxy var1) throws IOException {
      mf.O();
      URL var3 = new URL(var0);
      if(!var3.getProtocol().equals("http")) {
         throw new IOException("Only protocol http is supported: " + var3);
      } else {
         String var4 = var3.getFile();
         String var5 = var3.getHost();
         int var6 = var3.getPort();
         if(var6 <= 0) {
            var6 = 80;
         }

         String var7 = "GET";
         String var8 = "HTTP/1.1";
         LinkedHashMap var9 = new LinkedHashMap();
         var9.put("User-Agent", "Java/" + System.getProperty("java.version"));
         var9.put("Host", var5);
         var9.put("Accept", "text/html, image/gif, image/png");
         var9.put("Connection", "keep-alive");
         byte[] var10 = new byte[0];
         xw var11 = new xw(var5, var6, var1, var7, var4, var8, var9, var10);
         return var11;
      }
   }

   public static void p(ze var0) {
      xw var1 = var0.f();

      for(ph var2 = H(var1.L(), var1.p(), var1.J()); !var2.N(var0); var2 = H(var1.L(), var1.p(), var1.J())) {
         I(var1.L(), var1.p(), var1.J(), var2);
      }

   }

   private static synchronized ph H(String var0, int var1, Proxy var2) {
      String var3 = c(var0, var1, var2);
      ph var4 = (ph)C.get(var3);
      var4 = new ph(var0, var1, var2);
      C.put(var3, var4);
      return var4;
   }

   private static synchronized void I(String var0, int var1, Proxy var2, ph var3) {
      String var4 = c(var0, var1, var2);
      ph var5 = (ph)C.get(var4);
      if(var5 == var3) {
         C.remove(var4);
      }

   }

   private static String c(String var0, int var1, Proxy var2) {
      String var3 = var0 + ":" + var1 + "-" + var2;
      return var3;
   }

   public static byte[] L(String var0) throws IOException {
      return a(var0, Proxy.NO_PROXY);
   }

   public static byte[] a(String var0, Proxy var1) throws IOException {
      if(var0.startsWith("file:")) {
         URL var5 = new URL(var0);
         InputStream var6 = var5.openStream();
         byte[] var4 = z9.D(var6);
         return var4;
      } else {
         xw var2 = l(var0, var1);
         w2 var3 = D(var2);
         if(var3.q() / 100 != 2) {
            throw new IOException("HTTP response: " + var3.q());
         } else {
            return var3.g();
         }
      }
   }

   public static w2 D(xw var0) throws IOException {
      mf.O();
      final HashMap var2 = new HashMap();
      String var10000 = "Response";
      var10000 = "Exception";
      xz var5 = new xz() {
         public void A(xw var1, w2 var2x) {
            Map var3 = var2;
            var2.put("Response", var2x);
            var2.notifyAll();
         }

         public void Y(xw var1, Exception var2x) {
            Map var3 = var2;
            var2.put("Exception", var2x);
            var2.notifyAll();
         }
      };
      ze var7 = new ze(var0, var5);
      p(var7);
      var2.wait();
      Exception var8 = (Exception)var2.get("Exception");
      if(var8 != null) {
         if(var8 instanceof IOException) {
            throw (IOException)var8;
         } else if(var8 instanceof RuntimeException) {
            throw (RuntimeException)var8;
         } else {
            throw new RuntimeException(var8.getMessage(), var8);
         }
      } else {
         w2 var9 = (w2)var2.get("Response");
         if(var9 == null) {
            throw new IOException("Response is null");
         } else {
            return var9;
         }
      }
   }

   public static boolean P() {
      for(Object var1 : C.values()) {
         if(((ph)var1).m()) {
            return true;
         }
      }

      return false;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
