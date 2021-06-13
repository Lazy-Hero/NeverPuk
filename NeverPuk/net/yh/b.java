package net.yh;

import javax.annotation.Nullable;
import net.xn;
import net.yh.c;
import net.yh.o;
import net.yh.x;
import net.yz.a5;

public class b extends o {
   protected b(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12, net.yw.n var14) {
      super(var1, var2, var4, var6, var8, var10, var12, var14);
      this.B = var8;
      this.R = var10;
      this.L = var12;
   }

   public static class w implements c {
      @Nullable
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         net.yw.n var16 = net.y9.l.P(var15[0]);
         return var16.C() == a5.INVISIBLE?null:(new b(var2, var3, var5, var7, var9, var11, var13, var16)).j();
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
