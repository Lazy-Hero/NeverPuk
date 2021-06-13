package net.y9;

import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.y9.f;
import net.y9.g3;
import net.yz.ac;

public class a extends f {
   public a() {
      super(net.y1.l.V, false);
      this.P = 0.98F;
      this.R(true);
      this.f(net.ys.r.M);
   }

   public ac k() {
      return ac.TRANSLUCENT;
   }

   public void U(net.yv.r var1, net.r.r var2, net.u.j var3, net.yw.n var4, @Nullable net.ni.v var5, ks var6) {
      g3.v.w();
      var2.S(net.v.q.i(this));
      var2.Z(0.005F);
      if(this.u() && net.c1.y.g(net.nb.u.A, var6) > 0) {
         e(var1, var3, this.l(var4));
      }

      if(var1.F.T()) {
         var1.J(var3);
      } else {
         int var8 = net.c1.y.g(net.nb.u.C, var6);
         this.N(var1, var3, var4, var8);
         net.y1.l var9 = var1.Z(var3.b()).n();
         if(var9.f() || var9.y()) {
            var1.U(var3, net.nb.f.dy.p());
         }

      }
   }

   public int T(Random var1) {
      return 0;
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, Random var4) {
      if(var1.d(net.yv.w.BLOCK, var2) > 11 - this.p().K()) {
         this.h(var1, var2);
      }

   }

   protected void h(net.yv.r var1, net.u.j var2) {
      if(var1.F.T()) {
         var1.J(var2);
      } else {
         this.N(var1, var2, var1.Z(var2), 0);
         var1.U(var2, net.nb.f.uM.p());
         var1.H(var2, net.nb.f.uM, var2);
      }

   }

   public net.y1.v T(net.yw.n var1) {
      return net.y1.v.NORMAL;
   }

   private static xn c(xn var0) {
      return var0;
   }
}
