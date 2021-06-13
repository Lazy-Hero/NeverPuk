package net.no;

import java.io.IOException;

public class y implements net.n2.k {
   private net.yv.l Q;
   private boolean i;

   public y() {
   }

   public y(net.yv.l var1, boolean var2) {
      this.Q = var1;
      this.i = var2;
   }

   public void H(net.x.t var1) {
      var1.O(this);
   }

   public void E(net.n2.h var1) throws IOException {
      this.Q = net.yv.l.w(var1.readUnsignedByte());
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeByte(this.Q.L());
   }

   public boolean P() {
      return this.i;
   }

   public net.yv.l k() {
      return this.Q;
   }
}
