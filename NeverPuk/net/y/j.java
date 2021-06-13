package net.y;

import org.lwjgl.util.vector.Matrix4f;

public class j extends Matrix4f {
   public j(float[] var1) {
      this.m00 = var1[0];
      this.m01 = var1[1];
      this.m02 = var1[2];
      this.m03 = var1[3];
      this.m10 = var1[4];
      this.m11 = var1[5];
      this.m12 = var1[6];
      this.m13 = var1[7];
      this.m20 = var1[8];
      this.m21 = var1[9];
      this.m22 = var1[10];
      this.m23 = var1[11];
      this.m30 = var1[12];
      this.m31 = var1[13];
      this.m32 = var1[14];
      this.m33 = var1[15];
   }

   public j() {
      this.m00 = 0.0F;
      this.m01 = 0.0F;
      this.m02 = 0.0F;
      this.m03 = 0.0F;
      this.m10 = 0.0F;
      this.m11 = 0.0F;
      this.m12 = 0.0F;
      this.m13 = 0.0F;
      this.m20 = 0.0F;
      this.m21 = 0.0F;
      this.m22 = 0.0F;
      this.m23 = 0.0F;
      this.m30 = 0.0F;
      this.m31 = 0.0F;
      this.m32 = 0.0F;
      this.m33 = 0.0F;
   }
}
