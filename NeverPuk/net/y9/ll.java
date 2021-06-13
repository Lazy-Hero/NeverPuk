package net.y9;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;
import net.y9.lg;
import net.yv.o8;
import net.yz.ai;
import net.yz.aq;

public class ll extends lg {
   private static final Map i = Maps.newHashMap();
   private final boolean f;

   private boolean J(net.yv.r var1, net.u.j var2, boolean var3) {
      if(!i.containsKey(var1)) {
         i.put(var1, Lists.newArrayList());
      }

      List var4 = (List)i.get(var1);
      var4.add(new ll.h(var2, var1.y()));
      int var5 = 0;

      for(int var6 = 0; var6 < var4.size(); ++var6) {
         ll.h var7 = (ll.h)var4.get(var6);
         if(var7.s.equals(var2)) {
            ++var5;
            if(var5 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   protected ll(boolean var1) {
      this.f = var1;
      this.R(true);
      this.f((net.ys.r)null);
   }

   public int u(net.yv.r var1) {
      return 2;
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(this.f) {
         for(aq var7 : aq.values()) {
            var1.b(var2.C(var7), this, false);
         }
      }

   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(this.f) {
         for(aq var7 : aq.values()) {
            var1.b(var2.C(var7), this, false);
         }
      }

   }

   public int L(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return this.f && var1.i(n) != var4?15:0;
   }

   private boolean V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      aq var4 = ((aq)var3.i(n)).f();
      return var1.z(var2.C(var4), var4);
   }

   public void i(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      boolean var6 = this.V(var1, var2, var3);
      g3.v.w();
      List var7 = (List)i.get(var1);
      if(!var7.isEmpty() && Long.compare(var1.y() - ((ll.h)var7.get(0)).D, 60L) > 0) {
         var7.remove(0);
      }

      if(this.f) {
         if(!var6) {
            return;
         }

         var1.k(var2, net.nb.f.dz.p().s(n, var3.i(n)), 3);
         if(!this.J(var1, var2, true)) {
            return;
         }

         var1.M((net.r.r)null, var2, net.nb.l.HR, net.yz.p.BLOCKS, 0.5F, 2.6F + (var1.G.nextFloat() - var1.G.nextFloat()) * 0.8F);
         int var8 = 0;
         double var9 = (double)var2.t() + var4.nextDouble() * 0.6D + 0.2D;
         double var11 = (double)var2.h() + var4.nextDouble() * 0.6D + 0.2D;
         double var13 = (double)var2.y() + var4.nextDouble() * 0.6D + 0.2D;
         var1.n(ai.SMOKE_NORMAL, var9, var11, var13, 0.0D, 0.0D, 0.0D, new int[0]);
         ++var8;
         var1.c(var2, var1.Z(var2).Q(), 160);
      }

      if(!var6 && !this.J(var1, var2, false)) {
         var1.k(var2, net.nb.f.ut.p().s(n, var3.i(n)), 3);
      }

   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!this.X(var2, var3, var1) && this.f == this.V(var2, var3, var1)) {
         var2.c(var3, this, this.u(var2));
      }

   }

   public int n(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return var4 == aq.DOWN?var1.M(var2, var3, var4):0;
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.n0.y.q(net.nb.f.ut);
   }

   public boolean s(net.yw.n var1) {
      return true;
   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      if(this.f) {
         double var5 = (double)var3.t() + 0.5D + (var4.nextDouble() - 0.5D) * 0.2D;
         double var7 = (double)var3.h() + 0.7D + (var4.nextDouble() - 0.5D) * 0.2D;
         double var9 = (double)var3.y() + 0.5D + (var4.nextDouble() - 0.5D) * 0.2D;
         aq var11 = (aq)var1.i(n);
         if(var11.r().P()) {
            aq var12 = var11.f();
            double var10000 = 0.27D;
            var5 += 0.27D * (double)var12.v();
            var7 += 0.22D;
            var9 += 0.27D * (double)var12.P();
         }

         var2.n(ai.REDSTONE, var5, var7, var9, 0.0D, 0.0D, 0.0D, new int[0]);
      }

   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.f.ut);
   }

   public boolean a(l var1) {
      return var1 == net.nb.f.dz || var1 == net.nb.f.ut;
   }

   private static xn b(xn var0) {
      return var0;
   }

   static class h {
      net.u.j s;
      long D;

      public h(net.u.j var1, long var2) {
         this.s = var1;
         this.D = var2;
      }
   }
}
