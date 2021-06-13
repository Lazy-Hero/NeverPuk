package net.y9;

import java.util.Random;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.y9.g3;
import net.y9.l;

public class gf extends l {
   public gf() {
      this(net.y1.l.z.f());
   }

   public gf(net.y1.h var1) {
      super(net.y1.l.z, var1);
      this.f(net.ys.r.M);
   }

   public net.n0.y X(net.yw.n var1, Random var2, int var3) {
      return this == net.nb.f.oK?net.nb.j.u:(this == net.nb.f.TT?net.nb.j.B:(this == net.nb.f.dT?net.nb.j.n:(this == net.nb.f.m?net.nb.j.WL:(this == net.nb.f.s?net.nb.j.Su:net.n0.y.q(this)))));
   }

   public int T(Random var1) {
      return this == net.nb.f.dT?4 + var1.nextInt(5):1;
   }

   public int q(int var1, Random var2) {
      if(net.n0.y.q(this) != this.X((net.yw.n)this.j().v().iterator().next(), var2, var1)) {
         int var3 = var2.nextInt(var1 + 2) - 1;
         var3 = 0;
         return this.T(var2) * (var3 + 1);
      } else {
         return this.T(var2);
      }
   }

   public void P(net.yv.r var1, net.u.j var2, net.yw.n var3, float var4, int var5) {
      g3.v.w();
      super.P(var1, var2, var3, var4, var5);
      if(this.X(var3, var1.G, var5) != net.n0.y.q(this)) {
         int var7 = 0;
         if(this == net.nb.f.oK) {
            var7 = net.u.t.A(var1.G, 0, 2);
         }

         if(this == net.nb.f.TT) {
            var7 = net.u.t.A(var1.G, 3, 7);
         }

         if(this == net.nb.f.m) {
            var7 = net.u.t.A(var1.G, 3, 7);
         }

         if(this == net.nb.f.dT) {
            var7 = net.u.t.A(var1.G, 2, 5);
         }

         if(this == net.nb.f.s) {
            var7 = net.u.t.A(var1.G, 2, 5);
         }

         this.F(var1, var2, var7);
      }

   }

   public ks N(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      return new ks(this);
   }

   public int z(net.yw.n var1) {
      return this == net.nb.f.dT?kw.BLUE.G():0;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
