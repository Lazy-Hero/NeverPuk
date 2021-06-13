package net.y_;

import net.xn;
import net.y_.b;

public class oc extends b {
   net.ne.y V;
   net.ne.a u;
   float b;

   public oc(net.ne.y var1, float var2) {
      this.V = var1;
      this.b = var2;
      this.h(5);
   }

   public boolean f() {
      b.E();
      this.u = this.V.M();
      if(this.u == null) {
         return false;
      } else {
         double var2 = this.V.F(this.u);
         return Double.compare(var2, 4.0D) >= 0 && Double.compare(var2, 16.0D) <= 0?(!this.V.k?false:this.V.Q().nextInt(5) == 0):false;
      }
   }

   public boolean X() {
      return !this.V.k;
   }

   public void I() {
      b.E();
      double var2 = this.u.b - this.V.b;
      double var4 = this.u.hr - this.V.hr;
      float var6 = net.u.t.R(var2 * var2 + var4 * var4);
      if((double)var6 >= 1.0E-4D) {
         this.V.hf += var2 / (double)var6 * 0.5D * 0.800000011920929D + this.V.hf * 0.20000000298023224D;
         this.V.J += var4 / (double)var6 * 0.5D * 0.800000011920929D + this.V.J * 0.20000000298023224D;
      }

      this.V.K = (double)this.b;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
