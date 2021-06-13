package net.cr;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import net.xn;
import net.cr.s;
import net.n0.ks;
import net.nl.ze;

public class c implements s {
   public boolean c(ze var1, net.yv.r var2) {
      ks var3 = ks.a;
      ArrayList var4 = Lists.newArrayList();

      for(int var5 = 0; var5 < var1.e(); ++var5) {
         ks var6 = var1.A(var5);
         if(!var6.B()) {
            if(var6.Z() instanceof net.n0.j) {
               net.n0.j var7 = (net.n0.j)var6.Z();
               if(var7.R() != net.n0.j.LEATHER || !var3.B()) {
                  return false;
               }

               var3 = var6;
            } else {
               if(var6.Z() != net.nb.j.n) {
                  return false;
               }

               var4.add(var6);
            }
         }
      }

      return !var3.B() && !var4.isEmpty();
   }

   public ks h(ze param1) {
      // $FF: Couldn't be decompiled
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
