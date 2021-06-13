package net.nd;

import com.google.common.collect.Lists;
import java.util.List;
import net.xn;
import net.c9.b;
import net.cr.s;
import net.n0.ks;
import net.nd.c;
import net.nd.h;
import net.nd.x;
import net.ne.a;
import net.y.u1;

public class g implements c {
   private final List s = Lists.newArrayList();
   private long j;
   private boolean u;

   public g(ks var1) {
      this.s.add(var1);
   }

   public c.d n(h var1, long var2) {
      boolean var4 = x.d.c();
      if(this.u) {
         this.j = var2;
         this.u = false;
      }

      if(this.s.isEmpty()) {
         return c.d.HIDE;
      } else {
         var1.Q().n().E(X);
         net.y.d.Z(1.0F, 1.0F, 1.0F);
         var1.g(0, 0, 0, 32, 160, 32);
         var1.Q().sO.v(b.x("recipe.toast.title", new Object[0]), 30.0F, 7.0F, -11534256);
         var1.Q().sO.v(b.x("recipe.toast.description", new Object[0]), 30.0F, 18.0F, -16777216);
         u1.A();
         var1.Q().K().g((a)null, (ks)this.s.get((int)(var2 / (5000L / (long)this.s.size()) % (long)this.s.size())), 8, 8);
         return var2 - this.j >= 5000L?c.d.HIDE:c.d.SHOW;
      }
   }

   public void f(ks var1) {
      if(this.s.add(var1)) {
         this.u = true;
      }

   }

   public static void m(h var0, s var1) {
      x.d.o();
      g var3 = (g)var0.m(g.class, N);
      if(var3 == null) {
         var0.a(new g(var1.E()));
      }

      var3.f(var1.E());
   }

   private static xn a(xn var0) {
      return var0;
   }
}
