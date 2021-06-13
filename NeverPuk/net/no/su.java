package net.no;

import java.io.IOException;

public class su implements net.n2.k {
   private int G;
   private net.u.j M;

   public su() {
   }

   public su(net.r.r var1, net.u.j var2) {
      this.G = var1.G();
      this.M = var2;
   }

   public void E(net.n2.h var1) throws IOException {
      this.G = var1.q();
      this.M = var1.S();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.G);
      var1.B(this.M);
   }

   public void d(net.x.t var1) {
      var1.D(this);
   }

   public net.r.r e(net.yv.r var1) {
      return (net.r.r)var1.S(this.G);
   }

   public net.u.j S() {
      return this.M;
   }
}
