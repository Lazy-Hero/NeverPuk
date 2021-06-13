package net;

import java.io.Serializable;
import net.go;
import net.gp;
import net.ra;
import net.x_;
import net.xn;

public class pv extends x_ implements Serializable {
   static final long serialVersionUID = -7031930069184524614L;

   public pv(float var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public pv(float[] var1) {
      super(var1);
   }

   public pv(pv var1) {
      super((x_)var1);
   }

   public pv(gp var1) {
      super((go)var1);
   }

   public pv(x_ var1) {
      super(var1);
   }

   public pv(go var1) {
      super(var1);
   }

   public pv() {
   }

   public final float D() {
      return this.q * this.q + this.Q * this.Q + this.G * this.G;
   }

   public final float a() {
      return (float)Math.sqrt((double)(this.q * this.q + this.Q * this.Q + this.G * this.G));
   }

   public final void Q(pv var1, pv var2) {
      float var3 = var1.Q * var2.G - var1.G * var2.Q;
      float var4 = var2.q * var1.G - var2.G * var1.q;
      this.G = var1.q * var2.Q - var1.Q * var2.q;
      this.q = var3;
      this.Q = var4;
   }

   public final float e(pv var1) {
      return this.q * var1.q + this.Q * var1.Q + this.G * var1.G;
   }

   public final void B(pv var1) {
      float var2 = (float)(1.0D / Math.sqrt((double)(var1.q * var1.q + var1.Q * var1.Q + var1.G * var1.G)));
      this.q = var1.q * var2;
      this.Q = var1.Q * var2;
      this.G = var1.G * var2;
   }

   public final void V() {
      float var1 = (float)(1.0D / Math.sqrt((double)(this.q * this.q + this.Q * this.Q + this.G * this.G)));
      this.q *= var1;
      this.Q *= var1;
      this.G *= var1;
   }

   public final float J(pv var1) {
      ra.C();
      double var3 = (double)(this.e(var1) / (this.a() * var1.a()));
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
