package net.y9;

import net.xn;
import net.y9.f;
import net.y9.g3;
import net.yz.ac;

public class s extends f {
   public s() {
      super(net.y1.l.N, false, net.y1.h.m);
      this.f(net.ys.r.X);
      this.P = 0.8F;
   }

   public ac k() {
      return ac.TRANSLUCENT;
   }

   public void f(net.yv.r var1, net.u.j var2, net.ne.l var3, float var4) {
      if(var3.Q()) {
         super.f(var1, var2, var3, var4);
      } else {
         var3.v(var4, 0.0F);
      }

   }

   public void w(net.yv.r var1, net.ne.l var2) {
      int[] var3 = g3.v.w();
      if(var2.Q()) {
         super.w(var1, var2);
      }

      if(var2.K < 0.0D) {
         var2.K = -var2.K;
         if(!(var2 instanceof net.ne.a)) {
            var2.K *= 0.8D;
         }
      }

   }

   public void m(net.yv.r var1, net.u.j var2, net.ne.l var3) {
      int[] var4 = g3.v.w();
      if(Math.abs(var3.K) < 0.1D && !var3.Q()) {
         double var5 = 0.4D + Math.abs(var3.K) * 0.2D;
         var3.hf *= var5;
         var3.J *= var5;
      }

      super.m(var1, var2, var3);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
