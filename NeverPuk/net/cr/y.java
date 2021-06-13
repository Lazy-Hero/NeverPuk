package net.cr;

import net.xn;
import net.cr.j;
import net.cr.s;
import net.n0.ks;
import net.n0.kw;
import net.nl.ze;
import net.y9.r2;

public class y {
   public static class m implements s {
      public boolean c(ze var1, net.yv.r var2) {
         int var3 = 0;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.e(); ++var5) {
            ks var6 = var1.A(var5);
            if(!var6.B()) {
               if(net.y9.l.F(var6.Z()) instanceof r2) {
                  ++var3;
               } else {
                  if(var6.Z() != net.nb.j.n) {
                     return false;
                  }

                  ++var4;
               }

               if(var4 > 1) {
                  return false;
               }
            }
         }

         return false;
      }

      public ks h(ze var1) {
         ks var3 = ks.a;
         j.Y();
         ks var4 = ks.a;
         int var5 = 0;
         if(var5 < var1.e()) {
            ks var6 = var1.A(var5);
            if(!var6.B()) {
               if(net.y9.l.F(var6.Z()) instanceof r2) {
                  var3 = var6;
               }

               if(var6.Z() == net.nb.j.n) {
                  var4 = var6;
               }
            }

            ++var5;
         }

         ks var8 = r2.M(kw.q(var4.n()));
         if(var3.D()) {
            var8.t(var3.o().F());
         }

         return var8;
      }

      public ks E() {
         return ks.a;
      }

      public net.yz.w K(ze var1) {
         net.yz.w var2 = net.yz.w.C(var1.e(), ks.a);

         for(int var3 = 0; var3 < var2.size(); ++var3) {
            ks var4 = var1.A(var3);
            if(var4.Z().U()) {
               var2.set(var3, new ks(var4.Z().y()));
            }
         }

         return var2;
      }

      public boolean c() {
         return true;
      }

      public boolean T(int var1, int var2) {
         return var1 * var2 >= 2;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
