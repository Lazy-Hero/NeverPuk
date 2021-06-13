package net.n0;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.b2;
import net.xn;
import net.n0.k7;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.ad;
import net.yz.am;

public class yk extends y {
   public yk() {
      this.F(1);
      this.M(net.ys.r.k);
   }

   public ks m() {
      return net.n_.y.b(super.m(), net.nb.w.d);
   }

   public ks V(ks var1, net.yv.r var2, net.ne.a var3) {
      int[] var4 = kw.b();
      net.r.r var5 = var3 instanceof net.r.r?(net.r.r)var3:null;
      if(var5 == null || !var5.a6.V) {
         var1.H(1);
      }

      if(var5 instanceof net.r.h) {
         b2.j.l((net.r.h)var5, var1);
      }

      if(!var2.x) {
         Iterator var6 = net.n_.y.y(var1).iterator();
         if(var6.hasNext()) {
            net.n_.i var7 = (net.n_.i)var6.next();
            if(var7.i().u()) {
               var7.i().C(var5, var5, var3, var7.d(), 1.0D);
            }

            var3.o(new net.n_.i(var7));
         }
      }

      if(var5 != null) {
         var5.S(net.v.q.H(this));
      }

      if(var5 == null || !var5.a6.V) {
         if(var1.B()) {
            return new ks(net.nb.j.SG);
         }

         if(var5 != null) {
            var5.a8.D(new ks(net.nb.j.SG));
         }
      }

      return var1;
   }

   public int K(ks var1) {
      return 32;
   }

   public k7 g(ks var1) {
      return k7.DRINK;
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      var2.T(var3);
      return new am(ad.SUCCESS, var2.o((net.yz.k)var3));
   }

   public String m(ks var1) {
      return net.yq.e.E(net.n_.y.h(var1).o("potion.effect."));
   }

   public void h(ks var1, @Nullable net.yv.r var2, List var3, net.yf.f var4) {
      net.n_.y.j(var1, var3, 1.0F);
   }

   public boolean F(ks var1) {
      return super.F(var1) || !net.n_.y.y(var1).isEmpty();
   }

   public void M(net.ys.r var1, net.yz.w var2) {
      if(this.a(var1)) {
         for(net.n_.b var4 : net.n_.b.b) {
            if(var4 != net.nb.w.j) {
               var2.add(net.n_.y.b(new ks(this), var4));
            }
         }
      }

   }

   public static boolean U(int var0) {
      return (var0 & 16384) != 0;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
