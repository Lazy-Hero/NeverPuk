package net;

import net.in;

public class ga implements in {
   public float o;
   public float j;

   public ga(float var1, float var2) {
      this.o = var1;
      this.j = var2;
   }

   public static float x(float var0) {
      return X(var0) * a();
   }

   public static float a() {
      return (float)((double)r() * 0.15D);
   }

   public static float r() {
      float var0;
      return (var0 = (float)((double)E.T.tM * 0.6D + 0.2D)) * var0 * var0 * 8.0F;
   }

   public static float X(float var0) {
      return (float)Math.round(var0 / a());
   }

   public float z() {
      return this.o;
   }

   public void z(float var1) {
      this.o = var1;
   }

   public float j() {
      return this.j;
   }

   public void n(float var1) {
      this.j = var1;
   }
}
