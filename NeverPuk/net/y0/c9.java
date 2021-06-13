package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y6.ej;
import net.yz.m_;

public class c9 extends c {
   private static final m_ V = new m_("textures/entity/llama/spit.png");
   private final ej w = new ej();

   public c9(d var1) {
      super(var1);
   }

   public void M(net.n1.c var1, double var2, double var4, double var6, float var8, float var9) {
      c.C();
      net.y.d.c();
      net.y.d.O((float)var2, (float)var4 + 0.15F, (float)var6);
      net.y.d.P(var1.hq + (var1.hN - var1.hq) * var9 - 90.0F, 0.0F, 1.0F, 0.0F);
      net.y.d.P(var1.d + (var1.V - var1.d) * var9, 0.0F, 0.0F, 1.0F);
      this.j(var1);
      if(this.g) {
         net.y.d.G();
         net.y.d.o(this.B(var1));
      }

      this.w.V(var1, var9, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      if(this.g) {
         net.y.d.o();
         net.y.d.e();
      }

      net.y.d.Y();
      super.w(var1, var2, var4, var6, var8, var9);
   }

   protected m_ T(net.n1.c var1) {
      return V;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
