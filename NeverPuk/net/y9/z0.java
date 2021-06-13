package net.y9;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.ac;
import net.yz.aq;

public class z0 extends l {
   public static final net.yr.l Y = net.yr.l.J("age", 0, 5);

   protected z0() {
      super(net.y1.l.u, net.y1.h.Q);
      this.r(this.b.T().s(Y, Integer.valueOf(0)));
      this.f(net.ys.r.X);
      this.R(true);
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.nb.j.SL;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      int[] var5 = g3.v.w();
      if(!this.b(var1, var2)) {
         var1.e(var2, true);
      }

      net.u.j var6 = var2.h();
      if(var1.y(var6) && var6.h() < 256) {
         int var7 = ((Integer)var3.i(Y)).intValue();
         if(var7 < 5 && var4.nextInt(1) == 0) {
            boolean var8 = false;
            boolean var9 = false;
            net.yw.n var10 = var1.Z(var2.b());
            l var11 = var10.Q();
            if(var11 == net.nb.f.Tz) {
               var8 = true;
            }

            if(var11 == net.nb.f.TW) {
               label180: {
                  int var12 = 1;
                  int var13 = 0;
                  l var14 = var1.Z(var2.p(var12 + 1)).Q();
                  if(var14 != net.nb.f.TW) {
                     if(var14 != net.nb.f.Tz) {
                        break label180;
                     }

                     var9 = true;
                  }

                  ++var12;
                  ++var13;
               }

               boolean var24 = true;
               var8 = true;
            }

            if(var10.n() == net.y1.l.q) {
               var8 = true;
            }

            if(var7 < 4) {
               int var22 = var4.nextInt(4);
               boolean var25 = false;
               int var27 = 0;
               if(var27 < var22) {
                  aq var15 = aq.u.HORIZONTAL.N(var4);
                  net.u.j var16 = var2.C(var15);
                  if(var1.y(var16) && var1.y(var16.b()) && W(var1, var16, var15.f())) {
                     this.M(var1, var16, var7 + 1);
                     var25 = true;
                  }

                  ++var27;
               }

               this.j(var1, var2);
            }

            if(var7 == 4) {
               this.j(var1, var2);
            }
         }
      }

   }

   private void M(net.yv.r var1, net.u.j var2, int var3) {
      var1.k(var2, this.p().s(Y, Integer.valueOf(var3)), 2);
      var1.s(1033, var2, 0);
   }

   private void j(net.yv.r var1, net.u.j var2) {
      var1.k(var2, this.p().s(Y, Integer.valueOf(5)), 2);
      var1.s(1034, var2, 0);
   }

   private static boolean W(net.yv.r var0, net.u.j var1, aq var2) {
      for(aq var4 : aq.u.HORIZONTAL) {
         if(var4 != var2 && !var0.y(var1.C(var4))) {
            return false;
         }
      }

      return true;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return super.J(var1, var2) && this.b(var1, var2);
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!this.b(var2, var3)) {
         var2.c(var3, this, 1);
      }

   }

   public boolean b(net.yv.r var1, net.u.j var2) {
      net.yw.n var3 = var1.Z(var2.b());
      l var4 = var3.Q();
      if(var4 != net.nb.f.TW && var4 != net.nb.f.Tz) {
         if(var3.n() == net.y1.l.q) {
            int var5 = 0;

            for(aq var7 : aq.u.HORIZONTAL) {
               net.yw.n var8 = var1.Z(var2.C(var7));
               l var9 = var8.Q();
               if(var9 == net.nb.f.TW) {
                  ++var5;
               } else if(var8.n() != net.y1.l.q) {
                  return false;
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public void U(net.yv.r var1, net.r.r var2, net.u.j var3, net.yw.n var4, @Nullable net.ni.v var5, ks var6) {
      super.U(var1, var2, var3, var4, var5, var6);
      e(var1, var3, new ks(net.n0.y.q(this)));
   }

   protected ks l(net.yw.n var1) {
      return ks.a;
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.n D(int var1) {
      return this.p().s(Y, Integer.valueOf(var1));
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(Y)).intValue();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{Y});
   }

   public static void T(net.yv.r var0, net.u.j var1, Random var2, int var3) {
      var0.k(var1, net.nb.f.TW.p(), 2);
      S(var0, var1, var2, var1, var3, 0);
   }

   private static void S(net.yv.r var0, net.u.j var1, Random var2, net.u.j var3, int var4, int var5) {
      int var6 = var2.nextInt(4) + 1;
      ++var6;

      for(int var7 = 0; var7 < var6; ++var7) {
         net.u.j var8 = var1.J(var7 + 1);
         if(!W(var0, var8, (aq)null)) {
            return;
         }

         var0.k(var8, net.nb.f.TW.p(), 2);
      }

      boolean var13 = false;
      if(var5 < 4) {
         int var15 = var2.nextInt(4);
         ++var15;

         for(int var9 = 0; var9 < var15; ++var9) {
            aq var10 = aq.u.HORIZONTAL.N(var2);
            net.u.j var11 = var1.J(var6).C(var10);
            if(Math.abs(var11.t() - var3.t()) < var4 && Math.abs(var11.y() - var3.y()) < var4 && var0.y(var11) && var0.y(var11.b()) && W(var0, var11, var10.f())) {
               var13 = true;
               var0.k(var11, net.nb.f.TW.p(), 2);
               S(var0, var11, var2, var3, var4, var5 + 1);
            }
         }
      }

      var0.k(var1.J(var6), net.nb.f.Tn.p().s(Y, Integer.valueOf(5)), 2);
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
