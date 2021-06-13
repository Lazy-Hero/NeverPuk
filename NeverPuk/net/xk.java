package net;

import net.mw;
import net.xn;
import net.nn.j;
import net.u.d;

public class xk {
   private double C;
   private double B;

   public xk(float var1, float var2) {
      this.C = (double)var1;
      this.B = (double)var2;
   }

   public void q(double var1, double var3, double var5) {
      this.C = mw.g(var1, this.C, var5);
      this.B = mw.g(var3, this.B, var5);
   }

   public void i(double var1, double var3, double var5) {
      this.C = (double)mw.k((float)var1, (float)this.C, (long)var5, (double)((float)var5));
      this.B = (double)mw.k((float)var3, (float)this.B, (long)var5, (double)((float)var5));
   }

   public void S(float var1, float var2, float var3, float var4) {
      mw.X();
      int var6 = (int)(Math.abs((double)var1 - this.C) * (double)var3);
      int var7 = (int)(Math.abs((double)var2 - this.B) * (double)var4);
      this.C = (double)mw.k(var1, (float)this.C, (long)j.Y, (double)var6);
      this.B = (double)mw.k(var2, (float)this.B, (long)j.Y, (double)var7);
      d.h(new d[4]);
   }

   public double T() {
      return this.C;
   }

   public void Z(double var1) {
      this.C = var1;
   }

   public double p() {
      return this.B;
   }

   public void t(double var1) {
      this.B = var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
