package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;

public class q extends x {
   private final float o;
   private boolean f;

   protected q(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.B = var8;
      this.R = var10;
      this.L = var12;
      this.N = net.u.t.M(this.k, 0.7176471F, 0.8745098F);
      this.F = net.u.t.M(this.k, 0.0F, 0.0F);
      this.V = net.u.t.M(this.k, 0.8235294F, 0.9764706F);
      this.g *= 0.75F;
      this.o = this.g;
      this.a = (int)(20.0D / ((double)this.k.nextFloat() * 0.8D + 0.2D));
      this.f = false;
   }

   public void f() {
      this.i = this.K;
      x.f();
      this.m = this.C;
      this.O = this.A;
      if(this.x++ >= this.a) {
         this.Z();
      }

      this.Y(3 * this.x / this.a + 5);
      if(this.T) {
         this.R = 0.0D;
         this.f = true;
      }

      if(this.f) {
         this.R += 0.002D;
      }

      this.f(this.B, this.R, this.L);
      if(Double.compare(this.C, this.m) == 0) {
         this.B *= 1.1D;
         this.L *= 1.1D;
      }

      this.B *= 0.9599999785423279D;
      this.L *= 0.9599999785423279D;
      if(this.f) {
         this.R *= 0.9599999785423279D;
      }

   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.g = this.o * net.u.t.T(((float)this.x + var3) / (float)this.a * 32.0F, 0.0F, 1.0F);
      super.A(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class t implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new q(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
