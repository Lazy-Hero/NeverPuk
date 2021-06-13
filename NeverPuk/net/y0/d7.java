package net.y0;

import net.y0.d;
import net.y0.l;
import net.y6.e6;
import net.yz.m_;

public class d7 extends l {
   private static final m_[] B = new m_[]{new m_("textures/entity/llama/llama_creamy.png"), new m_("textures/entity/llama/llama_white.png"), new m_("textures/entity/llama/llama_brown.png"), new m_("textures/entity/llama/llama_gray.png")};

   public d7(d var1) {
      super(var1, new e6(0.0F), 0.7F);
      this.k(new net.ye.a(this));
   }

   protected m_ l(net.yn.l var1) {
      return B[var1.m()];
   }
}
