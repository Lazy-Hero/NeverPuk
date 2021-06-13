package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.y9.go;

public class a extends f {
   private final net.y9.l F;

   public a(net.y9.l var1) {
      super(true);
      this.F = var1;
   }

   public a() {
      super(false);
      this.F = null;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.j();
      net.y9.l var5 = this.F;
      var5 = var2.nextBoolean()?net.nb.f.d:net.nb.f.Q;
      int var6 = var2.nextInt(3) + 4;
      if(var2.nextInt(12) == 0) {
         var6 *= 2;
      }

      boolean var7 = true;
      if(var3.h() >= 1 && var3.h() + var6 + 1 < 256) {
         int var8 = var3.h();
         if(var8 <= var3.h() + 1 + var6) {
            byte var9 = 3;
            if(var8 <= var3.h() + 3) {
               var9 = 0;
            }

            net.u.j var10 = new net.u.j();
            int var11 = var3.t() - var9;
            if(var11 <= var3.t() + var9) {
               int var12 = var3.y() - var9;
               if(var12 <= var3.y() + var9) {
                  if(var8 >= 0 && var8 < 256) {
                     net.y1.l var13 = var1.Z(var10.V(var11, var8, var12)).n();
                     if(var13 != net.y1.l.q && var13 != net.y1.l.h) {
                        var7 = false;
                     }
                  }

                  var7 = false;
                  ++var12;
               }

               ++var11;
            }

            ++var8;
         }

         net.y9.l var25 = var1.Z(var3.b()).Q();
         if(var25 != net.nb.f.dl && var25 != net.nb.f.p && var25 != net.nb.f.u2) {
            return false;
         } else {
            int var26 = var3.h() + var6;
            if(var5 == net.nb.f.Q) {
               var26 = var3.h() + var6 - 3;
            }

            if(var26 <= var3.h() + var6) {
               int var31 = 1;
               if(var26 < var3.h() + var6) {
                  ++var31;
               }

               if(var5 == net.nb.f.d) {
                  var31 = 3;
               }

               int var34 = var3.t() - var31;
               int var35 = var3.t() + var31;
               int var14 = var3.y() - var31;
               int var15 = var3.y() + var31;
               if(var34 <= var35) {
                  if(var14 <= var15) {
                     int var18 = 5;
                     if(var34 == var34) {
                        --var18;
                     }

                     if(var34 == var35) {
                        ++var18;
                     }

                     if(var14 == var14) {
                        var18 -= 3;
                     }

                     if(var14 == var15) {
                        var18 += 3;
                     }

                     label637: {
                        go.n var19 = go.n.S(var18);
                        if(var5 == net.nb.f.d || var26 < var3.h() + var6) {
                           if(var34 == var34 || var34 == var35) {
                              if(var14 == var14) {
                                 break label637;
                              }

                              if(var14 == var15) {
                                 ;
                              }
                           }

                           if(var34 == var3.t() - (var31 - 1) && var14 == var14) {
                              var19 = go.n.NORTH_WEST;
                           }

                           if(var34 == var34 && var14 == var3.y() - (var31 - 1)) {
                              var19 = go.n.NORTH_WEST;
                           }

                           if(var34 == var3.t() + (var31 - 1) && var14 == var14) {
                              var19 = go.n.NORTH_EAST;
                           }

                           if(var34 == var35 && var14 == var3.y() - (var31 - 1)) {
                              var19 = go.n.NORTH_EAST;
                           }

                           if(var34 == var3.t() - (var31 - 1) && var14 == var15) {
                              var19 = go.n.SOUTH_WEST;
                           }

                           if(var34 == var34 && var14 == var3.y() + (var31 - 1)) {
                              var19 = go.n.SOUTH_WEST;
                           }

                           if(var34 == var3.t() + (var31 - 1) && var14 == var15) {
                              var19 = go.n.SOUTH_EAST;
                           }

                           if(var34 == var35 && var14 == var3.y() + (var31 - 1)) {
                              var19 = go.n.SOUTH_EAST;
                           }
                        }

                        if(var19 == go.n.CENTER && var26 < var3.h() + var6) {
                           var19 = go.n.ALL_INSIDE;
                        }

                        if(var3.h() >= var3.h() + var6 - 1 || var19 != go.n.ALL_INSIDE) {
                           net.u.j var20 = new net.u.j(var34, var26, var14);
                           if(!var1.Z(var20).E()) {
                              this.k(var1, var20, var5.p().s(go.r, var19));
                           }
                        }
                     }

                     int var17 = var14 + 1;
                  }

                  int var16 = var34 + 1;
               }

               int var27 = var26 + 1;
            }

            int var28 = 0;
            if(var28 < var6) {
               net.yw.n var32 = var1.Z(var3.J(var28));
               if(!var32.E()) {
                  this.k(var1, var3.J(var28), var5.p().s(go.r, go.n.STEM));
               }

               ++var28;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
