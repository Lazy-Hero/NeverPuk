package net.yh;

import net.xn;
import net.yh.x;

public class ca extends x {
   private final int n;
   private final int d;
   private final float D;
   private float q = 0.91F;
   private float j;
   private float I;
   private float P;
   private boolean J;

   public ca(net.yv.r var1, double var2, double var4, double var6, int var8, int var9, float var10) {
      super(var1, var2, var4, var6);
      this.n = var8;
      this.d = var9;
      this.D = var10;
   }

   public void o(int var1) {
      float var2 = (float)((var1 & 16711680) >> 16) / 255.0F;
      float var3 = (float)((var1 & '\uff00') >> 8) / 255.0F;
      float var4 = (float)((var1 & 255) >> 0) / 255.0F;
      float var10000 = 1.0F;
      this.W(var2 * 1.0F, var3 * 1.0F, var4 * 1.0F);
   }

   public void M(int var1) {
      this.j = (float)((var1 & 16711680) >> 16) / 255.0F;
      this.I = (float)((var1 & '\uff00') >> 8) / 255.0F;
      this.P = (float)((var1 & 255) >> 0) / 255.0F;
      this.J = true;
   }

   public boolean u() {
      return true;
   }

   public void f() {
      x.f();
      this.i = this.K;
      this.m = this.C;
      this.O = this.A;
      if(this.x++ >= this.a) {
         this.Z();
      }

      if(this.x > this.a / 2) {
         this.n(1.0F - ((float)this.x - (float)(this.a / 2)) / (float)this.a);
         if(this.J) {
            this.N += (this.j - this.N) * 0.2F;
            this.F += (this.I - this.F) * 0.2F;
            this.V += (this.P - this.V) * 0.2F;
         }
      }

      this.Y(this.n + (this.d - 1 - this.x * this.d / this.a));
      this.R += (double)this.D;
      this.f(this.B, this.R, this.L);
      this.B *= (double)this.q;
      this.R *= (double)this.q;
      this.L *= (double)this.q;
      if(this.T) {
         this.B *= 0.699999988079071D;
         this.L *= 0.699999988079071D;
      }

   }

   public int g(float var1) {
      return 15728880;
   }

   protected void H(float var1) {
      this.q = var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
