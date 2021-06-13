package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.yz.m_;

public class p extends c {
   private static final m_ m = new m_("textures/entity/enderdragon/dragon_fireball.png");

   public p(d var1) {
      super(var1);
   }

   public void m(net.n1.f var1, double var2, double var4, double var6, float var8, float var9) {
      net.y.d.c();
      c.q();
      this.j(var1);
      net.y.d.O((float)var2, (float)var4, (float)var6);
      net.y.d.F();
      net.y.d.W(2.0F, 2.0F, 2.0F);
      net.y.r var11 = net.y.r.f();
      net.y.p var12 = var11.k();
      float var10000 = 1.0F;
      var10000 = 0.5F;
      var10000 = 0.25F;
      net.y.d.P(180.0F - this.A.I, 0.0F, 1.0F, 0.0F);
      net.y.d.P((float)(this.A.O.wR == 2?-1:1) * -this.A.Z, 1.0F, 0.0F, 0.0F);
      if(this.g) {
         net.y.d.G();
         net.y.d.o(this.B(var1));
      }

      var12.m(7, net.y8.x.T);
      var12.H(-0.5D, -0.25D, 0.0D).Y(0.0D, 1.0D).d(0.0F, 1.0F, 0.0F).W();
      var12.H(0.5D, -0.25D, 0.0D).Y(1.0D, 1.0D).d(0.0F, 1.0F, 0.0F).W();
      var12.H(0.5D, 0.75D, 0.0D).Y(1.0D, 0.0D).d(0.0F, 1.0F, 0.0F).W();
      var12.H(-0.5D, 0.75D, 0.0D).Y(0.0D, 0.0D).d(0.0F, 1.0F, 0.0F).W();
      var11.p();
      if(this.g) {
         net.y.d.o();
         net.y.d.e();
      }

      net.y.d.g();
      net.y.d.Y();
      super.w(var1, var2, var4, var6, var8, var9);
   }

   protected m_ e(net.n1.f var1) {
      return m;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
