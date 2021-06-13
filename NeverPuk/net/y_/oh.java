package net.y_;

import net.xn;
import net.y_.b;
import net.y_.s;

public class oh extends b {
   private final net.ne.s u;
   private net.ne.a n;
   private double Q;
   private double A;
   private double B;
   private final double r;
   private final float c;

   public oh(net.ne.s var1, double var2, float var4) {
      this.u = var1;
      this.r = var2;
      this.c = var4;
      this.h(1);
   }

   public boolean f() {
      b.q();
      this.n = this.u.M();
      if(this.n == null) {
         return false;
      } else if(this.n.F(this.u) > (double)(this.c * this.c)) {
         return false;
      } else {
         net.u.r var2 = s.l(this.u, 16, 7, new net.u.r(this.n.b, this.n.hS, this.n.hr));
         return false;
      }
   }

   public boolean X() {
      return !this.u.H().q() && this.n.P() && this.n.F(this.u) < (double)(this.c * this.c);
   }

   public void C() {
      this.n = null;
   }

   public void I() {
      this.u.H().k(this.Q, this.A, this.B, this.r);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
