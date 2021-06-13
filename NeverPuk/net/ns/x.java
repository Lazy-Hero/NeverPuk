package net.ns;

import java.util.Iterator;
import java.util.Random;
import net.xn;
import net.ns.i;
import net.ns.i9;
import net.w.fg;
import net.w.fp;

public class x extends i {
   private final boolean i;
   private final fg A;
   private final fp R;

   public x(boolean var1, i.g var2) {
      super(var2);
      i9.M();
      this.A = new fg();
      this.R = new fp(4);
      this.i = var1;
      if(var1) {
         this.j = net.nb.f.V.p();
      }

      this.v.clear();
      this.v.add(new i.w(net.yn.z.class, 10, 2, 3));
      this.v.add(new i.w(net.nk.f.class, 1, 1, 2));
      Iterator var4 = this.b.iterator();
      if(var4.hasNext()) {
         i.w var5 = (i.w)var4.next();
         if(var5.N == net.nk.g.class) {
            var4.remove();
         }
      }

      this.b.add(new i.w(net.nk.g.class, 20, 4, 4));
      this.b.add(new i.w(net.nk.s.class, 80, 4, 4));
   }

   public float J() {
      return 0.07F;
   }

   public void f(net.yv.r var1, Random var2, net.u.j var3) {
      if(this.i) {
         int var4 = 0;

         while(true) {
            int var5 = var2.nextInt(16) + 8;
            int var6 = var2.nextInt(16) + 8;
            this.A.K(var1, var2, var1.A(var3.F(var5, 0, var6)));
            ++var4;
         }
      }

      super.f(var1, var2, var3);
   }

   public net.w.x q(Random var1) {
      return new net.w.h(false);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
