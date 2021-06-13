package net.cr;

import net.xn;
import net.cr.j;
import net.cr.s;
import net.n0.ks;
import net.nj.f;
import net.nl.ze;

public class w {
   public static class e implements s {
      public boolean c(ze var1, net.yv.r var2) {
         ks var3 = ks.a;
         ks var4 = ks.a;

         for(int var5 = 0; var5 < var1.e(); ++var5) {
            ks var6 = var1.A(var5);
            if(!var6.B()) {
               if(var6.Z() == net.nb.j.Yi) {
                  if(!var4.B()) {
                     return false;
                  }

                  var4 = var6;
               } else {
                  if(var6.Z() != net.nb.j.Yl) {
                     return false;
                  }

                  if(!var3.B()) {
                     return false;
                  }

                  if(var6.j("BlockEntityTag") != null) {
                     return false;
                  }

                  var3 = var6;
               }
            }
         }

         return !var3.B() && !var4.B();
      }

      public ks h(ze var1) {
         ks var3 = ks.a;
         ks var4 = ks.a;
         j.Y();
         int var5 = 0;
         if(var5 < var1.e()) {
            ks var6 = var1.A(var5);
            if(!var6.B()) {
               if(var6.Z() == net.nb.j.Yi) {
                  var3 = var6;
               }

               if(var6.Z() == net.nb.j.Yl) {
                  var4 = var6.s();
               }
            }

            ++var5;
         }

         if(var4.B()) {
            return var4;
         } else {
            f var8 = var3.j("BlockEntityTag");
            f var9 = var8 == null?new f():var8.F();
            var9.r("Base", var3.n() & 15);
            var4.Q("BlockEntityTag", var9);
            return var4;
         }
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
