package net.n0;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.n0.yh;
import net.yz.ad;
import net.yz.am;
import net.yz.aq;

public class yc extends y {
   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      if(!var2.x) {
         ks var9 = var1.o((net.yz.k)var4);
         net.nm.n var10 = new net.nm.n(var2, (double)((float)var3.t() + var6), (double)((float)var3.h() + var7), (double)((float)var3.y() + var8), var9);
         var2.S(var10);
         if(!var1.a6.V) {
            var9.H(1);
         }
      }

      return ad.SUCCESS;
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      if(var2.I()) {
         ks var4 = var2.o((net.yz.k)var3);
         if(!var1.x) {
            net.nm.n var5 = new net.nm.n(var1, var4, var2);
            var1.S(var5);
            if(!var2.a6.V) {
               var4.H(1);
            }
         }

         return new am(ad.SUCCESS, var2.o((net.yz.k)var3));
      } else {
         return new am(ad.PASS, var2.o((net.yz.k)var3));
      }
   }

   public void h(ks var1, @Nullable net.yv.r var2, List var3, net.yf.f var4) {
      kw.b();
      net.nj.f var6 = var1.j("Fireworks");
      if(var6 != null) {
         if(var6.K("Flight", 99)) {
            var3.add(net.yq.e.E("item.fireworks.flight") + " " + var6.R("Flight"));
         }

         net.nj.h var7 = var6.A("Explosions", 10);
         if(!var7.N()) {
            int var8 = 0;
            if(var8 < var7.z()) {
               net.nj.f var9 = var7.i(var8);
               ArrayList var10 = Lists.newArrayList();
               yh.L(var9, var10);
               if(!var10.isEmpty()) {
                  int var11 = 1;
                  if(var11 < var10.size()) {
                     var10.set(var11, "  " + (String)var10.get(var11));
                     ++var11;
                  }

                  var3.addAll(var10);
               }

               ++var8;
            }
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
