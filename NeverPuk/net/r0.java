package net;

import java.io.Serializable;
import net.ra;
import net.ul;
import net.uo;
import net.x_;

public class r0 extends ra implements Serializable {
   static final long serialVersionUID = 4643134103185764459L;

   public r0(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public r0(float[] var1) {
      super(var1);
   }

   public r0(r0 var1) {
      super((ra)var1);
   }

   public r0(ul var1) {
      super((uo)var1);
   }

   public r0(ra var1) {
      super(var1);
   }

   public r0(uo var1) {
      super(var1);
   }

   public r0(x_ var1) {
      super(var1.q, var1.Q, var1.G, 1.0F);
   }

   public r0() {
   }

   public final void i(x_ var1) {
      this.j = var1.q;
      this.v = var1.Q;
      this.M = var1.G;
      this.U = 1.0F;
   }

   public final float X(r0 var1) {
      float var2 = this.j - var1.j;
      float var3 = this.v - var1.v;
      float var4 = this.M - var1.M;
      float var5 = this.U - var1.U;
      return var2 * var2 + var3 * var3 + var4 * var4 + var5 * var5;
   }

   public final float e(r0 var1) {
      float var2 = this.j - var1.j;
      float var3 = this.v - var1.v;
      float var4 = this.M - var1.M;
      float var5 = this.U - var1.U;
      return (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4 + var5 * var5));
   }

   public final float P(r0 var1) {
      return Math.abs(this.j - var1.j) + Math.abs(this.v - var1.v) + Math.abs(this.M - var1.M) + Math.abs(this.U - var1.U);
   }

   public final float v(r0 var1) {
      float var2 = Math.max(Math.abs(this.j - var1.j), Math.abs(this.v - var1.v));
      float var3 = Math.max(Math.abs(this.M - var1.M), Math.abs(this.U - var1.U));
      return Math.max(var2, var3);
   }

   public final void q(r0 var1) {
      float var2 = 1.0F / var1.U;
      this.j = var1.j * var2;
      this.v = var1.v * var2;
      this.M = var1.M * var2;
      this.U = 1.0F;
   }
}
