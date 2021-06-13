package net.y_;

import net.xn;
import net.y9.rn;
import net.y_.b;
import net.y_.og;

public class ox extends og {
   private final net.yn.g W;

   public ox(net.yn.g var1, double var2) {
      super(var1, var2, 8);
      this.W = var1;
   }

   public boolean f() {
      return this.W.D() && !this.W.Ke() && super.f();
   }

   public void I() {
      super.I();
      this.W.r().n(false);
   }

   public void C() {
      super.C();
      this.W.A(false);
   }

   public void E() {
      super.E();
      this.W.r().n(false);
      if(!this.J()) {
         this.W.A(false);
      } else if(!this.W.Ke()) {
         this.W.A(true);
      }

   }

   protected boolean b(net.yv.r var1, net.u.j var2) {
      boolean var3 = b.E();
      if(!var1.y(var2.h())) {
         return false;
      } else {
         net.yw.n var4 = var1.Z(var2);
         net.y9.l var5 = var4.Q();
         if(var5 == net.nb.f.uG) {
            net.ni.v var6 = var1.L(var2);
            return var6 instanceof net.ni.k && ((net.ni.k)var6).x < 1;
         } else {
            return var5 == net.nb.f.d7?true:var5 == net.nb.f.uP && var4.i(rn.d) != rn.a.HEAD;
         }
      }
   }

   private static xn a(xn var0) {
      return var0;
   }
}
