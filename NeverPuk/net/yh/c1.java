package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;

public class c1 extends x {
   float q;

   protected c1(net.yv.r var1, double var2, double var4, double var6, float var8, float var9, float var10) {
      this(var1, var2, var4, var6, 1.0F, var8, var9, var10);
   }

   protected c1(net.yv.r var1, double var2, double var4, double var6, float var8, float var9, float var10, float var11) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      x.f();
      this.B *= 0.10000000149011612D;
      this.R *= 0.10000000149011612D;
      this.L *= 0.10000000149011612D;
      if(var9 == 0.0F) {
         var9 = 1.0F;
      }

      float var13 = (float)Math.random() * 0.4F + 0.6F;
      this.N = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * var9 * var13;
      this.F = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * var10 * var13;
      this.V = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * var11 * var13;
      this.g *= 0.75F;
      this.g *= var8;
      this.q = this.g;
      this.a = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
      this.a = (int)((float)this.a * var8);
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.x + var3) / (float)this.a * 32.0F;
      var9 = net.u.t.T(var9, 0.0F, 1.0F);
      this.g = this.q * var9;
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

      this.Y(7 - this.x * 8 / this.a);
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
         return new c1(var2, var3, var5, var7, (float)var9, (float)var11, (float)var13);
      }
   }
}
