package net.ns;

import java.util.Iterator;
import java.util.Random;
import net.xn;
import net.nk.fo;
import net.nk.fu;
import net.nk.fy;
import net.ns.i;
import net.ns.i9;
import net.w.fd;

public class l extends i {
   public l(i.g var1) {
      super(var1);
      this.v.clear();
      i9.M();
      this.j = net.nb.f.TF.p();
      this.y = net.nb.f.TF.p();
      this.K.E = -999;
      this.K.P = 2;
      this.K.g = 50;
      this.K.h = 10;
      this.v.clear();
      this.v.add(new i.w(net.yn.z.class, 4, 2, 3));
      Iterator var3 = this.b.iterator();
      if(var3.hasNext()) {
         i.w var4 = (i.w)var3.next();
         if(var4.N == fu.class || var4.N == fy.class) {
            var3.remove();
         }
      }

      this.b.add(new i.w(fu.class, 19, 4, 4));
      this.b.add(new i.w(fy.class, 1, 1, 1));
      this.b.add(new i.w(fo.class, 80, 4, 4));
   }

   public void f(net.yv.r var1, Random var2, net.u.j var3) {
      super.f(var1, var2, var3);
      if(var2.nextInt(1000) == 0) {
         int var4 = var2.nextInt(16) + 8;
         int var5 = var2.nextInt(16) + 8;
         net.u.j var6 = var1.A(var3.F(var4, 0, var5)).h();
         (new net.w.o()).K(var1, var2, var6);
      }

      if(var2.nextInt(64) == 0) {
         (new fd()).K(var1, var2, var3);
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
