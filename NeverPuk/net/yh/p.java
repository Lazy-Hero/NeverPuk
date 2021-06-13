package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;

public class p extends x {
   float J;

   protected p(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 1.0F);
   }

   protected p(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.B *= 0.10000000149011612D;
      this.R *= 0.10000000149011612D;
      this.L *= 0.10000000149011612D;
      this.B += var8 * 0.4D;
      this.R += var10 * 0.4D;
      this.L += var12 * 0.4D;
      float var15 = (float)(Math.random() * 0.30000001192092896D + 0.6000000238418579D);
      this.N = var15;
      this.F = var15;
      this.V = var15;
      this.g *= 0.75F;
      this.g *= var14;
      this.J = this.g;
      this.a = (int)(6.0D / (Math.random() * 0.8D + 0.6D));
      this.a = (int)((float)this.a * var14);
      this.Y(65);
      this.f();
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.x + var3) / (float)this.a * 32.0F;
      var9 = net.u.t.T(var9, 0.0F, 1.0F);
      this.g = this.J * var9;
      super.A(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void f() {
      this.i = this.K;
      x.f();
      this.m = this.C;
      this.O = this.A;
      if(this.x++ >= this.a) {
         this.Z();
      }

      this.f(this.B, this.R, this.L);
      this.F = (float)((double)this.F * 0.96D);
      this.V = (float)((double)this.V * 0.9D);
      this.B *= 0.699999988079071D;
      this.R *= 0.699999988079071D;
      this.L *= 0.699999988079071D;
      this.R -= 0.019999999552965164D;
      if(this.T) {
         this.B *= 0.699999988079071D;
         this.L *= 0.699999988079071D;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class a implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new p(var2, var3, var5, var7, var9, var11, var13);
      }
   }

   public static class q implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         p var16 = new p(var2, var3, var5, var7, var9, var11 + 1.0D, var13, 1.0F);
         var16.u(20);
         var16.Y(67);
         return var16;
      }
   }

   public static class r implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         p var16 = new p(var2, var3, var5, var7, var9, var11, var13);
         var16.W(var16.n() * 0.3F, var16.x() * 0.8F, var16.T());
         var16.R();
         return var16;
      }
   }
}
