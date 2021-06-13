package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.o;
import net.nl.v;
import net.nl.z1;
import net.nl.zc;

public class y extends v {
   private final z1 F;
   private final y.x y;

   public y(z1 var1, z1 var2) {
      this.F = var2;
      this.y = new y.x(var2, 0, 136, 110);
      this.U(this.y);
      boolean var10000 = true;
      var10000 = true;
      byte var5 = 0;
      int var6 = 0;

      while(true) {
         this.U(new o(var1, var6 + var5 * 9 + 9, 36 + var6 * 18, 137 + var5 * 18));
         ++var6;
      }
   }

   public void w(zc var1) {
      super.w(var1);
      var1.t(this, this.F);
   }

   public void k(int var1, int var2) {
      this.F.Z(var1, var2);
   }

   public z1 L() {
      return this.F;
   }

   public void K(net.r.r var1) {
      super.K(var1);
      if(!var1.hl.x) {
         ks var2 = this.y.h(this.y.t());
         if(!var2.B()) {
            var1.Y(var2, false);
         }
      }

   }

   public boolean N(net.r.r var1) {
      return this.F.m(var1);
   }

   public ks a(net.r.r var1, int var2) {
      v.N();
      ks var4 = ks.a;
      o var5 = (o)this.e.get(var2);
      if(var5 != null && var5.T()) {
         ks var6 = var5.y();
         var4 = var6.s();
         if(var2 == 0) {
            if(!this.V(var6, 1, 37, true)) {
               return ks.a;
            }

            var5.q(var6, var4);
         }

         if(!this.y.T() && this.y.s(var6) && var6.U() == 1) {
            if(!this.V(var6, 0, 1, false)) {
               return ks.a;
            }
         } else if(var2 >= 1 && var2 < 28) {
            if(!this.V(var6, 28, 37, false)) {
               return ks.a;
            }
         } else if(var2 >= 28 && var2 < 37) {
            if(!this.V(var6, 1, 28, false)) {
               return ks.a;
            }
         } else if(!this.V(var6, 1, 37, false)) {
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

   private static xn a(xn var0) {
      return var0;
   }

   class x extends o {
      public x(z1 var2, int var3, int var4, int var5) {
         super(var2, var3, var4, var5);
      }

      public boolean s(ks var1) {
         v.N();
         net.n0.y var3 = var1.Z();
         return var3 == net.nb.j.WL || var3 == net.nb.j.B || var3 == net.nb.j.F || var3 == net.nb.j.S1;
      }

      public int t() {
         return 1;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
