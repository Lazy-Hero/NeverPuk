package net.y4;

import java.util.Random;
import net.xn;
import net.y4.a;
import net.y4.o;
import net.y4.p;
import net.y4.s;

public class t extends a {
   private final int k = 20;
   private final int B = 11;
   private final net.cn.y q;

   public t(net.cn.y var1) {
      this.q = var1;
   }

   public String O() {
      return "EndCity";
   }

   protected boolean Y(int var1, int var2) {
      int var3 = var1;
      int var4 = var2;
      var1 = var1 - 19;
      var2 = var2 - 19;
      int var5 = var1 / 20;
      int var6 = var2 / 20;
      Random var7 = this.Q.Y(var5, var6, 10387313);
      var5 = var5 * 20;
      var6 = var6 * 20;
      var5 = var5 + (var7.nextInt(9) + var7.nextInt(9)) / 2;
      var6 = var6 + (var7.nextInt(9) + var7.nextInt(9)) / 2;
      if(var3 == var5 && var4 == var6 && this.q.D(var3, var4)) {
         int var8 = N(var3, var4, this.q);
         return var8 >= 60;
      } else {
         return false;
      }
   }

   protected s z(int var1, int var2) {
      return new t.w(this.Q, this.q, this.N, var1, var2);
   }

   public net.u.j h(net.yv.r var1, net.u.j var2, boolean var3) {
      this.Q = var1;
      return O(var1, this, var2, 20, 11, 10387313, true, 100, var3);
   }

   private static int N(int var0, int var1, net.cn.y var2) {
      Random var4 = new Random((long)(var0 + var1 * 10387313));
      net.yz.l var5 = net.yz.l.values()[var4.nextInt(net.yz.l.values().length)];
      p.d();
      net.l.o var6 = new net.l.o();
      var2.g(var0, var1, var6);
      byte var7 = 5;
      byte var8 = 5;
      if(var5 == net.yz.l.CLOCKWISE_90) {
         var7 = -5;
      }

      if(var5 == net.yz.l.CLOCKWISE_180) {
         var7 = -5;
         var8 = -5;
      }

      if(var5 == net.yz.l.COUNTERCLOCKWISE_90) {
         var8 = -5;
      }

      int var9 = var6.a(7, 7);
      int var10 = var6.a(7, 7 + var8);
      int var11 = var6.a(7 + var7, 7);
      int var12 = var6.a(7 + var7, 7 + var8);
      int var13 = Math.min(Math.min(var9, var10), Math.min(var11, var12));
      return var13;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class w extends s {
      private boolean b;

      public w() {
      }

      public w(net.yv.r var1, net.cn.y var2, Random var3, int var4, int var5) {
         super(var4, var5);
         this.W(var1, var2, var3, var4, var5);
      }

      private void W(net.yv.r var1, net.cn.y var2, Random var3, int var4, int var5) {
         Random var7 = new Random((long)(var4 + var5 * 10387313));
         net.yz.l var8 = net.yz.l.values()[var7.nextInt(net.yz.l.values().length)];
         p.d();
         int var9 = t.N(var4, var5, var2);
         if(var9 < 60) {
            this.b = false;
         }

         net.u.j var10 = new net.u.j(var4 * 16 + 8, var9, var5 * 16 + 8);
         o.A(var1.q().N(), var10, var8, this.J, var3);
         this.O();
         this.b = true;
      }

      public boolean d() {
         return this.b;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
