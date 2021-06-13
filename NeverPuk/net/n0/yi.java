package net.n0;

import javax.annotation.Nullable;
import net.xn;
import net.n0.j;
import net.n0.ks;
import net.n0.kw;
import net.n0.ky;
import net.n0.y;
import net.nl.z2;
import net.y9.zz;
import net.yz.ad;
import net.yz.am;
import net.yz.m_;

public class yi extends y {
   public yi() {
      this.S = 1;
      this.d(432);
      this.M(net.ys.r.Y);
      this.V(new m_("broken"), new ky() {
         public float k(ks var1, @Nullable net.yv.r var2, @Nullable net.ne.a var3) {
            return yi.C(var1)?0.0F:1.0F;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      zz.f.H(this, j.H);
   }

   public static boolean C(ks var0) {
      int[] var1 = kw.b();
      return var0.z() < var0.Z() - 1;
   }

   public boolean l(ks var1, ks var2) {
      return var2.Z() == net.nb.j.Yr;
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      ks var5 = var2.o((net.yz.k)var3);
      kw.b();
      z2 var6 = net.ne.y.M(var5);
      ks var7 = var2.U(var6);
      if(var7.B()) {
         var2.u(var6, var5.s());
         var5.u(0);
         return new am(ad.SUCCESS, var5);
      } else {
         return new am(ad.FAIL, var5);
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
