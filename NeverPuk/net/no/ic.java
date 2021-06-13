package net.no;

import java.io.IOException;

public class ic implements net.n2.k {
   private int Y;

   public ic() {
   }

   public ic(int var1) {
      this.Y = var1;
   }

   public void T(net.x.t var1) {
      var1.u(this);
   }

   public void E(net.n2.h var1) throws IOException {
      this.Y = var1.readUnsignedByte();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeByte(this.Y);
   }
}
