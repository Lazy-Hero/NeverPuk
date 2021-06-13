package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.o;
import net.nl.v;
import net.nl.z1;

public class n extends v {
   private final z1 i;

   public n(z1 var1, z1 var2) {
      v.Q();
      this.i = var2;
      int var4 = 0;
      int var5 = 0;
      this.U(new o(var2, var5 + var4 * 3, 62 + var5 * 18, 17 + var4 * 18));
      ++var5;
      ++var4;
      var4 = 0;
      var5 = 0;
      this.U(new o(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
      ++var5;
      ++var4;
      var4 = 0;
      this.U(new o(var1, var4, 8 + var4 * 18, 142));
      ++var4;
   }

   public boolean N(net.r.r var1) {
      return this.i.m(var1);
   }

   public ks a(net.r.r var1, int var2) {
      ks var3 = ks.a;
      o var4 = (o)this.e.get(var2);
      if(var4.T()) {
         ks var5 = var4.y();
         var3 = var5.s();
         if(var2 < 9) {
            if(!this.V(var5, 9, 45, true)) {
               return ks.a;
            }
         } else if(!this.V(var5, 0, 9, false)) {
            return ks.a;
         }

         if(var5.B()) {
            var4.e(ks.a);
         } else {
            var4.y();
         }

         if(var5.U() == var3.U()) {
            return ks.a;
         }

         var4.H(var1, var5);
      }

      return var3;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
