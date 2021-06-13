package net.m;

import java.io.IOException;

public class u implements net.n2.k {
   private boolean W;
   private boolean w;

   public u() {
   }

   public u(boolean var1, boolean var2) {
      this.W = var1;
      this.w = var2;
   }

   public void E(net.n2.h var1) throws IOException {
      this.W = var1.readBoolean();
      this.w = var1.readBoolean();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeBoolean(this.W);
      var1.writeBoolean(this.w);
   }

   public void h(net.x.x var1) {
      var1.f(this);
   }

   public boolean s() {
      return this.W;
   }

   public boolean q() {
      return this.w;
   }
}
