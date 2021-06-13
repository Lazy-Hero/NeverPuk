package net;

import net.od;

public class zj extends od {
   private float V;
   private float F;
   private float e;
   private float s;

   public zj(float var1, float var2, float var3, float var4) {
      this.V = var1;
      this.F = var2;
      this.e = var3;
      this.s = var4;
   }

   public float U() {
      return this.F;
   }

   public void m(float var1) {
      this.F = var1;
   }

   public float b() {
      return this.e;
   }

   public void M(float var1) {
      this.e = var1;
   }

   public float g() {
      return this.s;
   }

   public void k(float var1) {
      this.s = var1;
   }

   public float f() {
      return this.V;
   }

   public void y(float var1) {
      this.V = var1;
   }
}
