package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.w.w;

public class n extends w {
   private final net.yw.n W;
   private final net.yw.n I;

   public n(net.yw.n var1, net.yw.n var2) {
      super(false);
      this.I = var1;
      this.W = var2;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.h();
      net.yw.n var5 = var1.Z(var3);
      if((var5.n() == net.y1.l.q || var5.n() == net.y1.l.h) && var3.h() > 0) {
         var3 = var3.b();
         var1.Z(var3);
      }

      net.y9.l var16 = var1.Z(var3).Q();
      if(var16 == net.nb.f.dl || var16 == net.nb.f.p) {
         var3 = var3.h();
         this.k(var1, var3, this.I);
         int var6 = var3.h();
         if(var6 <= var3.h() + 2) {
            int var7 = var6 - var3.h();
            int var8 = 2 - var7;
            int var9 = var3.t() - var8;
            if(var9 <= var3.t() + var8) {
               int var10 = var9 - var3.t();
               int var11 = var3.y() - var8;
               if(var11 <= var3.y() + var8) {
                  int var12 = var11 - var3.y();
                  if(Math.abs(var10) != var8 || Math.abs(var12) != var8 || var2.nextInt(2) != 0) {
                     net.u.j var13 = new net.u.j(var9, var6, var11);
                     net.y1.l var14 = var1.Z(var13).n();
                     if(var14 == net.y1.l.q || var14 == net.y1.l.h) {
                        this.k(var1, var13, this.W);
                     }
                  }

                  ++var11;
               }

               ++var9;
            }

            ++var6;
         }
      }

      return true;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
