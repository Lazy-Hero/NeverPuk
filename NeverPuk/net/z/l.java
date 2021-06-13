package net.z;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.xn;
import net.z.g;
import net.z.r;

public class l {
   public static String j(String var0, boolean var1) {
      return !net.nn.j.b().T.ig?net.cb.z.q(var0):var0;
   }

   public static List f(net.cb.t var0, int var1, r var2, boolean var3, boolean var4) {
      g.B();
      byte var6 = 0;
      net.cb.l var7 = new net.cb.l("");
      ArrayList var8 = Lists.newArrayList();
      ArrayList var9 = Lists.newArrayList(var0);
      int var10 = 0;
      if(var10 < var9.size()) {
         net.cb.t var11 = (net.cb.t)var9.get(var10);
         String var12 = var11.Y();
         boolean var13 = false;
         if(var12.contains("\n")) {
            int var14 = var12.indexOf(10);
            String var15 = var12.substring(var14 + 1);
            var12 = var12.substring(0, var14 + 1);
            net.cb.l var16 = new net.cb.l(var15);
            var16.r(var11.E().A());
            var9.add(var10 + 1, var16);
            var13 = true;
         }

         String var27 = j(var11.E().V() + var12, var4);
         String var28 = var27.endsWith("\n")?var27.substring(0, var27.length() - 1):var27;
         int var29 = var2.r(var28);
         net.cb.l var17 = new net.cb.l(var28);
         var17.r(var11.E().A());
         if(var6 + var29 > var1) {
            String var18 = var2.c(var27, var1 - var6, false);
            String var19 = var18.length() < var27.length()?var27.substring(var18.length()):null;
            if(!var19.isEmpty()) {
               int var20 = var18.lastIndexOf(32);
               if(var20 >= 0 && var2.r(var27.substring(0, var20)) > 0) {
                  var18 = var27.substring(0, var20);
                  ++var20;
                  var19 = var27.substring(var20);
               }

               net.cb.l var21 = new net.cb.l(var19);
               var21.r(var11.E().A());
               var9.add(var10 + 1, var21);
            }

            var29 = var2.r(var18);
            var17 = new net.cb.l(var18);
            var17.r(var11.E().A());
            var13 = true;
         }

         if(var6 + var29 <= var1) {
            int var10000 = var6 + var29;
            var7.h(var17);
         }

         var13 = true;
         var8.add(var7);
         var6 = 0;
         var7 = new net.cb.l("");
         ++var10;
      }

      var8.add(var7);
      return var8;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
