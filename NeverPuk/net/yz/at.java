package net.yz;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import net.yz.ao;
import net.yz.m_;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class at {
   public static final ListeningExecutorService A = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool((new ThreadFactoryBuilder()).setDaemon(true).setNameFormat("Downloader %d").build()));
   private static final AtomicInteger z = new AtomicInteger(0);
   private static final Logger i = LogManager.getLogger();

   public static String n(Map var0) {
      StringBuilder var1 = new StringBuilder();

      for(Entry var3 : var0.entrySet()) {
         if(var1.length() > 0) {
            var1.append('&');
         }

         var1.append(URLEncoder.encode((String)var3.getKey(), "UTF-8"));
         if(var3.getValue() != null) {
            var1.append('=');
            var1.append(URLEncoder.encode(var3.getValue().toString(), "UTF-8"));
         }
      }

      return var1.toString();
   }

   public static String l(URL var0, Map var1, boolean var2, @Nullable Proxy var3) {
      return N(var0, n(var1), var2, var3);
   }

   private static String N(URL var0, String var1, boolean var2, @Nullable Proxy var3) {
      int var4 = m_.J();
      if(var3 == null) {
         var3 = Proxy.NO_PROXY;
      }

      HttpURLConnection var5 = (HttpURLConnection)var0.openConnection(var3);
      var5.setRequestMethod("POST");
      var5.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      var5.setRequestProperty("Content-Length", "" + var1.getBytes().length);
      var5.setRequestProperty("Content-Language", "en-US");
      var5.setUseCaches(false);
      var5.setDoInput(true);
      var5.setDoOutput(true);
      DataOutputStream var6 = new DataOutputStream(var5.getOutputStream());
      var6.writeBytes(var1);
      var6.flush();
      var6.close();
      BufferedReader var7 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
      StringBuffer var8 = new StringBuffer();
      String var9;
      if((var9 = var7.readLine()) != null) {
         var8.append(var9);
         var8.append('\r');
      }

      var7.close();
      return var8.toString();
   }

   public static ListenableFuture K(final File var0, final String var1, final Map var2, final int var3, @Nullable final ao var4, final Proxy var5) {
      ListenableFuture var6 = A.submit(new Runnable() {
         public void run() {
            HttpURLConnection var2x = null;
            m_.g();
            InputStream var3x = null;
            DataOutputStream var4x = null;
            if(var4 != null) {
               var4.h(net.yq.e.E("resourcepack.downloading"));
               var4.y(net.yq.e.E("resourcepack.requesting"));
            }

            byte[] var5x = new byte[4096];
            URL var6 = new URL(var1);
            var2x = (HttpURLConnection)var6.openConnection(var5);
            var2x.setInstanceFollowRedirects(true);
            float var7 = 0.0F;
            float var8 = (float)var2.entrySet().size();
            Iterator var9 = var2.entrySet().iterator();
            if(var9.hasNext()) {
               Entry var10 = (Entry)var9.next();
               var2x.setRequestProperty((String)var10.getKey(), (String)var10.getValue());
               if(var4 != null) {
                  var4.H((int)(++var7 / var8 * 100.0F));
               }
            }

            var3x = var2x.getInputStream();
            var8 = (float)var2x.getContentLength();
            int var18 = var2x.getContentLength();
            if(var4 != null) {
               var4.y(net.yq.e.x("resourcepack.progress", new Object[]{String.format("%.2f", new Object[]{Float.valueOf(var8 / 1000.0F / 1000.0F)})}));
            }

            if(var0.exists()) {
               long var19 = var0.length();
               if(Long.compare(var19, (long)var18) == 0) {
                  if(var4 != null) {
                     var4.g();
                  }

                  IOUtils.closeQuietly(var3x);
                  IOUtils.closeQuietly(var4x);
                  return;
               }

               at.i.warn("Deleting {} as it does not match what we currently have ({} vs our {}).", var0, Integer.valueOf(var18), Long.valueOf(var19));
               FileUtils.deleteQuietly(var0);
            }

            if(var0.getParentFile() != null) {
               var0.getParentFile().mkdirs();
            }

            var4x = new DataOutputStream(new FileOutputStream(var0));
            if(var3 > 0 && Float.compare(var8, (float)var3) > 0) {
               if(var4 != null) {
                  var4.g();
               }

               throw new IOException("Filesize is bigger than maximum allowed (file is " + var7 + ", limit is " + var3 + ")");
            } else {
               int var20;
               if((var20 = var3x.read(var5x)) >= 0) {
                  var7 = var7 + (float)var20;
                  if(var4 != null) {
                     var4.H((int)(var7 / var8 * 100.0F));
                  }

                  if(var3 > 0 && Float.compare(var7, (float)var3) > 0) {
                     if(var4 != null) {
                        var4.g();
                     }

                     throw new IOException("Filesize was bigger than maximum allowed (got >= " + var7 + ", limit was " + var3 + ")");
                  }

                  if(Thread.interrupted()) {
                     at.i.error("INTERRUPTED");
                     if(var4 != null) {
                        var4.g();
                     }

                     IOUtils.closeQuietly(var3x);
                     IOUtils.closeQuietly(var4x);
                     return;
                  }

                  var4x.write(var5x, 0, var20);
               }

               if(var4 != null) {
                  var4.g();
                  IOUtils.closeQuietly(var3x);
                  IOUtils.closeQuietly(var4x);
               } else {
                  IOUtils.closeQuietly(var3x);
                  IOUtils.closeQuietly(var4x);
               }
            }
         }

         private static Throwable a(Throwable var0x) {
            return var0x;
         }
      });
      return var6;
   }

   public static int T() throws IOException {
      ServerSocket var0 = null;
      int var1 = -1;
      var0 = new ServerSocket(0);
      var1 = var0.getLocalPort();
      var0.close();
      return var1;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
