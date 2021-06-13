package net.z;

import java.io.IOException;
import net.z.g;
import net.z.m;
import net.z.tg;

public class t7 extends tg {
   public void L() {
      super.L();
      this.m.add(new m(1, q / 2 - 100, V - 40, net.c9.b.x("multiplayer.stopSleeping", new Object[0])));
   }

   protected void Q(char var1, int var2) throws IOException {
      boolean var3 = g.C();
      if(var2 == 1) {
         this.t();
      }

      if(var2 != 28 && var2 != 156) {
         super.Q(var1, var2);
      }

      String var4 = this.H.u().trim();
      if(!var4.isEmpty()) {
         this.A.sf.f(var4);
      }

      this.H.u("");
      this.A.y.I().i();
   }

   protected void t(m var1) throws IOException {
      if(var1.g == 1) {
         this.t();
      } else {
         super.t(var1);
      }

   }

   private void t() {
      net.yp.v var1 = this.A.sf.x3;
      var1.L((net.n2.k)(new net.m.e(this.A.sf, net.m.e.STOP_SLEEPING)));
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
