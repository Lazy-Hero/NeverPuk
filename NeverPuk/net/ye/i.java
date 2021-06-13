package net.ye;

import net.xn;
import net.y0.dx;
import net.ye.p;
import net.ye.wr;
import net.yz.m_;

public class i implements wr {
   private static final m_ c = new m_("textures/entity/creeper/creeper_armor.png");
   private final dx B;
   private final net.y6.l F = new net.y6.l(2.0F);

   public i(dx var1) {
      this.B = var1;
   }

   public void B(net.nk.m var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = p.j();
      if(var1.nl()) {
         boolean var10 = var1.e();
         net.y.d.Y(!var10);
         this.B.i(c);
         net.y.d.G(5890);
         net.y.d.s();
         float var11 = (float)var1.x + var4;
         net.y.d.O(var11 * 0.01F, var11 * 0.01F, 0.0F);
         net.y.d.G(5888);
         net.y.d.C();
         float var10000 = 0.5F;
         net.y.d.T(0.5F, 0.5F, 0.5F, 1.0F);
         net.y.d.i();
         net.y.d.m(net.y.d.ONE, net.y.d.ONE);
         this.F.q(this.B.v());
         net.nn.j.b().s4.I(true);
         this.F.V(var1, var2, var3, var5, var6, var7, var8);
         net.nn.j.b().s4.I(false);
         net.y.d.G(5890);
         net.y.d.s();
         net.y.d.G(5888);
         net.y.d.K();
         net.y.d.E();
         net.y.d.Y(var10);
      }

   }

   public boolean y() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
