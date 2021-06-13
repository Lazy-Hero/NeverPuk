package net.n0;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kt;
import net.n0.kw;
import net.n0.y;
import net.y9.zq;
import net.yz.ad;
import net.yz.aq;

public class kb extends y {
   private static final Map p = Maps.newHashMap();
   private final net.yz.a t;
   private final String m;

   protected kb(String var1, net.yz.a var2) {
      this.m = "item.record." + var1 + ".desc";
      this.t = var2;
      this.S = 1;
      this.M(net.ys.r.K);
      p.put(this.t, this);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      kw.b();
      net.yw.n var10 = var2.Z(var3);
      if(var10.Q() == net.nb.f.ue && !((Boolean)var10.i(zq.O)).booleanValue()) {
         if(!var2.x) {
            ks var11 = var1.o((net.yz.k)var4);
            ((zq)net.nb.f.ue).L(var2, var3, var10, var11);
            var2.N((net.r.r)null, 1010, var3, y.h(this));
            var11.H(1);
            var1.S(net.v.q.e);
         }

         return ad.SUCCESS;
      } else {
         return ad.PASS;
      }
   }

   public void h(ks var1, @Nullable net.yv.r var2, List var3, net.yf.f var4) {
      var3.add(this.I());
   }

   public String I() {
      return net.yq.e.E(this.m);
   }

   public kt B(ks var1) {
      return kt.RARE;
   }

   @Nullable
   public static kb Y(net.yz.a var0) {
      return (kb)p.get(var0);
   }

   public net.yz.a B() {
      return this.t;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
