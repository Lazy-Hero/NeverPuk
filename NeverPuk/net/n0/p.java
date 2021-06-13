package net.n0;

import net.b2;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.q;
import net.y9.lk;
import net.y9.lu;
import net.yz.ad;
import net.yz.aq;

public class p extends q {
   private final lu x;
   private final lu n;

   public p(net.y9.l var1, lu var2, lu var3) {
      super(var1);
      this.x = var2;
      this.n = var3;
      this.d(0);
      this.z(true);
   }

   public int o(int var1) {
      return var1;
   }

   public String f(ks var1) {
      return this.x.G(var1.n());
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      kw.b();
      ks var10 = var1.o((net.yz.k)var4);
      if(!var10.B() && var1.n(var3.C(var5), var5, var10)) {
         Comparable var11 = this.x.b(var10);
         net.yw.n var12 = var2.Z(var3);
         if(var12.Q() == this.x) {
            net.yr.h var13 = this.x.R();
            Comparable var14 = var12.i(var13);
            lu.k var15 = (lu.k)var12.i(lu.R);
            if((var5 == aq.UP && var15 == lu.k.BOTTOM || var5 == aq.DOWN && var15 == lu.k.TOP) && var14 == var11) {
               net.yw.n var16 = this.t(var13, var14);
               net.u.e var17 = var16.D(var2, var3);
               if(var17 != net.y9.l.q && var2.D(var17.c(var3)) && var2.k(var3, var16, 11)) {
                  lk var18 = this.n.X();
                  var2.M(var1, var3, var18.J(), net.yz.p.BLOCKS, (var18.m() + 1.0F) / 2.0F, var18.X() * 0.8F);
                  var10.H(1);
                  if(var1 instanceof net.r.h) {
                     b2.D.a((net.r.h)var1, var3, var10);
                  }
               }

               return ad.SUCCESS;
            }
         }

         return this.i(var1, var10, var2, var3.C(var5), var11)?ad.SUCCESS:super.y(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         return ad.FAIL;
      }
   }

   public boolean S(net.yv.r var1, net.u.j var2, aq var3, net.r.r var4, ks var5) {
      net.u.j var6 = var2;
      net.yr.h var7 = this.x.R();
      Comparable var8 = this.x.b(var5);
      net.yw.n var9 = var1.Z(var2);
      if(var9.Q() == this.x) {
         boolean var10 = var9.i(lu.R) == lu.k.TOP;
         if(var3 == aq.UP) {
            ;
         }

         if(var3 == aq.DOWN && var8 == var9.i(var7)) {
            return true;
         }
      }

      var2 = var2.C(var3);
      net.yw.n var12 = var1.Z(var2);
      return var12.Q() == this.x && var8 == var12.i(var7) || super.S(var1, var6, var3, var4, var5);
   }

   private boolean i(net.r.r var1, ks var2, net.yv.r var3, net.u.j var4, Object var5) {
      net.yw.n var6 = var3.Z(var4);
      if(var6.Q() == this.x) {
         Comparable var7 = var6.i(this.x.R());
         if(var7 == var5) {
            net.yw.n var8 = this.t(this.x.R(), var7);
            net.u.e var9 = var8.D(var3, var4);
            if(var9 != net.y9.l.q && var3.D(var9.c(var4)) && var3.k(var4, var8, 11)) {
               lk var10 = this.n.X();
               var3.M(var1, var4, var10.J(), net.yz.p.BLOCKS, (var10.m() + 1.0F) / 2.0F, var10.X() * 0.8F);
               var2.H(1);
            }

            return true;
         }
      }

      return false;
   }

   protected net.yw.n t(net.yr.h var1, Comparable var2) {
      return this.n.p().s(var1, var2);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
