package net.cy;

import java.nio.FloatBuffer;
import net.cy.b;
import net.u.t;
import net.y.d;
import net.y.m;

public class p extends b {
   private static final p r = new p();
   private final FloatBuffer T = m.R(16);
   private final FloatBuffer J = m.R(16);
   private final FloatBuffer p = m.R(16);

   public static b K() {
      r.S();
      return r;
   }

   private void D(float[] var1) {
      float var2 = t.g(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2]);
      var1[0] /= var2;
      var1[1] /= var2;
      var1[2] /= var2;
      var1[3] /= var2;
   }

   public void S() {
      this.T.clear();
      this.J.clear();
      this.p.clear();
      d.t(2983, this.T);
      d.t(2982, this.J);
      float[] var1 = this.u;
      float[] var2 = this.X;
      this.T.flip().limit(16);
      this.T.get(var1);
      this.J.flip().limit(16);
      this.J.get(var2);
      this.U[0] = var2[0] * var1[0] + var2[1] * var1[4] + var2[2] * var1[8] + var2[3] * var1[12];
      this.U[1] = var2[0] * var1[1] + var2[1] * var1[5] + var2[2] * var1[9] + var2[3] * var1[13];
      this.U[2] = var2[0] * var1[2] + var2[1] * var1[6] + var2[2] * var1[10] + var2[3] * var1[14];
      this.U[3] = var2[0] * var1[3] + var2[1] * var1[7] + var2[2] * var1[11] + var2[3] * var1[15];
      this.U[4] = var2[4] * var1[0] + var2[5] * var1[4] + var2[6] * var1[8] + var2[7] * var1[12];
      this.U[5] = var2[4] * var1[1] + var2[5] * var1[5] + var2[6] * var1[9] + var2[7] * var1[13];
      this.U[6] = var2[4] * var1[2] + var2[5] * var1[6] + var2[6] * var1[10] + var2[7] * var1[14];
      this.U[7] = var2[4] * var1[3] + var2[5] * var1[7] + var2[6] * var1[11] + var2[7] * var1[15];
      this.U[8] = var2[8] * var1[0] + var2[9] * var1[4] + var2[10] * var1[8] + var2[11] * var1[12];
      this.U[9] = var2[8] * var1[1] + var2[9] * var1[5] + var2[10] * var1[9] + var2[11] * var1[13];
      this.U[10] = var2[8] * var1[2] + var2[9] * var1[6] + var2[10] * var1[10] + var2[11] * var1[14];
      this.U[11] = var2[8] * var1[3] + var2[9] * var1[7] + var2[10] * var1[11] + var2[11] * var1[15];
      this.U[12] = var2[12] * var1[0] + var2[13] * var1[4] + var2[14] * var1[8] + var2[15] * var1[12];
      this.U[13] = var2[12] * var1[1] + var2[13] * var1[5] + var2[14] * var1[9] + var2[15] * var1[13];
      this.U[14] = var2[12] * var1[2] + var2[13] * var1[6] + var2[14] * var1[10] + var2[15] * var1[14];
      this.U[15] = var2[12] * var1[3] + var2[13] * var1[7] + var2[14] * var1[11] + var2[15] * var1[15];
      float[] var3 = this.q[0];
      var3[0] = this.U[3] - this.U[0];
      var3[1] = this.U[7] - this.U[4];
      var3[2] = this.U[11] - this.U[8];
      var3[3] = this.U[15] - this.U[12];
      this.D(var3);
      float[] var4 = this.q[1];
      var4[0] = this.U[3] + this.U[0];
      var4[1] = this.U[7] + this.U[4];
      var4[2] = this.U[11] + this.U[8];
      var4[3] = this.U[15] + this.U[12];
      this.D(var4);
      float[] var5 = this.q[2];
      var5[0] = this.U[3] + this.U[1];
      var5[1] = this.U[7] + this.U[5];
      var5[2] = this.U[11] + this.U[9];
      var5[3] = this.U[15] + this.U[13];
      this.D(var5);
      float[] var6 = this.q[3];
      var6[0] = this.U[3] - this.U[1];
      var6[1] = this.U[7] - this.U[5];
      var6[2] = this.U[11] - this.U[9];
      var6[3] = this.U[15] - this.U[13];
      this.D(var6);
      float[] var7 = this.q[4];
      var7[0] = this.U[3] - this.U[2];
      var7[1] = this.U[7] - this.U[6];
      var7[2] = this.U[11] - this.U[10];
      var7[3] = this.U[15] - this.U[14];
      this.D(var7);
      float[] var8 = this.q[5];
      var8[0] = this.U[3] + this.U[2];
      var8[1] = this.U[7] + this.U[6];
      var8[2] = this.U[11] + this.U[10];
      var8[3] = this.U[15] + this.U[14];
      this.D(var8);
   }
}
