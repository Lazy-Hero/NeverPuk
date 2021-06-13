package net.y_;

import net.xn;
import net.y_.b;
import net.y_.ou;

public class ol extends ou {
   net.yn.d u;
   net.ne.a U;
   private int j;

   public ol(net.yn.d var1) {
      super(var1, false);
      this.u = var1;
      this.h(1);
   }

   public boolean f() {
      boolean var1 = b.E();
      if(!this.u.D()) {
         return false;
      } else {
         net.ne.a var2 = this.u.L();
         if(var2 == null) {
            return false;
         } else {
            this.U = var2.A();
            int var3 = var2.H();
            return var3 != this.j && this.h(this.U, false) && this.u.l(this.U, var2);
         }
      }
   }

   public void I() {
      this.k.C(this.U);
      net.ne.a var1 = this.u.L();
      this.j = var1.H();
      super.I();
   }

   private static xn a(xn var0) {
      return var0;
   }
}
