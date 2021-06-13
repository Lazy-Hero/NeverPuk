package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y6.e9;
import net.yz.m_;

public class ch extends c {
   private static final m_ e = new m_("textures/entity/shulker/spark.png");
   private final e9 D = new e9();

   public ch(d var1) {
      super(var1);
   }

   private float I(float var1, float var2, float var3) {
      c.q();
      float var5 = var2 - var1;
      if(var5 < -180.0F) {
         var5 += 360.0F;
      }

      if(var5 >= 180.0F) {
         var5 -= 360.0F;
      }

      return var1 + var3 * var5;
   }

   public void h(net.n1.a var1, double var2, double var4, double var6, float var8, float var9) {
      net.y.d.c();
      float var10 = this.I(var1.hq, var1.hN, var9);
      float var11 = var1.d + (var1.V - var1.d) * var9;
      float var12 = (float)var1.x + var9;
      net.y.d.O((float)var2, (float)var4 + 0.15F, (float)var6);
      net.y.d.P(net.u.t.A(var12 * 0.1F) * 180.0F, 0.0F, 1.0F, 0.0F);
      net.y.d.P(net.u.t.m(var12 * 0.1F) * 180.0F, 1.0F, 0.0F, 0.0F);
      net.y.d.P(net.u.t.A(var12 * 0.15F) * 360.0F, 0.0F, 0.0F, 1.0F);
      float var10000 = 0.03125F;
      net.y.d.F();
      net.y.d.W(-1.0F, -1.0F, 1.0F);
      this.j(var1);
      this.D.V(var1, 0.0F, 0.0F, 0.0F, var10, var11, 0.03125F);
      net.y.d.C();
      net.y.d.T(1.0F, 1.0F, 1.0F, 0.5F);
      net.y.d.W(1.5F, 1.5F, 1.5F);
      this.D.V(var1, 0.0F, 0.0F, 0.0F, var10, var11, 0.03125F);
      net.y.d.E();
      net.y.d.Y();
      super.w(var1, var2, var4, var6, var8, var9);
   }

   protected m_ w(net.n1.a var1) {
      return e;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
