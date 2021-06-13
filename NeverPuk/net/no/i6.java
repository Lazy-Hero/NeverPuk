package net.no;

import java.io.IOException;

public class i6 implements net.n2.k {
   private net.u.j U;
   private int p;
   private int Y;
   private net.y9.l q;

   public i6() {
   }

   public i6(net.u.j var1, net.y9.l var2, int var3, int var4) {
      this.U = var1;
      this.p = var3;
      this.Y = var4;
      this.q = var2;
   }

   public void E(net.n2.h var1) throws IOException {
      this.U = var1.S();
      this.p = var1.readUnsignedByte();
      this.Y = var1.readUnsignedByte();
      this.q = net.y9.l.I(var1.q() & 4095);
   }

   public void O(net.n2.h var1) throws IOException {
      var1.B(this.U);
      var1.writeByte(this.p);
      var1.writeByte(this.Y);
      var1.a(net.y9.l.h(this.q) & 4095);
   }

   public void h(net.x.t var1) {
      var1.G(this);
   }

   public net.u.j U() {
      return this.U;
   }

   public int b() {
      return this.p;
   }

   public int T() {
      return this.Y;
   }

   public net.y9.l J() {
      return this.q;
   }
}
