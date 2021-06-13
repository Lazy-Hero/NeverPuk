package net.y_;

import net.xn;
import net.nk.fu;
import net.y_.b;
import net.y_.k;

public class e extends k {
   private final fu r;
   private int T;

   public e(fu var1, double var2, boolean var4) {
      super(var1, var2, var4);
      this.r = var1;
   }

   public void I() {
      super.I();
      this.T = 0;
   }

   public void C() {
      super.C();
      this.r.k(false);
   }

   public void E() {
      b.q();
      super.E();
      ++this.T;
      this.r.k(this.T >= 5 && this.V < 10);
   }

   private static xn c(xn var0) {
      return var0;
   }
}
