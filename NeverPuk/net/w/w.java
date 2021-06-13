package net.w;

import java.util.Iterator;
import java.util.Random;
import net.xn;
import net.w.f;
import net.w.x;
import net.y9.g6;
import net.y9.gc;
import net.y9.gh;
import net.y9.l7;
import net.y9.lw;
import net.y9.rq;
import net.yz.aq;

public class w extends x {
   private static final net.yw.n Y = net.nb.f.u6.p().s(l7.d, gc.i.OAK);
   private static final net.yw.n Q = net.nb.f.Tu.p().s(g6.A, gc.i.OAK).s(gh.u, Boolean.valueOf(false));
   private final int D;
   private final boolean G;
   private final net.yw.n y;
   private final net.yw.n L;

   public w(boolean var1) {
      this(var1, 4, Y, Q, false);
   }

   public w(boolean var1, int var2, net.yw.n var3, net.yw.n var4, boolean var5) {
      super(var1);
      this.D = var2;
      this.y = var3;
      this.L = var4;
      this.G = var5;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.h();
      int var5 = var2.nextInt(3) + this.D;
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
                  label196: {
                     if(var7 >= 0 && var7 < 256) {
                        if(this.q(var1.Z(var9.V(var10, var7, var11)).Q())) {
                           break label196;
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

         net.y9.l var23 = var1.Z(var3.b()).Q();
         if((var23 == net.nb.f.p || var23 == net.nb.f.dl || var23 == net.nb.f.dJ) && var3.h() < 256 - var5 - 1) {
            this.P(var1, var3.b());
            boolean var24 = true;
            boolean var25 = false;
            int var27 = var3.h() - 3 + var5;
            if(var27 <= var3.h() + var5) {
               int var36 = var27 - (var3.h() + var5);
               int var12 = 1 - var36 / 2;
               int var13 = var3.t() - var12;
               if(var13 <= var3.t() + var12) {
                  int var14 = var13 - var3.t();
                  int var15 = var3.y() - var12;
                  if(var15 <= var3.y() + var12) {
                     int var16 = var15 - var3.y();
                     if(Math.abs(var14) != var12 || Math.abs(var16) != var12 || var2.nextInt(2) != 0 && var36 != 0) {
                        net.u.j var17 = new net.u.j(var13, var27, var15);
                        net.y1.l var18 = var1.Z(var17).n();
                        if(var18 == net.y1.l.q || var18 == net.y1.l.h || var18 == net.y1.l.Y) {
                           this.k(var1, var17, this.L);
                        }
                     }

                     ++var15;
                  }

                  ++var13;
               }

               ++var27;
            }

            var27 = 0;
            if(var27 < var5) {
               net.y1.l var37 = var1.Z(var3.J(var27)).n();
               if(var37 == net.y1.l.q || var37 == net.y1.l.h || var37 == net.y1.l.Y) {
                  this.k(var1, var3.J(var27), this.y);
                  if(this.G) {
                     ;
                  }
               }

               ++var27;
            }

            if(this.G) {
               var27 = var3.h() - 3 + var5;
               if(var27 <= var3.h() + var5) {
                  int var38 = var27 - (var3.h() + var5);
                  int var40 = 2 - var38 / 2;
                  net.u.j var43 = new net.u.j();
                  int var45 = var3.t() - var40;
                  if(var45 <= var3.t() + var40) {
                     int var48 = var3.y() - var40;
                     if(var48 <= var3.y() + var40) {
                        var43.V(var45, var27, var48);
                        if(var1.Z(var43).n() == net.y1.l.h) {
                           net.u.j var50 = var43.H();
                           net.u.j var51 = var43.g();
                           net.u.j var52 = var43.D();
                           net.u.j var19 = var43.d();
                           if(var2.nextInt(4) == 0 && var1.Z(var50).n() == net.y1.l.q) {
                              this.X(var1, var50, lw.f);
                           }

                           if(var2.nextInt(4) == 0 && var1.Z(var51).n() == net.y1.l.q) {
                              this.X(var1, var51, lw.R);
                           }

                           if(var2.nextInt(4) == 0 && var1.Z(var52).n() == net.y1.l.q) {
                              this.X(var1, var52, lw.J);
                           }

                           if(var2.nextInt(4) == 0 && var1.Z(var19).n() == net.y1.l.q) {
                              this.X(var1, var19, lw.A);
                           }
                        }

                        ++var48;
                     }

                     ++var45;
                  }

                  ++var27;
               }

               if(var2.nextInt(5) == 0 && var5 > 5) {
                  var27 = 0;
                  Iterator var39 = aq.u.HORIZONTAL.iterator();
                  if(var39.hasNext()) {
                     aq var41 = (aq)var39.next();
                     if(var2.nextInt(4 - var27) == 0) {
                        aq var44 = var41.f();
                        this.N(var1, var2.nextInt(3), var3.F(var44.v(), var5 - 5 + var27, var44.P()), var41);
                     }
                  }

                  ++var27;
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

   private void N(net.yv.r var1, int var2, net.u.j var3, aq var4) {
      this.k(var1, var3, net.nb.f.TY.p().s(rq.R, Integer.valueOf(var2)).s(rq.N, var4));
   }

   private void z(net.yv.r var1, net.u.j var2, net.yr.o var3) {
      this.k(var1, var2, net.nb.f.To.p().s(var3, Boolean.valueOf(true)));
   }

   private void X(net.yv.r var1, net.u.j var2, net.yr.o var3) {
      this.z(var1, var2, var3);
      int var4 = 4;

      for(net.u.j var5 = var2.b(); var1.Z(var5).n() == net.y1.l.q; --var4) {
         this.z(var1, var5, var3);
         var5 = var5.b();
      }

   }

   private static xn c(xn var0) {
      return var0;
   }
}
