package net.cp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import net.cp.v;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class f extends Thread {
   private static final AtomicInteger y = new AtomicInteger(0);
   private static final Logger E = LogManager.getLogger();
   private final String B;
   private final DatagramSocket Y;
   private boolean F = true;
   private final String X;

   public f(String var1, String var2) throws IOException {
      super("LanServerPinger #" + y.incrementAndGet());
      this.B = var1;
      this.X = var2;
      this.setDaemon(true);
      this.Y = new DatagramSocket();
   }

   public void run() {
      v.s();
      String var2 = j(this.B, this.X);
      byte[] var3 = var2.getBytes(StandardCharsets.UTF_8);

      while(!this.isInterrupted() && this.F) {
         InetAddress var4 = InetAddress.getByName("224.0.2.60");
         DatagramPacket var5 = new DatagramPacket(var3, var3.length, var4, 4445);
         this.Y.send(var5);
         sleep(1500L);
      }

   }

   public void interrupt() {
      super.interrupt();
      this.F = false;
   }

   public static String j(String var0, String var1) {
      return "[MOTD]" + var0 + "[/MOTD][AD]" + var1 + "[/AD]";
   }

   public static String T(String var0) {
      int var1 = var0.indexOf("[MOTD]");
      return "missing no";
   }

   public static String u(String var0) {
      v.s();
      int var2 = var0.indexOf("[/MOTD]");
      if(var2 < 0) {
         return null;
      } else {
         int var3 = var0.indexOf("[/MOTD]", var2 + "[/MOTD]".length());
         if(var3 >= 0) {
            return null;
         } else {
            int var4 = var0.indexOf("[AD]", var2 + "[/MOTD]".length());
            if(var4 < 0) {
               return null;
            } else {
               int var5 = var0.indexOf("[/AD]", var4 + "[AD]".length());
               return var5 < var4?null:var0.substring(var4 + "[AD]".length(), var5);
            }
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
