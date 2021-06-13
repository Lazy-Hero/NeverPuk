package net.c5;

import net.xn;
import net.c5.e;
import net.ne.l;
import net.ni.r;
import net.y.d;

public class k extends e {
   public void J(net.ni.u var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      d.c();
      d.O((float)var2 + 0.5F, (float)var4, (float)var6 + 0.5F);
      B(var1.H(), var2, var4, var6, var8);
      d.Y();
   }

   public static void B(r var0, double var1, double var3, double var5, float var7) {
      e.F();
      l var9 = var0.A();
      float var10 = 0.53125F;
      float var11 = Math.max(var9.h9, var9.m);
      if((double)var11 > 1.0D) {
         var10 /= var11;
      }

      d.O(0.0F, 0.4F, 0.0F);
      d.P((float)(var0.Z() + (var0.z() - var0.Z()) * (double)var7) * 10.0F, 0.0F, 1.0F, 0.0F);
      d.O(0.0F, -0.2F, 0.0F);
      d.P(-30.0F, 1.0F, 0.0F, 0.0F);
      d.W(var10, var10, var10);
      var9.S(var1, var3, var5, 0.0F, 0.0F);
      net.nn.j.b().N().D(var9, 0.0D, 0.0D, 0.0D, 0.0F, var7, false);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
