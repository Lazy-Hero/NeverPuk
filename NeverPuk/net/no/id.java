package net.no;

import java.io.IOException;
import net.n0.ks;
import net.nl.z2;

public class id implements net.n2.k {
   private int b;
   private z2 g;
   private ks v = ks.a;

   public id() {
   }

   public id(int var1, z2 var2, ks var3) {
      this.b = var1;
      this.g = var2;
      this.v = var3.s();
   }

   public void E(net.n2.h var1) throws IOException {
      this.b = var1.q();
      this.g = (z2)var1.S(z2.class);
      this.v = var1.C();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.b);
      var1.A(this.g);
      var1.D(this.v);
   }

   public void Y(net.x.t var1) {
      var1.d(this);
   }

   public ks a() {
      return this.v;
   }

   public int s() {
      return this.b;
   }

   public z2 x() {
      return this.g;
   }
}
