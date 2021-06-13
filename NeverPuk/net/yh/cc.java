package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;

public class cc extends x {
   float b;

   private cc(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 1.0F);
   }

   protected cc(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.B *= 0.10000000149011612D;
      this.R *= 0.10000000149011612D;
      this.L *= 0.10000000149011612D;
      this.B += var8;
      this.R += var10;
      this.L += var12;
      float var15 = (float)(Math.random() * 0.30000001192092896D);
      this.N = var15;
      this.F = var15;
      this.V = var15;
      this.g *= 0.75F;
      this.g *= var14;
      this.b = this.g;
      this.a = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
      this.a = (int)((float)this.a * var14);
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.x + var3) / (float)this.a * 32.0F;
      var9 = net.u.t.T(var9, 0.0F, 1.0F);
      this.g = this.b * var9;
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

      this.Y(7 - this.x * 8 / this.a);
      this.R += 0.004D;
      this.f(this.B, this.R, this.L);
      if(Double.compare(this.C, this.m) == 0) {
         this.B *= 1.1D;
         this.L *= 1.1D;
      }

      this.B *= 0.9599999785423279D;
      this.R *= 0.9599999785423279D;
      this.L *= 0.9599999785423279D;
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
         return new cc(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
