package net.n0;

import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.ky;
import net.n0.y;
import net.yz.ad;
import net.yz.am;
import net.yz.m_;

public class yd extends y {
   public yd() {
      this.d(64);
      this.F(1);
      this.M(net.ys.r.y);
      this.V(new m_("cast"), new ky() {
         public float k(ks var1, @Nullable net.yv.r var2, @Nullable net.ne.a var3) {
            int[] var4 = kw.b();
            if(var3 == null) {
               return 0.0F;
            } else {
               boolean var5 = var3.S() == var1;
               boolean var6 = var3.L() == var1;
               if(var3.S().Z() instanceof yd) {
                  var6 = false;
               }

               return 0.0F;
            }
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   public boolean a() {
      return true;
   }

   public boolean O() {
      return true;
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      kw.b();
      ks var5 = var2.o((net.yz.k)var3);
      if(var2.aS != null) {
         int var6 = var2.aS.V();
         var5.S(var6, var2);
         var2.N(var3);
         var1.L((net.r.r)null, var2.b, var2.hS, var2.hr, net.nb.l.E, net.yz.p.NEUTRAL, 1.0F, 0.4F / (u.nextFloat() * 0.4F + 0.8F));
      }

      var1.L((net.r.r)null, var2.b, var2.hS, var2.hr, net.nb.l.CA, net.yz.p.NEUTRAL, 0.5F, 0.4F / (u.nextFloat() * 0.4F + 0.8F));
      if(!var1.x) {
         net.n1.q var9 = new net.n1.q(var1, var2);
         int var7 = net.c1.y.K(var5);
         if(var7 > 0) {
            var9.A(var7);
         }

         int var8 = net.c1.y.O(var5);
         if(var8 > 0) {
            var9.z(var8);
         }

         var1.S(var9);
      }

      var2.N(var3);
      var2.S(net.v.q.H(this));
      return new am(ad.SUCCESS, var5);
   }

   public int z() {
      return 1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
