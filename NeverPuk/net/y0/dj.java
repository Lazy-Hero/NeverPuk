package net.y0;

import net.y0.d;
import net.y0.dc;
import net.yz.m_;

public class dj extends dc {
   private static final m_ p = new m_("textures/entity/spider/cave_spider.png");

   public dj(d var1) {
      super(var1);
      this.W *= 0.7F;
   }

   protected void q(net.nk.o var1, float var2) {
      net.y.d.W(0.7F, 0.7F, 0.7F);
   }

   protected m_ F(net.nk.o var1) {
      return p;
   }
}
