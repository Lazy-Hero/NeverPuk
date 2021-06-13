package net.e;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import net.xn;
import net.cb.h;
import net.cb.t;
import net.e.k;
import net.nn.j;
import net.p.n;
import net.p.p;
import net.p.u;
import net.p.v;
import net.yp.b;
import net.yv.o9;
import net.z.g;
import net.z.wm;

public class f implements u, n {
   private static final Ordering h = Ordering.from(new Comparator() {
      public int k(b var1, b var2) {
         return ComparisonChain.start().compare(var1.J().getId(), var2.J().getId()).result();
      }
   });
   private final List E;

   public f() {
      this(h.sortedCopy(j.b().d().B()));
   }

   public f(Collection var1) {
      k.k();
      super();
      this.E = Lists.newArrayList();
      Iterator var3 = h.sortedCopy(var1).iterator();
      if(var3.hasNext()) {
         b var4 = (b)var3.next();
         if(var4.K() != o9.SPECTATOR) {
            this.E.add(new v(var4.J()));
         }
      }

   }

   public List U() {
      return this.E;
   }

   public t o() {
      return new h("spectatorMenu.teleport.prompt", new Object[0]);
   }

   public void X(p var1) {
      var1.J(this);
   }

   public t m() {
      return new h("spectatorMenu.teleport", new Object[0]);
   }

   public void A(float var1, int var2) {
      j.b().n().E(wm.f);
      g.r(0.0F, 0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 256.0F, 256.0F);
   }

   public boolean C() {
      String var1 = k.k();
      return !this.E.isEmpty();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
