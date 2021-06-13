package net;

import java.io.Serializable;
import net._0;
import net._l;
import net.i1;
import net.ra;
import net.xn;

public class i2 extends i1 implements Serializable {
   static final long serialVersionUID = 8572646365302599857L;

   public i2(double var1, double var3) {
      super(var1, var3);
   }

   public i2(double[] var1) {
      super(var1);
   }

   public i2(i2 var1) {
      super((i1)var1);
   }

   public i2(_l var1) {
      super((_0)var1);
   }

   public i2(i1 var1) {
      super(var1);
   }

   public i2(_0 var1) {
      super(var1);
   }

   public i2() {
   }

   public final double N(i2 var1) {
      return this.c * var1.c + this.f * var1.f;
   }

   public final double S() {
      return Math.sqrt(this.c * this.c + this.f * this.f);
   }

   public final double m() {
      return this.c * this.c + this.f * this.f;
   }

   public final void p(i2 var1) {
      double var2 = 1.0D / Math.sqrt(var1.c * var1.c + var1.f * var1.f);
      this.c = var1.c * var2;
      this.f = var1.f * var2;
   }

   public final void j() {
      double var1 = 1.0D / Math.sqrt(this.c * this.c + this.f * this.f);
      this.c *= var1;
      this.f *= var1;
   }

   public final double J(i2 var1) {
      ra.C();
      double var3 = this.N(var1) / (this.S() * var1.S());
      if(Double.compare(var3, -1.0D) < 0) {
         var3 = -1.0D;
      }

      if(var3 > 1.0D) {
         var3 = 1.0D;
      }

      return Math.acos(var3);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
