package net.n0;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.n0.q;

public class b extends q {
   private String[] x;

   public b(net.y9.l var1, boolean var2) {
      kw.b();
      super(var1);
      this.d(0);
      this.z(true);
   }

   public int o(int var1) {
      return var1;
   }

   public b S(String[] var1) {
      this.x = var1;
      return this;
   }

   public String f(ks var1) {
      int[] var2 = kw.b();
      if(this.x == null) {
         return super.f(var1);
      } else {
         int var3 = var1.n();
         return var3 >= 0 && var3 < this.x.length?super.f(var1) + "." + this.x[var3]:super.f(var1);
      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
