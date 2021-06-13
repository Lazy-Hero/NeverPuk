package net.ye;

import java.util.Random;
import net.xn;
import net.y.u1;
import net.ye.p;
import net.ye.wr;

public class b implements wr {
   public void U(net.a.t var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = p.l();
      if(var1.k9 > 0) {
         net.y.r var10 = net.y.r.f();
         net.y.p var11 = var10.k();
         u1.m();
         float var12 = ((float)var1.k9 + var4) / 200.0F;
         float var13 = 0.0F;
         if(var12 > 0.8F) {
            var13 = (var12 - 0.8F) / 0.2F;
         }

         Random var14 = new Random(432L);
         net.y.d.w();
         net.y.d.Q(7425);
         net.y.d.C();
         net.y.d.m(net.y.d.SRC_ALPHA, net.y.d.ONE);
         net.y.d.d();
         net.y.d.a();
         net.y.d.Y(false);
         net.y.d.c();
         net.y.d.O(0.0F, -1.0F, -2.0F);
         int var15 = 0;
         if((float)var15 < (var12 + var12 * var12) / 2.0F * 60.0F) {
            net.y.d.P(var14.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
            net.y.d.P(var14.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
            net.y.d.P(var14.nextFloat() * 360.0F, 0.0F, 0.0F, 1.0F);
            net.y.d.P(var14.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
            net.y.d.P(var14.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
            net.y.d.P(var14.nextFloat() * 360.0F + var12 * 90.0F, 0.0F, 0.0F, 1.0F);
            float var16 = var14.nextFloat() * 20.0F + 5.0F + var13 * 10.0F;
            float var17 = var14.nextFloat() * 2.0F + 1.0F + var13 * 2.0F;
            var11.m(6, net.y8.x.F);
            var11.H(0.0D, 0.0D, 0.0D).V(255, 255, 255, (int)(255.0F * (1.0F - var13))).W();
            var11.H(-0.866D * (double)var17, (double)var16, (double)(-0.5F * var17)).V(255, 0, 255, 0).W();
            var11.H(0.866D * (double)var17, (double)var16, (double)(-0.5F * var17)).V(255, 0, 255, 0).W();
            var11.H(0.0D, (double)var16, (double)(1.0F * var17)).V(255, 0, 255, 0).W();
            var11.H(-0.866D * (double)var17, (double)var16, (double)(-0.5F * var17)).V(255, 0, 255, 0).W();
            var10.p();
            ++var15;
         }

         net.y.d.Y();
         net.y.d.Y(true);
         net.y.d.j();
         net.y.d.E();
         net.y.d.Q(7424);
         net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
         net.y.d.S();
         net.y.d.m();
         u1.B();
      }

   }

   public boolean y() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
