package net;

import java.io.Serializable;
import net._0;
import net.i1;
import net.i2;
import net.ra;
import net.xn;

public class _l extends _0 implements Serializable {
   static final long serialVersionUID = -2168194326883512320L;

   public _l(float var1, float var2) {
      super(var1, var2);
   }

   public _l(float[] var1) {
      super(var1);
   }

   public _l(_l var1) {
      super((_0)var1);
   }

   public _l(i2 var1) {
      super((i1)var1);
   }

   public _l(_0 var1) {
      super(var1);
   }

   public _l(i1 var1) {
      super(var1);
   }

   public _l() {
   }

   public final float j(_l var1) {
      return this.t * var1.t + this.J * var1.J;
   }

   public final float P() {
      return (float)Math.sqrt((double)(this.t * this.t + this.J * this.J));
   }

   public final float o() {
      return this.t * this.t + this.J * this.J;
   }

   public final void H(_l var1) {
      float var2 = (float)(1.0D / Math.sqrt((double)(var1.t * var1.t + var1.J * var1.J)));
      this.t = var1.t * var2;
      this.J = var1.J * var2;
   }

   public final void u() {
      float var1 = (float)(1.0D / Math.sqrt((double)(this.t * this.t + this.J * this.J)));
      this.t *= var1;
      this.J *= var1;
   }

   public final float Y(_l var1) {
      ra.C();
      double var3 = (double)(this.j(var1) / (this.P() * var1.P()));
      if(Double.compare(var3, -1.0D) < 0) {
         var3 = -1.0D;
      }

      if(var3 > 1.0D) {
         var3 = 1.0D;
      }

      return (float)Math.acos(var3);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
