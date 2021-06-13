package net.m;

import java.io.IOException;

public class s implements net.n2.k {
   private int v;

   public s() {
   }

   public s(int var1) {
      this.v = var1;
   }

   public void E(net.n2.h var1) throws IOException {
      this.v = var1.readShort();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeShort(this.v);
   }

   public void o(net.x.x var1) {
      var1.i(this);
   }

   public int C() {
      return this.v;
   }
}
