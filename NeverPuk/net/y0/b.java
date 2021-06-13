package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y6.ev;
import net.yz.m_;

public class b extends c {
   private static final m_ Q = new m_("textures/entity/lead_knot.png");
   private final ev V = new ev();

   public b(d var1) {
      super(var1);
   }

   public void L(net.ne.o var1, double var2, double var4, double var6, float var8, float var9) {
      net.y.d.c();
      c.q();
      net.y.d.j();
      net.y.d.O((float)var2, (float)var4, (float)var6);
      float var10000 = 0.0625F;
      net.y.d.F();
      net.y.d.W(-1.0F, -1.0F, 1.0F);
      net.y.d.m();
      this.j(var1);
      if(this.g) {
         net.y.d.G();
         net.y.d.o(this.B(var1));
      }

      this.V.V(var1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
      if(this.g) {
         net.y.d.o();
         net.y.d.e();
      }

      net.y.d.Y();
      super.w(var1, var2, var4, var6, var8, var9);
   }

   protected m_ X(net.ne.o var1) {
      return Q;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
