package net.y4;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import net.xn;
import net.ns.i;
import net.ns.i9;
import net.y4.a;
import net.y4.m;
import net.y4.p;
import net.y4.s;
import net.y4.v;

public class u extends a {
   private final int v = 80;
   private final int t = 20;
   public static final List i = Arrays.asList(new i[]{net.nb.x.o, net.nb.x.V});
   private final net.cn.u J;

   public u(net.cn.u var1) {
      this.J = var1;
   }

   public String O() {
      return "Mansion";
   }

   protected boolean Y(int var1, int var2) {
      int var4 = var1;
      p.d();
      int var5 = var2;
      if(var1 < 0) {
         var4 = var1 - 79;
      }

      if(var2 < 0) {
         var5 = var2 - 79;
      }

      int var6 = var4 / 80;
      int var7 = var5 / 80;
      Random var8 = this.Q.Y(var6, var7, 10387319);
      var6 = var6 * 80;
      var7 = var7 * 80;
      var6 = var6 + (var8.nextInt(60) + var8.nextInt(60)) / 2;
      var7 = var7 + (var8.nextInt(60) + var8.nextInt(60)) / 2;
      if(var1 == var6 && var2 == var7) {
         boolean var9 = this.Q.V().q(var1 * 16 + 8, var2 * 16 + 8, 32, i);
         return var9;
      } else {
         return false;
      }
   }

   public net.u.j h(net.yv.r var1, net.u.j var2, boolean var3) {
      this.Q = var1;
      i9 var4 = var1.V();
      return var4.a() && var4.S() != net.nb.x.o?null:O(var1, this, var2, 80, 20, 10387319, true, 100, var3);
   }

   protected s z(int var1, int var2) {
      return new u.y(this.Q, this.J, this.N, var1, var2);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class y extends s {
      private boolean N;

      public y() {
      }

      public y(net.yv.r var1, net.cn.u var2, Random var3, int var4, int var5) {
         super(var4, var5);
         this.f(var1, var2, var3, var4, var5);
      }

      private void f(net.yv.r var1, net.cn.u var2, Random var3, int var4, int var5) {
         net.yz.l var7 = net.yz.l.values()[var3.nextInt(net.yz.l.values().length)];
         p.d();
         net.l.o var8 = new net.l.o();
         var2.g(var4, var5, var8);
         byte var9 = 5;
         byte var10 = 5;
         if(var7 == net.yz.l.CLOCKWISE_90) {
            var9 = -5;
         }

         if(var7 == net.yz.l.CLOCKWISE_180) {
            var9 = -5;
            var10 = -5;
         }

         if(var7 == net.yz.l.COUNTERCLOCKWISE_90) {
            var10 = -5;
         }

         int var11 = var8.a(7, 7);
         int var12 = var8.a(7, 7 + var10);
         int var13 = var8.a(7 + var9, 7);
         int var14 = var8.a(7 + var9, 7 + var10);
         int var15 = Math.min(Math.min(var11, var12), Math.min(var13, var14));
         if(var15 < 60) {
            this.N = false;
         }

         net.u.j var16 = new net.u.j(var4 * 16 + 8, var15 + 1, var5 * 16 + 8);
         LinkedList var17 = Lists.newLinkedList();
         m.U(var1.q().N(), var16, var7, var17, var3);
         this.J.addAll(var17);
         this.O();
         this.N = true;
      }

      public void d(net.yv.r var1, Random var2, v var3) {
         super.d(var1, var2, var3);
         int var4 = this.K.D;

         for(int var5 = var3.i; var5 <= var3.e; ++var5) {
            for(int var6 = var3.p; var6 <= var3.J; ++var6) {
               net.u.j var7 = new net.u.j(var5, var4, var6);
               if(!var1.y(var7) && this.K.Y(var7)) {
                  boolean var8 = false;

                  for(p var10 : this.J) {
                     if(var10.w.Y(var7)) {
                        var8 = true;
                        break;
                     }
                  }

                  for(int var12 = var4 - 1; var12 > 1; --var12) {
                     net.u.j var13 = new net.u.j(var5, var12, var6);
                     if(!var1.y(var13) && !var1.Z(var13).n().y()) {
                        break;
                     }

                     var1.k(var13, net.nb.f.TD.p(), 2);
                  }
               }
            }
         }

      }

      public boolean d() {
         return this.N;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
