package net;

import com.google.common.collect.ImmutableList;
import java.util.List;
import net._c;
import net.bh;
import net.mf;
import net.oc;
import net.w8;
import net.x3;
import net.xn;
import net.z9;
import net.ym.j;
import net.ym.t;
import net.yw.n;
import net.yz.aq;

public class zzzzxyCustomizer {
   private static final List w = ImmutableList.of();

   public static j M(j var0, n var1, _c var2) {
      if(var2.E()) {
         var0 = oc.t(var0, var1);
      }

      return var0;
   }

   public static List q(List var0, net.yv.o8 var1, n var2, net.u.j var3, aq var4, long var5, _c var7) {
      String var8 = mf.O();
      if(var7.E() && oc.m(var1.Z(var3.C(var4)), var2)) {
         return w;
      } else {
         if(!var7.b(var0) && z9.Sm()) {
            var0 = x3.g(var1, var2, var3, var4, var0);
         }

         List var9 = var7.T();
         var9.clear();
         int var10 = 0;
         if(var10 < var0.size()) {
            t var11 = (t)var0.get(var10);
            t[] var12 = o(var11, var1, var2, var3, var4, var5, var7);
            if(var0.size() == 1 && var12.length == 1 && var12[0] == var11) {
               return var0;
            }

            int var13 = 0;
            if(var13 < var12.length) {
               t var14 = var12[var13];
               var9.add(var14);
               ++var13;
            }

            ++var10;
         }

         return var9;
      }
   }

   private static t[] o(t var0, net.yv.o8 var1, n var2, net.u.j var3, aq var4, long var5, _c var7) {
      if(var7.W(var0)) {
         return var7.u(var0);
      } else {
         t var8 = var0;
         if(z9.s()) {
            t[] var9 = bh.V(var1, var2, var3, var0, var7);
            if(var9.length != 1 || var9[0] != var0) {
               return var9;
            }
         }

         if(z9.O()) {
            var0 = w8.J(var3, var0);
            if(var0 != var8) {
               return var7.u(var0);
            }
         }

         return var7.u(var0);
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
