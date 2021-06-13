package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.w.x;
import net.y9.g6;
import net.y9.gc;
import net.y9.gh;
import net.y9.l7;

public class t extends x {
   private static final net.yw.n b = net.nb.f.u6.p().s(l7.d, gc.i.SPRUCE);
   private static final net.yw.n F = net.nb.f.Tu.p().s(g6.A, gc.i.SPRUCE).s(gh.u, Boolean.valueOf(false));

   public t() {
      super(false);
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.h();
      int var5 = var2.nextInt(5) + 7;
      int var6 = var5 - var2.nextInt(2) - 3;
      int var7 = var5 - var6;
      int var8 = 1 + var2.nextInt(var7 + 1);
      if(var3.h() >= 1 && var3.h() + var5 + 1 <= 256) {
         boolean var9 = true;
         int var10 = var3.h();
         if(var10 <= var3.h() + 1 + var5) {
            boolean var11 = true;
            if(var10 - var3.h() < var6) {
               var11 = false;
            }

            net.u.j var12 = new net.u.j();
            int var13 = var3.t() - var8;
            if(var13 <= var3.t() + var8) {
               int var14 = var3.y() - var8;
               if(var14 <= var3.y() + var8) {
                  label222: {
                     if(var10 >= 0 && var10 < 256) {
                        if(this.q(var1.Z(var12.V(var13, var10, var14)).Q())) {
                           break label222;
                        }

                        var9 = false;
                     }

                     var9 = false;
                  }

                  ++var14;
               }

               ++var13;
            }

            ++var10;
         }

         net.y9.l var21 = var1.Z(var3.b()).Q();
         if((var21 == net.nb.f.p || var21 == net.nb.f.dl) && var3.h() < 256 - var5 - 1) {
            this.P(var1, var3.b());
            int var23 = 0;
            int var25 = var3.h() + var5;
            if(var25 >= var3.h() + var6) {
               int var30 = var3.t() - var23;
               if(var30 <= var3.t() + var23) {
                  int var34 = var30 - var3.t();
                  int var15 = var3.y() - var23;
                  if(var15 <= var3.y() + var23) {
                     int var16 = var15 - var3.y();
                     if(Math.abs(var34) == var23 && Math.abs(var16) == var23) {
                        ;
                     }

                     net.u.j var17 = new net.u.j(var30, var25, var15);
                     if(!var1.Z(var17).E()) {
                        this.k(var1, var17, F);
                     }

                     ++var15;
                  }

                  ++var30;
               }

               if(var23 < var8) {
                  ++var23;
               }

               --var25;
            }

            var25 = 0;
            if(var25 < var5 - 1) {
               net.y1.l var32 = var1.Z(var3.J(var25)).n();
               if(var32 == net.y1.l.q || var32 == net.y1.l.h) {
                  this.k(var1, var3.J(var25), b);
               }

               ++var25;
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
