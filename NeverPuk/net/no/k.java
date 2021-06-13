package net.no;

import java.io.IOException;

public class k implements net.n2.k {
   private net.u.j q;
   private int A;
   private net.nj.f N;

   public k() {
   }

   public k(net.u.j var1, int var2, net.nj.f var3) {
      this.q = var1;
      this.A = var2;
      this.N = var3;
   }

   public void E(net.n2.h var1) throws IOException {
      this.q = var1.S();
      this.A = var1.readUnsignedByte();
      this.N = var1.A();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.B(this.q);
      var1.writeByte((byte)this.A);
      var1.e(this.N);
   }

   public void H(net.x.t var1) {
      var1.C(this);
   }

   public net.u.j n() {
      return this.q;
   }

   public int k() {
      return this.A;
   }

   public net.nj.f L() {
      return this.N;
   }
}
