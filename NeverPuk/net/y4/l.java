package net.y4;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import net.xn;
import net.ns.i;
import net.y4.a;
import net.y4.p;
import net.y4.s;
import net.y4.w;

public class l extends a {
   private final List H;
   private boolean V;
   private net.u.p[] p;
   private double s;
   private int h;

   public l() {
      this.p = new net.u.p[128];
      this.s = 32.0D;
      this.h = 3;
      this.H = Lists.newArrayList();

      for(i var2 : i.q) {
         if(var2.Q() > 0.0F) {
            this.H.add(var2);
         }
      }

   }

   public l(Map var1) {
      this();

      for(Entry var3 : var1.entrySet()) {
         if(((String)var3.getKey()).equals("distance")) {
            this.s = net.u.t.k((String)var3.getValue(), this.s, 1.0D);
         } else if(((String)var3.getKey()).equals("count")) {
            this.p = new net.u.p[net.u.t.B((String)var3.getValue(), this.p.length, 1)];
         } else if(((String)var3.getKey()).equals("spread")) {
            this.h = net.u.t.B((String)var3.getValue(), this.h, 1);
         }
      }

   }

   public String O() {
      return "Stronghold";
   }

   public net.u.j h(net.yv.r var1, net.u.j var2, boolean var3) {
      if(!this.V) {
         this.v();
         this.V = true;
      }

      net.u.j var4 = null;
      net.u.j var5 = new net.u.j(0, 0, 0);
      double var10000 = Double.MAX_VALUE;

      for(net.u.p var11 : this.p) {
         var5.V((var11.i << 4) + 8, 32, (var11.y << 4) + 8);
         double var12 = var5.n(var2);
         var4 = new net.u.j(var5);
      }

      return var4;
   }

   protected boolean Y(int var1, int var2) {
      if(!this.V) {
         this.v();
         this.V = true;
      }

      for(net.u.p var6 : this.p) {
         if(var1 == var6.i && var2 == var6.y) {
            return true;
         }
      }

      return false;
   }

   private void v() {
      p.d();
      this.e(this.Q);
      int var2 = 0;
      ObjectIterator var3 = this.y.values().iterator();
      if(var3.hasNext()) {
         s var4 = (s)var3.next();
         if(var2 < this.p.length) {
            this.p[var2++] = new net.u.p(var4.p(), var4.b());
         }
      }

      Random var17 = new Random();
      var17.setSeed(this.Q.a());
      double var5 = var17.nextDouble() * 3.141592653589793D * 2.0D;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.y.size();
      if(var9 < this.p.length) {
         int var10 = 0;
         if(var10 < this.p.length) {
            double var11 = 4.0D * this.s + this.s * (double)var7 * 6.0D + (var17.nextDouble() - 0.5D) * this.s * 2.5D;
            int var13 = (int)Math.round(Math.cos(var5) * var11);
            int var14 = (int)Math.round(Math.sin(var5) * var11);
            net.u.j var15 = this.Q.V().R((var13 << 4) + 8, (var14 << 4) + 8, 112, this.H, var17);
            if(var15 != null) {
               var13 = var15.t() >> 4;
               var14 = var15.y() >> 4;
            }

            if(var10 >= var9) {
               this.p[var10] = new net.u.p(var13, var14);
            }

            var5 = var5 + 6.283185307179586D / (double)this.h;
            ++var8;
            if(var8 == this.h) {
               ++var7;
               var8 = 0;
               this.h += 2 * this.h / (var7 + 1);
               this.h = Math.min(this.h, this.p.length - var10);
               double var10000 = var5 + var17.nextDouble() * 3.141592653589793D * 2.0D;
            }

            ++var10;
         }
      }

   }

   protected s z(int var1, int var2) {
      l.b var3;
      for(var3 = new l.b(this.Q, this.N, var1, var2); var3.o().isEmpty() || ((w.c)var3.o().get(0)).L == null; var3 = new l.b(this.Q, this.N, var1, var2)) {
         ;
      }

      return var3;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class b extends s {
      public b() {
      }

      public b(net.yv.r var1, Random var2, int var3, int var4) {
         super(var3, var4);
         w.l();
         w.c var6 = new w.c(0, var2, (var3 << 4) + 2, (var4 << 4) + 2);
         p.d();
         this.J.add(var6);
         var6.S(var6, this.J, var2);
         List var7 = var6.j;
         if(!var7.isEmpty()) {
            int var8 = var2.nextInt(var7.size());
            p var9 = (p)var7.remove(var8);
            var9.S(var6, this.J, var2);
         }

         this.O();
         this.X(var1, var2, 10);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
