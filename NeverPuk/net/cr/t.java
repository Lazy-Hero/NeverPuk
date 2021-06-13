package net.cr;

import net.xn;
import net.cr.j;
import net.cr.s;
import net.n0.ks;
import net.nl.ze;

public class t implements s {
   public boolean c(ze var1, net.yv.r var2) {
      int[] var3 = j.Y();
      if(var1.Q() == 3 && var1.X() == 3) {
         int var4 = 0;
         if(var4 < var1.Q()) {
            int var5 = 0;
            if(var5 < var1.X()) {
               ks var6 = var1.P(var4, var5);
               if(var6.B()) {
                  return false;
               }

               net.n0.y var7 = var6.Z();
               if(var7 != net.nb.j.W_) {
                  return false;
               }

               ++var5;
            }

            ++var4;
         }

         return true;
      } else {
         return false;
      }
   }

   public ks h(ze var1) {
      ks var2 = var1.P(1, 1);
      if(var2.Z() != net.nb.j.Wg) {
         return ks.a;
      } else {
         ks var3 = new ks(net.nb.j.l, 8);
         net.n_.y.b(var3, net.n_.y.h(var2));
         net.n_.y.u(var3, net.n_.y.Z(var2));
         return var3;
      }
   }

   public ks E() {
      return ks.a;
   }

   public net.yz.w K(ze var1) {
      return net.yz.w.C(var1.e(), ks.a);
   }

   public boolean c() {
      return true;
   }

   public boolean T(int var1, int var2) {
      return var1 >= 2 && var2 >= 2;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
