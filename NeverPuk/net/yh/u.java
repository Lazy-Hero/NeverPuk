package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;
import net.yz.ai;

public class u extends x {
   private final float d;

   protected u(net.yv.r var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.B *= 0.800000011920929D;
      this.R *= 0.800000011920929D;
      this.L *= 0.800000011920929D;
      this.R = (double)(this.k.nextFloat() * 0.4F + 0.05F);
      this.N = 1.0F;
      this.F = 1.0F;
      this.V = 1.0F;
      this.g *= this.k.nextFloat() * 2.0F + 0.2F;
      this.d = this.g;
      this.a = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
      this.Y(49);
   }

   public int g(float var1) {
      int var2 = super.g(var1);
      boolean var10000 = true;
      int var4 = var2 >> 16 & 255;
      return 240 | var4 << 16;
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.x + var3) / (float)this.a;
      this.g = this.d * (1.0F - var9 * var9);
      super.A(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void f() {
      x.f();
      this.i = this.K;
      this.m = this.C;
      this.O = this.A;
      if(this.x++ >= this.a) {
         this.Z();
      }

      float var2 = (float)this.x / (float)this.a;
      if(Float.compare(this.k.nextFloat(), var2) > 0) {
         this.e.n(ai.SMOKE_NORMAL, this.K, this.C, this.A, this.B, this.R, this.L, new int[0]);
      }

      this.R -= 0.03D;
      this.f(this.B, this.R, this.L);
      this.B *= 0.9990000128746033D;
      this.R *= 0.9990000128746033D;
      this.L *= 0.9990000128746033D;
      if(this.T) {
         this.B *= 0.699999988079071D;
         this.L *= 0.699999988079071D;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class c implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new u(var2, var3, var5, var7);
      }
   }
}
