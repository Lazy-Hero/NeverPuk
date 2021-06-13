package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.o;
import net.nl.v;
import net.nl.z1;

public class e extends o {
   private final net.r.r J;
   private int B;

   public e(net.r.r var1, z1 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.J = var1;
   }

   public boolean s(ks var1) {
      return false;
   }

   public ks h(int var1) {
      if(this.T()) {
         this.B += Math.min(var1, this.y().U());
      }

      return super.h(var1);
   }

   public ks H(net.r.r var1, ks var2) {
      this.q(var2);
      super.H(var1, var2);
      return var2;
   }

   protected void O(ks var1, int var2) {
      this.B += var2;
      this.q(var1);
   }

   protected void q(ks var1) {
      v.Q();
      var1.P(this.J.hl, this.J, this.B);
      if(!this.J.hl.x) {
         int var3 = this.B;
         float var4 = net.cr.i.z().A(var1);
         if(Float.compare(var4, 0.0F) == 0) {
            var3 = 0;
         }

         if(var4 < 1.0F) {
            int var5 = net.u.t.M((float)var3 * var4);
            if(var5 < net.u.t.Y((float)var3 * var4) && Double.compare(Math.random(), (double)((float)var3 * var4 - (float)var5)) < 0) {
               ++var5;
            }

            var3 = var5;
         }

         if(var3 > 0) {
            int var6 = net.nm.s.Z(var3);
            int var10000 = var3 - var6;
            this.J.hl.S(new net.nm.s(this.J.hl, this.J.b, this.J.hS + 0.5D, this.J.hr + 0.5D, var6));
         }
      }

      this.B = 0;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
