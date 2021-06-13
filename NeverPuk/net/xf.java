package net;

import net.oz;
import net.uv;
import net.xn;
import net.xr;
import org.lwjgl.opengl.ARBShaderObjects;

public class xf extends xr {
   private final float[] N = new float[4];

   public xf(String var1) {
      super(var1);
   }

   protected void b() {
      this.N[0] = 0.0F;
      this.N[1] = 0.0F;
      this.N[2] = 0.0F;
      this.N[3] = 0.0F;
   }

   public void h(float var1, float var2, float var3, float var4) {
      int[] var5 = uv.l();
      if(this.c() >= 0 && (this.N[0] != var1 || Float.compare(this.N[1], var2) != 0 || Float.compare(this.N[2], var3) != 0 || Float.compare(this.N[3], var4) != 0)) {
         ARBShaderObjects.glUniform4fARB(this.c(), var1, var2, var3, var4);
         oz.r(this.P());
         this.N[0] = var1;
         this.N[1] = var2;
         this.N[2] = var3;
         this.N[3] = var4;
      }

   }

   public float[] R() {
      return this.N;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
