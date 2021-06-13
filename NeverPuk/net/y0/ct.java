package net.y0;

import net.xn;
import net.n0.k7;
import net.n0.ks;
import net.y0.c;
import net.y0.d;
import net.y0.o;
import net.yz.aa;
import net.yz.m_;

public class ct extends o {
   private final boolean V;

   public ct(d var1) {
      this(var1, false);
   }

   public ct(d var1, boolean var2) {
      super(var1, new net.y6.f(0.0F, var2), 0.5F);
      this.V = var2;
      this.k(new net.ye.d(this));
      this.k(new net.ye.s(this));
      this.k(new net.ye.v(this));
      this.k(new net.ye.h(this));
      this.k(new net.ye.u(this));
      this.k(new net.ye.w(this.w().G));
      this.k(new net.ye.z(this));
      this.k(new net.ye.y(var1));
   }

   public net.y6.f w() {
      return (net.y6.f)super.v();
   }

   public void a(net.yy.f var1, double var2, double var4, double var6, float var8, float var9) {
      if(!var1.VV() || this.A.J == var1) {
         double var10 = var4;
         if(var1.Q()) {
            var10 = var4 - 0.125D;
         }

         this.i(var1);
         net.y.d.f(net.y.d.PLAYER_SKIN);
         super.R(var1, var2, var10, var6, var8, var9);
         net.y.d.C(net.y.d.PLAYER_SKIN);
      }

   }

   private void i(net.yy.f var1) {
      c.q();
      net.y6.f var3 = this.w();
      if(var1.VX()) {
         var3.k(false);
         var3.G.B = true;
         var3.P.B = true;
      }

      ks var4 = var1.S();
      ks var5 = var1.L();
      var3.k(true);
      var3.P.B = var1.o(net.r.j.HAT);
      var3.I.B = var1.o(net.r.j.JACKET);
      var3.i.B = var1.o(net.r.j.LEFT_PANTS_LEG);
      var3.b.B = var1.o(net.r.j.RIGHT_PANTS_LEG);
      var3.s.B = var1.o(net.r.j.LEFT_SLEEVE);
      var3.O.B = var1.o(net.r.j.RIGHT_SLEEVE);
      var3.T = var1.Q();
      net.y6.t var6 = net.y6.t.EMPTY;
      net.y6.t var7 = net.y6.t.EMPTY;
      if(!var4.B()) {
         var6 = net.y6.t.ITEM;
         if(var1.M() > 0) {
            k7 var8 = var4.D();
            if(var8 == k7.BLOCK) {
               var6 = net.y6.t.BLOCK;
            }

            if(var8 == k7.BOW) {
               var6 = net.y6.t.BOW_AND_ARROW;
            }
         }
      }

      if(!var5.B()) {
         var7 = net.y6.t.ITEM;
         if(var1.M() > 0) {
            k7 var9 = var5.D();
            if(var9 == k7.BLOCK) {
               var7 = net.y6.t.BLOCK;
            }
         }
      }

      if(var1.a() == aa.RIGHT) {
         var3.X = var6;
         var3.e = var7;
      }

      var3.X = var7;
      var3.e = var6;
   }

   public m_ H(net.yy.f var1) {
      return var1.g();
   }

   public void E() {
      net.y.d.O(0.0F, 0.1875F, 0.0F);
   }

   protected void M(net.yy.f var1, float var2) {
      float var10000 = 0.9375F;
      net.y.d.W(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(net.yy.f var1, double var2, double var4, double var6, String var8, double var9) {
      if(var9 < 100.0D) {
         net.nc.b var11 = var1.Y();
         net.nc.l var12 = var11.S(2);
         net.nc.o var13 = var11.p(var1.Q(), var12);
         this.d(var1, var13.W() + " " + var12.a(), var2, var4, var6, 64);
         var4 += (double)((float)this.V().R * 1.15F * 0.025F);
      }

      super.Q(var1, var2, var4, var6, var8, var9);
   }

   public void t(net.yy.f var1) {
      float var10000 = 1.0F;
      net.y.d.Z(1.0F, 1.0F, 1.0F);
      var10000 = 0.0625F;
      net.y6.f var4 = this.w();
      this.i(var1);
      net.y.d.C();
      var4.v = 0.0F;
      var4.T = false;
      var4.p(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, var1);
      var4.A.b = 0.0F;
      var4.A.B(0.0625F);
      var4.O.b = 0.0F;
      var4.O.B(0.0625F);
      net.y.d.E();
   }

   public void A(net.yy.f var1) {
      float var10000 = 1.0F;
      net.y.d.Z(1.0F, 1.0F, 1.0F);
      var10000 = 0.0625F;
      net.y6.f var4 = this.w();
      this.i(var1);
      net.y.d.C();
      var4.T = false;
      var4.v = 0.0F;
      var4.p(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, var1);
      var4.B.b = 0.0F;
      var4.B.B(0.0625F);
      var4.s.b = 0.0F;
      var4.s.B(0.0625F);
      net.y.d.E();
   }

   protected void k(net.yy.f var1, double var2, double var4, double var6) {
      if(var1.P() && var1.L()) {
         super.K(var1, var2 + (double)var1.ad, var4 + (double)var1.ax, var6 + (double)var1.ai);
      } else {
         super.K(var1, var2, var4, var6);
      }

   }

   protected void E(net.yy.f var1, float var2, float var3, float var4) {
      if(var1.P() && var1.L()) {
         net.y.d.P(var1.z(), 0.0F, 1.0F, 0.0F);
         net.y.d.P(this.L(var1), 0.0F, 0.0F, 1.0F);
         net.y.d.P(270.0F, 0.0F, 1.0F, 0.0F);
      } else if(var1.I()) {
         super.o(var1, var2, var3, var4);
         float var5 = (float)var1.F() + var4;
         float var6 = net.u.t.T(var5 * var5 / 100.0F, 0.0F, 1.0F);
         net.y.d.P(var6 * (-90.0F - var1.V), 1.0F, 0.0F, 0.0F);
         net.u.r var7 = var1.r(var4);
         double var8 = var1.hf * var1.hf + var1.J * var1.J;
         double var10 = var7.p * var7.p + var7.a * var7.a;
         if(var8 > 0.0D && var10 > 0.0D) {
            double var12 = (var1.hf * var7.p + var1.J * var7.a) / (Math.sqrt(var8) * Math.sqrt(var10));
            double var14 = var1.hf * var7.a - var1.J * var7.p;
            net.y.d.P((float)(Math.signum(var14) * Math.acos(var12)) * 180.0F / 3.1415927F, 0.0F, 1.0F, 0.0F);
         }
      } else {
         super.o(var1, var2, var3, var4);
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
