package net.no;

import java.io.IOException;

public class i implements net.n2.k {
   private int M;
   private int Q;
   private int V;

   public i() {
   }

   public i(int var1, int var2, int var3) {
      this.M = var1;
      this.Q = var2;
      this.V = var3;
   }

   public void M(net.x.t var1) {
      var1.E(this);
   }

   public void E(net.n2.h var1) throws IOException {
      this.M = var1.readUnsignedByte();
      this.Q = var1.readShort();
      this.V = var1.readShort();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeByte(this.M);
      var1.writeShort(this.Q);
      var1.writeShort(this.V);
   }

   public int M() {
      return this.M;
   }

   public int e() {
      return this.Q;
   }

   public int n() {
      return this.V;
   }
}
