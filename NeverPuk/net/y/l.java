package net.y;

import java.util.Iterator;
import net.xn;
import net.z9;
import net.y.a;
import net.y.d;
import net.y.p;
import net.yz.ac;

public class l extends a {
   public void q(ac var1) {
      String var2 = p.S();
      if(this.Z) {
         if(this.q.size() == 0) {
            return;
         }

         Iterator var3 = this.q.iterator();
         if(var3.hasNext()) {
            net.n5.m var4 = (net.n5.m)var3.next();
            net.n5.o var5 = (net.n5.o)var4;
            d.c();
            this.E(var4);
            d.I(var5.H(var1, var5.N()));
            d.Y();
         }

         if(z9.Sk()) {
            d.J();
         }

         d.b();
         this.q.clear();
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
