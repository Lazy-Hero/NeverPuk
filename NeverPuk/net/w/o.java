package net.w;

import com.google.common.base.Predicates;
import java.util.Iterator;
import java.util.Random;
import net.xn;
import net.w.f;
import net.y9.lb;
import net.y9.lu;
import net.y9.ri;
import net.yz.aq;

public class o extends f {
   private static final net.cw.j k = net.cw.j.T(net.nb.f.TF).f(ri.F, Predicates.equalTo(ri.g.SAND));
   private final net.yw.n x = net.nb.f.Tt.p().s(lb.v, lb.p.SAND).s(lu.R, lu.k.BOTTOM);
   private final net.yw.n G = net.nb.f.ul.p();
   private final net.yw.n M = net.nb.f.dy.p();

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      int var4 = f.j();
      if(var1.y(var3) && var3.h() > 2) {
         var3 = var3.b();
      }

      if(!k.i(var1.Z(var3))) {
         return false;
      } else {
         int var5 = -2;
         int var6 = -2;
         if(var1.y(var3.F(var5, -1, var6)) && var1.y(var3.F(var5, -2, var6))) {
            return false;
         } else {
            ++var6;
            ++var5;
            var5 = -1;
            var6 = -2;
            int var7 = -2;
            var1.k(var3.F(var6, var5, var7), this.G, 2);
            ++var7;
            ++var6;
            ++var5;
            var1.k(var3, this.M, 2);
            Iterator var11 = aq.u.HORIZONTAL.iterator();
            if(var11.hasNext()) {
               aq var21 = (aq)var11.next();
               var1.k(var3.C(var21), this.M, 2);
            }

            int var12 = -2;
            var6 = -2;
            var1.k(var3.F(var12, 1, var6), this.G, 2);
            ++var6;
            ++var12;
            var1.k(var3.F(2, 1, 0), this.x, 2);
            var1.k(var3.F(-2, 1, 0), this.x, 2);
            var1.k(var3.F(0, 1, 2), this.x, 2);
            var1.k(var3.F(0, 1, -2), this.x, 2);
            var12 = -1;
            var6 = -1;
            var1.k(var3.F(var12, 4, var6), this.x, 2);
            ++var6;
            ++var12;
            var12 = 1;
            var1.k(var3.F(-1, var12, -1), this.G, 2);
            var1.k(var3.F(-1, var12, 1), this.G, 2);
            var1.k(var3.F(1, var12, -1), this.G, 2);
            var1.k(var3.F(1, var12, 1), this.G, 2);
            ++var12;
            return true;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
