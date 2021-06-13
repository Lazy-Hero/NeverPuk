package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.o;
import net.nl.v;
import net.nl.z1;

public class b extends v {
   private final z1 h;
   private final net.yn.j j;

   public b(z1 var1, final z1 var2, final net.yn.j var3, net.r.r var4) {
      this.h = var2;
      int var10000 = v.N();
      this.j = var3;
      boolean var10001 = true;
      int var5 = var10000;
      var2.o(var4);
      var10000 = -18;
      this.U(new o(var2, 0, 8, 18) {
         public boolean s(ks var1) {
            int var2 = v.N();
            return var1.Z() == net.nb.j.h && !this.T() && var3.Ui();
         }

         public boolean c() {
            return var3.Ui();
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      this.U(new o(var2, 1, 8, 36) {
         public boolean s(ks var1) {
            return var3.o(var1);
         }

         public boolean c() {
            return var3.UC();
         }

         public int t() {
            return 1;
         }
      });
      if(var3 instanceof net.yn.q && ((net.yn.q)var3).TJ()) {
         int var8 = 0;
         int var9 = 0;
         if(var9 < ((net.yn.q)var3).k()) {
            this.U(new o(var2, 2 + var9 + var8 * ((net.yn.q)var3).k(), 80 + var9 * 18, 18 + var8 * 18));
            ++var9;
         }

         ++var8;
      }

      int var12 = 0;
      int var17 = 0;
      this.U(new o(var1, var17 + var12 * 9 + 9, 8 + var17 * 18, 102 + var12 * 18 + -18));
      ++var17;
      ++var12;
      var12 = 0;
      this.U(new o(var1, var12, 8 + var12 * 18, 142));
      ++var12;
      if(net.u.d.y() == null) {
         ++var5;
         v.L(var5);
      }

   }

   public boolean N(net.r.r var1) {
      return this.h.m(var1) && this.j.P() && this.j.d(var1) < 8.0F;
   }

   public ks a(net.r.r var1, int var2) {
      ks var3 = ks.a;
      o var4 = (o)this.e.get(var2);
      if(var4.T()) {
         ks var5 = var4.y();
         var3 = var5.s();
         if(var2 < this.h.e()) {
            if(!this.V(var5, this.h.e(), this.e.size(), true)) {
               return ks.a;
            }
         } else if(this.f(1).s(var5) && !this.f(1).T()) {
            if(!this.V(var5, 1, 2, false)) {
               return ks.a;
            }
         } else if(this.f(0).s(var5)) {
            if(!this.V(var5, 0, 1, false)) {
               return ks.a;
            }
         } else if(this.h.e() <= 2 || !this.V(var5, 2, this.h.e(), false)) {
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
      this.h.b(var1);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
