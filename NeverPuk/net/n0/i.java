package net.n0;

import javax.annotation.Nullable;
import net.b2;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.yz.ad;
import net.yz.ai;
import net.yz.am;
import net.yz.aq;

public class i extends y {
   private final net.y9.l D;

   public i(net.y9.l var1) {
      this.S = 1;
      this.D = var1;
      this.M(net.ys.r.K);
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      int[] var4 = kw.b();
      boolean var5 = this.D == net.nb.f.ou;
      ks var6 = var2.o((net.yz.k)var3);
      net.u.m var7 = this.X(var1, var2, var5);
      if(var7 == null) {
         return new am(ad.PASS, var6);
      } else if(var7.v != net.u.m.BLOCK) {
         return new am(ad.PASS, var6);
      } else {
         net.u.j var8 = var7.j();
         if(!var1.J(var2, var8)) {
            return new am(ad.FAIL, var6);
         } else {
            boolean var9 = var1.Z(var8).Q().X(var1, var8);
            net.u.j var10 = var7.d == aq.UP?var8:var8.C(var7.d);
            if(!var2.n(var10, var7.d, var6)) {
               return new am(ad.FAIL, var6);
            } else if(this.k(var2, var1, var10)) {
               if(var2 instanceof net.r.h) {
                  b2.D.a((net.r.h)var2, var10, var6);
               }

               var2.S(net.v.q.H(this));
               return !var2.a6.V?new am(ad.SUCCESS, new ks(net.nb.j.YF)):new am(ad.SUCCESS, var6);
            } else {
               return new am(ad.FAIL, var6);
            }
         }
      }
   }

   private ks K(ks var1, net.r.r var2, y var3) {
      if(var2.a6.V) {
         return var1;
      } else {
         var1.H(1);
         if(var1.B()) {
            return new ks(var3);
         } else {
            if(!var2.a8.D(new ks(var3))) {
               var2.Y(new ks(var3), false);
            }

            return var1;
         }
      }
   }

   public boolean k(@Nullable net.r.r var1, net.yv.r var2, net.u.j var3) {
      if(this.D == net.nb.f.ou) {
         return false;
      } else {
         net.yw.n var4 = var2.Z(var3);
         net.y1.l var5 = var4.n();
         boolean var6 = !var5.B();
         boolean var7 = var4.Q().X(var2, var3);
         if(!var2.y(var3)) {
            return false;
         } else {
            if(var2.F.T() && this.D == net.nb.f.dy) {
               int var12 = var3.t();
               int var9 = var3.h();
               int var10 = var3.y();
               var2.M(var1, var3, net.nb.l.oS, net.yz.p.BLOCKS, 0.5F, 2.6F + (var2.G.nextFloat() - var2.G.nextFloat()) * 0.8F);
               int var11 = 0;

               while(true) {
                  var2.n(ai.SMOKE_LARGE, (double)var12 + Math.random(), (double)var9 + Math.random(), (double)var10 + Math.random(), 0.0D, 0.0D, 0.0D, new int[0]);
                  ++var11;
               }
            }

            if(!var2.x && !var5.y()) {
               var2.e(var3, true);
            }

            net.yz.a var8 = this.D == net.nb.f.dj?net.nb.l.Mz:net.nb.l.PQ;
            var2.M(var1, var3, var8, net.yz.p.BLOCKS, 1.0F, 1.0F);
            var2.k(var3, this.D.p(), 11);
            return true;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
