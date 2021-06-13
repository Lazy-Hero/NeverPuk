package net.y4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import net.xn;
import net.ns.i;
import net.y4.a;
import net.y4.p;
import net.y4.r;
import net.y4.s;

public class q extends a {
   public static final List X = Arrays.asList(new i[]{net.nb.x.v, net.nb.x.m, net.nb.x.u, net.nb.x.s});
   private int d;
   private int w;
   private final int h;

   public q() {
      this.w = 32;
      this.h = 8;
   }

   public q(Map var1) {
      this();

      for(Entry var3 : var1.entrySet()) {
         if(((String)var3.getKey()).equals("size")) {
            this.d = net.u.t.B((String)var3.getValue(), this.d, 0);
         } else if(((String)var3.getKey()).equals("distance")) {
            this.w = net.u.t.B((String)var3.getValue(), this.w, 9);
         }
      }

   }

   public String O() {
      return "Village";
   }

   protected boolean Y(int var1, int var2) {
      p.d();
      int var4 = var1;
      int var5 = var2;
      if(var1 < 0) {
         var1 -= this.w - 1;
      }

      if(var2 < 0) {
         var2 -= this.w - 1;
      }

      int var6 = var1 / this.w;
      int var7 = var2 / this.w;
      Random var8 = this.Q.Y(var6, var7, 10387312);
      var6 = var6 * this.w;
      var7 = var7 * this.w;
      var6 = var6 + var8.nextInt(this.w - 8);
      var7 = var7 + var8.nextInt(this.w - 8);
      if(var4 == var6 && var5 == var7) {
         boolean var9 = this.Q.V().q(var4 * 16 + 8, var5 * 16 + 8, 0, X);
         return var9;
      } else {
         return false;
      }
   }

   public net.u.j h(net.yv.r var1, net.u.j var2, boolean var3) {
      this.Q = var1;
      return O(var1, this, var2, this.w, 8, 10387312, false, 100, var3);
   }

   protected s z(int var1, int var2) {
      return new q.b(this.Q, this.N, var1, var2, this.d);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class b extends s {
      private boolean Y;

      public b() {
      }

      public b(net.yv.r var1, Random var2, int var3, int var4, int var5) {
         p.d();
         super(var3, var4);
         List var7 = r.A(var2, var5);
         r.g var8 = new r.g(var1.V(), 0, var2, (var3 << 4) + 2, (var4 << 4) + 2, var7, var5);
         this.J.add(var8);
         var8.S(var8, this.J, var2);
         List var9 = var8.x;
         List var10 = var8.d;
         if(!var9.isEmpty() || !var10.isEmpty()) {
            if(var9.isEmpty()) {
               int var11 = var2.nextInt(var10.size());
               p var12 = (p)var10.remove(var11);
               var12.S(var8, this.J, var2);
            }

            int var14 = var2.nextInt(var9.size());
            p var17 = (p)var9.remove(var14);
            var17.S(var8, this.J, var2);
         }

         this.O();
         int var15 = 0;
         Iterator var18 = this.J.iterator();
         if(var18.hasNext()) {
            p var13 = (p)var18.next();
            if(!(var13 instanceof r.c)) {
               ++var15;
            }
         }

         this.Y = false;
      }

      public boolean d() {
         return this.Y;
      }

      public void N(net.nj.f var1) {
         super.N(var1);
         var1.c("Valid", this.Y);
      }

      public void V(net.nj.f var1) {
         super.V(var1);
         this.Y = var1.i("Valid");
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
