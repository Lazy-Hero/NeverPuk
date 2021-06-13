package net.y0;

import net.xn;
import net.y0.d;
import net.y0.v;
import net.yz.m_;

public class a extends v {
   public static final m_ D = new m_("textures/entity/projectiles/arrow.png");
   public static final m_ w = new m_("textures/entity/projectiles/tipped_arrow.png");

   public a(d var1) {
      super(var1);
   }

   protected m_ f(net.n1.b var1) {
      return var1.J() > 0?w:D;
   }

   private static xn c(xn var0) {
      return var0;
   }
}
