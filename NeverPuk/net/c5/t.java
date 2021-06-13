package net.c5;

import javax.annotation.Nullable;
import net.xn;
import net.c5.e;
import net.u.d;
import net.y.uw;
import net.y6.r;
import net.yz.m_;

public class t extends e {
   private final r E = new r();

   public void U(net.ni.g var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      d[] var11 = e.F();
      boolean var12 = var1.B() != null;
      boolean var13 = true;
      byte var14 = 0;
      long var15 = var1.B().y();
      net.y.d.c();
      float var10000 = 0.6666667F;
      net.y.d.O((float)var2 + 0.5F, (float)var4 + 0.5F, (float)var6 + 0.5F);
      float var18 = (float)(var14 * 360) / 16.0F;
      net.y.d.P(-var18, 0.0F, 1.0F, 0.0F);
      this.E.a.B = true;
      var18 = 0.0F;
      net.y.d.O((float)var2 + 0.5F, (float)var4 - 0.16666667F, (float)var6 + 0.5F);
      net.y.d.P(-var18, 0.0F, 1.0F, 0.0F);
      net.y.d.O(0.0F, -0.3125F, -0.4375F);
      this.E.a.B = false;
      net.u.j var22 = var1.C();
      float var19 = (float)(var22.t() * 7 + var22.h() * 9 + var22.y() * 13) + (float)var15 + var8;
      this.E.l.b = (-0.0125F + 0.01F * net.u.t.m(var19 * 3.1415927F * 0.02F)) * 3.1415927F;
      net.y.d.F();
      m_ var20 = this.k(var1);
      this.L(var20);
      net.y.d.c();
      net.y.d.W(0.6666667F, -0.6666667F, -0.6666667F);
      this.E.p();
      net.y.d.Y();
      net.y.d.T(1.0F, 1.0F, 1.0F, var10);
      net.y.d.Y();
   }

   @Nullable
   private m_ k(net.ni.g var1) {
      return uw.V.m(var1.L(), var1.Z(), var1.n());
   }

   private static xn a(xn var0) {
      return var0;
   }
}
