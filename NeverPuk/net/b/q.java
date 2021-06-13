package net.b;

import net.xn;
import net.b.n;
import net.b.s;
import net.b.t;
import net.ne.y;
import net.u.j;

public class q extends s {
   private j k;

   public q(y var1, net.yv.r var2) {
      super(var1, var2);
   }

   public t S(j var1) {
      this.k = var1;
      return super.S(var1);
   }

   public t v(net.ne.l var1) {
      this.k = new j(var1);
      return super.v(var1);
   }

   public boolean F(net.ne.l var1, double var2) {
      t var4 = this.v(var1);
      return this.Y(var4, var2);
   }

   public void I() {
      String var1 = n.q();
      if(!this.q()) {
         super.I();
      }

      if(this.k != null) {
         double var2 = (double)(this.U.h9 * this.U.h9);
         if(this.U.H(this.k) >= var2 && (this.U.hS <= (double)this.k.h() || this.U.H(new j(this.k.t(), net.u.t.L(this.U.hS), this.k.y())) >= var2)) {
            this.U.m().Q((double)this.k.t(), (double)this.k.h(), (double)this.k.y(), this.A);
         }

         this.k = null;
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
