package net.no;

import java.io.IOException;

public class s7 implements net.n2.k {
   private int E;
   private int w;

   public s7() {
   }

   public s7(int var1, int var2) {
      this.E = var1;
      this.w = var2;
   }

   public void E(net.n2.h var1) throws IOException {
      this.E = var1.readInt();
      this.w = var1.readInt();
   }

   public void O(net.n2.h var1) throws IOException {
      var1.writeInt(this.E);
      var1.writeInt(this.w);
   }

   public void R(net.x.t var1) {
      var1.P(this);
   }

   public int x() {
      return this.E;
   }

   public int y() {
      return this.w;
   }
}
