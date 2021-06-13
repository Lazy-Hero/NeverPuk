package net.y_;

import net.xn;
import net.y_.b;
import net.y_.ou;

public class o1 extends ou {
   net.yn.d w;
   net.ne.a d;
   private int X;

   public o1(net.yn.d var1) {
      super(var1, false);
      this.w = var1;
      this.h(1);
   }

   public boolean f() {
      boolean var1 = b.q();
      if(!this.w.D()) {
         return false;
      } else {
         net.ne.a var2 = this.w.L();
         if(var2 == null) {
            return false;
         } else {
            this.d = var2.X();
            int var3 = var2.h();
            return var3 != this.X && this.h(this.d, false) && this.w.l(this.d, var2);
         }
      }
   }

   public void I() {
      this.k.C(this.d);
      net.ne.a var1 = this.w.L();
      this.X = var1.h();
      super.I();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
