package net.no;

import java.io.IOException;

public class sv implements net.n2.k {
   private int b;
   private byte d;

   public sv() {
   }

   public sv(net.ne.l var1, byte var2) {
      this.b = var1.G();
      this.d = var2;
   }

   public void E(net.n2.h var1) throws IOException {
      this.b = var1.q();
      this.d = var1.readByte();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.b);
      var1.writeByte(this.d);
   }

   public void U(net.x.t var1) {
      var1.w(this);
   }

   public net.ne.l p(net.yv.r var1) {
      return var1.S(this.b);
   }

   public byte a() {
      return this.d;
   }
}
