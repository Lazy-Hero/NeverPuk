package net;

import java.nio.FloatBuffer;
import java.util.Arrays;
import net.uv;
import net.xn;
import net.u.d;

public class df {
   static void L(float[] var0, float[] var1, float[] var2) {
      byte var3 = 0;
      int var4 = 0;

      while(true) {
         var0[4 * var3 + var4] = var1[4 * var3 + 0] * var2[0 + var4] + var1[4 * var3 + 1] * var2[4 + var4] + var1[4 * var3 + 2] * var2[8 + var4] + var1[4 * var3 + 3] * var2[12 + var4];
         ++var4;
      }
   }

   static void p(float[] var0, float[] var1, float[] var2) {
      var0[0] = var1[0] * var2[0] + var1[4] * var2[1] + var1[8] * var2[2] + var1[12] * var2[3];
      var0[1] = var1[1] * var2[0] + var1[5] * var2[1] + var1[9] * var2[2] + var1[13] * var2[3];
      var0[2] = var1[2] * var2[0] + var1[6] * var2[1] + var1[10] * var2[2] + var1[14] * var2[3];
      var0[3] = var1[3] * var2[0] + var1[7] * var2[1] + var1[11] * var2[2] + var1[15] * var2[3];
   }

   static void a(float[] var0, float[] var1) {
      var0[0] = var1[5] * var1[10] * var1[15] - var1[5] * var1[11] * var1[14] - var1[9] * var1[6] * var1[15] + var1[9] * var1[7] * var1[14] + var1[13] * var1[6] * var1[11] - var1[13] * var1[7] * var1[10];
      var0[1] = -var1[1] * var1[10] * var1[15] + var1[1] * var1[11] * var1[14] + var1[9] * var1[2] * var1[15] - var1[9] * var1[3] * var1[14] - var1[13] * var1[2] * var1[11] + var1[13] * var1[3] * var1[10];
      var0[2] = var1[1] * var1[6] * var1[15] - var1[1] * var1[7] * var1[14] - var1[5] * var1[2] * var1[15] + var1[5] * var1[3] * var1[14] + var1[13] * var1[2] * var1[7] - var1[13] * var1[3] * var1[6];
      uv.l();
      var0[3] = -var1[1] * var1[6] * var1[11] + var1[1] * var1[7] * var1[10] + var1[5] * var1[2] * var1[11] - var1[5] * var1[3] * var1[10] - var1[9] * var1[2] * var1[7] + var1[9] * var1[3] * var1[6];
      var0[4] = -var1[4] * var1[10] * var1[15] + var1[4] * var1[11] * var1[14] + var1[8] * var1[6] * var1[15] - var1[8] * var1[7] * var1[14] - var1[12] * var1[6] * var1[11] + var1[12] * var1[7] * var1[10];
      var0[5] = var1[0] * var1[10] * var1[15] - var1[0] * var1[11] * var1[14] - var1[8] * var1[2] * var1[15] + var1[8] * var1[3] * var1[14] + var1[12] * var1[2] * var1[11] - var1[12] * var1[3] * var1[10];
      var0[6] = -var1[0] * var1[6] * var1[15] + var1[0] * var1[7] * var1[14] + var1[4] * var1[2] * var1[15] - var1[4] * var1[3] * var1[14] - var1[12] * var1[2] * var1[7] + var1[12] * var1[3] * var1[6];
      var0[7] = var1[0] * var1[6] * var1[11] - var1[0] * var1[7] * var1[10] - var1[4] * var1[2] * var1[11] + var1[4] * var1[3] * var1[10] + var1[8] * var1[2] * var1[7] - var1[8] * var1[3] * var1[6];
      var0[8] = var1[4] * var1[9] * var1[15] - var1[4] * var1[11] * var1[13] - var1[8] * var1[5] * var1[15] + var1[8] * var1[7] * var1[13] + var1[12] * var1[5] * var1[11] - var1[12] * var1[7] * var1[9];
      var0[9] = -var1[0] * var1[9] * var1[15] + var1[0] * var1[11] * var1[13] + var1[8] * var1[1] * var1[15] - var1[8] * var1[3] * var1[13] - var1[12] * var1[1] * var1[11] + var1[12] * var1[3] * var1[9];
      var0[10] = var1[0] * var1[5] * var1[15] - var1[0] * var1[7] * var1[13] - var1[4] * var1[1] * var1[15] + var1[4] * var1[3] * var1[13] + var1[12] * var1[1] * var1[7] - var1[12] * var1[3] * var1[5];
      var0[11] = -var1[0] * var1[5] * var1[11] + var1[0] * var1[7] * var1[9] + var1[4] * var1[1] * var1[11] - var1[4] * var1[3] * var1[9] - var1[8] * var1[1] * var1[7] + var1[8] * var1[3] * var1[5];
      var0[12] = -var1[4] * var1[9] * var1[14] + var1[4] * var1[10] * var1[13] + var1[8] * var1[5] * var1[14] - var1[8] * var1[6] * var1[13] - var1[12] * var1[5] * var1[10] + var1[12] * var1[6] * var1[9];
      var0[13] = var1[0] * var1[9] * var1[14] - var1[0] * var1[10] * var1[13] - var1[8] * var1[1] * var1[14] + var1[8] * var1[2] * var1[13] + var1[12] * var1[1] * var1[10] - var1[12] * var1[2] * var1[9];
      var0[14] = -var1[0] * var1[5] * var1[14] + var1[0] * var1[6] * var1[13] + var1[4] * var1[1] * var1[14] - var1[4] * var1[2] * var1[13] - var1[12] * var1[1] * var1[6] + var1[12] * var1[2] * var1[5];
      var0[15] = var1[0] * var1[5] * var1[10] - var1[0] * var1[6] * var1[9] - var1[4] * var1[1] * var1[10] + var1[4] * var1[2] * var1[9] + var1[8] * var1[1] * var1[6] - var1[8] * var1[2] * var1[5];
      float var3 = var1[0] * var0[0] + var1[1] * var0[4] + var1[2] * var0[8] + var1[3] * var0[12];
      if(Double.compare((double)var3, 0.0D) != 0) {
         int var4 = 0;
         var0[var4] /= var3;
         ++var4;
         d.h(new d[5]);
      }

      Arrays.fill(var0, 0.0F);
   }

   static void K(FloatBuffer var0, FloatBuffer var1, float[] var2, float[] var3) {
      var1.get(var3);
      a(var2, var3);
      var0.put(var2);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
