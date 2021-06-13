package net.nf;

import net.xn;
import net.nf.i;
import net.nf.r;

public class g extends i {
   private final g.q t;

   public g(long var1, i var3, g.q var4) {
      super(var1);
      this.j = var3;
      this.t = var4;
   }

   public int[] Y(int var1, int var2, int var3, int var4) {
      switch(null.S[this.t.ordinal()]) {
      case 1:
      default:
         return this.H(var1, var2, var3, var4);
      case 2:
         return this.e(var1, var2, var3, var4);
      case 3:
         return this.R(var1, var2, var3, var4);
      }
   }

   private int[] H(int var1, int var2, int var3, int var4) {
      i.D();
      int var6 = var1 - 1;
      int var7 = var2 - 1;
      int var8 = 1 + var3 + 1;
      int var9 = 1 + var4 + 1;
      int[] var10 = this.j.Y(var6, var7, var8, var9);
      int[] var11 = r.J(var3 * var4);
      int var12 = 0;
      if(var12 < var4) {
         int var13 = 0;
         if(var13 < var3) {
            this.N((long)(var13 + var1), (long)(var12 + var2));
            int var14 = var10[var13 + 1 + (var12 + 1) * var8];
            if(var14 == 1) {
               int var15 = var10[var13 + 1 + (var12 + 1 - 1) * var8];
               int var16 = var10[var13 + 1 + 1 + (var12 + 1) * var8];
               int var17 = var10[var13 + 1 - 1 + (var12 + 1) * var8];
               int var18 = var10[var13 + 1 + (var12 + 1 + 1) * var8];
               boolean var19 = var15 == 3 || var16 == 3 || var17 == 3 || var18 == 3;
               if(var15 != 4 && var16 != 4 && var17 != 4 && var18 != 4) {
                  boolean var23 = false;
               } else {
                  boolean var10000 = true;
               }

               var14 = 2;
            }

            var11[var13 + var12 * var3] = var14;
            ++var13;
         }

         ++var12;
      }

      return var11;
   }

   private int[] e(int var1, int var2, int var3, int var4) {
      int var5 = var1 - 1;
      int var6 = var2 - 1;
      int var7 = 1 + var3 + 1;
      int var8 = 1 + var4 + 1;
      int[] var9 = this.j.Y(var5, var6, var7, var8);
      int[] var10 = r.J(var3 * var4);

      for(int var11 = 0; var11 < var4; ++var11) {
         for(int var12 = 0; var12 < var3; ++var12) {
            int var13 = var9[var12 + 1 + (var11 + 1) * var7];
            if(var13 == 4) {
               int var14 = var9[var12 + 1 + (var11 + 1 - 1) * var7];
               int var15 = var9[var12 + 1 + 1 + (var11 + 1) * var7];
               int var16 = var9[var12 + 1 - 1 + (var11 + 1) * var7];
               int var17 = var9[var12 + 1 + (var11 + 1 + 1) * var7];
               boolean var18 = var14 == 2 || var15 == 2 || var16 == 2 || var17 == 2;
               boolean var19 = var14 == 1 || var15 == 1 || var16 == 1 || var17 == 1;
               var13 = 3;
            }

            var10[var12 + var11 * var3] = var13;
         }
      }

      return var10;
   }

   private int[] R(int var1, int var2, int var3, int var4) {
      int[] var5 = this.j.Y(var1, var2, var3, var4);
      int[] var6 = r.J(var3 * var4);

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            this.N((long)(var8 + var1), (long)(var7 + var2));
            int var9 = var5[var8 + var7 * var3];
            if(this.u(13) == 0) {
               var9 |= 1 + this.u(15) << 8 & 3840;
            }

            var6[var8 + var7 * var3] = var9;
         }
      }

      return var6;
   }

   private static xn b(xn var0) {
      return var0;
   }

   public static enum q {
      COOL_WARM,
      HEAT_ICE,
      SPECIAL;
   }
}
