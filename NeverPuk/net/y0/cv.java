package net.y0;

import net.xn;
import net.y0.c;
import net.y0.d;
import net.y0.l;
import net.y6.e2;
import net.yz.m_;

public class cv extends l {
   private static final m_ B = new m_("textures/entity/villager/villager.png");
   private static final m_ n = new m_("textures/entity/villager/farmer.png");
   private static final m_ z = new m_("textures/entity/villager/librarian.png");
   private static final m_ E = new m_("textures/entity/villager/priest.png");
   private static final m_ G = new m_("textures/entity/villager/smith.png");
   private static final m_ V = new m_("textures/entity/villager/butcher.png");

   public cv(d var1) {
      super(var1, new e2(0.0F), 0.5F);
      this.k(new net.ye.w(this.o().S));
   }

   public e2 o() {
      return (e2)super.v();
   }

   protected m_ E(net.yn.s var1) {
      switch(var1.u()) {
      case 0:
         return n;
      case 1:
         return z;
      case 2:
         return E;
      case 3:
         return G;
      case 4:
         return V;
      case 5:
      default:
         return B;
      }
   }

   protected void x(net.yn.s var1, float var2) {
      c.C();
      float var4 = 0.9375F;
      if(var1.z() < 0) {
         var4 = (float)((double)var4 * 0.5D);
         this.W = 0.25F;
      }

      this.W = 0.5F;
      net.y.d.W(var4, var4, var4);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
