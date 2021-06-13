package net.yh;

import net.oz;
import net.xn;
import net.z9;
import net.y.ui;
import net.yh.x;

public class h extends x {
   private final net.ne.l f;
   private final net.ne.l o;
   private int j;
   private final int v;
   private final float n;
   private final net.y0.d Z = net.nn.j.b().N();

   public h(net.yv.r var1, net.ne.l var2, net.ne.l var3, float var4) {
      super(var1, var2.b, var2.hS, var2.hr, var2.hf, var2.K, var2.J);
      this.f = var2;
      this.o = var3;
      this.v = 3;
      this.n = var4;
   }

   public void A(net.y.p var1, net.ne.l var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      x.f();
      int var10 = 0;
      if(z9.Q()) {
         var10 = oz.s;
         oz.n(this.f);
      }

      float var11 = ((float)this.j + var3) / (float)this.v;
      var11 = var11 * var11;
      double var12 = this.f.b;
      double var14 = this.f.hS;
      double var16 = this.f.hr;
      double var18 = this.o.hL + (this.o.b - this.o.hL) * (double)var3;
      double var20 = this.o.F + (this.o.hS - this.o.F) * (double)var3 + (double)this.n;
      double var22 = this.o.A + (this.o.hr - this.o.A) * (double)var3;
      double var24 = var12 + (var18 - var12) * (double)var11;
      double var26 = var14 + (var20 - var14) * (double)var11;
      double var28 = var16 + (var22 - var16) * (double)var11;
      int var30 = this.g(var3);
      int var31 = var30 % 65536;
      int var32 = var30 / 65536;
      ui.c(ui.w, (float)var31, (float)var32);
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      var24 = var24 - X;
      var26 = var26 - z;
      var28 = var28 - U;
      net.y.d.K();
      this.Z.D(this.f, var24, var26, var28, this.f.hN, var3, false);
      if(z9.Q()) {
         oz.Y(var10);
      }

   }

   public void f() {
      x.f();
      ++this.j;
      if(this.j == this.v) {
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
