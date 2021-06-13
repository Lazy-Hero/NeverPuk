package net.y9;

import net.xn;
import net.n0.ks;
import net.y9.g3;
import net.y9.v;
import net.yv.o8;

public class b extends v {
   private static final net.u.e[] f = new net.u.e[]{new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.1875D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.3125D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.4375D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new net.u.e(0.0D, 0.0D, 0.0D, 1.0D, 0.5625D, 1.0D)};

   protected net.n0.y c() {
      return net.nb.j.We;
   }

   protected net.n0.y Z() {
      return net.nb.j.We;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
      g3.v.w();
      super.P(var1, var2, var3, var4, var5);
      if(!var1.x && this.z(var3) && var1.G.nextInt(50) == 0) {
         e(var1, var2, new ks(net.nb.j.Sy));
      }

   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      return f[((Integer)var1.i(this.K())).intValue()];
   }

   private static xn a(xn var0) {
      return var0;
   }
}
