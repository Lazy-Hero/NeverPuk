package net.yu;

import net.xn;
import net.cb.l;
import net.cb.t;
import net.j.b;
import net.j.u;
import net.n2.a;
import net.nh.f;
import net.yu.e;

public class n implements f {
   private static final t a = new l("Status request has been handled.");
   private final net.nx.f i;
   private final a w;
   private boolean n;

   public n(net.nx.f var1, a var2) {
      this.i = var1;
      this.w = var2;
   }

   public void d(t var1) {
   }

   public void L(net.nu.l var1) {
      String var2 = e.u();
      if(this.n) {
         this.w.R(a);
      }

      this.n = true;
      this.w.F(new b(this.i.d()));
   }

   public void V(net.nu.e var1) {
      this.w.F(new u(var1.M()));
      this.w.R(a);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
