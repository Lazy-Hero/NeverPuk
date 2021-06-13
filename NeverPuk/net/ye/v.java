package net.ye;

import java.util.Random;
import net.xn;
import net.y.u1;
import net.y6.jb;
import net.y6.jf;
import net.ye.p;
import net.ye.wr;

public class v implements wr {
   private final net.y0.o p;

   public v(net.y0.o var1) {
      this.p = var1;
   }

   public void t(net.ne.a var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      p.j();
      int var10 = var1.T();
      net.n1.b var11 = new net.n1.b(var1.hl, var1.b, var1.hS, var1.hr);
      Random var12 = new Random((long)var1.G());
      u1.m();
      int var13 = 0;
      if(var13 < var10) {
         net.y.d.c();
         jb var14 = this.p.v().r(var12);
         jf var15 = (jf)var14.f.get(var12.nextInt(var14.f.size()));
         var14.I(0.0625F);
         float var16 = var12.nextFloat();
         float var17 = var12.nextFloat();
         float var18 = var12.nextFloat();
         float var19 = (var15.Q + (var15.r - var15.Q) * var16) / 16.0F;
         float var20 = (var15.H + (var15.O - var15.H) * var17) / 16.0F;
         float var21 = (var15.I + (var15.p - var15.I) * var18) / 16.0F;
         net.y.d.O(var19, var20, var21);
         var16 = var16 * 2.0F - 1.0F;
         var17 = var17 * 2.0F - 1.0F;
         var18 = var18 * 2.0F - 1.0F;
         var16 = var16 * -1.0F;
         var17 = var17 * -1.0F;
         var18 = var18 * -1.0F;
         float var22 = net.u.t.g(var16 * var16 + var18 * var18);
         var11.hN = (float)(Math.atan2((double)var16, (double)var18) * 57.29577951308232D);
         var11.V = (float)(Math.atan2((double)var17, (double)var22) * 57.29577951308232D);
         var11.hq = var11.hN;
         var11.d = var11.V;
         double var10000 = 0.0D;
         var10000 = 0.0D;
         var10000 = 0.0D;
         this.p.g().D(var11, 0.0D, 0.0D, 0.0D, 0.0F, var4, false);
         net.y.d.Y();
         ++var13;
      }

      u1.B();
   }

   public boolean y() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
