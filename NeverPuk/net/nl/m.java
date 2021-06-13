package net.nl;

import net.xn;
import net.n0.ks;
import net.nl.o;
import net.nl.s;
import net.nl.t;
import net.nl.v;
import net.nl.z1;
import net.nl.ze;

public class m extends v {
   public ze Q;
   public s o;
   private final net.yv.r G;
   private final net.u.j U;
   private final net.r.r B;

   public m(net.r.i var1, net.yv.r var2, net.u.j var3) {
      v.Q();
      this.Q = new ze(this, 3, 3);
      this.o = new s();
      this.G = var2;
      this.U = var3;
      this.B = var1.v;
      this.U(new t(var1.v, this.Q, this.o, 0, 124, 35));
      int var5 = 0;
      int var6 = 0;
      this.U(new o(this.Q, var6 + var5 * 3, 30 + var6 * 18, 17 + var5 * 18));
      ++var6;
      net.u.d.h(new net.u.d[3]);
      ++var5;
      var5 = 0;
      var6 = 0;
      this.U(new o(var1, var6 + var5 * 9 + 9, 8 + var6 * 18, 84 + var5 * 18));
      ++var6;
      ++var5;
      var5 = 0;
      this.U(new o(var1, var5, 8 + var5 * 18, 142));
      ++var5;
   }

   public void d(z1 var1) {
      this.u(this.G, this.B, this.Q, this.o);
   }

   public void K(net.r.r var1) {
      super.K(var1);
      if(!this.G.x) {
         this.o(var1, this.G, this.Q);
      }

   }

   public boolean N(net.r.r var1) {
      return this.G.Z(this.U).Q() != net.nb.f.uj?false:var1.o((double)this.U.t() + 0.5D, (double)this.U.h() + 0.5D, (double)this.U.y() + 0.5D) <= 64.0D;
   }

   public ks a(net.r.r var1, int var2) {
      ks var3 = ks.a;
      o var4 = (o)this.e.get(var2);
      if(var4.T()) {
         ks var5 = var4.y();
         var3 = var5.s();
         var5.Z().g(var5, this.G, var1);
         if(!this.V(var5, 10, 46, true)) {
            return ks.a;
         }

         var4.q(var5, var3);
         if(var5.B()) {
            var4.e(ks.a);
         } else {
            var4.y();
         }

         if(var5.U() == var3.U()) {
            return ks.a;
         }

         ks var6 = var4.H(var1, var5);
         var1.Y(var6, false);
      }

      return var3;
   }

   public boolean g(ks var1, o var2) {
      return var2.M != this.o && super.g(var1, var2);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
