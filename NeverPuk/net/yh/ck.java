package net.yh;

import net.xn;
import net.yh.c;
import net.yh.cv;
import net.yh.x;

public class ck extends cv {
   protected ck(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      x.f();
      super(var1, var2, var4, var6);
      this.u = 0.04F;
      this.R();
      if(Double.compare(var10, 0.0D) == 0 && (var8 != 0.0D || var12 != 0.0D)) {
         this.B = var8;
         this.R = var10 + 0.1D;
         this.L = var12;
      }

   }

   private static xn b(xn var0) {
      return var0;
   }

   public static class n implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new ck(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
