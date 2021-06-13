package net.no;

import java.io.IOException;

public class i9 implements net.n2.k {
   private int h;
   private net.cr.s l;

   public i9() {
   }

   public i9(int var1, net.cr.s var2) {
      this.h = var1;
      this.l = var2;
   }

   public net.cr.s L() {
      return this.l;
   }

   public int t() {
      return this.h;
   }

   public void E(net.n2.h var1) throws IOException {
      this.h = var1.readByte();
      this.l = net.cr.n.E(var1.q());
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeByte(this.h);
      var1.a(net.cr.n.x(this.l));
   }

   public void C(net.x.t var1) {
      var1.f(this);
   }
}
