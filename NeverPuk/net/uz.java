package net;

import java.io.Serializable;
import net.go;
import net.ra;
import net.rl;
import net.uo;
import net.xn;

public class uz extends uo implements Serializable {
   static final long serialVersionUID = 3938123424117448700L;

   public uz(double var1, double var3, double var5, double var7) {
      super(var1, var3, var5, var7);
   }

   public uz(double[] var1) {
      super(var1);
   }

   public uz(uz var1) {
      super((uo)var1);
   }

   public uz(rl var1) {
      super((ra)var1);
   }

   public uz(ra var1) {
      super(var1);
   }

   public uz(uo var1) {
      super(var1);
   }

   public uz(go var1) {
      super(var1.n, var1.Z, var1.B, 0.0D);
   }

   public uz() {
   }

   public final void m(go var1) {
      this.M = var1.n;
      this.b = var1.Z;
      this.G = var1.B;
      this.d = 0.0D;
   }

   public final double C() {
      return Math.sqrt(this.M * this.M + this.b * this.b + this.G * this.G + this.d * this.d);
   }

   public final double M() {
      return this.M * this.M + this.b * this.b + this.G * this.G + this.d * this.d;
   }

   public final double a(uz var1) {
      return this.M * var1.M + this.b * var1.b + this.G * var1.G + this.d * var1.d;
   }

   public final void q(uz var1) {
      double var2 = 1.0D / Math.sqrt(var1.M * var1.M + var1.b * var1.b + var1.G * var1.G + var1.d * var1.d);
      this.M = var1.M * var2;
      this.b = var1.b * var2;
      this.G = var1.G * var2;
      this.d = var1.d * var2;
   }

   public final void M() {
      double var1 = 1.0D / Math.sqrt(this.M * this.M + this.b * this.b + this.G * this.G + this.d * this.d);
      this.M *= var1;
      this.b *= var1;
      this.G *= var1;
      this.d *= var1;
   }

   public final double Z(uz var1) {
      ra.C();
      double var3 = this.a(var1) / (this.C() * var1.C());
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
