package net;

import net._6;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.or;
import net.xn;
import net.zn;
import net.u.j;
import net.y9.l;
import net.yn.w;

public class sd extends mk {
   private final mc J;
   private final mc H;
   private final mc Q;
   _6 o = new _6();

   public sd() {
      super("AntiTrapka", or.Player);
      gn.Q.J.d(this.J = new mc("Delay", this, 5.0D, 0.0D, 50.0D, 1.0D));
      gn.Q.J.d(this.Q = new mc("FallDistance", this, 3.3D, 1.0D, 30.0D, 0.1D));
      gn.Q.J.d(this.H = new mc("SneakCheck", this, true));
   }

   @mr
   public void T(zn var1) {
      int[] var2 = w.I();
      if(!p.T.w0.o() || !this.H.Q()) {
         float var3 = this.Q.e();
         j var4 = new j(p.sf.b, p.sf.hS - (double)var3, p.sf.hr);
         l var5 = p.s8.Z(var4).Q();
         if(l.h(var5) == 58 || l.h(var5) == 154 || l.h(var5) == 107 || l.h(var5) == 23 || l.h(var5) == 30 || l.h(var5) == 61 || l.h(var5) == 213 || l.h(var5) == 131 || l.h(var5) == 132) {
            float var6 = this.J.e();
            if(this.o.Z((double)(var6 * 100.0F))) {
               p.sf.Z();
               this.o.B();
            }
         }

      }
   }

   private static xn b(xn var0) {
      return var0;
   }
}
