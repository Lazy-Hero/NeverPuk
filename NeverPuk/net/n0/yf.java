package net.n0;

import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.yk;
import net.yz.ad;
import net.yz.am;

public class yf extends yk {
   public String m(ks var1) {
      return net.yq.e.E(net.n_.y.h(var1).o("lingering_potion.effect."));
   }

   public void h(ks var1, @Nullable net.yv.r var2, List var3, net.yf.f var4) {
      net.n_.y.j(var1, var3, 0.25F);
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      kw.b();
      ks var5 = var2.o((net.yz.k)var3);
      ks var6 = var2.a6.V?var5.s():var5.w(1);
      var1.L((net.r.r)null, var2.b, var2.hS, var2.hr, net.nb.l.o8, net.yz.p.NEUTRAL, 0.5F, 0.4F / (u.nextFloat() * 0.4F + 0.8F));
      if(!var1.x) {
         net.n1.g var7 = new net.n1.g(var1, var2, var6);
         var7.X(var2, var2.V, var2.hN, -20.0F, 0.5F, 1.0F);
         var1.S(var7);
      }

      var2.S(net.v.q.H(this));
      return new am(ad.SUCCESS, var5);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
