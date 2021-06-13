package net.y9;

import java.util.Random;
import net.xn;
import net.y9.g3;
import net.y9.g5;
import net.y9.gx;
import net.y9.l;
import net.yz.aq;

public class g0 extends g5 {
   protected g0(net.y1.l var1) {
      super(var1);
      this.R(false);
      if(var1 == net.y1.l.U) {
         this.R(true);
      }

   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!this.r(var2, var3, var1)) {
         this.y(var2, var3, var1);
      }

   }

   private void y(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      gx var4 = Y(this.C);
      var1.k(var2, var4.p().s(J, var3.i(J)), 2);
      var1.c(var2, var4, this.u(var1));
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      int[] var5 = g3.v.w();
      if(this.C == net.y1.l.U && var1.N().b("doFireTick")) {
         int var6 = var4.nextInt(3);
         if(var6 > 0) {
            int var8 = 0;
            if(var8 < var6) {
               net.u.j var7 = var2.F(var4.nextInt(3) - 1, 1, var4.nextInt(3) - 1);
               if(var7.h() >= 0 && var7.h() < 256 && !var1.o(var7)) {
                  return;
               }

               l var9 = var1.Z(var7).Q();
               if(var9.C == net.y1.l.q) {
                  if(this.k(var1, var7)) {
                     var1.U(var7, net.nb.f.g.p());
                     return;
                  }
               } else if(var9.C.f()) {
                  return;
               }

               ++var8;
            }
         }

         int var10 = 0;
         net.u.j var13 = var2.F(var4.nextInt(3) - 1, 0, var4.nextInt(3) - 1);
         if(var13.h() >= 0 && var13.h() < 256 && !var1.o(var13)) {
            return;
         }

         if(var1.y(var13.h()) && this.P(var1, var13)) {
            var1.U(var13.h(), net.nb.f.g.p());
         }

         ++var10;
      }

   }

   protected boolean k(net.yv.r var1, net.u.j var2) {
      for(aq var6 : aq.values()) {
         if(this.P(var1, var2.C(var6))) {
            return true;
         }
      }

      return false;
   }

   private boolean P(net.yv.r var1, net.u.j var2) {
      return (var2.h() < 0 || var2.h() >= 256 || var1.o(var2)) && var1.Z(var2).n().W();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
