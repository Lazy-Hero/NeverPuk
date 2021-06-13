package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.w.x;
import net.y9.g6;
import net.y9.gc;
import net.y9.l7;

public class k extends x {
   private static final net.yw.n p = net.nb.f.u6.p().s(l7.d, gc.i.BIRCH);
   private static final net.yw.n z = net.nb.f.Tu.p().s(g6.A, gc.i.BIRCH).s(g6.u, Boolean.valueOf(false));
   private final boolean h;

   public k(boolean var1, boolean var2) {
      super(var1);
      this.h = var2;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.h();
      int var5 = var2.nextInt(3) + 5;
      if(this.h) {
         var5 += var2.nextInt(7);
      }

      boolean var6 = true;
      if(var3.h() >= 1 && var3.h() + var5 + 1 <= 256) {
         int var7 = var3.h();
         if(var7 <= var3.h() + 1 + var5) {
            byte var8 = 1;
            if(var7 == var3.h()) {
               var8 = 0;
            }

            if(var7 >= var3.h() + 1 + var5 - 2) {
               var8 = 2;
            }

            net.u.j var9 = new net.u.j();
            int var10 = var3.t() - var8;
            if(var10 <= var3.t() + var8) {
               int var11 = var3.y() - var8;
               if(var11 <= var3.y() + var8) {
                  label217: {
                     if(var7 >= 0 && var7 < 256) {
                        if(this.q(var1.Z(var9.V(var10, var7, var11)).Q())) {
                           break label217;
                        }

                        var6 = false;
                     }

                     var6 = false;
                  }

                  ++var11;
               }

               ++var10;
            }

            ++var7;
         }

         net.y9.l var20 = var1.Z(var3.b()).Q();
         if((var20 == net.nb.f.p || var20 == net.nb.f.dl || var20 == net.nb.f.dJ) && var3.h() < 256 - var5 - 1) {
            this.P(var1, var3.b());
            int var21 = var3.h() - 3 + var5;
            if(var21 <= var3.h() + var5) {
               int var25 = var21 - (var3.h() + var5);
               int var28 = 1 - var25 / 2;
               int var30 = var3.t() - var28;
               if(var30 <= var3.t() + var28) {
                  int var12 = var30 - var3.t();
                  int var13 = var3.y() - var28;
                  if(var13 <= var3.y() + var28) {
                     int var14 = var13 - var3.y();
                     if(Math.abs(var12) != var28 || Math.abs(var14) != var28 || var2.nextInt(2) != 0 && var25 != 0) {
                        net.u.j var15 = new net.u.j(var30, var21, var13);
                        net.y1.l var16 = var1.Z(var15).n();
                        if(var16 == net.y1.l.q || var16 == net.y1.l.h) {
                           this.k(var1, var15, z);
                        }
                     }

                     ++var13;
                  }

                  ++var30;
               }

               ++var21;
            }

            var21 = 0;
            if(var21 < var5) {
               net.y1.l var26 = var1.Z(var3.J(var21)).n();
               if(var26 == net.y1.l.q || var26 == net.y1.l.h) {
                  this.k(var1, var3.J(var21), p);
               }

               ++var21;
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
