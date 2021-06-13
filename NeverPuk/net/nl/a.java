package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.o;
import net.nl.v;
import net.nl.z1;

public class a extends v {
   private final z1 q;
   private final int g;

   public a(z1 var1, z1 var2, net.r.r var3) {
      this.q = var2;
      this.g = var2.e() / 9;
      var2.o(var3);
      v.N();
      int var5 = (this.g - 4) * 18;
      int var6 = 0;
      if(var6 < this.g) {
         int var7 = 0;
         this.U(new o(var2, var7 + var6 * 9, 8 + var7 * 18, 18 + var6 * 18));
         ++var7;
         ++var6;
      }

      var6 = 0;
      int var14 = 0;
      this.U(new o(var1, var14 + var6 * 9 + 9, 8 + var14 * 18, 103 + var6 * 18 + var5));
      ++var14;
      ++var6;
      var6 = 0;
      this.U(new o(var1, var6, 8 + var6 * 18, 161 + var5));
      ++var6;
   }

   public boolean N(net.r.r var1) {
      return this.q.m(var1);
   }

   public ks a(net.r.r var1, int var2) {
      ks var3 = ks.a;
      o var4 = (o)this.e.get(var2);
      if(var4.T()) {
         ks var5 = var4.y();
         var3 = var5.s();
         if(var2 < this.g * 9) {
            if(!this.V(var5, this.g * 9, this.e.size(), true)) {
               return ks.a;
            }
         } else if(!this.V(var5, 0, this.g * 9, false)) {
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
      this.q.b(var1);
   }

   public z1 m() {
      return this.q;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
