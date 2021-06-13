package net.cr;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import net.xn;
import net.cr.j;
import net.cr.s;
import net.n0.ks;
import net.nl.ze;

public class z implements s {
   public boolean c(ze var1, net.yv.r var2) {
      ArrayList var3 = Lists.newArrayList();

      for(int var4 = 0; var4 < var1.e(); ++var4) {
         ks var5 = var1.A(var4);
         if(!var5.B()) {
            var3.add(var5);
            if(var3.size() > 1) {
               ks var6 = (ks)var3.get(0);
               if(var5.Z() != var6.Z() || var6.U() != 1 || var5.U() != 1 || !var6.Z().P()) {
                  return false;
               }
            }
         }
      }

      return var3.size() == 2;
   }

   public ks h(ze var1) {
      ArrayList var3 = Lists.newArrayList();
      j.Y();
      int var4 = 0;
      if(var4 < var1.e()) {
         ks var5 = var1.A(var4);
         if(!var5.B()) {
            var3.add(var5);
            if(var3.size() > 1) {
               ks var6 = (ks)var3.get(0);
               if(var5.Z() != var6.Z() || var6.U() != 1 || var5.U() != 1 || !var6.Z().P()) {
                  return ks.a;
               }
            }
         }

         ++var4;
      }

      if(var3.size() == 2) {
         ks var12 = (ks)var3.get(0);
         ks var13 = (ks)var3.get(1);
         if(var12.Z() == var13.Z() && var12.U() == 1 && var13.U() == 1 && var12.Z().P()) {
            net.n0.y var14 = var12.Z();
            int var7 = var14.F() - var12.z();
            int var8 = var14.F() - var13.z();
            int var9 = var7 + var8 + var14.F() * 5 / 100;
            int var10 = var14.F() - var9;
            if(var10 < 0) {
               var10 = 0;
            }

            return new ks(var12.Z(), 1, var10);
         }
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
