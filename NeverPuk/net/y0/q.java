package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y6.e7;
import net.yz.m_;

public class q extends c {
   private static final m_ b = new m_("textures/entity/illager/fangs.png");
   private final e7 f = new e7();

   public q(d var1) {
      super(var1);
   }

   public void r(net.n1.j var1, double var2, double var4, double var6, float var8, float var9) {
      c.C();
      float var11 = var1.Q(var9);
      if(var11 != 0.0F) {
         float var12 = 2.0F;
         if(Float.compare(var11, 0.9F) > 0) {
            var12 = (float)((double)var12 * ((1.0D - (double)var11) / 0.10000000149011612D));
         }

         net.y.d.c();
         net.y.d.j();
         net.y.d.m();
         this.j(var1);
         net.y.d.O((float)var2, (float)var4, (float)var6);
         net.y.d.P(90.0F - var1.hN, 0.0F, 1.0F, 0.0F);
         net.y.d.W(-var12, -var12, var12);
         float var10000 = 0.03125F;
         net.y.d.O(0.0F, -0.626F, 0.0F);
         this.f.V(var1, var11, 0.0F, 0.0F, var1.hN, var1.V, 0.03125F);
         net.y.d.Y();
         net.y.d.a();
         super.w(var1, var2, var4, var6, var8, var9);
      }

   }

   protected m_ v(net.n1.j var1) {
      return b;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
