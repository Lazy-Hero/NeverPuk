package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.w.q;
import net.y9.lw;

public class d extends q {
   public d(boolean var1, int var2, int var3, net.yw.n var4, net.yw.n var5) {
      super(var1, var2, var3, var4, var5);
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.h();
      int var5 = this.q(var2);
      if(!this.Y(var1, var2, var3, var5)) {
         return false;
      } else {
         this.x(var1, var3.J(var5), 2);
         int var6 = var3.h() + var5 - 2 - var2.nextInt(4);
         if(var6 > var3.h() + var5 / 2) {
            float var7 = var2.nextFloat() * 6.2831855F;
            int var8 = var3.t() + (int)(0.5F + net.u.t.m(var7) * 4.0F);
            int var9 = var3.y() + (int)(0.5F + net.u.t.A(var7) * 4.0F);
            int var10 = 0;
            var8 = var3.t() + (int)(1.5F + net.u.t.m(var7) * (float)var10);
            var9 = var3.y() + (int)(1.5F + net.u.t.A(var7) * (float)var10);
            this.k(var1, new net.u.j(var8, var6 - 3 + var10 / 2, var9), this.e);
            ++var10;
            var10 = 1 + var2.nextInt(2);
            int var12 = var6 - var10;
            if(var12 <= var6) {
               int var13 = var12 - var6;
               this.d(var1, new net.u.j(var8, var12, var9), 1 - var13);
               ++var12;
            }

            int var10000 = var6 - (2 + var2.nextInt(4));
         }

         var6 = 0;
         if(var6 < var5) {
            net.u.j var16 = var3.J(var6);
            if(this.q(var1.Z(var16).Q())) {
               this.k(var1, var16, this.e);
            }

            if(var6 < var5 - 1) {
               net.u.j var18 = var16.g();
               if(this.q(var1.Z(var18).Q())) {
                  this.k(var1, var18, this.e);
               }

               net.u.j var20 = var16.d().g();
               if(this.q(var1.Z(var20).Q())) {
                  this.k(var1, var20, this.e);
               }

               net.u.j var23 = var16.d();
               if(this.q(var1.Z(var23).Q())) {
                  this.k(var1, var23, this.e);
                  this.p(var1, var2, var23.H(), lw.f);
                  this.p(var1, var2, var23.d(), lw.A);
               }
            }

            ++var6;
         }

         return true;
      }
   }

   private void p(net.yv.r var1, Random var2, net.u.j var3, net.yr.o var4) {
      if(var2.nextInt(3) > 0 && var1.y(var3)) {
         this.k(var1, var3, net.nb.f.To.p().s(var4, Boolean.valueOf(true)));
      }

   }

   private void x(net.yv.r var1, net.u.j var2, int var3) {
      boolean var10000 = true;
      int var5 = -2;

      while(true) {
         this.V(var1, var2.J(var5), var3 + 1 - var5);
         ++var5;
      }
   }

   private static xn c(xn var0) {
      return var0;
   }
}
