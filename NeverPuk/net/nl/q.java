package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.d;
import net.nl.o;
import net.nl.v;
import net.nl.z1;
import net.nl.zw;

public class q extends v {
   private final net.ne.m p;
   private final zw g;
   private final net.yv.r m;

   public q(net.r.i var1, net.ne.m var2, net.yv.r var3) {
      this.p = var2;
      this.m = var3;
      this.g = new zw(var1.v, var2);
      this.U(new o(this.g, 0, 36, 53));
      this.U(new o(this.g, 1, 62, 53));
      this.U(new d(var1.v, var2, this.g, 2, 120, 53));
      byte var4 = 0;
      int var5 = 0;

      while(true) {
         this.U(new o(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
         ++var5;
      }
   }

   public zw v() {
      return this.g;
   }

   public void d(z1 var1) {
      this.g.j();
      super.d(var1);
   }

   public void C(int var1) {
      this.g.L(var1);
   }

   public boolean N(net.r.r var1) {
      return this.p.p() == var1;
   }

   public ks a(net.r.r var1, int var2) {
      v.Q();
      ks var4 = ks.a;
      o var5 = (o)this.e.get(var2);
      if(var5 != null && var5.T()) {
         ks var6 = var5.y();
         var4 = var6.s();
         if(var2 == 2) {
            if(!this.V(var6, 3, 39, true)) {
               return ks.a;
            }

            var5.q(var6, var4);
         }

         if(var2 != 0 && var2 != 1) {
            if(var2 >= 3 && var2 < 30) {
               if(!this.V(var6, 30, 39, false)) {
                  return ks.a;
               }
            } else if(var2 >= 30 && var2 < 39 && !this.V(var6, 3, 30, false)) {
               return ks.a;
            }
         } else if(!this.V(var6, 3, 39, false)) {
            return ks.a;
         }

         if(var6.B()) {
            var5.e(ks.a);
         }

         var5.y();
         if(var6.U() == var4.U()) {
            return ks.a;
         }

         var5.H(var1, var6);
      }

      return var4;
   }

   public void K(net.r.r var1) {
      super.K(var1);
      this.p.E((net.r.r)null);
      super.K(var1);
      if(!this.m.x) {
         ks var2 = this.g.S(0);
         if(!var2.B()) {
            var1.Y(var2, false);
         }

         var2 = this.g.S(1);
         if(!var2.B()) {
            var1.Y(var2, false);
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
