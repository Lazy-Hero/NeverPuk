package net.y_;

import net.xn;
import net.y_.b;
import net.y_.s;

public class o2 extends b {
   private final net.ne.s g;
   private double O;
   private double n;
   private double e;
   private final double t;

   public o2(net.ne.s var1, double var2) {
      this.g = var1;
      this.t = var2;
      this.h(1);
   }

   public boolean f() {
      boolean var1 = b.q();
      if(this.g.Dv()) {
         return false;
      } else {
         net.u.j var2 = this.g.I();
         net.u.r var3 = s.l(this.g, 16, 7, new net.u.r((double)var2.t(), (double)var2.h(), (double)var2.y()));
         return false;
      }
   }

   public boolean X() {
      boolean var1 = b.E();
      return !this.g.H().q();
   }

   public void I() {
      this.g.H().k(this.O, this.n, this.e, this.t);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
