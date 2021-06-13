package net.y9;

import net.xn;
import net.y9.g3;
import net.y9.l;
import net.yv.o8;
import net.yz.aq;

public class f extends l {
   private final boolean A;

   protected f(net.y1.l var1, boolean var2) {
      this(var1, var2, var1.f());
   }

   protected f(net.y1.l var1, boolean var2, net.y1.h var3) {
      super(var1, var3);
      this.A = var2;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean v(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      g3.v.w();
      net.yw.n var6 = var2.Z(var3.C(var4));
      l var7 = var6.Q();
      if(this == net.nb.f.Tm || this == net.nb.f.T5) {
         if(var1 != var6) {
            return true;
         }

         if(var7 == this) {
            return false;
         }
      }

      return (this.A || var7 != this) && super.v(var1, var2, var3, var4);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
