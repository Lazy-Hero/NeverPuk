package net.y0;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.y0.c;
import net.y0.d;
import net.yz.m_;

public class e extends c {
   public e(d var1) {
      super(var1);
   }

   public void v(net.yi.e var1, double var2, double var4, double var6, float var8, float var9) {
      net.y.r var11 = net.y.r.f();
      net.y.p var12 = var11.k();
      c.C();
      net.y.d.w();
      net.y.d.i();
      net.y.d.C();
      net.y.d.m(net.y.d.SRC_ALPHA, net.y.d.ONE);
      double[] var13 = new double[8];
      double[] var14 = new double[8];
      double var15 = 0.0D;
      double var17 = 0.0D;
      Random var19 = new Random(var1.bw);
      int var20 = 7;
      var13[var20] = var15;
      var14[var20] = var17;
      var15 = var15 + (double)(var19.nextInt(11) - 5);
      var17 = var17 + (double)(var19.nextInt(11) - 5);
      --var20;
      var20 = 0;
      Random var21 = new Random(var1.bw);
      int var22 = 0;
      byte var23 = 7;
      boolean var24 = false;
      double var25 = var13[var23] - var15;
      double var27 = var14[var23] - var17;
      double var57 = var25 + (double)(var21.nextInt(11) - 5);
      double var59 = var27 + (double)(var21.nextInt(11) - 5);
      double var58 = var57 + (double)(var21.nextInt(31) - 15);
      double var60 = var59 + (double)(var21.nextInt(31) - 15);
      var12.m(5, net.y8.x.F);
      float var10001 = 0.5F;
      var10001 = 0.45F;
      var10001 = 0.45F;
      var10001 = 0.5F;
      double var38 = 0.1D + (double)var20 * 0.2D;
      var38 = var38 * ((double)var23 * 0.1D + 1.0D);
      double var40 = 0.1D + (double)var20 * 0.2D;
      var40 = var40 * ((double)(var23 - 1) * 0.1D + 1.0D);
      int var42 = 0;
      double var43 = var2 + 0.5D - var38;
      double var45 = var6 + 0.5D - var38;
      double var47 = var2 + 0.5D - var40;
      double var49 = var6 + 0.5D - var40;
      var12.H(var47 + var58, var4 + (double)(var23 * 16), var49 + var60).m(0.45F, 0.45F, 0.5F, 0.3F).W();
      var12.H(var43 + var25, var4 + (double)((var23 + 1) * 16), var45 + var27).m(0.45F, 0.45F, 0.5F, 0.3F).W();
      ++var42;
      var11.p();
      int var29 = var23 - 1;
      ++var22;
      ++var20;
      net.y.d.E();
      net.y.d.K();
      net.y.d.S();
   }

   @Nullable
   protected m_ p(net.yi.e var1) {
      return null;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
