package net.cl;

import net.xn;
import net.cb.h;
import net.cb.t;
import net.cl.e;
import net.cl.p;
import net.cl.r;
import net.nd.x;
import net.yv.o9;

public class l implements r {
   private static final t C = new h("tutorial.open_inventory.title", new Object[0]);
   private static final t o = new h("tutorial.open_inventory.description", new Object[]{e.n("inventory")});
   private final e u;
   private x E;
   private int Z;

   public l(e var1) {
      this.u = var1;
   }

   public void e() {
      e.j();
      ++this.Z;
      if(this.u.y() != o9.SURVIVAL) {
         this.u.x(p.NONE);
      }

      if(this.Z >= 600 && this.E == null) {
         this.E = new x(x.d.RECIPE_BOOK, C, o, false);
         this.u.U().J().a(this.E);
      }

   }

   public void A() {
      if(this.E != null) {
         this.E.B();
         this.E = null;
      }

   }

   public void T() {
      this.u.x(p.CRAFT_PLANKS);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
