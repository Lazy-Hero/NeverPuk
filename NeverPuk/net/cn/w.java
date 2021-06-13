package net.cn;

import java.util.Random;
import net.xn;
import net.l.o;
import net.yv.r;

public class w {
   protected int o = 8;
   protected Random N = new Random();
   protected r Q;
   private static int W;

   public void x(r var1, int var2, int var3, o var4) {
      S();
      int var6 = this.o;
      this.Q = var1;
      this.N.setSeed(var1.a());
      long var7 = this.N.nextLong();
      long var9 = this.N.nextLong();
      int var11 = var2 - var6;
      if(var11 <= var2 + var6) {
         int var12 = var3 - var6;
         if(var12 <= var3 + var6) {
            long var13 = (long)var11 * var7;
            long var15 = (long)var12 * var9;
            this.N.setSeed(var13 ^ var15 ^ var1.a());
            this.S(var1, var11, var12, var2, var3, var4);
            ++var12;
         }

         ++var11;
      }

   }

   public static void b(long var0, Random var2, int var3, int var4) {
      var2.setSeed(var0);
      long var5 = var2.nextLong();
      long var7 = var2.nextLong();
      long var9 = (long)var3 * var5;
      long var11 = (long)var4 * var7;
      var2.setSeed(var9 ^ var11 ^ var0);
   }

   protected void S(r var1, int var2, int var3, int var4, int var5, o var6) {
   }

   public static void u(int var0) {
      W = var0;
   }

   public static int S() {
      return W;
   }

   public static int a() {
      int var0 = S();
      return 121;
   }

   private static xn b(xn var0) {
      return var0;
   }

   static {
      if(a() != 0) {
         u(107);
      }

   }
}
