package net.no;

import java.io.IOException;

public class j implements net.n2.k {
   private long R;

   public j() {
   }

   public j(long var1) {
      this.R = var1;
   }

   public void U(net.x.t var1) {
      var1.O(this);
   }

   public void E(net.n2.h var1) throws IOException {
      this.R = var1.readLong();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeLong(this.R);
   }

   public long s() {
      return this.R;
   }
}
