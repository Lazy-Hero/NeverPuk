package net.cl;

import net.xn;
import net.cb.h;
import net.cb.t;
import net.cl.e;
import net.cl.p;
import net.cl.r;
import net.n0.ks;
import net.n0.y;
import net.nb.f;
import net.nd.x;
import net.v.q;
import net.yv.o9;
import net.yy.g;

public class s implements r {
   private static final t z = new h("tutorial.craft_planks.title", new Object[0]);
   private static final t N = new h("tutorial.craft_planks.description", new Object[0]);
   private final e q;
   private x T;
   private int F;

   public s(e var1) {
      this.q = var1;
   }

   public void e() {
      e.j();
      ++this.F;
      if(this.q.y() != o9.SURVIVAL) {
         this.q.x(p.NONE);
      }

      if(this.F == 1) {
         g var2 = this.q.U().sf;
         if(var2.a8.z(new ks(f.oN))) {
            this.q.x(p.NONE);
            return;
         }

         if(E(var2)) {
            this.q.x(p.NONE);
            return;
         }
      }

      if(this.F >= 1200 && this.T == null) {
         this.T = new x(x.d.WOODEN_PLANKS, z, N, false);
         this.q.U().J().a(this.T);
      }

   }

   public void A() {
      if(this.T != null) {
         this.T.B();
         this.T = null;
      }

   }

   public void f(ks var1) {
      if(var1.Z() == y.q(f.oN)) {
         this.q.x(p.NONE);
      }

   }

   public static boolean E(g var0) {
      net.v.n var1 = q.W(y.q(f.oN));
      return var0.q().H(var1) > 0;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
