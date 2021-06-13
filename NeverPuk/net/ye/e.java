package net.ye;

import net.xn;
import net.y0.ce;
import net.y6.e8;
import net.ye.p;
import net.ye.wr;
import net.yz.m_;

public class e implements wr {
   private static final m_ L = new m_("textures/entity/wither/wither_armor.png");
   private final ce d;
   private final e8 b = new e8(0.5F);

   public e(ce var1) {
      this.d = var1;
   }

   public void R(net.a.z var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = p.l();
      if(var1.Kd()) {
         net.y.d.Y(!var1.e());
         this.d.i(L);
         net.y.d.G(5890);
         net.y.d.s();
         float var10 = (float)var1.x + var4;
         float var11 = net.u.t.m(var10 * 0.02F) * 3.0F;
         float var12 = var10 * 0.01F;
         net.y.d.O(var11, var12, 0.0F);
         net.y.d.G(5888);
         net.y.d.C();
         float var10000 = 0.5F;
         net.y.d.T(0.5F, 0.5F, 0.5F, 1.0F);
         net.y.d.i();
         net.y.d.m(net.y.d.ONE, net.y.d.ONE);
         this.b.x(var1, var2, var3, var4);
         this.b.q(this.d.v());
         net.nn.j.b().s4.I(true);
         this.b.V(var1, var2, var3, var5, var6, var7, var8);
         net.nn.j.b().s4.I(false);
         net.y.d.G(5890);
         net.y.d.s();
         net.y.d.G(5888);
         net.y.d.K();
         net.y.d.E();
      }

   }

   public boolean y() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
