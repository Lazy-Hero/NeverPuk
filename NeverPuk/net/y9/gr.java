package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.l;

public class gr extends l {
   private final boolean p;

   public gr(boolean var1) {
      super(net.y1.l.A);
      this.p = var1;
      this.y(1.0F);
   }

   public void b(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      int[] var4 = g3.v.w();
      if(!var1.x) {
         if(this.p && !var1.B(var2)) {
            var1.k(var2, net.nb.f.uv.p(), 2);
         }

         if(!this.p && var1.B(var2)) {
            var1.k(var2, net.nb.f.F.p(), 2);
         }
      }

   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(!var2.x) {
         if(this.p && !var2.B(var3)) {
            var2.c(var3, this, 4);
         } else if(!this.p && var2.B(var3)) {
            var2.k(var3, net.nb.f.F.p(), 2);
         }
      }

   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(!var1.x && this.p && !var1.B(var2)) {
         var1.k(var2, net.nb.f.uv.p(), 2);
      }

   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return net.n0.y.q(net.nb.f.uv);
   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(net.nb.f.uv);
   }

   protected ks l(net.yw.n var1) {
      return new ks(net.nb.f.uv);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
