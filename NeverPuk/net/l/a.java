package net.l;

import javax.annotation.Nullable;
import net.xn;
import net.l.g;
import net.l.q;
import net.l.x;
import net.y9.l;

public class a implements g {
   private final net.yz.t n;
   private final x F;
   private final int B;

   public a(int var1, x var2) {
      this.B = var1;
      this.F = var2;
      this.n = new net.yz.t(1 << var1);
   }

   public int j(net.yw.n var1) {
      q.O();
      int var3 = this.n.w(var1);
      if(var3 == -1) {
         var3 = this.n.J(var1);
         if(var3 >= 1 << this.B) {
            var3 = this.F.K(this.B + 1, var1);
         }
      }

      return var3;
   }

   @Nullable
   public net.yw.n z(int var1) {
      return (net.yw.n)this.n.d(var1);
   }

   public void J(net.n2.h var1) {
      this.n.h();
      int var2 = var1.q();

      for(int var3 = 0; var3 < var2; ++var3) {
         this.n.J(l.x.j(var1.q()));
      }

   }

   public void x(net.n2.h var1) {
      int var2 = this.n.i();
      var1.a(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.a(l.x.X(this.n.d(var3)));
      }

   }

   public int I() {
      q.O();
      int var2 = net.n2.h.c(this.n.i());
      int var3 = 0;
      if(var3 < this.n.i()) {
         var2 += net.n2.h.c(l.x.X(this.n.d(var3)));
         ++var3;
      }

      return var2;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
