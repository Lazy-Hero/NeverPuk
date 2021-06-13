package net.y8;

import java.nio.ByteBuffer;
import net.xn;
import net.u.d;
import net.y.ui;
import net.y8.h;
import net.y8.q;

public class g {
   private int k;
   private final q n;
   private int x;

   public g(q var1) {
      this.n = var1;
      this.k = ui.Z();
   }

   public void F() {
      ui.d(ui.K, this.k);
   }

   public void V(ByteBuffer var1) {
      this.F();
      h.W();
      ui.K(ui.K, var1, '裤');
      this.u();
      this.x = var1.limit() / this.n.H();
      if(d.y() == null) {
         h.y(false);
      }

   }

   public void q(int var1) {
      net.y.d.H(var1, 0, this.x);
   }

   public void u() {
      ui.d(ui.K, 0);
   }

   public void B() {
      boolean var1 = h.C();
      if(this.k >= 0) {
         ui.R(this.k);
         this.k = -1;
      }

   }

   private static xn a(xn var0) {
      return var0;
   }
}
