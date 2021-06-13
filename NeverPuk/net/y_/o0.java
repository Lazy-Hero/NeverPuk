package net.y_;

import net.xn;
import net.y_.b;

public class o0 extends b {
   private final net.yn.d w;
   private boolean q;

   public o0(net.yn.d var1) {
      this.w = var1;
      this.h(5);
   }

   public boolean f() {
      boolean var1 = b.q();
      if(!this.w.D()) {
         return false;
      } else if(this.w.p()) {
         return false;
      } else if(!this.w.k) {
         return false;
      } else {
         net.ne.a var2 = this.w.L();
         return true;
      }
   }

   public void I() {
      this.w.H().u();
      this.w.A(true);
   }

   public void C() {
      this.w.A(false);
   }

   public void n(boolean var1) {
      this.q = var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
