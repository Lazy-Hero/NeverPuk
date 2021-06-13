package net.yh;

import net.xn;
import net.yh.c;
import net.yh.ca;
import net.yh.x;

public class c5 extends ca {
   public c5(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      x.f();
      super(var1, var2, var4, var6, 176, 8, -0.05F);
      this.B = var8;
      this.R = var10;
      this.L = var12;
      this.g *= 0.75F;
      this.a = 60 + this.k.nextInt(12);
      if(this.k.nextInt(4) == 0) {
         this.W(0.6F + this.k.nextFloat() * 0.2F, 0.6F + this.k.nextFloat() * 0.3F, this.k.nextFloat() * 0.2F);
      }

      this.W(0.1F + this.k.nextFloat() * 0.2F, 0.4F + this.k.nextFloat() * 0.3F, this.k.nextFloat() * 0.2F);
      this.H(0.6F);
   }

   private static xn b(xn var0) {
      return var0;
   }

   public static class l implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new c5(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
