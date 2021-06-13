package net.yh;

import net.yh.c;
import net.yh.v;
import net.yh.x;

public class z extends v {
   protected z(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.u = 0.5F;
   }

   public void f() {
      super.f();
      this.R -= 0.004D + 0.04D * (double)this.u;
   }

   public static class k implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new net.yh.z(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
