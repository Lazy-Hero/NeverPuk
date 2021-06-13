package net.y4;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y4.b;
import net.y4.c;
import net.y4.p;
import net.y4.v;
import net.yz.aq;
import net.yz.m_;

public class o {
   private static final net.yj.y i = (new net.yj.y()).P(true);
   private static final net.yj.y v = (new net.yj.y()).P(true).k(net.nb.f.ou);
   private static final o.j s = new o.j() {
      public void y() {
      }

      public boolean j(net.yj.e var1, int var2, o.m var3, net.u.j var4, List var5, Random var6) {
         int[] var7 = p.d();
         if(var2 > 8) {
            return false;
         } else {
            net.yz.l var8 = var3.f.L();
            o.m var9 = o.g(var5, o.q(var1, var3, var4, "base_floor", var8, true));
            int var10 = var6.nextInt(3);
            if(var10 == 0) {
               o.g(var5, o.q(var1, var9, new net.u.j(-1, 4, -1), "base_roof", var8, true));
            }

            if(var10 == 1) {
               o.m var11 = o.g(var5, o.q(var1, var9, new net.u.j(-1, 0, -1), "second_floor_2", var8, false));
               var9 = o.g(var5, o.q(var1, var11, new net.u.j(-1, 8, -1), "second_roof", var8, false));
               o.S(var1, o.Q, var2 + 1, var9, (net.u.j)null, var5, var6);
            }

            if(var10 == 2) {
               var9 = o.g(var5, o.q(var1, var9, new net.u.j(-1, 0, -1), "second_floor_2", var8, false));
               var9 = o.g(var5, o.q(var1, var9, new net.u.j(-1, 4, -1), "third_floor_c", var8, false));
               var9 = o.g(var5, o.q(var1, var9, new net.u.j(-1, 8, -1), "third_roof", var8, true));
               o.S(var1, o.Q, var2 + 1, var9, (net.u.j)null, var5, var6);
            }

            return true;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private static final List f = Lists.newArrayList(new net.yz.y[]{new net.yz.y(net.yz.l.NONE, new net.u.j(1, -1, 0)), new net.yz.y(net.yz.l.CLOCKWISE_90, new net.u.j(6, -1, 1)), new net.yz.y(net.yz.l.COUNTERCLOCKWISE_90, new net.u.j(0, -1, 5)), new net.yz.y(net.yz.l.CLOCKWISE_180, new net.u.j(5, -1, 6))});
   private static final o.j Q = new o.j() {
      public void y() {
      }

      public boolean j(net.yj.e var1, int var2, o.m var3, net.u.j var4, List var5, Random var6) {
         p.d();
         net.yz.l var8 = var3.f.L();
         o.m var9 = o.g(var5, o.q(var1, var3, new net.u.j(3 + var6.nextInt(2), -3, 3 + var6.nextInt(2)), "tower_base", var8, true));
         var9 = o.g(var5, o.q(var1, var9, new net.u.j(0, 7, 0), "tower_piece", var8, true));
         o.m var10 = var6.nextInt(3) == 0?var9:null;
         int var11 = 1 + var6.nextInt(3);
         int var12 = 0;
         if(var12 < var11) {
            var9 = o.g(var5, o.q(var1, var9, new net.u.j(0, 4, 0), "tower_piece", var8, true));
            if(var12 < var11 - 1 && var6.nextBoolean()) {
               var10 = var9;
            }

            ++var12;
         }

         Iterator var17 = o.f.iterator();
         if(var17.hasNext()) {
            net.yz.y var13 = (net.yz.y)var17.next();
            if(var6.nextBoolean()) {
               o.m var14 = o.g(var5, o.q(var1, var10, (net.u.j)var13.I(), "bridge_end", var8.B((net.yz.l)var13.e()), true));
               o.S(var1, o.T, var2 + 1, var14, (net.u.j)null, var5, var6);
            }
         }

         o.g(var5, o.q(var1, var9, new net.u.j(-1, 4, -1), "tower_top", var8, true));
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private static final o.j T = new o.j() {
      public boolean q;

      public void y() {
         this.q = false;
      }

      public boolean j(net.yj.e var1, int var2, o.m var3, net.u.j var4, List var5, Random var6) {
         net.yz.l var8 = var3.f.L();
         int var9 = var6.nextInt(4) + 1;
         p.d();
         o.m var10 = o.g(var5, o.q(var1, var3, new net.u.j(0, 0, -4), "bridge_piece", var8, true));
         var10.i = -1;
         byte var11 = 0;
         int var12 = 0;
         if(var12 < var9) {
            if(var6.nextBoolean()) {
               var10 = o.g(var5, o.q(var1, var10, new net.u.j(0, var11, -4), "bridge_piece", var8, true));
               var11 = 0;
            }

            if(var6.nextBoolean()) {
               var10 = o.g(var5, o.q(var1, var10, new net.u.j(0, var11, -4), "bridge_steep_stairs", var8, true));
            }

            var10 = o.g(var5, o.q(var1, var10, new net.u.j(0, var11, -8), "bridge_gentle_stairs", var8, true));
            var11 = 4;
            ++var12;
         }

         if(!this.q && var6.nextInt(10 - var2) == 0) {
            o.g(var5, o.q(var1, var10, new net.u.j(-8 + var6.nextInt(8), var11, -70 + var6.nextInt(10)), "ship", var8, true));
            this.q = true;
         }

         if(!o.S(var1, o.s, var2 + 1, var10, new net.u.j(-3, var11 + 1, -11), var5, var6)) {
            return false;
         } else {
            var10 = o.g(var5, o.q(var1, var10, new net.u.j(4, var11, 0), "bridge_end", var8.B(net.yz.l.CLOCKWISE_180), true));
            var10.i = -1;
            return true;
         }
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private static final List L = Lists.newArrayList(new net.yz.y[]{new net.yz.y(net.yz.l.NONE, new net.u.j(4, -1, 0)), new net.yz.y(net.yz.l.CLOCKWISE_90, new net.u.j(12, -1, 4)), new net.yz.y(net.yz.l.COUNTERCLOCKWISE_90, new net.u.j(0, -1, 8)), new net.yz.y(net.yz.l.CLOCKWISE_180, new net.u.j(8, -1, 12))});
   private static final o.j P = new o.j() {
      public void y() {
      }

      public boolean j(net.yj.e var1, int var2, o.m var3, net.u.j var4, List var5, Random var6) {
         net.yz.l var8 = var3.f.L();
         p.d();
         o.m var9 = o.g(var5, o.q(var1, var3, new net.u.j(-3, 4, -3), "fat_tower_base", var8, true));
         var9 = o.g(var5, o.q(var1, var9, new net.u.j(0, 4, 0), "fat_tower_middle", var8, true));
         int var10 = 0;
         if(var6.nextInt(3) != 0) {
            var9 = o.g(var5, o.q(var1, var9, new net.u.j(0, 8, 0), "fat_tower_middle", var8, true));
            Iterator var11 = o.L.iterator();
            if(var11.hasNext()) {
               net.yz.y var12 = (net.yz.y)var11.next();
               if(var6.nextBoolean()) {
                  o.m var13 = o.g(var5, o.q(var1, var9, (net.u.j)var12.I(), "bridge_end", var8.B((net.yz.l)var12.e()), true));
                  o.S(var1, o.T, var2 + 1, var13, (net.u.j)null, var5, var6);
               }
            }

            ++var10;
         }

         o.g(var5, o.q(var1, var9, new net.u.j(-2, 8, -2), "fat_tower_top", var8, true));
         return true;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };

   public static void r() {
      b.v(o.m.class, "ECP");
   }

   private static o.m q(net.yj.e var0, o.m var1, net.u.j var2, String var3, net.yz.l var4, boolean var5) {
      o.m var6 = new o.m(var0, var3, var1.l, var4, var5);
      net.u.j var7 = var1.v.W(var1.f, var2, var6.f, net.u.j.V);
      var6.g(var7.t(), var7.h(), var7.y());
      return var6;
   }

   public static void A(net.yj.e var0, net.u.j var1, net.yz.l var2, List var3, Random var4) {
      P.y();
      s.y();
      T.y();
      Q.y();
      o.m var5 = g(var3, new o.m(var0, "base_floor", var1, var2, true));
      var5 = g(var3, q(var0, var5, new net.u.j(-1, 0, -1), "second_floor", var2, false));
      var5 = g(var3, q(var0, var5, new net.u.j(-1, 4, -1), "third_floor", var2, false));
      var5 = g(var3, q(var0, var5, new net.u.j(-1, 8, -1), "third_roof", var2, true));
      S(var0, Q, 1, var5, (net.u.j)null, var3, var4);
   }

   private static o.m g(List var0, o.m var1) {
      var0.add(var1);
      return var1;
   }

   private static boolean S(net.yj.e var0, o.j var1, int var2, o.m var3, net.u.j var4, List var5, Random var6) {
      int[] var7 = p.d();
      if(var2 > 8) {
         return false;
      } else {
         ArrayList var8 = Lists.newArrayList();
         if(var1.j(var0, var2, var3, var4, var8, var6)) {
            boolean var9 = false;
            int var10 = var6.nextInt();
            Iterator var11 = var8.iterator();
            if(var11.hasNext()) {
               p var12 = (p)var11.next();
               var12.i = var10;
               p var13 = p.H(var5, var12.J());
               if(var13 != null && var13.i != var3.i) {
                  var9 = true;
               }
            }

            var5.addAll(var8);
            return true;
         } else {
            return false;
         }
      }
   }

   // $FF: synthetic method
   static o.j access$600() {
      return P;
   }

   private static xn a(xn var0) {
      return var0;
   }

   interface j {
      void y();

      boolean j(net.yj.e var1, int var2, o.m var3, net.u.j var4, List var5, Random var6);
   }

   public static class m extends c {
      private String F;
      private net.yz.l O;
      private boolean N;

      public m() {
      }

      public m(net.yj.e var1, String var2, net.u.j var3, net.yz.l var4, boolean var5) {
         super(0);
         this.F = var2;
         this.l = var3;
         this.O = var4;
         this.N = var5;
         this.C(var1);
      }

      private void C(net.yj.e var1) {
         net.yj.f var2 = var1.O((net.nx.f)null, new m_("endcity/" + this.F));
         net.yj.y var3 = (this.N?o.i:o.v).K().o(this.O);
         this.g(var2, this.l, var3);
      }

      protected void x(net.nj.f var1) {
         super.x(var1);
         var1.b("Template", this.F);
         var1.b("Rot", this.O.name());
         var1.c("OW", this.N);
      }

      protected void a(net.nj.f var1, net.yj.e var2) {
         super.a(var1, var2);
         this.F = var1.J("Template");
         this.O = net.yz.l.valueOf(var1.J("Rot"));
         this.N = var1.i("OW");
         this.C(var2);
      }

      protected void B(String var1, net.u.j var2, net.yv.r var3, Random var4, v var5) {
         int[] var6 = p.d();
         if(var1.startsWith("Chest")) {
            net.u.j var7 = var2.b();
            if(var5.Y(var7)) {
               net.ni.v var8 = var3.L(var7);
               if(var8 instanceof net.ni.k) {
                  ((net.ni.k)var8).G(net.y7.p.e, var4.nextLong());
               }
            }
         }

         if(var1.startsWith("Sentry")) {
            net.nk.j var9 = new net.nk.j(var3);
            var9.t((double)var2.t() + 0.5D, (double)var2.h() + 0.5D, (double)var2.y() + 0.5D);
            var9.B(var2);
            var3.S(var9);
         }

         if(var1.startsWith("Elytra")) {
            net.nm.e var10 = new net.nm.e(var3, var2, this.O.d(aq.SOUTH));
            var10.K(new ks(net.nb.j.SB));
            var3.S(var10);
         }

      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
