package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y6.el;
import net.yz.m_;

public class co extends c {
   private static final m_ t = new m_("textures/entity/wither/wither_invulnerable.png");
   private static final m_ X = new m_("textures/entity/wither/wither.png");
   private final el z = new el();

   public co(d var1) {
      super(var1);
   }

   private float Z(float var1, float var2, float var3) {
      c.C();
      float var5 = var2 - var1;
      if(var5 < -180.0F) {
         var5 += 360.0F;
      }

      if(var5 >= 180.0F) {
         var5 -= 360.0F;
      }

      return var1 + var3 * var5;
   }

   public void o(net.n1.w var1, double var2, double var4, double var6, float var8, float var9) {
      c.q();
      net.y.d.c();
      net.y.d.j();
      float var11 = this.Z(var1.hq, var1.hN, var9);
      float var12 = var1.d + (var1.V - var1.d) * var9;
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

      this.z.V(var1, 0.0F, 0.0F, 0.0F, var11, var12, 0.0625F);
      if(this.g) {
         net.y.d.o();
         net.y.d.e();
      }

      net.y.d.Y();
      super.w(var1, var2, var4, var6, var8, var9);
   }

   protected m_ R(net.n1.w var1) {
      return var1.K()?t:X;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
