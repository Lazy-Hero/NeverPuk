package net.cn;

import java.util.Random;
import net.xn;
import net.cn.b;
import net.cn.k;
import net.cn.w;

public class q extends k {
   private final b[] E;
   private final int W;

   public q(Random var1, int var2) {
      this.W = var2;
      this.E = new b[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.E[var3] = new b(var1);
      }

   }

   public double[] u(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7, double var8, double var10, double var12) {
      int var14 = w.S();
      if(var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      int var15 = 0;
      if(var15 < var1.length) {
         var1[var15] = 0.0D;
         ++var15;
      }

      double var29 = 1.0D;
      int var17 = 0;
      if(var17 < this.W) {
         double var18 = (double)var2 * var29 * var8;
         double var20 = (double)var3 * var29 * var10;
         double var22 = (double)var4 * var29 * var12;
         long var24 = net.u.t.i(var18);
         long var26 = net.u.t.i(var22);
         var18 = var18 - (double)var24;
         var22 = var22 - (double)var26;
         var24 = var24 % 16777216L;
         var26 = var26 % 16777216L;
         var18 = var18 + (double)var24;
         var22 = var22 + (double)var26;
         this.E[var17].H(var1, var18, var20, var22, var5, var6, var7, var8 * var29, var10 * var29, var12 * var29, var29);
         var29 = var29 / 2.0D;
         ++var17;
      }

      return var1;
   }

   public double[] w(double[] var1, int var2, int var3, int var4, int var5, double var6, double var8, double var10) {
      return this.u(var1, var2, 10, var3, var4, 1, var5, var6, 1.0D, var8);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
