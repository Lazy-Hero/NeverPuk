package net.n0;

import java.util.List;
import java.util.Random;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.n0.yv;
import net.yz.ad;
import net.yz.aq;

public class r extends y {
   public r() {
      this.M(net.ys.r.X);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      int[] var9 = kw.b();
      if(var5 == aq.DOWN) {
         return ad.FAIL;
      } else {
         boolean var10 = var2.Z(var3).Q().X(var2, var3);
         ks var12 = var1.o((net.yz.k)var4);
         if(!var1.n(var3, var5, var12)) {
            return ad.FAIL;
         } else {
            net.u.j var13 = var3.h();
            boolean var14 = !var2.y(var3) && !var2.Z(var3).Q().X(var2, var3);
            var14 = var14 | (!var2.y(var13) && !var2.Z(var13).Q().X(var2, var13));
            double var15 = (double)var3.t();
            double var17 = (double)var3.h();
            double var19 = (double)var3.y();
            List var21 = var2.u((net.ne.l)null, new net.u.e(var15, var17, var19, var15 + 1.0D, var17 + 2.0D, var19 + 1.0D));
            if(!var21.isEmpty()) {
               return ad.FAIL;
            } else {
               if(!var2.x) {
                  var2.J(var3);
                  var2.J(var13);
                  net.nm.z var22 = new net.nm.z(var2, var15 + 0.5D, var17, var19 + 0.5D);
                  float var23 = (float)net.u.t.M((net.u.t.k(var1.hN - 180.0F) + 22.5F) / 45.0F) * 45.0F;
                  var22.S(var15 + 0.5D, var17, var19 + 0.5D, var23, 0.0F);
                  this.E(var22, var2.G);
                  yv.v(var2, var1, var12, var22);
                  var2.S(var22);
                  var2.L((net.r.r)null, var22.b, var22.hS, var22.hr, net.nb.l.DC, net.yz.p.BLOCKS, 0.75F, 0.8F);
               }

               var12.H(1);
               return ad.SUCCESS;
            }
         }
      }
   }

   private void E(net.nm.z var1, Random var2) {
      net.u.f var3 = var1.u();
      float var4 = var2.nextFloat() * 5.0F;
      float var5 = var2.nextFloat() * 20.0F - 10.0F;
      net.u.f var6 = new net.u.f(var3.D() + var4, var3.L() + var5, var3.K());
      var1.i(var6);
      var3 = var1.G();
      var4 = var2.nextFloat() * 10.0F - 5.0F;
      var6 = new net.u.f(var3.D(), var3.L() + var4, var3.K());
      var1.q(var6);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
