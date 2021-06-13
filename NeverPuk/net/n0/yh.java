package net.n0;

import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.n0.y4;

public class yh extends y {
   public static net.nj.q a(ks var0, String var1) {
      if(var0.D()) {
         net.nj.f var2 = var0.o().o("Explosion");
         return var2.m(var1);
      } else {
         return null;
      }
   }

   public void h(ks var1, @Nullable net.yv.r var2, List var3, net.yf.f var4) {
      if(var1.D()) {
         net.nj.f var5 = var1.o().o("Explosion");
         L(var5, var3);
      }

   }

   public static void L(net.nj.f var0, List var1) {
      kw.b();
      byte var3 = var0.R("Type");
      if(var3 >= 0 && var3 <= 4) {
         var1.add(net.yq.e.E("item.fireworksCharge.type." + var3).trim());
      }

      var1.add(net.yq.e.E("item.fireworksCharge.type").trim());
      int[] var4 = var0.g("Colors");
      if(var4.length > 0) {
         boolean var5 = true;
         String var6 = "";
         int var8 = var4.length;
         int var9 = 0;
         if(var9 < var8) {
            int var10 = var4[var9];
            var5 = false;
            boolean var11 = false;
            int var12 = 0;
            if(var12 < y4.m.length) {
               if(var10 == y4.m[var12]) {
                  var11 = true;
                  var6 = var6 + net.yq.e.E("item.fireworksCharge." + kw.q(var12).h());
               }

               ++var12;
            }

            var6 = var6 + net.yq.e.E("item.fireworksCharge.customColor");
            ++var9;
         }

         var1.add(var6);
      }

      int[] var15 = var0.g("FadeColors");
      if(var15.length > 0) {
         boolean var16 = true;
         String var7 = net.yq.e.E("item.fireworksCharge.fadeTo") + " ";
         int var21 = var15.length;
         int var22 = 0;
         if(var22 < var21) {
            int var25 = var15[var22];
            var16 = false;
            boolean var27 = false;
            int var13 = 0;
            if(var25 == y4.m[var13]) {
               var27 = true;
               var7 = var7 + net.yq.e.E("item.fireworksCharge." + kw.q(var13).h());
            }

            ++var13;
            var7 = var7 + net.yq.e.E("item.fireworksCharge.customColor");
            ++var22;
         }

         var1.add(var7);
      }

      boolean var18 = var0.i("Trail");
      if(var18) {
         var1.add(net.yq.e.E("item.fireworksCharge.trail"));
      }

      boolean var19 = var0.i("Flicker");
      if(var19) {
         var1.add(net.yq.e.E("item.fireworksCharge.flicker"));
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
