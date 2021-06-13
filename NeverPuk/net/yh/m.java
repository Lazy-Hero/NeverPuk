package net.yh;

import net.xn;
import net.yh.c;
import net.yh.x;
import net.yz.ai;

public class m extends x {
   private int f;
   private final int G = 8;

   protected m(net.yv.r var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
   }

   public void f() {
      x.f();
      int var2 = 0;
      double var3 = this.K + (this.k.nextDouble() - this.k.nextDouble()) * 4.0D;
      double var5 = this.C + (this.k.nextDouble() - this.k.nextDouble()) * 4.0D;
      double var7 = this.A + (this.k.nextDouble() - this.k.nextDouble()) * 4.0D;
      net.yv.r var10000 = this.e;
      ai var10001 = ai.EXPLOSION_LARGE;
      float var10005 = (float)this.f;
      this.getClass();
      var10000.n(var10001, var3, var5, var7, (double)(var10005 / 8.0F), 0.0D, 0.0D, new int[0]);
      ++var2;
      ++this.f;
      int var10 = this.f;
      this.getClass();
      if(var10 == 8) {
         this.Z();
      }

   }

   public int n() {
      return 1;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static class k implements c {
      public x v(int var1, net.yv.r var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
         return new m(var2, var3, var5, var7, var9, var11, var13);
      }
   }
}
