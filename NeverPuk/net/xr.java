package net;

import net.uv;
import net.xn;
import org.lwjgl.opengl.ARBShaderObjects;

public abstract class xr {
   private final String l;
   private int n = -1;
   private int a = -1;

   public xr(String var1) {
      this.l = var1;
   }

   public void v(int var1) {
      int[] var2 = uv.l();
      if(this.n != var1) {
         this.n = var1;
         this.a = ARBShaderObjects.glGetUniformLocationARB(var1, this.l);
         this.b();
      }

   }

   protected abstract void b();

   public String P() {
      return this.l;
   }

   public int R() {
      return this.n;
   }

   public int c() {
      return this.a;
   }

   public boolean y() {
      int[] var1 = uv.l();
      return this.a >= 0;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
