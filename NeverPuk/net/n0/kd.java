package net.n0;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.ad;
import net.yz.am;

public class kd extends y {
   public kd() {
      this.F(1);
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      ks var4 = var2.o((net.yz.k)var3);
      var2.Q(var4, var3);
      var2.S(net.v.q.H(this));
      return new am(ad.SUCCESS, var4);
   }

   public static boolean e(net.nj.f var0) {
      int[] var1 = kw.b();
      if(var0 == null) {
         return false;
      } else if(!var0.K("pages", 9)) {
         return false;
      } else {
         net.nj.h var2 = var0.A("pages", 8);
         int var3 = 0;
         if(var3 < var2.z()) {
            String var4 = var2.w(var3);
            if(var4.length() > 32767) {
               return false;
            }

            ++var3;
         }

         return true;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
