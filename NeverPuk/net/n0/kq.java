package net.n0;

import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.c;
import net.n0.j;
import net.n0.k7;
import net.n0.ks;
import net.n0.kw;
import net.n0.ky;
import net.n0.y;
import net.y9.zz;
import net.yz.ad;
import net.yz.am;
import net.yz.m_;

public class kq extends y {
   public kq() {
      this.S = 1;
      this.M(net.ys.r.R);
      this.d(336);
      this.V(new m_("blocking"), new ky() {
         public float k(ks var1, @Nullable net.yv.r var2, @Nullable net.ne.a var3) {
            int[] var4 = kw.b();
            return var3 != null && var3.F() && var3.t() == var1?1.0F:0.0F;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      zz.f.H(this, j.H);
   }

   public String m(ks var1) {
      int[] var2 = kw.b();
      if(var1.j("BlockEntityTag") != null) {
         kw var3 = net.ni.g.P(var1);
         return net.yq.e.E("item.shield." + var3.h() + ".name");
      } else {
         return net.yq.e.E("item.shield.name");
      }
   }

   public void h(ks var1, @Nullable net.yv.r var2, List var3, net.yf.f var4) {
      c.R(var1, var3);
   }

   public k7 g(ks var1) {
      return k7.BLOCK;
   }

   public int K(ks var1) {
      return 72000;
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      ks var4 = var2.o((net.yz.k)var3);
      var2.T(var3);
      return new am(ad.SUCCESS, var4);
   }

   public boolean l(ks var1, ks var2) {
      int[] var3 = kw.b();
      return var2.Z() == y.q(net.nb.f.oN) || super.l(var1, var2);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
