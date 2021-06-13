package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.o;
import net.nl.u;
import net.nl.v;
import net.nl.z1;

public class p extends v {
   private final z1 c;

   public p(net.r.i var1, z1 var2, net.r.r var3) {
      this.c = var2;
      var2.o(var3);
      v.N();
      boolean var10001 = true;
      boolean var10000 = true;
      int var7 = 0;
      int var8 = 0;
      this.U(new u(var2, var8 + var7 * 9, 8 + var8 * 18, 18 + var7 * 18));
      ++var8;
      ++var7;
      var7 = 0;
      var8 = 0;
      this.U(new o(var1, var8 + var7 * 9 + 9, 8 + var8 * 18, 84 + var7 * 18));
      ++var8;
      ++var7;
      var7 = 0;
      this.U(new o(var1, var7, 8 + var7 * 18, 142));
      ++var7;
   }

   public boolean N(net.r.r var1) {
      return this.c.m(var1);
   }

   public ks a(net.r.r var1, int var2) {
      ks var3 = ks.a;
      o var4 = (o)this.e.get(var2);
      if(var4.T()) {
         ks var5 = var4.y();
         var3 = var5.s();
         if(var2 < this.c.e()) {
            if(!this.V(var5, this.c.e(), this.e.size(), true)) {
               return ks.a;
            }
         } else if(!this.V(var5, 0, this.c.e(), false)) {
            return ks.a;
         }

         if(var5.B()) {
            var4.e(ks.a);
         } else {
            var4.y();
         }
      }

      return var3;
   }

   public void K(net.r.r var1) {
      super.K(var1);
      this.c.b(var1);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
