package net.m;

import java.io.IOException;

public class g implements net.n2.k {
   private int h;
   private int V;

   public g() {
   }

   public g(int var1, int var2) {
      this.h = var1;
      this.V = var2;
   }

   public void H(net.x.x var1) {
      var1.z(this);
   }

   public void E(net.n2.h var1) throws IOException {
      this.h = var1.readByte();
      this.V = var1.readByte();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeByte(this.h);
      var1.writeByte(this.V);
   }

   public int O() {
      return this.h;
   }

   public int V() {
      return this.V;
   }
}
