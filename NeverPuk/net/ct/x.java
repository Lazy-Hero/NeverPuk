package net.ct;

import java.net.InetAddress;
import java.net.UnknownHostException;
import net.xn;
import net.ct.t;
import net.ct.y;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class x {
   private static final Logger M = LogManager.getLogger();
   private final t i;
   private volatile boolean S;
   private net.n2.a j;

   public x(t var1) {
      this.i = var1;
   }

   public void n(final String var1, final int var2) {
      y.L(true);
      (new Thread("Realms-connect-task") {
         public void run() {
            t.j();
            InetAddress var2x = null;
            var2x = InetAddress.getByName(var1);
            if(!x.this.S) {
               x.this.j = net.n2.a.Y(var2x, var2, net.nn.j.b().T.G());
               if(!x.this.S) {
                  x.this.j.Y(new net.yp.j(x.this.j, net.nn.j.b(), x.this.i.o()));
                  if(!x.this.S) {
                     x.this.j.F(new net.yg.o(var1, var2, net.n2.t.LOGIN));
                     if(!x.this.S) {
                        x.this.j.F(new net.yt.l(net.nn.j.b().L().w()));
                     }
                  }
               }
            }
         }

         private static UnknownHostException a(UnknownHostException var0) {
            return var0;
         }
      }).start();
   }

   public void N() {
      t.K();
      this.S = true;
      if(this.j != null && this.j.t()) {
         this.j.R(new net.cb.h("disconnect.genericReason", new Object[0]));
         this.j.E();
      }

   }

   public void r() {
      int var1 = t.j();
      if(this.j != null) {
         if(this.j.t()) {
            this.j.c();
         }

         this.j.E();
      }

   }

   // $FF: synthetic method
   static Logger access$300() {
      return M;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
