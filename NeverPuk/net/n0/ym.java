package net.n0;

import com.google.common.base.Predicate;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.ad;
import net.yz.am;

public class ym extends y {
   public ym() {
      this.M(net.ys.r.k);
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      kw.b();
      List var5 = var1.L(net.ne.w.class, var2.i().x(2.0D), new Predicate() {
         public boolean T(@Nullable net.ne.w var1) {
            int[] var2 = kw.b();
            return var1 != null && var1.P() && var1.V() instanceof net.a.t;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      ks var6 = var2.o((net.yz.k)var3);
      if(!var5.isEmpty()) {
         net.ne.w var9 = (net.ne.w)var5.get(0);
         var9.h(var9.J() - 0.5F);
         var1.L((net.r.r)null, var2.b, var2.hS, var2.hr, net.nb.l.Dq, net.yz.p.NEUTRAL, 1.0F, 1.0F);
         return new am(ad.SUCCESS, this.i(var6, var2, new ks(net.nb.j.Ym)));
      } else {
         net.u.m var7 = this.X(var1, var2, true);
         if(var7 == null) {
            return new am(ad.PASS, var6);
         } else {
            if(var7.v == net.u.m.BLOCK) {
               net.u.j var8 = var7.j();
               if(!var1.J(var2, var8) || !var2.n(var8.C(var7.d), var7.d, var6)) {
                  return new am(ad.PASS, var6);
               }

               if(var1.Z(var8).n() == net.y1.l.p) {
                  var1.L(var2, var2.b, var2.hS, var2.hr, net.nb.l.wB, net.yz.p.NEUTRAL, 1.0F, 1.0F);
                  return new am(ad.SUCCESS, this.i(var6, var2, net.n_.y.b(new ks(net.nb.j.I), net.nb.w.d)));
               }
            }

            return new am(ad.PASS, var6);
         }
      }
   }

   protected ks i(ks var1, net.r.r var2, ks var3) {
      var1.H(1);
      var2.S(net.v.q.H(this));
      if(var1.B()) {
         return var3;
      } else {
         if(!var2.a8.D(var3)) {
            var2.Y(var3, false);
         }

         return var1;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
