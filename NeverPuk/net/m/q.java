package net.m;

import java.io.IOException;

public class q implements net.n2.k {
   private int K;
   private net.cr.s f;
   private boolean u;

   public q() {
   }

   public q(int var1, net.cr.s var2, boolean var3) {
      this.K = var1;
      this.f = var2;
      this.u = var3;
   }

   public void E(net.n2.h var1) throws IOException {
      this.K = var1.readByte();
      this.f = net.cr.n.E(var1.q());
      this.u = var1.readBoolean();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeByte(this.K);
      var1.a(net.cr.n.x(this.f));
      var1.writeBoolean(this.u);
   }

   public void M(net.x.x var1) {
      var1.H(this);
   }

   public int G() {
      return this.K;
   }

   public net.cr.s k() {
      return this.f;
   }

   public boolean y() {
      return this.u;
   }
}
