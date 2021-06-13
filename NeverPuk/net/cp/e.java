package net.cp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicInteger;
import net.m4;
import net.c9.b;
import net.cp.a;
import net.cp.d;
import net.cp.v;
import net.nn.j;
import net.yt.l;
import net.z.m;
import net.z.tu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class e extends tu {
   private static final AtomicInteger r = new AtomicInteger(0);
   private static final Logger z = LogManager.getLogger();
   private net.n2.a K;
   private boolean a;
   private final tu f;

   public e(tu var1, j var2, d var3) {
      v.s();
      super();
      m4.J = var3;
      this.A = var2;
      this.f = var1;
      a var5 = a.Y(var3.C);
      var2.J((v)null);
      var2.w(var3);
      this.X(var5.P(), var5.l());
      net.u.d.h(new net.u.d[3]);
   }

   public e(tu var1, j var2, String var3, int var4) {
      this.A = var2;
      this.f = var1;
      var2.J((v)null);
      this.X(var3, var4);
   }

   private void X(final String var1, final int var2) {
      z.info("[NeverHook Network] Connecting to {}, {}", var1, Integer.valueOf(var2));
      (new Thread("Server Connector #" + r.incrementAndGet()) {
         public void run() {
            v.s();
            InetAddress var2x = null;
            if(!e.this.a) {
               var2x = InetAddress.getByName(var1);
               e.this.K = net.n2.a.Y(var2x, var2, e.this.A.T.G());
               e.this.K.Y(new net.yp.j(e.this.K, e.this.A, e.this.f));
               e.this.K.F(new net.yg.o(var1, var2, net.n2.t.LOGIN));
               e.this.K.F(new l(e.this.A.L().w()));
            }
         }

         private static UnknownHostException a(UnknownHostException var0) {
            return var0;
         }
      }).start();
   }

   public void K() {
      if(this.K != null) {
         if(this.K.t()) {
            this.K.c();
         } else {
            this.K.E();
         }
      }

   }

   protected void Q(char var1, int var2) throws IOException {
   }

   public void L() {
      this.m.clear();
      this.m.add(new m(0, q / 2 - 100, V / 4 + 120 + 12, b.x("gui.cancel", new Object[0])));
   }

   protected void t(m var1) throws IOException {
      String[] var2 = v.s();
      if(var1.g == 0) {
         this.a = true;
         if(this.K != null) {
            this.K.R(new net.cb.l("Aborted"));
         }

         this.A.s(this.f);
      }

   }

   public void v(int var1, int var2, float var3) {
      v.s();
      this.C();
      if(this.K == null) {
         this.d(this.O, b.x("connect.connecting", new Object[0]), q / 2, V / 2 - 50, 16777215);
      }

      this.d(this.O, b.x("connect.authorizing", new Object[0]), q / 2, V / 2 - 50, 16777215);
      super.v(var1, var2, var3);
      if(net.u.d.y() == null) {
         v.T(new String[1]);
      }

   }

   // $FF: synthetic method
   static Logger access$600() {
      return z;
   }

   // $FF: synthetic method
   static j access$700(e var0) {
      return var0.A;
   }

   // $FF: synthetic method
   static j access$800(e var0) {
      return var0.A;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
