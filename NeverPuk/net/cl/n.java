package net.cl;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;
import net.xn;
import net.cb.h;
import net.cb.t;
import net.cl.e;
import net.cl.p;
import net.cl.r;
import net.cp.v;
import net.n0.ks;
import net.n0.y;
import net.nb.f;
import net.nd.x;
import net.u.d;
import net.u.m;
import net.v.q;
import net.yv.o9;
import net.yy.g;

public class n implements r {
   private static final Set m = Sets.newHashSet(new net.y9.l[]{f.u6, f.ub, f.Tu, f.G});
   private static final t H = new h("tutorial.find_tree.title", new Object[0]);
   private static final t b = new h("tutorial.find_tree.description", new Object[0]);
   private final e X;
   private x R;
   private int d;

   public n(e var1) {
      this.X = var1;
   }

   public void e() {
      e.j();
      ++this.d;
      if(this.X.y() != o9.SURVIVAL) {
         this.X.x(p.NONE);
      }

      if(this.d == 1) {
         g var2 = this.X.U().sf;
         Iterator var3 = m.iterator();
         if(var3.hasNext()) {
            net.y9.l var4 = (net.y9.l)var3.next();
            if(var2.a8.z(new ks(var4))) {
               this.X.x(p.CRAFT_PLANKS);
               return;
            }
         }

         if(c(var2)) {
            this.X.x(p.CRAFT_PLANKS);
            return;
         }
      }

      if(this.d >= 6000 && this.R == null) {
         this.R = new x(x.d.TREE, H, b, false);
         this.X.U().J().a(this.R);
      }

      if(d.y() == null) {
         e.g(new int[5]);
      }

   }

   public void A() {
      if(this.R != null) {
         this.R.B();
         this.R = null;
      }

   }

   public void H(v var1, m var2) {
      if(var2.v == m.z.BLOCK && var2.j() != null) {
         net.yw.n var3 = var1.Z(var2.j());
         if(m.contains(var3.Q())) {
            this.X.x(p.PUNCH_TREE);
         }
      }

   }

   public void f(ks var1) {
      for(net.y9.l var3 : m) {
         if(var1.Z() == y.q(var3)) {
            this.X.x(p.CRAFT_PLANKS);
            return;
         }
      }

   }

   public static boolean c(g var0) {
      for(net.y9.l var2 : m) {
         net.v.n var3 = q.i(var2);
         if(var0.q().H(var3) > 0) {
            return true;
         }
      }

      return false;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
