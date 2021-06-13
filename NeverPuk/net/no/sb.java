package net.no;

import java.io.IOException;

public class sb implements net.n2.k {
   private int H;
   private int d;

   public sb() {
   }

   public sb(net.ne.l var1, int var2) {
      this.H = var1.G();
      this.d = var2;
   }

   public void E(net.n2.h var1) throws IOException {
      this.H = var1.q();
      this.d = var1.readUnsignedByte();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.H);
      var1.writeByte(this.d);
   }

   public void O(net.x.t var1) {
      var1.D(this);
   }

   public int o() {
      return this.H;
   }

   public int k() {
      return this.d;
   }
}
