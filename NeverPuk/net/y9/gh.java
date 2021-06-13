package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.gc;
import net.y9.l;
import net.y9.lk;
import net.yv.o8;
import net.yz.ac;
import net.yz.ai;
import net.yz.aq;

public abstract class gh extends l {
   public static final net.yr.o N = net.yr.o.k("decayable");
   public static final net.yr.o u = net.yr.o.k("check_decay");
   protected boolean W;
   int[] M;

   public gh() {
      super(net.y1.l.h);
      this.R(true);
      this.f(net.ys.r.X);
      this.r(0.2F);
      this.R(1);
      this.i(lk.G);
   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      boolean var10000 = true;
      var10000 = true;
      int var6 = var2.t();
      int var7 = var2.h();
      int var8 = var2.y();
      if(var1.C(new net.u.j(var6 - 2, var7 - 2, var8 - 2), new net.u.j(var6 + 2, var7 + 2, var8 + 2))) {
         byte var9 = -1;
         byte var10 = -1;
         int var11 = -1;

         while(true) {
            net.u.j var12 = var2.F(var9, var10, var11);
            net.yw.n var13 = var1.Z(var12);
            if(var13.n() == net.y1.l.h && !((Boolean)var13.i(u)).booleanValue()) {
               var1.k(var12, var13.s(u, Boolean.valueOf(true)), 4);
            }

            ++var11;
         }
      }

   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      int[] var5 = g3.v.w();
      if(!var1.x && ((Boolean)var3.i(u)).booleanValue() && ((Boolean)var3.i(N)).booleanValue()) {
         boolean var10000 = true;
         var10000 = true;
         int var8 = var2.t();
         int var9 = var2.h();
         int var10 = var2.y();
         var10000 = true;
         var10000 = true;
         var10000 = true;
         if(this.M == null) {
            this.M = new int['耀'];
         }

         if(var1.C(new net.u.j(var8 - 5, var9 - 5, var10 - 5), new net.u.j(var8 + 5, var9 + 5, var10 + 5))) {
            net.u.j var14 = new net.u.j();
            int var15 = -4;
            int var16 = -4;
            int var17 = -4;
            net.yw.n var18 = var1.Z(var14.V(var8 + var15, var9 + var16, var10 + var17));
            l var19 = var18.Q();
            if(var19 != net.nb.f.u6 && var19 != net.nb.f.ub) {
               if(var18.n() == net.y1.l.h) {
                  this.M[(var15 + 16) * 1024 + (var16 + 16) * 32 + var17 + 16] = -2;
               }

               this.M[(var15 + 16) * 1024 + (var16 + 16) * 32 + var17 + 16] = -1;
            }

            this.M[(var15 + 16) * 1024 + (var16 + 16) * 32 + var17 + 16] = 0;
            ++var17;
            ++var16;
            ++var15;
            var15 = 1;
            var16 = -4;
            var17 = -4;
            int var30 = -4;
            if(this.M[(var16 + 16) * 1024 + (var17 + 16) * 32 + var30 + 16] == var15 - 1) {
               if(this.M[(var16 + 16 - 1) * 1024 + (var17 + 16) * 32 + var30 + 16] == -2) {
                  this.M[(var16 + 16 - 1) * 1024 + (var17 + 16) * 32 + var30 + 16] = var15;
               }

               if(this.M[(var16 + 16 + 1) * 1024 + (var17 + 16) * 32 + var30 + 16] == -2) {
                  this.M[(var16 + 16 + 1) * 1024 + (var17 + 16) * 32 + var30 + 16] = var15;
               }

               if(this.M[(var16 + 16) * 1024 + (var17 + 16 - 1) * 32 + var30 + 16] == -2) {
                  this.M[(var16 + 16) * 1024 + (var17 + 16 - 1) * 32 + var30 + 16] = var15;
               }

               if(this.M[(var16 + 16) * 1024 + (var17 + 16 + 1) * 32 + var30 + 16] == -2) {
                  this.M[(var16 + 16) * 1024 + (var17 + 16 + 1) * 32 + var30 + 16] = var15;
               }

               if(this.M[(var16 + 16) * 1024 + (var17 + 16) * 32 + (var30 + 16 - 1)] == -2) {
                  this.M[(var16 + 16) * 1024 + (var17 + 16) * 32 + (var30 + 16 - 1)] = var15;
               }

               if(this.M[(var16 + 16) * 1024 + (var17 + 16) * 32 + var30 + 16 + 1] == -2) {
                  this.M[(var16 + 16) * 1024 + (var17 + 16) * 32 + var30 + 16 + 1] = var15;
               }
            }

            ++var30;
            ++var17;
            ++var16;
            ++var15;
         }

         int var20 = this.M[16912];
         if(var20 >= 0) {
            var1.k(var2, var3.s(u, Boolean.valueOf(false)), 4);
         }

         this.Z(var1, var2);
      }

   }

   public void Y(net.yw.n var1, net.yv.r var2, net.u.j var3, Random var4) {
      if(var2.F(var3.h()) && !var2.Z(var3.b()).z() && var4.nextInt(15) == 1) {
         double var5 = (double)((float)var3.t() + var4.nextFloat());
         double var7 = (double)var3.h() - 0.05D;
         double var9 = (double)((float)var3.y() + var4.nextFloat());
         var2.n(ai.DRIP_WATER, var5, var7, var9, 0.0D, 0.0D, 0.0D, new int[0]);
      }

   }

   private void Z(net.yv.r var1, net.u.j var2) {
      this.N(var1, var2, var1.Z(var2), 0);
      var1.J(var2);
   }

   public int T(Random var1) {
      return var1.nextInt(20) == 0?1:0;
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.n0.y.q(net.nb.f.X);
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
      if(!var1.x) {
         int var6 = this.u(var3);
         var6 = var6 - (2 << var5);
         if(var6 < 10) {
            var6 = 10;
         }

         if(var1.G.nextInt(var6) == 0) {
            net.n0.y var7 = this.X(var3, var1.G, var5);
            e(var1, var2, new ks(var7, 1, this.z(var3)));
         }

         var6 = 200;
         var6 = var6 - (10 << var5);
         if(var6 < 40) {
            var6 = 40;
         }

         this.J(var1, var2, var3, var6);
      }

   }

   protected void J(net.yv.r var1, net.u.j var2, net.yw.n var3, int var4) {
   }

   protected int u(net.yw.n var1) {
      return 20;
   }

   public boolean V(net.yw.n var1) {
      return !this.W;
   }

   public void F(boolean var1) {
      this.W = var1;
   }

   public ac k() {
      return this.W?ac.CUTOUT_MIPPED:ac.SOLID;
   }

   public boolean e(net.yw.n var1) {
      return false;
   }

   public abstract gc.i x(int var1);

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return (this.W || var2.Z(var3.C(var4)).Q() != this) && super.v(var1, var2, var3, var4);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
