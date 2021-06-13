package net.b;

import net.xn;
import net.b.n;
import net.b.o;
import net.b.u;
import net.ne.y;
import net.u.j;

public class v extends n {
   public v(y var1, net.yv.r var2) {
      super(var1, var2);
   }

   protected u O() {
      return new u(new o());
   }

   protected boolean w() {
      return this.c();
   }

   protected net.u.r U() {
      return new net.u.r(this.U.b, this.U.hS + (double)this.U.m * 0.5D, this.U.hr);
   }

   protected void e() {
      net.u.r var2 = this.U();
      float var3 = this.U.h9 * this.U.h9;
      n.q();
      boolean var10001 = true;
      if(Double.compare(var2.Y(this.a.C(this.U, this.a.P())), (double)var3) < 0) {
         this.a.u();
      }

      int var5 = Math.min(this.a.P() + 6, this.a.R() - 1);
      if(var5 > this.a.P()) {
         net.u.r var6 = this.a.C(this.U, var5);
         if(var6.Y(var2) <= 36.0D && this.D(var2, var6, 0, 0, 0)) {
            this.a.X(var5);
         }

         --var5;
      }

      this.h(var2);
   }

   protected boolean D(net.u.r var1, net.u.r var2, int var3, int var4, int var5) {
      net.u.m var6 = this.P.s(var1, new net.u.r(var2.p, var2.H + (double)this.U.m * 0.5D, var2.a), false, true, false);
      return var6.v == net.u.m.MISS;
   }

   public boolean n(j var1) {
      return !this.P.Z(var1).E();
   }

   private static xn b(xn var0) {
      return var0;
   }
}
