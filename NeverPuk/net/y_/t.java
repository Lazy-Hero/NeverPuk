package net.y_;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.nl.z2;
import net.y_.b;

public class t extends b {
   private final net.ne.s x;
   private double T;
   private double j;
   private double W;
   private final double D;
   private final net.yv.r B;

   public t(net.ne.s var1, double var2) {
      this.x = var1;
      this.D = var2;
      this.B = var1.hl;
      this.h(1);
   }

   public boolean f() {
      boolean var1 = b.q();
      if(!this.B.u()) {
         return false;
      } else if(!this.x.a()) {
         return false;
      } else if(!this.B.V(new net.u.j(this.x.b, this.x.i().u, this.x.hr))) {
         return false;
      } else if(!this.x.U(z2.HEAD).B()) {
         return false;
      } else {
         net.u.r var2 = this.J();
         return false;
      }
   }

   public boolean X() {
      return !this.x.H().q();
   }

   public void I() {
      this.x.H().k(this.T, this.j, this.W, this.D);
   }

   @Nullable
   private net.u.r J() {
      b.q();
      Random var2 = this.x.Q();
      net.u.j var3 = new net.u.j(this.x.b, this.x.i().u, this.x.hr);
      int var4 = 0;
      net.u.j var5 = var3.F(var2.nextInt(20) - 10, var2.nextInt(6) - 3, var2.nextInt(20) - 10);
      if(!this.B.V(var5) && this.x.O(var5) < 0.0F) {
         return new net.u.r((double)var5.t(), (double)var5.h(), (double)var5.y());
      } else {
         ++var4;
         return null;
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
