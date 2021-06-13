package net;

import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import net.xn;

public class oe {
   private boolean F = false;
   private static int[] Q;

   public void j() {
      int[] var1 = F();
      if(!this.F) {
         this.G();
         this.r();
         this.F = true;
      }

   }

   private void G() {
      TrustManager[] var1 = new TrustManager[]{new X509TrustManager() {
         public X509Certificate[] getAcceptedIssuers() {
            return null;
         }

         public void checkClientTrusted(X509Certificate[] var1, String var2) {
         }

         public void checkServerTrusted(X509Certificate[] var1, String var2) {
         }
      }};
      SSLContext var2 = SSLContext.getInstance("SSL");
      var2.init((KeyManager[])null, var1, new SecureRandom());
      HttpsURLConnection.setDefaultSSLSocketFactory(var2.getSocketFactory());
   }

   private void r() {
      HttpsURLConnection.setDefaultHostnameVerifier((var0, var1) -> {
         int[] var2 = F();
         return var0.equals("authserver.thealtening.com") || var0.equals("sessionserver.thealtening.com");
      });
   }

   public static void n(int[] var0) {
      Q = var0;
   }

   public static int[] F() {
      return Q;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      n((int[])null);
   }
}
