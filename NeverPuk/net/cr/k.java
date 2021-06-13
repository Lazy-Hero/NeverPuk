package net.cr;

import net.xn;
import net.cr.j;
import net.cr.s;
import net.n0.ks;
import net.nl.ze;

public class k implements s {
   private ks u = ks.a;

   public boolean c(ze var1, net.yv.r var2) {
      this.u = ks.a;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      j.Y();
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      if(var10 < var1.e()) {
         ks var11 = var1.A(var10);
         if(!var11.B()) {
            if(var11.Z() == net.nb.j.YP) {
               ++var5;
            }

            if(var11.Z() == net.nb.j.c) {
               ++var7;
            }

            if(var11.Z() == net.nb.j.n) {
               ++var6;
            }

            if(var11.Z() == net.nb.j.YZ) {
               ++var4;
            }

            if(var11.Z() == net.nb.j.Wo) {
               ++var8;
            }

            if(var11.Z() == net.nb.j.B) {
               ++var8;
            }

            if(var11.Z() == net.nb.j.Yu) {
               ++var9;
            }

            if(var11.Z() == net.nb.j.YL) {
               ++var9;
            }

            if(var11.Z() == net.nb.j.Ww) {
               ++var9;
            }

            if(var11.Z() != net.nb.j.Y9) {
               return false;
            }

            ++var9;
         }

         ++var10;
      }

      var8 = var8 + var6 + var9;
      return false;
   }

   public ks h(ze var1) {
      return this.u.s();
   }

   public ks E() {
      return this.u;
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
      return var1 * var2 >= 1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
