package net.y_;

import net.xn;
import net.y_.b;

public class oz extends b {
   private final net.nk.b D;
   private net.yn.s x;
   private int S;

   public oz(net.nk.b var1) {
      this.D = var1;
      this.h(3);
   }

   public boolean f() {
      boolean var1 = b.q();
      if(!this.D.hl.u()) {
         return false;
      } else if(this.D.Q().nextInt(8000) != 0) {
         return false;
      } else {
         this.x = (net.yn.s)this.D.hl.O(net.yn.s.class, this.D.i().f(6.0D, 2.0D, 6.0D), this.D);
         return this.x != null;
      }
   }

   public boolean X() {
      boolean var1 = b.E();
      return this.S > 0;
   }

   public void I() {
      this.S = 400;
      this.D.x(true);
   }

   public void C() {
      this.D.x(false);
      this.x = null;
   }

   public void E() {
      this.D.E().n(this.x, 30.0F, 30.0F);
      --this.S;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
