package net.nd;

import net.h.m;
import net.nb.l;
import net.nd.h;
import net.yz.a;
import net.yz.m_;

public interface c {
   m_ X = new m_("textures/gui/toasts.png");
   Object N = new Object();

   c.d n(h var1, long var2);

   default Object w() {
      return N;
   }

   public static enum d {
      SHOW(l.Cq),
      HIDE(l.KS);

      private final a P;

      private d(a var3) {
         this.P = var3;
      }

      public void p(m var1) {
         var1.g((net.h.d)net.h.a.a(this.P, 1.0F, 1.0F));
      }
   }
}
