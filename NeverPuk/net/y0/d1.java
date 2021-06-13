package net.y0;

import net.y0.d;
import net.y0.l;
import net.y6.ep;
import net.yz.m_;

public class d1 extends l {
   public static final m_[] d = new m_[]{new m_("textures/entity/parrot/parrot_red_blue.png"), new m_("textures/entity/parrot/parrot_blue.png"), new m_("textures/entity/parrot/parrot_green.png"), new m_("textures/entity/parrot/parrot_yellow_blue.png"), new m_("textures/entity/parrot/parrot_grey.png")};

   public d1(d var1) {
      super(var1, new ep(), 0.3F);
   }

   protected m_ L(net.yn.k var1) {
      return d[var1.C()];
   }

   public float O(net.yn.k var1, float var2) {
      return this.K(var1, var2);
   }

   private float K(net.yn.k var1, float var2) {
      float var3 = var1.ZD + (var1.Z6 - var1.ZD) * var2;
      float var4 = var1.ZK + (var1.ZO - var1.ZK) * var2;
      return (net.u.t.A(var3) + 1.0F) * var4;
   }
}
