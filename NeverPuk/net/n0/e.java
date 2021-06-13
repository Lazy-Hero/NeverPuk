package net.n0;

import javax.annotation.Nullable;
import net.xn;
import net.n0.k7;
import net.n0.ks;
import net.n0.kw;
import net.n0.ky;
import net.n0.x;
import net.n0.y;
import net.yz.ad;
import net.yz.am;
import net.yz.m_;

public class e extends y {
   public e() {
      this.S = 1;
      this.d(384);
      this.M(net.ys.r.R);
      this.V(new m_("pull"), new ky() {
         public float k(ks var1, @Nullable net.yv.r var2, @Nullable net.ne.a var3) {
            int[] var4 = kw.b();
            return var3 == null?0.0F:(var3.t().Z() != net.nb.j.w?0.0F:(float)(var1.o() - var3.M()) / 20.0F);
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      this.V(new m_("pulling"), new ky() {
         public float k(ks var1, @Nullable net.yv.r var2, @Nullable net.ne.a var3) {
            int[] var4 = kw.b();
            return var3 != null && var3.F() && var3.t() == var1?1.0F:0.0F;
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   private ks f(net.r.r var1) {
      if(this.K(var1.o((net.yz.k)net.yz.k.OFF_HAND))) {
         return var1.o((net.yz.k)net.yz.k.OFF_HAND);
      } else if(this.K(var1.o((net.yz.k)net.yz.k.MAIN_HAND))) {
         return var1.o((net.yz.k)net.yz.k.MAIN_HAND);
      } else {
         for(int var2 = 0; var2 < var1.a8.e(); ++var2) {
            ks var3 = var1.a8.A(var2);
            if(this.K(var3)) {
               return var3;
            }
         }

         return ks.a;
      }
   }

   protected boolean K(ks var1) {
      return var1.Z() instanceof x;
   }

   public void k(ks var1, net.yv.r var2, net.ne.a var3, int var4) {
      int[] var5 = kw.b();
      if(var3 instanceof net.r.r) {
         net.r.r var6 = (net.r.r)var3;
         if(!var6.a6.V && net.c1.y.g(net.nb.u.q, var1) <= 0) {
            boolean var16 = false;
         } else {
            boolean var10000 = true;
         }

         ks var8 = this.f(var6);
         if(var8.B()) {
            ;
         }

         if(var8.B()) {
            var8 = new ks(net.nb.j.W_);
         }

         int var9 = this.K(var1) - var4;
         float var10 = h(var9);
         if(Double.compare((double)var10, 0.1D) >= 0) {
            boolean var11 = var8.Z() == net.nb.j.W_;
            if(!var2.x) {
               x var12 = (x)((x)(var8.Z() instanceof x?var8.Z():net.nb.j.W_));
               net.n1.o var13 = var12.B(var2, var8, var6);
               var13.x(var6, var6.V, var6.hN, 0.0F, var10 * 3.0F, 1.0F);
               if(Float.compare(var10, 1.0F) == 0) {
                  var13.f(true);
               }

               int var14 = net.c1.y.g(net.nb.u.E, var1);
               if(var14 > 0) {
                  var13.k(var13.i() + (double)var14 * 0.5D + 0.5D);
               }

               int var15 = net.c1.y.g(net.nb.u.w, var1);
               if(var15 > 0) {
                  var13.c(var15);
               }

               if(net.c1.y.g(net.nb.u.G, var1) > 0) {
                  var13.n(100);
               }

               var1.S(1, var6);
               if(var6.a6.V && (var8.Z() == net.nb.j.WT || var8.Z() == net.nb.j.l)) {
                  var13.kc = net.n1.o.CREATIVE_ONLY;
               }

               var2.S(var13);
            }

            var2.L((net.r.r)null, var6.b, var6.hS, var6.hr, net.nb.l.y, net.yz.p.PLAYERS, 1.0F, 1.0F / (u.nextFloat() * 0.4F + 1.2F) + var10 * 0.5F);
            if(!var6.a6.V) {
               var8.H(1);
               if(var8.B()) {
                  var6.a8.M(var8);
               }
            }

            var6.S(net.v.q.H(this));
         }
      }

   }

   public static float h(int var0) {
      float var1 = (float)var0 / 20.0F;
      var1 = (var1 * var1 + var1 * 2.0F) / 3.0F;
      if(var1 > 1.0F) {
         var1 = 1.0F;
      }

      return var1;
   }

   public int K(ks var1) {
      return 72000;
   }

   public k7 g(ks var1) {
      return k7.BOW;
   }

   public am G(net.yv.r var1, net.r.r var2, net.yz.k var3) {
      ks var4 = var2.o((net.yz.k)var3);
      boolean var5 = !this.f(var2).B();
      if(!var2.a6.V) {
         return new am(ad.PASS, var4);
      } else {
         var2.T(var3);
         return new am(ad.SUCCESS, var4);
      }
   }

   public int z() {
      return 1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
