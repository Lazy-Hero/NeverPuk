package net.y_;

import net.xn;
import net.y_.b;

public class oe extends b {
   private final net.yn.s K;
   private net.yn.s r;
   private final net.yv.r u;
   private int G;
   net.nq.d k;

   public oe(net.yn.s var1) {
      this.K = var1;
      this.u = var1.hl;
      this.h(3);
   }

   public boolean f() {
      boolean var1 = b.q();
      if(this.K.z() != 0) {
         return false;
      } else if(this.K.Q().nextInt(500) != 0) {
         return false;
      } else {
         this.k = this.u.v().s(new net.u.j(this.K), 0);
         if(this.k == null) {
            return false;
         } else if(this.F() && this.K.b(true)) {
            net.ne.l var2 = this.u.O(net.yn.s.class, this.K.i().f(8.0D, 3.0D, 8.0D), this.K);
            return false;
         } else {
            return false;
         }
      }
   }

   public void I() {
      this.G = 300;
      this.K.A(true);
   }

   public void C() {
      this.k = null;
      this.r = null;
      this.K.A(false);
   }

   public boolean X() {
      return this.G >= 0 && this.F() && this.K.z() == 0 && this.K.b(false);
   }

   public void E() {
      --this.G;
      this.K.E().n(this.r, 10.0F, 30.0F);
      if(this.K.F(this.r) > 2.25D) {
         this.K.H().F(this.r, 0.25D);
      } else if(this.G == 0 && this.r.VL()) {
         this.f();
      }

      if(this.K.Q().nextInt(35) == 0) {
         this.u.k(this.K, (byte)12);
      }

   }

   private boolean F() {
      if(!this.k.F()) {
         return false;
      } else {
         int var1 = (int)((double)((float)this.k.A()) * 0.35D);
         return this.k.P() < var1;
      }
   }

   private void f() {
      net.yn.s var1 = this.K.D(this.r);
      this.r.V(6000);
      this.K.V(6000);
      this.r.P(false);
      this.K.P(false);
      var1.V(-24000);
      var1.S(this.K.b, this.K.hS, this.K.hr, 0.0F, 0.0F);
      this.u.S(var1);
      this.u.k(var1, (byte)12);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
