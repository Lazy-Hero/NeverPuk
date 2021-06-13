package net.ni;

import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.ni.v;
import net.ni.w;
import net.y9.rn;

public class y extends v {
   private kw y = kw.RED;

   public void N(ks var1) {
      this.g(kw.h(var1.n()));
   }

   public void G(net.nj.f var1) {
      int[] var2 = w.C();
      super.G(var1);
      if(var1.G("color")) {
         this.y = kw.h(var1.P("color"));
      }

   }

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      var1.r("color", this.y.d());
      return var1;
   }

   public net.nj.f e() {
      return this.b(new net.nj.f());
   }

   public net.no.k q() {
      return new net.no.k(this.S, 11, this.e());
   }

   public kw f() {
      return this.y;
   }

   public void g(kw var1) {
      this.y = var1;
      this.W();
   }

   public boolean p() {
      return rn.A(this.B());
   }

   public ks R() {
      return new ks(net.nb.j.W1, 1, this.y.d());
   }

   private static xn a(xn var0) {
      return var0;
   }
}
