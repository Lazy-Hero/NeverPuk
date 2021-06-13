package net;

import java.io.Serializable;
import net.go;
import net.r0;
import net.ra;
import net.uo;

public class ul extends uo implements Serializable {
   static final long serialVersionUID = 1733471895962736949L;

   public ul(double var1, double var3, double var5, double var7) {
      super(var1, var3, var5, var7);
   }

   public ul(double[] var1) {
      super(var1);
   }

   public ul(ul var1) {
      super((uo)var1);
   }

   public ul(r0 var1) {
      super((ra)var1);
   }

   public ul(ra var1) {
      super(var1);
   }

   public ul(uo var1) {
      super(var1);
   }

   public ul(go var1) {
      super(var1.n, var1.Z, var1.B, 1.0D);
   }

   public ul() {
   }

   public final void q(go var1) {
      this.M = var1.n;
      this.b = var1.Z;
      this.G = var1.B;
      this.d = 1.0D;
   }

   public final double s(ul var1) {
      double var2 = this.M - var1.M;
      double var4 = this.b - var1.b;
      double var6 = this.G - var1.G;
      double var8 = this.d - var1.d;
      return var2 * var2 + var4 * var4 + var6 * var6 + var8 * var8;
   }

   public final double b(ul var1) {
      double var2 = this.M - var1.M;
      double var4 = this.b - var1.b;
      double var6 = this.G - var1.G;
      double var8 = this.d - var1.d;
      return Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6 + var8 * var8);
   }

   public final double R(ul var1) {
      return Math.abs(this.M - var1.M) + Math.abs(this.b - var1.b) + Math.abs(this.G - var1.G) + Math.abs(this.d - var1.d);
   }

   public final double f(ul var1) {
      double var2 = Math.max(Math.abs(this.M - var1.M), Math.abs(this.b - var1.b));
      double var4 = Math.max(Math.abs(this.G - var1.G), Math.abs(this.d - var1.d));
      return Math.max(var2, var4);
   }

   public final void i(ul var1) {
      double var2 = 1.0D / var1.d;
      this.M = var1.M * var2;
      this.b = var1.b * var2;
      this.G = var1.G * var2;
      this.d = 1.0D;
   }
}
