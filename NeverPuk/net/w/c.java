package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.w.q;
import net.y9.g6;
import net.y9.gc;
import net.y9.gh;
import net.y9.l7;
import net.y9.rv;

public class c extends q {
   private static final net.yw.n k = net.nb.f.u6.p().s(l7.d, gc.i.SPRUCE);
   private static final net.yw.n W = net.nb.f.Tu.p().s(g6.A, gc.i.SPRUCE).s(gh.u, Boolean.valueOf(false));
   private static final net.yw.n O = net.nb.f.dl.p().s(rv.l, rv.m.PODZOL);
   private final boolean a;

   public c(boolean var1, boolean var2) {
      super(var1, 13, 15, k, W);
      this.a = var2;
   }

   public boolean K(net.yv.r var1, Random var2, net.u.j var3) {
      f.h();
      int var5 = this.q(var2);
      if(!this.Y(var1, var2, var3, var5)) {
         return false;
      } else {
         this.p(var1, var3.t(), var3.y(), var3.h() + var5, 0, var2);
         int var6 = 0;
         if(var6 < var5) {
            net.yw.n var7 = var1.Z(var3.J(var6));
            if(var7.n() == net.y1.l.q || var7.n() == net.y1.l.h) {
               this.k(var1, var3.J(var6), this.e);
            }

            if(var6 < var5 - 1) {
               var7 = var1.Z(var3.F(1, var6, 0));
               if(var7.n() == net.y1.l.q || var7.n() == net.y1.l.h) {
                  this.k(var1, var3.F(1, var6, 0), this.e);
               }

               var7 = var1.Z(var3.F(1, var6, 1));
               if(var7.n() == net.y1.l.q || var7.n() == net.y1.l.h) {
                  this.k(var1, var3.F(1, var6, 1), this.e);
               }

               var7 = var1.Z(var3.F(0, var6, 1));
               if(var7.n() == net.y1.l.q || var7.n() == net.y1.l.h) {
                  this.k(var1, var3.F(0, var6, 1), this.e);
               }
            }

            ++var6;
         }

         return true;
      }
   }

   private void p(net.yv.r var1, int var2, int var3, int var4, int var5, Random var6) {
      int var7 = var6.nextInt(5) + (this.a?this.Z:3);
      int var8 = 0;

      for(int var9 = var4 - var7; var9 <= var4; ++var9) {
         int var10 = var4 - var9;
         int var11 = var5 + net.u.t.M((float)var10 / (float)var7 * 3.5F);
         this.V(var1, new net.u.j(var2, var9, var3), var11 + (var11 == var8 && (var9 & 1) == 0?1:0));
         var8 = var11;
      }

   }

   public void J(net.yv.r var1, Random var2, net.u.j var3) {
      this.M(var1, var3.H().D());
      this.M(var1, var3.i(2).D());
      this.M(var1, var3.H().H(2));
      this.M(var1, var3.i(2).H(2));
      int var4 = 0;

      while(true) {
         int var5 = var2.nextInt(64);
         int var6 = var5 % 8;
         int var7 = var5 / 8;
         if(var6 == 7 || var7 == 7) {
            this.M(var1, var3.F(-3 + var6, 0, -3 + var7));
         }

         ++var4;
      }
   }

   private void M(net.yv.r var1, net.u.j var2) {
      byte var3 = -2;
      int var4 = -2;

      while(true) {
         if(Math.abs(var3) != 2 || Math.abs(var4) != 2) {
            this.u(var1, var2.F(var3, 0, var4));
         }

         ++var4;
      }
   }

   private void u(net.yv.r var1, net.u.j var2) {
      int var3 = 2;

      while(true) {
         net.u.j var4 = var2.J(var3);
         net.yw.n var5 = var1.Z(var4);
         net.y9.l var6 = var5.Q();
         if(var6 == net.nb.f.p || var6 == net.nb.f.dl) {
            this.k(var1, var4, O);
            break;
         }

         if(var5.n() != net.y1.l.q) {
            break;
         }

         --var3;
      }

   }

   private static xn c(xn var0) {
      return var0;
   }
}
