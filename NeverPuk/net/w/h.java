package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.w.x;
import net.y9.g6;
import net.y9.gc;
import net.y9.gh;
import net.y9.l7;

public class h extends x {
   private static final net.yw.n l = net.nb.f.u6.p().s(l7.d, gc.i.SPRUCE);
   private static final net.yw.n i = net.nb.f.Tu.p().s(g6.A, gc.i.SPRUCE).s(gh.u, Boolean.valueOf(false));

   public h(boolean var1) {
      super(var1);
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.h();
      int var5 = var2.nextInt(4) + 6;
      int var6 = 1 + var2.nextInt(2);
      int var7 = var5 - var6;
      int var8 = 2 + var2.nextInt(2);
      boolean var9 = true;
      if(var3.h() >= 1 && var3.h() + var5 + 1 <= 256) {
         int var10 = var3.h();
         if(var10 <= var3.h() + 1 + var5) {
            if(var10 - var3.h() < var6) {
               boolean var11 = false;
            }

            net.u.j var12 = new net.u.j();
            int var13 = var3.t() - var8;
            if(var13 <= var3.t() + var8) {
               int var14 = var3.y() - var8;
               if(var14 <= var3.y() + var8) {
                  if(var10 >= 0 && var10 < 256) {
                     net.y1.l var15 = var1.Z(var12.V(var13, var10, var14)).n();
                     if(var15 != net.y1.l.q && var15 != net.y1.l.h) {
                        var9 = false;
                     }
                  }

                  var9 = false;
                  ++var14;
               }

               ++var13;
            }

            ++var10;
         }

         net.y9.l var24 = var1.Z(var3.b()).Q();
         if((var24 == net.nb.f.p || var24 == net.nb.f.dl || var24 == net.nb.f.dJ) && var3.h() < 256 - var5 - 1) {
            this.P(var1, var3.b());
            int var25 = var2.nextInt(2);
            int var27 = 1;
            byte var30 = 0;
            int var33 = 0;
            if(var33 <= var7) {
               int var36 = var3.h() + var5 - var33;
               int var16 = var3.t() - var25;
               if(var16 <= var3.t() + var25) {
                  int var17 = var16 - var3.t();
                  int var18 = var3.y() - var25;
                  if(var18 <= var3.y() + var25) {
                     int var19 = var18 - var3.y();
                     if(Math.abs(var17) != var25 || Math.abs(var19) != var25 || var25 <= 0) {
                        net.u.j var20 = new net.u.j(var16, var36, var18);
                        if(!var1.Z(var20).E()) {
                           this.k(var1, var20, i);
                        }
                     }

                     ++var18;
                  }

                  ++var16;
               }

               label636: {
                  if(var25 >= var27) {
                     var25 = var30;
                     var30 = 1;
                     ++var27;
                     if(var27 <= var8) {
                        break label636;
                     }
                  }

                  ++var25;
               }

               ++var33;
            }

            var33 = var2.nextInt(3);
            int var37 = 0;
            if(var37 < var5 - var33) {
               net.y1.l var40 = var1.Z(var3.J(var37)).n();
               if(var40 == net.y1.l.q || var40 == net.y1.l.h) {
                  this.k(var1, var3.J(var37), l);
               }

               ++var37;
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
