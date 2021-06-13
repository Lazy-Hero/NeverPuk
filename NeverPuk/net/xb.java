package net;

import net.oz;
import net.uv;
import net.xn;
import net.xr;
import org.lwjgl.opengl.ARBShaderObjects;

public class xb extends xr {
   private int o = -1;

   public xb(String var1) {
      super(var1);
   }

   protected void b() {
      this.o = -1;
   }

   public void D(int var1) {
      int[] var2 = uv.l();
      if(this.c() >= 0 && this.o != var1) {
         ARBShaderObjects.glUniform1iARB(this.c(), var1);
         oz.r(this.P());
         this.o = var1;
      }

   }

   public int X() {
      return this.o;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
