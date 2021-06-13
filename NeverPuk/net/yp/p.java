package net.yp;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import net.xn;
import net.yp.o;
import net.yp.v;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class p {
   private static final AtomicInteger k = new AtomicInteger(0);
   private static final Logger n = LogManager.getLogger();

   public static class j {
      private final List K = Lists.newArrayList();
      boolean h;

      public synchronized boolean e() {
         return this.h;
      }

      public synchronized void V() {
         this.h = false;
      }

      public synchronized List O() {
         return Collections.unmodifiableList(this.K);
      }

      public synchronized void h(String var1, InetAddress var2) {
         v.C();
         String var4 = net.cp.f.T(var1);
         String var5 = net.cp.f.u(var1);
         if(var5 != null) {
            var5 = var2.getHostAddress() + ":" + var5;
            boolean var6 = false;
            Iterator var7 = this.K.iterator();
            if(var7.hasNext()) {
               o var8 = (o)var7.next();
               if(var8.o().equals(var5)) {
                  var8.Z();
                  var6 = true;
               }
            }

            this.K.add(new o(var4, var5));
            this.h = true;
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public static class r extends Thread {
      private final p.j S;
      private final InetAddress R;
      private final MulticastSocket t;

      public r(p.j var1) throws IOException {
         super("LanServerDetector #" + p.k.incrementAndGet());
         this.S = var1;
         this.setDaemon(true);
         this.t = new MulticastSocket(4445);
         this.R = InetAddress.getByName("224.0.2.60");
         this.t.setSoTimeout(5000);
         this.t.joinGroup(this.R);
      }

      public void run() {
         v.C();
         byte[] var2 = new byte[1024];
         if(!this.isInterrupted()) {
            DatagramPacket var3 = new DatagramPacket(var2, var2.length);
            this.t.receive(var3);
            String var4 = new String(var3.getData(), var3.getOffset(), var3.getLength(), StandardCharsets.UTF_8);
            p.n.debug("{}: {}", var3.getAddress(), var4);
            this.S.h(var4, var3.getAddress());
         }

         this.t.leaveGroup(this.R);
         this.t.close();
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
