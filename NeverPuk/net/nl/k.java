package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.o;
import net.nl.v;
import net.nl.z1;

public class k extends v {
   private final z1 U;

   public k(net.r.i var1, z1 var2, net.r.r var3) {
      v.N();
      super();
      this.U = var2;
      var2.o(var3);
      boolean var10000 = true;
      int var6 = 0;
      if(var6 < var2.e()) {
         this.U(new o(var2, var6, 44 + var6 * 18, 20));
         ++var6;
      }

      var6 = 0;
      int var7 = 0;
      this.U(new o(var1, var7 + var6 * 9 + 9, 8 + var7 * 18, var6 * 18 + 51));
      ++var7;
      ++var6;
      var6 = 0;
      this.U(new o(var1, var6, 8 + var6 * 18, 109));
      ++var6;
   }

   public boolean N(net.r.r var1) {
      return this.U.m(var1);
   }

   public ks a(net.r.r var1, int var2) {
      ks var3 = ks.a;
      o var4 = (o)this.e.get(var2);
      if(var4.T()) {
         ks var5 = var4.y();
         var3 = var5.s();
         if(var2 < this.U.e()) {
            if(!this.V(var5, this.U.e(), this.e.size(), true)) {
               return ks.a;
            }
         } else if(!this.V(var5, 0, this.U.e(), false)) {
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
      this.U.b(var1);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
