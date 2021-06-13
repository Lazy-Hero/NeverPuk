package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.w.x;
import net.y9.g6;
import net.y9.gc;
import net.y9.l7;
import net.y9.lw;

public class y extends x {
   private static final net.yw.n j = net.nb.f.u6.p().s(l7.d, gc.i.OAK);
   private static final net.yw.n H = net.nb.f.Tu.p().s(g6.A, gc.i.OAK).s(g6.u, Boolean.valueOf(false));

   public y() {
      super(false);
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.j();
      int var5 = var2.nextInt(4) + 5;
      if(var1.Z(var3.b()).n() == net.y1.l.p) {
         var3 = var3.b();
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
               var8 = 3;
            }

            net.u.j var9 = new net.u.j();
            int var10 = var3.t() - var8;
            if(var10 <= var3.t() + var8) {
               int var11 = var3.y() - var8;
               if(var11 <= var3.y() + var8) {
                  if(var7 >= 0 && var7 < 256) {
                     net.yw.n var12 = var1.Z(var9.V(var10, var7, var11));
                     net.y9.l var13 = var12.Q();
                     if(var12.n() != net.y1.l.q && var12.n() != net.y1.l.h) {
                        if(var13 != net.nb.f.uM && var13 != net.nb.f.dy) {
                           var6 = false;
                        }

                        if(var7 > var3.h()) {
                           var6 = false;
                        }
                     }
                  }

                  var6 = false;
                  ++var11;
               }

               ++var10;
            }

            ++var7;
         }

         net.y9.l var22 = var1.Z(var3.b()).Q();
         if((var22 == net.nb.f.p || var22 == net.nb.f.dl) && var3.h() < 256 - var5 - 1) {
            this.P(var1, var3.b());
            int var23 = var3.h() - 3 + var5;
            if(var23 <= var3.h() + var5) {
               int var29 = var23 - (var3.h() + var5);
               int var33 = 2 - var29 / 2;
               int var37 = var3.t() - var33;
               if(var37 <= var3.t() + var33) {
                  int var40 = var37 - var3.t();
                  int var43 = var3.y() - var33;
                  if(var43 <= var3.y() + var33) {
                     int var14 = var43 - var3.y();
                     if(Math.abs(var40) != var33 || Math.abs(var14) != var33 || var2.nextInt(2) != 0 && var29 != 0) {
                        net.u.j var15 = new net.u.j(var37, var23, var43);
                        if(!var1.Z(var15).E()) {
                           this.k(var1, var15, H);
                        }
                     }

                     ++var43;
                  }

                  ++var37;
               }

               ++var23;
            }

            var23 = 0;
            if(var23 < var5) {
               net.yw.n var30 = var1.Z(var3.J(var23));
               net.y9.l var34 = var30.Q();
               if(var30.n() == net.y1.l.q || var30.n() == net.y1.l.h || var34 == net.nb.f.dy || var34 == net.nb.f.uM) {
                  this.k(var1, var3.J(var23), j);
               }

               ++var23;
            }

            var23 = var3.h() - 3 + var5;
            if(var23 <= var3.h() + var5) {
               int var31 = var23 - (var3.h() + var5);
               int var35 = 2 - var31 / 2;
               net.u.j var39 = new net.u.j();
               int var41 = var3.t() - var35;
               if(var41 <= var3.t() + var35) {
                  int var45 = var3.y() - var35;
                  if(var45 <= var3.y() + var35) {
                     var39.V(var41, var23, var45);
                     if(var1.Z(var39).n() == net.y1.l.h) {
                        net.u.j var47 = var39.H();
                        net.u.j var48 = var39.g();
                        net.u.j var16 = var39.D();
                        net.u.j var17 = var39.d();
                        if(var2.nextInt(4) == 0 && var1.Z(var47).n() == net.y1.l.q) {
                           this.J(var1, var47, lw.f);
                        }

                        if(var2.nextInt(4) == 0 && var1.Z(var48).n() == net.y1.l.q) {
                           this.J(var1, var48, lw.R);
                        }

                        if(var2.nextInt(4) == 0 && var1.Z(var16).n() == net.y1.l.q) {
                           this.J(var1, var16, lw.J);
                        }

                        if(var2.nextInt(4) == 0 && var1.Z(var17).n() == net.y1.l.q) {
                           this.J(var1, var17, lw.A);
                        }
                     }

                     ++var45;
                  }

                  ++var41;
               }

               ++var23;
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void J(net.yv.r var1, net.u.j var2, net.yr.o var3) {
      net.yw.n var4 = net.nb.f.To.p().s(var3, Boolean.valueOf(true));
      this.k(var1, var2, var4);
      int var5 = 4;

      for(net.u.j var6 = var2.b(); var1.Z(var6).n() == net.y1.l.q; --var5) {
         this.k(var1, var6, var4);
         var6 = var6.b();
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
