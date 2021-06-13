package net.ym;

import net.xn;
import net.y.o;
import net.ym.a;
import net.ym.j;
import net.ym.p;
import net.ym.t;

public class v implements net.c9.v {
   private net.c.r q;
   private final net.n9.b j;
   private final o p;
   private j h;

   public v(net.n9.b var1) {
      this.j = var1;
      this.p = new o(this);
   }

   public void s(net.c9.p var1) {
      p var2 = new p(var1, this.j, this.p);
      this.q = var2.R();
      this.h = (j)this.q.B(p.K);
      this.p.A();
   }

   public j Y(a var1) {
      int var2 = t.V();
      if(var1 == null) {
         return this.h;
      } else {
         j var3 = (j)this.q.B(var1);
         return var3 == null?this.h:var3;
      }
   }

   public j f() {
      return this.h;
   }

   public net.n9.b z() {
      return this.j;
   }

   public o N() {
      return this.p;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
