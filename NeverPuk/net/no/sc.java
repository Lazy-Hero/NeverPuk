package net.no;

import java.io.IOException;

public class sc implements net.n2.k {
   private int r;
   private byte b;

   public sc() {
   }

   public sc(net.ne.l var1, byte var2) {
      this.r = var1.G();
      this.b = var2;
   }

   public void E(net.n2.h var1) throws IOException {
      this.r = var1.readInt();
      this.b = var1.readByte();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeInt(this.r);
      var1.writeByte(this.b);
   }

   public void o(net.x.t var1) {
      var1.U(this);
   }

   public net.ne.l W(net.yv.r var1) {
      return var1.S(this.r);
   }

   public byte X() {
      return this.b;
   }
}
