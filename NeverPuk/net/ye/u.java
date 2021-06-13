package net.ye;

import net.xn;
import net.n0.ks;
import net.nl.z2;
import net.y0.ct;
import net.ye.p;
import net.ye.wr;
import net.yz.m_;

public class u implements wr {
   private final ct S;

   public u(ct var1) {
      this.S = var1;
   }

   public void L(net.yy.f var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = p.j();
      if(var1.TQ() && !var1.e() && var1.o(net.r.j.CAPE) && var1.Q().equals(net.nn.j.b().L().w())) {
         ks var10 = var1.U(z2.CHEST);
         if(var10.Z() != net.nb.j.SB) {
            net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
            this.S.i(new m_("neverhook/skidma.png"));
            net.y.d.c();
            net.y.d.O(0.0F, 0.0F, 0.125F);
            double var11 = var1.aJ + (var1.am - var1.aJ) * (double)var4 - (var1.h + (var1.b - var1.h) * (double)var4);
            double var13 = var1.ay + (var1.au - var1.ay) * (double)var4 - (var1.h6 + (var1.hS - var1.h6) * (double)var4);
            double var15 = var1.a5 + (var1.a4 - var1.a5) * (double)var4 - (var1.l + (var1.hr - var1.l) * (double)var4);
            float var17 = var1.Az + (var1.AK - var1.Az) * var4;
            double var18 = (double)net.u.t.A(var17 * 0.017453292F);
            double var20 = (double)(-net.u.t.m(var17 * 0.017453292F));
            float var22 = (float)var13 * 10.0F;
            var22 = net.u.t.T(var22, -6.0F, 32.0F);
            float var23 = (float)(var11 * var18 + var15 * var20) * 50.0F;
            float var24 = (float)(var11 * var20 - var15 * var18) * 50.0F;
            if(Float.compare(var23, 0.0F) < 0) {
               var23 = 0.0F;
            }

            if(var23 > 165.0F) {
               var23 = 165.0F;
            }

            float var25 = var1.aj + (var1.af - var1.aj) * var4;
            var22 = var22 + net.u.t.A((var1.hu + (var1.i - var1.hu) * var4) * 6.0F) * 32.0F * var25;
            if(var1.Q()) {
               var22 += 25.0F;
               net.y.d.O(0.0F, 0.142F, -0.0178F);
            }

            net.y.d.P(6.0F + var23 / 2.0F + var22, 1.0F, 0.0F, 0.0F);
            net.y.d.P(var24 / 2.0F, 0.0F, 0.0F, 1.0F);
            net.y.d.P(-var24 / 2.0F, 0.0F, 1.0F, 0.0F);
            net.y.d.P(180.0F, 0.0F, 1.0F, 0.0F);
            this.S.w().C(0.0625F);
            net.y.d.Y();
         }
      }

   }

   public boolean y() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
