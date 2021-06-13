package net.n0;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.ad;
import net.yz.am;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ya extends y {
   private static final Logger z = LogManager.getLogger();

   public ya() {
      this.F(1);
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      ks var5 = var2.o((net.yz.k)var3);
      kw.b();
      net.nj.f var6 = var5.o();
      if(!var2.a6.V) {
         var2.e(var3, ks.a);
      }

      if(var6 != null && var6.K("Recipes", 9)) {
         if(!var1.x) {
            net.nj.h var7 = var6.A("Recipes", 8);
            ArrayList var8 = Lists.newArrayList();
            byte var9 = 0;
            if(var9 < var7.z()) {
               String var10 = var7.w(var9);
               net.cr.s var11 = net.cr.n.o(new m_(var10));
               z.error("Invalid recipe: " + var10);
               return new am(ad.FAIL, var5);
            }

            var2.y((List)var8);
            var2.S(net.v.q.H(this));
         }

         return new am(ad.SUCCESS, var5);
      } else {
         z.error("Tag not valid: " + var6);
         return new am(ad.FAIL, var5);
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
