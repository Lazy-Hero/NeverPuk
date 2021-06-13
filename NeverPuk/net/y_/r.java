package net.y_;

import net.xn;
import net.y_.b;

public class r {
   private final net.ne.y R;
   private float y;
   private float d;
   private boolean z;
   private double Y;
   private double w;
   private double j;

   public r(net.ne.y var1) {
      this.R = var1;
   }

   public void n(net.ne.l var1, float var2, float var3) {
      this.Y = var1.b;
      if(var1 instanceof net.ne.a) {
         this.w = var1.hS + (double)var1.A();
      } else {
         this.w = (var1.i().u + var1.i().c) / 2.0D;
      }

      this.j = var1.hr;
      this.y = var2;
      this.d = var3;
      this.z = true;
   }

   public void u(double var1, double var3, double var5, float var7, float var8) {
      this.Y = var1;
      this.w = var3;
      this.j = var5;
      this.y = var7;
      this.d = var8;
      this.z = true;
   }

   public void p() {
      b.q();
      this.R.V = 0.0F;
      if(this.z) {
         this.z = false;
         double var2 = this.Y - this.R.b;
         double var4 = this.w - (this.R.hS + (double)this.R.A());
         double var6 = this.j - this.R.hr;
         double var8 = (double)net.u.t.R(var2 * var2 + var6 * var6);
         float var10 = (float)(net.u.t.V(var6, var2) * 57.29577951308232D) - 90.0F;
         float var11 = (float)(-(net.u.t.V(var4, var8) * 57.29577951308232D));
         this.R.V = this.p(this.R.V, var11, this.d);
         this.R.A3 = this.p(this.R.A3, var10, this.y);
      }

      this.R.A3 = this.p(this.R.A3, this.R.AK, 10.0F);
      float var12 = net.u.t.k(this.R.A3 - this.R.AK);
      if(!this.R.H().q()) {
         if(var12 < -75.0F) {
            this.R.A3 = this.R.AK - 75.0F;
         }

         if(var12 > 75.0F) {
            this.R.A3 = this.R.AK + 75.0F;
         }
      }

   }

   private float p(float var1, float var2, float var3) {
      float var4 = net.u.t.k(var2 - var1);
      if(var4 > var3) {
         var4 = var3;
      }

      if(var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public boolean A() {
      return this.z;
   }

   public double v() {
      return this.Y;
   }

   public double B() {
      return this.w;
   }

   public double k() {
      return this.j;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
