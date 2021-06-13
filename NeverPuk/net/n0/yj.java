package net.n0;

import net.b2;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.y9.rf;
import net.yz.ad;
import net.yz.ai;
import net.yz.am;
import net.yz.aq;

public class yj extends y {
   public yj() {
      this.M(net.ys.r.K);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      kw.b();
      net.yw.n var10 = var2.Z(var3);
      ks var11 = var1.o((net.yz.k)var4);
      if(var1.n(var3.C(var5), var5, var11) && var10.Q() == net.nb.f.dE && !((Boolean)var10.i(rf.N)).booleanValue()) {
         if(var2.x) {
            return ad.SUCCESS;
         } else {
            var2.k(var3, var10.s(rf.N, Boolean.valueOf(true)), 2);
            var2.Z(var3, net.nb.f.dE);
            var11.H(1);
            int var12 = 0;
            double var13 = (double)((float)var3.t() + (5.0F + u.nextFloat() * 6.0F) / 16.0F);
            double var15 = (double)((float)var3.h() + 0.8125F);
            double var17 = (double)((float)var3.y() + (5.0F + u.nextFloat() * 6.0F) / 16.0F);
            double var10000 = 0.0D;
            var10000 = 0.0D;
            var10000 = 0.0D;
            var2.n(ai.SMOKE_NORMAL, var13, var15, var17, 0.0D, 0.0D, 0.0D, new int[0]);
            ++var12;
            var2.M((net.r.r)null, var3, net.nb.l.M3, net.yz.p.BLOCKS, 1.0F, 1.0F);
            net.cw.t var26 = rf.R().X(var2, var3);
            if(var26 != null) {
               net.u.j var27 = var26.W().F(-3, 0, -3);
               int var14 = 0;
               int var29 = 0;
               var2.k(var27.F(var14, 0, var29), net.nb.f.TG.p(), 2);
               ++var29;
               ++var14;
               var2.A(1038, var27.F(1, 0, 1), 0);
            }

            return ad.SUCCESS;
         }
      } else {
         return ad.FAIL;
      }
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      ks var4 = var2.o((net.yz.k)var3);
      net.u.m var5 = this.X(var1, var2, false);
      if(var5.v == net.u.m.BLOCK && var1.Z(var5.j()).Q() == net.nb.f.dE) {
         return new am(ad.PASS, var4);
      } else {
         var2.T(var3);
         if(!var1.x) {
            net.u.j var6 = ((net.yv.d)var1).E().p(var1, "Stronghold", new net.u.j(var2), false);
            net.nm.a var7 = new net.nm.a(var1, var2.b, var2.hS + (double)(var2.m / 2.0F), var2.hr);
            var7.R(var6);
            var1.S(var7);
            if(var2 instanceof net.r.h) {
               b2.V.f((net.r.h)var2, var6);
            }

            var1.L((net.r.r)null, var2.b, var2.hS, var2.hr, net.nb.l.KE, net.yz.p.NEUTRAL, 0.5F, 0.4F / (u.nextFloat() * 0.4F + 0.8F));
            var1.N((net.r.r)null, 1003, new net.u.j(var2), 0);
            if(!var2.a6.V) {
               var4.H(1);
            }

            var2.S(net.v.q.H(this));
            return new am(ad.SUCCESS, var4);
         } else {
            return new am(ad.SUCCESS, var4);
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
