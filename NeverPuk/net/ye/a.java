package net.ye;

import net.xn;
import net.y0.d7;
import net.y6.e6;
import net.ye.p;
import net.ye.wr;
import net.yz.m_;

public class a implements wr {
   private static final m_[] v = new m_[]{new m_("textures/entity/llama/decor/decor_white.png"), new m_("textures/entity/llama/decor/decor_orange.png"), new m_("textures/entity/llama/decor/decor_magenta.png"), new m_("textures/entity/llama/decor/decor_light_blue.png"), new m_("textures/entity/llama/decor/decor_yellow.png"), new m_("textures/entity/llama/decor/decor_lime.png"), new m_("textures/entity/llama/decor/decor_pink.png"), new m_("textures/entity/llama/decor/decor_gray.png"), new m_("textures/entity/llama/decor/decor_silver.png"), new m_("textures/entity/llama/decor/decor_cyan.png"), new m_("textures/entity/llama/decor/decor_purple.png"), new m_("textures/entity/llama/decor/decor_blue.png"), new m_("textures/entity/llama/decor/decor_brown.png"), new m_("textures/entity/llama/decor/decor_green.png"), new m_("textures/entity/llama/decor/decor_red.png"), new m_("textures/entity/llama/decor/decor_black.png")};
   private final d7 W;
   private final e6 H = new e6(0.5F);

   public a(d7 var1) {
      this.W = var1;
   }

   public void e(net.yn.l var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = p.l();
      if(var1.O0()) {
         this.W.i(v[var1.T().d()]);
         this.H.q(this.W.v());
         this.H.V(var1, var2, var3, var5, var6, var7, var8);
      }

   }

   public boolean y() {
      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
