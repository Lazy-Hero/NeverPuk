package net.cr;

import net.xn;
import net.cr.j;
import net.cr.s;
import net.n0.k5;
import net.n0.ks;
import net.nl.ze;

public class g implements s {
   public boolean c(ze var1, net.yv.r var2) {
      int var3 = 0;
      ks var4 = ks.a;

      for(int var5 = 0; var5 < var1.e(); ++var5) {
         ks var6 = var1.A(var5);
         if(!var6.B()) {
            if(var6.Z() == net.nb.j.e) {
               if(!var4.B()) {
                  return false;
               }

               var4 = var6;
            } else {
               if(var6.Z() != net.nb.j.WZ) {
                  return false;
               }

               ++var3;
            }
         }
      }

      return !var4.B() && var4.D();
   }

   public ks h(ze var1) {
      j.Y();
      int var3 = 0;
      ks var4 = ks.a;
      int var5 = 0;
      if(var5 < var1.e()) {
         ks var6 = var1.A(var5);
         if(!var6.B()) {
            if(var6.Z() == net.nb.j.e) {
               if(!var4.B()) {
                  return ks.a;
               }

               var4 = var6;
            }

            if(var6.Z() != net.nb.j.WZ) {
               return ks.a;
            }

            ++var3;
         }

         ++var5;
      }

      if(!var4.B() && var4.D()) {
         ;
      }

      return ks.a;
   }

   public ks E() {
      return ks.a;
   }

   public net.yz.w K(ze var1) {
      net.yz.w var2 = net.yz.w.C(var1.e(), ks.a);

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         ks var4 = var1.A(var3);
         if(var4.Z() instanceof k5) {
            ks var5 = var4.s();
            var5.u(1);
            var2.set(var3, var5);
            break;
         }
      }

      return var2;
   }

   public boolean c() {
      return true;
   }

   public boolean T(int var1, int var2) {
      return var1 >= 3 && var2 >= 3;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
