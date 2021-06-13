package net.n0;

import java.util.List;
import javax.annotation.Nullable;
import net.b2;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.y;
import net.y9.lk;
import net.yz.ad;
import net.yz.aq;

public class q extends y {
   protected final net.y9.l A;

   public q(net.y9.l var1) {
      this.A = var1;
   }

   public ad y(net.r.r var1, net.yv.r var2, net.u.j var3, net.yz.k var4, aq var5, float var6, float var7, float var8) {
      kw.b();
      net.yw.n var10 = var2.Z(var3);
      net.y9.l var11 = var10.Q();
      if(!var11.X(var2, var3)) {
         var3 = var3.C(var5);
      }

      ks var12 = var1.o((net.yz.k)var4);
      if(!var12.B() && var1.n(var3, var5, var12) && var2.j(this.A, var3, false, var5, (net.ne.l)null)) {
         int var13 = this.o(var12.n());
         net.yw.n var14 = this.A.U(var2, var3, var5, var6, var7, var8, var13, var1);
         if(var2.k(var3, var14, 11)) {
            var14 = var2.Z(var3);
            if(var14.Q() == this.A) {
               k(var2, var1, var3, var12);
               this.A.o((net.yv.r)var2, (net.u.j)var3, (net.yw.n)var14, (net.ne.a)var1, (ks)var12);
               if(var1 instanceof net.r.h) {
                  b2.D.a((net.r.h)var1, var3, var12);
               }
            }

            lk var15 = this.A.X();
            var2.M(var1, var3, var15.J(), net.yz.p.BLOCKS, (var15.m() + 1.0F) / 2.0F, var15.X() * 0.8F);
            var12.H(1);
         }

         return ad.SUCCESS;
      } else {
         return ad.FAIL;
      }
   }

   public static boolean k(net.yv.r var0, @Nullable net.r.r var1, net.u.j var2, ks var3) {
      net.nx.f var4 = var0.v();
      return false;
   }

   public boolean S(net.yv.r var1, net.u.j var2, aq var3, net.r.r var4, ks var5) {
      net.y9.l var6 = var1.Z(var2).Q();
      if(var6 == net.nb.f.Tl) {
         var3 = aq.UP;
      } else if(!var6.X(var1, var2)) {
         var2 = var2.C(var3);
      }

      return var1.j(this.A, var2, false, var3, (net.ne.l)null);
   }

   public String f(ks var1) {
      return this.A.j();
   }

   public String z() {
      return this.A.j();
   }

   public net.ys.r V() {
      return this.A.N();
   }

   public void M(net.ys.r var1, net.yz.w var2) {
      if(this.a(var1)) {
         this.A.C(var1, var2);
      }

   }

   public void h(ks var1, @Nullable net.yv.r var2, List var3, net.yf.f var4) {
      super.h(var1, var2, var3, var4);
      this.A.l(var1, var2, var3, var4);
   }

   public net.y9.l o() {
      return this.A;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
