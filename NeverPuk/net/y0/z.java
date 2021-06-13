package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.yz.m_;

public class z extends c {
   private final float x;

   public z(d var1, float var2) {
      super(var1);
      this.x = var2;
   }

   public void G(net.n1.m var1, double var2, double var4, double var6, float var8, float var9) {
      net.y.d.c();
      this.j(var1);
      net.y.d.O((float)var2, (float)var4, (float)var6);
      c.q();
      net.y.d.F();
      net.y.d.W(this.x, this.x, this.x);
      net.n9.v var11 = net.nn.j.b().K().k().Q(net.nb.j.Yu);
      net.y.r var12 = net.y.r.f();
      net.y.p var13 = var12.k();
      float var14 = var11.q();
      float var15 = var11.o();
      float var16 = var11.n();
      float var17 = var11.r();
      float var10000 = 1.0F;
      var10000 = 0.5F;
      var10000 = 0.25F;
      net.y.d.P(180.0F - this.A.I, 0.0F, 1.0F, 0.0F);
      net.y.d.P((float)(this.A.O.wR == 2?-1:1) * -this.A.Z, 1.0F, 0.0F, 0.0F);
      if(this.g) {
         net.y.d.G();
         net.y.d.o(this.B(var1));
      }

      var13.m(7, net.y8.x.T);
      var13.H(-0.5D, -0.25D, 0.0D).Y((double)var14, (double)var17).d(0.0F, 1.0F, 0.0F).W();
      var13.H(0.5D, -0.25D, 0.0D).Y((double)var15, (double)var17).d(0.0F, 1.0F, 0.0F).W();
      var13.H(0.5D, 0.75D, 0.0D).Y((double)var15, (double)var16).d(0.0F, 1.0F, 0.0F).W();
      var13.H(-0.5D, 0.75D, 0.0D).Y((double)var14, (double)var16).d(0.0F, 1.0F, 0.0F).W();
      var12.p();
      if(this.g) {
         net.y.d.o();
         net.y.d.e();
      }

      net.y.d.g();
      net.y.d.Y();
      super.w(var1, var2, var4, var6, var8, var9);
   }

   protected m_ O(net.n1.m var1) {
      return net.n9.b.N;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
