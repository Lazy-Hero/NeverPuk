package net.yh;

import net.xn;
import net.yh.x;
import net.yz.ai;

public class j extends x {
   private final net.ne.l d;
   private int f;
   private final int D;
   private final ai P;

   public j(net.yv.r var1, net.ne.l var2, ai var3) {
      this(var1, var2, var3, 3);
   }

   public j(net.yv.r var1, net.ne.l var2, ai var3, int var4) {
      super(var1, var2.b, var2.i().u + (double)(var2.m / 2.0F), var2.hr, var2.hf, var2.K, var2.J);
      this.d = var2;
      this.D = var4;
      this.P = var3;
      this.f();
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
   }

   public void f() {
      x.f();
      int var2 = 0;
      double var3 = (double)(this.k.nextFloat() * 2.0F - 1.0F);
      double var5 = (double)(this.k.nextFloat() * 2.0F - 1.0F);
      double var7 = (double)(this.k.nextFloat() * 2.0F - 1.0F);
      if(Double.compare(var3 * var3 + var5 * var5 + var7 * var7, 1.0D) <= 0) {
         double var9 = this.d.b + var3 * (double)this.d.h9 / 4.0D;
         double var11 = this.d.i().u + (double)(this.d.m / 2.0F) + var5 * (double)this.d.m / 4.0D;
         double var13 = this.d.hr + var7 * (double)this.d.h9 / 4.0D;
         this.e.T(this.P, false, var9, var11, var13, var3, var5 + 0.2D, var7, new int[0]);
      }

      ++var2;
      ++this.f;
      if(this.f >= this.D) {
         this.Z();
      }

   }

   public int n() {
      return 3;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
