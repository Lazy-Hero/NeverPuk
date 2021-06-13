package net.y_;

import net.xn;
import net.n0.ks;
import net.nl.z2;
import net.y_.b;

public class om extends b {
   private final net.yn.e n;

   public om(net.yn.e var1) {
      this.n = var1;
   }

   public boolean f() {
      return this.n.hl.g(this.n.b, this.n.hS, this.n.hr, 10.0D);
   }

   public void E() {
      net.yv.g var2 = this.n.hl.G(new net.u.j(this.n));
      this.n.X(false);
      this.n.V(true);
      b.E();
      this.n.V(0);
      this.n.hl.i((net.ne.l)(new net.yi.e(this.n.hl, this.n.b, this.n.hS, this.n.hr, true)));
      net.nk.g var3 = this.B(var2, this.n);
      var3.W(this.n);
      int var4 = 0;
      net.yn.j var5 = this.E(var2);
      net.nk.g var6 = this.B(var2, var5);
      var6.W(var5);
      var5.u(this.n.Q().nextGaussian() * 0.5D, 0.0D, this.n.Q().nextGaussian() * 0.5D);
      ++var4;
   }

   private net.yn.j E(net.yv.g var1) {
      net.yn.e var2 = new net.yn.e(this.n.hl);
      var2.t(var1, (net.ne.g)null);
      var2.t(this.n.b, this.n.hS, this.n.hr);
      var2.I = 60;
      var2.gz();
      var2.V(true);
      var2.V(0);
      var2.hl.S(var2);
      return var2;
   }

   private net.nk.g B(net.yv.g var1, net.yn.j var2) {
      b.q();
      net.nk.g var4 = new net.nk.g(var2.hl);
      var4.t(var1, (net.ne.g)null);
      var4.t(var2.b, var2.hS, var2.hr);
      var4.I = 60;
      var4.gz();
      if(var4.U(z2.HEAD).B()) {
         var4.u(z2.HEAD, new ks(net.nb.j.j));
      }

      var4.u(z2.MAINHAND, net.c1.y.Y(var4.Q(), var4.S(), (int)(5.0F + var1.l() * (float)var4.Q().nextInt(18)), false));
      var4.u(z2.HEAD, net.c1.y.Y(var4.Q(), var4.U(z2.HEAD), (int)(5.0F + var1.l() * (float)var4.Q().nextInt(18)), false));
      var4.hl.S(var4);
      return var4;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
