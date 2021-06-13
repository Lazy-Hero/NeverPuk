package net.n0;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.q;

public class h extends q {
   protected final net.y9.l r;
   protected final h.u F;

   public h(net.y9.l var1, net.y9.l var2, h.u var3) {
      super(var1);
      this.r = var2;
      this.F = var3;
      this.d(0);
      this.z(true);
   }

   public h(net.y9.l var1, net.y9.l var2, final String[] var3) {
      this(var1, var2, new h.u() {
         public String J(ks var1) {
            kw.b();
            int var3x = var1.n();
            if(var3x < 0 || var3x >= var3.length) {
               var3x = 0;
            }

            return var3[var3x];
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
   }

   public int o(int var1) {
      return var1;
   }

   public String f(ks var1) {
      return super.z() + "." + this.F.J(var1);
   }

   public interface u {
      String J(ks var1);
   }
}
