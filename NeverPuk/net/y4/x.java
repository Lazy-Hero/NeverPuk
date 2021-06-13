package net.y4;

import java.util.Iterator;
import java.util.Random;
import net.xn;
import net.y4.f;
import net.y4.k;
import net.y4.p;
import net.y4.s;

public class x extends s {
   private k.n c;

   public x() {
   }

   public x(net.yv.r var1, Random var2, int var3, int var4, k.n var5) {
      super(var3, var4);
      p.d();
      this.c = var5;
      f.z var7 = new f.z(0, var2, (var3 << 4) + 2, (var4 << 4) + 2, this.c);
      this.J.add(var7);
      var7.S(var7, this.J, var2);
      this.O();
      if(var5 == k.n.MESA) {
         boolean var10000 = true;
         int var9 = var1.k() - this.K.P + this.K.I() / 2 - -5;
         this.K.D(0, var9, 0);
         Iterator var10 = this.J.iterator();
         if(var10.hasNext()) {
            p var11 = (p)var10.next();
            var11.g(0, var9, 0);
         }
      }

      this.X(var1, var2, 10);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
