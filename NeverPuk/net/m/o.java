package net.m;

import java.io.IOException;
import net.n0.ks;

public class o implements net.n2.k {
   private int u;
   private ks z = ks.a;

   public o() {
   }

   public o(int var1, ks var2) {
      this.u = var1;
      this.z = var2.s();
   }

   public void i(net.x.x var1) {
      var1.R(this);
   }

   public void E(net.n2.h var1) throws IOException {
      this.u = var1.readShort();
      this.z = var1.C();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeShort(this.u);
      var1.D(this.z);
   }

   public int M() {
      return this.u;
   }

   public ks K() {
      return this.z;
   }
}
