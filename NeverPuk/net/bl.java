package net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import net.mf;
import net.ph;
import net.xw;
import net.ze;

public class bl extends Thread {
   private ph U = null;
   private static final String Y = "\r\n";
   private static final Charset o = StandardCharsets.US_ASCII;

   public bl(ph var1) {
      super("HttpPipelineSender");
      this.U = var1;
   }

   public void run() {
      mf.O();
      ze var2 = null;
      this.X();
      if(!Thread.interrupted()) {
         var2 = this.U.P();
         xw var3 = var2.f();
         OutputStream var4 = this.U.v();
         this.U(var3, var4);
         this.U.u(var2);
      }

   }

   private void X() throws IOException {
      String var1 = this.U.L();
      int var2 = this.U.o();
      Proxy var3 = this.U.b();
      Socket var4 = new Socket(var3);
      var4.connect(new InetSocketAddress(var1, var2), 5000);
      this.U.O(var4);
   }

   private void U(xw var1, OutputStream var2) throws IOException {
      this.t(var2, var1.R() + " " + var1.u() + " " + var1.G() + "\r\n");
      mf.O();
      Map var4 = var1.R();
      Iterator var5 = var4.keySet().iterator();
      if(var5.hasNext()) {
         String var6 = (String)var5.next();
         String var7 = (String)var1.R().get(var6);
         this.t(var2, var6 + ": " + var7 + "\r\n");
      }

      this.t(var2, "\r\n");
   }

   private void t(OutputStream var1, String var2) throws IOException {
      byte[] var3 = var2.getBytes(o);
      var1.write(var3);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
