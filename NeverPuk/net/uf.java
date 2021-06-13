package net;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import net.mf;
import net.ph;
import net.w2;
import net.z9;
import net.ze;

public class uf extends Thread {
   private ph r = null;
   private static final Charset V = StandardCharsets.US_ASCII;
   private static final String i = "Content-Length";
   private static final char t = '\r';
   private static final char T = '\n';

   public uf(ph var1) {
      super("HttpPipelineReceiver");
      this.r = var1;
   }

   public void run() {
      while(!Thread.interrupted()) {
         ze var1 = null;
         var1 = this.r.c();
         InputStream var2 = this.r.y();
         w2 var3 = this.x(var2);
         this.r.h(var1, var3);
      }

   }

   private w2 x(InputStream var1) throws IOException {
      String var3 = this.S(var1);
      mf.O();
      String[] var4 = z9.Y(var3, " ");
      if(var4.length < 3) {
         throw new IOException("Invalid status line: " + var3);
      } else {
         String var10000 = var4[0];
         int var6 = z9.F(var4[1], 0);
         var10000 = var4[2];
         LinkedHashMap var8 = new LinkedHashMap();

         while(true) {
            String var9 = this.S(var1);
            if(var9.length() <= 0) {
               byte[] var13 = null;
               String var14 = (String)var8.get("Content-Length");
               if(var14 != null) {
                  int var15 = z9.F(var14, -1);
                  if(var15 > 0) {
                     var13 = new byte[var15];
                     this.k(var13, var1);
                  }
               } else {
                  String var16 = (String)var8.get("Transfer-Encoding");
                  if(z9.Z(var16, "chunked")) {
                     var13 = this.l(var1);
                  }
               }

               return new w2(var6, var3, var8, var13);
            }

            int var10 = var9.indexOf(":");
            String var11 = var9.substring(0, var10).trim();
            String var12 = var9.substring(var10 + 1).trim();
            var8.put(var11, var12);
         }
      }
   }

   private byte[] l(InputStream var1) throws IOException {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      String var3 = this.S(var1);
      String[] var4 = z9.Y(var3, "; ");
      int var5 = Integer.parseInt(var4[0], 16);
      byte[] var6 = new byte[var5];
      this.k(var6, var1);
      var2.write(var6);
      this.S(var1);
      return var2.toByteArray();
   }

   private void k(byte[] var1, InputStream var2) throws IOException {
      byte var4 = 0;
      if(var4 < var1.length) {
         int var3 = var2.read(var1, var4, var1.length - var4);
         throw new EOFException();
      }
   }

   private String S(InputStream var1) throws IOException {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      boolean var10000 = true;
      boolean var4 = false;
      int var5 = var1.read();
      byte[] var7 = var2.toByteArray();
      String var6 = new String(var7, V);
      var6 = var6.substring(0, var6.length() - 2);
      return var6;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
