package net.n0;

import net.b2;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.y9.lk;
import net.y9.rn;
import net.yz.ad;
import net.yz.aq;

public class o extends y {
   public o() {
      this.M(net.ys.r.X);
      this.d(0);
      this.z(true);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      int[] var9 = kw.b();
      if(var2.x) {
         return ad.SUCCESS;
      } else if(var5 != aq.UP) {
         return ad.FAIL;
      } else {
         net.yw.n var10 = var2.Z(var3);
         net.y9.l var11 = var10.Q();
         boolean var12 = var11.X(var2, var3);
         if(!var12) {
            var3 = var3.h();
         }

         int var13 = net.u.t.L((double)(var1.hN * 4.0F / 360.0F) + 0.5D) & 3;
         aq var14 = aq.Q(var13);
         net.u.j var15 = var3.C(var14);
         ks var16 = var1.o((net.yz.k)var4);
         if(var1.n(var3, var5, var16) && var1.n(var15, var5, var16)) {
            net.yw.n var17 = var2.Z(var15);
            boolean var18 = var17.Q().X(var2, var15);
            if(!var12 && !var2.y(var3)) {
               boolean var25 = false;
            } else {
               boolean var10000 = true;
            }

            if(!var18 && !var2.y(var15)) {
               boolean var27 = false;
            } else {
               boolean var26 = true;
            }

            if(var2.Z(var3.b()).z() && var2.Z(var15.b()).z()) {
               net.yw.n var21 = net.nb.f.uP.p().s(rn.F, Boolean.valueOf(false)).s(rn.N, var14).s(rn.d, rn.a.FOOT);
               var2.k(var3, var21, 10);
               var2.k(var15, var21.s(rn.d, rn.a.HEAD), 10);
               lk var22 = var21.Q().X();
               var2.M((net.r.r)null, var3, var22.J(), net.yz.p.BLOCKS, (var22.m() + 1.0F) / 2.0F, var22.X() * 0.8F);
               net.ni.v var23 = var2.L(var15);
               if(var23 instanceof net.ni.y) {
                  ((net.ni.y)var23).N(var16);
               }

               net.ni.v var24 = var2.L(var3);
               if(var24 instanceof net.ni.y) {
                  ((net.ni.y)var24).N(var16);
               }

               var2.c(var3, var11, false);
               var2.c(var15, var17.Q(), false);
               if(var1 instanceof net.r.h) {
                  b2.D.a((net.r.h)var1, var3, var16);
               }

               var16.H(1);
               return ad.SUCCESS;
            } else {
               return ad.FAIL;
            }
         } else {
            return ad.FAIL;
         }
      }
   }

   public String f(ks var1) {
      return super.z() + "." + kw.h(var1.n()).h();
   }

   public void M(net.ys.r var1, net.yz.w var2) {
      if(this.a(var1)) {
         int var3 = 0;

         while(true) {
            var2.add(new ks(this, 1, var3));
            ++var3;
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
