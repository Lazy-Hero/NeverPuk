package net.y4;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y4.b;
import net.y4.v;
import net.y9.r9;
import net.y9.zz;
import net.yz.aq;
import net.yz.ax;
import net.yz.m_;

public abstract class p {
   protected v w;
   @Nullable
   private aq Y;
   private ax h;
   private net.yz.l C;
   protected int i;
   private static int[] u;

   public p() {
   }

   protected p(int var1) {
      this.i = var1;
   }

   public final net.nj.f b() {
      net.nj.f var1 = new net.nj.f();
      var1.b("id", b.M(this));
      var1.K("BB", this.w.I());
      aq var2 = this.L();
      var1.r("O", -1);
      var1.r("GD", this.i);
      this.x(var1);
      return var1;
   }

   protected abstract void x(net.nj.f var1);

   public void h(net.yv.r var1, net.nj.f var2) {
      if(var2.G("BB")) {
         this.w = new v(var2.g("BB"));
      }

      int var3 = var2.P("O");
      this.n(var3 == -1?null:aq.Q(var3));
      this.i = var2.P("GD");
      this.a(var2, var1.q().N());
   }

   protected abstract void a(net.nj.f var1, net.yj.e var2);

   public void S(p var1, List var2, Random var3) {
   }

   public abstract boolean Q(net.yv.r var1, Random var2, v var3);

   public v J() {
      return this.w;
   }

   public int Q() {
      return this.i;
   }

   public static p H(List var0, v var1) {
      for(p var3 : var0) {
         if(var3.J() != null && var3.J().F(var1)) {
            return var3;
         }
      }

      return null;
   }

   protected boolean w(net.yv.r var1, v var2) {
      int var4 = Math.max(this.w.i - 1, var2.i);
      int var5 = Math.max(this.w.D - 1, var2.D);
      int var6 = Math.max(this.w.p - 1, var2.p);
      d();
      int var7 = Math.min(this.w.e + 1, var2.e);
      int var8 = Math.min(this.w.P + 1, var2.P);
      int var9 = Math.min(this.w.J + 1, var2.J);
      net.u.j var10 = new net.u.j();
      if(var4 <= var7) {
         if(var6 <= var9) {
            if(var1.Z(var10.V(var4, var5, var6)).n().y()) {
               return true;
            }

            if(var1.Z(var10.V(var4, var8, var6)).n().y()) {
               return true;
            }

            int var12 = var6 + 1;
         }

         int var11 = var4 + 1;
      }

      if(var4 <= var7) {
         if(var5 <= var8) {
            if(var1.Z(var10.V(var4, var5, var6)).n().y()) {
               return true;
            }

            if(var1.Z(var10.V(var4, var5, var9)).n().y()) {
               return true;
            }

            int var15 = var5 + 1;
         }

         int var13 = var4 + 1;
      }

      if(var6 <= var9) {
         if(var5 <= var8) {
            if(var1.Z(var10.V(var4, var5, var6)).n().y()) {
               return true;
            }

            if(var1.Z(var10.V(var7, var5, var6)).n().y()) {
               return true;
            }

            int var16 = var5 + 1;
         }

         int var14 = var6 + 1;
      }

      return false;
   }

   protected int g(int var1, int var2) {
      aq var3 = this.L();
      return var1;
   }

   protected int Z(int var1) {
      return this.L() == null?var1:var1 + this.w.D;
   }

   protected int w(int var1, int var2) {
      aq var3 = this.L();
      return var2;
   }

   protected void N(net.yv.r var1, net.yw.n var2, int var3, int var4, int var5, v var6) {
      net.u.j var7 = new net.u.j(this.g(var3, var5), this.Z(var4), this.w(var3, var5));
      if(var6.Y(var7)) {
         if(this.h != ax.NONE) {
            var2 = var2.f(this.h);
         }

         if(this.C != net.yz.l.NONE) {
            var2 = var2.b(this.C);
         }

         var1.k(var7, var2, 2);
      }

   }

   protected net.yw.n r(net.yv.r var1, int var2, int var3, int var4, v var5) {
      int var6 = this.g(var2, var4);
      int var7 = this.Z(var3);
      int var8 = this.w(var2, var4);
      net.u.j var9 = new net.u.j(var6, var7, var8);
      return !var5.Y(var9)?net.nb.f.ou.p():var1.Z(var9);
   }

   protected int N(net.yv.r var1, int var2, int var3, int var4, v var5) {
      int var6 = this.g(var2, var4);
      int var7 = this.Z(var3 + 1);
      int var8 = this.w(var2, var4);
      net.u.j var9 = new net.u.j(var6, var7, var8);
      return !var5.Y(var9)?net.yv.w.SKY.defaultLightValue:var1.d(net.yv.w.SKY, var9);
   }

   protected void y(net.yv.r var1, v var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for(int var9 = var4; var9 <= var7; ++var9) {
         for(int var10 = var3; var10 <= var6; ++var10) {
            for(int var11 = var5; var11 <= var8; ++var11) {
               this.N(var1, net.nb.f.ou.p(), var10, var9, var11, var2);
            }
         }
      }

   }

   protected void E(net.yv.r var1, v var2, int var3, int var4, int var5, int var6, int var7, int var8, net.yw.n var9, net.yw.n var10, boolean var11) {
      for(int var12 = var4; var12 <= var7; ++var12) {
         for(int var13 = var3; var13 <= var6; ++var13) {
            for(int var14 = var5; var14 <= var8; ++var14) {
               if(this.r(var1, var13, var12, var14, var2).n() != net.y1.l.q) {
                  if(var12 != var4 && var12 != var7 && var13 != var3 && var13 != var6 && var14 != var5 && var14 != var8) {
                     this.N(var1, var10, var13, var12, var14, var2);
                  } else {
                     this.N(var1, var9, var13, var12, var14, var2);
                  }
               }
            }
         }
      }

   }

   protected void u(net.yv.r var1, v var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Random var10, p.s var11) {
      for(int var12 = var4; var12 <= var7; ++var12) {
         for(int var13 = var3; var13 <= var6; ++var13) {
            for(int var14 = var5; var14 <= var8; ++var14) {
               if(this.r(var1, var13, var12, var14, var2).n() != net.y1.l.q) {
                  var11.N(var10, var13, var12, var14, var12 == var4 || var12 == var7 || var13 == var3 || var13 == var6 || var14 == var5 || var14 == var8);
                  this.N(var1, var11.w(), var13, var12, var14, var2);
               }
            }
         }
      }

   }

   protected void A(net.yv.r var1, v var2, Random var3, float var4, int var5, int var6, int var7, int var8, int var9, int var10, net.yw.n var11, net.yw.n var12, boolean var13, int var14) {
      for(int var15 = var6; var15 <= var9; ++var15) {
         for(int var16 = var5; var16 <= var8; ++var16) {
            for(int var17 = var7; var17 <= var10; ++var17) {
               if(var3.nextFloat() <= var4 && this.r(var1, var16, var15, var17, var2).n() != net.y1.l.q && this.N(var1, var16, var15, var17, var2) < var14) {
                  if(var15 != var6 && var15 != var9 && var16 != var5 && var16 != var8 && var17 != var7 && var17 != var10) {
                     this.N(var1, var12, var16, var15, var17, var2);
                  } else {
                     this.N(var1, var11, var16, var15, var17, var2);
                  }
               }
            }
         }
      }

   }

   protected void e(net.yv.r var1, v var2, Random var3, float var4, int var5, int var6, int var7, net.yw.n var8) {
      if(var3.nextFloat() < var4) {
         this.N(var1, var8, var5, var6, var7, var2);
      }

   }

   protected void m(net.yv.r var1, v var2, int var3, int var4, int var5, int var6, int var7, int var8, net.yw.n var9, boolean var10) {
      float var11 = (float)(var6 - var3 + 1);
      float var12 = (float)(var7 - var4 + 1);
      float var13 = (float)(var8 - var5 + 1);
      float var14 = (float)var3 + var11 / 2.0F;
      float var15 = (float)var5 + var13 / 2.0F;

      for(int var16 = var4; var16 <= var7; ++var16) {
         float var17 = (float)(var16 - var4) / var12;

         for(int var18 = var3; var18 <= var6; ++var18) {
            float var19 = ((float)var18 - var14) / (var11 * 0.5F);

            for(int var20 = var5; var20 <= var8; ++var20) {
               float var21 = ((float)var20 - var15) / (var13 * 0.5F);
               if(this.r(var1, var18, var16, var20, var2).n() != net.y1.l.q) {
                  float var22 = var19 * var19 + var17 * var17 + var21 * var21;
                  if(var22 <= 1.05F) {
                     this.N(var1, var9, var18, var16, var20, var2);
                  }
               }
            }
         }
      }

   }

   protected void T(net.yv.r var1, int var2, int var3, int var4, v var5) {
      net.u.j var6 = new net.u.j(this.g(var2, var4), this.Z(var3), this.w(var2, var4));
      if(var5.Y(var6)) {
         while(!var1.y(var6) && var6.h() < 255) {
            var1.k(var6, net.nb.f.ou.p(), 2);
            var6 = var6.h();
         }
      }

   }

   protected void X(net.yv.r var1, net.yw.n var2, int var3, int var4, int var5, v var6) {
      int var7 = this.g(var3, var5);
      int var8 = this.Z(var4);
      int var9 = this.w(var3, var5);
      if(var6.Y(new net.u.j(var7, var8, var9))) {
         while((var1.y(new net.u.j(var7, var8, var9)) || var1.Z(new net.u.j(var7, var8, var9)).n().y()) && var8 > 1) {
            var1.k(new net.u.j(var7, var8, var9), var2, 2);
            --var8;
         }
      }

   }

   protected boolean Y(net.yv.r var1, v var2, Random var3, int var4, int var5, int var6, m_ var7) {
      net.u.j var8 = new net.u.j(this.g(var4, var6), this.Z(var5), this.w(var4, var6));
      return this.y(var1, var2, var3, var8, var7, (net.yw.n)null);
   }

   protected boolean y(net.yv.r var1, v var2, Random var3, net.u.j var4, m_ var5, @Nullable net.yw.n var6) {
      if(var2.Y(var4) && var1.Z(var4).Q() != net.nb.f.uG) {
         var6 = net.nb.f.uG.p(var1, var4, net.nb.f.uG.p());
         var1.k(var4, var6, 2);
         net.ni.v var7 = var1.L(var4);
         if(var7 instanceof net.ni.k) {
            ((net.ni.k)var7).G(var5, var3.nextLong());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean B(net.yv.r var1, v var2, Random var3, int var4, int var5, int var6, aq var7, m_ var8) {
      net.u.j var9 = new net.u.j(this.g(var4, var6), this.Z(var5), this.w(var4, var6));
      if(var2.Y(var9) && var1.Z(var9).Q() != net.nb.f.v) {
         this.N(var1, net.nb.f.v.p().s(zz.H, var7), var4, var5, var6, var2);
         net.ni.v var10 = var1.L(var9);
         if(var10 instanceof net.ni.p) {
            ((net.ni.p)var10).G(var8, var3.nextLong());
         }

         return true;
      } else {
         return false;
      }
   }

   protected void S(net.yv.r var1, v var2, Random var3, int var4, int var5, int var6, aq var7, r9 var8) {
      this.N(var1, var8.p().s(r9.D, var7), var4, var5, var6, var2);
      this.N(var1, var8.p().s(r9.D, var7).s(r9.W, r9.k.UPPER), var4, var5 + 1, var6, var2);
   }

   public void g(int var1, int var2, int var3) {
      this.w.D(var1, var2, var3);
   }

   @Nullable
   public aq L() {
      return this.Y;
   }

   public void n(@Nullable aq var1) {
      this.Y = var1;
      this.C = net.yz.l.NONE;
      this.h = ax.NONE;
   }

   public static void u(int[] var0) {
      u = var0;
   }

   public static int[] d() {
      return u;
   }

   private static xn d(xn var0) {
      return var0;
   }

   static {
      u(new int[5]);
   }

   public abstract static class s {
      protected net.yw.n R = net.nb.f.ou.p();

      public abstract void N(Random var1, int var2, int var3, int var4, boolean var5);

      public net.yw.n w() {
         return this.R;
      }
   }
}
