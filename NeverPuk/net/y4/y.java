package net.y4;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import net.xn;
import net.ns.i;
import net.y4.a;
import net.y4.g;
import net.y4.p;
import net.y4.s;
import net.y4.v;
import net.yz.aq;

public class y extends a {
   private int s;
   private int z;
   public static final List M = Arrays.asList(new i[]{net.nb.x.r, net.nb.x.b, net.nb.x.M, net.nb.x.R, net.nb.x.d});
   public static final List d = Arrays.asList(new i[]{net.nb.x.b});
   private static final List X = Lists.newArrayList();

   public y() {
      this.s = 32;
      this.z = 5;
   }

   public y(Map var1) {
      this();

      for(Entry var3 : var1.entrySet()) {
         if(((String)var3.getKey()).equals("spacing")) {
            this.s = net.u.t.B((String)var3.getValue(), this.s, 1);
         } else if(((String)var3.getKey()).equals("separation")) {
            this.z = net.u.t.B((String)var3.getValue(), this.z, 1);
         }
      }

   }

   public String O() {
      return "Monument";
   }

   protected boolean Y(int var1, int var2) {
      p.d();
      int var4 = var1;
      int var5 = var2;
      if(var1 < 0) {
         var1 -= this.s - 1;
      }

      if(var2 < 0) {
         var2 -= this.s - 1;
      }

      int var6 = var1 / this.s;
      int var7 = var2 / this.s;
      Random var8 = this.Q.Y(var6, var7, 10387313);
      var6 = var6 * this.s;
      var7 = var7 * this.s;
      var6 = var6 + (var8.nextInt(this.s - this.z) + var8.nextInt(this.s - this.z)) / 2;
      var7 = var7 + (var8.nextInt(this.s - this.z) + var8.nextInt(this.s - this.z)) / 2;
      if(var4 == var6 && var5 == var7) {
         if(!this.Q.V().q(var4 * 16 + 8, var5 * 16 + 8, 16, d)) {
            return false;
         } else {
            boolean var9 = this.Q.V().q(var4 * 16 + 8, var5 * 16 + 8, 29, M);
            return var9;
         }
      } else {
         return false;
      }
   }

   public net.u.j h(net.yv.r var1, net.u.j var2, boolean var3) {
      this.Q = var1;
      return O(var1, this, var2, this.s, this.z, 10387313, true, 100, var3);
   }

   protected s z(int var1, int var2) {
      return new y.t(this.Q, this.N, var1, var2);
   }

   public List R() {
      return X;
   }

   static {
      X.add(new i.w(net.nk.z.class, 1, 2, 4));
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class t extends s {
      private final Set Q = Sets.newHashSet();
      private boolean y;

      public t() {
      }

      public t(net.yv.r var1, Random var2, int var3, int var4) {
         super(var3, var4);
         this.a(var1, var2, var3, var4);
      }

      private void a(net.yv.r var1, Random var2, int var3, int var4) {
         var2.setSeed(var1.a());
         long var5 = var2.nextLong();
         long var7 = var2.nextLong();
         long var9 = (long)var3 * var5;
         long var11 = (long)var4 * var7;
         var2.setSeed(var9 ^ var11 ^ var1.a());
         int var13 = var3 * 16 + 8 - 29;
         int var14 = var4 * 16 + 8 - 29;
         aq var15 = aq.u.HORIZONTAL.N(var2);
         this.J.add(new g.q(var2, var13, var14, var15));
         this.O();
         this.y = true;
      }

      public void d(net.yv.r var1, Random var2, v var3) {
         if(!this.y) {
            this.J.clear();
            this.a(var1, var2, this.p(), this.b());
         }

         super.d(var1, var2, var3);
      }

      public boolean U(net.u.p var1) {
         return !this.Q.contains(var1) && super.U(var1);
      }

      public void H(net.u.p var1) {
         super.H(var1);
         this.Q.add(var1);
      }

      public void N(net.nj.f var1) {
         p.d();
         super.N(var1);
         net.nj.h var3 = new net.nj.h();
         Iterator var4 = this.Q.iterator();
         if(var4.hasNext()) {
            net.u.p var5 = (net.u.p)var4.next();
            net.nj.f var6 = new net.nj.f();
            var6.r("X", var5.i);
            var6.r("Z", var5.y);
            var3.m(var6);
         }

         var1.K("Processed", var3);
      }

      public void V(net.nj.f var1) {
         p.d();
         super.V(var1);
         if(var1.K("Processed", 9)) {
            net.nj.h var3 = var1.A("Processed", 10);
            int var4 = 0;
            if(var4 < var3.z()) {
               net.nj.f var5 = var3.i(var4);
               this.Q.add(new net.u.p(var5.P("X"), var5.P("Z")));
               ++var4;
            }
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
