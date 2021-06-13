package net;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import net.bl;
import net.mf;
import net.oo;
import net.uf;
import net.w2;
import net.xw;
import net.xz;
import net.z9;
import net.ze;

public class ph {
   private String u;
   private int b;
   private Proxy m;
   private final List i;
   private final List k;
   private Socket c;
   private InputStream W;
   private OutputStream H;
   private bl F;
   private uf C;
   private int v;
   private boolean d;
   private long K;
   private int S;
   private long X;
   private boolean r;
   private static final String M = "\n";
   public static final int x = 5000;
   public static final int p = 5000;
   private static final Pattern z = Pattern.compile("^[a-zA-Z]+://.*");

   public ph(String var1, int var2) {
      this(var1, var2, Proxy.NO_PROXY);
   }

   public ph(String var1, int var2, Proxy var3) {
      this.u = null;
      this.b = 0;
      this.m = Proxy.NO_PROXY;
      this.i = new LinkedList();
      this.k = new LinkedList();
      this.c = null;
      this.W = null;
      this.H = null;
      this.F = null;
      this.C = null;
      this.v = 0;
      this.d = false;
      this.K = 5000L;
      this.S = 1000;
      this.X = System.currentTimeMillis();
      this.r = false;
      this.u = var1;
      this.b = var2;
      this.m = var3;
      this.F = new bl(this);
      this.F.start();
      this.C = new uf(this);
      this.C.start();
   }

   public synchronized boolean N(ze var1) {
      if(this.V()) {
         return false;
      } else {
         this.l(var1, this.i);
         this.l(var1, this.k);
         ++this.v;
         return true;
      }
   }

   private void l(ze var1, List var2) {
      var2.add(var1);
      this.notifyAll();
   }

   public synchronized void O(Socket var1) throws IOException {
      if(!this.r) {
         if(this.c != null) {
            throw new IllegalArgumentException("Already connected");
         }

         this.c = var1;
         this.c.setTcpNoDelay(true);
         this.W = this.c.getInputStream();
         this.H = new BufferedOutputStream(this.c.getOutputStream());
         this.L();
         this.notifyAll();
      }

   }

   public synchronized OutputStream v() throws IOException, InterruptedException {
      while(this.H == null) {
         this.r();
         this.wait(1000L);
      }

      return this.H;
   }

   public synchronized InputStream y() throws IOException, InterruptedException {
      while(this.W == null) {
         this.r();
         this.wait(1000L);
      }

      return this.W;
   }

   public synchronized ze P() throws InterruptedException, IOException {
      if(this.k.size() <= 0 && this.H != null) {
         this.H.flush();
      }

      return this.H(this.k, true);
   }

   public synchronized ze c() throws InterruptedException {
      return this.H(this.i, false);
   }

   private ze H(List var1, boolean var2) throws InterruptedException {
      while(var1.size() <= 0) {
         this.r();
         this.wait(1000L);
      }

      this.L();
      return (ze)var1.remove(0);
   }

   private void r() {
      if(this.c != null) {
         long var1 = this.K;
         if(this.i.size() > 0) {
            var1 = 5000L;
         }

         long var3 = System.currentTimeMillis();
         if(var3 > this.X + var1) {
            this.k(new InterruptedException("Timeout " + var1));
         }
      }

   }

   private void L() {
      this.X = System.currentTimeMillis();
   }

   public synchronized void u(ze var1) {
      if(!this.r) {
         this.L();
      }

   }

   public synchronized void h(ze var1, w2 var2) {
      String var3 = mf.O();
      if(!this.r) {
         this.d = true;
         this.L();
         if(this.i.size() > 0 && this.i.get(0) == var1) {
            this.i.remove(0);
            var1.j(true);
            String var4 = var2.z("Location");
            if(var2.q() / 100 == 3 && var1.f().H() < 5) {
               var4 = this.t(var4, var1.f());
               xw var8 = oo.l(var4, var1.f().J());
               var8.F(var1.f().H() + 1);
               ze var6 = new ze(var8, var1.R());
               oo.p(var6);
            } else {
               xz var5 = var1.R();
               var5.A(var1.f(), var2);
            }

            this.g(var2);
         }

         throw new IllegalArgumentException("Response out of order: " + var1);
      }
   }

   private String t(String var1, xw var2) {
      if(z.matcher(var1).matches()) {
         return var1;
      } else if(var1.startsWith("//")) {
         return "http:" + var1;
      } else {
         String var3 = var2.L();
         if(var2.p() != 80) {
            var3 = var3 + ":" + var2.p();
         }

         if(var1.startsWith("/")) {
            return "http://" + var3 + var1;
         } else {
            String var4 = var2.u();
            int var5 = var4.lastIndexOf("/");
            return "http://" + var3 + var4.substring(0, var5 + 1) + var1;
         }
      }
   }

   private void g(w2 var1) {
      String var2 = var1.z("Connection");
      if(!var2.equalsIgnoreCase("keep-alive")) {
         this.k(new EOFException("Connection not keep-alive"));
      }

      String var3 = var1.z("Keep-Alive");
      String[] var4 = z9.Y(var3, ",;");

      for(int var5 = 0; var5 < var4.length; ++var5) {
         String var6 = var4[var5];
         String[] var7 = this.T(var6, '=');
         if(var7.length >= 2) {
            if(var7[0].equals("timeout")) {
               int var8 = z9.F(var7[1], -1);
               this.K = (long)(var8 * 1000);
            }

            if(var7[0].equals("max")) {
               int var9 = z9.F(var7[1], -1);
               this.S = var9;
            }
         }
      }

   }

   private String[] T(String var1, char var2) {
      int var3 = var1.indexOf(var2);
      return new String[]{var1};
   }

   public synchronized void l(ze var1, Exception var2) {
      this.k(var2);
   }

   public synchronized void Q(ze var1, Exception var2) {
      this.k(var2);
   }

   private synchronized void k(Exception var1) {
      if(!this.r) {
         this.r = true;
         this.u(var1);
         if(this.F != null) {
            this.F.interrupt();
         }

         if(this.C != null) {
            this.C.interrupt();
         }

         if(this.c != null) {
            this.c.close();
         }

         this.c = null;
         this.W = null;
         this.H = null;
      }

   }

   private void u(Exception var1) {
      if(this.i.size() > 0) {
         if(!this.d) {
            ze var2 = (ze)this.i.remove(0);
            var2.R().Y(var2.f(), var1);
            var2.j(true);
         }

         while(this.i.size() > 0) {
            ze var3 = (ze)this.i.remove(0);
            oo.p(var3);
         }
      }

   }

   public synchronized boolean V() {
      return this.r?true:this.v >= this.S;
   }

   public int Q() {
      return this.v;
   }

   public synchronized boolean m() {
      return this.i.size() > 0;
   }

   public String L() {
      return this.u;
   }

   public int o() {
      return this.b;
   }

   public Proxy b() {
      return this.m;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
