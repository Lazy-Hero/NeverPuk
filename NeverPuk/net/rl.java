package net;

import java.io.Serializable;
import net.ra;
import net.uo;
import net.uz;
import net.x_;
import net.xn;

public class rl extends ra implements Serializable {
   static final long serialVersionUID = 8749319902347760659L;

   public rl(float var1, float var2, float var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public rl(float[] var1) {
      super(var1);
   }

   public rl(rl var1) {
      super((ra)var1);
   }

   public rl(uz var1) {
      super((uo)var1);
   }

   public rl(ra var1) {
      super(var1);
   }

   public rl(uo var1) {
      super(var1);
   }

   public rl(x_ var1) {
      super(var1.q, var1.Q, var1.G, 0.0F);
   }

   public rl() {
   }

   public final void Z(x_ var1) {
      this.j = var1.q;
      this.v = var1.Q;
      this.M = var1.G;
      this.U = 0.0F;
   }

   public final float d() {
      return (float)Math.sqrt((double)(this.j * this.j + this.v * this.v + this.M * this.M + this.U * this.U));
   }

   public final float G() {
      return this.j * this.j + this.v * this.v + this.M * this.M + this.U * this.U;
   }

   public final float f(rl var1) {
      return this.j * var1.j + this.v * var1.v + this.M * var1.M + this.U * var1.U;
   }

   public final void x(rl var1) {
      float var2 = (float)(1.0D / Math.sqrt((double)(var1.j * var1.j + var1.v * var1.v + var1.M * var1.M + var1.U * var1.U)));
      this.j = var1.j * var2;
      this.v = var1.v * var2;
      this.M = var1.M * var2;
      this.U = var1.U * var2;
   }

   public final void W() {
      float var1 = (float)(1.0D / Math.sqrt((double)(this.j * this.j + this.v * this.v + this.M * this.M + this.U * this.U)));
      this.j *= var1;
      this.v *= var1;
      this.M *= var1;
      this.U *= var1;
   }

   public final float t(rl var1) {
      ra.C();
      double var3 = (double)(this.f(var1) / (this.d() * var1.d()));
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
