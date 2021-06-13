package net;

import java.io.Serializable;
import net.go;
import net.ul;
import net.x5;
import net.x_;

public class gl extends go implements Serializable {
   static final long serialVersionUID = 5718062286069042927L;

   public gl(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   public gl(double[] var1) {
      super(var1);
   }

   public gl(gl var1) {
      super((go)var1);
   }

   public gl(x5 var1) {
      super((x_)var1);
   }

   public gl(x_ var1) {
      super(var1);
   }

   public gl(go var1) {
      super(var1);
   }

   public gl() {
   }

   public final double a(gl var1) {
      double var2 = this.n - var1.n;
      double var4 = this.Z - var1.Z;
      double var6 = this.B - var1.B;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public final double o(gl var1) {
      double var2 = this.n - var1.n;
      double var4 = this.Z - var1.Z;
      double var6 = this.B - var1.B;
      return Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public final double M(gl var1) {
      return Math.abs(this.n - var1.n) + Math.abs(this.Z - var1.Z) + Math.abs(this.B - var1.B);
   }

   public final double w(gl var1) {
      double var2 = Math.max(Math.abs(this.n - var1.n), Math.abs(this.Z - var1.Z));
      return Math.max(var2, Math.abs(this.B - var1.B));
   }

   public final void U(ul var1) {
      double var2 = 1.0D / var1.d;
      this.n = var1.M * var2;
      this.Z = var1.b * var2;
      this.B = var1.G * var2;
   }
}
