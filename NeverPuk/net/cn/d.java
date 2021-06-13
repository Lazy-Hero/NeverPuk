package net.cn;

import java.util.Random;
import net.xn;
import net.cn.k;
import net.cn.s;
import net.cn.w;

public class d extends k {
   private final s[] Q;
   private final int u;

   public d(Random var1, int var2) {
      this.u = var2;
      this.Q = new s[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.Q[var3] = new s(var1);
      }

   }

   public double Q(double var1, double var3) {
      double var5 = 0.0D;
      double var7 = 1.0D;

      for(int var9 = 0; var9 < this.u; ++var9) {
         var5 += this.Q[var9].B(var1 * var7, var3 * var7) / var7;
         var7 /= 2.0D;
      }

      return var5;
   }

   public double[] X(double[] var1, double var2, double var4, int var6, int var7, double var8, double var10, double var12) {
      return this.u(var1, var2, var4, var6, var7, var8, var10, var12, 0.5D);
   }

   public double[] u(double[] var1, double var2, double var4, int var6, int var7, double var8, double var10, double var12, double var14) {
      int var16 = w.a();
      if(var1 != null && var1.length >= var6 * var7) {
         int var17 = 0;
         if(var17 < var1.length) {
            var1[var17] = 0.0D;
            ++var17;
         }
      }

      var1 = new double[var6 * var7];
      double var24 = 1.0D;
      double var19 = 1.0D;
      int var21 = 0;
      if(var21 < this.u) {
         this.Q[var21].e(var1, var2, var4, var6, var7, var8 * var19 * var24, var10 * var19 * var24, 0.55D / var24);
         double var10000 = var19 * var12;
         var10000 = var24 * var14;
         ++var21;
      }

      return var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
