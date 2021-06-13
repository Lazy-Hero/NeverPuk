package net.no;

import java.io.IOException;

public class sr implements net.n2.k {
   private int z;

   public sr() {
   }

   public sr(int var1) {
      this.z = var1;
   }

   public void E(net.n2.h var1) throws IOException {
      this.z = var1.readByte();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeByte(this.z);
   }

   public void f(net.x.t var1) {
      var1.W(this);
   }

   public int q() {
      return this.z;
   }
}
