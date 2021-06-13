package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y0.l;
import net.y6.e8;
import net.yz.m_;

public class ce extends l {
   private static final m_ B = new m_("textures/entity/wither/wither_invulnerable.png");
   private static final m_ z = new m_("textures/entity/wither/wither.png");

   public ce(d var1) {
      super(var1, new e8(0.0F), 1.0F);
      this.k(new net.ye.e(this));
   }

   protected m_ s(net.a.z var1) {
      c.C();
      int var3 = var1.i();
      return var3 <= 0 || var3 <= 80 && var3 / 5 % 2 == 1?z:B;
   }

   protected void C(net.a.z var1, float var2) {
      c.q();
      float var4 = 2.0F;
      int var5 = var1.i();
      var4 = var4 - ((float)var5 - var2) / 220.0F * 0.5F;
      net.y.d.W(var4, var4, var4);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
