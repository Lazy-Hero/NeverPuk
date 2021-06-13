package net.w;

import java.util.Random;
import net.xn;
import net.w.f;
import net.w.x;

public abstract class q extends x {
   protected final int Z;
   protected final net.yw.n e;
   protected final net.yw.n H;
   protected int T;

   public q(boolean var1, int var2, int var3, net.yw.n var4, net.yw.n var5) {
      super(var1);
      this.Z = var2;
      this.T = var3;
      this.e = var4;
      this.H = var5;
   }

   protected int q(Random var1) {
      int var2 = var1.nextInt(3) + this.Z;
      if(this.T > 1) {
         var2 += var1.nextInt(this.T);
      }

      return var2;
   }

   private boolean O(net.yv.r var1, net.u.j var2, int var3) {
      f.j();
      boolean var5 = true;
      if(var2.h() >= 1 && var2.h() + var3 + 1 <= 256) {
         int var6 = 0;
         if(var6 <= 1 + var3) {
            byte var7 = 2;
            var7 = 1;
            if(var6 >= 1 + var3 - 2) {
               var7 = 2;
            }

            int var8 = -var7;
            int var9 = -var7;
            if(var2.h() + var6 < 0 || var2.h() + var6 >= 256 || !this.q(var1.Z(var2.F(var8, var6, var9)).Q())) {
               var5 = false;
            }

            ++var9;
            ++var8;
            ++var6;
         }

         return var5;
      } else {
         return false;
      }
   }

   private boolean w(net.u.j var1, net.yv.r var2) {
      net.u.j var3 = var1.b();
      net.y9.l var4 = var2.Z(var3).Q();
      if((var4 == net.nb.f.p || var4 == net.nb.f.dl) && var1.h() >= 2) {
         this.P(var2, var3);
         this.P(var2, var3.g());
         this.P(var2, var3.d());
         this.P(var2, var3.d().g());
         return true;
      } else {
         return false;
      }
   }

   protected boolean Y(net.yv.r var1, Random var2, net.u.j var3, int var4) {
      return this.O(var1, var3, var4) && this.w(var3, var1);
   }

   protected void V(net.yv.r var1, net.u.j var2, int var3) {
      int var4 = var3 * var3;

      for(int var5 = -var3; var5 <= var3 + 1; ++var5) {
         for(int var6 = -var3; var6 <= var3 + 1; ++var6) {
            int var7 = var5 - 1;
            int var8 = var6 - 1;
            if(var5 * var5 + var6 * var6 <= var4 || var7 * var7 + var8 * var8 <= var4 || var5 * var5 + var8 * var8 <= var4 || var7 * var7 + var6 * var6 <= var4) {
               net.u.j var9 = var2.F(var5, 0, var6);
               net.y1.l var10 = var1.Z(var9).n();
               if(var10 == net.y1.l.q || var10 == net.y1.l.h) {
                  this.k(var1, var9, this.H);
               }
            }
         }
      }

   }

   protected void d(net.yv.r var1, net.u.j var2, int var3) {
      int var4 = var3 * var3;

      for(int var5 = -var3; var5 <= var3; ++var5) {
         for(int var6 = -var3; var6 <= var3; ++var6) {
            if(var5 * var5 + var6 * var6 <= var4) {
               net.u.j var7 = var2.F(var5, 0, var6);
               net.y1.l var8 = var1.Z(var7).n();
               if(var8 == net.y1.l.q || var8 == net.y1.l.h) {
                  this.k(var1, var7, this.H);
               }
            }
         }
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
