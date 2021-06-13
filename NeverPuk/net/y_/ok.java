package net.y_;

import com.google.common.base.Predicates;
import net.xn;
import net.y_.b;

public class ok extends b {
   protected net.ne.y T;
   protected net.ne.l c;
   protected float m;
   private int S;
   private final float H;
   protected Class d;

   public ok(net.ne.y var1, Class var2, float var3) {
      this.T = var1;
      this.d = var2;
      this.m = var3;
      this.H = 0.02F;
      this.h(2);
   }

   public ok(net.ne.y var1, Class var2, float var3, float var4) {
      this.T = var1;
      this.d = var2;
      this.m = var3;
      this.H = var4;
      this.h(2);
   }

   public boolean f() {
      boolean var1 = b.q();
      if(this.T.Q().nextFloat() >= this.H) {
         return false;
      } else {
         if(this.T.M() != null) {
            this.c = this.T.M();
         }

         if(this.d == net.r.r.class) {
            this.c = this.T.hl.e(this.T.b, this.T.hS, this.T.hr, (double)this.m, Predicates.and(net.yz.q.n, net.yz.q.b(this.T)));
         }

         this.c = this.T.hl.O(this.d, this.T.i().f((double)this.m, 3.0D, (double)this.m), this.T);
         return this.c != null;
      }
   }

   public boolean X() {
      return !this.c.P()?false:(this.T.F(this.c) > (double)(this.m * this.m)?false:this.S > 0);
   }

   public void I() {
      this.S = 40 + this.T.Q().nextInt(40);
   }

   public void C() {
      this.c = null;
   }

   public void E() {
      this.T.E().u(this.c.b, this.c.hS + (double)this.c.A(), this.c.hr, (float)this.T.v(), (float)this.T.w());
      --this.S;
   }

   private static xn c(xn var0) {
      return var0;
   }
}
