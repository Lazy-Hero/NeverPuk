package net.n0;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.y9.lk;
import net.y9.r9;
import net.yz.ad;
import net.yz.aq;

public class yo extends y {
   private final net.y9.l A;

   public yo(net.y9.l var1) {
      this.A = var1;
      this.M(net.ys.r.i);
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      if(var5 != aq.UP) {
         return ad.FAIL;
      } else {
         net.yw.n var9 = var2.Z(var3);
         net.y9.l var10 = var9.Q();
         if(!var10.X(var2, var3)) {
            var3 = var3.C(var5);
         }

         ks var11 = var1.o((net.yz.k)var4);
         if(var1.n(var3, var5, var11) && this.A.J(var2, var3)) {
            aq var12 = aq.d((double)var1.hN);
            int var13 = var12.v();
            int var14 = var12.P();
            boolean var15 = var8 < 0.5F || var8 > 0.5F || var6 > 0.5F || var6 < 0.5F;
            u(var2, var3, var12, this.A, var15);
            lk var16 = this.A.X();
            var2.M(var1, var3, var16.J(), net.yz.p.BLOCKS, (var16.m() + 1.0F) / 2.0F, var16.X() * 0.8F);
            var11.H(1);
            return ad.SUCCESS;
         } else {
            return ad.FAIL;
         }
      }
   }

   public static void u(net.yv.r var0, net.u.j var1, aq var2, net.y9.l var3, boolean var4) {
      kw.b();
      net.u.j var6 = var1.C(var2.R());
      net.u.j var7 = var1.C(var2.i());
      int var8 = (var0.Z(var7).i()?1:0) + (var0.Z(var7.h()).i()?1:0);
      int var9 = (var0.Z(var6).i()?1:0) + (var0.Z(var6.h()).i()?1:0);
      if(var0.Z(var7).Q() != var3 && var0.Z(var7.h()).Q() != var3) {
         boolean var15 = false;
      } else {
         boolean var10000 = true;
      }

      if(var0.Z(var6).Q() != var3 && var0.Z(var6.h()).Q() != var3) {
         boolean var17 = false;
      } else {
         boolean var16 = true;
      }

      net.u.j var12 = var1.h();
      boolean var13 = var0.B(var1) || var0.B(var12);
      net.yw.n var14 = var3.p().s(r9.D, var2).s(r9.h, r9.h.RIGHT).s(r9.Y, Boolean.valueOf(var13)).s(r9.E, Boolean.valueOf(var13));
      var0.k(var1, var14.s(r9.W, r9.k.LOWER), 2);
      var0.k(var12, var14.s(r9.W, r9.k.UPPER), 2);
      var0.b(var1, var3, false);
      var0.b(var12, var3, false);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
