package net.no;

import java.io.IOException;

public class l implements net.n2.k {
   private int m;
   private net.u.j V;
   private int Z;

   public l() {
   }

   public l(int var1, net.u.j var2, int var3) {
      this.m = var1;
      this.V = var2;
      this.Z = var3;
   }

   public void E(net.n2.h var1) throws IOException {
      this.m = var1.q();
      this.V = var1.S();
      this.Z = var1.readUnsignedByte();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.a(this.m);
      var1.B(this.V);
      var1.writeByte(this.Z);
   }

   public void Q(net.x.t var1) {
      var1.x(this);
   }

   public int x() {
      return this.m;
   }

   public net.u.j I() {
      return this.V;
   }

   public int F() {
      return this.Z;
   }
}
