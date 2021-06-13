package net;

import java.io.Serializable;
import net._0;
import net._k;
import net.i1;

public class i4 extends i1 implements Serializable {
   static final long serialVersionUID = 1133748791492571954L;

   public i4(double var1, double var3) {
      super(var1, var3);
   }

   public i4(double[] var1) {
      super(var1);
   }

   public i4(i4 var1) {
      super((i1)var1);
   }

   public i4(_k var1) {
      super((_0)var1);
   }

   public i4(i1 var1) {
      super(var1);
   }

   public i4(_0 var1) {
      super(var1);
   }

   public i4() {
   }

   public final double g(i4 var1) {
      double var2 = this.c - var1.c;
      double var4 = this.f - var1.f;
      return var2 * var2 + var4 * var4;
   }

   public final double v(i4 var1) {
      double var2 = this.c - var1.c;
      double var4 = this.f - var1.f;
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   public final double e(i4 var1) {
      return Math.abs(this.c - var1.c) + Math.abs(this.f - var1.f);
   }

   public final double c(i4 var1) {
      return Math.max(Math.abs(this.c - var1.c), Math.abs(this.f - var1.f));
   }
}
