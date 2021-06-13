package net.y0;

import net.xn;
import net.nk.fy;
import net.y0.c;
import net.y0.d;
import net.y0.y;
import net.yz.m_;

public class da extends y {
   private static final m_ S = new m_("textures/entity/zombie_villager/zombie_villager.png");
   private static final m_ N = new m_("textures/entity/zombie_villager/zombie_farmer.png");
   private static final m_ R = new m_("textures/entity/zombie_villager/zombie_librarian.png");
   private static final m_ h = new m_("textures/entity/zombie_villager/zombie_priest.png");
   private static final m_ d = new m_("textures/entity/zombie_villager/zombie_smith.png");
   private static final m_ i = new m_("textures/entity/zombie_villager/zombie_butcher.png");

   public da(d var1) {
      super(var1, new net.y6.v(), 0.5F);
      this.k(new net.ye.m(this));
   }

   protected m_ D(fy var1) {
      switch(var1.k()) {
      case 0:
         return N;
      case 1:
         return R;
      case 2:
         return h;
      case 3:
         return d;
      case 4:
         return i;
      case 5:
      default:
         return S;
      }
   }

   protected void k(fy var1, float var2, float var3, float var4) {
      boolean var5 = c.C();
      if(var1.tU()) {
         var3 += (float)(Math.cos((double)var1.x * 3.25D) * 3.141592653589793D * 0.25D);
      }

      super.o(var1, var2, var3, var4);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
