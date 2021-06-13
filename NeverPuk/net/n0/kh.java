package net.n0;

import com.google.common.collect.Sets;
import java.util.Set;
import net.xn;
import net.n0.k_;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.ad;
import net.yz.aq;

public class kh extends k_ {
   private static final Set n = Sets.newHashSet(new net.y9.l[]{net.nb.f.uz, net.nb.f.dl, net.nb.f.dJ, net.nb.f.p, net.nb.f.D, net.nb.f.u2, net.nb.f.TF, net.nb.f.V, net.nb.f.Tl, net.nb.f.u9, net.nb.f.A, net.nb.f.db});

   public kh(y.d var1) {
      super(1.5F, -3.0F, var1, n);
   }

   public boolean W(net.yw.n var1) {
      kw.b();
      net.y9.l var3 = var1.Q();
      return var3 == net.nb.f.Tl?true:var3 == net.nb.f.V;
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      kw.b();
      ks var10 = var1.o((net.yz.k)var4);
      if(!var1.n(var3.C(var5), var5, var10)) {
         return ad.FAIL;
      } else {
         net.yw.n var11 = var2.Z(var3);
         net.y9.l var12 = var11.Q();
         if(var5 != aq.DOWN && var2.Z(var3.h()).n() == net.y1.l.q && var12 == net.nb.f.p) {
            net.yw.n var13 = net.nb.f.A.p();
            var2.M(var1, var3, net.nb.l.KT, net.yz.p.BLOCKS, 1.0F, 1.0F);
            if(!var2.x) {
               var2.k(var3, var13, 11);
               var10.S(1, var1);
            }

            return ad.SUCCESS;
         } else {
            return ad.PASS;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
