package net;

import java.io.Serializable;
import net._0;
import net.i1;
import net.i4;

public class _k extends _0 implements Serializable {
   static final long serialVersionUID = -4801347926528714435L;

   public _k(float var1, float var2) {
      super(var1, var2);
   }

   public _k(float[] var1) {
      super(var1);
   }

   public _k(_k var1) {
      super((_0)var1);
   }

   public _k(i4 var1) {
      super((i1)var1);
   }

   public _k(i1 var1) {
      super(var1);
   }

   public _k(_0 var1) {
      super(var1);
   }

   public _k() {
   }

   public final float o(_k var1) {
      float var2 = this.t - var1.t;
      float var3 = this.J - var1.J;
      return var2 * var2 + var3 * var3;
   }

   public final float m(_k var1) {
      float var2 = this.t - var1.t;
      float var3 = this.J - var1.J;
      return (float)Math.sqrt((double)(var2 * var2 + var3 * var3));
   }

   public final float g(_k var1) {
      return Math.abs(this.t - var1.t) + Math.abs(this.J - var1.J);
   }

   public final float x(_k var1) {
      return Math.max(Math.abs(this.t - var1.t), Math.abs(this.J - var1.J));
   }
}
