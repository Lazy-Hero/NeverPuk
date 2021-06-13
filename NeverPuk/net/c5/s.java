package net.c5;

import net.xn;
import net.c5.e;
import net.y.d;
import net.y0.d8;
import net.y6.e4;
import net.y9.r2;
import net.yz.aq;

public class s extends e {
   private final e4 c;

   public s(e4 var1) {
      this.c = var1;
   }

   public void q(net.ni.e var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      e.F();
      aq var12 = aq.UP;
      if(var1.j()) {
         net.yw.n var13 = this.K().Z(var1.C());
         if(var13.Q() instanceof r2) {
            var12 = (aq)var13.i(r2.n);
         }
      }

      d.B();
      d.n(515);
      d.Y(true);
      d.j();
      if(var9 >= 0) {
         this.L(L[var9]);
         d.G(5890);
         d.c();
         d.W(4.0F, 4.0F, 1.0F);
         d.O(0.0625F, 0.0625F, 0.0625F);
         d.G(5888);
      }

      this.L(d8.h[var1.N().d()]);
      d.c();
      d.F();
      d.T(1.0F, 1.0F, 1.0F, var10);
      d.O((float)var2 + 0.5F, (float)var4 + 1.5F, (float)var6 + 0.5F);
      d.W(1.0F, -1.0F, -1.0F);
      d.O(0.0F, 1.0F, 0.0F);
      float var14 = 0.9995F;
      d.W(0.9995F, 0.9995F, 0.9995F);
      d.O(0.0F, -1.0F, 0.0F);
      switch(null.r[var12.ordinal()]) {
      case 1:
         d.O(0.0F, 2.0F, 0.0F);
         d.P(180.0F, 1.0F, 0.0F, 0.0F);
      case 2:
      default:
      case 3:
         d.O(0.0F, 1.0F, 1.0F);
         d.P(90.0F, 1.0F, 0.0F, 0.0F);
         d.P(180.0F, 0.0F, 0.0F, 1.0F);
      case 4:
         d.O(0.0F, 1.0F, -1.0F);
         d.P(90.0F, 1.0F, 0.0F, 0.0F);
      case 5:
         d.O(-1.0F, 1.0F, 0.0F);
         d.P(90.0F, 1.0F, 0.0F, 0.0F);
         d.P(-90.0F, 0.0F, 0.0F, 1.0F);
      case 6:
         d.O(1.0F, 1.0F, 0.0F);
         d.P(90.0F, 1.0F, 0.0F, 0.0F);
         d.P(90.0F, 0.0F, 0.0F, 1.0F);
         this.c.G.B(0.0625F);
         d.O(0.0F, -var1.V(var8) * 0.5F, 0.0F);
         d.P(270.0F * var1.V(var8), 0.0F, 1.0F, 0.0F);
         this.c.s.B(0.0625F);
         d.a();
         d.g();
         d.Y();
         d.T(1.0F, 1.0F, 1.0F, 1.0F);
         if(var9 >= 0) {
            d.G(5890);
            d.Y();
            d.G(5888);
         }

      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
