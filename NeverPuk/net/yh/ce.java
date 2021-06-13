package net.yh;

import net.yh.c;
import net.yh.ca;
import net.yh.x;

public class ce extends ca {
   public ce(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 176, 8, -5.0E-4F);
      this.B = var8;
      this.R = var10;
      this.L = var12;
      this.g *= 0.75F;
      this.a = 60 + this.k.nextInt(12);
      this.M(15916745);
   }

   public void f(double var1, double var3, double var5) {
      this.K(this.I().w(var1, var3, var5));
      this.n();
   }

   public static class a implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new ce(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
