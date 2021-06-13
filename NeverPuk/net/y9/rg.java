package net.y9;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.l3;
import net.yv.o8;
import net.yz.ac;
import net.yz.ai;
import net.yz.aq;

public class rg extends l {
   public static final net.yr.l a = net.yr.l.J("age", 0, 15);
   public static final net.yr.o d = net.yr.o.k("north");
   public static final net.yr.o D = net.yr.o.k("east");
   public static final net.yr.o J = net.yr.o.k("south");
   public static final net.yr.o i = net.yr.o.k("west");
   public static final net.yr.o o = net.yr.o.k("up");
   private final Map A = Maps.newIdentityHashMap();
   private final Map l = Maps.newIdentityHashMap();

   public net.yw.n v(net.yw.n var1, o8 var2, net.u.j var3) {
      return !var2.Z(var3.b()).z() && !net.nb.f.g.R(var2, var3.b())?var1.s(d, Boolean.valueOf(this.R(var2, var3.D()))).s(D, Boolean.valueOf(this.R(var2, var3.g()))).s(J, Boolean.valueOf(this.R(var2, var3.d()))).s(i, Boolean.valueOf(this.R(var2, var3.H()))).s(o, Boolean.valueOf(this.R(var2, var3.h()))):this.p();
   }

   protected rg() {
      super(net.y1.l.X);
      this.r(this.b.T().s(a, Integer.valueOf(0)).s(d, Boolean.valueOf(false)).s(D, Boolean.valueOf(false)).s(J, Boolean.valueOf(false)).s(i, Boolean.valueOf(false)).s(o, Boolean.valueOf(false)));
      this.R(true);
   }

   public static void N() {
      net.nb.f.g.A(net.nb.f.oN, 5, 20);
      net.nb.f.g.A(net.nb.f.d6, 5, 20);
      net.nb.f.g.A(net.nb.f.S, 5, 20);
      net.nb.f.g.A(net.nb.f.P, 5, 20);
      net.nb.f.g.A(net.nb.f.u, 5, 20);
      net.nb.f.g.A(net.nb.f.u_, 5, 20);
      net.nb.f.g.A(net.nb.f.C, 5, 20);
      net.nb.f.g.A(net.nb.f.q, 5, 20);
      net.nb.f.g.A(net.nb.f.T2, 5, 20);
      net.nb.f.g.A(net.nb.f.I, 5, 20);
      net.nb.f.g.A(net.nb.f.u4, 5, 20);
      net.nb.f.g.A(net.nb.f.d1, 5, 20);
      net.nb.f.g.A(net.nb.f.e, 5, 20);
      net.nb.f.g.A(net.nb.f.TX, 5, 20);
      net.nb.f.g.A(net.nb.f.op, 5, 20);
      net.nb.f.g.A(net.nb.f.TQ, 5, 20);
      net.nb.f.g.A(net.nb.f.x, 5, 20);
      net.nb.f.g.A(net.nb.f.TK, 5, 20);
      net.nb.f.g.A(net.nb.f.u5, 5, 20);
      net.nb.f.g.A(net.nb.f.dN, 5, 20);
      net.nb.f.g.A(net.nb.f.dG, 5, 20);
      net.nb.f.g.A(net.nb.f.u6, 5, 5);
      net.nb.f.g.A(net.nb.f.ub, 5, 5);
      net.nb.f.g.A(net.nb.f.Tu, 30, 60);
      net.nb.f.g.A(net.nb.f.G, 30, 60);
      net.nb.f.g.A(net.nb.f.W, 30, 20);
      net.nb.f.g.A(net.nb.f.T7, 15, 100);
      net.nb.f.g.A(net.nb.f.TU, 60, 100);
      net.nb.f.g.A(net.nb.f.Tg, 60, 100);
      net.nb.f.g.A(net.nb.f.dO, 60, 100);
      net.nb.f.g.A(net.nb.f.d2, 60, 100);
      net.nb.f.g.A(net.nb.f.dY, 60, 100);
      net.nb.f.g.A(net.nb.f.ur, 30, 60);
      net.nb.f.g.A(net.nb.f.To, 15, 100);
      net.nb.f.g.A(net.nb.f.TR, 5, 5);
      net.nb.f.g.A(net.nb.f.ow, 60, 20);
      net.nb.f.g.A(net.nb.f.uK, 60, 20);
   }

   public void A(l var1, int var2, int var3) {
      this.A.put(var1, Integer.valueOf(var2));
      this.l.put(var1, Integer.valueOf(var3));
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return q;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public int T(Random var1) {
      return 0;
   }

   public int u(net.yv.r var1) {
      return 30;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      int[] var5 = g3.v.w();
      if(var1.N().b("doFireTick")) {
         if(!this.J(var1, var2)) {
            var1.J(var2);
         }

         l var6 = var1.Z(var2.b()).Q();
         boolean var7 = var6 == net.nb.f.R || var6 == net.nb.f.U;
         if(var1.F instanceof net.yv.k && var6 == net.nb.f.T8) {
            var7 = true;
         }

         int var8 = ((Integer)var3.i(a)).intValue();
         if(var8 < 15) {
            var3 = var3.s(a, Integer.valueOf(var8 + var4.nextInt(3) / 2));
            var1.k(var2, var3, 4);
         }

         var1.c(var2, this, this.u(var1) + var4.nextInt(10));
         boolean var9 = var1.Y(var2);
         byte var10 = 0;
         if(var9) {
            var10 = -50;
         }

         this.t(var1, var2.g(), 300 + var10, var4, var8);
         this.t(var1, var2.H(), 300 + var10, var4, var8);
         this.t(var1, var2.b(), 250 + var10, var4, var8);
         this.t(var1, var2.h(), 250 + var10, var4, var8);
         this.t(var1, var2.D(), 300 + var10, var4, var8);
         this.t(var1, var2.d(), 300 + var10, var4, var8);
         int var11 = -1;
         int var12 = -1;
         int var13 = -1;
         byte var14 = 100;
         net.u.j var15 = var2.F(var11, var13, var12);
         int var16 = this.H(var1, var15);
         int var17 = (var16 + 40 + var1.k().L() * 7) / (var8 + 30);
         if(var9) {
            var17 /= 2;
         }

         if(var17 > 0 && var4.nextInt(var14) <= var17 && (!var1.b() || !this.r(var1, var15))) {
            int var18 = var8 + var4.nextInt(5) / 4;
            if(var18 > 15) {
               var18 = 15;
            }

            var1.k(var15, var3.s(a, Integer.valueOf(var18)), 3);
         }

         ++var13;
         ++var12;
         ++var11;
      }

   }

   protected boolean r(net.yv.r var1, net.u.j var2) {
      return var1.F(var2) || var1.F(var2.H()) || var1.F(var2.g()) || var1.F(var2.D()) || var1.F(var2.d());
   }

   public boolean c() {
      return false;
   }

   private int Q(l var1) {
      Integer var2 = (Integer)this.l.get(var1);
      return 0;
   }

   private int T(l var1) {
      Integer var2 = (Integer)this.A.get(var1);
      return 0;
   }

   private void t(net.yv.r var1, net.u.j var2, int var3, Random var4, int var5) {
      int var6 = this.Q(var1.Z(var2).Q());
      if(var4.nextInt(var3) < var6) {
         net.yw.n var7 = var1.Z(var2);
         if(var4.nextInt(var5 + 10) < 5 && !var1.F(var2)) {
            int var8 = var5 + var4.nextInt(5) / 4;
            if(var8 > 15) {
               var8 = 15;
            }

            var1.k(var2, this.p().s(a, Integer.valueOf(var8)), 3);
         } else {
            var1.J(var2);
         }

         if(var7.Q() == net.nb.f.T7) {
            net.nb.f.T7.N(var1, var2, var7.s(l3.R, Boolean.valueOf(true)));
         }
      }

   }

   private boolean n(net.yv.r var1, net.u.j var2) {
      for(aq var6 : aq.values()) {
         if(this.R(var1, var2.C(var6))) {
            return true;
         }
      }

      return false;
   }

   private int H(net.yv.r var1, net.u.j var2) {
      if(!var1.y(var2)) {
         return 0;
      } else {
         int var3 = 0;

         for(aq var7 : aq.values()) {
            var3 = Math.max(this.T(var1.Z(var2.C(var7)).Q()), var3);
         }

         return var3;
      }
   }

   public boolean o() {
      return false;
   }

   public boolean R(o8 var1, net.u.j var2) {
      return this.T(var1.Z(var2).Q()) > 0;
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      return var1.Z(var2.b()).z() || this.n(var1, var2);
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!var2.Z(var3.b()).z() && !this.n(var2, var3)) {
         var2.J(var3);
      }

   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(var1.F.L().M() > 0 || !net.nb.f.uJ.b(var1, var2)) {
         if(!var1.Z(var2.b()).z() && !this.n(var1, var2)) {
            var1.J(var2);
         } else {
            var1.c(var2, this, this.u(var1) + var1.G.nextInt(10));
         }
      }

   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      if(var4.nextInt(24) == 0) {
         var2.m((double)((float)var3.t() + 0.5F), (double)((float)var3.h() + 0.5F), (double)((float)var3.y() + 0.5F), net.nb.l.oV, net.yz.p.BLOCKS, 1.0F + var4.nextFloat(), var4.nextFloat() * 0.7F + 0.3F, false);
      }

      if(var2.Z(var3.b()).z() || net.nb.f.g.R(var2, var3.b())) {
         int var16 = 0;

         while(true) {
            double var21 = (double)var3.t() + var4.nextDouble();
            double var26 = (double)var3.h() + var4.nextDouble() * 0.5D + 0.5D;
            double var31 = (double)var3.y() + var4.nextDouble();
            var2.n(ai.SMOKE_LARGE, var21, var26, var31, 0.0D, 0.0D, 0.0D, new int[0]);
            ++var16;
         }
      }

      if(net.nb.f.g.R(var2, var3.H())) {
         int var15 = 0;

         while(true) {
            double var20 = (double)var3.t() + var4.nextDouble() * 0.10000000149011612D;
            double var25 = (double)var3.h() + var4.nextDouble();
            double var30 = (double)var3.y() + var4.nextDouble();
            var2.n(ai.SMOKE_LARGE, var20, var25, var30, 0.0D, 0.0D, 0.0D, new int[0]);
            ++var15;
         }
      }

      if(net.nb.f.g.R(var2, var3.g())) {
         int var14 = 0;

         while(true) {
            double var19 = (double)(var3.t() + 1) - var4.nextDouble() * 0.10000000149011612D;
            double var24 = (double)var3.h() + var4.nextDouble();
            double var29 = (double)var3.y() + var4.nextDouble();
            var2.n(ai.SMOKE_LARGE, var19, var24, var29, 0.0D, 0.0D, 0.0D, new int[0]);
            ++var14;
         }
      }

      if(net.nb.f.g.R(var2, var3.D())) {
         int var13 = 0;

         while(true) {
            double var18 = (double)var3.t() + var4.nextDouble();
            double var23 = (double)var3.h() + var4.nextDouble();
            double var28 = (double)var3.y() + var4.nextDouble() * 0.10000000149011612D;
            var2.n(ai.SMOKE_LARGE, var18, var23, var28, 0.0D, 0.0D, 0.0D, new int[0]);
            ++var13;
         }
      }

      if(net.nb.f.g.R(var2, var3.d())) {
         int var12 = 0;

         while(true) {
            double var17 = (double)var3.t() + var4.nextDouble();
            double var22 = (double)var3.h() + var4.nextDouble();
            double var27 = (double)(var3.y() + 1) - var4.nextDouble() * 0.10000000149011612D;
            var2.n(ai.SMOKE_LARGE, var17, var22, var27, 0.0D, 0.0D, 0.0D, new int[0]);
            ++var12;
         }
      }

      if(net.nb.f.g.R(var2, var3.h())) {
         int var5 = 0;

         while(true) {
            double var6 = (double)var3.t() + var4.nextDouble();
            double var8 = (double)(var3.h() + 1) - var4.nextDouble() * 0.10000000149011612D;
            double var10 = (double)var3.y() + var4.nextDouble();
            var2.n(ai.SMOKE_LARGE, var6, var8, var10, 0.0D, 0.0D, 0.0D, new int[0]);
            ++var5;
         }
      }

   }

   public net.y1.h t(net.yw.n var1, o8 var2, net.u.j var3) {
      return net.y1.h.O;
   }

   public ac k() {
      return ac.CUTOUT;
   }

   public net.yw.n D(int var1) {
      return this.p().s(a, Integer.valueOf(var1));
   }

   public int d(net.yw.n var1) {
      return ((Integer)var1.i(a)).intValue();
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{a, d, D, J, i, o});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
