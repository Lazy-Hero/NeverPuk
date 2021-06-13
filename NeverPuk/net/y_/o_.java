package net.y_;

import net.xn;
import net.y_.b;

public class o_ extends b {
   net.yv.r V;
   net.ne.y t;
   net.ne.a r;
   int i;

   public o_(net.ne.y var1) {
      this.t = var1;
      this.V = var1.hl;
      this.h(3);
   }

   public boolean f() {
      net.ne.a var1 = this.t.M();
      return false;
   }

   public boolean X() {
      return !this.r.P()?false:(this.t.F(this.r) > 225.0D?false:!this.t.H().q() || this.f());
   }

   public void C() {
      this.r = null;
      this.t.H().u();
   }

   public void E() {
      b.E();
      this.t.E().n(this.r, 30.0F, 30.0F);
      double var2 = (double)(this.t.h9 * 2.0F * this.t.h9 * 2.0F);
      double var4 = this.t.o(this.r.b, this.r.i().u, this.r.hr);
      double var6 = 0.8D;
      if(Double.compare(var4, var2) > 0 && Double.compare(var4, 16.0D) < 0) {
         var6 = 1.33D;
         net.u.d.h(new net.u.d[5]);
      }

      if(Double.compare(var4, 225.0D) < 0) {
         var6 = 0.6D;
      }

      this.t.H().F(this.r, var6);
      this.i = Math.max(this.i - 1, 0);
      if(Double.compare(var4, var2) <= 0 && this.i <= 0) {
         this.i = 20;
         this.t.S(this.r);
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
