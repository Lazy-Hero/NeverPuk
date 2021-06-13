package net.no;

import java.io.IOException;

public class sq implements net.n2.k {
   private net.u.j n;
   private net.yw.n G;

   public sq() {
   }

   public sq(net.yv.r var1, net.u.j var2) {
      this.n = var2;
      this.G = var1.Z(var2);
   }

   public void E(net.n2.h var1) throws IOException {
      this.n = var1.S();
      this.G = (net.yw.n)net.y9.l.x.j(var1.q());
   }

   public void O(net.n2.h var1) throws IOException {
      var1.B(this.n);
      var1.a(net.y9.l.x.X(this.G));
   }

   public void t(net.x.t var1) {
      var1.Y(this);
   }

   public net.yw.n R() {
      return this.G;
   }

   public net.u.j r() {
      return this.n;
   }
}
