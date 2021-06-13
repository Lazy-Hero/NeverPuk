package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.w.x;
import net.y9.gc;
import net.y9.gh;
import net.y9.gu;
import net.y9.lt;
import net.yz.aq;

public class l extends x {
   private static final net.yw.n f = net.nb.f.ub.p().s(lt.k, gc.i.ACACIA);
   private static final net.yw.n i = net.nb.f.G.p().s(gu.E, gc.i.ACACIA).s(gh.u, Boolean.valueOf(false));

   public l(boolean var1) {
      super(var1);
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.j();
      int var5 = var2.nextInt(3) + var2.nextInt(3) + 5;
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
                  label199: {
                     if(var7 >= 0 && var7 < 256) {
                        if(this.q(var1.Z(var9.V(var10, var7, var11)).Q())) {
                           break label199;
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

         net.y9.l var25 = var1.Z(var3.b()).Q();
         if((var25 == net.nb.f.p || var25 == net.nb.f.dl) && var3.h() < 256 - var5 - 1) {
            this.P(var1, var3.b());
            aq var26 = aq.u.HORIZONTAL.N(var2);
            int var27 = var5 - var2.nextInt(4) - 1;
            int var29 = 3 - var2.nextInt(3);
            int var32 = var3.t();
            int var12 = var3.y();
            int var13 = 0;
            int var14 = 0;
            if(var14 < var5) {
               int var15 = var3.h() + var14;
               if(var14 >= var27 && var29 > 0) {
                  var32 += var26.v();
                  var12 += var26.P();
                  --var29;
               }

               net.u.j var16 = new net.u.j(var32, var15, var12);
               net.y1.l var17 = var1.Z(var16).n();
               if(var17 == net.y1.l.q || var17 == net.y1.l.h) {
                  this.O(var1, var16);
                  var13 = var15;
               }

               ++var14;
            }

            net.u.j var39 = new net.u.j(var32, var13, var12);
            int var41 = -3;
            int var46 = -3;
            if(Math.abs(var41) != 3 || Math.abs(var46) != 3) {
               this.R(var1, var39.F(var41, 0, var46));
            }

            ++var46;
            ++var41;
            var39 = var39.h();
            var41 = -1;
            var46 = -1;
            this.R(var1, var39.F(var41, 0, var46));
            ++var46;
            ++var41;
            this.R(var1, var39.i(2));
            this.R(var1, var39.O(2));
            this.R(var1, var39.H(2));
            this.R(var1, var39.E(2));
            var32 = var3.t();
            var12 = var3.y();
            aq var45 = aq.u.HORIZONTAL.N(var2);
            if(var45 != var26) {
               var46 = var27 - var2.nextInt(2) - 1;
               int var51 = 1 + var2.nextInt(3);
               var13 = 0;
               if(var46 < var5 && var51 > 0) {
                  if(var46 >= 1) {
                     int var19 = var3.h() + var46;
                     var32 = var32 + var45.v();
                     var12 = var12 + var45.P();
                     net.u.j var20 = new net.u.j(var32, var19, var12);
                     net.y1.l var21 = var1.Z(var20).n();
                     if(var21 == net.y1.l.q || var21 == net.y1.l.h) {
                        this.O(var1, var20);
                     }
                  }

                  int var18 = var46 + 1;
                  --var51;
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void O(net.yv.r var1, net.u.j var2) {
      this.k(var1, var2, f);
   }

   private void R(net.yv.r var1, net.u.j var2) {
      net.y1.l var3 = var1.Z(var2).n();
      if(var3 == net.y1.l.q || var3 == net.y1.l.h) {
         this.k(var1, var2, i);
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
