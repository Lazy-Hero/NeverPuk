package net.n0;

import java.util.List;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.ad;
import net.yz.aq;

public class yg extends y {
   public yg() {
      this.e("end_crystal");
      this.M(net.ys.r.X);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      kw.b();
      net.yw.n var10 = var2.Z(var3);
      if(var10.Q() != net.nb.f.c && var10.Q() != net.nb.f.T8) {
         return ad.FAIL;
      } else {
         net.u.j var11 = var3.h();
         ks var12 = var1.o((net.yz.k)var4);
         if(!var1.n(var11, var5, var12)) {
            return ad.FAIL;
         } else {
            net.u.j var13 = var11.h();
            boolean var14 = !var2.y(var11) && !var2.Z(var11).Q().X(var2, var11);
            var14 = var14 | (!var2.y(var13) && !var2.Z(var13).Q().X(var2, var13));
            double var15 = (double)var11.t();
            double var17 = (double)var11.h();
            double var19 = (double)var11.y();
            List var21 = var2.u((net.ne.l)null, new net.u.e(var15, var17, var19, var15 + 1.0D, var17 + 2.0D, var19 + 1.0D));
            if(!var21.isEmpty()) {
               return ad.FAIL;
            } else {
               if(!var2.x) {
                  net.nm.j var22 = new net.nm.j(var2, (double)((float)var3.t() + 0.5F), (double)(var3.h() + 1), (double)((float)var3.y() + 0.5F));
                  var22.a(false);
                  var2.S(var22);
                  if(var2.F instanceof net.yv.k) {
                     net.yd.y var23 = ((net.yv.k)var2.F).C();
                     var23.J();
                  }
               }

               var12.H(1);
               return ad.SUCCESS;
            }
         }
      }
   }

   public boolean F(ks var1) {
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
