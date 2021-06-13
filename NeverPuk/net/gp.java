package net;

import java.io.Serializable;
import net.go;
import net.pv;
import net.ra;
import net.x_;
import net.xn;

public class gp extends go implements Serializable {
   static final long serialVersionUID = 3761969948420550442L;

   public gp(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   public gp(double[] var1) {
      super(var1);
   }

   public gp(gp var1) {
      super((go)var1);
   }

   public gp(pv var1) {
      super((x_)var1);
   }

   public gp(x_ var1) {
      super(var1);
   }

   public gp(go var1) {
      super(var1);
   }

   public gp() {
   }

   public final void K(gp var1, gp var2) {
      double var3 = var1.Z * var2.B - var1.B * var2.Z;
      double var5 = var2.n * var1.B - var2.B * var1.n;
      this.B = var1.n * var2.Z - var1.Z * var2.n;
      this.n = var3;
      this.Z = var5;
   }

   public final void H(gp var1) {
      double var2 = 1.0D / Math.sqrt(var1.n * var1.n + var1.Z * var1.Z + var1.B * var1.B);
      this.n = var1.n * var2;
      this.Z = var1.Z * var2;
      this.B = var1.B * var2;
   }

   public final void A() {
      double var1 = 1.0D / Math.sqrt(this.n * this.n + this.Z * this.Z + this.B * this.B);
      this.n *= var1;
      this.Z *= var1;
      this.B *= var1;
   }

   public final double x(gp var1) {
      return this.n * var1.n + this.Z * var1.Z + this.B * var1.B;
   }

   public final double R() {
      return this.n * this.n + this.Z * this.Z + this.B * this.B;
   }

   public final double d() {
      return Math.sqrt(this.n * this.n + this.Z * this.Z + this.B * this.B);
   }

   public final double y(gp var1) {
      ra.C();
      double var3 = this.x(var1) / (this.d() * var1.d());
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
