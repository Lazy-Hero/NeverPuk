package net;

import java.io.Serializable;
import net.gl;
import net.go;
import net.r0;
import net.x_;

public class x5 extends x_ implements Serializable {
   static final long serialVersionUID = -8689337816398030143L;

   public x5(float var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public x5(float[] var1) {
      super(var1);
   }

   public x5(x5 var1) {
      super((x_)var1);
   }

   public x5(gl var1) {
      super((go)var1);
   }

   public x5(x_ var1) {
      super(var1);
   }

   public x5(go var1) {
      super(var1);
   }

   public x5() {
   }

   public final float O(x5 var1) {
      float var2 = this.q - var1.q;
      float var3 = this.Q - var1.Q;
      float var4 = this.G - var1.G;
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public final float a(x5 var1) {
      float var2 = this.q - var1.q;
      float var3 = this.Q - var1.Q;
      float var4 = this.G - var1.G;
      return (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
   }

   public final float z(x5 var1) {
      return Math.abs(this.q - var1.q) + Math.abs(this.Q - var1.Q) + Math.abs(this.G - var1.G);
   }

   public final float J(x5 var1) {
      float var2 = Math.max(Math.abs(this.q - var1.q), Math.abs(this.Q - var1.Q));
      return Math.max(var2, Math.abs(this.G - var1.G));
   }

   public final void j(r0 var1) {
      float var2 = 1.0F / var1.U;
      this.q = var1.j * var2;
      this.Q = var1.v * var2;
      this.G = var1.M * var2;
   }
}
