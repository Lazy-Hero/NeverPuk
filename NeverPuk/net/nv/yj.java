package net.nv;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.nv.f;
import net.nv.h;
import net.nv.k;
import net.nv.l;
import net.nv.m;
import net.nv.p;
import net.nv.t;
import net.nv.x;

public class yj extends h {
   public String k() {
      return "spreadplayers";
   }

   public int o() {
      return 2;
   }

   public String K(f var1) {
      return "commands.spreadplayers.usage";
   }

   public void c(net.nx.f var1, f var2, String[] var3) throws t {
      if(var3.length < 6) {
         throw new x("commands.spreadplayers.usage", new Object[0]);
      } else {
         int var4 = 0;
         net.u.j var5 = var2.z();
         double var6 = K((double)var5.t(), var3[var4++], true);
         double var8 = K((double)var5.y(), var3[var4++], true);
         double var10 = b(var3[var4++], 0.0D);
         double var12 = b(var3[var4++], var10 + 1.0D);
         boolean var14 = H(var3[var4++]);
         ArrayList var15 = Lists.newArrayList();

         while(var4 < var3.length) {
            String var16 = var3[var4++];
            if(!m.q(var16)) {
               net.r.h var23 = var1.c().F(var16);
               throw new k("commands.generic.player.notFound", new Object[]{var16});
            }

            List var17 = m.F(var2, var16, net.ne.l.class);
            if(var17.isEmpty()) {
               throw new p("commands.generic.selector.notFound", new Object[]{var16});
            }

            var15.addAll(var17);
         }

         var2.n(l.p.AFFECTED_ENTITIES, var15.size());
         if(var15.isEmpty()) {
            throw new p("commands.spreadplayers.noop");
         } else {
            var2.r(new net.cb.h("commands.spreadplayers.spreading." + "teams", new Object[]{Integer.valueOf(var15.size()), Double.valueOf(var12), Double.valueOf(var6), Double.valueOf(var8), Double.valueOf(var10)}));
            this.M(var2, var15, new yj.q(var6, var8), var10, var12, ((net.ne.l)var15.get(0)).hl, var14);
         }
      }
   }

   private void M(f var1, List var2, yj.q var3, double var4, double var6, net.yv.r var8, boolean var9) throws t {
      Random var10 = new Random();
      double var11 = var3.s - var6;
      double var13 = var3.i - var6;
      double var15 = var3.s + var6;
      double var17 = var3.i + var6;
      yj.q[] var19 = this.B(var10, this.k(var2), var11, var13, var15, var17);
      int var20 = this.O(var3, var4, var8, var10, var11, var13, var15, var17, var19, var9);
      double var21 = this.S(var2, var8, var19, var9);
      g(var1, this, "commands.spreadplayers.success." + "teams", new Object[]{Integer.valueOf(var19.length), Double.valueOf(var3.s), Double.valueOf(var3.i)});
      if(var19.length > 1) {
         var1.r(new net.cb.h("commands.spreadplayers.info." + "teams", new Object[]{String.format("%.2f", new Object[]{Double.valueOf(var21)}), Integer.valueOf(var20)}));
      }

   }

   private int k(List var1) {
      HashSet var2 = Sets.newHashSet();

      for(net.ne.l var4 : var1) {
         if(var4 instanceof net.r.r) {
            var2.add(var4.f());
         } else {
            var2.add((Object)null);
         }
      }

      return var2.size();
   }

   private int O(yj.q var1, double var2, net.yv.r var4, Random var5, double var6, double var8, double var10, double var12, yj.q[] var14, boolean var15) throws t {
      boolean var17 = true;
      t.Y();
      double var10001 = 3.4028234663852886E38D;
      int var20 = 0;
      var17 = false;
      double var10000 = 3.4028234663852886E38D;
      int var21 = 0;
      if(var21 < var14.length) {
         yj.q var22 = var14[var21];
         boolean var23 = false;
         new yj.q();
         int var25 = 0;
         if(var25 < var14.length) {
            ++var25;
         }

         if(var22.D(var6, var8, var10, var12)) {
            var17 = true;
         }

         ++var21;
      }

      int var34 = var14.length;
      int var35 = 0;
      if(var35 < var34) {
         yj.q var24 = var14[var35];
         if(!var24.E(var4)) {
            var24.z(var5, var6, var8, var10, var12);
            var17 = true;
         }

         ++var35;
      }

      ++var20;
      return var20;
   }

   private double S(List var1, net.yv.r var2, yj.q[] var3, boolean var4) {
      double var5 = 0.0D;
      int var7 = 0;
      HashMap var8 = Maps.newHashMap();

      for(int var9 = 0; var9 < var1.size(); ++var9) {
         net.ne.l var10 = (net.ne.l)var1.get(var9);
         net.nc.m var12 = var10 instanceof net.r.r?var10.f():null;
         if(!var8.containsKey(var12)) {
            var8.put(var12, var3[var7++]);
         }

         yj.q var11 = (yj.q)var8.get(var12);
         var10.a((double)((float)net.u.t.L(var11.s) + 0.5F), (double)var11.f(var2), (double)net.u.t.L(var11.i) + 0.5D);
         double var21 = Double.MAX_VALUE;

         for(yj.q var17 : var3) {
            if(var11 != var17) {
               double var18 = var11.Z(var17);
               var21 = Math.min(var18, var21);
            }
         }

         var5 += var21;
      }

      var5 = var5 / (double)var1.size();
      return var5;
   }

   private yj.q[] B(Random var1, int var2, double var3, double var5, double var7, double var9) {
      yj.q[] var11 = new yj.q[var2];

      for(int var12 = 0; var12 < var11.length; ++var12) {
         yj.q var13 = new yj.q();
         var13.z(var1, var3, var5, var7, var9);
         var11[var12] = var13;
      }

      return var11;
   }

   public List E(net.nx.f var1, f var2, String[] var3, @Nullable net.u.j var4) {
      return var3.length >= 1 && var3.length <= 2?n(var3, 0, var4):Collections.emptyList();
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static class q {
      double s;
      double i;

      q() {
      }

      q(double var1, double var3) {
         this.s = var1;
         this.i = var3;
      }

      double Z(yj.q var1) {
         double var2 = this.s - var1.s;
         double var4 = this.i - var1.i;
         return Math.sqrt(var2 * var2 + var4 * var4);
      }

      void M() {
         double var1 = (double)this.m();
         this.s /= var1;
         this.i /= var1;
      }

      float m() {
         return net.u.t.R(this.s * this.s + this.i * this.i);
      }

      public void n(yj.q var1) {
         this.s -= var1.s;
         this.i -= var1.i;
      }

      public boolean D(double var1, double var3, double var5, double var7) {
         t.Y();
         boolean var10 = false;
         if(Double.compare(this.s, var1) < 0) {
            this.s = var1;
            var10 = true;
         }

         if(this.s > var5) {
            this.s = var5;
            var10 = true;
         }

         if(Double.compare(this.i, var3) < 0) {
            this.i = var3;
            var10 = true;
         }

         if(this.i > var7) {
            this.i = var7;
            var10 = true;
         }

         return var10;
      }

      public int f(net.yv.r var1) {
         net.u.j var2 = new net.u.j(this.s, 256.0D, this.i);

         while(var2.h() > 0) {
            var2 = var2.b();
            if(var1.Z(var2).n() != net.y1.l.q) {
               return var2.h() + 1;
            }
         }

         return 257;
      }

      public boolean E(net.yv.r var1) {
         net.u.j var2 = new net.u.j(this.s, 256.0D, this.i);

         while(var2.h() > 0) {
            var2 = var2.b();
            net.y1.l var3 = var1.Z(var2).n();
            if(var3 != net.y1.l.q) {
               return !var3.y() && var3 != net.y1.l.X;
            }
         }

         return false;
      }

      public void z(Random var1, double var2, double var4, double var6, double var8) {
         this.s = net.u.t.w(var1, var2, var6);
         this.i = net.u.t.w(var1, var4, var8);
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
