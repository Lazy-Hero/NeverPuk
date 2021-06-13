package net.cl;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;
import net.xn;
import net.cb.h;
import net.cb.t;
import net.cl.e;
import net.cl.n;
import net.cl.p;
import net.cl.r;
import net.cp.v;
import net.n0.ks;
import net.n0.y;
import net.nb.f;
import net.nd.x;
import net.u.j;
import net.yv.o9;
import net.yy.g;

public class b implements r {
   private static final Set p = Sets.newHashSet(new net.y9.l[]{f.u6, f.ub});
   private static final t Q = new h("tutorial.punch_tree.title", new Object[0]);
   private static final t A = new h("tutorial.punch_tree.description", new Object[]{e.n("attack")});
   private final e b;
   private x e;
   private int o;
   private int l;

   public b(e var1) {
      this.b = var1;
   }

   public void e() {
      e.j();
      ++this.o;
      if(this.b.y() != o9.SURVIVAL) {
         this.b.x(p.NONE);
      }

      if(this.o == 1) {
         g var2 = this.b.U().sf;
         Iterator var3 = p.iterator();
         if(var3.hasNext()) {
            net.y9.l var4 = (net.y9.l)var3.next();
            if(var2.a8.z(new ks(var4))) {
               this.b.x(p.CRAFT_PLANKS);
               return;
            }
         }

         if(n.c(var2)) {
            this.b.x(p.CRAFT_PLANKS);
            return;
         }
      }

      if((this.o >= 600 || this.l > 3) && this.e == null) {
         this.e = new x(x.d.TREE, Q, A, true);
         this.b.U().J().a(this.e);
      }

   }

   public void A() {
      if(this.e != null) {
         this.e.B();
         this.e = null;
      }

   }

   public void l(v var1, j var2, net.yw.n var3, float var4) {
      boolean var5 = p.contains(var3.Q());
      if(var4 > 0.0F) {
         if(this.e != null) {
            this.e.D(var4);
         }

         if(var4 >= 1.0F) {
            this.b.x(p.OPEN_INVENTORY);
         }
      } else if(this.e != null) {
         this.e.D(0.0F);
      } else {
         ++this.l;
      }

   }

   public void f(ks var1) {
      for(net.y9.l var3 : p) {
         if(var1.Z() == y.q(var3)) {
            this.b.x(p.CRAFT_PLANKS);
            return;
         }
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
