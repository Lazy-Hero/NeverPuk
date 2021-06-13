package net.y;

import javax.annotation.Nullable;
import net.xn;
import net.y.p;
import net.y.u;

public class uu {
   protected final u A;
   protected final net.yv.r B;
   protected int Z;
   protected int L;
   protected int s;
   public net.n5.m[] M;

   public uu(net.yv.r var1, int var2, u var3, net.n5.v var4) {
      this.A = var3;
      this.B = var1;
      this.O(var2);
      this.d(var4);
   }

   protected void d(net.n5.v var1) {
      int var2 = this.L * this.Z * this.s;
      this.M = new net.n5.m[var2];
      int var3 = 0;

      for(int var4 = 0; var4 < this.L; ++var4) {
         for(int var5 = 0; var5 < this.Z; ++var5) {
            for(int var6 = 0; var6 < this.s; ++var6) {
               int var7 = (var6 * this.Z + var5) * this.L + var4;
               this.M[var7] = var1.k(this.B, this.A, var3++);
               this.M[var7].f(var4 * 16, var5 * 16, var6 * 16);
            }
         }
      }

   }

   public void c() {
      for(net.n5.m var4 : this.M) {
         var4.E();
      }

   }

   protected void O(int var1) {
      int var2 = var1 * 2 + 1;
      this.L = var2;
      this.Z = 16;
      this.s = var2;
   }

   public void F(double var1, double var3) {
      int var5 = net.u.t.L(var1) - 8;
      int var6 = net.u.t.L(var3) - 8;
      int var7 = this.L * 16;

      for(int var8 = 0; var8 < this.L; ++var8) {
         int var9 = this.e(var5, var7, var8);

         for(int var10 = 0; var10 < this.s; ++var10) {
            int var11 = this.e(var6, var7, var10);

            for(int var12 = 0; var12 < this.Z; ++var12) {
               int var13 = var12 * 16;
               net.n5.m var14 = this.M[(var10 * this.Z + var12) * this.L + var8];
               var14.f(var9, var13, var11);
            }
         }
      }

   }

   private int e(int var1, int var2, int var3) {
      int var4 = var3 * 16;
      int var5 = var4 - var1 + var2 / 2;
      var5 = var5 - (var2 - 1);
      return var4 - var5 / var2 * var2;
   }

   public void B(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      p.S();
      int var9 = net.u.t.m(var1, 16);
      int var10 = net.u.t.m(var2, 16);
      int var11 = net.u.t.m(var3, 16);
      int var12 = net.u.t.m(var4, 16);
      int var13 = net.u.t.m(var5, 16);
      int var14 = net.u.t.m(var6, 16);
      if(var9 <= var12) {
         int var16 = var9 % this.L;
         if(var16 < 0) {
            var16 += this.L;
         }

         if(var10 <= var13) {
            int var18 = var10 % this.Z;
            if(var18 < 0) {
               var18 += this.Z;
            }

            if(var11 <= var14) {
               int var20 = var11 % this.s;
               if(var20 < 0) {
                  var20 += this.s;
               }

               int var21 = (var20 * this.Z + var18) * this.L + var16;
               net.n5.m var22 = this.M[var21];
               var22.Z(var7);
               int var19 = var11 + 1;
            }

            int var17 = var10 + 1;
         }

         int var15 = var9 + 1;
      }

   }

   @Nullable
   public net.n5.m J(net.u.j var1) {
      int var2 = var1.t() >> 4;
      int var3 = var1.h() >> 4;
      int var4 = var1.y() >> 4;
      if(var3 < this.Z) {
         var2 = var2 % this.L;
         var2 = var2 + this.L;
         var4 = var4 % this.s;
         var4 = var4 + this.s;
         int var5 = (var4 * this.Z + var3) * this.L + var2;
         return this.M[var5];
      } else {
         return null;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
